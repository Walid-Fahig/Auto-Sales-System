package Table;

public class Model {

    private int id;
    private String make;
    private String Name;
    private String _class;
    private int sum;

    public Model(int id, String make, String Name, String _class) {
        this.id = id;
        this.make = make;
        this.Name = Name;
        this._class = _class;
    }

    
    public Model(String make, String name, String _class) {
        this.make = make;
        this.Name = name;
        this._class = _class;
    }

    public Model() {
       
    }

    public int getsum(){
        return sum;
    }
    
    public void setsum(int sum){
        this.sum=sum;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getmake() {
        return make;
    }

    public void setmake(String make) {
        this.make = make;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getclass() {
        return _class;
    }

    public void setclass(String _class) {
        this._class = _class;
    }

    @Override
    public String toString() {
        return String
                .format("Model [id=%s, make=%s, Name=%s, _class=%s]",
                        id, make, Name, _class);
    }

    public Model setsum(Model model) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
