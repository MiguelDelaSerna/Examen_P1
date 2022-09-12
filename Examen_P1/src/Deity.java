import java.util.LinkedList;

public class Deity {

    String name;
    String descripcion;
    Deity(String name, String descripcion) {
        this.name = name;
        this.descripcion = descripcion;

    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addParent(Deity deity){

    }


    public Object getDescription() {
        return  descripcion;
    }

    public LinkedList<Deity> getParents() {
        return LinkedList;
    }
}
