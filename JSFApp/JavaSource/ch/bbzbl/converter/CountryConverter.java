package ch.bbzbl.converter;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.ConverterException;
import javax.faces.convert.FacesConverter;

import ch.bbzbl.entity.Country;
import ch.bbzbl.facade.CountryFacade;

@FacesConverter(forClass = ch.bbzbl.entity.Country.class)
public class CountryConverter implements Converter{
	@Override
	public Object getAsObject(FacesContext arg0, UIComponent arg1, String arg2) {
		CountryFacade cntrFacade = new CountryFacade();
		int cntrId;

		try {
			cntrId = Integer.parseInt(arg2);
		} catch (NumberFormatException exception) {
			throw new ConverterException(new FacesMessage(FacesMessage.SEVERITY_ERROR, "Type the name of a language and select it (or use the dropdown)", "Type the name of a language and select it (or use the dropdown)"));
		}

		return cntrFacade.findCountry(cntrId);
	}

	@Override
	public String getAsString(FacesContext arg0, UIComponent arg1, Object arg2) {

		if (arg2 == null) {
			return "";
		}
		Country cntr = (Country) arg2;
		return String.valueOf(cntr.getId());
}
}
