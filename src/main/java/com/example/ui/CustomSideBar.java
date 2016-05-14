package com.example.ui;

import com.vaadin.navigator.Navigator;
import com.vaadin.ui.Label;
import com.vaadin.ui.MenuBar;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.MenuBar.MenuItem;

/**
 * Custom implementation of MenuBar which displays menu entries vertically
 * and also adds some custom widgets to the side bar
 */
@SuppressWarnings("serial")
public class CustomSideBar extends VerticalLayout {

	private Label authorizedUserLabel;
	private MenuBar menuBar;
	
	public CustomSideBar(String authorizedUser) {
		setStyleName("custom-side-bar");
		
		/* Add authorizedUser label */
		authorizedUserLabel = new Label(authorizedUser);
		authorizedUserLabel.setStyleName("custom-side-bar-header");
		addComponent(authorizedUserLabel);
		
		/* Add menuBar */
		menuBar = new MenuBar();
		menuBar.setStyleName("custom-side-bar-menu");
		addComponent(menuBar);

	}
	
	/**
	 * Adds a new View to the SideBar menu entry and registers it for navigation
	 * @param view
	 * @param navigator
	 */
	public void addItem(final CustomView view, final Navigator navigator) {
		menuBar.addItem(view.getName(), new MenuBar.Command() {
			
			@Override
			public void menuSelected(MenuBar.MenuItem selectedItem) {
				navigator.navigateTo(view.getClass().getCanonicalName());
				
				//Clear "highlighted" CSS style for previous selected menu entries
				for (MenuItem menuItem : menuBar.getItems()) {
					menuItem.setStyleName(null);
				}
				//Add "highlighted" CSS style to menu entry for highlighting 
				selectedItem.setStyleName("highlighted");						
			}
		});
	}	
}
