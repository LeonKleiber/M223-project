package ch.bbzbl.bean;

import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import ch.bbzbl.entity.User;
import ch.bbzbl.facade.UserFacade;

@ViewScoped
@ManagedBean(name="userBean")
public class UserBean extends AbstractBean implements Serializable {
	private static final long serialVersionUID = 1L;

	private User user;
	private List<User> users;
	private UserFacade userFacade;

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
	}

	public void createUser() {
		try {
			getUserFacade().createUser(user);
			closeDialog();
			displayInfoMessageToUser("Created with success");
			loadUsers();
			resetUser();
		} catch (Exception e) {
			keepDialogOpen();
			displayErrorMessageToUser("A problem occurred while saving. Try again later");
			e.printStackTrace();
		}
	}
	
	public void updateUser() {
		try {
			getUserFacade().updateUser(user);
			closeDialog();
			displayInfoMessageToUser("Updated with success");
			loadUsers();
			resetUser();
		} catch (Exception e) {
			keepDialogOpen();
			displayErrorMessageToUser("A problem occurred while updating. Try again later");
			e.printStackTrace();
		}
	}
	
	public void deleteCountry() {
		try {
			getUserFacade().deleteUser(user);
			closeDialog();
			displayInfoMessageToUser("Deleted with success");
			loadUsers();
			resetUser();
		} catch (Exception e) {
			keepDialogOpen();
			displayErrorMessageToUser("A problem occurred while removing. Try again later");
			e.printStackTrace();
		}
	}

	public List<User> getAllUsers() {
		if (users == null) {
			loadUsers();
		}

		return users;
	}

	private void loadUsers() {
		users = getUserFacade().listAll();
	}

	public void resetUser() {
		user = new User();
	}
}