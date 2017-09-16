package IntroToStacks;

import java.util.Random;
import java.util.Stack;

import javax.swing.JOptionPane;

public class IntroToStack {
	public static void main(String[] args) {
		//1. Create a Stack of Doubles
		//   Don't forget to import the Stack class
		Stack<Double> doubles = new Stack<Double>();
		//2. Use a loop to push 100 random doubles between 0 and 100 to the Stack.
		for(int i = 0; i < 100; i++) {
			doubles.push(new Random().nextDouble() * 100);
		}
		//3. Ask the user to enter in two numbers between 0 and 100, inclusive. 
		int num1 = Integer.parseInt(JOptionPane.showInputDialog("Please enter in a number between 1 and 100."));
		int num2 = Integer.parseInt(JOptionPane.showInputDialog("Please enter in a different number between 1 and 100."));
		//4. Pop all the elements off of the Stack. Every time a double is popped that is
		//   between the two numbers entered by the user, print it to the screen.
		System.out.println("NUM 1: " + num1 + "\nNUM 2: " + num2);
		//   EXAMPLE:
		//   NUM 1: 65
		//   NUM 2: 75
		for(int i = 99; i > 0; i--) {
			if(num2 > num1) {
				if(doubles.get(i) < num2 && doubles.get(i) > num1) {
					System.out.println(doubles.elementAt(i));
				}
			}
			else {
				if(doubles.get(i) < num1 && doubles.get(i) > num2) {
					System.out.println(doubles.elementAt(i));
				}
			}
			doubles.pop();
		}
		//   Popping elements off stack...
		//   Elements between 65 and 75:
		//   66.66876846
		//   74.51651681
		//   70.05110654
		//   69.21350456
		//   71.54506465
		//   66.47984807
		//   74.12121224
	}
}
