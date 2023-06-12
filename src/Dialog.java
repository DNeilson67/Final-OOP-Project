import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Dialog extends JDialog implements Utilities{

    public void calculatorDialog() throws SQLException{
        setVisible(true);
        JLabel inputTheFollowingDataLabel = new javax.swing.JLabel();
        JLabel profitNumberLabel = new javax.swing.JLabel();
        JLabel IDLabel = new javax.swing.JLabel();
        JTextField IDTextField = new javax.swing.JTextField();
        JLabel karatLabel = new javax.swing.JLabel();
        JComboBox<Object> karatComboBox = new javax.swing.JComboBox<>();
        JLabel weightLabel = new javax.swing.JLabel();
        JTextField weightTextField = new javax.swing.JTextField();
        JLabel initialPriceLabel = new javax.swing.JLabel();
        JTextField profitPercentageTextField = new javax.swing.JTextField();
        JButton calculateButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        inputTheFollowingDataLabel.setFont(new java.awt.Font("Inter", 1, 18)); // NOI18N
        inputTheFollowingDataLabel.setText("Expected Price Calculator");

        profitNumberLabel.setFont(new java.awt.Font("Inter", 1, 18)); // NOI18N
        profitNumberLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        profitNumberLabel.setText("IDR 0");

        IDLabel.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        IDLabel.setText("ID");

        karatLabel.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        karatLabel.setText("Karat");

        karatComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "8", "16" }));

        weightLabel.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        weightLabel.setText("Weight");

        initialPriceLabel.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        initialPriceLabel.setText("Profit %");

        calculateButton.setText("Calculate");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(inputTheFollowingDataLabel)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(87, 87, 87)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(calculateButton)
                                                                        .addComponent(profitNumberLabel))))
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(weightTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(IDTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(profitPercentageTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(karatComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(27, 27, 27)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(initialPriceLabel)
                                                        .addComponent(IDLabel)
                                                        .addComponent(karatLabel)
                                                        .addComponent(weightLabel))))
                                .addContainerGap(32, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(inputTheFollowingDataLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(profitNumberLabel)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(30, 30, 30)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(karatLabel)
                                                        .addComponent(karatComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(IDTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(IDLabel)))
                                .addGap(16, 16, 16)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(weightLabel)
                                        .addComponent(weightTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(initialPriceLabel)
                                        .addComponent(profitPercentageTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(calculateButton)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();

        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(Integer.parseInt((String) karatComboBox.getSelectedItem()));
                System.out.println(Integer.parseInt(weightTextField.getText()));
                System.out.println(Integer.parseInt(profitPercentageTextField.getText()));
                int expectedPrice = calculateExpectedPrice((Integer.parseInt((String) karatComboBox.getSelectedItem())), Integer.parseInt(weightTextField.getText()), Integer.parseInt(profitPercentageTextField.getText()));
                System.out.println(expectedPrice);
                profitNumberLabel.setText("IDR "+expectedPrice);
            }
        });

    }// </editor-fold>
    public void soldType() throws SQLException{
        setVisible(true);
        JLabel inputIDLabel = new javax.swing.JLabel();
        JTextField inputIDTextField = new javax.swing.JTextField();
        JButton searchButton = new javax.swing.JButton();
        JScrollPane jScrollPane1 = new javax.swing.JScrollPane();
        JTable searchTable = new javax.swing.JTable();
        JLabel inputSoldPriceLabel = new javax.swing.JLabel();
        JTextField inputSoldPriceTextField = new javax.swing.JTextField();
        JButton sellButton = new javax.swing.JButton();

        sellButton.setEnabled(false);
        inputSoldPriceTextField.setEnabled(false);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        inputIDLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        inputIDLabel.setText("Input ID");

        searchButton.setText("Search");

        searchTable.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                },
                new String [] {
                        "ID", "Type", "Name", "Karat", "Weight (Gram)", "Initial Price", "Available"
                }
        ) {
            boolean[] canEdit = new boolean [] {
                    false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(searchTable);
        if (searchTable.getColumnModel().getColumnCount() > 0) {
            searchTable.getColumnModel().getColumn(0).setResizable(false);
            searchTable.getColumnModel().getColumn(1).setResizable(false);
            searchTable.getColumnModel().getColumn(2).setResizable(false);
            searchTable.getColumnModel().getColumn(3).setResizable(false);
            searchTable.getColumnModel().getColumn(4).setResizable(false);
            searchTable.getColumnModel().getColumn(5).setResizable(false);
            searchTable.getColumnModel().getColumn(6).setResizable(false);
        }

        inputSoldPriceLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        inputSoldPriceLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        inputSoldPriceLabel.setText("Sold Price");

        sellButton.setText("Sell");


        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 664, Short.MAX_VALUE)
                                .addContainerGap())
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(inputIDTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(23, 23, 23)
                                                .addComponent(inputIDLabel)))
                                .addGap(276, 276, 276))
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(295, 295, 295)
                                                .addComponent(sellButton))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(295, 295, 295)
                                                .addComponent(searchButton))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(272, 272, 272)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(inputSoldPriceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(inputSoldPriceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(inputIDLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(inputIDTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(searchButton)
                                .addGap(18, 18, 18)
                                .addComponent(inputSoldPriceLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(inputSoldPriceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(sellButton)
                                .addContainerGap(31, Short.MAX_VALUE))
        );
        pack();
        inputIDTextField.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                sellButton.setEnabled(false);
                inputSoldPriceTextField.setEnabled(false);
            }
        });
        searchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    resetTable(searchTable);
                    updateTableListIDFilter(inputIDTextField.getText(), searchTable);
                    if (searchTable.getRowCount() > 0 && searchTable.getModel().getValueAt(0,6) == "Available") {
                        sellButton.setEnabled(true);
                        inputSoldPriceTextField.setEnabled(true);
                    }
                    else{
                        sellButton.setEnabled(false);
                        inputSoldPriceTextField.setEnabled(false);
                    }
                } catch (SQLException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
        sellButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    soldListIDFilter(inputIDTextField.getText(), Integer.parseInt(inputSoldPriceTextField.getText()));
                    sellButton.setEnabled(false);
                    inputSoldPriceTextField.setEnabled(false);
                } catch (SQLException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
    }
    public void inputType() throws SQLException {
        JLabel inputTheFollowingDataLabel = new javax.swing.JLabel();
        JLabel idNumberLabel = new javax.swing.JLabel();
        JComboBox<Object> typeComboBox = new javax.swing.JComboBox<>();
        JLabel typeLabel = new javax.swing.JLabel();
        JLabel nameLabel = new javax.swing.JLabel();
        JTextField nameTextField = new javax.swing.JTextField();
        JLabel karatLabel = new javax.swing.JLabel();
        JComboBox<Object> karatComboBox = new javax.swing.JComboBox<>();
        JLabel weightLabel = new javax.swing.JLabel();
        JTextField weightTextField = new javax.swing.JTextField();
        JLabel initialPriceLabel = new javax.swing.JLabel();
        JTextField initialPriceTextField = new javax.swing.JTextField();
        JButton addStockButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        inputTheFollowingDataLabel.setFont(new java.awt.Font("Inter", 1, 18)); // NOI18N
        inputTheFollowingDataLabel.setText("Input the Following Data");

        idNumberLabel.setFont(new java.awt.Font("Inter", 1, 18)); // NOI18N
        idNumberLabel.setText("ID: "+GenerateID("Bracelet"));

        typeComboBox.setModel(new DefaultComboBoxModel<>(new String[] { "Bracelet", "Earring", "Necklace", "Pendant", "Ring" +
                ""}));

        typeLabel.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        typeLabel.setText("Type");

        nameLabel.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        nameLabel.setText("Name");

        karatLabel.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        karatLabel.setText("Karat");

        karatComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"8","16"}));

        weightLabel.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        weightLabel.setText("Weight");

        initialPriceLabel.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        initialPriceLabel.setText("Initial Price");

        addStockButton.setText("Add Stock");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(79, 79, 79)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(inputTheFollowingDataLabel)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(70, 70, 70)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(addStockButton)
                                                        .addComponent(idNumberLabel))))
                                .addContainerGap(85, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(initialPriceLabel)
                                        .addComponent(weightLabel)
                                        .addComponent(typeLabel)
                                        .addComponent(nameLabel)
                                        .addComponent(karatLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(typeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(karatComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(weightTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(initialPriceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(29, 29, 29))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(inputTheFollowingDataLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(idNumberLabel)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(typeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(typeLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(nameLabel)
                                        .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(karatLabel)
                                        .addComponent(karatComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(14, 14, 14)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(weightTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(weightLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(initialPriceLabel)
                                        .addComponent(initialPriceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(addStockButton)
                                .addContainerGap(11, Short.MAX_VALUE))
        );

        pack();
        setVisible(true);
        typeComboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    idNumberLabel.setText("ID: "+GenerateID((String) typeComboBox.getSelectedItem()));
                } catch (SQLException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
        addStockButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ArrayList<Object> data = new ArrayList<>();
                data.add(typeComboBox.getSelectedItem());
                data.add(nameTextField.getText());
                data.add(karatComboBox.getSelectedItem());
                data.add(weightTextField.getText());
                data.add(initialPriceTextField.getText());

                Connection con = null;
                Statement statement = null;
                try {
                    con = Configuration.configDB();
                    statement = con.createStatement();
                    String ID = GenerateID((String) typeComboBox.getSelectedItem());
                    String sql = String.format("INSERT INTO `products`(`ID`, `Name`, `Karat`, `Weight`, `Price`, `Quantity`, `Date Added`, `Date Sold`) VALUES ('%s','%s','%s','%s','%s','1', '%s', null)",ID,data.get(1),data.get(2),data.get(3),data.get(4), java.time.LocalDate.now());
                    statement.executeUpdate(sql);
                    idNumberLabel.setText("ID: "+GenerateID((String) typeComboBox.getSelectedItem()));
                } catch (SQLException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
    }
    public String GenerateID(String typeName) throws SQLException {
        int count = 0;
        StringBuilder id = new StringBuilder();
        if (typeName == "Necklace"){
            id.append("K");
        }
        else if (typeName == "Earring"){
            id.append("A");
        }
        else if (typeName == "Pendant"){
            id.append("L");
        }
        else if (typeName == "Ring"){
            id.append("C");
        }
        else if (typeName == "Bracelet"){
            id.append("G");
        }
        Connection con = Configuration.configDB();
        Statement statement = con.createStatement();
        String sqlFilter = String.format("SELECT COUNT(*) AS ProductCount FROM products WHERE ID LIKE '%s___'", id);
        ResultSet rs = statement.executeQuery(sqlFilter);
        while (rs.next()){
            count = rs.getInt("ProductCount");
        }
        if (count == 0){
            id.append("001");
        }
        else if (count < 9){
            id.append(0);
            id.append(0);
            id.append(count+1);
        }
        else if (count < 99){
            id.append(0);
            id.append(count+1);
        }
        else {
            id.append(count+1);
        }
        return id.toString();
    }
    public void searchType(){
        setVisible(true);
        JLabel inputIDLabel = new javax.swing.JLabel();
        JTextField inputIDTextField = new javax.swing.JTextField();
        JButton searchButton = new javax.swing.JButton();
        JScrollPane jScrollPane1 = new javax.swing.JScrollPane();
        JTable searchTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        inputIDLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        inputIDLabel.setText("Input ID");

        searchButton.setText("Search");

        searchTable.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                },
                new String [] {
                        "ID", "Type", "Name", "Karat", "Weight (Gram)", "Initial Price", "Available"
                }
        ) {
            boolean[] canEdit = new boolean [] {
                    false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(searchTable);
        if (searchTable.getColumnModel().getColumnCount() > 0) {
            searchTable.getColumnModel().getColumn(0).setResizable(false);
            searchTable.getColumnModel().getColumn(1).setResizable(false);
            searchTable.getColumnModel().getColumn(2).setResizable(false);
            searchTable.getColumnModel().getColumn(3).setResizable(false);
            searchTable.getColumnModel().getColumn(4).setResizable(false);
            searchTable.getColumnModel().getColumn(5).setResizable(false);
            searchTable.getColumnModel().getColumn(6).setResizable(false);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 664, Short.MAX_VALUE)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(271, 271, 271)
                                                                .addComponent(inputIDTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(294, 294, 294)
                                                                .addComponent(inputIDLabel)))
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                .addContainerGap())
                        .addGroup(layout.createSequentialGroup()
                                .addGap(295, 295, 295)
                                .addComponent(searchButton)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(inputIDLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(inputIDTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(searchButton)
                                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();

        searchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    resetTable(searchTable);
                    updateTableListIDFilter(inputIDTextField.getText(), searchTable);
                } catch (SQLException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
    }

    private void soldListIDFilter(String ID, int soldPrice) throws SQLException{
        //Get connection from SQL
        Connection con = Configuration.configDB();
        Statement statement = con.createStatement();
        //SQL Statement
        String sql = "UPDATE `products` SET `Sold Price` = " + soldPrice + ", `Date Sold` = '" + java.time.LocalDate.now() + "', `Quantity` = 0 WHERE ID = '" + ID.toUpperCase() + "'";
        statement.executeUpdate(sql);
    }
    private void updateTableListIDFilter(String ID, JTable tablePane) throws SQLException {
        //Get connection from SQL
        Connection con = Configuration.configDB();
        Statement statement = con.createStatement();
        //SQL Statement
        String sql = "SELECT * FROM `products` WHERE ID = '"+ID+"'";
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
            row[6] = checkStock((Integer) rs.getInt("Quantity"));
            model.addRow(row);
        }
    }

    @Override
    public String typeDecider(String ID) {
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

    @Override
    public String checkStock(int Quantity) {
        if (Quantity > 0){
            return "Available";
        }
        return "Unavailable";
    }

    @Override
    public void resetTable(JTable table) {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0);
    }

    @Override
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

    @Override
    public Integer calculateExpectedPrice(int karat, int weight, int profitPercentage) {
        int gold = 1000000;
        double pure = gold * (karat / 24.0); // convert 24 to a double
        int pureWeight = (int) (pure * weight); // convert pure to int
        double profitPercent = profitPercentage / 100.0;
        int profit = (pureWeight*(1+profitPercentage))/10;
        return profit;
    }
}

