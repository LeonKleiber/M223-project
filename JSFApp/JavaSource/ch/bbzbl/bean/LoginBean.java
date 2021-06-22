package ch.bbzbl.bean;
import javax.annotation.*;
import javax.annotation.ManagedBean;
import javax.faces.bean.*;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;

import ch.bbzbl.entity.User;
import ch.bbzbl.facade.UserFacade;

@RequestScoped
@ManagedBean
public class LoginBean extends AbstractBean {
	@ManagedProperty(value = UserBean.DI_NAME)
	private UserBean userBean;
	private String username;
	private String password;

	public String login() {
		UserFacade userFacade = new UserFacade();
		User user = userFacade.isValidLogin(username, password);
		if(user != null){
			userBean.setUser(user);
			FacesContext context = FacesContext.getCurrentInstance();
			HttpServletRequest request = (HttpServletRequest)
	
			context.getExternalContext().getRequest();
	
			request.getSession().setAttribute("user", user); 
			return "/pages/protected/index.xhtml"; 
		}
		displayErrorMessageToUser("Check username and/or password");
		return null;
	}
	
	public void setUserBean(UserBean userBean) {
		this.userBean = userBean;
	}				
}
	