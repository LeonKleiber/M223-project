package ch.bbzbl.bean;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import ch.bbzbl.entity.User;
import ch.bbzbl.facade.UserFacade;
import ch.bbzbl.languages.*;

@SessionScoped
@ManagedBean(name = "I18NBean")
public class I18NBean extends AbstractBean implements Serializable {
	private static final long serialVersionUID = 2L;

	private I18N language;
	private List<I18N> languages;
	private UserFacade userFacade = new UserFacade();

	public I18N getLanguage() {
		if (language == null) {
			language = I18N.languages.get(0);
		}

		return language;
	}

	public void setLanguage(I18N language) {
		this.language = language;
		Map<String, Object> session = FacesContext.getCurrentInstance().getExternalContext().getSessionMap();
		User user = (User)session.get("user");
		user.setLanguage(language.name);
		userFacade.updateUser(user);
	}

	public List<I18N> getAllLanguages() {
		if (languages == null) {
			languages = I18N.languages;
		}
		return languages;
	}
	
	public void setLanguageByString(String language) {
		getAllLanguages();
		for(I18N lang : languages) {
			if(lang.name.equals(language)) {
				setLanguage(lang);
			}
		}
		if(getLanguage() == null) {
			setLanguage(languages.get(0));
		}
	}
}
