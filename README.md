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

Encapsulation is simply the process of hiding the data of an object. In other words, it is called Wrapping.
To achieve encapsulation in Java −

* Declare the variables of a class as private.
* Provide public setter and getter methods to modify and view the variables values.

### Inheritance
Some objects contained in the school object were created using *Inheritance*.

Inheritance in Java is a mechanism in which one object acquires all the properties and behaviors of a parent object. Inheritance allows the creation of new classes that are built upon existing classes. It promotes code reuseability.

In this school system, I implemented inheritance by doing the following:

1. I identified what some objects have in common.
2. I created an object (Parent Class) having the properties those objects have in common.
3. I allowed each object sharing the properties of the parent class to inherit from it.

In a school, the principal, teachers and non-academic staff are all staffs. Hence, they all inherits from a staff class i created.
Also, the staffs, students and applicants are all people and each of them is a person. Hence, staff, student and applicant class inherits from the person class i created.

### Abstraction
Some objects contained in the school object were created using *Abstraction*.

Abstraction involves hiding the implementation details of a method. In Java abstraction is achieved through abstract classes and interfaces.

* Interfaces is a collection of abstract methods only.
* Abstract class is a class having at least one abstract method and other class fields and methods.

In this project, I created the pricipal, teacher and non-teaching staff class as abstract classes by allowing them to implement an authorization interface.

### Polymorpism
To be updated later...
