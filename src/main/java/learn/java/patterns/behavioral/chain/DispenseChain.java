package learn.java.patterns.behavioral.chain;

public interface DispenseChain {

	void setNextLink(DispenseChain nextChain);
	
	void dispense(Currency cur);
}