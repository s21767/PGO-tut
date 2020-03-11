class Car {
    String color;
    String brand;
    int capacity;

    public Car(String color, String brand, int capacity){
        this.color = color;
        this.brand = brand;
        this.capacity = capacity;
    }

    public String getColor(){
        return color;
    }

    public String getBrand(){
        return brand;
    }

    public void setCapacity(int capacity){
        this.capacity = capacity;
    }

    public String infoCapacity(){
        String reply;
        if(this.capacity>=21){
            reply = "The engine is high-speed.";
        }else{
            reply = "The engine is not high-speed.";
        }
        return reply;
    }
}
