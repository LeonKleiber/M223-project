package ch.bbzbl.dao;

import ch.bbzbl.entity.User;

public class UserDAO extends GenericDAO<User> {

	private static final long serialVersionUID = 1L;

	public UserDAO() {
		super(User.class);
	}

	public void delete(User user) {
		super.delete(user.getId());
	}

}