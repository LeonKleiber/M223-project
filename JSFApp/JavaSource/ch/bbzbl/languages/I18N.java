package ch.bbzbl.languages;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class I18N {
	
	public static List<I18N> languages = new ArrayList<I18N>(Arrays.asList(new En(),new De(), new Ch()));
	
	public String name;
	
	public String welcomeMessage;
	public String update;
	public String create;
	public String delete;
	public String cancel;
	public String detail;
	public String add;
	public String remove;
	public String ok;
	public String noRecords;												
	public String deleteRecord;

	//Person
	public String person;
	public String personPlural;
	public String personName;
	public String personAge;
	public String personCountry;
	public String personLanguages;
	public String personAddLanguageTo;
	public String personRemoveLanguageFrom;
	public String personEditLanguages;

	//Language
	public String language;
	public String languagePlural;
	public String languageName;

	//Country
	public String country;
	public String countryPlural;
	public String countryName;

	//User
	public String username;
	public String password;
	public String login;
	public String logout;
	public String myAccount;
	public String i18nLang;
	public String isAdmin;
	public String changeLanguage;
	public String updateLanguage;
	
	public String accessDenied;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getWelcomeMessage() {
		return welcomeMessage;
	}
	public void setWelcomeMessage(String welcomeMessage) {
		this.welcomeMessage = welcomeMessage;
	}
	public String getUpdate() {
		return update;
	}
	public void setUpdate(String update) {
		this.update = update;
	}
	public String getCreate() {
		return create;
	}
	public void setCreate(String create) {
		this.create = create;
	}
	public String getDelete() {
		return delete;
	}
	public void setDelete(String delete) {
		this.delete = delete;
	}
	public String getCancel() {
		return cancel;
	}
	public void setCancel(String cancel) {
		this.cancel = cancel;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	public String getAdd() {
		return add;
	}
	public void setAdd(String add) {
		this.add = add;
	}
	public String getRemove() {
		return remove;
	}
	public void setRemove(String remove) {
		this.remove = remove;
	}
	public String getOk() {
		return ok;
	}
	public void setOk(String ok) {
		this.ok = ok;
	}
	public String getNoRecords() {
		return noRecords;
	}
	public void setNoRecords(String noRecords) {
		this.noRecords = noRecords;
	}
	public String getDeleteRecord() {
		return deleteRecord;
	}
	public void setDeleteRecord(String deleteRecord) {
		this.deleteRecord = deleteRecord;
	}
	public String getPerson() {
		return person;
	}
	public void setPerson(String person) {
		this.person = person;
	}
	public String getPersonPlural() {
		return personPlural;
	}
	public void setPersonPlural(String personPlural) {
		this.personPlural = personPlural;
	}
	public String getPersonName() {
		return personName;
	}
	public void setPersonName(String personName) {
		this.personName = personName;
	}
	public String getPersonAge() {
		return personAge;
	}
	public void setPersonAge(String personAge) {
		this.personAge = personAge;
	}
	public String getPersonCountry() {
		return personCountry;
	}
	public void setPersonCountry(String personCountry) {
		this.personCountry = personCountry;
	}
	public String getPersonLanguages() {
		return personLanguages;
	}
	public void setPersonLanguages(String personLanguages) {
		this.personLanguages = personLanguages;
	}
	public String getPersonAddLanguageTo() {
		return personAddLanguageTo;
	}
	public void setPersonAddLanguageTo(String personAddLanguageTo) {
		this.personAddLanguageTo = personAddLanguageTo;
	}
	public String getPersonRemoveLanguageFrom() {
		return personRemoveLanguageFrom;
	}
	public void setPersonRemoveLanguageFrom(String personRemoveLanguageFrom) {
		this.personRemoveLanguageFrom = personRemoveLanguageFrom;
	}
	public String getPersonEditLanguages() {
		return personEditLanguages;
	}
	public void setPersonEditLanguages(String personEditLanguages) {
		this.personEditLanguages = personEditLanguages;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public String getLanguagePlural() {
		return languagePlural;
	}
	public void setLanguagePlural(String languagePlural) {
		this.languagePlural = languagePlural;
	}
	public String getLanguageName() {
		return languageName;
	}
	public void setLanguageName(String languageName) {
		this.languageName = languageName;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getCountryPlural() {
		return countryPlural;
	}
	public void setCountryPlural(String countryPlural) {
		this.countryPlural = countryPlural;
	}
	public String getCountryName() {
		return countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
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
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getLogout() {
		return logout;
	}
	public void setLogout(String logout) {
		this.logout = logout;
	}
	public String getMyAccount() {
		return myAccount;
	}
	public void setMyAccount(String myAccount) {
		this.myAccount = myAccount;
	}
	public String getI18nLang() {
		return i18nLang;
	}
	public void setI18nLang(String i18nLang) {
		this.i18nLang = i18nLang;
	}
	public String getIsAdmin() {
		return isAdmin;
	}
	public void setIsAdmin(String isAdmin) {
		this.isAdmin = isAdmin;
	}
	public String getChangeLanguage() {
		return changeLanguage;
	}
	public void setChangeLanguage(String changeLanguage) {
		this.changeLanguage = changeLanguage;
	}
	public String getUpdateLanguage() {
		return updateLanguage;
	}
	public void setUpdateLanguage(String updateLanguage) {
		this.updateLanguage = updateLanguage;
	}
	public String getAccessDenied() {
		return accessDenied;
	}
	public void setAccessDenied(String accessDenied) {
		this.accessDenied = accessDenied;
	}
}
