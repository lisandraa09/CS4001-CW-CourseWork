public  class Gadget {
    private String model;
    private double price;
    private int weight;
    private String size;

    public Gadget(String model, double price, int weight, String size) {
        /// Initialise constructor parameters
        this.model = model;
        this.price = price;
        this.weight = weight;
        this.size = size;
    }

    public String getModel() {
        /// Returns the model with the gadget
        return model;
    }

    public double getPrice() {
        /// Returns the calling credit with the gadget
        return price;
    }

    public int getWeight() {
        /// Returns the weight with the gadget
        return weight;
    }

    public String getSize() {
        /// Returns the size with the gadget
        return size;
    }



    public void display(int index) {
        /// Formatted display of the gadget
        System.out.println("=======================");
        System.out.println("" + index);
        System.out.println("=======================");
        System.out.println("Model: " + model);
        System.out.println("Price: £" + price);
        System.out.println("Weight: " + weight + " grams");
        System.out.println("Size: " + size);
        
    }
}
