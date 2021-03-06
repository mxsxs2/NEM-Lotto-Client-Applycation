/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frame;

import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import org.json.JSONException;
import org.json.JSONObject;

/**
 *
 * @author Mxsxs2
 */
public class Payout extends javax.swing.JFrame {
    private java.util.ArrayList<Object[]> Payouts;
    private final classes.ConfigReader CR;
    private final utils.CurrencyConverter Conv;       //get converter class
    private final utils.GetNisNodeTime NisTime;
    private final java.util.ArrayList<long[]> AllocatedFees = new java.util.ArrayList<>();
    /**
     * Creates new form Payout
     * @param CR
     * @param NXTinBTC
     * @param BTCinXEM
     * @param NXTinXEM
     */
    public Payout(classes.ConfigReader CR, float NXTinBTC,float BTCinXEM, float NXTinXEM) {
        initComponents();
        super.setLocationRelativeTo(null);
        this.CR=CR;
        this.Conv=new utils.CurrencyConverter(this.CR.getValues()[1]);
        this.Conv.setChangeValues(NXTinBTC, BTCinXEM, NXTinXEM);
        this.NisTime=new utils.GetNisNodeTime(this.CR.getValues());
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPKLabel = new javax.swing.JLabel();
        jPublicKeyField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jAddressTable = new javax.swing.JTable();
        jPayButton = new javax.swing.JButton();
        jAmountLabel = new javax.swing.JLabel();
        jOptionLabel = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jSessionLabel = new javax.swing.JLabel();
        jPRKLabel = new javax.swing.JLabel();
        jPrivateKeyField = new javax.swing.JTextField();
        jRespLabel = new javax.swing.JLabel();
        this.jRespLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel1 = new javax.swing.JLabel();
        jAddressField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jStatusLabel = new javax.swing.JLabel();
        jBalanceLabel = new javax.swing.JLabel();
        jCloseButton = new javax.swing.JButton();
        jFeeLabel = new javax.swing.JLabel();
        jRecalcButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPKLabel.setText("Public Key:");

        jPublicKeyField.setEnabled(false);

        jLabel2.setText("Option:");

        jLabel3.setText("Total amount to pay out:");

        jAddressTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "NEM Address", "Amount"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jAddressTable);

