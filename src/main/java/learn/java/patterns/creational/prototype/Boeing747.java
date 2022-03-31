package learn.java.patterns.creational.prototype;

public class Boeing747 implements IAircraftPrototype{
	
	F16Engine boeing747Engine = new F16Engine();

	 @Override
	    public void fly() {
	        System.out.println("F-16 flying...");
	    }

	    @Override
	    public IAircraftPrototype clone() {
	        // Deep clone self and return the product
	        return new F16();
	    }

	   
		@Override
		public void setEngine(F16Engine f16Engine) {
			 this.boeing747Engine = f16Engine;
			
		}
}
