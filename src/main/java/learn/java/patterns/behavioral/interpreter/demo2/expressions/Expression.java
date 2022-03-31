package learn.java.patterns.behavioral.interpreter.demo2.expressions;

import learn.java.patterns.behavioral.interpreter.demo2.Employee;

public interface Expression {
	
	public boolean interpret(Employee context);
}
