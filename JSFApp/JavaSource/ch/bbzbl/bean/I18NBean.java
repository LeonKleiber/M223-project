package ch.bbzbl.bean;

import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import ch.bbzbl.languages.*;

@ViewScoped
@ManagedBean(name="i18NBean")
public class I18NBean extends AbstractBean implements Serializable {
	private static final long serialVersionUID = 1L;

	private I18N language;
	private List<I18N> languages;

	public I18N getLanguage() {
		if (language == null) {
			language = I18N.languages.get(0);
		}

		return language;
	}

	public void setLanguage(I18N language) {
		this.language = language;
	}

	public List<I18N> getAllLanguages() {
		if (languages == null) {
			languages = I18N.languages;
		}
		return languages;
	}
	
}
