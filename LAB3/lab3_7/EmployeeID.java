package LAB3.lab3_7;

public class EmployeeID {
    
    private String EmployeeId;
    private String Department;

    public EmployeeID (String employeeid , String department ){
        
        this.EmployeeId = employeeid;
        this.Department = department;
    }

    public String getEmploydeeId(){
        return EmployeeId;
    }

    public String getDeparment(){
        return Department;
    }

    public void setDepartment (String newDepartment){
        
        this.Department = newDepartment;
    }
    
}