        jPayButton.setText("Pay out");
        jPayButton.setToolTipText("Transfer to every address unless the status is SUCCESS");
        jPayButton.setEnabled(false);
        jPayButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPayButtonActionPerformed(evt);
            }
        });

        jAmountLabel.setText("jLabel4");

        jOptionLabel.setText("jLabel5");

        jLabel4.setText("Session:");

        jSessionLabel.setText("jLabel5");

        jPRKLabel.setText("Private Key:");

        jRespLabel.setText(" ");

        jLabel1.setText("Address:");

        jAddressField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jAddressFieldFocusLost(evt);
            }
        });

        jLabel5.setText("Account status:");

        jLabel6.setText("Account balance:");

        jStatusLabel.setText("N/A");

        jBalanceLabel.setText("N/A");

        jCloseButton.setText("Close");
        jCloseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCloseButtonActionPerformed(evt);
            }
        });

        jFeeLabel.setText("jLabel7");

        jRecalcButton.setText("Recalculate fee");
        jRecalcButton.setEnabled(false);
        jRecalcButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRecalcButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jAmountLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jFeeLabel))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jOptionLabel)
                                        .addGap(123, 123, 123)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel6))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jBalanceLabel)
                                            .addComponent(jStatusLabel))))
                                .addGap(126, 126, 126)
                                .addComponent(jRecalcButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jSessionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 489, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 48, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jPKLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jPublicKeyField, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jAddressField, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jPRKLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jPrivateKeyField, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPayButton, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCloseButton, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1)
                    .addComponent(jRespLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jRespLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jAddressField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jPrivateKeyField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPRKLabel))
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jPublicKeyField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPKLabel)))
                    .addComponent(jPayButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jCloseButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jSessionLabel))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jOptionLabel)
                            .addComponent(jLabel5)
                            .addComponent(jStatusLabel))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jAmountLabel)
                            .addComponent(jLabel6)
                            .addComponent(jBalanceLabel)
                            .addComponent(jFeeLabel)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRecalcButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPayButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPayButtonActionPerformed
        long total=Long.parseLong(this.jAmountLabel.getText())+Long.parseLong(this.jFeeLabel.getText().split(" ")[1]);
        int optionPane = javax.swing.JOptionPane.showConfirmDialog(         //Create the confirmation dialig
                    null,
                    "Are you sure you want to do payout for option "+this.jOptionLabel.getText()+"?\n"
                    + "It will take "+total+" from your account!",
                    "Warning",
                    javax.swing.JOptionPane.YES_NO_OPTION);
                if(optionPane==javax.swing.JOptionPane.YES_OPTION){             
                    this.doPayout();                                            
                }
    }//GEN-LAST:event_jPayButtonActionPerformed

    private void jAddressFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jAddressFieldFocusLost
        if(this.getAccount()){
            this.jPayButton.setEnabled(true);
        }else{
            this.jPayButton.setEnabled(false);
        }
    }//GEN-LAST:event_jAddressFieldFocusLost

    private void jCloseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCloseButtonActionPerformed
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(
            new WindowEvent(this, WindowEvent.WINDOW_CLOSING));                 //dispatch closing event
        this.dispose();  
    }//GEN-LAST:event_jCloseButtonActionPerformed

    private void jRecalcButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRecalcButtonActionPerformed
        this.allocateFee();
    }//GEN-LAST:event_jRecalcButtonActionPerformed
    public void setTable(java.util.ArrayList<Object[]> Rows){
        this.Payouts=Rows;
        DefaultTableModel list = new DefaultTableModel(new Object[][]{},new String [] {"NEM Address","Amount(XEM)","Fee(XEM)","Status"})
                {
                        @Override
                        public boolean isCellEditable(int row, int column){
                            if(column==2) return true;
                            return false;}; //dont allow the table column editing
                        
                    };
            if(Rows!=null && Rows.size()>0){
                Rows.forEach((Row) -> {
                    Row[1]=setToXEM((String)Row[1]);    //convert the values to XEM
                    list.addRow(Row);
                });
            }
        this.jAddressTable.setModel(list);
        this.jAddressTable.setAutoCreateRowSorter(false);
        this.allocateFee();
    }
    public void setDetails(String[] Details){
        this.jOptionLabel.setText(Details[0]);
        this.jAmountLabel.setText(this.setToXEM(Details[1]));
        this.jSessionLabel.setText(Details[2]);
    }
    
    private void doPayout(){
        try {
            float biggestInSession=0;
            //pay out----------------------------------------------------------
            TableModel Table = this.jAddressTable.getModel();                                                                               //Get model
            for(int Row=0; Row<Table.getRowCount(); Row++){                                                                                 //Go through
                if(Table.getValueAt(Row, 3)==null || !Table.getValueAt(Row, 3).toString().equals("SUCCESS")){
                    Table.setValueAt(this.sendToAddress(Table.getValueAt(Row, 0).toString().replace("-", ""), Table.getValueAt(Row, 1).toString(), Table.getValueAt(Row, 2).toString()),Row,3);       //Try to pay
                }
                if(Table.getValueAt(Row, 3).toString().equals("SUCCESS")){                                                                     //If could pay
                    float Wins=Float.parseFloat(Table.getValueAt(Row, 1).toString());                                                       //Get the value
                    if(Wins>biggestInSession) biggestInSession=Wins;                                                                        //Set thebiggest if its higher
                }
            }
            //bigest winner------------------------------------------------
            
            
            frame.MysqlAccess SQL = new frame.MysqlAccess();
            String[] sessionarr=this.jSessionLabel.getText().split(" ");  //index 0 is the session id
            SQL.PreparedUpdate("session", new String[]{"paid"}, new String[]{"1"}, "`SID`='"+sessionarr[0]+"'", "1");
            
            //select the biggest winner ever and if there is a higher win in the session the put that into the database
            java.sql.ResultSet RS=SQL.PreparedSelect("biggestwiner", new String[]{"amount"}, "", "1", "`amount` DESC");
            float currentBiggestWin=0;
            
            if(RS.first()){
                try {
                    currentBiggestWin=Float.parseFloat(RS.getString("amount"));
                } catch (SQLException ex) {
                    Logger.getLogger(Payout.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if(biggestInSession>currentBiggestWin){
                SQL.PreparedInsert("biggestwiner", new String[]{"amount"}, new String[]{Float.toString(biggestInSession)});
            }
            this.jRecalcButton.setEnabled(true);
            //close the window if everything was ok.
            //java.awt.Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(
            //new java.awt.event.WindowEvent(this, java.awt.event.WindowEvent.WINDOW_CLOSING));                 //dispatch closing event
            //this.dispose();
        } catch (SQLException ex) {
            Logger.getLogger(Payout.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private String setToXEM(String Wins){
        double Converted=Conv.convertWithValues(Wins.split(" ")[1].replace("(", "").replace(")", ""), "XEM", Wins.split(" ")[0]);
         java.math.BigDecimal res=new java.math.BigDecimal(Converted)
                                 .setScale(20,java.math.RoundingMode.HALF_EVEN)
                                 .stripTrailingZeros();
        return res.toString().split("\\.")[0];
    }
  

    private String sendToAddress(String Recipient, String Amount, String SFee){
        this.jRespLabel.setText("");
        //Recipient="NC4D2KFEMF7BQXO7MB6JHUDVAGTM36D5LYBO6BHI";
        String PublicKey=this.jPublicKeyField.getText().trim();
        String PrivateKey=this.jPrivateKeyField.getText().trim().replace("-", "");
        if(PublicKey.length()<39 || PrivateKey.length()<39){
            this.jRespLabel.setText("The fields are not filled up correctly.");
        }else{
            try{
                long LongAmount=Long.parseLong(Amount.split("\\.")[0])*1000000;
                long time=this.NisTime.getTime();
                //long Fee=this.calculateFee(LongAmount);
                long Fee=Long.parseLong(SFee)*1000000;
                URL url = new URL(this.CR.getValues()[7]+"transaction/prepare-announce/");
                JSONObject parent = new JSONObject();
                    JSONObject transaction = new JSONObject();
                        JSONObject message=new JSONObject();
                message.put("payload", "");
                message.put("type", 1);
            
                transaction.put("timeStamp", time);
                transaction.put("amount", LongAmount);
                transaction.put("fee", Fee);
                transaction.put("recipient", Recipient.toUpperCase());
                transaction.put("type", 257);
                transaction.put("deadline", time+10800);                        //plus 3 hours
                transaction.put("message", message);
                transaction.put("version", 1744830465);                         //the real net(not test net)                
                transaction.put("signer", PublicKey);
            
                parent.put("privateKey", PrivateKey);
                parent.put("transaction", transaction);

                //System.out.println(parent.toString());
                HttpURLConnection connection =(HttpURLConnection)url.openConnection();
                connection.setDoInput(true);
                connection.setDoOutput(true);
                connection.setRequestMethod("POST");
                connection.setRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 6.3; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/42.0.2311.90 Safari/537.36");
                connection.setRequestProperty("Content-Type", "application/json");
                connection.setRequestProperty("Accept", "application/json");
           
                connection.getOutputStream().write(parent.toString().getBytes());
            
                InputStream IS;
                if(connection.getResponseCode()==200){
                    IS = connection.getInputStream();
                }else{
                    IS = connection.getErrorStream();
                }

                BufferedReader br = new BufferedReader(new InputStreamReader(IS));
                StringBuilder sb = new StringBuilder();
                String line;
                while ((line = br.readLine()) != null) {
                    sb.append(line);
                    //System.out.println(line);
                }
                org.json.JSONObject json= new org.json.JSONObject(sb.toString());                      //arse to JSON
                if(!json.isNull("message")){                                                           //CHECK ERROR CODE
                    this.jRespLabel.setText(json.getString("message"));
                    if(json.getString("message").equals("SUCCESS")) this.AllocatedFees.add(new long[]{LongAmount,Fee});
                    return json.getString("message");
                }
            } catch (JSONException | NumberFormatException | IOException ex) {
                    Logger.getLogger(Payout.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return "";
    }
    
    private boolean getAccount(){
        this.jRespLabel.setText("");
        String Address=this.jAddressField.getText().trim().replace("-", "");
        if(Address.length()<39){
            this.jRespLabel.setText("The fields are not filled up correctly.");
        }
        try{
         URL url = new URL(this.CR.getValues()[7]+"account/get?address="+Address);
            HttpURLConnection connection =(HttpURLConnection)url.openConnection();
            connection.setDoInput(true);
            connection.setRequestMethod("GET");
            connection.setRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 6.3; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/42.0.2311.90 Safari/537.36");
            connection.setRequestProperty("Content-Type", "application/json");
            connection.setRequestProperty("Accept", "application/json");
            
            InputStream IS;
            if(connection.getResponseCode()==200){
                IS = connection.getInputStream();
            }else{
                IS = connection.getErrorStream();
            }

            BufferedReader br = new BufferedReader(new InputStreamReader(IS));
            StringBuilder sb = new StringBuilder();
            String line;
            while ((line = br.readLine()) != null) {
                sb.append(line);
                System.out.println(line);
            }
            org.json.JSONObject json= new org.json.JSONObject(sb.toString());                       //arse to JSON
            
            if(json.isNull("message")){                                         //CHECK ERROR CODE
             JSONObject meta = json.getJSONObject("meta");
             JSONObject acc=json.getJSONObject("account");
                if(acc.isNull("publicKey") || acc.getString("publicKey").equals("null")){
                    this.jPublicKeyField.setEnabled(true);
                }else{
                    this.jPublicKeyField.setText(acc.getString("publicKey"));
                }
                this.jStatusLabel.setText(meta.getString("status"));
                this.jBalanceLabel.setText(Long.toString(acc.getLong("balance")/1000000));
                if(acc.getLong("balance")<(Long.parseLong(this.jAmountLabel.getText().split(" ")[0])/1000000)+Integer.parseInt(this.jFeeLabel.getText().split(" ")[1])){
                    this.jRespLabel.setText(json.getString("FAILURE_INSUFFICIENT_BALANCE"));
                    return false;
                }
                return true;
            }else{
                this.jRespLabel.setText(json.getString("message")); 
                return false;
            }
        } catch (JSONException | NumberFormatException | IOException ex) {
                Logger.getLogger(Payout.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    private long calculateFee(long Amount){
        java.util.Random RNDC=new java.util.Random();
        long[] preset=new long[]{6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        long fee=0;
        Amount=10000;
        long minimumfee=Integer.parseInt(Double.toString(Math.max(2, 99 * Math.atan(Amount/1000000 / 150000))).split("\\.")[0]);
        if(minimumfee<6) minimumfee=6;
        System.out.println("min:"+minimumfee);
            for(int i=0;i>0;i++){
                //long rand=(RNDC.nextInt(10)+minimumfee)*1000000;
                long rand=preset[i]*1000000;
                if(!this.AllocatedFees.contains(new long[]{Amount,rand})){
                    System.out.println(rand);
                    fee=rand;
                    break;
                }
                if(i==preset.length) i=0;
            }
        return fee;
    }
    private void allocateFee(){
        this.AllocatedFees.clear();
        TableModel Table = this.jAddressTable.getModel();                                                                               //Get model
        long feeTotal=0;
        for(int Row=0; Row<Table.getRowCount(); Row++){                                                                                 //Go through
            long Amount=Long.parseLong(Table.getValueAt(Row, 1).toString());
            if(Table.getValueAt(Row, 3)==null || !Table.getValueAt(Row, 3).toString().equals("SUCCESS")){
                for(int i=6;i>0;i++){
                    long fee=i*1000000;
                    boolean has=false;
                    for(long[] a:this.AllocatedFees) if(a[0]==Amount && a[1]==fee) has=true;  //check if the fee is allocated yet
                    if(!has){                                                                 //if the fee is not allocated yet
                        this.AllocatedFees.add(new long[]{Amount,fee});                       //allocate it
                        System.out.println(fee+" "+has);
                        Table.setValueAt(i, Row, 2);                                          //take to the table
                        feeTotal+=i;                                                          //add to the table list
                        break;
                    } 
                }
            }
        }
        this.jFeeLabel.setText("+ "+feeTotal+" (XEM)");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField jAddressField;
    private javax.swing.JTable jAddressTable;
    private javax.swing.JLabel jAmountLabel;
    private javax.swing.JLabel jBalanceLabel;
    private javax.swing.JButton jCloseButton;
    private javax.swing.JLabel jFeeLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jOptionLabel;
    private javax.swing.JLabel jPKLabel;
    private javax.swing.JLabel jPRKLabel;
    private javax.swing.JButton jPayButton;
    private javax.swing.JTextField jPrivateKeyField;
    private javax.swing.JTextField jPublicKeyField;
    private javax.swing.JButton jRecalcButton;
    private javax.swing.JLabel jRespLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jSessionLabel;
    private javax.swing.JLabel jStatusLabel;
    // End of variables declaration//GEN-END:variables
}
