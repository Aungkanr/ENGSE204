package LAB2.LAB2p9;

public class Address {
    
    private String street;
    private String city;
    private String zipCode;
 
    public Address (String tanun ,String maeng ,String lektiban) {

        this.street = tanun;
        this.city = maeng;
        this.zipCode = lektiban;

    } 
    public String getFullAddress() {
        return street + " , "  + city +  " , " + zipCode ;
    }
}