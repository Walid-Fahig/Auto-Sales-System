
package SwingGUI;

import Table.Sales;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class Salesjtable extends AbstractTableModel{
    
    public static final int OBJECT =-1;
    public static final int ID =0;
   // public static final int MODEL_ID =1;
    public static final int PRICE=1;
   // public static final int YEAR=3;
    public static final int DATE=2;
    public static final int PAYMENT_TYPE=3;
    public static final int USER_ID=4;
   
    private String[] columnNames ={"ID","Price","Date","payment_type","user_id"};
     
    private List<Sales> sales;
    
    public Salesjtable(List<Sales> theSaleses){
        sales =theSaleses;
    }
    
    @Override
    public int getColumnCount(){
        return columnNames.length;
    }
    
    @Override
    public int getRowCount(){
        return sales.size();
    }
    
    @Override
    public String getColumnName(int col){
        return columnNames[col];
    }
    
    @Override
    public Object getValueAt(int row, int col){
        
        Sales tablesales =sales.get(row);
        switch(col) {
            case ID:
                return tablesales.getId();
           // case MODEL_ID:
              //  return tablesales.getModel_id();
            case PRICE:
                return tablesales.getPrice();
          //  case YEAR:
           //     return tablesales.getYear();
            case DATE:
                return tablesales.getDate();
            case PAYMENT_TYPE:
                return tablesales.getPayment_type();
            case USER_ID:
                return tablesales.getUser_id();
            case OBJECT:
                return tablesales;
            default:
                return tablesales.getUser_id();       
        }//End switch
    }
    
    @Override
    public Class getColumnClass(int c){
        return getValueAt(0, c).getClass();
    }
    
}//End class
