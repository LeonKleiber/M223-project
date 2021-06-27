package ch.bbzbl.languages;

public class I18N {
	public static I18N[] languages = {new En(), new De(), new Ch()};
	
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
}
