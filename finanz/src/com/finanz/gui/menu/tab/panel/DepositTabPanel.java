package com.finanz.gui.menu.tab.panel;

import javax.swing.JScrollPane;
import javax.swing.JTable;

public class DepositTabPanel extends JScrollPane {


	/**
	 *
	 */
	private static final long serialVersionUID = 1155692647767084585L;

	public DepositTabPanel() {
		super(new JTable(1,5));
	}

}
