import java.util.ArrayList;

public class Bank
{
    private String name ;
    private ArrayList<Branch> branches;

    public Bank(String name)
    {
        this.name = name;
        this.branches = new ArrayList<Branch>();
    }
    private Branch findBranch(String name)
    {
        for (int i = 0 ; i < branches.size() ; i++  )
        {
            if (branches.get(i).getName().equals(name))
            {
                return branches.get(i);
            }
        }
        return null;
    }
    public boolean listCustomers(String name , boolean print)
    {
        Branch branch = findBranch(name);
        if (branch != null)
        {
            System.out.println("Customer details for branch "+branch.getName());
            for (int i = 0 ; i < branch.getCustomers().size() ; i++)
            {
                System.out.println("Customer: "+branch.getCustomers().get(i).getName() +"["+(i+1)+"]");
                if (print)
                {
                    System.out.println("Transactions");
                    for (int j = 0; j < branch.getCustomers().get(i).getTransactions().size();j++)
                    {
                        System.out.println("["+(j+1)+"] Amount " +branch.getCustomers().get(i).getTransactions().get(j) );
                    }
                }
            }
            return true;
        }
        return false;
    }
    public boolean addBranch(String name )
    {
        if (findBranch(name) == null)
        {
            this.branches.add(new Branch(name));
            return true;
        }
        return false;
    }
    public boolean addCustomer(String branchName , String name , double transaction)
    {
        Branch b = findBranch(branchName);
        if (b != null)
        {
            return b.newCustomer(name , transaction);
        }
        return false;
    }
    public boolean addCustomerTransaction(String branchName , String name , double transaction)
    {
        Branch b = findBranch(branchName);
        if (b != null)
        {
           return b.addCustomerTransaction(name, transaction);
        }
        return false;
    }
}
