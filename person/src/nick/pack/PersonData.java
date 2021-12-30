package nick.pack;

public class PersonData {
    private final String NAME = "Иванов Иван";
    private String role;
    private int salary;


    public void setRole(String role){
        this.role = role;
    }
    public void setSalary(int salary){
        this.salary = salary;
    }
    public String getName(){
        return NAME;
    }
    public String getRole(){
        return role;
    }
    public int getSalary(){
        return salary;
    }
}
