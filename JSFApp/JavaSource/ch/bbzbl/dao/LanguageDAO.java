package ch.bbzbl.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import ch.bbzbl.entity.Language;
import ch.bbzbl.entity.User;

public class LanguageDAO extends GenericDAO<Language> {

	private static final long serialVersionUID = 1L;

	public LanguageDAO() {
		super(Language.class);
	}

	public void delete(Language language) {
		super.delete(language.getId());
	}

}