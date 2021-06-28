package ch.bbzbl.languages;

public class En extends I18N {
	public En() {
		super();
		name="EN";
		//Actions
		welcomeMessage = "Welcome to JSF";
		update="Update";
		create="Create";
		delete="Delete";
		cancel="Cancel";
		detail="Detail";
		add="Add";
		remove="Remove";
		ok="Ok";
		noRecords="No data to display";
		deleteRecord="Do you want do delete the record";

		//Person
		person="Person";
		personPlural="People";
		personName="Name";
		personAge="Age";
		personCountry="Country";
		personLanguages="These languages belong to";
		personAddLanguageTo="Add the selected language To";
		personRemoveLanguageFrom="Remove the selected language from";
		personEditLanguages="Edit Languages";

		//Language
		language="Language";
		languagePlural="Languages";
		languageName="Name";

		//Country
		country="Country";
		countryPlural="Countries";
		countryName="Name";

		//User
		username="Username";
		password="Password";
		login="Login";
		logout="Logout";
		myAccount="My Account";
		i18nLang="Preferred Language";
		isAdmin="Are you admin";
		changeLanguage="Change preferred language";
		updateLanguage="Update language";
		
		accessDenied="You're wrong dude - go home!";
	}
}
