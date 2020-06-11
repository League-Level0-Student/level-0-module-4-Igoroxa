package _01_double._2_test_scores;

import javax.swing.JOptionPane;

public class classscore {
public static void main(String[] args) {
	String score = JOptionPane.showInputDialog("WHAT IS YOUR SCORE FOR YOUR MATH TEST BE HONEST out of 10");
	double scoredouble = Double.parseDouble (score);
		if (scoredouble >= 7.5) {
			JOptionPane.showMessageDialog(null, "Good Job");}
		 if (scoredouble <= 2.5) {
			 JOptionPane.showMessageDialog(null, "You Gamer");}
		 else {JOptionPane.showMessageDialog(null, "Its fine");}
	}
}

