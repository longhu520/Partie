/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manips.ihm;


import java.util.Observable;
import java.util.Observer;
import javax.swing.table.AbstractTableModel;
import manips.Partie;

/**
 *
 * @author PaulPark
 */
public class HistoryPanel extends javax.swing.JPanel implements Observer{
    private Partie partie;
    private ModeleTableau modeleTableau;
    /**
     * Creates new form HistoryPanel
     */
    public HistoryPanel(Partie partie) {
        this.partie = partie;
        modeleTableau = new ModeleTableau();
        partie.addObserver(HistoryPanel.this);
        initComponents();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        jTable1.setModel(modeleTableau);
        jScrollPane2.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 466, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 356, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

    @Override
    public void update(Observable o, Object arg) {
        modeleTableau.fireTableDataChanged();
    }
    
    private class ModeleTableau extends AbstractTableModel {

        /**
         * renvoie le nb des lignes 
         * @return 
         */
        @Override
        public int getRowCount() {
            return partie.getList().size();
        }

        /**
         * renvoie le nb des colonnes
         * @return 
         */
        @Override
        public int getColumnCount() {
            return 5;
        }

        /**
         * renvoie le nom de la colonne
         * "n", "Choix A", "Choix B", "Gain A", "Gain B"
         * @param column
         * @return 
         */
        @Override
        public String getColumnName(int column) {
            String res;
            switch(column){
                case 0:
                    res = "n°";
                    break;
                case 1:
                    res = "Choix A";
                    break;
                case 2:
                    res = "Choix B";
                    break;
                case 3:
                    res = "Gain A";
                    break;
                case 4:
                    res = "Gain B";
                    break;
                default:
                    res = "";
            }
            return res;
        }

        /**
         * renvoie le contenu de tableau
         * @param rowIndex
         * @param columnIndex
         * @return 
         */
        @Override
        public Object getValueAt(int rowIndex, int columnIndex) {
            Object result;
            switch (columnIndex) {
                case 0:
                    result = rowIndex;
                    break;
                case 1:
                    result = partie.getList().get(rowIndex).getAString();
                    break;
                case 2:
                    result = partie.getList().get(rowIndex).getBString();
                    break;
                case 3:
                    result = partie.getList().get(rowIndex).getGainA();
                    break;
                case 4:
                    result = partie.getList().get(rowIndex).getGainB();
                    break;
                default:
                    result = "";

            }
            return result;
        }
    
}

}
