package ch.bbzbl.facade;

import java.io.Serializable;
import java.util.List;

import ch.bbzbl.dao.EntityManagerHelper;
import ch.bbzbl.dao.CountryDAO;
import ch.bbzbl.entity.Country;

public class UserFacade implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private CountryDAO countryDAO = new CountryDAO();

	public void createCountry(Country country) {
		EntityManagerHelper.beginTransaction();
		countryDAO.save(country);
		EntityManagerHelper.commitAndCloseTransaction();
	}

	public void updateCountry(Country country) {
		EntityManagerHelper.beginTransaction();
		countryDAO.update(country);
		EntityManagerHelper.commitAndCloseTransaction();
	}
	
	public void deleteCountry(Country country) {
		EntityManagerHelper.beginTransaction();
		Country persistedcnt = countryDAO.findReferenceOnly(country.getId());
		countryDAO.delete(persistedcnt);
		EntityManagerHelper.commitAndCloseTransaction();
	}

	public Country findCountry(int countryId) {
		EntityManagerHelper.beginTransaction();
		Country country = countryDAO.find(countryId);
		EntityManagerHelper.commitAndCloseTransaction();
		return country;
	}

	public List<Country> listAll() {
		EntityManagerHelper.beginTransaction();
		List<Country> result = countryDAO.findAll();
		EntityManagerHelper.commitAndCloseTransaction();
		return result;
	}
}