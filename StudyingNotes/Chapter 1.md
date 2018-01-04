
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
Identifiers may not begin with a digit.

### Built-in Types
Every identifier in a Java program has a type associated with it. The primitive or built- in types that are included in the AP Java subset are
*int* *boolean* *double*
One type can be cast to another compatible type if appropriate. For example,
```Java
int total, n; double average;
average = (double) total/n;
```
Alternatively,
```Java
average = total/(double) n;
```
Assigning an int to a double automatically casts the int to double. For example,
```Java
int num = 5;
double realNum = num; //num is cast to double
```
### Storage of Numbers
#### Integer
Byte: 8 bits, 1 for sign
Store −2n−1 to 2n−1 − 1. (Note that the extra value on the nega- tive side comes from not having to store −0.)
#### Floating-Point Numbers
A floating-point number is stored in two parts: a mantissa, which specifies the digits of the number, and an exponent.
* sign ∗ mantissa ∗ 2^exponent
In type double eleven bits are allocated for the exponent, and (typically) 52 bits for the mantissa. One bit is allocated for the sign.
When floating-point numbers are converted to binary, most cannot be represented exactly, leading to round-off error.
Check:  http://blog.csdn.net/abing37/article/details/5332798

### Final Variables
A final variable or user-defined constant, identified by the keyword final, is used to name a quantity whose value will not change.
```Java
final double TAX_RATE = 0.08;
final int CLASS_SIZE = 35;
```
Note:
1. Constantidentifiersare,byconvention,capitalized.
2. A final variable can be declared without initializing it immediately. For ex-
ample,
```Java
final double TAX_RATE; if (< some condition >)
TAX_RATE = 0.08; else
TAX_RATE = 0.0;
// TAX_RATE can be given a value just once: its value is final!
```
3. Acommonuseforaconstantisasanarraybound.Forexample,
```Java
final int MAXSTUDENTS = 25;
int[] classList = new int[MAXSTUDENTS];
```
4. Usingconstantsmakesiteasiertorevisecode.Justasinglechangeinthefinal declaration need be made, rather than having to change every occurrence of a value.






















