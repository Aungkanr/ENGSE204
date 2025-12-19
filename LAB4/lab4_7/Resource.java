package LAB4.lab4_7;

public class Resource {
     
    private String id;

    public Resource (String id){
        
        this.id = id;
        System.out.println("Resource " + id + " creatrd. ");
    }

    protected void finalize() throws Throwable {

        super.finalize();
        System.out.println("Resource " + id + " finalized (destroyed). " );
    }
}
