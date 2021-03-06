package lieferdienst;
import java.util.concurrent.atomic.AtomicInteger;
// Private : no access from outside possible
// public  : Provision of dedicated access methods for reading and writing
//////////////////////////////////Start Class Customer/////////////////////////

public class Customer extends User{

    static final AtomicInteger customer_Id = new AtomicInteger(1);
    private int customerId ; // Class Customer add a new Instance variable
    ///////////////////////////Constructor//////////////////////////
    public Customer(String firstName, String lastName, String birthDay,String phoneNumber, String email,String password,String street,String houseNumber,int zipCode,String city)
    {
        super(firstName,lastName,birthDay,phoneNumber,email,password,street,houseNumber,zipCode,city);   // Coll Superclass User
        this.customerId = customer_Id.getAndIncrement();
    }
    //////////////////////////////////Getter////////////////////////////
    public int getCustomerId()             // Methode getCustomerId return only the Customer's Id
    {
        return customerId;
    }
}
/////////////////////////////////////End of class Customer/////////////////////////////////

