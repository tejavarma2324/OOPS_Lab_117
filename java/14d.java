Encapsulation 4:  

class Car {  

    private String brand;  

    private String model;  

    private double price;  

  

    public Car(String brand, String model, double price) {  

        this.brand = brand;  

        this.model = model;  

        setPrice(price);  

    }  

  

    public void setPrice(double price) {  

        if (price > 0) {  

            this.price = price;  

        } else {  

            System.out.println("Price cannot be zero or negative. Setting to default  

$10,000.");  

            this.price = 10000;  

        }  

    }  

  

    public double getPrice() {  

        return price;  

    }  

  

    public void display() {  

        System.out.println("Car Brand: " + brand + ", Model: " + model + ", Price: $" +  

price);  

    }  

  

    public static void main(String[] args) {  

        Car car = new Car("Tesla", "Model S", 79999);  

        car.display();  

    }  

}  

  

   