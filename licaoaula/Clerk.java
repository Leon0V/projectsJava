package licaoaula;

public class Clerk {

    private String clerkName;
    // private String employeeID;

    public String getClerkName() {
        return clerkName;
    }
    public void setClerkName(String clerkName) {
        this.clerkName = clerkName;
    }
    
    @Override
    public String toString() {
        return "Vendedor: " + clerkName; 
    }
}
