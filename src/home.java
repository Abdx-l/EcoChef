import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeCellRenderer;
import javax.swing.tree.*;
import java.util.HashMap;
import java.util.Map;


public class home extends JFrame {
    private CardLayout cardLayout;
    private JPanel mainPanel;
    private JPanel detailsPanel;
    private JTree tree;
    private JSplitPane splitPane; 

    public home() {
        setTitle("EcoChef");
        setMinimumSize(new Dimension(920, 800));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ImageIcon icon = new ImageIcon("img/Recycling_sign_green.png");
        setIconImage(icon.getImage());

        cardLayout = new CardLayout();
        mainPanel = new JPanel(cardLayout);

        JPanel homePanel = createhomePanel();
        mainPanel.add(homePanel, "Home");

        JPanel appliancesPanel = createAppliancesPanel();
        mainPanel.add(appliancesPanel, "Appliances");

        add(mainPanel, BorderLayout.CENTER);

        JPanel navigationPanel = createNavigationPanel();
        add(navigationPanel, BorderLayout.NORTH);

        setVisible(true);
    }

    private JPanel createhomePanel() {
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        JLabel lblTitle = new JLabel("EcoChef");
        lblTitle.setFont(new Font("Segoe Script", Font.PLAIN, 57));
        lblTitle.setForeground(new Color(255, 255, 255));
        lblTitle.setHorizontalAlignment(JLabel.CENTER);

        JLabel lblWelcome = new JLabel("Welcome!");
        lblWelcome.setFont(new Font("Yu Gothic Medium", Font.BOLD, 60));
        lblWelcome.setHorizontalAlignment(JLabel.CENTER);

        JLabel lblInBetweenText = new JLabel("<html><body>Eco-friendly energy is becoming increasingly important in the modern world.<br><br>"
                + "Using EcoChef allows you to chose eco-friendly appliances.<br><br>"
                + "We want to help you save money and energy.</body></html>");
        lblInBetweenText.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 25));
        lblInBetweenText.setHorizontalAlignment(JLabel.CENTER);

        JLabel lblAdditionalText = new JLabel("<html><body>Did you know?<br><br>"
                + "Bright Idea: Did you know that switching to LED bulbs can save you nearly $3 billion per year on utility bills across the United States? Plus, LEDs last 25 times longer than traditional incandescent bulbs!<br><br>"
                + "Energy Star Saves: Appliances with the Energy Star label can save families hundreds of dollars a year on utility bills. For example, an Energy Star fridge uses 35% less electricity than a standard model!<br><br>"
                + "Cool Savings: Using Energy Star-labeled heat pumps and air conditioners can cut your energy bills by $160 or more annually. They’re efficient and environmentally friendly!<br><br>"
                + "Healthy home: Implementing energy efficiency measures in your home can improve indoor air quality, reducing respiratory illnesses and creating a healthier living environment.<br><br>"
                + "Power Saver: Hunting down \"energy vampires\"—devices that consume power even when turned off—can save you money. Unplugging or using smart power strips helps eliminate this waste.<br><br>"
                + "Weatherize for Comfort: Sealing drafts and adding insulation can dramatically improve your home’s energy efficiency, keeping it cooler in the summer and warmer in the winter while saving on energy bills.</body></html>");
        lblAdditionalText.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 15));
        lblAdditionalText.setHorizontalAlignment(JLabel.CENTER);
        lblAdditionalText.setVerticalAlignment(JLabel.TOP);

        JPanel textPanel = new JPanel();
        textPanel.setLayout(new GridLayout(3, 1, 10, 20));
        textPanel.setBackground(new Color(0, 204, 0));

        textPanel.add(lblWelcome);
        textPanel.add(lblInBetweenText);
        textPanel.add(lblAdditionalText);

        panel.add(lblTitle, BorderLayout.NORTH);
        panel.add(textPanel, BorderLayout.CENTER);

        panel.setBackground(new Color(0, 204, 0));

        return panel;
    }

    private JPanel createAppliancesPanel() {
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        JLabel titleLabel = new JLabel("Appliances");
        titleLabel.setFont(new Font("Segoe Script", Font.PLAIN, 57));
        titleLabel.setForeground(Color.WHITE);
        titleLabel.setHorizontalAlignment(JLabel.CENTER);

        JLabel subtitleLabel = new JLabel("Your guide to energy-efficient choices");
        subtitleLabel.setFont(new Font("Yu Gothic Medium", Font.BOLD, 45));
        subtitleLabel.setHorizontalAlignment(JLabel.CENTER);

        JPanel titlePanel = new JPanel();
        titlePanel.setLayout(new GridLayout(2, 1));
        titlePanel.setBackground(new Color(0, 204, 0));

        titlePanel.add(titleLabel);
        titlePanel.add(subtitleLabel);

        panel.add(titlePanel, BorderLayout.NORTH);

        JLabel chooseLabel = new JLabel("Choose Your Appliance");
        chooseLabel.setFont(new Font("Yu Gothic Medium", Font.BOLD, 20));
        chooseLabel.setHorizontalAlignment(JLabel.CENTER);

        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Appliances");

        DefaultMutableTreeNode deepFryers = new DefaultMutableTreeNode("Deep Fryers");
        DefaultMutableTreeNode dishwashers = new DefaultMutableTreeNode("Dishwashers");
        DefaultMutableTreeNode fridges = new DefaultMutableTreeNode("Fridges");
        DefaultMutableTreeNode grills = new DefaultMutableTreeNode("Grills");
        DefaultMutableTreeNode ovens = new DefaultMutableTreeNode("Ovens");
        DefaultMutableTreeNode steamTables = new DefaultMutableTreeNode("Steam Tables");
        DefaultMutableTreeNode stoveTops = new DefaultMutableTreeNode("Stove Tops");

        root.add(deepFryers);
        root.add(dishwashers);
        root.add(fridges);
        root.add(grills);
        root.add(ovens);
        root.add(steamTables);
        root.add(stoveTops);

        deepFryers.add(new DefaultMutableTreeNode(new DeepFryer("Breville BDF500XL Smart Fryer",1.8,299,9,4)));
        deepFryers.add(new DefaultMutableTreeNode(new DeepFryer("T-Fal FR8000",1.8,169,8,4)));
        deepFryers.add(new DefaultMutableTreeNode(new DeepFryer("DeLonghi D34528DZ",1.8,199,8,4)));
        deepFryers.add(new DefaultMutableTreeNode(new DeepFryer("Hamilton Beach 35021",1.7,129,8,5)));
        deepFryers.add(new DefaultMutableTreeNode(new DeepFryer("Cuisinart CDF-200P1",1.8,159,8,4)));

        dishwashers.add(new DefaultMutableTreeNode(new Dishwasher("Bosch 800 Series SHP878ZD5N",1.1,9,1499,16)));
        dishwashers.add(new DefaultMutableTreeNode(new Dishwasher("Miele G 7566 SCVi",1.1,9,2299,20)));
        dishwashers.add(new DefaultMutableTreeNode(new Dishwasher("KitchenAid KDTE334GPS",1.1,9,1399,14)));
        dishwashers.add(new DefaultMutableTreeNode(new Dishwasher("Samsung DW80R9950UG",1.1,8,1199,14)));
        dishwashers.add(new DefaultMutableTreeNode(new Dishwasher("Whirlpool WDT750SAKZ",1.1,8,999,12)));

        fridges.add(new DefaultMutableTreeNode(new Fridge("LG LFXS28968S",0.074,999,8,300)));
        fridges.add(new DefaultMutableTreeNode(new Fridge("Samsung RF28R7351SG",0.082,2099,9,330)));
        fridges.add(new DefaultMutableTreeNode(new Fridge("Bosch B36CL80ENS",0.068,3199,9,320)));
        fridges.add(new DefaultMutableTreeNode(new Fridge("GE Profile PYE22PSKSS",0.075,2299,8,250)));
        fridges.add(new DefaultMutableTreeNode(new Fridge("Whirlpool WRX735SDHZ",0.078,1799,8,300)));

        grills.add(new DefaultMutableTreeNode(new Grill("Weber Genesis II E-315",8.8,1299,8,450)));
        grills.add(new DefaultMutableTreeNode(new Grill("Napoleon Rogue 425",9.4,799,8,400)));
        grills.add(new DefaultMutableTreeNode(new Grill("Broil King Baron 490",11.7,899,8,425)));
        grills.add(new DefaultMutableTreeNode(new Grill("Char-Broil Performance 4-Burner",10.6,499,8,350)));
        grills.add(new DefaultMutableTreeNode(new Grill("George Foreman Indoor/Outdoor Grill",1.5,249,9,250)));

        ovens.add(new DefaultMutableTreeNode(new Oven("Bosch 800 Series HBL8453UC",3.6,2499,9,70)));
        ovens.add(new DefaultMutableTreeNode(new Oven("KitchenAid KODE500ESS",3.4,2299,9,60)));
        ovens.add(new DefaultMutableTreeNode(new Oven("Samsung NV51K7770DG",3.4,1899,8,600)));
        ovens.add(new DefaultMutableTreeNode(new Oven("GE Profile PT9050SFSS",3.7,2299,8,60)));
        ovens.add(new DefaultMutableTreeNode(new Oven("Whirlpool WOS51EC0HS",3.3,1699,8,60)));

        steamTables.add(new DefaultMutableTreeNode(new SteamTable("Carter-Hoffmann 3-Well Steam Table",2.5,1399,9,10)));
        steamTables.add(new DefaultMutableTreeNode(new SteamTable("Nemco 6000A 2-Well Steam Table",2.0,1199,8,8)));
        steamTables.add(new DefaultMutableTreeNode(new SteamTable("Vollrath 2-Well Steam Table",1.8,1099,8,8)));
        steamTables.add(new DefaultMutableTreeNode(new SteamTable("Star 3-Well Steam Table",2.2,1299,8,12)));
        steamTables.add(new DefaultMutableTreeNode(new SteamTable("Berkel 3-Well Steam Table",2.4,1499,8,12)));

        stoveTops.add(new DefaultMutableTreeNode(new StoveTop("Bosch 800",1.8,9,1499,4)));
        stoveTops.add(new DefaultMutableTreeNode(new StoveTop("Samsung",1.8,8,1199,4)));
        stoveTops.add(new DefaultMutableTreeNode(new StoveTop("KitchenAid KICU509XSS",1.8,8,1399,4)));
        stoveTops.add(new DefaultMutableTreeNode(new StoveTop("Wolf CI365C/S",1.8,9,2199,4)));
        stoveTops.add(new DefaultMutableTreeNode(new StoveTop("Frigidaire FGIC3067MB",1.8,8,1099,4)));

        Map<String, Icon> iconMap = new HashMap<>();
        iconMap.put("Appliances", ImageResizer.resizeIcon(new ImageIcon("img/home.png"), 16, 16));
        iconMap.put("Deep Fryers", ImageResizer.resizeIcon(new ImageIcon("img/deepFryer.png"), 16, 16));
        iconMap.put("Dishwashers", ImageResizer.resizeIcon(new ImageIcon("img/dishwasher.png"), 16, 16));
        iconMap.put("Fridges", ImageResizer.resizeIcon(new ImageIcon("img/fridge.png"), 16, 16));
        iconMap.put("Grills", ImageResizer.resizeIcon(new ImageIcon("img/girll.png"), 16, 16));
        iconMap.put("Ovens", ImageResizer.resizeIcon(new ImageIcon("img/oven.jpg"), 16, 16));
        iconMap.put("Steam Tables", ImageResizer.resizeIcon(new ImageIcon("img/steam table.png"), 16, 16));
        iconMap.put("Stove Tops", ImageResizer.resizeIcon(new ImageIcon("img/stop Top.png"), 16, 16));

        tree = new JTree(root);

        tree.setCellRenderer(new DefaultTreeCellRenderer() {
            @Override
            public Component getTreeCellRendererComponent(JTree tree, Object value, boolean selected, boolean expanded, boolean leaf, int row, boolean hasFocus) {
                Component c = super.getTreeCellRendererComponent(tree, value, selected, expanded, leaf, row, hasFocus);
                DefaultMutableTreeNode node = (DefaultMutableTreeNode) value;
                Object nodeInfo = node.getUserObject();
                if (nodeInfo instanceof String) {
                    String nodeName = (String) nodeInfo;
                    setIcon(iconMap.getOrDefault(nodeName, UIManager.getIcon("Tree.leafIcon")));
                    setText(nodeName);
                } else if (nodeInfo instanceof Appliance) {
                    setIcon(null);
                    setText(((Appliance) nodeInfo).getName());
                }
                return c;
            }
        });

        JScrollPane treeScrollPane = new JScrollPane(tree);
        treeScrollPane.setPreferredSize(new Dimension(200, 250));

        JPanel treePanel = new JPanel();
        treePanel.setLayout(new BorderLayout());
        treePanel.add(chooseLabel, BorderLayout.NORTH);
        treePanel.add(treeScrollPane, BorderLayout.CENTER);
        panel.setBorder(new EmptyBorder(10, 20, 10, 10));

        detailsPanel = new JPanel();
        detailsPanel.setLayout(new GridLayout(0, 1));
        detailsPanel.setBackground(new Color(0, 204, 0));
        detailsPanel.setVisible(false);
        splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, treePanel, detailsPanel);
        splitPane.setDividerLocation(300);
        panel.add(splitPane, BorderLayout.CENTER);

        tree.addTreeSelectionListener(new TreeSelectionListener() {
            @Override
            public void valueChanged(TreeSelectionEvent e) {
                DefaultMutableTreeNode selectedNode = (DefaultMutableTreeNode) tree.getLastSelectedPathComponent();
                if (selectedNode != null) {
                    Object nodeInfo = selectedNode.getUserObject();
                    if (nodeInfo instanceof Appliance) {
                        Appliance appliance = (Appliance) nodeInfo;
                        showApplianceDetails(appliance);
                        detailsPanel.setVisible(true);
                    }
                }
            }
        });

        return panel;
    }

    private JPanel createNavigationPanel() {
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(1, 3, 10, 10));

        JButton homeButton = new JButton("Home");
        JButton appliancesButton = new JButton("Appliances");

        homeButton.setBackground(Color.WHITE);
        appliancesButton.setBackground(Color.WHITE);

        homeButton.setFont(new Font("Arial", Font.PLAIN, 18));
        appliancesButton.setFont(new Font("Arial", Font.PLAIN, 18));

        homeButton.addActionListener(e -> cardLayout.show(mainPanel, "Home"));
        appliancesButton.addActionListener(e -> cardLayout.show(mainPanel, "Appliances"));

        panel.add(homeButton);
        panel.add(appliancesButton);

        return panel;
    }

    private void showApplianceDetails(Appliance appliance) {
        detailsPanel.removeAll();

        detailsPanel.add(new JLabel("Name: " + appliance.getName()));
        detailsPanel.add(new JLabel("Energy Consumption: " + appliance.getEnergyconsumed() + " KWH"));
        detailsPanel.add(new JLabel("Price: $" + appliance.getCost()));
        detailsPanel.add(new JLabel("Eco Rating: " + appliance.getEcorating()));

        if (appliance instanceof DeepFryer) {
            DeepFryer fryer = (DeepFryer) appliance;
            detailsPanel.add(new JLabel("Oil Capacity: " + fryer.getOilCapacity() + " liters"));
        } else if (appliance instanceof Dishwasher) {
            Dishwasher dishwasher = (Dishwasher) appliance;
            detailsPanel.add(new JLabel("Capacity: " + dishwasher.getCapacity() + " Place Settings"));
        } else if (appliance instanceof Fridge) {
            Fridge fridge = (Fridge) appliance;
            detailsPanel.add(new JLabel("Storage Capacity: " + fridge.getVolume() + " cubic feet"));
        } else if (appliance instanceof Grill) {
            Grill grill = (Grill) appliance;
            detailsPanel.add(new JLabel("Grilling Area: " + grill.getCookingArea() + " square inches"));
        } else if (appliance instanceof Oven) {
            Oven oven = (Oven) appliance;
            detailsPanel.add(new JLabel("Oven Capacity: " + oven.getCapacity() + " cubic feet"));
        } else if (appliance instanceof SteamTable) {
            SteamTable steamTable = (SteamTable) appliance;
            detailsPanel.add(new JLabel("Number of Pans: " + steamTable.getNumberOfPans()));
        } else if (appliance instanceof StoveTop) {
            StoveTop stoveTop = (StoveTop) appliance;
            detailsPanel.add(new JLabel("Number of Burners: " + stoveTop.getNumberOfBurners()));
        }

        detailsPanel.revalidate();
        detailsPanel.repaint();
    }

    private class ImageResizer {
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
