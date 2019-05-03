
package SwingGUI;

import Table.Car;
import java.util.List;
import javax.swing.table.AbstractTableModel;




public class Carjtable extends AbstractTableModel{
    
    public static final int OBJECT =-1;
    public static final int ID =0;
    public static final int DATE=1;
    public static final int MODEL_ID=2;
    public static final int COLOR=3;
    public static final int YEAR=4;
    public static final int PRICE=5;
    
    private String[] columnNames ={"ID","Date","Model_Id","Color","Year","Price"};
    
    private List<Car> car;
    
    public Carjtable(List<Car> theCar){
        car =theCar;
    }
    
    @Override
    public int getColumnCount(){
        return columnNames.length;
    }
    
    @Override
    public int getRowCount(){
        return car.size();
    }
    
    @Override
    public String getColumnName(int col){
        return columnNames[col];
    }
    
    @Override
    public Object getValueAt(int row, int col){
        
        Car tablecar =car.get(row);
        
        switch(col) {
            case ID:
                return tablecar.getId();
            case DATE:
                return tablecar.getDate();
            case MODEL_ID:
                return tablecar.getModel_id();
            case COLOR:
                return tablecar.getColor();
            case YEAR:
                return tablecar.getYear();
            case PRICE:
                return tablecar.getPrice();
            case OBJECT:
                return tablecar;
            default:
                return tablecar.getModel_id();       
        }//End switch
    }
    
    @Override
    public Class getColumnClass(int c){
        return getValueAt(0, c).getClass();
    }
    
}//End class
