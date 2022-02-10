package DeklandSP.CountriesInformation;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;

/**
 *
 * @author Declan
 */
public class CountryView extends javax.swing.JFrame {

    public CountryView() {
        initComponents();
    }
    
    ArrayList<Integer> Population = new ArrayList<>();
    
    DefaultListModel Country = new DefaultListModel();
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlAppView = new javax.swing.JPanel();
        pnlAppStandout = new javax.swing.JPanel();
        lblTitleOfApp = new javax.swing.JLabel();
        lblSelectCountryTitle = new javax.swing.JLabel();
        cboCountrySelector = new javax.swing.JComboBox<>();
        lblCountryAndCapitalDisplay = new javax.swing.JLabel();
        btnGetCountry = new javax.swing.JButton();
        lblPopulation = new javax.swing.JLabel();
        lblPreviewFlag = new javax.swing.JLabel();
        lblAuthorName = new javax.swing.JLabel();
        lblLandArea = new javax.swing.JLabel();
        lblCurrencyName = new javax.swing.JLabel();
        lblCurrency = new javax.swing.JLabel();
        lblCurrencyImage = new javax.swing.JLabel();
        pnlStatisticsAndReport = new javax.swing.JPanel();
        lblStatisticsAndReportTItle = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listCountryNames = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        textareaShowPopulation = new javax.swing.JTextArea();
        btnGenerateReport = new javax.swing.JButton();
        btnExitApplication = new javax.swing.JButton();
        BtnClearInformation = new javax.swing.JButton();
        btnAddToStats = new javax.swing.JButton();
        bllPopArray = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Country Informer ");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        pnlAppView.setBackground(new java.awt.Color(49, 42, 87));
        pnlAppView.setFont(new java.awt.Font("Monospaced", 0, 11)); // NOI18N

        pnlAppStandout.setBackground(new java.awt.Color(49, 42, 87));
        pnlAppStandout.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblTitleOfApp.setBackground(new java.awt.Color(221, 67, 107));
        lblTitleOfApp.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        lblTitleOfApp.setForeground(new java.awt.Color(255, 255, 255));
        lblTitleOfApp.setText("Countries Informer: Information and Facts");

