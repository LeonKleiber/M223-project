package ch.bbzbl.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import ch.bbzbl.entity.User;

public class UserDAO extends GenericDAO<User> {

	private static final long serialVersionUID = 1L;

	public UserDAO() {
		super(User.class);
	}
	
	public User findByUsername(String username) {
		EntityManager entityManager = EntityManagerHelper.getEntityManager();
		TypedQuery<User> query = entityManager.createQuery("SELECT u FROM "+User.class.getName()+" u WHERE u.username = :username", User.class);
		List<User> results = query.setParameter("username", username).getResultList();
		entityManager.close();
		if(results.size() > 0) {
			return results.get(0);			
		} else return null;
	}

	public void delete(User user) {
		super.delete(user.getId());
	}

}