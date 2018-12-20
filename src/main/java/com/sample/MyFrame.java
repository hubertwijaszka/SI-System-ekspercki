package com.sample;
import java.awt.FlowLayout;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class MyFrame extends JFrame {
	public static JFrame jFrame;
	public static String wyswietl(String[] poss,String pytanie)
	{
		String selectedValue = (String)JOptionPane.showInputDialog(jFrame,
            	pytanie,"job in the film industry",
            	JOptionPane.INFORMATION_MESSAGE, null,
            	poss, poss);
		
			return selectedValue;
	}
	public static void wyswietlPodsumowanie(String string)
	{
		JOptionPane.showMessageDialog(jFrame, string);
	}
}