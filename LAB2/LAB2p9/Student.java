package LAB2.LAB2p9;

public class Student {

    private String name;
    private Address fulladdress;

    public Student(String Name , Address address){

        this.name = Name;
        this.fulladdress = address;
    }

    public String getFullAddress() {
        return this.fulladdress.getFullAddress();
    }

    public void displayProfile(){

        System.out.println("Name : " + name );
        System.out.println("address : " + getFullAddress());

    }
}
