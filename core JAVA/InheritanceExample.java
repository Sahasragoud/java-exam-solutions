public class InheritanceExample  {
    public static void main(String[] args) {
        Animal ani = new Animal();
        ani.makeSound();
        
        Dog d = new Dog();
        d.makeSound();
    }
}

class Animal{
    public void makeSound(){
        System.out.println("Animal is making sound...");
    }
}

class Dog extends Animal {
    public void makeSound(){
        System.out.println("Bark");
    }   
}
