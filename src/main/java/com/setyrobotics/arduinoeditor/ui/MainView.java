package com.setyrobotics.arduinoeditor.ui;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import com.flowingcode.addons.applayout.AppLayout;
import com.flowingcode.addons.applayout.PaperCard;
import com.flowingcode.addons.applayout.menu.MenuItem;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.html.H3;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.data.provider.DataProvider;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.VaadinSession;

@Route
public class MainView extends VerticalLayout {

	private static final String COLUMN_LIST = "columnList";

	private Grid<Map<String, Object>> grid;

	private VerticalLayout container = new VerticalLayout();

	private GraphEditor graphEditor;

	public MainView() {

		container.setDefaultHorizontalComponentAlignment(Alignment.CENTER);
		container.setSizeFull();

		this.setPadding(false);
		this.setSpacing(false);
		this.setMargin(false);

		AppLayout app = new AppLayout("Elastic editor");
		app.setMenuItems(new MenuItem("Home", () -> showHome()), new MenuItem("Columns", () -> showSettings("About")));

		/*
		 * app.setToolbarIconButtons(new MenuItem("Delete", "delete", () ->
		 * Notification.show("Delete action")), new MenuItem("Search", "search", () ->
		 * Notification.show("Search action")), new MenuItem("Close", "close", () ->
		 * Notification.show("Close action")));
		 */
		this.add(app, container);

		showHome();

	}

	private void showHome() {
		container.removeAll();

		VerticalLayout mainLayout = new VerticalLayout();
		mainLayout.setHeight("500px");

		

		Button button = new Button("add", event -> {

			graphEditor.addNode();

		});
		mainLayout.add(button);

		graphEditor = new GraphEditor();
		graphEditor.setSizeFull();
		graphEditor.setHeight("100%");
		mainLayout.add(graphEditor);

		H3 label = new H3();
		label.setSizeFull();
		label.setText("test");

		PaperCard pc = new PaperCard(mainLayout);
		pc.setWidth("100%");
		pc.setHeight("100%");
		container.add(pc);
	}

	private void showSettings(String content) {
		container.removeAll();

		List<String> columnList = (List<String>) VaadinSession.getCurrent().getAttribute(COLUMN_LIST);
		if (columnList == null) {
			columnList = new ArrayList<>();
		}

		H3 label = new H3();
		label.setSizeFull();
		label.setText(content);
		PaperCard pc = new PaperCard(label, new MenuItem("Delete", () -> Notification.show("Delete action from card")),
				new MenuItem("Delete", "delete", () -> Notification.show("Delete action from card")));
		pc.setWidth("100%");
		container.add(pc);
	}

}