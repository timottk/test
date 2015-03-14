package com.finanz.gui;


import java.awt.BorderLayout;

import javax.swing.JFrame;

import com.finanz.gui.menu.MainEntryMenuBar;
import com.finanz.gui.menu.MainMenu;
import com.finanz.gui.menu.tab.MenuTab;

public class MainEntry {

	private final JFrame frame;

	public MainEntry() {
		frame = new JFrame();
		frame.setTitle("Finance Calculator");
		frame.setSize(800,400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		MainEntryMenuBar menuBar = new MainEntryMenuBar();
		MainMenu menu = new MainMenu();
		menuBar.add(menu.getMenu());
		frame.setJMenuBar(menuBar);

		MenuTab mainTabPanel = new MenuTab();

		frame.add(mainTabPanel.getTab(), BorderLayout.CENTER);

		frame.setVisible(true);
	}

}
