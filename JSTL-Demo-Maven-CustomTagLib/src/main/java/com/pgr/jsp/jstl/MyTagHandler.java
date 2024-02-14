package com.pgr.jsp.jstl;

import java.time.LocalDateTime;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class MyTagHandler extends TagSupport {
	public int doStartTag() throws JspException {
		JspWriter out = pageContext.getOut();
		try {
			out.print(LocalDateTime.now());
		} catch (Exception e) {
			System.out.println(e);
		}
		return SKIP_BODY;
	}
	
	
}
