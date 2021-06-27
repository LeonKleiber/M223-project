package ch.bbzbl.bean;

import java.io.Serializable;

import javax.faces.bean.SessionScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.context.FacesContext;

import ch.bbzbl.entity.User;
import ch.bbzbl.facade.UserFacade;

@SessionScoped
@ManagedBean(name="userBean")
public class UserBean extends AbstractBean implements Serializable {
	private static final long serialVersionUID = 1L;

	public static final String DI_NAME = "#{userBean}";
	//@ManagedProperty("#{i18NBean}")
	//private I18NBean i18nBean;

	private User user;
	private UserFacade userFacade;
	
	public boolean isAdmin() {
		return user.isAdmin();
	}
		
	public String logout() {
		FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
		return "/pages/public/loginIndex.xhtml";
	}

	public UserFacade getUserFacade() {
		if (userFacade == null) {
			userFacade = new UserFacade();
		}

		return userFacade;
	}

	public User getUser() {
		if (user == null) {
			user = new User();
		}

		return user;
	}

	public void setUser(User user) {
		this.user = user;
		//i18nBean.setLanguageByString(user.getLanguage());
	}

	public void updateUser() {
		try {
			getUserFacade().updateUser(user);
			closeDialog();
			displayInfoMessageToUser("Updated with success");
			resetUser();
		} catch (Exception e) {
			keepDialogOpen();
			displayErrorMessageToUser("A problem occurred while updating. Try again later");
			e.printStackTrace();
		}
	}

	public void resetUser() {
		user = new User();
	}
}