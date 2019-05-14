package rentcarmanagerment.view;

import java.sql.SQLException;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;
import lombok.NoArgsConstructor;
import rentcarmanagerment.dao.StatByMonthDAO;
import rentcarmanagerment.model.IncomeStatByMonth;

/**
 *
 * @author Tran Phuc
 */

@NoArgsConstructor
public class StatByMonthDetailsFrm extends JFrame {

    private DefaultTableModel model;
    
    private List<IncomeStatByMonth> is;
    
    /**
     * Creates new form StatByMonthDetailsFrm
     * @param year
     * @param month
     * @param transactions
     * @param revenueContract
     * @param costIncurred
     * @param actualRevenue
     * @throws java.sql.SQLException
     */
    public StatByMonthDetailsFrm(String year, int month, int transactions, double revenueContract, double costIncurred, double actualRevenue) throws SQLException {
        super("Detailed Statistic");
        initComponents();
        lbTitle.setText("The detailed revenue statistics in: "+month);
        model = (DefaultTableModel) tableDetails.getModel();
        fillTable(year, month, transactions, revenueContract, costIncurred, actualRevenue);
    }
    
    private void fillTable(String year, int month, int transactions, double revenueContract, double costIncurred, double actualRevenue) throws SQLException {
        model.addRow(new Object[]{
            "Tháng " + month,
            transactions,
            revenueContract,
            costIncurred,
            actualRevenue
        });
        StatByMonthDAO dao = new StatByMonthDAO();
        
            is = dao.getIncomeStatDetails(year, month);
            for(IncomeStatByMonth i : is) {
                model.addRow(new Object[]{
                    i.getTime(),
                    i.getNumOfTransactions(),
                    i.getRevenueFromContract(),
                    i.getSumCostIncurred(),
                    i.getActualRevenue()
                });
            }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbTitle = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableDetails = new javax.swing.JTable();
        btnClose = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        mHome = new javax.swing.JMenu();
        mType = new javax.swing.JMenu();
        itemByTime = new javax.swing.JMenuItem();
        itemByCar = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbTitle.setText("Statistic details for a month: 4");

        tableDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Ngày", "Số giao dịch hoàn thành", "Doanh thu theo hợp đồng", "Thu phát sinh", "Thực thu"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableDetails.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tableDetails);
        if (tableDetails.getColumnModel().getColumnCount() > 0) {
            tableDetails.getColumnModel().getColumn(0).setMinWidth(65);
            tableDetails.getColumnModel().getColumn(0).setMaxWidth(65);
            tableDetails.getColumnModel().getColumn(1).setMinWidth(150);
            tableDetails.getColumnModel().getColumn(1).setMaxWidth(150);
            tableDetails.getColumnModel().getColumn(2).setMinWidth(160);
            tableDetails.getColumnModel().getColumn(2).setMaxWidth(160);
            tableDetails.getColumnModel().getColumn(3).setMinWidth(100);
            tableDetails.getColumnModel().getColumn(3).setMaxWidth(100);
            tableDetails.getColumnModel().getColumn(4).setMinWidth(100);
            tableDetails.getColumnModel().getColumn(4).setMaxWidth(100);
        }

        btnClose.setText("Close");
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });

        mHome.setIcon(new javax.swing.ImageIcon("C:\\Users\\Admin\\Documents\\NetBeansProjects\\ptit-cnpm\\quanlithuexetulai\\image\\home-icon.png")); // NOI18N
        mHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mHomeMouseClicked(evt);
            }
        });
        jMenuBar1.add(mHome);

        mType.setText("Type");
        mType.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                mTypeMouseEntered(evt);
            }
        });

        itemByTime.setText("By Time");
        itemByTime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemByTimeActionPerformed(evt);
            }
        });
        mType.add(itemByTime);

        itemByCar.setText("By Car");
        itemByCar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemByCarActionPerformed(evt);
            }
        });
        mType.add(itemByCar);

        jMenuBar1.add(mType);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 576, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbTitle)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbTitle)
                    .addComponent(btnClose))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mHomeMouseClicked
        this.setVisible(false);
        new ManagerHomeFrm(LoginFrm.name).setVisible(true);
    }//GEN-LAST:event_mHomeMouseClicked

    private void itemByTimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemByTimeActionPerformed
        System.out.println("Already Showed");
    }//GEN-LAST:event_itemByTimeActionPerformed

    private void itemByCarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemByCarActionPerformed
        this.setVisible(false);
        new StatByCarFrm().setVisible(true);
    }//GEN-LAST:event_itemByCarActionPerformed

    private void mTypeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mTypeMouseEntered
        mType.doClick();
    }//GEN-LAST:event_mTypeMouseEntered

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnCloseActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClose;
    private javax.swing.JMenuItem itemByCar;
    private javax.swing.JMenuItem itemByTime;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbTitle;
    private javax.swing.JMenu mHome;
    private javax.swing.JMenu mType;
    private javax.swing.JTable tableDetails;
    // End of variables declaration//GEN-END:variables
}
