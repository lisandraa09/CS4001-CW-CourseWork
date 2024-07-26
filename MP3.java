public class MP3 extends Gadget {
    private int availableMemory;

    public MP3(String model, double price, int weight, String size, int availableMemory) {
        /// Initialising values of the parent class
        super(model, price, weight, size);
        /// Initialising values of this class
        this.availableMemory = availableMemory;
    }

    public int getAvailableMemory() {
        /// Returns the available memory with the gadget
        return availableMemory;
    }

    public boolean downloadMusic(int memory) {
        /// Check if memory available to download
        if (memory > 0 && availableMemory >= memory) {
            /// decrease memory when download success
            availableMemory -= memory;
            return true;
        } else {
            /// Return false if there is insufficient memory
            //System.out.println("Insufficient memory or invalid memory size.");
            return false;
        }
    }

    public boolean deleteMusic(int memory) {
        /// Check if memory is valid amount
        if (memory > 0) {
            /// Increase memory when deleted
            availableMemory += memory;
            return true;
        } else {
            /// show message if memory size is not valid
            System.out.println("Invalid memory size.");
            return false;
        }
    }

    @Override
    public void display(int index) {
        /// Call the display method from parent class
        super.display(index);
        /// Display available memory from this class
        System.out.println("Available Memory: " + availableMemory + " MB");
        System.out.println("=======================\n");
    }
}
