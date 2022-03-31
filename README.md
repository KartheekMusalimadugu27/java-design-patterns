# java-design-patterns

-------------------------------------------------------------------------------------------------------------------

Suggestions for Object Oriented Design#

Whenever writing code in an object oriented language, sticking to the following list of suggestions will make 
your code amenable to changes with the least effort.

- Separate out parts of code that vary or change from those that remain the same.

- Always code to an interface and not against a concrete implementation.

- Encapsulate behaviors as much as possible.

- Favor composition over inheritance. Inheritance can result in explosion of classes and also sometimes the base 
class is fitted with new functionality that isn't applicable to some of its derived classes.

- Interacting components within a system should be as loosely coupled as possible.

- Ideally, class design should inhibit modification and encourage extension.

- Using patterns in your day to day work, allows exchanging entire implementation concepts with other developers
 via shared pattern vocabulary.
 
 ---------------------------------------------------------------------------------------------------------------------
 
Design patterns for object orientated programs are divided into three broad categories listed below. 
These are the same categories used by GoF in their seminal work on design patterns.

- Creational
- Structural
- Behavioural

Each of these are explained below

*Creational*#

Creational design patterns relate to how objects are constructed from classes. New-ing up objects may 
sound trivial but unthoughtfully littering code with object instance creations can lead to headaches down 
the road. The creational design pattern come with powerful suggestions on how best to encapsulate the object 
creation process in a program.

- Builder Pattern [builder pattern encapsulates or hides the process of building a complex object and separates 
				   the representation of the object and its construction. The separation allows us to construct 
				   different representations using the same construction process.]
				   
- Prototype Pattern [specify the kind of objects to create using a prototypical instance as a model and making 
					 copies of the prototype to create new objects]
					 
- Singleton Pattern [ensuring that only a single instance of a class exists and a global point of access to it exists]

- Factory Method Pattern - [providing an interface for object creation but delegating the actual instantiation of objects to subclasses.]

- Abstract Factory Pattern - [defining an interface to create families of related or dependent objects without specifying their concrete classes.]

*Structural*#

Structural patterns are concerned with the composition of classes i.e. how the classes are made up or constructed. 

These include:

- Adapter Pattern - [allowing incompatible classes to work together by converting the interface of one class into another expected by the clients]

- Bridge Pattern - [the bridge pattern lets you vary the abstraction independently of the implementation, thus decoupling the two in the process]

- Composite Pattern - [composing objects into tree structures to represent part-whole hierarchies, thus letting clients uniformly treat 
					   individual objects and composition of objects]
					   
- Decorator Pattern - [enhance or extend the behavior of an object dynamically]

- Facade Pattern - [a single uber interface to one or more subsystems or interfaces intending to make use of the subsystems easier.]

- Flyweight Pattern - [sharing state among a large number of fine-grained objects for efficiency]

- Proxy Pattern- [a mechanism to provide a surrogate or placeholder for another object to control access to it]

*Behavioral*#

Behavioral design patterns dictate the interaction of classes and objects amongst each other and the 
delegation of responsibility. These include:

- Interpreter Pattern - [describe a way to represent the grammar of a language along with an interpreter that uses the representation 
						 to interpret sentences in the language]
						 
- Template Pattern - [allowing subclasses to define parts of an algorithm without modifying the overall structure of the algorithm.]

- Chain of Responsibility Pattern - [decoupling the sender of a request from its receiver by chaining the receiving objects together and passing 
									 the request along the chain until an object handles it.]
									 
- Command Pattern - [representing an action or a request as an object that can then be passed to other objects as parameters, 
					 allowing parameterization of clients with requests or actions. The requests can be queued for later execution or logged. 
					 Logging requests enables undo operations.]
					 
- Iterator Pattern - [a pattern that allows traversing the elements of an aggregate or a collection sequentially 
					  without exposing the underlying implementation]
					  
- Mediator Pattern - [encouraging loose coupling among interacting objects by encapsulating their interactions in a mediator object, thus 
					  avoiding the need for individual objects to refer to each other directly and allowing to vary object 
					  interactions independently.]
					  
- Memento Pattern - [let's us capture the internal state of an object without exposing its internal structure so that the object 
					 can be restored to this state later]
					 
- Observer Pattern - [a one to many dependency between objects so that when one object changes state all the dependents are notified]

- State Pattern - [allowing an object to alter behavior when its internal state changes so that it appears to change its class.]

- Strategy Pattern - [encapsulating algorithms belonging to the same family and making them interchangeable. The consumers of the 
					  common interface that the algorithms implement allow switching out one algorithm for another seamlessly.]
					  
- Visitor Pattern - [defining operations to be performed on elements of an object structure without changing the classes of the 
					 elements it works on]


// Imp for Interviews - creational design patterns, decorator, proxy, iterator, observer and visitor patterns
