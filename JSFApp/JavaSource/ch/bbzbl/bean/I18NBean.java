package ch.bbzbl.bean;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import ch.bbzbl.languages.*;

@ViewScoped
@ManagedBean(name="languageBean")
public class I18NBean extends AbstractBean implements Serializable {
	private static final long serialVersionUID = 1L;

	private I18N language;
	private I18N[] languages;

	public I18N getLanguage() {
		if (language == null) {
			language = I18N.languages[0];
		}

		return language;
	}

	public void setLanguage(I18N language) {
		this.language = language;
	}

	public I18N[] getAllLanguages() {
		if (languages == null) {
			languages = I18N.languages;
		}

		return languages;
	}
	
}
