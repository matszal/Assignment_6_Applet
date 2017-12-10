import java.io.Serializable;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mark Pendergast
 */
public class Customer implements Serializable{
    private static final long serialVersionUID = -6100593593525369124L;
    String id = "";
    String firstName = "";
    String lastName = "";
    String address1 = "";
    String address2 = "";
    String city = "";
    String state = "";
    String zipCode = "";
    String phonenumber = "";
    String emailAddress = "";
    /**
     * 
     *  Default constructor
     */
    public Customer()
    {
        
    }
    /**
     *  working constructor
     * @param i ID
     * @param f first name
     * @param l last name
     * @param a1 address 1
     * @param a2 address 2
     * @param c city
     * @param s state
     * @param z zipcode
     * @param p phone
     */
    public Customer(String i, String f, String l, String a1, String a2, String c, String s, String z, String p, String e)
    {
     id = i;
     firstName = f;
     lastName = l;
     address1 = a1;
     address2 = a2;
     city = c;
     state = s;
     zipCode = z;
     phonenumber = p;
     emailAddress = e;
    }
    /**
     *  Converts object to a string
     * @return String
     */
    
    @Override
    public String toString()
    {
      return id+ " : "+firstName + ", " + lastName;
    }
}
