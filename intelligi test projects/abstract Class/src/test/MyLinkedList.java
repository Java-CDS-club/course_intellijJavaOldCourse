package test;

public class MyLinkedList implements NodeList
{
    private ListItem root = null;

    public MyLinkedList(ListItem root) {
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        return this.root;
    }

    @Override
    public boolean addItem(ListItem item) {
        if (item != null)
        {
            if (root == null)
            {
                this.root = item;
                return true;
            }
            else
            {
                ListItem current = root;
                while (current != null) {
                    int comparison = current.compareTo(item);
                    if (comparison < 0) {
                        current = current.next();
                    }
                    else if (comparison == 0 )
                    {
                        return false;
                    }
                    else
                    {
                        item.setPrevious(current.previous());
                        item.setNext(current);
                        current.setPrevious(item);
                        item.previous().setNext(item);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override
    public boolean removeItem(ListItem item) {
        if (root != null)
        {
            ListItem current = root;
            while (current != null) {
                int comparison = current.compareTo(item);
                if (comparison < 0 )
                {
                    current = current.next();
                }
                else if (comparison > 0)
                {
                    return false;
                }
                else
                {
                    if (current.next()!= null)
                        current.next().setPrevious(current.previous());
                    current.previous().setNext(current.next());
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public void traverse(ListItem root) {
        if (root == null)
        {
            System.out.println("The list is empty");
        }
        else {
            while (root != null) {
                System.out.println(root.getValue());
                root = root.next();
            }
        }
    }
}
