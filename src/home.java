import javax.swing.*;
import javax.swing.border.EmptyBorder;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeCellRenderer;
import javax.swing.tree.*;
import java.util.HashMap;
import java.util.Map;


public class home extends JFrame {
    private CardLayout cardLayout;
    private JPanel mainPanel;

    public home() {
        setTitle("EcoChef");
        setMinimumSize(new Dimension(920, 800));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ImageIcon icon = new ImageIcon("img/Recycling_sign_green.png");
        setIconImage(icon.getImage()); // need to fix

        cardLayout = new CardLayout();
        mainPanel = new JPanel(cardLayout);

        // Create the home page
        JPanel homePanel = createhomePanel();
        mainPanel.add(homePanel, "Home");

        // Create the appliances page
        JPanel appliancesPanel = createAppliancesPanel();
        mainPanel.add(appliancesPanel, "Appliances");

        // Create the go eco-friendly page
        JPanel goEcoFriendlyPanel = createGoEcoFriendlyPanel();
        mainPanel.add(goEcoFriendlyPanel, "Go Eco-Friendly");

        // Add the main panel to the frame
        add(mainPanel, BorderLayout.CENTER);

        // Create the navigation panel with buttons
        JPanel navigationPanel = createNavigationPanel();
        add(navigationPanel, BorderLayout.NORTH);

        // Show the frame
        setVisible(true);
    }

