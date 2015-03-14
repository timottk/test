package com.finanz.gui.menu;

import javax.swing.JMenu;

public class MainMenu extends JMenu {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	public JMenu mainMenu;

	public MainMenu() {
		mainMenu = new JMenu("Main Menu");
		MainMenuItem portfolioItem = new MainMenuItem("Portfolio");
		MainMenuItem quitItem = new  MainMenuItem("Quit");
		mainMenu.add(portfolioItem);
		mainMenu.add(quitItem);
	}

	public JMenu getMenu() {
		return mainMenu;
	}



}
