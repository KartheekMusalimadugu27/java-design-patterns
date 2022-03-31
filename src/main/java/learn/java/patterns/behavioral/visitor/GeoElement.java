package learn.java.patterns.behavioral.visitor;

public interface GeoElement {
	
	void accept(Visitor visitor);

}
