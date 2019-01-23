package org.tektutor;

import java.util.Stack;

public class RPNCalculator {

	private Stack<Double> numberStack = null;
	private double firstNumber, secondNumber, result;

	public RPNCalculator() {
		numberStack = new Stack<Double>();
		firstNumber = secondNumber = result = 0.0;
	}

	private void extractOperands() {
		secondNumber = numberStack.pop();
		firstNumber = numberStack.pop();
	}

	private boolean isMathOperator ( String strMathOperator ) {
		String mathOperators = "+-*/";
		return mathOperators.contains ( strMathOperator );
	}

	public double evaluate ( String rpnMathExpression ) {

		String[] tokens = rpnMathExpression.split ( " " );
		MathOperation mathOperation = null;

		for ( String token : tokens ) {

			if ( isMathOperator ( token ) ) {
				extractOperands();
				mathOperation = MathFactory.getMathObject ( token );
				result = mathOperation.evaluate ( firstNumber, secondNumber );
				numberStack.push ( result );
			}
			else {
				numberStack.push ( Double.parseDouble ( token ) );
			}

		}
		return numberStack.pop();
	}

}
