package GUI;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUIWindow {
    public GUIWindow(){

    }

    public static void main(String[] args) {

        JFrame startWindow = new JFrame();

        var l1=new JLabel("Game Shop");

        l1.setBounds(150,50, 100,30);
        JButton userbtn = new JButton("User");
        userbtn.setBounds(100, 100, 200, 40);

        JButton adminbtn = new JButton("Administrator");
        adminbtn.setBounds(100, 200, 200, 40);

        adminbtn.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                System.out.print("Admin btn clicked\n");
                startWindow.dispose();
                JFrame adminWindow = new JFrame();
                adminWindowSetup(adminWindow);

            }
        });
        userbtn.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                startWindow.dispose();
                JFrame userWindow = new JFrame();
                userWindowSetup(userWindow);
            }
        });
        startWindow.add(userbtn);
        startWindow.add(adminbtn);
        startWindow.add(l1);
        startWindow.setSize(400, 500);//400 width and 500 height
        startWindow.setLayout(null);//using no layout managers
        startWindow.setVisible(true);//making the frame visible


    }

    public static void userWindowSetup(JFrame f){


        var userTitleLabel=new JLabel("User ");
        userTitleLabel.setBounds(150,50, 100,30);
        f.add(userTitleLabel);

        var usernameLabel=new JLabel("Enter username: ");
        usernameLabel.setBounds(25,100, 200,30);
        f.add(usernameLabel);

        var usernameield=new JTextField("");
        usernameield.setBounds(200,100, 200,30);
        f.add(usernameield);

        JButton buyBTN = new JButton("Buy");
        buyBTN.setBounds(25, 650, 200, 40);

        buyBTN.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                System.out.println("Add buy btn clicked");
            }
        });
        f.add(buyBTN);

        var comboLabel =new JLabel("Select: ");
        comboLabel.setBounds(25,150, 200,30);
        f.add(comboLabel);

        String country[]={"India","Aus","U.S.A","England","Newzealand"};
        var  selectCoboBox =new JComboBox(country);
        selectCoboBox.setBounds(200, 150,90,20);
        f.add(selectCoboBox);

        f.setSize(800, 750);//400 width and 500 height
        f.setLayout(null);//using no layout managers
        f.setVisible(true);//making the frame visible

    }

    public static void adminWindowSetup(JFrame f){

        var userTitleLabel=new JLabel("Admin ");
        userTitleLabel.setBounds(150,50, 100,30);
        f.add(userTitleLabel);

        var addGameLabel = new JLabel("Add a game ");
        addGameLabel.setBounds(25,100, 200,30);
        f.add(addGameLabel);


        var priceLabel = new JLabel("Price:");
        priceLabel.setBounds(25,150, 200,30);
        f.add(priceLabel);

        var priceField=new JTextField("");
        priceField.setBounds(200,150, 200,30);
        f.add(priceField);


        var titleLabel = new JLabel("Title:");
        titleLabel.setBounds(25,200, 200,30);
        f.add(titleLabel);

        var titleField=new JTextField("");
        titleField.setBounds(200,200, 200,30);
        f.add(titleField);


        var descriptionLabel = new JLabel("Description:");
        descriptionLabel.setBounds(25,250, 200,30);
        f.add(descriptionLabel);

        var descriptionField=new JTextField("");
        descriptionField.setBounds(200,250, 200,30);
        f.add(descriptionField);


        var developerLabel = new JLabel("Developer:");
        developerLabel.setBounds(25,300, 200,30);
        f.add(developerLabel);

        var developerField=new JTextField("");
        developerField.setBounds(200,300, 200,30);
        f.add(developerField);


        var typeLabel = new JLabel("Type:");
        typeLabel.setBounds(25,350, 200,30);
        f.add(typeLabel);

        var typeLField=new JTextField("");
        typeLField.setBounds(200,350, 200,30);
        f.add(typeLField);


        var reviewsLabel = new JLabel("Reviews:");
        reviewsLabel.setBounds(25,400, 200,30);
        f.add(reviewsLabel);

        var reviewsField=new JTextField("");
        reviewsField.setBounds(200,400, 200,30);
        f.add(reviewsField);


        var platformLabel = new JLabel("Patform:");
        platformLabel.setBounds(25,450, 200,30);
        f.add(platformLabel);

        var platformField=new JTextField("");
        platformField.setBounds(200,450, 200,30);
        f.add(platformField);


        var sizeLabel = new JLabel("Size:");
        sizeLabel.setBounds(25,500, 200,30);
        f.add(sizeLabel);

        var sizeField=new JTextField("");
        sizeField.setBounds(200,500, 200,30);
        f.add(sizeField);


        var DigitalPlatformLabel = new JLabel("Digital Platform:");
        DigitalPlatformLabel.setBounds(25,550, 200,30);
        f.add(DigitalPlatformLabel);

        var DigitalPlatformField=new JTextField("");
        DigitalPlatformField.setBounds(200,550, 200,30);
        f.add(DigitalPlatformField);


        var numberDisksLabel = new JLabel("Number of disks:" );
        numberDisksLabel.setBounds(25,600, 200,30);
        f.add(numberDisksLabel);


        var numberDisksField=new JTextField("");
        numberDisksField.setBounds(200,600, 200,30);
        f.add(numberDisksField);


        JButton addGameBTN = new JButton("Add Game");
        addGameBTN.setBounds(25, 650, 200, 40);

        addGameBTN.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                System.out.println("Add game btn clicked");
            }
        });

        f.add(addGameBTN);

        /// add CPU
        var addCpuLabel = new JLabel("Add CPU");
        addCpuLabel.setBounds(500,100, 200,30);
        f.add(addCpuLabel);



        var cpupriceLabel = new JLabel("Price:");
        cpupriceLabel.setBounds(525,150, 200,30);
        f.add(cpupriceLabel);

        var cpupriceField=new JTextField("");
        cpupriceField.setBounds(700,150, 200,30);
        f.add(cpupriceField);


        var cputitleLabel = new JLabel("Title:");
        cputitleLabel.setBounds(525,200, 200,30);
        f.add(cputitleLabel);

        var cputitleField=new JTextField("");
        cputitleField.setBounds(700,200, 200,30);
        f.add(cputitleField);


        var cpudescriptionLabel = new JLabel("Description:");
        cpudescriptionLabel.setBounds(525,250, 200,30);
        f.add(cpudescriptionLabel);

        var cpudescriptionField=new JTextField("");
        cpudescriptionField.setBounds(700,250, 200,30);
        f.add(cpudescriptionField);


        var cpupowerConsumptionlabel = new JLabel("Power Consumption:");
        cpupowerConsumptionlabel.setBounds(525,300, 200,30);
        f.add(cpupowerConsumptionlabel);

        var cpupowerConsumptionField=new JTextField("");
        cpupowerConsumptionField.setBounds(700,300, 200,30);
        f.add(cpupowerConsumptionField);


        var cpuboxSizeLabel = new JLabel("Box Size:");
        cpuboxSizeLabel.setBounds(525,350, 200,30);
        f.add(cpuboxSizeLabel);

        var cpuboxSizeField=new JTextField("");
        cpuboxSizeField.setBounds(700,350, 200,30);
        f.add(cpuboxSizeField);


        var cpunumberOfCoresLabel = new JLabel("Number of Cores:");
        cpunumberOfCoresLabel.setBounds(525,400, 200,30);
        f.add(cpunumberOfCoresLabel);

        var cpunumberOfCoresField=new JTextField("");
        cpunumberOfCoresField.setBounds(700,400, 200,30);
        f.add(cpunumberOfCoresField);


        var frecuencyLabel = new JLabel("Frequency:");
        frecuencyLabel.setBounds(525,450, 200,30);
        f.add(frecuencyLabel);

        var frecuencyLField=new JTextField("");
        frecuencyLField.setBounds(700,450, 200,30);
        f.add(frecuencyLField);


        var socketLabel = new JLabel("Socket:");
        socketLabel.setBounds(525,500, 200,30);
        f.add(socketLabel);

        var socketField=new JTextField("");
        socketField.setBounds(700,500, 200,30);
        f.add(socketField);

        JButton addCPUBTN = new JButton("Add CPU");
        addCPUBTN.setBounds(700, 650, 200, 40);
        addCPUBTN.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                System.out.println("Add CPU btn clicked");
            }
        });

        f.add(addCPUBTN);



        var addUserLabel = new JLabel("Add User");
        addUserLabel.setBounds(1000,100, 200,30);
        f.add(addUserLabel);

        var userUsernameLabel = new JLabel("Username");
        userUsernameLabel.setBounds(1000,150, 200,30);
        f.add(userUsernameLabel);

        var userUsernameField = new JTextField(" ");
        userUsernameField.setBounds(1125,150, 200,30);
        f.add(userUsernameField);


        JButton addUserBTN = new JButton("Add User");
        addUserBTN.setBounds(1125, 650, 200, 40);
        addUserBTN.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                System.out.println("Add User btn clicked");
            }
        });

        f.add(addUserBTN);


        var removeDBLabel = new JLabel("Remove from DB");
        removeDBLabel.setBounds(1425,100, 200,30);
        f.add(removeDBLabel);

        var selectWhatToRemoveLabel = new JLabel("Select: ");
        selectWhatToRemoveLabel.setBounds(1425,150, 200,30);
        f.add(selectWhatToRemoveLabel);

        String country[]={"India","Aus","U.S.A","England","Newzealand"};
        var  removeComboBox =new JComboBox(country);
        removeComboBox.setBounds(1550, 150,90,20);
        f.add(removeComboBox);

        JButton removeDBBTN = new JButton("Remove");
        removeDBBTN.setBounds(1425, 650, 200, 40);
        removeDBBTN.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                System.out.println("Add Remove DB btn clicked");
            }
        });

        f.add(removeDBBTN);

        f.setSize(1920, 800);//400 width and 500 height
        f.setLayout(null);//using no layout managers
        f.setVisible(true);//making the frame visible
    }
}
