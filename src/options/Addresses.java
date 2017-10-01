/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package options;

import frame.MysqlAccess;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.sql.SQLException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Mxsxs2
 */
public class Addresses extends javax.swing.JPanel {
    private final MysqlAccess SQL = new MysqlAccess();
    private String[] Config;
    private final javax.swing.border.Border OriginalBorder;
    /**
     * Creates new form Addresses
     * @param URLs
     */
    public Addresses(String[] URLs) {
        initComponents();
        super.setBounds(0,0,870,577);
        this.Config=URLs;
        this.selectGroupIDs();
        this.fillAccounts();
        try{
            //this.generateAccount();
        }catch(Exception e){
            
        }
        this.OriginalBorder=this.jnxt1.getBorder();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Days = new javax.swing.ButtonGroup();
        jLayerOption1 = new javax.swing.JLayeredPane();
        jnxt1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jeditn1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jnxt2 = new javax.swing.JTextField();
        jeditn2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jnxt3 = new javax.swing.JTextField();
        jeditn3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jnxt4 = new javax.swing.JTextField();
        jeditn4 = new javax.swing.JLabel();
        jRespLabel = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jAllocatedBox = new javax.swing.JComboBox();
        jNewButton = new javax.swing.JButton();

        setMaximumSize(new java.awt.Dimension(870, 577));
        setMinimumSize(new java.awt.Dimension(870, 577));
        setName(""); // NOI18N
        setPreferredSize(new java.awt.Dimension(870, 577));

        jLayerOption1.setBorder(javax.swing.BorderFactory.createTitledBorder("Option 1"));
        jLayerOption1.setMaximumSize(new java.awt.Dimension(468, 123));
        jLayerOption1.setMinimumSize(new java.awt.Dimension(468, 123));
        jLayerOption1.setName(""); // NOI18N

        jnxt1.setMaximumSize(null);
        jnxt1.setMinimumSize(null);
        jnxt1.setName(""); // NOI18N
        jnxt1.setPreferredSize(null);

        jLabel1.setText("Option 1");

        jeditn1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jeditn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/save.png"))); // NOI18N
        jeditn1.setToolTipText("Edit");
        jeditn1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jeditn1.setMaximumSize(new java.awt.Dimension(20, 16));
        jeditn1.setMinimumSize(new java.awt.Dimension(20, 16));
        jeditn1.setPreferredSize(new java.awt.Dimension(20, 16));
        jeditn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jeditn1MouseClicked(evt);
            }
        });

        jLabel3.setText("Option 2");

        jnxt2.setMaximumSize(null);
        jnxt2.setMinimumSize(null);
        jnxt2.setName(""); // NOI18N
        jnxt2.setPreferredSize(null);

        jeditn2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jeditn2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/save.png"))); // NOI18N
        jeditn2.setToolTipText("Edit");
        jeditn2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jeditn2.setMaximumSize(new java.awt.Dimension(20, 16));
        jeditn2.setMinimumSize(new java.awt.Dimension(20, 16));
        jeditn2.setPreferredSize(new java.awt.Dimension(20, 16));
        jeditn2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jeditn2MouseClicked(evt);
            }
        });

        jLabel5.setText("Option 3");

        jnxt3.setMaximumSize(null);
        jnxt3.setMinimumSize(null);
        jnxt3.setName(""); // NOI18N
        jnxt3.setPreferredSize(null);

        jeditn3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jeditn3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/save.png"))); // NOI18N
        jeditn3.setToolTipText("Edit");
        jeditn3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jeditn3.setMaximumSize(new java.awt.Dimension(20, 16));
        jeditn3.setMinimumSize(new java.awt.Dimension(20, 16));
        jeditn3.setPreferredSize(new java.awt.Dimension(20, 16));
        jeditn3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jeditn3MouseClicked(evt);
            }
        });

        jLabel8.setText("Option 4");

        jnxt4.setMaximumSize(null);
        jnxt4.setMinimumSize(null);
        jnxt4.setName(""); // NOI18N
        jnxt4.setPreferredSize(null);

        jeditn4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jeditn4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/save.png"))); // NOI18N
        jeditn4.setToolTipText("Edit");
        jeditn4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jeditn4.setMaximumSize(new java.awt.Dimension(20, 16));
        jeditn4.setMinimumSize(new java.awt.Dimension(20, 16));
        jeditn4.setPreferredSize(new java.awt.Dimension(20, 16));
        jeditn4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jeditn4MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jLayerOption1Layout = new javax.swing.GroupLayout(jLayerOption1);
        jLayerOption1.setLayout(jLayerOption1Layout);
        jLayerOption1Layout.setHorizontalGroup(
            jLayerOption1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayerOption1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayerOption1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayerOption1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayerOption1Layout.createSequentialGroup()
                        .addComponent(jnxt1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jeditn1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jLayerOption1Layout.createSequentialGroup()
                        .addComponent(jnxt2, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jeditn2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jLayerOption1Layout.createSequentialGroup()
                        .addComponent(jnxt3, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jeditn3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jLayerOption1Layout.createSequentialGroup()
                        .addComponent(jnxt4, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jeditn4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jLayerOption1Layout.setVerticalGroup(
            jLayerOption1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayerOption1Layout.createSequentialGroup()
                .addGroup(jLayerOption1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jeditn1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jLayerOption1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jnxt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayerOption1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayerOption1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jnxt2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3))
                    .addComponent(jeditn2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayerOption1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayerOption1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jnxt3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5))
                    .addComponent(jeditn3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayerOption1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jeditn4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jLayerOption1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jnxt4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8)))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jLayerOption1.setLayer(jnxt1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayerOption1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayerOption1.setLayer(jeditn1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jeditn1.getAccessibleContext().setAccessibleName("edit");
        jLayerOption1.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayerOption1.setLayer(jnxt2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayerOption1.setLayer(jeditn2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayerOption1.setLayer(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayerOption1.setLayer(jnxt3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayerOption1.setLayer(jeditn3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayerOption1.setLayer(jLabel8, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayerOption1.setLayer(jnxt4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayerOption1.setLayer(jeditn4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        this.jRespLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel9.setText("Choosen Address Group:");

        jAllocatedBox.setToolTipText("Choose witch option would you like to edit");
        jAllocatedBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jAllocatedBoxItemStateChanged(evt);
            }
        });

        jNewButton.setText("Add New Unallocated Session Group");
        jNewButton.setToolTipText("The automatic session changer program will allocate it to the newest session id");
        jNewButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jNewButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jNewButton, javax.swing.GroupLayout.PREFERRED_SIZE, 482, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGap(8, 8, 8)
                                    .addComponent(jLabel9)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jAllocatedBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addComponent(jLayerOption1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jRespLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 739, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(121, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jRespLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(94, 94, 94)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jAllocatedBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLayerOption1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jNewButton)
                .addGap(0, 267, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jeditn1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jeditn1MouseClicked
        this.saveTextField(this.jnxt1,"nxt","1");
    }//GEN-LAST:event_jeditn1MouseClicked

    private void jeditn2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jeditn2MouseClicked
        this.saveTextField(this.jnxt2,"nxt","2");
    }//GEN-LAST:event_jeditn2MouseClicked

    private void jeditn3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jeditn3MouseClicked
        this.saveTextField(this.jnxt3,"nxt","3");
    }//GEN-LAST:event_jeditn3MouseClicked

    private void jeditn4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jeditn4MouseClicked
        this.saveTextField(this.jnxt4,"nxt","4");
    }//GEN-LAST:event_jeditn4MouseClicked

    private void jNewButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jNewButtonActionPerformed
        this.addNewAddressGroup();
    }//GEN-LAST:event_jNewButtonActionPerformed

    private void jAllocatedBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jAllocatedBoxItemStateChanged
        this.fillAccounts();
    }//GEN-LAST:event_jAllocatedBoxItemStateChanged
    private void addNewAddressGroup(){
        this.resetBorder();
        javax.swing.JTextField[] nxt=new javax.swing.JTextField[]{this.jnxt1,this.jnxt2,this.jnxt3,this.jnxt4};
        String[] Addresses=new String[4];
        int Invalid=0;
        for(int i=0; i<4; i++){
            nxt[i].setText(nxt[i].getText().trim());
            if(!this.chkAddress(nxt[i].getText(), "nxt")){
                this.jRespLabel.setText(nxt[i].getText()+" is not a valid address");
                nxt[i].setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.red));
                Invalid++;
            }else{
                Addresses[i]=nxt[i].getText();
            }
        }
        if(Invalid==0){
            java.sql.ResultSet Exists=this.SQL.PreparedSelect("optionaddresses", new String[]{"id"},"`nxt1`='"+Addresses[0]+"' AND `nxt2`='"+Addresses[1]+"' AND `nxt3`='"+Addresses[2]+"' AND `nxt4`='"+Addresses[3]+"'", "1", "");
            try {
                if(Exists==null){
                    boolean Insert=this.SQL.PreparedInsert("optionaddresses", new String[]{"nxt1","nxt2","nxt3","nxt4"}, new String[]{Addresses[0],Addresses[1],Addresses[2],Addresses[3]});
                    if(Insert){
                        this.jRespLabel.setText("Address group is saved.");
                        this.selectGroupIDs();
                        this.fillAccounts();
                    }else{
                        this.jRespLabel.setText("Could not save address group.");
                    }
                }else{
                    this.jRespLabel.setText("Address group is already exists.");
                }
            }finally{
                org.apache.commons.dbutils.DbUtils.closeQuietly(Exists);
            }
        }
    }
    private void resetBorder(){
        this.jnxt1.setBorder(this.OriginalBorder);
        this.jnxt2.setBorder(this.OriginalBorder);
        this.jnxt3.setBorder(this.OriginalBorder);
        this.jnxt4.setBorder(this.OriginalBorder);
    }
    private void editTextField(javax.swing.JTextField Field, java.awt.event.MouseEvent evt, String Currency){
        Field.setEnabled(true);
        javax.swing.JLabel label= (javax.swing.JLabel) evt.getSource();
        label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/save.png")));
        if(Field.isEnabled() && label.getToolTipText().equals("Save")){
            label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/loading.gif")));
            //this.saveTextField(Field, Currency, label);
        }
    }
    private void saveTextField(javax.swing.JTextField Field, String Currency, String Option){
        Field.setBorder(this.OriginalBorder);
        utils.AddressCheck check=new utils.AddressCheck();
                           if(check.openURL(this.Config[0], Field.getText(), Currency)){
                               //Label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/engine.png")));
                               //Label.setToolTipText("Edit");
                               if(this.updateAccount(Currency+Option, Field.getText())){
                                    Field.updateUI();
                                    this.jRespLabel.setText(Currency+" option "+Option+" is saved");
                                    //Field.setEnabled(false);
                               }else{
                                    Field.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.red));
                                    this.jRespLabel.setText("Could not save "+Currency+" option "+Option);
                               }
                           }else{
                               Field.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.red));
                               this.jRespLabel.setText(Field.getText()+" is not a valid address");
                               //Label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/save.png")));
                               //Label.setToolTipText("Save");
                           }
    }
    private boolean chkAddress(String Address, String Currency){
        utils.AddressCheck check=new utils.AddressCheck();
        return check.openURL(this.Config[0], Address, Currency);
    }
    private boolean updateAccount(String Collumn, String Value){
        return this.SQL.PreparedUpdate("optionaddresses", new String[]{Collumn},new String[]{Value},"","");
    }
    private void selectGroupIDs(){
        java.sql.ResultSet RS=this.SQL.PreparedSelect("optionaddresses", new String[]{"id","session"},"","0","`id` DESC");
        if(RS!=null){
            try {
                RS.last();
                int RSSize=RS.getRow();
                RS.beforeFirst();
                int index=0;
                while(RS.next()){
                    String Text;
                    if(!"0".equals(RS.getString("session"))){
                        Text="Group: "+RS.getString("id")+" is allocated to session: "+RS.getString("session");
                    }else{
                        Text="Group: "+RS.getString("id")+" is not allocated";
                    }
                    this.jAllocatedBox.addItem(Text);
                }
            } catch (SQLException ex) {
                Logger.getLogger(Addresses.class.getName()).log(Level.SEVERE, null, ex);
            }finally{
                org.apache.commons.dbutils.DbUtils.closeQuietly(RS);
            }
        }
    }
    private void fillAccounts(){
       if(this.jAllocatedBox.getItemCount()>0){
            String SelectedItem=(String)this.jAllocatedBox.getSelectedItem();
            String[] IDA=SelectedItem.split(" ");
            java.sql.ResultSet RS=this.SQL.PreparedSelect("optionaddresses", new String[]{"nxt1","nxt2","nxt3","nxt4"},"`id`='"+IDA[1]+"'","1","");
            try{
                if(RS.first()){
                    this.jnxt1.setText(RS.getString("nxt1"));
                    this.jnxt2.setText(RS.getString("nxt2"));
                    this.jnxt3.setText(RS.getString("nxt3"));
                    this.jnxt4.setText(RS.getString("nxt4"));
                }
            }catch(Exception ex){
            }finally{
                org.apache.commons.dbutils.DbUtils.closeQuietly(RS); 
            }
       }
    }
    private String[] generateAccount() throws Exception{
        //change from this
        URL url = new URL(this.Config[4]+"nxt");                                         //The url for nxt/nis
        //String phrase = Long.toBinaryString(new java.util.Date().getTime())+"Kailin";
        Map<String,Object> params = new LinkedHashMap<>();                               //Parameters hasmap
        params.put("requestType", "getAccountId");                                       //.put(key, value)
        params.put("secretPhrase", "something");
        ///change until this NOT MORE
        
        StringBuilder postData = new StringBuilder();                       
        for (Map.Entry<String,Object> param : params.entrySet()) {                          //Add parameters
            if (postData.length() != 0) postData.append('&');
            postData.append(URLEncoder.encode(param.getKey(), "UTF-8"));
            postData.append('=');
            postData.append(URLEncoder.encode(String.valueOf(param.getValue()), "UTF-8"));
        }
        byte[] postDataBytes = postData.toString().getBytes("UTF-8");                               //set charset
        HttpURLConnection conn = (HttpURLConnection)url.openConnection();
        conn.setRequestMethod("POST");                                                              //set request type
        conn.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
        conn.setRequestProperty("Content-Length", String.valueOf(postDataBytes.length));
        conn.setDoOutput(true);
        conn.getOutputStream().write(postDataBytes);

        BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream(), "UTF-8"));
        StringBuilder sb = new StringBuilder();
        String line;
        //System.out.println("Phrase: "+phrase);
        while ((line = br.readLine()) != null) {
            //check answer from the server line by line. or parse it to JSON
            sb.append(line);
            System.out.println(line);
        }
        org.json.JSONObject json= new org.json.JSONObject(sb.toString());                       //arse to JSON
        if(json.isNull("errorCode")){                                                           //CHECK ERROR CODE
            System.out.println(json.getString("accountRS"));
            System.out.println(json.getString("publicKey"));
            return new String[]{json.getString("accountRS"),json.getString("publicKey")};
        }else{
            return null;
        }
    }
    private void doPOSTRequest(String URLAddres, String[] Keys, String[] Values) throws Exception{
        //change from this
        URL url = new URL(URLAddres);                                           //The url for nxt/nis
        Map<String,Object> params = new LinkedHashMap<>();                      //Parameters hasmap
        for(int i=0; i<Keys.length; i++) params.put(Keys[i], Values[i]);        //Tkae parameters to map
        
        StringBuilder postData = new StringBuilder();                       
        for (Map.Entry<String,Object> param : params.entrySet()) {                          //Add parameters
            if (postData.length() != 0) postData.append('&');
            postData.append(URLEncoder.encode(param.getKey(), "UTF-8"));
            postData.append('=');
            postData.append(URLEncoder.encode(String.valueOf(param.getValue()), "UTF-8"));
        }
        byte[] postDataBytes = postData.toString().getBytes("UTF-8");                               //set charset
        HttpURLConnection conn = (HttpURLConnection)url.openConnection();
        conn.setRequestMethod("POST");                                                              //set request type
        conn.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
        conn.setRequestProperty("Content-Length", String.valueOf(postDataBytes.length));
        conn.setDoOutput(true);
        conn.getOutputStream().write(postDataBytes);

        BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream(), "UTF-8"));
        StringBuilder sb = new StringBuilder();
        String line;
        while ((line = br.readLine()) != null) {
            //check answer from the server line by line. or parse it to JSON
        }
        org.json.JSONObject json= new org.json.JSONObject(sb.toString());                       //arse to JSON
        if(json.isNull("errorCode")){                                                           //CHECK ERROR CODE
            //DO SOMETHING WITH ERROR
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup Days;
    private javax.swing.JComboBox jAllocatedBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayerOption1;
    private javax.swing.JButton jNewButton;
    private javax.swing.JLabel jRespLabel;
    private javax.swing.JLabel jeditn1;
    private javax.swing.JLabel jeditn2;
    private javax.swing.JLabel jeditn3;
    private javax.swing.JLabel jeditn4;
    private javax.swing.JTextField jnxt1;
    private javax.swing.JTextField jnxt2;
    private javax.swing.JTextField jnxt3;
    private javax.swing.JTextField jnxt4;
    // End of variables declaration//GEN-END:variables
}