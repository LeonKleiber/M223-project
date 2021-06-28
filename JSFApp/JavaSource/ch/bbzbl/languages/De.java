package ch.bbzbl.languages;

public class De extends I18N{
	public De() {
		super();
		name="DE";
		//Actions
		welcomeMessage = "Wilkommen zu JSF";
		update="Bearbeiten";
		create="Erstellen";
		delete="Löschen";
		cancel="Abbrechen";
		detail="Detail";
		add="Hinzufügen";
		remove="Entwfernen";
		ok="Ok";
		noRecords="Keine Daten können angezeigt werden";
		deleteRecord="Willst du diesen Eintrag löschen";

		//Person
		person="Person";
		personPlural="Personen";
		personName="Name";
		personAge="Alter";
		personCountry="Land";
		personLanguages="Diese Sprachen gehören zu";
		personAddLanguageTo="Füge die ausgewählte Sprache zu";
		personRemoveLanguageFrom="Entferne die Ausgewählte Sprache von";
		personEditLanguages="Sprache bearbeiten";

		//Language
		language="Sprache";
		languagePlural="Sprachen";
		languageName="Name";

		//Country
		country="Land";
		countryPlural="Länder";
		countryName="Name";

		//User
		username="Benutzername";
		password="Passwort";
		login="Einloggen";
		logout="Ausloggen";
		myAccount="Mein Profil";
		i18nLang="Bevorzugte Sprache";
		isAdmin="Bist du ein Admin";
		changeLanguage="Ändere die Sprache";
		updateLanguage="Sprache aktualisieren";
		
		accessDenied="Zugriff verweigert - geh nach Hause";
	}
}
