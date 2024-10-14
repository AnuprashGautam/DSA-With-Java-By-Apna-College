# Math class functions


```java 
public class JavaMathExample1    
{    
    public static void main(String[] args)     
    {    
        double x = 28;    
        double y = 4;    
          
        // return the maximum of two numbers  
        System.out.println("Maximum number of x and y is: " +Math.max(x, y));   
          
        // return the square root of y   
        System.out.println("Square root of y is: " + Math.sqrt(y));   
          
        //returns 28 power of 4 i.e. 28*28*28*28    
        System.out.println("Power of x and y is: " + Math.pow(x, y));      
  
        // return the logarithm of given value       
        System.out.println("Logarithm of x is: " + Math.log(x));   
        System.out.println("Logarithm of y is: " + Math.log(y));  
          
        // return the logarithm of given value when base is 10      
        System.out.println("log10 of x is: " + Math.log10(x));   
        System.out.println("log10 of y is: " + Math.log10(y));    
          
        // return the log of x + 1  
        System.out.println("log1p of x is: " +Math.log1p(x));    
  
        // return a power of 2    
        System.out.println("exp of a is: " +Math.exp(x));    
          
        // return (a power of 2)-1  
        System.out.println("expm1 of a is: " +Math.expm1(x));  
    }    
}    
```


This Java code demonstrates the usage of various mathematical methods provided by the `Math` class in Java. Let's break it down in detail:

### Class Declaration:
```java
public class JavaMathExample1
{
```
- **`public class JavaMathExample1`**: This is the class definition. The class is named `JavaMathExample1` and it is declared as `public`, meaning it can be accessed from outside its package.

### Main Method:
```java
    public static void main(String[] args)
    {
```
- **`public static void main(String[] args)`**: This is the entry point of the program. It is a standard method that the JVM calls to start execution.
- **`String[] args`**: This is an array that can hold command-line arguments, though it's not used in this code.

### Variable Declarations:
```java
    double x = 28;
    double y = 4;
```
- **`double x = 28;`** and **`double y = 4;`**: These variables store the values 28 and 4 respectively. The `double` data type is used to store decimal numbers.

### `Math.max(x, y)`:
```java
    System.out.println("Maximum number of x and y is: " + Math.max(x, y));
```
- **`Math.max(x, y)`**: The `max()` method returns the larger of the two numbers, `x` and `y`. In this case, it will return `28` since `28` is greater than `4`.

### `Math.sqrt(y)`:
```java
    System.out.println("Square root of y is: " + Math.sqrt(y));
```
- **`Math.sqrt(y)`**: The `sqrt()` method returns the square root of the argument `y`. The square root of `4` is `2.0`.

### `Math.pow(x, y)`:
```java
    System.out.println("Power of x and y is: " + Math.pow(x, y));
```
- **`Math.pow(x, y)`**: The `pow()` method returns the value of `x` raised to the power of `y`, i.e., `28^4`, which is `28 * 28 * 28 * 28`. The result is `614656.0`.

### `Math.log(x)` and `Math.log(y)`:
```java
    System.out.println("Logarithm of x is: " + Math.log(x));
    System.out.println("Logarithm of y is: " + Math.log(y));
```
- **`Math.log(x)`**: The `log()` method returns the natural logarithm (base `e`) of the argument `x`. The natural logarithm of `28` is approximately `3.3322`.
- **`Math.log(y)`**: Similarly, it returns the natural logarithm of `4`, which is approximately `1.3862`.

### `Math.log10(x)` and `Math.log10(y)`:
```java
    System.out.println("log10 of x is: " + Math.log10(x));
    System.out.println("log10 of y is: " + Math.log10(y));
```
- **`Math.log10(x)`**: The `log10()` method returns the base-10 logarithm of `x`. The base-10 logarithm of `28` is approximately `1.4472`.
- **`Math.log10(y)`**: Similarly, it returns the base-10 logarithm of `4`, which is `0.6021`.

### `Math.log1p(x)`:
```java
    System.out.println("log1p of x is: " + Math.log1p(x));
```
- **`Math.log1p(x)`**: The `log1p()` method returns the natural logarithm of `1 + x`, which is useful for avoiding precision loss when `x` is close to `0`. Here, it returns the value of `ln(1 + 28)`, which is approximately `3.3673`.

### `Math.exp(x)`:
```java
    System.out.println("exp of a is: " + Math.exp(x));
```
- **`Math.exp(x)`**: The `exp()` method returns Euler’s number `e` raised to the power of `x`. In this case, it returns `e^28`, which is a very large number: `1.446257064291475E12`.

### `Math.expm1(x)`:
```java
    System.out.println("expm1 of a is: " + Math.expm1(x));
```
- **`Math.expm1(x)`**: The `expm1()` method returns `e^x - 1`. This is another method that helps avoid precision issues when `x` is close to 0. Here, it calculates `e^28 - 1`, which is a huge number: `1.4462570642914744E12`.

### Summary:
This code demonstrates how to use a variety of mathematical methods from the `Math` class in Java. It covers basic operations like finding the maximum of two numbers, computing powers, logarithms (both natural and base-10), and more advanced operations like exponentiation and logarithms with small values (`log1p` and `expm1`). These methods are part of the standard Java library and are essential tools for performing mathematical calculations in Java programs.