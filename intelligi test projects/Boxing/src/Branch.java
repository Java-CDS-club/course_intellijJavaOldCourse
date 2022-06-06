import java.util.ArrayList;

public class Branch
{
    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name)
    {
        this.name = name;
        this.customers =  new ArrayList<Customer>();
    }
    private Customer findCustomer(String name)
    {
        for (int i = 0 ; i < this.customers.size() ; i++)
        {
            if (this.customers.get(i).getName().equals(name))
                return this.customers.get(i);
        }
        return null;
    }
    public boolean addCustomerTransaction(String name , double transaction)
    {
        Customer c = findCustomer(name);
        if (c != null)
        {
            c.getTransactions().add(transaction);
            return true;
        }
        return false;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }
    public boolean newCustomer(String name , double initialTransaction)
    {
        if (findCustomer(name) == null)
        {
            this.customers.add(new Customer(name , initialTransaction));
            return true;
        }
        return false;
    }
}
