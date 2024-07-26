public  class Mobile extends Gadget {
    private int callingCredit;

    public Mobile(String model, double price, int weight, String size, int callingCredit) {
        /// Initialising values of the parent class
        super(model, price, weight, size);
        /// Initialising values of this class
        this.callingCredit = callingCredit;
    }

    public int getCallingCredit() {
        /// Returns the calling credit with the gadget
        return callingCredit;
    }

    public void addCredit(int credit) {
        /// Check credit if it is a valid value
        if (credit > 0) {
            /// Add credit if it is a valid value
            callingCredit += credit;
        } else {
            /// show error if it is a invalid value
            System.out.println("Please enter a positive amount.");
        }
    }

    public boolean makeCall(int phoneNumber, int duration) {
        /// Check if credit available for that duration
        if (callingCredit >= duration) {
            /// Decrease credits as the're used
            //System.out.println("Calling " + phoneNumber + " for " + duration + " minutes.");
            callingCredit -= duration;
            return true;
        } else {
            /// return false if not able to make call
            //System.out.println("Insufficient credit to make the call.");
            return false;
        }
    }



    @Override
    public void display(int index) {
        /// Call the display method from parent class
        super.display(index);
        /// Display Calling Credit from this class
        System.out.println("Calling Credit: " + callingCredit + " minutes");
        System.out.println("=======================\n");
    }
}