    private JPanel createhomePanel() {
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        // Create the label for the title
        JLabel lblTitle = new JLabel("EcoChef");
        lblTitle.setFont(new Font("Segoe Script", Font.PLAIN, 57));
        lblTitle.setForeground(new Color(255, 255, 255));
        lblTitle.setHorizontalAlignment(JLabel.CENTER);

        // Create the label for the welcome message
        JLabel lblWelcome = new JLabel("Welcome!");
        lblWelcome.setFont(new Font("Yu Gothic Medium", Font.BOLD, 60)); // Example
        lblWelcome.setHorizontalAlignment(JLabel.CENTER);

        // Create the label for the in-between text
        JLabel lblInBetweenText = new JLabel("<html><body>Eco-friendly energy is becoming increasingly important in the modern world.<br><br>"
        		+ "Using EcoChef allows you to chose eco-friendly appliances.<br><br>"
        		+"We want to help you save money and energy.</body></html>");
        lblInBetweenText.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 25));
        lblInBetweenText.setHorizontalAlignment(JLabel.CENTER);
      

        // Create the label for the additional text
        JLabel lblAdditionalText = new JLabel("<html><body>Did you know?<br><br>"
        		+"Bright Idea: Did you know that switching to LED bulbs can save you nearly $3 billion per year on utility bills across the United States? Plus, LEDs last 25 times longer than traditional incandescent bulbs!<br><br>"
        		+ "Energy Star Saves: Appliances with the Energy Star label can save families hundreds of dollars a year on utility bills. For example, an Energy Star fridge uses 35% less electricity than a standard model!<br><br>"
        		+ "Cool Savings: Using Energy Star-labeled heat pumps and air conditioners can cut your energy bills by $160 or more annually. They’re efficient and environmentally friendly!<br><br>"
        		+ "Healthy home: Implementing energy efficiency measures in your home can improve indoor air quality, reducing respiratory illnesses and creating a healthier living environment.<br><br>"
        		+ "Power Saver: Hunting down \"energy vampires\"—devices that consume power even when turned off—can save you money. Unplugging or using smart power strips helps eliminate this waste.<br><br>"
        		+ "Weatherize for Comfort: Sealing drafts and adding insulation can dramatically improve your home’s energy efficiency, keeping it cooler in the summer and warmer in the winter while saving on energy bills.</body></html>");
        lblAdditionalText.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 15));
        lblAdditionalText.setHorizontalAlignment(JLabel.CENTER);
        lblAdditionalText.setVerticalAlignment(JLabel.TOP); // fix for text getting cut off
        

        // Create a panel to hold the welcome message, in-between text, and additional text
        JPanel textPanel = new JPanel();
        textPanel.setLayout(new GridLayout(3, 1, 10, 20)); // added 20 pixel bottom margin
        textPanel.setBackground(new Color(0, 204, 0)); // Match the overall theme

        // Add the welcome message, in-between text, and additional text to the text panel
        textPanel.add(lblWelcome);
        textPanel.add(lblInBetweenText);
        textPanel.add(lblAdditionalText);

        // Add the title and text panels to the main panel
        panel.add(lblTitle, BorderLayout.NORTH);
        panel.add(textPanel, BorderLayout.CENTER);

        // Set the background color of the panel
        panel.setBackground(new Color(0, 204, 0));

        return panel;
    }

    private JPanel createAppliancesPanel() {
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        // Create the title label
        JLabel titleLabel = new JLabel("Appliances");
        titleLabel.setFont(new Font("Segoe Script", Font.PLAIN, 57));
        titleLabel.setForeground(Color.WHITE);
        titleLabel.setHorizontalAlignment(JLabel.CENTER);

        // Create the subtitle label
        JLabel subtitleLabel = new JLabel("Your guide to energy-efficient choices");
        subtitleLabel.setFont(new Font("Yu Gothic Medium", Font.BOLD, 45));
        subtitleLabel.setHorizontalAlignment(JLabel.CENTER);

        // Create a panel to hold both the title and subtitle
        JPanel titlePanel = new JPanel();
        titlePanel.setLayout(new GridLayout(2, 1));
        titlePanel.setBackground(new Color(0, 204, 0));

        // Add the title and subtitle to the title panel
        titlePanel.add(titleLabel);
        titlePanel.add(subtitleLabel);

        // Add the title panel to the top of the main panel
        panel.add(titlePanel, BorderLayout.NORTH);

        // Create the "Choose Your Appliance" label
        JLabel chooseLabel = new JLabel("Choose Your Appliance");
        chooseLabel.setFont(new Font("Yu Gothic Medium", Font.BOLD, 20));
        chooseLabel.setHorizontalAlignment(JLabel.CENTER);

        // Create the root node
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Appliances");

        // Create the main category nodes
        DefaultMutableTreeNode deepFryers = new DefaultMutableTreeNode("Deep Fryers");
        DefaultMutableTreeNode dishwashers = new DefaultMutableTreeNode("Dishwashers");
        DefaultMutableTreeNode freezers = new DefaultMutableTreeNode("Freezers");
        DefaultMutableTreeNode fridges = new DefaultMutableTreeNode("Fridges");
        DefaultMutableTreeNode grills = new DefaultMutableTreeNode("Grills");
        DefaultMutableTreeNode ovens = new DefaultMutableTreeNode("Ovens");
        DefaultMutableTreeNode steamTables = new DefaultMutableTreeNode("Steam Tables");
        DefaultMutableTreeNode stoveTops = new DefaultMutableTreeNode("Stove Tops");

        // Add main category nodes to the root
        root.add(deepFryers);
        root.add(dishwashers);
        root.add(freezers);
        root.add(fridges);
        root.add(grills);
        root.add(ovens);
        root.add(steamTables);
        root.add(stoveTops);

        // Create a map to hold resized icons
        Map<String, Icon> iconMap = new HashMap<>();
        iconMap.put("Appliances", ImageResizer.resizeIcon(new ImageIcon("img/home.png"), 16, 16));
        iconMap.put("Deep Fryers", ImageResizer.resizeIcon(new ImageIcon("img/deepFryer.png"), 16, 16));
        iconMap.put("Dishwashers", ImageResizer.resizeIcon(new ImageIcon("img/dishwasher.png"), 16, 16));
        iconMap.put("Freezers", ImageResizer.resizeIcon(new ImageIcon("img/freezer.png"), 16, 16));
        iconMap.put("Fridges", ImageResizer.resizeIcon(new ImageIcon("img/fridge.png"), 16, 16));
        iconMap.put("Grills", ImageResizer.resizeIcon(new ImageIcon("img/girll.png"), 16, 16));
        iconMap.put("Ovens", ImageResizer.resizeIcon(new ImageIcon("img/oven.jpg"), 16, 16));
        iconMap.put("Steam Tables", ImageResizer.resizeIcon(new ImageIcon("img/steam table.png"), 16, 16));
        iconMap.put("Stove Tops", ImageResizer.resizeIcon(new ImageIcon("img/stop top.png"), 16, 16));

        // Create the tree by passing in the root node
        JTree tree = new JTree(root);

        // Create a custom renderer to set different icons for each node
        tree.setCellRenderer(new DefaultTreeCellRenderer() {
            @Override
            public Component getTreeCellRendererComponent(JTree tree, Object value, boolean selected, boolean expanded, boolean leaf, int row, boolean hasFocus) {
                Component c = super.getTreeCellRendererComponent(tree, value, selected, expanded, leaf, row, hasFocus);
                DefaultMutableTreeNode node = (DefaultMutableTreeNode) value;
                Object nodeInfo = node.getUserObject();
                if (nodeInfo instanceof String) {
                    String nodeName = (String) nodeInfo;
                    setIcon(iconMap.getOrDefault(nodeName, UIManager.getIcon("Tree.leafIcon")));
                }
                return c;
            }
        });

        // Create a scroll pane to hold the tree
        JScrollPane treeScrollPane = new JScrollPane(tree);
        treeScrollPane.setPreferredSize(new Dimension(200, 250)); // Adjust the width and height as needed

        // Create a panel to hold the chooseLabel and the treeScrollPane
        JPanel treePanel = new JPanel();
        treePanel.setLayout(new BorderLayout());
        treePanel.add(chooseLabel, BorderLayout.NORTH);
        treePanel.add(treeScrollPane, BorderLayout.CENTER);
        panel.setBorder(new EmptyBorder(10, 20, 10, 10)); // Add margin to the left
        

        // Add the treePanel to the left side of the main panel
        panel.add(treePanel, BorderLayout.WEST);
        treePanel.setPreferredSize(new Dimension(300, 100));
        
        

        // Set the background color for the main panel
        panel.setBackground(new Color(0, 204, 0));

        return panel;
    }

    private JPanel createGoEcoFriendlyPanel() {
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        // Create the label for the title
        JLabel label = new JLabel("Eco-Friendly Options");
        label.setFont(new Font("Segoe Script", Font.PLAIN, 57)); // Match the font and size of "EcoChef"
        label.setForeground(new Color(255, 255, 255)); // Match the font color of "EcoChef"
        label.setHorizontalAlignment(JLabel.CENTER);

        // Add the label to the top of the panel
        panel.add(label, BorderLayout.NORTH);

        // Set the background color
        panel.setBackground(new Color(0, 204, 0));

        return panel;
    }

    private JPanel createNavigationPanel() {
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(1, 3, 10, 10)); // added spacing

        // Create the buttons
        JButton homeButton = new JButton("Home");
        JButton appliancesButton = new JButton("Appliances");
        JButton goEcoFriendlyButton = new JButton("Go Eco-Friendly");

        // Set background color to white
        homeButton.setBackground(Color.WHITE);
        appliancesButton.setBackground(Color.WHITE);
        goEcoFriendlyButton.setBackground(Color.WHITE);

        // Set button font and size
        homeButton.setFont(new Font("Arial", Font.PLAIN, 18));
        appliancesButton.setFont(new Font("Arial", Font.PLAIN, 18));
        goEcoFriendlyButton.setFont(new Font("Arial", Font.PLAIN, 18));

        // Add action listeners to the buttons
        homeButton.addActionListener(e -> cardLayout.show(mainPanel, "Home"));
        appliancesButton.addActionListener(e -> cardLayout.show(mainPanel, "Appliances"));
        goEcoFriendlyButton.addActionListener(e -> cardLayout.show(mainPanel, "Go Eco-Friendly"));

        // Add the buttons to the panel
        panel.add(homeButton);
        panel.add(appliancesButton);
        panel.add(goEcoFriendlyButton);

        return panel;
    }
    
    public class ImageResizer {

        public static ImageIcon resizeIcon(ImageIcon icon, int width, int height) {
            Image img = icon.getImage();
            Image resizedImg = img.getScaledInstance(width, height, Image.SCALE_SMOOTH);
            return new ImageIcon(resizedImg);
        }
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(home::new);
    }
}