package learn.java.patterns.creational.abstractfactory;


public interface AbstractWidgetFactory {

	public Window createWindow();
	public Scroll createScroll();
	public Button[] createNavigationButtons();
	
}
