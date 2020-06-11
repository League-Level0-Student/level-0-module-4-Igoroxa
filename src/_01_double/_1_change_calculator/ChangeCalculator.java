package _01_double._1_change_calculator;

import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain.
 */

public class ChangeCalculator {

	public static void main(String[] args) {

		// Ask the user how many nickels they have
String nickels = JOptionPane.showInputDialog("HOW MANY NICKLES DO YOU CURRENTLY HAVE?");
		// Convert their answer to an int.   Hint: Integer.parseInt()  
int intnickels = Integer.parseInt(nickels);  

		// Ask the user how many dimes they have, and convert their answer
String dimes = JOptionPane.showInputDialog("HOW MANY DIMES DO YOU CURRENTLY HAVE?");
int intdimes = Integer.parseInt(dimes); 
		// Ask the user how many quarters they have, and convert their answer
String quarter = JOptionPane.showInputDialog("HOW MANY QUARTERS DO YOU CURRENTLY HAVE?");
int intquarters = Integer.parseInt(quarter); 
		// Calculate how much money the user has.  Hint: Use a double variable 
double money = intnickels * 0.05 + intdimes * 0.10 + intquarters * 0.25;
JOptionPane.showMessageDialog(null, money);
		// Tell the user how much money they have in dollars and cents format (e.g. $6.75)

	}
}

