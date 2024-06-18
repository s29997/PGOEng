package Tests.Test2.Sample2.Task6;

/*
An abstract class in Java is a class that cannot be
 instantiated on its own and is meant to be subclassed.
 It can contain abstract methods (without implementation)
  as well as concrete methods (with implementation).
  The purpose of an abstract class is to provide a
  common base for subclasses and to enforce a certain
  structure in the derived classes.
*/
abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void makeSound();
}

class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Woof");
    }
}

class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Meow");
    }
}
