package learn.java.patterns.creational.singleton;

/*
 * Double-Checked Locking#
 * 
 * The next evolution of our singleton pattern would be to synchronize only when the object 
 * is created for the first time and if its already created, then we don't attempt to 
 * synchronize the accessing threads. This pattern has a name called "double-checked locking".
*/
public class AirforceOneWithDoubleCheckedLocking {
	// The sole instance of the class. Note its marked volatile
	private volatile static AirforceOneWithDoubleCheckedLocking onlyInstance;

	// Make the constructor private so its only accessible to
	// members of the class.
	private AirforceOneWithDoubleCheckedLocking() {
	}

	public void fly() {
		System.out.println("Airforce one is flying...");
	}

	// Create a static method for object creation
	synchronized public static AirforceOneWithDoubleCheckedLocking getInstance() {

		// Only instantiate the object when needed.
		if (onlyInstance == null) {
			// Note how we are synchronizing on the class object
			synchronized (AirforceOneWithDoubleCheckedLocking.class) {
				if (onlyInstance == null) {
					onlyInstance = new AirforceOneWithDoubleCheckedLocking();
				}
			}
		}

		return onlyInstance;
	}
}