        javax.swing.GroupLayout pnlAppStandoutLayout = new javax.swing.GroupLayout(pnlAppStandout);
        pnlAppStandout.setLayout(pnlAppStandoutLayout);
        pnlAppStandoutLayout.setHorizontalGroup(
            pnlAppStandoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitleOfApp)
        );
        pnlAppStandoutLayout.setVerticalGroup(
            pnlAppStandoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlAppStandoutLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblTitleOfApp, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        lblSelectCountryTitle.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        lblSelectCountryTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblSelectCountryTitle.setText("Please choose a country:");

        cboCountrySelector.setBackground(new java.awt.Color(49, 42, 87));
        cboCountrySelector.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        cboCountrySelector.setForeground(new java.awt.Color(0, 0, 0));
        cboCountrySelector.setMaximumRowCount(22);
        cboCountrySelector.setOpaque(false);

        lblCountryAndCapitalDisplay.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        lblCountryAndCapitalDisplay.setForeground(new java.awt.Color(255, 255, 255));

        btnGetCountry.setBackground(new java.awt.Color(221, 67, 107));
        btnGetCountry.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        btnGetCountry.setForeground(new java.awt.Color(0, 0, 0));
        btnGetCountry.setText("Get Country");
        btnGetCountry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGetCountryActionPerformed(evt);
            }
        });

        lblPopulation.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        lblPopulation.setForeground(new java.awt.Color(255, 255, 255));

        lblAuthorName.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        lblAuthorName.setForeground(new java.awt.Color(255, 255, 255));
        lblAuthorName.setText("By DeklandSP");

        lblLandArea.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        lblLandArea.setForeground(new java.awt.Color(255, 255, 255));
        lblLandArea.setToolTipText("");

        lblCurrencyName.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        lblCurrencyName.setForeground(new java.awt.Color(255, 255, 255));

        lblCurrency.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        lblCurrency.setForeground(new java.awt.Color(255, 255, 255));

        lblCurrencyImage.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        pnlStatisticsAndReport.setBackground(new java.awt.Color(97, 85, 188));
        pnlStatisticsAndReport.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        lblStatisticsAndReportTItle.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        lblStatisticsAndReportTItle.setForeground(new java.awt.Color(255, 255, 255));
        lblStatisticsAndReportTItle.setText("Countries: Statistics and Report Generator");

        jScrollPane1.setToolTipText("");

        listCountryNames.setBackground(new java.awt.Color(198, 179, 249));
        listCountryNames.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        listCountryNames.setForeground(new java.awt.Color(0, 0, 0));
        jScrollPane1.setViewportView(listCountryNames);

        textareaShowPopulation.setBackground(new java.awt.Color(198, 179, 249));
        textareaShowPopulation.setColumns(20);
        textareaShowPopulation.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        textareaShowPopulation.setForeground(new java.awt.Color(0, 0, 0));
        textareaShowPopulation.setRows(5);
        jScrollPane2.setViewportView(textareaShowPopulation);

        btnGenerateReport.setBackground(new java.awt.Color(221, 67, 107));
        btnGenerateReport.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        btnGenerateReport.setForeground(new java.awt.Color(0, 0, 0));
        btnGenerateReport.setText("Generate Report");
        btnGenerateReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerateReportActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlStatisticsAndReportLayout = new javax.swing.GroupLayout(pnlStatisticsAndReport);
        pnlStatisticsAndReport.setLayout(pnlStatisticsAndReportLayout);
        pnlStatisticsAndReportLayout.setHorizontalGroup(
            pnlStatisticsAndReportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlStatisticsAndReportLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlStatisticsAndReportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlStatisticsAndReportLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlStatisticsAndReportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnGenerateReport, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane2)))
                    .addGroup(pnlStatisticsAndReportLayout.createSequentialGroup()
                        .addComponent(lblStatisticsAndReportTItle)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlStatisticsAndReportLayout.setVerticalGroup(
            pnlStatisticsAndReportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlStatisticsAndReportLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblStatisticsAndReportTItle, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlStatisticsAndReportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(pnlStatisticsAndReportLayout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnGenerateReport)))
                .addContainerGap())
        );

        btnExitApplication.setBackground(new java.awt.Color(221, 67, 107));
        btnExitApplication.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        btnExitApplication.setForeground(new java.awt.Color(0, 0, 0));
        btnExitApplication.setText("Exit");
        btnExitApplication.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitApplicationActionPerformed(evt);
            }
        });

        BtnClearInformation.setBackground(new java.awt.Color(221, 67, 107));
        BtnClearInformation.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        BtnClearInformation.setForeground(new java.awt.Color(0, 0, 0));
        BtnClearInformation.setText("Clear");
        BtnClearInformation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnClearInformationActionPerformed(evt);
            }
        });

        btnAddToStats.setBackground(new java.awt.Color(221, 67, 107));
        btnAddToStats.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        btnAddToStats.setForeground(new java.awt.Color(0, 0, 0));
        btnAddToStats.setText("Add to Statistics and Report");
        btnAddToStats.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddToStatsActionPerformed(evt);
            }
        });

        bllPopArray.setBackground(new java.awt.Color(49, 42, 87));
        bllPopArray.setForeground(new java.awt.Color(49, 42, 87));

        javax.swing.GroupLayout pnlAppViewLayout = new javax.swing.GroupLayout(pnlAppView);
        pnlAppView.setLayout(pnlAppViewLayout);
        pnlAppViewLayout.setHorizontalGroup(
            pnlAppViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAppViewLayout.createSequentialGroup()
                .addGroup(pnlAppViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlAppViewLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pnlAppViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lblCountryAndCapitalDisplay, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlAppViewLayout.createSequentialGroup()
                                .addComponent(lblSelectCountryTitle)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cboCountrySelector, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnGetCountry, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(pnlAppStandout, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlAppViewLayout.createSequentialGroup()
                                .addComponent(lblPopulation, javax.swing.GroupLayout.PREFERRED_SIZE, 456, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblPreviewFlag, javax.swing.GroupLayout.PREFERRED_SIZE, 658, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(pnlAppViewLayout.createSequentialGroup()
                        .addGroup(pnlAppViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblLandArea, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(pnlAppViewLayout.createSequentialGroup()
                                .addComponent(lblCurrency, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblCurrencyName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(pnlAppViewLayout.createSequentialGroup()
                                .addComponent(lblAuthorName)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(BtnClearInformation)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnExitApplication))
                            .addComponent(btnAddToStats, javax.swing.GroupLayout.DEFAULT_SIZE, 583, Short.MAX_VALUE)
                            .addComponent(lblCurrencyImage, javax.swing.GroupLayout.PREFERRED_SIZE, 576, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bllPopArray, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pnlStatisticsAndReport, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlAppViewLayout.setVerticalGroup(
            pnlAppViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAppViewLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlAppViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPreviewFlag, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlAppViewLayout.createSequentialGroup()
                        .addComponent(pnlAppStandout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlAppViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnGetCountry, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                            .addComponent(lblSelectCountryTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cboCountrySelector))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCountryAndCapitalDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblPopulation, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblLandArea, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlAppViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCurrencyName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCurrency, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlAppViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlAppViewLayout.createSequentialGroup()
                        .addComponent(pnlStatisticsAndReport, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(pnlAppViewLayout.createSequentialGroup()
                        .addComponent(lblCurrencyImage, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(bllPopArray, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAddToStats)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlAppViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblAuthorName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlAppViewLayout.createSequentialGroup()
                                .addGroup(pnlAppViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(BtnClearInformation)
                                    .addComponent(btnExitApplication, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(23, 23, 23))))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlAppView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlAppView, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // Sets The grab capital button to the default button allowing it
        //to be used with the Enter key
        getRootPane().setDefaultButton(btnGetCountry);
        
        //Sets app icon
        ImageIcon icon = new ImageIcon("src/images/icon/globe.png");
        setIconImage(icon.getImage());
        
        //Makes preview flag a map of the world
        lblPreviewFlag.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/flags/WorldMap.png")));
        
        
        //populates combobox with country info
        try 
        {
            Connection con = DriverManager.getConnection ("jdbc:ucanaccess://Data\\Countries.accdb"); 
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery ("SELECT Country FROM CountryInfo ORDER BY Population DESC");
            while (rs.next()) 
            {          
                cboCountrySelector.addItem(rs.getString("Country"));
            }
        }
    
        catch(SQLException e)
        {
            lblCountryAndCapitalDisplay.setText("SQL Error" + e);
        }
        
        listCountryNames.setModel(Country);
    }//GEN-LAST:event_formWindowOpened

    private void btnGetCountryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGetCountryActionPerformed
    
        String mySqlStatment = ""; //will hold the sql statment that will be carried out
        String pos = "";
    
        //Sets the country, capital, their population, land area, currency, and Currency Name depening on what country was selected
    
        mySqlStatment = ("SELECT Capital, Population, LandArea, Currency, CurrencyName FROM CountryInfo WHERE Country ='" + ((String)cboCountrySelector.getSelectedItem()) + "'");
    
        try
        {
            Connection con = DriverManager.getConnection("jdbc:ucanaccess://Data\\Countries.accdb");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery (mySqlStatment);
            rs.next();
        
        
            lblCountryAndCapitalDisplay.setText("The Capital of " + ((String)cboCountrySelector.getSelectedItem()) + " is " + (rs.getString("Capital")) + "!");
        
            if((rs.getInt("Population") > 999999999))
            {
                lblPopulation.setText("The population is " + (rs.getInt("Population")) + " Billion");
            }
            else if((rs.getInt("Population") > 999999))
            {
                lblPopulation.setText("The population is " + (rs.getInt("Population")) + " Million");
            }
            else
            {
                lblPopulation.setText("The population is " + (rs.getInt("Population")) + " Thousand");
            }
            
            lblLandArea.setText("The Land Area of " + ((String)cboCountrySelector.getSelectedItem()) + " is " + (rs.getInt("LandArea")) + "km²" );
            
            lblCurrency.setText("Currency ISO: " + rs.getString("Currency") + "|");
            lblCurrencyName.setText((String)cboCountrySelector.getSelectedItem() + " use " + (rs.getString("CurrencyName")) + " for Currency");
            
            
            String currencyPath = "/images/currency/" + (rs.getString("CurrencyName")) + ".png";
            lblCurrencyImage.setIcon(new javax.swing.ImageIcon(getClass().getResource(currencyPath)));
            
            
            pos = String.valueOf(lblPopulation.getText().lastIndexOf(" "));
            
            bllPopArray.setText(lblPopulation.getText().substring(18, Integer.parseInt(pos)));
        }
    
        catch(SQLException e)
        {
            lblPopulation.setText("SQL exception Occured " + e);
        }
    
    
        //Sets the Images of Flag Preview Depending on what country is chosen
        try
        {
            lblPreviewFlag.setIcon(null);
       
            String filePath = "/images/flags/" + cboCountrySelector.getSelectedItem() + ".png";
            
            lblPreviewFlag.setIcon(new javax.swing.ImageIcon(getClass().getResource(filePath)));
        }
        
        catch(Exception e)
        {
            lblPreviewFlag.setText("Cannot load capital flag");
        }
        
    }//GEN-LAST:event_btnGetCountryActionPerformed

    private void btnExitApplicationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitApplicationActionPerformed
        //this button exits the application
        System.exit(0);
    }//GEN-LAST:event_btnExitApplicationActionPerformed

    private void BtnClearInformationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnClearInformationActionPerformed
        //this button clears all of the filled fields
        
        lblPreviewFlag.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/flags/WorldMap.png")));
        lblCurrencyImage.setIcon(null);
        
        lblCountryAndCapitalDisplay.setText("");
        lblPopulation.setText("");
        lblLandArea.setText("");
        lblCurrency.setText("");
        lblCurrencyName.setText("");
        bllPopArray.setText("");
        
        Population.clear();
        Country.clear();
        textareaShowPopulation.setText("");
    }//GEN-LAST:event_BtnClearInformationActionPerformed

    private void btnAddToStatsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddToStatsActionPerformed
        Country.addElement((String)cboCountrySelector.getSelectedItem());
        
        Population.add(Integer.parseInt(bllPopArray.getText()));
    }//GEN-LAST:event_btnAddToStatsActionPerformed

    private void btnGenerateReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerateReportActionPerformed
        int totalPopulation = 0;
        int highestPopulation = Population.get(0);
        int lowestPopulation = Population.get(0);
        int avgPop;
        String highestCountryID = "";
        String lowestCountryID = "";
        
        //total pop
        for (Integer thePop : Population) 
        {
            textareaShowPopulation.append(thePop.toString());
            textareaShowPopulation.append("\n");
            
            totalPopulation += thePop;   
        }
        
        //max pop
        for (int i = 1; i < Population.size(); i++)
        {
            if(Population.get(i) > highestPopulation)
            {
                highestPopulation = Population.get(i);
                highestCountryID = Country.get(i).toString();
            }
        }
        
        //min pop
        for (int i = 1; i < Population.size(); i++)
        {
            if (Population.get(i) < lowestPopulation) 
            {
                lowestPopulation = Population.get(i);
                lowestCountryID = Country.get(i).toString();
            }
        }
        
        avgPop = totalPopulation / Population.size();
        
        textareaShowPopulation.append("The Country with the highest population is " + highestCountryID + " " + highestPopulation + "\n");
        textareaShowPopulation.append("The country with the lowest population is " + lowestCountryID + " " + lowestPopulation + "\n");
        textareaShowPopulation.append("The average population of all subset countries is " + avgPop + "\n");
        textareaShowPopulation.append("The total population of all subset countries is " + totalPopulation + "\n");
    }//GEN-LAST:event_btnGenerateReportActionPerformed
    public static void main(String args[]) {

        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CountryView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CountryView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CountryView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CountryView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CountryView().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnClearInformation;
    private javax.swing.JLabel bllPopArray;
    private javax.swing.JButton btnAddToStats;
    private javax.swing.JButton btnExitApplication;
    private javax.swing.JButton btnGenerateReport;
    private javax.swing.JButton btnGetCountry;
    private javax.swing.JComboBox<String> cboCountrySelector;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblAuthorName;
    private javax.swing.JLabel lblCountryAndCapitalDisplay;
    private javax.swing.JLabel lblCurrency;
    private javax.swing.JLabel lblCurrencyImage;
    private javax.swing.JLabel lblCurrencyName;
    private javax.swing.JLabel lblLandArea;
    private javax.swing.JLabel lblPopulation;
    private javax.swing.JLabel lblPreviewFlag;
    private javax.swing.JLabel lblSelectCountryTitle;
    private javax.swing.JLabel lblStatisticsAndReportTItle;
    private javax.swing.JLabel lblTitleOfApp;
    private javax.swing.JList<String> listCountryNames;
    private javax.swing.JPanel pnlAppStandout;
    private javax.swing.JPanel pnlAppView;
    private javax.swing.JPanel pnlStatisticsAndReport;
    private javax.swing.JTextArea textareaShowPopulation;
    // End of variables declaration//GEN-END:variables
}
