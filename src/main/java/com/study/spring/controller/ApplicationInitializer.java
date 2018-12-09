package com.study.spring.controller;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

	public class ApplicationInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
		 
		@Override
	    protected Class<?>[] getRootConfigClasses() {
			System.out.println("getRootConfigClasses method Calling");
	        return new Class[] { ApplicationConfiguration.class };
	    }
	  
	    @Override
	    protected Class<?>[] getServletConfigClasses() {
	    	System.out.println("getServletConfigClasses method Calling");
	        return null;
	    }
	  
	    @Override
	    protected String[] getServletMappings() {
	    	 System.out.println("getServletMapping method calling");
	        return new String[] { "/rest/*" };
	    }
	 
	}
