# Singleton Design Pattern

The Singleton Pattern ensures you have at most one instance of a class in your application\.

## Participants in Pattern

### Singleton

- It defines an Instance operation that lets clients (main or other classes) access its unique instance (getInstance() method) . Instance is a class operation, in Java it is a static class.\
- It may be responsible for creating its own unique instance.\

### When to use or not use Singleton Pattern

Use the Singleton pattern when:
- there must be exactly one instance of a class, and it must be accessible to clients from a wellknown access point.\
- Or you want to have n number of instances only.\
- when the single instance should be extensible by sub-classing, and clients should be able to use an extended instance without modifying their code.\

UML Class Diagram:

 ![alt text](SingletonUMLClassDiagram.png "Class Model")

