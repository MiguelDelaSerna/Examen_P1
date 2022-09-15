import java.util.LinkedList;

public class Culture {

    private String name;
    private String description;
    private LinkedList<String> relatedContries;
    private LinkedList<Deity>deities;
    public Culture(String name, String description){
        this.name=name;
        this.description=description;
        relatedContries=new LinkedList<>();
        deities=new LinkedList<>();
    }

    public void addRelatedCountry(String countryName){
        relatedContries.add(countryName);
    }

    public void addDeity(Deity deity){
        deities.add(deity);
    }

    public String getName(){
        return name;
    }
    public String getDescription(){
        return description;
    }
    public LinkedList<String>getRelatedContries(){
        return relatedContries;
    }
    public LinkedList<Deity>getDeities(){
        return deities;
    }


}
