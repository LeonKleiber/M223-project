package ch.bbzbl.facade;

import java.io.Serializable;
import java.util.List;

import ch.bbzbl.dao.EntityManagerHelper;
import ch.bbzbl.dao.LanguageDAO;
import ch.bbzbl.entity.Language;

public class LanguageFacade implements Serializable{
	private static final long serialVersionUID = 1L;
	
	public void createLanguage(Language language) {
		LanguageDAO languageDAO = new LanguageDAO();
		EntityManagerHelper.beginTransaction();
		languageDAO.save(language);
		EntityManagerHelper.commitAndCloseTransaction();
	}

	public void updateLanguage(Language language) {
		LanguageDAO languageDAO = new LanguageDAO();
		EntityManagerHelper.beginTransaction();
		languageDAO.update(language);
		//Language persistedLng = languageDAO.find(language.getId());
		//persistedLng.setName(language.getName());
		EntityManagerHelper.commitAndCloseTransaction();
	}
	
	public void deleteLanguage(Language language) {
		LanguageDAO languageDAO = new LanguageDAO();
		EntityManagerHelper.beginTransaction();
		Language persistedLng = languageDAO.findReferenceOnly(language.getId());
		languageDAO.delete(persistedLng);
		EntityManagerHelper.commitAndCloseTransaction();
	}

	public Language findLanguage(int languageId) {
		LanguageDAO languageDAO = new LanguageDAO();
		EntityManagerHelper.beginTransaction();
		Language language = languageDAO.find(languageId);
		EntityManagerHelper.commitAndCloseTransaction();
		return language;
	}

	public List<Language> listAll() {
		LanguageDAO languageDAO = new LanguageDAO();
		EntityManagerHelper.beginTransaction();
		List<Language> result = languageDAO.findAll();
		EntityManagerHelper.commitAndCloseTransaction();
		return result;
	}
}