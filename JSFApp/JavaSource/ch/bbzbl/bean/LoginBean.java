package ch.bbzbl.bean;
import javax.annotation.*;

import javax.faces.bean.*;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;
import javax.faces.bean.ManagedBean;
import ch.bbzbl.entity.User;
import ch.bbzbl.facade.UserFacade;

@RequestScoped
@ManagedBean(name="loginBean")
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
			return "/"; 
		}
		displayErrorMessageToUser("Check username and/or password");
		return "index?faces-redirect=true";
	}
	
	public void setUserBean(UserBean userBean) {
		this.userBean = userBean;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}		
	
	
}
	