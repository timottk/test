package com.finanz.gui.menu.tab;

import javax.swing.JPanel;
import javax.swing.JTabbedPane;

import com.finanz.gui.menu.tab.panel.DepositTabPanel;

public class MenuTab extends JTabbedPane{

	/**
	 *
	 */
	private static final long serialVersionUID = -7484206995839561260L;

	public JTabbedPane tabbedPane;


	public MenuTab() {
		tabbedPane = new JTabbedPane();
		tabbedPane.addTab("Deposit", new DepositTabPanel());
		tabbedPane.addTab("Fonds",new JPanel());
		tabbedPane.addTab("Shares", new JPanel());
		tabbedPane.addTab("Daily Saving", new JPanel());
	}

	public JTabbedPane getTab() {
		return tabbedPane;
	}
}
