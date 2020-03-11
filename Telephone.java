class Telephone {
    String brand;
    int resolution;
    String number;

    public Telephone(String brand, int resolution, String number){
        this.brand = brand;
        this.resolution = resolution;
        this.number = number;
    }

    public String sendMessage(String message){
        String mesX = "Message X";
        String send = "Sending the message " + mesX + " to number " + number;
        return send;
    }
}
