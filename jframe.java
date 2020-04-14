package jFrame;

import javax.swing.*;

public class jframe
{
	public static void main(String[] args)
	{
		// Initializing java frame
		
		/*
		JFrame first_frame = new JFrame("Hello");
		first_frame.setVisible(true);
		*/
		
		// JLabel's font
		// Using a layout manager, border layout, flow layout manager
		// border layout = divides a container into regions
		// We can extend JFrame class
		// JButton, setText(), getText()
		// Prepare our class to accept events
		// Understanding swing event listeners	ActionListener	AdjustmentListener	ChangeListener etc
		// JCheckBox	Constructors -- JCheckBox()	JCheckBox("Check here")
		// JComboBox class	addItem()
		
		String[] majorArray = {"English", "Math", "Sociology"};
		JComboBox majorChoice = new JComboBox(majorArray);
		majorChoice.setVisible(true);
	}
}