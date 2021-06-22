package ch.bbzbl.facade;

import java.io.Serializable;
import java.util.List;

import ch.bbzbl.dao.EntityManagerHelper;
import ch.bbzbl.dao.UserDAO;
import ch.bbzbl.entity.User;

public class UserFacade implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private UserDAO userDAO = new UserDAO();

	public void createUser(User user) {
		EntityManagerHelper.beginTransaction();
		userDAO.save(user);
		EntityManagerHelper.commitAndCloseTransaction();
	}

	public void updateUser(User user) {
		EntityManagerHelper.beginTransaction();
		userDAO.update(user);
		EntityManagerHelper.commitAndCloseTransaction();
	}
	
	public void deleteUser(User user) {
		EntityManagerHelper.beginTransaction();
		User persistence = userDAO.findReferenceOnly(user.getId());
		userDAO.delete(persistence);
		EntityManagerHelper.commitAndCloseTransaction();
	}

	public User findUser(int countryId) {
		EntityManagerHelper.beginTransaction();
		User user = userDAO.find(countryId);
		EntityManagerHelper.commitAndCloseTransaction();
		return user;
	}

	public List<User> listAll() {
		EntityManagerHelper.beginTransaction();
		List<User> result = userDAO.findAll();
		EntityManagerHelper.commitAndCloseTransaction();
		return result;
	}
}