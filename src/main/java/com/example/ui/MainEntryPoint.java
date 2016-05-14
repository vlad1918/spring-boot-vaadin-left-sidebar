package com.example.ui;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.BarView;
import com.example.FooView;
import com.example.QuxView;
import com.vaadin.annotations.Theme;
import com.vaadin.navigator.Navigator;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.HorizontalSplitPanel;
import com.vaadin.ui.Panel;
import com.vaadin.ui.UI;

@SpringUI
@Theme("customTheme")
@SuppressWarnings("serial")
public class MainEntryPoint extends UI {
	
    @Autowired
    private BarView barView;
    @Autowired
    private FooView fooView;
    @Autowired
    private QuxView ipsumView;
    
	@Override
	protected void init(VaadinRequest request) {
		
		HorizontalSplitPanel layout = new HorizontalSplitPanel();
		layout.setSplitPosition(135, Unit.PIXELS);
		layout.setStyleName("custom-main-splitter");
		
		CustomSideBar sideBar = new CustomSideBar("John Doe");
		layout.addComponent(sideBar);

		Panel panel = new Panel();
		panel.setSizeFull();
		layout.addComponent(panel);

		//Create the navigator
		final Navigator navigator = new Navigator(this, panel);

		//Register authorized views 
		List<CustomView> authorizedViews = new ArrayList<CustomView>();
		authorizedViews.add(barView);
		authorizedViews.add(fooView);
		authorizedViews.add(ipsumView);	
		
		//Add the default "home page" view which is accessible at the root level 
		navigator.addView("", barView);				

		//Add all of the authorized views to the navigator and to the menu if needed
		for (final CustomView view : authorizedViews) {
			navigator.addView(view.getClass().getCanonicalName(), view);
			
			//If the view is a menu entry point then add it to the menu entry
			if (view.isMenuEntryPoint()) {	
				sideBar.addItem(view, navigator);
			}
		}
		
		setContent(layout);
	}

}
