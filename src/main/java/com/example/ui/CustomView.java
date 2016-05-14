package com.example.ui;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.ui.VerticalLayout;

/**
 * Core class for all of the views of the application.
 * Handles 
 */
public abstract class CustomView extends VerticalLayout implements View {

	private static final long serialVersionUID = 7632489884419527395L;
	
	@Override
	public abstract void enter(ViewChangeEvent event);
	
	/**
	 * Gets the canonical name of the view which is the
	 * Java Class name and package
	 */
	public String getCanonicalName() {
		return this.getClass().getCanonicalName();
	}
	
	/**
	 * Gets the human readable, internationalized name for the view
	 * for usage in places like menu entries 
	 */
	public abstract String getName();
	
	/**
	 * If set to true then this view will be registered in the 
	 * main menu of the application and accessible directly from there
	 */
	public abstract boolean isMenuEntryPoint();
}
