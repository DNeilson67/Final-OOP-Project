
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import java.net.URI;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Dashboard extends javax.swing.JFrame implements Utilities{

    /**
     * Creates new form Dashboard
     */
    public Dashboard() throws SQLException {
        com.formdev.flatlaf.FlatIntelliJLaf.install();
        setPreferredSize(new Dimension(1100,580));
        initComponents();
        cardLayout = (CardLayout) (mainPanel.getLayout());
        setResizable(false);
    }

    public void initComponents() throws SQLException {
        jSplitPane1 = new javax.swing.JSplitPane();
        Sidebar = new javax.swing.JPanel();
        logoSM = new javax.swing.JLabel();
        homeButton = new javax.swing.JButton();
        listButton = new javax.swing.JButton();
        revenueButton = new javax.swing.JButton();
        logoutButton = new javax.swing.JButton();
        mainPanel = new javax.swing.JPanel();
        homePanel = new javax.swing.JPanel();
        upperPanel = new javax.swing.JPanel();
        titleDashboard = new javax.swing.JLabel();
        subtitlePerformances = new javax.swing.JLabel();
        profitBox = new javax.swing.JPanel();
        profitLabel = new javax.swing.JLabel();
        earnedLabel = new javax.swing.JLabel();
        earnedNumberLabel = new javax.swing.JLabel();
        percentageLabel = new javax.swing.JLabel();
        allTimePerformanceLabel = new javax.swing.JLabel();
        profitBox2 = new javax.swing.JPanel();
        RemainingstocksLabel = new javax.swing.JLabel();
        totalWeightLabel = new javax.swing.JLabel();
        totalWeightNumberLabel = new javax.swing.JLabel();
        monthLabel = new javax.swing.JLabel();
        profitBox1 = new javax.swing.JPanel();
        soldJewelriesLabel = new javax.swing.JLabel();
        weightLabel = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        totalLabel = new javax.swing.JLabel();
        totalNumberLabel = new javax.swing.JLabel();
        profitGraphLabel = new javax.swing.JLabel();
        quickAccessPanel = new javax.swing.JPanel();
        addJewelriesButton = new javax.swing.JButton();
        soldJewelriesButton = new javax.swing.JButton();
        searchJewelriesButton = new javax.swing.JButton();
        settingsButton = new javax.swing.JButton();
        calculatorButton = new javax.swing.JButton();
        happyMasTitle = new javax.swing.JLabel();
        quickAccessLabel = new javax.swing.JLabel();
        profitGraphPanel = new javax.swing.JPanel();
        happyMasGraph = new javax.swing.JPanel();
        listPanel = new javax.swing.JPanel();
        jewelryListLabel = new javax.swing.JLabel();
        scrollPaneTable = new javax.swing.JScrollPane();
        tablePane = new javax.swing.JTable();
        earringCheckBox = new javax.swing.JCheckBox();
        braceletCheckBox = new javax.swing.JCheckBox();
        filteringLabel = new javax.swing.JLabel();
        ringCheckBox = new javax.swing.JCheckBox();
        necklaceCheckBox = new javax.swing.JCheckBox();
        pendantCheckBox = new javax.swing.JCheckBox();
        moreButton = new javax.swing.JButton();
        searchListButton = new javax.swing.JButton();
        removeListButton = new javax.swing.JButton();
        addListButton = new javax.swing.JButton();
        incomeStatementPanel = new javax.swing.JPanel();
        purchasesAndSalesButton = new javax.swing.JButton();
        incomeStatementInsidePanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        incomeStatementTable = new javax.swing.JTable();
        profitButton = new javax.swing.JButton();
        filterButton = new javax.swing.JButton();
        searchISButton = new javax.swing.JButton();
        incomeStatementLabel = new javax.swing.JLabel();
        purchasesAndSalesPanel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        purchasedJewelriesDataTable = new javax.swing.JTable();
        purchasedJewelriesDataLabel = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        soldJewelriesDataTable = new javax.swing.JTable();
        soldJewelriesDataLabel = new javax.swing.JLabel();
        purchasesAndSalesButton1 = new javax.swing.JButton();
        sellJewelriesButton = new javax.swing.JButton();
        buyJewelriesButton = new javax.swing.JButton();
        removePurchasedDataButton = new javax.swing.JButton();
        removeSoldJewelriesDataButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sumber Mas");
        setBackground(new java.awt.Color(204, 204, 204));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        Sidebar.setBackground(new java.awt.Color(255, 255, 255));

        logoSM.setIcon(new javax.swing.ImageIcon(getClass().getResource("Images/Proyek Baru (1).png"))); // NOI18N
        logoSM.setIconTextGap(0);

        homeButton.setForeground(new java.awt.Color(255, 255, 255));
        homeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("Images/icons8-home-64.png"))); // NOI18N
        homeButton.setAlignmentY(0.0F);
        homeButton.setBorder(null);
        homeButton.setIconTextGap(0);
        homeButton.setOpaque(true);

        listButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("Images/icons8-list-48.png"))); // NOI18N
        listButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(8, 8, 8, 8));

        revenueButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("Images/icons8-dollar-48.png"))); // NOI18N
        revenueButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(8, 8, 8, 8));

        logoutButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("Images/icons8-logout-48.png"))); // NOI18N
        logoutButton.setToolTipText("");
        logoutButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(8, 8, 8, 8));

        javax.swing.GroupLayout SidebarLayout = new javax.swing.GroupLayout(Sidebar);
        Sidebar.setLayout(SidebarLayout);
        SidebarLayout.setHorizontalGroup(
                SidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(revenueButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(homeButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(listButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(logoutButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(SidebarLayout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(logoSM)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        SidebarLayout.setVerticalGroup(
                SidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(SidebarLayout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(logoSM)
                                .addGap(104, 104, 104)
                                .addComponent(revenueButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(homeButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(listButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(logoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jSplitPane1.setLeftComponent(Sidebar);

        mainPanel.setLayout(new java.awt.CardLayout());

        homePanel.setEnabled(false);

        upperPanel.setBackground(new java.awt.Color(255, 255, 255));
        upperPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        upperPanel.setName(""); // NOI18N

        titleDashboard.setFont(new java.awt.Font("Inter", 1, 24)); // NOI18N
        titleDashboard.setText("Dashboard");

        subtitlePerformances.setFont(new java.awt.Font("Inter", 0, 14)); // NOI18N
        subtitlePerformances.setText("Performances");

        profitBox.setBackground(new java.awt.Color(0, 204, 51));

        profitLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        profitLabel.setText("PROFIT");

        earnedLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        earnedLabel.setText("EARNED");

        earnedNumberLabel.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        earnedNumberLabel.setText("IDR "+ String.valueOf(checkAllProfit(checkAllBuyPriceProfit(), checkAllSoldPriceProfit())));

        percentageLabel.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        percentageLabel.setText("All-time");
        System.out.println("buy price" + checkAllBuyPriceProfit());
        System.out.println("sell price" + checkAllSoldPriceProfit());
        System.out.println("profit" + checkAllProfit(checkAllBuyPriceProfit(), checkAllSoldPriceProfit()));
        System.out.println("percentage" + checkAllProfitPercentage(checkAllProfit(checkAllBuyPriceProfit(), checkAllSoldPriceProfit()),checkAllBuyPriceProfit()));
        javax.swing.GroupLayout profitBoxLayout = new javax.swing.GroupLayout(profitBox);
        profitBox.setLayout(profitBoxLayout);
        profitBoxLayout.setHorizontalGroup(
                profitBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(profitBoxLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(profitBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(profitBoxLayout.createSequentialGroup()
                                                .addGroup(profitBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(profitLabel)
                                                        .addComponent(percentageLabel))
                                                .addGap(0, 0, Short.MAX_VALUE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, profitBoxLayout.createSequentialGroup()
                                                .addGap(0, 172, Short.MAX_VALUE)
                                                .addGroup(profitBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(earnedNumberLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(earnedLabel, javax.swing.GroupLayout.Alignment.TRAILING))))
                                .addContainerGap())
        );
        profitBoxLayout.setVerticalGroup(
                profitBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(profitBoxLayout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(profitLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(percentageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35)
                                .addComponent(earnedLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(earnedNumberLabel)
                                .addGap(45, 45, 45))
        );

        allTimePerformanceLabel.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        allTimePerformanceLabel.setText("All time Performance");

        profitBox2.setBackground(new java.awt.Color(0, 204, 51));

        RemainingstocksLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        RemainingstocksLabel.setText("REMAINING STOCKS");

        totalWeightLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        totalWeightLabel.setText("Total Weight");

        totalWeightNumberLabel.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        totalWeightNumberLabel.setText(String.valueOf(checkRemainingStock()) + " gram");

        monthLabel.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        monthLabel.setText("All-time");

        javax.swing.GroupLayout profitBox2Layout = new javax.swing.GroupLayout(profitBox2);
        profitBox2.setLayout(profitBox2Layout);
        profitBox2Layout.setHorizontalGroup(
                profitBox2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(profitBox2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(profitBox2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, profitBox2Layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addGroup(profitBox2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(totalWeightLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(totalWeightNumberLabel, javax.swing.GroupLayout.Alignment.TRAILING)))
                                        .addGroup(profitBox2Layout.createSequentialGroup()
                                                .addGroup(profitBox2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(RemainingstocksLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(monthLabel))
                                                .addGap(0, 49, Short.MAX_VALUE)))
                                .addContainerGap())
        );
        profitBox2Layout.setVerticalGroup(
                profitBox2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(profitBox2Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(RemainingstocksLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(monthLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)
                                .addComponent(totalWeightLabel)
                                .addGap(5, 5, 5)
                                .addComponent(totalWeightNumberLabel)
                                .addContainerGap())
        );

        profitBox1.setBackground(new java.awt.Color(102, 102, 255));

        soldJewelriesLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        soldJewelriesLabel.setText("SOLD JEWELRIES");

        weightLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        weightLabel.setText("Weight");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jLabel11.setText(String.valueOf(checkSoldJewelriesTotalQuantity())+" gram");

        totalLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        totalLabel.setText("TOTAL");

        totalNumberLabel.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        totalNumberLabel.setText("IDR "+ (String.valueOf(checkSoldJewelriesTotalSoldPrice())));

        javax.swing.GroupLayout profitBox1Layout = new javax.swing.GroupLayout(profitBox1);
        profitBox1.setLayout(profitBox1Layout);
        profitBox1Layout.setHorizontalGroup(
                profitBox1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(profitBox1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(profitBox1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(profitBox1Layout.createSequentialGroup()
                                                .addGroup(profitBox1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(soldJewelriesLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(weightLabel)
                                                        .addComponent(jLabel11))
                                                .addGap(0, 119, Short.MAX_VALUE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, profitBox1Layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addGroup(profitBox1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(totalLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(totalNumberLabel, javax.swing.GroupLayout.Alignment.TRAILING))
                                                .addContainerGap())))
        );
        profitBox1Layout.setVerticalGroup(
                profitBox1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(profitBox1Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(soldJewelriesLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(weightLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel11)
                                .addGap(14, 14, 14)
                                .addComponent(totalLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(totalNumberLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout upperPanelLayout = new javax.swing.GroupLayout(upperPanel);
        upperPanel.setLayout(upperPanelLayout);
        upperPanelLayout.setHorizontalGroup(
                upperPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, upperPanelLayout.createSequentialGroup()
                                .addContainerGap(36, Short.MAX_VALUE)
                                .addComponent(profitBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(profitBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(profitBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33))
                        .addGroup(upperPanelLayout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addGroup(upperPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(titleDashboard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(subtitlePerformances, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(allTimePerformanceLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        upperPanelLayout.setVerticalGroup(
                upperPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(upperPanelLayout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(titleDashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(subtitlePerformances, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(allTimePerformanceLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(upperPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(profitBox, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(profitBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(profitBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(21, Short.MAX_VALUE))
        );

        profitGraphLabel.setFont(new java.awt.Font("Inter", 1, 18)); // NOI18N
        profitGraphLabel.setText("Sumber Baru");

        quickAccessPanel.setBackground(new java.awt.Color(204, 204, 204));

        addJewelriesButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("Images/icons8-box-50.png"))); // NOI18N
        addJewelriesButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        soldJewelriesButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("Images/icons8-sell-50.png"))); // NOI18N
        soldJewelriesButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        searchJewelriesButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("Images/icons8-search-50.png"))); // NOI18N
        searchJewelriesButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        settingsButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("Images/icons8-tools-50.png"))); // NOI18N
        settingsButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        calculatorButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("Images/icons8-calculator-50.png"))); // NOI18N
        calculatorButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout quickAccessPanelLayout = new javax.swing.GroupLayout(quickAccessPanel);
        quickAccessPanel.setLayout(quickAccessPanelLayout);
        quickAccessPanelLayout.setHorizontalGroup(
                quickAccessPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(quickAccessPanelLayout.createSequentialGroup()
                                .addGroup(quickAccessPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(quickAccessPanelLayout.createSequentialGroup()
                                                .addGap(52, 52, 52)
                                                .addComponent(calculatorButton, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(settingsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(quickAccessPanelLayout.createSequentialGroup()
                                                .addGap(14, 14, 14)
                                                .addComponent(addJewelriesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(searchJewelriesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(soldJewelriesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(12, Short.MAX_VALUE))
        );
        quickAccessPanelLayout.setVerticalGroup(
                quickAccessPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(quickAccessPanelLayout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(quickAccessPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(addJewelriesButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(soldJewelriesButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(searchJewelriesButton, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(quickAccessPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(calculatorButton, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(settingsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(14, Short.MAX_VALUE))
        );

        happyMasTitle.setFont(new java.awt.Font("Inter", 1, 18)); // NOI18N
        happyMasTitle.setText("Happy Mas");

        quickAccessLabel.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        quickAccessLabel.setText("Quick Access");

        profitGraphPanel.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout profitGraphPanelLayout = new javax.swing.GroupLayout(profitGraphPanel);
        profitGraphPanel.setLayout(profitGraphPanelLayout);
        profitGraphPanelLayout.setHorizontalGroup(
                profitGraphPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 290, Short.MAX_VALUE)
        );
        profitGraphPanelLayout.setVerticalGroup(
                profitGraphPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 180, Short.MAX_VALUE)
        );

        happyMasGraph.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout happyMasGraphLayout = new javax.swing.GroupLayout(happyMasGraph);
        happyMasGraph.setLayout(happyMasGraphLayout);
        happyMasGraphLayout.setHorizontalGroup(
                happyMasGraphLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 287, Short.MAX_VALUE)
        );
        happyMasGraphLayout.setVerticalGroup(
                happyMasGraphLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 180, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout homePanelLayout = new javax.swing.GroupLayout(homePanel);
        homePanel.setLayout(homePanelLayout);
        homePanelLayout.setHorizontalGroup(
                homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(homePanelLayout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addGroup(homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(homePanelLayout.createSequentialGroup()
                                                .addGroup(homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(homePanelLayout.createSequentialGroup()
                                                                .addComponent(profitGraphPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(24, 24, 24)
                                                                .addComponent(happyMasGraph, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(homePanelLayout.createSequentialGroup()
                                                                .addGap(117, 117, 117)
                                                                .addComponent(profitGraphLabel)
                                                                .addGap(205, 205, 205)
                                                                .addComponent(happyMasTitle)))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(quickAccessPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(quickAccessLabel, javax.swing.GroupLayout.Alignment.TRAILING)))
                                        .addComponent(upperPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(70, Short.MAX_VALUE))
        );
        homePanelLayout.setVerticalGroup(
                homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(homePanelLayout.createSequentialGroup()
                                .addComponent(upperPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35)
                                .addGroup(homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(happyMasTitle, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(profitGraphLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(quickAccessLabel, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(happyMasGraph, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(quickAccessPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(profitGraphPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(29, Short.MAX_VALUE))
        );

        mainPanel.add(homePanel, "card2");

        jewelryListLabel.setFont(new java.awt.Font("Inter", 1, 24)); // NOI18N
        jewelryListLabel.setText("Jewelry List");

        tablePane.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                },
                new String [] {
                        "ID", "Type", "Name", "Karat","Weight (Grams)", "Initial Price", "Date Added","Date Sold", "Available"
                }
        ) {
            Class[] types = new Class [] {
                    java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.class, java.lang.Float.class, java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                    false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablePane.setColumnSelectionAllowed(true);
        tablePane.getTableHeader().setReorderingAllowed(false);
        scrollPaneTable.setViewportView(tablePane);
        tablePane.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (tablePane.getColumnModel().getColumnCount() > 0) {
            tablePane.getColumnModel().getColumn(0).setResizable(false);
            tablePane.getColumnModel().getColumn(1).setResizable(false);
            tablePane.getColumnModel().getColumn(2).setResizable(false);
            tablePane.getColumnModel().getColumn(3).setResizable(false);
            tablePane.getColumnModel().getColumn(4).setResizable(false);
            tablePane.getColumnModel().getColumn(5).setResizable(false);
            tablePane.getColumnModel().getColumn(6).setResizable(false);
        }

        earringCheckBox.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        earringCheckBox.setText("Earring");

        braceletCheckBox.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        braceletCheckBox.setText("Bracelet");
        filteringLabel.setFont(new java.awt.Font("Inter", 1, 24)); // NOI18N
        filteringLabel.setText("Filtering");

        ringCheckBox.setText("Ring");

        necklaceCheckBox.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        necklaceCheckBox.setText("Necklace");

        pendantCheckBox.setText("Pendant");

        moreButton.setText("Reset");

        searchListButton.setText("Search");

        removeListButton.setText("Update");

        addListButton.setText("Add");

        javax.swing.GroupLayout listPanelLayout = new javax.swing.GroupLayout(listPanel);
        listPanel.setLayout(listPanelLayout);
        listPanelLayout.setHorizontalGroup(
                listPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(listPanelLayout.createSequentialGroup()
                                .addGroup(listPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(listPanelLayout.createSequentialGroup()
                                                .addGap(12, 12, 12)
                                                .addGroup(listPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jewelryListLabel)
                                                        .addComponent(scrollPaneTable, javax.swing.GroupLayout.PREFERRED_SIZE, 950, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(listPanelLayout.createSequentialGroup()
                                                .addGap(22, 22, 22)
                                                .addComponent(filteringLabel)
                                                .addGap(18, 18, 18)
                                                .addGroup(listPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(braceletCheckBox)
                                                        .addComponent(earringCheckBox))
                                                .addGap(18, 18, 18)
                                                .addGroup(listPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(listPanelLayout.createSequentialGroup()
                                                                .addComponent(necklaceCheckBox)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(pendantCheckBox))
                                                        .addGroup(listPanelLayout.createSequentialGroup()
                                                                .addComponent(ringCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(moreButton)))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(addListButton)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(removeListButton)
                                                .addGap(12, 12, 12)
                                                .addComponent(searchListButton)))
                                .addContainerGap(78, Short.MAX_VALUE))
        );
        listPanelLayout.setVerticalGroup(
                listPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(listPanelLayout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jewelryListLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(scrollPaneTable, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(listPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(listPanelLayout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(listPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(listPanelLayout.createSequentialGroup()
                                                                .addGap(8, 8, 8)
                                                                .addComponent(filteringLabel))
                                                        .addGroup(listPanelLayout.createSequentialGroup()
                                                                .addGroup(listPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(braceletCheckBox)
                                                                        .addComponent(necklaceCheckBox)
                                                                        .addComponent(pendantCheckBox))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(listPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(earringCheckBox)
                                                                        .addComponent(ringCheckBox)
                                                                        .addComponent(moreButton, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                        .addGroup(listPanelLayout.createSequentialGroup()
                                                .addGap(24, 24, 24)
                                                .addGroup(listPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(addListButton)
                                                        .addComponent(removeListButton)
                                                        .addComponent(searchListButton))))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        mainPanel.add(listPanel, "card3");

        purchasesAndSalesButton.setFont(new java.awt.Font("Inter", 1, 12)); // NOI18N
        purchasesAndSalesButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("Images/icons8-purchase.gif"))); // NOI18N
        purchasesAndSalesButton.setText("Purchases and Sales");
        purchasesAndSalesButton.setActionCommand("");

        incomeStatementTable.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                },
                new String [] {
                        "ID", "Type", "Karat", "Initial Price", "Expected Price", "Sold Price", "Profit", "Date Sold"
                }
        ));
        jScrollPane1.setViewportView(incomeStatementTable);

        profitButton.setText("Profit");

        filterButton.setText("Update");

        searchISButton.setText("Search");

        javax.swing.GroupLayout incomeStatementInsidePanelLayout = new javax.swing.GroupLayout(incomeStatementInsidePanel);
        incomeStatementInsidePanel.setLayout(incomeStatementInsidePanelLayout);
        incomeStatementInsidePanelLayout.setHorizontalGroup(
                incomeStatementInsidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, incomeStatementInsidePanelLayout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(profitButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(filterButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(searchISButton)
                                .addContainerGap())
                        .addGroup(incomeStatementInsidePanelLayout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 985, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
        );
        incomeStatementInsidePanelLayout.setVerticalGroup(
                incomeStatementInsidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(incomeStatementInsidePanelLayout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(incomeStatementInsidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(profitButton)
                                        .addComponent(filterButton)
                                        .addComponent(searchISButton))
                                .addGap(0, 0, Short.MAX_VALUE))
        );

        incomeStatementLabel.setFont(new java.awt.Font("Inter", 1, 24)); // NOI18N
        incomeStatementLabel.setText("Income Statement");

        javax.swing.GroupLayout incomeStatementPanelLayout = new javax.swing.GroupLayout(incomeStatementPanel);
        incomeStatementPanel.setLayout(incomeStatementPanelLayout);
        incomeStatementPanelLayout.setHorizontalGroup(
                incomeStatementPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, incomeStatementPanelLayout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(incomeStatementLabel)
                                .addGap(181, 181, 181)
                                .addComponent(purchasesAndSalesButton)
                                .addContainerGap())
                        .addGroup(incomeStatementPanelLayout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(incomeStatementInsidePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(25, Short.MAX_VALUE))
        );
        incomeStatementPanelLayout.setVerticalGroup(
                incomeStatementPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(incomeStatementPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(incomeStatementPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(purchasesAndSalesButton)
                                        .addComponent(incomeStatementLabel))
                                .addGap(18, 18, 18)
                                .addComponent(incomeStatementInsidePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(14, Short.MAX_VALUE))
        );

        mainPanel.add(incomeStatementPanel, "card4");

        purchasedJewelriesDataTable.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                },
                new String [] {
                        "ID", "Karat", "Weight", "Buy Price", "Date Added"
                }
        ));
        jScrollPane2.setViewportView(purchasedJewelriesDataTable);

        purchasedJewelriesDataLabel.setFont(new java.awt.Font("Inter", 1, 18)); // NOI18N
        purchasedJewelriesDataLabel.setText("Purchased Jewelries Data");

        soldJewelriesDataTable.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                },
                new String [] {
                        "ID", "Karat", "Weight", "Sold Price", "Date Sold"
                }
        ));
        jScrollPane3.setViewportView(soldJewelriesDataTable);

        soldJewelriesDataLabel.setFont(new java.awt.Font("Inter", 1, 18)); // NOI18N
        soldJewelriesDataLabel.setText("Sold Jewelries Data");

        purchasesAndSalesButton1.setFont(new java.awt.Font("Inter", 1, 12)); // NOI18N
        purchasesAndSalesButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("Images/icons8-profit.gif"))); // NOI18N
        purchasesAndSalesButton1.setText("Income Statement");
        purchasesAndSalesButton1.setActionCommand("");
        purchasesAndSalesButton1.setInheritsPopupMenu(true);

        sellJewelriesButton.setText("Sell");

        buyJewelriesButton.setText("Buy");

        removePurchasedDataButton.setText("Update");

        removeSoldJewelriesDataButton.setText("Update");

        javax.swing.GroupLayout purchasesAndSalesPanelLayout = new javax.swing.GroupLayout(purchasesAndSalesPanel);
        purchasesAndSalesPanel.setLayout(purchasesAndSalesPanelLayout);
        purchasesAndSalesPanelLayout.setHorizontalGroup(
                purchasesAndSalesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, purchasesAndSalesPanelLayout.createSequentialGroup()
                                .addGap(137, 137, 137)
                                .addComponent(purchasedJewelriesDataLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(soldJewelriesDataLabel)
                                .addGap(151, 151, 151))
                        .addGroup(purchasesAndSalesPanelLayout.createSequentialGroup()
                                .addGroup(purchasesAndSalesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(purchasesAndSalesPanelLayout.createSequentialGroup()
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(removePurchasedDataButton)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(buyJewelriesButton))
                                        .addGroup(purchasesAndSalesPanelLayout.createSequentialGroup()
                                                .addGap(24, 24, 24)
                                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 475, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                                .addGroup(purchasesAndSalesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, purchasesAndSalesPanelLayout.createSequentialGroup()
                                                .addComponent(removeSoldJewelriesDataButton)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(sellJewelriesButton))
                                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 475, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(20, 20, 20))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, purchasesAndSalesPanelLayout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(purchasesAndSalesButton1)
                                .addContainerGap())
        );
        purchasesAndSalesPanelLayout.setVerticalGroup(
                purchasesAndSalesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, purchasesAndSalesPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(purchasesAndSalesButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(purchasesAndSalesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(purchasedJewelriesDataLabel)
                                        .addComponent(soldJewelriesDataLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(purchasesAndSalesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
                                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(purchasesAndSalesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(sellJewelriesButton)
                                        .addComponent(buyJewelriesButton)
                                        .addComponent(removePurchasedDataButton)
                                        .addComponent(removeSoldJewelriesDataButton))
                                .addGap(7, 7, 7))
        );

        mainPanel.add(purchasesAndSalesPanel, "card5");

        jSplitPane1.setRightComponent(mainPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jSplitPane1)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jSplitPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        //Action Listeners
        moreButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                braceletCheckBox.setSelected(false);
                earringCheckBox.setSelected(false);
                ringCheckBox.setSelected(false);
                pendantCheckBox.setSelected(false);
                necklaceCheckBox.setSelected(false);

                bracelet = false;
                earring = false;
                ring = false;
                pendant = false;
                necklace = false;
            }
        });
        searchISButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Dialog().searchType();
            }
        });
        profitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(mainPanel, "card2");
            }
        });
        addListButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    addTableList();
                } catch (SQLException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
        searchListButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Dialog().searchType();
            }
        });
        necklaceCheckBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                necklace = necklaceCheckBox.isSelected();
                resetTable(tablePane);
                try {
                    updateTableListWithFilter(bracelet, earring, necklace, ring, pendant);
                } catch (SQLException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
        pendantCheckBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pendant = pendantCheckBox.isSelected();
                resetTable(tablePane);
                try {
                    updateTableListWithFilter(bracelet, earring, necklace, ring, pendant);
                } catch (SQLException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
        braceletCheckBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                bracelet = braceletCheckBox.isSelected();
                resetTable(tablePane);
                try {
                    updateTableListWithFilter(bracelet, earring, necklace, ring, pendant);
                } catch (SQLException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
        ringCheckBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ring = ringCheckBox.isSelected();
                resetTable(tablePane);
                try {
                    updateTableListWithFilter(bracelet, earring, necklace, ring, pendant);
                } catch (SQLException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
        earringCheckBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                earring = earringCheckBox.isSelected();
                resetTable(tablePane);
                try {
                    updateTableListWithFilter(bracelet, earring, necklace, ring, pendant);
                } catch (SQLException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });

        removePurchasedDataButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    updateTablePurchasedList();
                } catch (SQLException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });

        removeSoldJewelriesDataButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    updateTableSalesList();
                } catch (SQLException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });

        logoutButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                try {
                    new LoginMenu();
                } catch (SQLException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });

        addJewelriesButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e){
                try {
                    addTableList();
                } catch (SQLException ex) {
                    throw new RuntimeException(ex);
                }
            }
            @Override
            public void mouseEntered(MouseEvent e) {
                addJewelriesButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("Images/icons8-box.gif")));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                addJewelriesButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("Images/icons8-box-50.png")));
            }
        });

        soldJewelriesButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e){
                try {
                    new Dialog().soldType();
                } catch (SQLException ex) {
                    throw new RuntimeException(ex);
                }
            }
            @Override
            public void mouseEntered(MouseEvent e) {
                soldJewelriesButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("Images/icons8-sell.gif")));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                soldJewelriesButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("Images/icons8-sell-50.png")));
            }
        });

        calculatorButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e){
                try {
                    new Dialog().calculatorDialog();
                } catch (SQLException ex) {
                    throw new RuntimeException(ex);
                }
            }
            @Override
            public void mouseEntered(MouseEvent e) {
                calculatorButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("Images/icons8-calculator.gif")));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                calculatorButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("Images/icons8-calculator-50.png")));
            }
        });

        searchJewelriesButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e){
                new Dialog().searchType();
            }
            @Override
            public void mouseEntered(MouseEvent e) {
                searchJewelriesButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("Images/icons8-search.gif")));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                searchJewelriesButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("Images/icons8-search-50.png")));
            }
        });

        settingsButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e){
                try {
                    Desktop.getDesktop().browse(URI.create("http://localhost/phpmyadmin/index.php?route=/sql&pos=0&db=jewelry&table=products"));
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            }
            @Override
            public void mouseEntered(MouseEvent e) {
                settingsButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("Images/icons8-tools.gif")));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                settingsButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("Images/icons8-tools-50.png")));
            }
        });

        homeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(mainPanel, "card2");
            }
        });

        listButton.addActionListener(new ActionListener() {
            @Override

            public void actionPerformed(ActionEvent e) {
                //Show the list Panel
                cardLayout.show(mainPanel, "card3");
                try {
                    resetTable(tablePane);
                    updateTableList(tablePane);
                } catch (SQLException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
        revenueButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(mainPanel, "card4");
                resetTable(incomeStatementTable);
                try {
                    incomeStatementList(incomeStatementTable);
                } catch (SQLException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
        purchasesAndSalesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(mainPanel, "card5");
                try {
                    resetTable(purchasedJewelriesDataTable);
                    resetTable(soldJewelriesDataTable);
                    updateTableSalesList();
                    updateTablePurchasedList();

                } catch (SQLException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
        purchasesAndSalesButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(mainPanel, "card4");
                try {
                    resetTable(incomeStatementTable);
                    incomeStatementList(incomeStatementTable);
                } catch (SQLException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
        buyJewelriesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    addTableList();
                } catch (SQLException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
        sellJewelriesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    new Dialog().soldType();
                } catch (SQLException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });

    }// </editor-fold>

    public void incomeStatementList(JTable table) throws SQLException{
        //Get connection from SQL
        Connection con = Configuration.configDB();
        Statement statement = con.createStatement();
        //SQL Statement
        String sql = "SELECT * FROM `products` WHERE 1 ORDER BY `Date Sold` DESC";
        ResultSet rs = statement.executeQuery(sql);
        //Set the table on Jewelry List as a model
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        //Import data
        while (rs.next()){
            if ((Integer) rs.getInt("Sold Price") == 0) {
                continue;
            }
            Object[] row = new Object[table.getColumnCount()];
            row[0] = rs.getString("ID");
            row[1] = typeDecider((String) row[0]);
            row[2] = rs.getInt("Karat");
            row[3] = rs.getInt("Price");
            row[4] = calculateExpectedPrice(rs.getInt("Karat"), rs.getInt("Weight"), 15);
            row[5] = rs.getInt("Sold Price");
            row[6] = checkProfit((Integer) row[5], (Integer) row[3]);
            row[7] = rs.getDate("Date Sold");
            model.addRow(row);
        }
    }
    public String typeDecider(String ID){
        if (ID.startsWith("K")){
            return "Necklace";
        }
        else if (ID.startsWith("G")){
            return "Bracelet";
        }
        else if (ID.startsWith("C")){
            return "Ring";
        }
        else if (ID.startsWith("L")){
            return "Pendant";
        }
        else if (ID.startsWith("A")){
            return "Earring";
        }
        return "Unknown";
    }
    public void addTableList() throws SQLException {
        //Collecting Data
        new Dialog().inputType();
    }
    public void resetTable(JTable table) {
        //Reset Table
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0);
    }
    public void updateTablePurchasedList() throws SQLException {
        Connection con = Configuration.configDB();
        Statement statement = con.createStatement();
        String sql = "SELECT * FROM `products` ORDER BY `Date Added` DESC";
        ResultSet rs = statement.executeQuery(sql);
        DefaultTableModel model = (DefaultTableModel) purchasedJewelriesDataTable.getModel();

        while (rs.next()){
            Object[] row = new Object[purchasedJewelriesDataTable.getColumnCount()];
            row[0] = rs.getString("ID");
            row[1] = rs.getInt("Karat");
            row[2] = rs.getFloat("Weight");
            row[3] = rs.getInt("Price");
            row[4] = rs.getDate("Date Added");
            model.addRow(row);
        }
    }
    public void updateTableSalesList() throws SQLException {
        Connection con = Configuration.configDB();
        Statement statement = con.createStatement();
        String sql = "SELECT * FROM `products` WHERE `Date Sold` IS NOT NULL ORDER BY `Date Added` DESC";
        ResultSet rs = statement.executeQuery(sql);
        DefaultTableModel model = (DefaultTableModel) soldJewelriesDataTable.getModel();

        while (rs.next()){
            Object[] row = new Object[soldJewelriesDataTable.getColumnCount()];
            row[0] = rs.getString("ID");
            row[1] = rs.getInt("Karat");
            row[2] = rs.getFloat("Weight");
            row[3] = rs.getInt("Sold Price");
            row[4] = rs.getDate("Date Sold");
            model.addRow(row);
        }
    }
    public void updateTableList(JTable tablePane) throws SQLException {
        //Get connection from SQL
        Connection con = Configuration.configDB();
        Statement statement = con.createStatement();
        //SQL Statement
        String sql = "SELECT * FROM `products` WHERE 1";
        ResultSet rs = statement.executeQuery(sql);
        //Set the table on Jewelry List as a model
        DefaultTableModel model = (DefaultTableModel) tablePane.getModel();
        //Import data
        while (rs.next()){
            Object[] row = new Object[tablePane.getColumnCount()];
            row[0] = rs.getString("ID");
            row[1] = typeDecider((String) row[0]);
            row[2] = rs.getString("Name");
            row[3] = rs.getInt("Karat");
            row[4] = rs.getFloat("Weight");
            row[5] = rs.getInt("Price");
            row[6] = rs.getDate("Date Added");
            row[7] = rs.getDate("Date Sold");
            row[8] = checkStock((Integer) rs.getInt("Quantity"));
            model.addRow(row);
        }
    }

    public void updateTableListWithFilter(boolean bracelet, boolean earring, boolean necklace, boolean ring, boolean pendant) throws SQLException{
        //Reset
        int count = -1;
        //Get connection from SQL
        Connection con = Configuration.configDB();
        Statement statement = con.createStatement();
        //Initial SQL String
        StringBuilder stringBuilder = new StringBuilder("SELECT * FROM `products` WHERE");
        //Condition
        if(!bracelet && !pendant && !ring && !necklace && !earring){
            stringBuilder.append(" 1");
        }
        else if (bracelet && pendant && ring && necklace && earring){
            stringBuilder.append(" 1");
        }
        else {
            if (bracelet) {
                count++;
                if (count > 0 && count < 4) {
                    stringBuilder.append(" OR");
                }
                stringBuilder.append(" ID LIKE 'G%'");
            }
            if (earring) {
                count++;
                if (count > 0 && count < 4) {
                    stringBuilder.append(" OR");
                }
                stringBuilder.append(" ID LIKE 'A%'");
            }
            if (necklace) {
                count++;
                if (count > 0 && count < 4) {
                    stringBuilder.append(" OR");
                }
                stringBuilder.append(" ID LIKE 'K%'");
            }
            if (ring) {
                count++;
                if (count > 0 && count < 4) {
                    stringBuilder.append(" OR");
                }
                stringBuilder.append(" ID LIKE 'C%'");
            }
            if (pendant) {
                count++;
                if (count > 0 && count < 4) {
                    stringBuilder.append(" OR");
                }
                stringBuilder.append(" ID LIKE 'L%'");
            }
        }
        //SQL Statement
        String sql = stringBuilder.toString();
        System.out.println(count);
        System.out.println(sql);
        ResultSet rs = statement.executeQuery(sql);
        //Set the table on Jewelry List as a model
        DefaultTableModel model = (DefaultTableModel) tablePane.getModel();
        //Import data
        while (rs.next()){
            Object[] row = new Object[tablePane.getColumnCount()];
            row[0] = rs.getString("ID");
            row[1] = typeDecider((String) row[0]);
            row[2] = rs.getString("Name");
            row[3] = rs.getInt("Karat");
            row[4] = rs.getFloat("Weight");
            row[5] = rs.getInt("Price");
            row[6] = rs.getDate("Date Added");
            row[7] = rs.getDate("Date Sold");
            row[8] = checkStock((Integer) rs.getInt("Quantity"));
            model.addRow(row);
        }
    }
    @Override
    public Integer calculateExpectedPrice(int karat, int weight, int profitPercentage) {
        int gold = 1000000;
        double pure = gold * (karat / 24.0); // convert 24 to a double
        int pureWeight = (int) (pure * weight); // convert pure to int
        double profitPercent = profitPercentage / 100.0;
        int profit = (pureWeight*(1+profitPercentage))/10;
        return profit;
    }

    public String checkStock(int quantity){
        if (quantity > 0){
            return "Available";
        }
        return "Unavailable";
    }


    public Object checkRemainingStock() throws SQLException{
        Connection con = Configuration.configDB();
        Statement statement = con.createStatement();
        String sql = "SELECT SUM(`Weight`) AS `totalSum` FROM `products` WHERE `Sold Price` IS NULL";
        ResultSet rs = statement.executeQuery(sql);
        while (rs.next()){
            return rs.getInt("totalSum");
        }
        return null;
    }

    public Object checkSoldJewelriesTotalQuantity() throws SQLException {
        Connection con = Configuration.configDB();
        Statement statement = con.createStatement();
        String sql = "SELECT SUM(`Weight`) AS `totalSum` FROM `products` WHERE `Sold Price` IS NOT NULL";
        ResultSet rs = statement.executeQuery(sql);
        while (rs.next()){
            return rs.getInt("totalSum");
        }
        return null;
    }

    public int checkAllProfit(Object buyPriceTotal, Object soldPriceTotal) throws SQLException{
        int soldPrice = (int) soldPriceTotal;
        int buyPrice = (int) buyPriceTotal;
        return soldPrice-buyPrice;
    }
    private Object checkAllBuyPriceProfit() throws SQLException{
        Connection con = Configuration.configDB();
        Statement statement = con.createStatement();
        String sql = "SELECT SUM(`Price`) AS `totalSum` FROM `products` WHERE `Sold Price` IS NOT NULL";
        ResultSet rs = statement.executeQuery(sql);
        while (rs.next()){
            return rs.getInt("totalSum");
        }
        return null;
    }

    private Object checkAllSoldPriceProfit() throws SQLException{
        Connection con = Configuration.configDB();
        Statement statement = con.createStatement();
        String sql = "SELECT SUM(`Sold Price`) AS `totalSum` FROM `products` WHERE `Sold Price` IS NOT NULL";
        ResultSet rs = statement.executeQuery(sql);
        while (rs.next()){
            return rs.getInt("totalSum");
        }
        return null;
    }

    public Object checkSoldJewelriesTotalSoldPrice() throws SQLException {
        Connection con = Configuration.configDB();
        Statement statement = con.createStatement();
        String sql = "SELECT SUM(`Sold Price`) AS `totalSum` FROM `products`";
        ResultSet rs = statement.executeQuery(sql);
        while (rs.next()){
            return rs.getInt("totalSum");
        }
        return null;
    }

    public Integer checkProfit(int initialPrice, int soldPrice){
        return Math.abs(soldPrice-initialPrice);
    }
    public Integer checkAllProfitPercentage(int totalProfit, Object totalInitialPriceProfit){
        int totalPrice = (int) totalInitialPriceProfit;
        double totalProfits = totalProfit;
        return (int) ((totalProfits/totalPrice)*100)-100;
    }
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Dashboard().setVisible(true);
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
        });
    }


    // Variables declaration - do not modify
    private int roundTopLeft = 0;
    private int roundTopRight = 0;
    private int roundBottomLeft = 0;
    private int roundBottomRight = 0;
    // Variables declaration - do not modify
    private javax.swing.JLabel RemainingstocksLabel;
    private javax.swing.JPanel Sidebar;
    private javax.swing.JButton addJewelriesButton;
    private javax.swing.JButton addListButton;
    private javax.swing.JCheckBox braceletCheckBox;
    private javax.swing.JButton buyJewelriesButton;
    private javax.swing.JButton calculatorButton;
    private javax.swing.JLabel earnedLabel;
    private javax.swing.JLabel earnedNumberLabel;
    private javax.swing.JCheckBox earringCheckBox;
    private javax.swing.JButton filterButton;
    private javax.swing.JLabel filteringLabel;
    private javax.swing.JPanel happyMasGraph;
    private javax.swing.JLabel happyMasTitle;
    private javax.swing.JButton homeButton;
    private javax.swing.JPanel homePanel;
    private javax.swing.JPanel incomeStatementInsidePanel;
    private javax.swing.JLabel incomeStatementLabel;
    private javax.swing.JPanel incomeStatementPanel;
    private javax.swing.JTable incomeStatementTable;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JLabel jewelryListLabel;
    private javax.swing.JButton listButton;
    private javax.swing.JPanel listPanel;
    private javax.swing.JLabel logoSM;
    private javax.swing.JButton logoutButton;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JLabel monthLabel;
    private javax.swing.JButton moreButton;
    private javax.swing.JCheckBox necklaceCheckBox;
    private javax.swing.JCheckBox pendantCheckBox;
    private javax.swing.JLabel percentageLabel;
    private javax.swing.JPanel profitBox;
    private javax.swing.JPanel profitBox1;
    private javax.swing.JPanel profitBox2;
    private javax.swing.JButton profitButton;
    private javax.swing.JLabel profitGraphLabel;
    private javax.swing.JPanel profitGraphPanel;
    private javax.swing.JLabel profitLabel;
    private javax.swing.JLabel purchasedJewelriesDataLabel;
    private javax.swing.JTable purchasedJewelriesDataTable;
    private javax.swing.JButton purchasesAndSalesButton;
    private javax.swing.JButton purchasesAndSalesButton1;
    private javax.swing.JPanel purchasesAndSalesPanel;
    private javax.swing.JLabel quickAccessLabel;
    private javax.swing.JPanel quickAccessPanel;
    private javax.swing.JButton removeListButton;
    private javax.swing.JButton removePurchasedDataButton;
    private javax.swing.JButton removeSoldJewelriesDataButton;
    private javax.swing.JButton revenueButton;
    private javax.swing.JCheckBox ringCheckBox;
    private javax.swing.JScrollPane scrollPaneTable;
    private javax.swing.JButton searchISButton;
    private javax.swing.JButton searchJewelriesButton;
    private javax.swing.JButton searchListButton;
    private javax.swing.JButton sellJewelriesButton;
    private javax.swing.JButton settingsButton;
    private javax.swing.JButton soldJewelriesButton;
    private javax.swing.JLabel soldJewelriesDataLabel;
    private javax.swing.JTable soldJewelriesDataTable;
    private javax.swing.JLabel soldJewelriesLabel;
    private javax.swing.JLabel subtitlePerformances;
    private javax.swing.JTable tablePane;
    private javax.swing.JLabel allTimePerformanceLabel;
    private javax.swing.JLabel titleDashboard;
    private javax.swing.JLabel totalLabel;
    private javax.swing.JLabel totalNumberLabel;
    private javax.swing.JLabel totalWeightLabel;
    private javax.swing.JLabel totalWeightNumberLabel;
    private javax.swing.JPanel upperPanel;
    private javax.swing.JLabel weightLabel;
    private CardLayout cardLayout;
    private boolean bracelet;
    private boolean earring;
    private boolean necklace;
    private boolean ring;
    private boolean pendant;
    // End of variables declaration
}