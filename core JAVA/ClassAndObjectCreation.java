class Car {
    private String model;
    private int doors;
    private int seats;
    private String color;
    
    public Car(String model, int doors, int seats, String color){
        this.model = model;
        this.doors = doors;
        this.seats = seats;
        this.color = color;
    }
    
    public void drive(){
        System.out.println("The car is driving");
    }
    
    public void displayDetails(){
        System.out.println("Model: " + this.model + "\nDoors: " + this.model + 
        "\nSeats: " + this.seats + "\nColor: "  + this.color);
    }
}

class ClassAndObjectCreation {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota", 5, 7, "Red");
        car1.drive();
        car1.displayDetails();
    }
}
