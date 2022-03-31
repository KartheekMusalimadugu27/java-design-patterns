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

- Builder Pattern
- Prototype Pattern
- Singleton Pattern
- Abstract Factory Pattern

*Structural*#

Structural patterns are concerned with the composition of classes i.e. how the classes are made up or constructed. 

These include:

- Adapter Pattern
- Bridge Pattern
- Composite Pattern
- Decorator Pattern
- Facade Pattern
- Flyweight Pattern
- Proxy Pattern

*Behavioral*#

Behavioral design patterns dictate the interaction of classes and objects amongst each other and the 
delegation of responsibility. These include:

- Interpreter Pattern
- Template Pattern
- Chain of Responsibility Pattern
- Command Pattern
- Iterator Pattern
- Mediator Pattern
- Memento Pattern
- Observer Pattern
- State Pattern
- Strategy Pattern
- Visitor Pattern
