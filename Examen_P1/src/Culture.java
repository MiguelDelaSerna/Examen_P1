import java.util.LinkedList;

class Culture {

     private String name;
     private String descripcion;
     public  int enrolled;

     Culture(String name, String descripcion) {
         this.name = name;
         this.descripcion = descripcion;

     }

     public void setName(String name) {
         this.name = name;
     }

     public String getName() {
         return name;
     }
     
     public void setDescription(String descripcion){
         this.descripcion = descripcion;
     }
     public  String getDescription(){
         return descripcion;
     }
     
     

     public boolean addRelatedCountry(String name) {
         if(enrolled <name.length){
             name[enrolled++] = name;
             return true;
         }
     }

     public boolean addDeity(Deity deity){
         if(enrolled <descripcion.length){
             deity[enrolled++] = deity;
             return true;
         }

     }

     public LinkedList<String> getRelatedContries() {
     }

    public List<Deity> getDeities() {
    }
}







