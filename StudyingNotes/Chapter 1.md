
# Chapter 1 Introductory Java Language Features
## Pakages and Classes
### Packeges:
Related classes are grouped into *pakeges*, many of which are povided with the compiler.
```Java
 import packagename.*;
 import pakagename.ClassName;
```
### Classes:
A Java program must have at least one class, the one contains *the main method*.
The java files that comprise your program is called *source files*.
A *compiler* converts source code into machine-readable form called *bytecode*.

### NOTE:
1. Class,public,static,void,and main are *reserved words*, also called *keywords*.
2. Public signals that the class or method is usable outside of the class, whereas private data members or methods are not.
3. Static is used for methods that will not access any objects of a class

## Javadoc Comments
@param, @return, and @throws:
```Java
* @param loc the location where the object will be placed
* @param obj the object to be placed
* @return the object previously at the specified location
* @throws NullPointerException if the object is null
```
## Types and Identifiers
### Identifiers
An *identifier* is a name for a variable, parameter, constant, user-defined method, or user- defined class.
