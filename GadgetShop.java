import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class GadgetShop extends JFrame {
    private ArrayList<Gadget> gadgets = new ArrayList<>();
    JTextField displayNumberInputField = new JTextField();
    

    public GadgetShop() {
        setTitle("Gadget Shop");
        setSize(800, 700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        /// Consistent size for input fields
        Dimension inputFieldSize = new Dimension(200, 30);  
        /// Smaller height for buttons
        Dimension buttonSize = new Dimension(200, 25); 

        /// Top panel for displaying all gadgets
        JPanel topPanel = new JPanel();

        /// Display All button component
        //JPanel displayNumberPanel = new JPanel();
        JButton displayAllButton = new JButton("Display All");
        displayAllButton.setPreferredSize(buttonSize);

        /// Display Number component
        JPanel displayNumberTextPanel = new JPanel(new BorderLayout());
        JLabel displayNumberLabel = new JLabel("Display Number:");
        displayNumberInputField.setPreferredSize(inputFieldSize);
        displayNumberTextPanel.add(displayNumberLabel, BorderLayout.NORTH);
        displayNumberTextPanel.add(displayNumberInputField, BorderLayout.CENTER);
        /* displayNumberPanel.add(displayNumberTextPanel);
        add(displayNumberPanel, BorderLayout.NORTH); */
        
        /// Clear button component
        JButton clearButton = new JButton("Clear");
        clearButton.setPreferredSize(buttonSize);
        
        /// Add buttons and textfield to the toppanel
        topPanel.add(displayAllButton);
        topPanel.add(clearButton);
        topPanel.add(displayNumberTextPanel);
        add(topPanel, BorderLayout.NORTH);



        /// Main panel with BoxLayout
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
        mainPanel.setBorder(new EmptyBorder(20, 20, 20, 20));

        /// Model and Price row
        JPanel modelPricePanel = new JPanel(new GridLayout(1, 2, 10, 10));
        modelPricePanel.setBorder(new EmptyBorder(10, 10, 10, 10));
        //modelPricePanel.setBorder(new LineBorder(Color.BLACK, 1));
        JPanel modelPanel = new JPanel(new BorderLayout());
        JLabel modelLabel = new JLabel("Model:");
        JTextField modelInputField = new JTextField();
        modelInputField.setPreferredSize(inputFieldSize);
        modelPanel.add(modelLabel, BorderLayout.NORTH);
        modelPanel.add(modelInputField, BorderLayout.CENTER);
        
        /// Price component
        JPanel pricePanel = new JPanel(new BorderLayout());
        JLabel priceLabel = new JLabel("Price (£):");
        JTextField priceInputField = new JTextField();
        priceInputField.setPreferredSize(inputFieldSize);
        pricePanel.add(priceLabel, BorderLayout.NORTH);
        pricePanel.add(priceInputField, BorderLayout.CENTER);
        pricePanel.setPreferredSize(inputFieldSize);

        /// Adding Model and Price textfields to the panel
        modelPricePanel.add(modelPanel);
        modelPricePanel.add(pricePanel);

        /// Adding Model Price panel to main Panel
        mainPanel.add(modelPricePanel);
        

        /// Weight and Size row
        JPanel weightSizePanel = new JPanel(new GridLayout(1, 2, 10, 10));
        //weightSizePanel.setBorder(new LineBorder(Color.BLACK, 1));
        weightSizePanel.setBorder(new EmptyBorder(10, 10, 10, 10));
        JPanel weightPanel = new JPanel(new BorderLayout());
        JLabel weightLabel = new JLabel("Weight (grams):");
        JTextField weightInputField = new JTextField();
        weightInputField.setPreferredSize(inputFieldSize);
        weightPanel.add(weightLabel, BorderLayout.NORTH);
        weightPanel.add(weightInputField, BorderLayout.CENTER);
        
        ///  Size component
        JPanel sizePanel = new JPanel(new BorderLayout());
        JLabel sizeLabel = new JLabel("Size:");
        JTextField sizeInputField = new JTextField();
        sizeInputField.setPreferredSize(inputFieldSize);
        sizePanel.add(sizeLabel, BorderLayout.NORTH);
        sizePanel.add(sizeInputField, BorderLayout.CENTER);

        /// Adding Weight and Size textfields to the panel
        weightSizePanel.add(weightPanel);
        weightSizePanel.add(sizePanel);

        /// Adding Weight and Size panel to main Panel
        mainPanel.add(weightSizePanel);

        // Seperate MP3 and Mobile sections
        JPanel sectionsPanel = new JPanel(new GridLayout(1, 2, 10, 10));
        sectionsPanel.setBorder(new EmptyBorder(10, 10, 10, 10));


        /// MP3 section
        JPanel mp3Panel = new JPanel();
        mp3Panel.setLayout(new BoxLayout(mp3Panel, BoxLayout.Y_AXIS));
        mp3Panel.setBorder(new EmptyBorder(10, 10, 10, 10));
        mp3Panel.setBorder(new LineBorder(Color.BLACK, 1));
        JLabel mp3Label = new JLabel("MP3 Section");
        mp3Label.setBorder(new EmptyBorder(10, 10, 10, 10));
        mp3Label.setFont(new Font("Arial", Font.BOLD, 14));
        mp3Panel.add(mp3Label);

        /// Available Memory component
        JPanel memoryPanel = new JPanel(new BorderLayout());
        memoryPanel.setBorder(new EmptyBorder(10, 10, 10, 10));
        JLabel memoryLabel = new JLabel("Available Memory (MB):");
        JTextField memoryInputField = new JTextField();
        memoryInputField.setPreferredSize(inputFieldSize);
        memoryPanel.add(memoryLabel, BorderLayout.NORTH);
        memoryPanel.add(memoryInputField, BorderLayout.CENTER);
        
        /// Download size component
        JLabel downloadLabel = new JLabel("Download Size:");
        //mp3Panel.add(downloadLabel);
        JPanel downloadPanel = new JPanel(new BorderLayout());
        downloadPanel.setBorder(new EmptyBorder(10, 10, 10, 10));
        //downloadPanel.setBorder(new EmptyBorder(10, 10, 10, 10));
        JTextField downloadSizeInputField = new JTextField();
        downloadSizeInputField.setPreferredSize(inputFieldSize);
        downloadPanel.add(downloadLabel, BorderLayout.NORTH);
        downloadPanel.add(downloadSizeInputField, BorderLayout.CENTER);
        
        /// Download music button component
        JButton downloadMusicButton = new JButton("Download Music");
        downloadMusicButton.setPreferredSize(buttonSize);

        /// Adding available memory, download size input and download music button componente to the mp3 section
        mp3Panel.add(memoryPanel);
        mp3Panel.add(downloadPanel);
        mp3Panel.add(downloadMusicButton);

        /// Adding the mp3 section to the section panel
        sectionsPanel.add(mp3Panel);


        /// Mobile section
        JPanel mobilePanel = new JPanel();
        mobilePanel.setLayout(new BoxLayout(mobilePanel, BoxLayout.Y_AXIS));
        mobilePanel.setBorder(new EmptyBorder(10, 10, 10, 10));
        mobilePanel.setBorder(new LineBorder(Color.BLACK, 1));
        JLabel mobileLabel = new JLabel("Mobile Section");
        mobileLabel.setFont(new Font("Arial", Font.BOLD, 14));
        mobileLabel.setBorder(new EmptyBorder(10, 10, 10, 10));
        mobilePanel.add(mobileLabel);
        
        /// Initial credits component
        JPanel creditPanel = new JPanel(new BorderLayout());
        creditPanel.setBorder(new EmptyBorder(10, 10, 10, 10));
        JLabel creditLabel = new JLabel("Calling Credit (mins):");
        JTextField creditInputField = new JTextField();
        creditInputField.setPreferredSize(inputFieldSize);
        creditPanel.add(creditLabel, BorderLayout.NORTH);
        creditPanel.add(creditInputField, BorderLayout.CENTER);

        /// Phone number component
        JPanel phonePanel = new JPanel(new BorderLayout());
        phonePanel.setBorder(new EmptyBorder(10, 10, 10, 10));
        JLabel phoneLabel = new JLabel("Phone Number:");
        JTextField phoneInputField = new JTextField();
        phoneInputField.setPreferredSize(inputFieldSize);
        phonePanel.add(phoneLabel, BorderLayout.NORTH);
        phonePanel.add(phoneInputField, BorderLayout.CENTER);
        
        /// Duration component
        JPanel durationPanel = new JPanel(new BorderLayout());
        durationPanel.setBorder(new EmptyBorder(10, 10, 10, 10));
        JLabel durationLabel = new JLabel("Call Duration (mins):");
        JTextField durationInputField = new JTextField();
        durationInputField.setPreferredSize(inputFieldSize);
        durationPanel.add(durationLabel, BorderLayout.NORTH);
        durationPanel.add(durationInputField, BorderLayout.CENTER);
        
        /// Make call button component
        JButton makeCallButton = new JButton("Make Call");
        makeCallButton.setPreferredSize(buttonSize);
        


        /// Adding all the componente to the mobile section
        mobilePanel.add(creditPanel);
        mobilePanel.add(phonePanel);
        mobilePanel.add(durationPanel);
        mobilePanel.add(makeCallButton);

        /// Adding the mobile section to the section panel
        sectionsPanel.add(mobilePanel);

        /// Adding sections to the main panel
        mainPanel.add(sectionsPanel);



        /// Buttons for Add MP3 and Add Mobile
        JPanel buttonPanel = new JPanel( new GridLayout(1, 3, 10, 10));
        //JTable table = new JTable(new DefaultTableModel(new Object[]{"Column1", "Column2"}));
        buttonPanel.setBorder(new EmptyBorder(10, 10, 10, 10));

        JButton addMobileButton = new JButton("Add Mobile");
        JButton addMP3Button = new JButton("Add MP3");
        /* JButton clearButton = new JButton("Clear");
        clearButton.setPreferredSize(buttonSize);
        buttonPanel.add(clearButton); */
        addMobileButton.setPreferredSize(buttonSize);
        addMP3Button.setPreferredSize(buttonSize);
        
        /// Adding both buttons to the last buttons panel
        buttonPanel.add(addMP3Button);
        buttonPanel.add(addMobileButton);
        
        /// Adding buttons panel to the main panel
        mainPanel.add(buttonPanel);

        /// Added padding to the main panel
        JPanel paddedPanel = new JPanel(new BorderLayout());
        paddedPanel.setBorder(new EmptyBorder(10, 10, 10, 10));
        paddedPanel.add(mainPanel, BorderLayout.CENTER);
        add(paddedPanel, BorderLayout.CENTER);

        // Listen if the user clicks the 'Add Mobile' button
        addMobileButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    ///Conversion to correct numerical data type
                    String inputModel = modelInputField.getText();
                    double inputPrice = Double.parseDouble(priceInputField.getText());
                    int inputWeight = Integer.parseInt(weightInputField.getText());
                    String inputSize = sizeInputField.getText();
                    int inputCredit = Integer.parseInt(creditInputField.getText());

                    ///Creatig a new Mobile object
                    Mobile mobile = new Mobile(inputModel, inputPrice, inputWeight, inputSize, inputCredit);
                    ///Adding Mobile to the Gadgets arraylist
                    gadgets.add(mobile);
                    /// Show success message
                    showMessage(null, "Mobile Added!","Sucess", JOptionPane.INFORMATION_MESSAGE);
                } catch (NumberFormatException ex) {
                    /// Show error message
                    showMessage(null, "Please enter valid numbers for price, weight, and calling credit.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        /// Listen if the user clicks the 'Add MP3' button
        addMP3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    ///Conversion to correct numerical data type
                    String inputModel = modelInputField.getText();
                    double inputPrice = Double.parseDouble(priceInputField.getText());
                    int inputWeight = Integer.parseInt(weightInputField.getText());
                    String inputSize = sizeInputField.getText();
                    int inputMemory = Integer.parseInt(memoryInputField.getText());

                    ///Creatig a new MP3 object
                    MP3 mp3 = new MP3(inputModel, inputPrice, inputWeight, inputSize, inputMemory);
                    ///Adding MP3 to the Gadgets arraylist
                    gadgets.add(mp3);
                    /// Show success message
                    showMessage(null, "MP3 Added!","Sucess", JOptionPane.INFORMATION_MESSAGE);
                } catch (NumberFormatException ex) {
                    /// Show error message
                    showMessage(null, "Please enter valid numbers for price, weight, and available memory.",  "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        // Listen if the user clicks the 'Make Call' button
        makeCallButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int displayNumber = getDisplayNumber();
                if (displayNumber != -1) {
                    Gadget gadget = gadgets.get(displayNumber);
                    if (gadget instanceof Mobile) {
                        Mobile mobile = (Mobile) gadget;
                        //String phoneNumber = phoneInputField.getText();
                        int duration;
                        try {
                            duration = Integer.parseInt(durationInputField.getText());
                            int phoneNumber = Integer.parseInt(phoneInputField.getText());
                            boolean result = mobile.makeCall(phoneNumber, duration);
                            if(result){
                                int remainingCredits = mobile.getCallingCredit();
                                showMessage(null, "Call made successfully. Available credits: "+remainingCredits, "Success", JOptionPane.INFORMATION_MESSAGE);
                            }else{
                                int remainingCredits = mobile.getCallingCredit();
                                showMessage(null, "Insufficient credit to make the call. Available credits: "+remainingCredits, "Warning", JOptionPane.WARNING_MESSAGE);
                            }
                        } catch (NumberFormatException ex) {
                            showMessage(null, "Error: Duration/ Phone number must be an integer.", "Invalid Input", JOptionPane.ERROR_MESSAGE);
                        }
                    } else {
                        showMessage(null, "Error: The selected gadget is not a mobile.", "Invalid Operation", JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
        });

        // Listen if the user clicks the 'Download Music' button
        downloadMusicButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int displayNumber = getDisplayNumber();
                if (displayNumber != -1){
                    Gadget gadget = gadgets.get(displayNumber);
                    try {
                        if (gadget instanceof MP3) {
                            MP3 mp3 = (MP3) gadget;
                            int downloadSize = Integer.parseInt(downloadSizeInputField.getText());
                            boolean musicDownloaded = false;
                            
                            musicDownloaded=mp3.downloadMusic(downloadSize);
                       
                            if(musicDownloaded){
                                int availableMemory = mp3.getAvailableMemory();
                                showMessage(null, "MP3 Downloaded. Available memory: "+availableMemory, "Success", JOptionPane.INFORMATION_MESSAGE);
                            }else{int availableMemory = mp3.getAvailableMemory();
                                showMessage(null, "No space left to download. Available memory: "+availableMemory, "Success", JOptionPane.WARNING_MESSAGE);
                            }
                            
                        } else{
                            showMessage(null, "Error: The selected gadget is not a MP3.", "Invalid Operation", JOptionPane.ERROR_MESSAGE);
                        }
    
                        /* if (!musicDownloaded) {
                            showMessage(null, "No MP3 player found to download music.", "Invalid Operation", JOptionPane.ERROR_MESSAGE);
                        } */
                    } catch (NumberFormatException ex) {
                        showMessage(null, "Please enter a valid number for download size.", "Invalid Operation", JOptionPane.ERROR_MESSAGE);
                    }
                } /* else {
                    showMessage(null, "No MP3 Gadget found with id:"+displayNumberInputField.getText(), "Item not fount", JOptionPane.WARNING_MESSAGE);
                } */
            }
        });

        /// Action when display all button is pressed
        displayAllButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                StringBuilder gadgetDetails = new StringBuilder();
                if(gadgets.size()==0){
                    /// Show a message if the list is empty
                    gadgetDetails.append("There are no items to display").append("\n");
                }
                for (Gadget gadget : gadgets) {
                    /// Get display number to display
                    int index = getDisplayNumberFogGadget(gadget);
                    //int index = Integer.parseInt(displayNumber);
                    gadget.display(index);
                    
                    /// Display all info
                    gadgetDetails.append("Display Number: ").append(index+1).append("\n");
                    gadgetDetails.append("Model: ").append(gadget.getModel()).append("\n");
                    gadgetDetails.append("Price: £").append(gadget.getPrice()).append("\n");
                    gadgetDetails.append("Weight: ").append(gadget.getWeight()).append(" grams\n");
                    gadgetDetails.append("Size: ").append(gadget.getSize()).append("\n");

                    /// Display info based on gadget type
                    if (gadget instanceof MP3) {
                        MP3 mp3 = (MP3) gadget;
                        gadgetDetails.append("Available Memory: ").append(mp3.getAvailableMemory()).append(" MB\n");
                    }
                    else if (gadget instanceof Mobile) {
                        Mobile mobile = (Mobile) gadget;
                        gadgetDetails.append("Calling Credit: ").append(mobile.getCallingCredit()).append(" mins\n");
                    }

                    gadgetDetails.append("\n");
                }
                showMessage(null, gadgetDetails.toString(), "All Gadgets", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        /// Action to be done clear button is pressed
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                /// Clear all fields
                modelInputField.setText("");
                priceInputField.setText("");
                weightInputField.setText("");
                sizeInputField.setText("");
                creditInputField.setText("");
                memoryInputField.setText("");
                phoneInputField.setText("");
                durationInputField.setText("");
                downloadSizeInputField.setText("");
                displayNumberInputField.setText("");
            }
        });
        /// Display panel window
        setVisible(true);
    }

    public int getDisplayNumber() {
        int displayNumber = -1;
        try {
            /// We're calculating display numbers starting from 1
            displayNumber = Integer.parseInt(displayNumberInputField.getText())-1;
            if (!(displayNumber>=0 && displayNumber<gadgets.size())) {
                showMessage(this, "Error: Gadget with this display number is not present.", "Invalid Input", JOptionPane.ERROR_MESSAGE);
                displayNumber = -1;
            }
        } catch (NumberFormatException e) {
            showMessage(this, "Error: Display number must be an integer.", "Invalid Input", JOptionPane.ERROR_MESSAGE);
        }
        return displayNumber;
    }

    public int getDisplayNumberFogGadget(Gadget gadget) {
        try {
            return gadgets.indexOf(gadget);
        } catch (NumberFormatException e) {
            showMessage(this, "Something went wrong while fetching display number", "Error", JOptionPane.ERROR_MESSAGE);
            return gadgets.indexOf(gadget);
        }
    }
    

    /* public int getDisplayNumber(int val) {
        if(val>0 && val<=gadgets.size()){
            return val;
        }else{
            return -1;
        }
    } */

    public void showMessage(Component component, String message, String title, int messageType){
        JOptionPane.showMessageDialog(this, message, title, messageType);
    }

    public static void main(String[] args) {
        new GadgetShop();
    }
}
