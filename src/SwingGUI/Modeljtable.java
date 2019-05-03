
package SwingGUI;

import Table.Model;
import java.util.List;
import javax.swing.table.AbstractTableModel;


public class Modeljtable extends AbstractTableModel {
    
    public static final int OBJECT =-1;
    public static final int ID =0;
    public static final int MAKE =1;
    public static final int NAME =2;
    public static final int CLASS=3;

    private String[] columnNames ={"ID","make","Name","Class"};

    private List<Model> model;
    
    public Modeljtable(List<Model> theModel){
        model =theModel;
    }
    
    @Override
    public int getColumnCount(){
        return columnNames.length;
    }
    
    @Override
    public int getRowCount(){
        return model.size();
    }
    
    @Override
    public String getColumnName(int col){
        return columnNames[col];
    }
    
    @Override
    public Object getValueAt(int row, int col){
        
        Model mode =model.get(row);
        
        switch(col) {
            case ID:
                return mode.getId();
            case MAKE:
                return mode.getmake();
            case NAME:
                return mode.getName();
            case CLASS:
                return mode.getclass();
            case OBJECT:
                return mode;
            default:
                return mode.getName();       
        }//End switch
    }
        
    @Override
    public Class getColumnClass(int c){
        return getValueAt(0, c).getClass();
    }
    
}//End class
