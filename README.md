# School-OOP
This is a simple school management system using Object Oriented programming (OOP) in Java.

In this project, I tried to implement as much OOP concepts as possible. However, the four fundamental OOP concepts are:

* Encapsulation
* Inheritance
* Abstraction
* Polymorphism

## Structure
Just like an actual school, the school I modeled is an object containing other objects. I consider this to be my implementation of *Composition*.

Composition is the design technique to implement has-a relationship in classes. It allows code reuse. 
Java composition is achieved by using instance variables that refers to other objects.

My school object contain the following objects:

* Principal
* Teachers
* Non Teaching Staffs
* Students
* Courses
* Classes
* Applicants

The objects listed above are the fields in the school object and the school *Constructor* can be used to creeate a new school.

### Encapsulation
The school field are declared with the *private* access modifier which gives *Encapsulation* to the object.

Encapsulation is simply the process of hiding the data of an object.
To achieve encapsulation in Java −

* Declare the variables of a class as private.
* Provide public setter and getter methods to modify and view the variables values.

### Inheritance
