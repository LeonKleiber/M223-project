package ch.bbzbl.dao;

import ch.bbzbl.entity.Country;

public class CountryDAO extends GenericDAO<Country> {

	private static final long serialVersionUID = 1L;

	public CountryDAO() {
		super(Country.class);
	}

	public void delete(Country country) {
		super.delete(country.getId());
	}

}