package ch.bbzbl.bean;

import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import ch.bbzbl.entity.Country;
import ch.bbzbl.facade.CountryFacade;

@ViewScoped
@ManagedBean(name="countryBean")
public class CountryBean extends AbstractBean implements Serializable {
	private static final long serialVersionUID = 1L;

	private Country country;
	private List<Country> countries;
	private CountryFacade countryFacade;

	public CountryFacade getCountryFacade() {
		if (countryFacade == null) {
			countryFacade = new CountryFacade();
		}

		return countryFacade;
	}

	public Country getCountry() {
		if (country == null) {
			country = new Country();
		}

		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

	public void createCountry() {
		try {
			getCountryFacade().createCountry(country);
			closeDialog();
			displayInfoMessageToUser("Created with success");
			loadCountries();
			resetCountry();
		} catch (Exception e) {
			keepDialogOpen();
			displayErrorMessageToUser("A problem occurred while saving. Try again later");
			e.printStackTrace();
		}
	}
	
	public void updateCountry() {
		try {
			getCountryFacade().updateCountry(country);
			closeDialog();
			displayInfoMessageToUser("Updated with success");
			loadCountries();
			resetCountry();
		} catch (Exception e) {
			keepDialogOpen();
			displayErrorMessageToUser("A problem occurred while updating. Try again later");
			e.printStackTrace();
		}
	}
	
	public void deleteCountry() {
		try {
			getCountryFacade().deleteCountry(country);
			closeDialog();
			displayInfoMessageToUser("Deleted with success");
			loadCountries();
			resetCountry();
		} catch (Exception e) {
			keepDialogOpen();
			displayErrorMessageToUser("A problem occurred while removing. Try again later");
			e.printStackTrace();
		}
	}

	public List<Country> getAllCountries() {
		if (countries == null) {
			loadCountries();
		}

		return countries;
	}

	private void loadCountries() {
		countries = getCountryFacade().listAll();
	}

	public void resetCountry() {
		country = new Country();
	}
}