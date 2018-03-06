package org.spring;

import java.beans.PropertyEditorSupport;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class UtilConvertEditor extends PropertyEditorSupport {

	private String pattern;

	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		try {
			Date date = new SimpleDateFormat(pattern).parse(text);
			this.setValue(date);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new IllegalArgumentException(text);
		}

}
	public void setPattern(String pattern) {
		this.pattern = pattern;
	}
	
}
