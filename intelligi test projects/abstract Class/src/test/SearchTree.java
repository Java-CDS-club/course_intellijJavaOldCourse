package test;

public class SearchTree implements NodeList
{
    private ListItem root = null;

    public SearchTree(ListItem root) {
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        return root;
    }

    @Override
    public boolean addItem(ListItem item) {
        if (item != null)
        {
            if (root == null)
            {
                root = item;
                return true;
            }
            else
            {
                ListItem current = root;
                ListItem p = current;
                while (current != null)
                {
                    int comparison = current.compareTo(item);
                    if (comparison < 0)
                    {
                        p = current;
                        current = current.next();
                    }
                    else if (comparison > 0)
                    {
                        p = current;
                        current =current.previous();
                    }
                    else
                    {
                        return false;
                    }
                }
                int comparison = p.compareTo(item);
                if (comparison < 0 )
                {
                    p.setNext( item);
                    return true;
                }
                else if (comparison > 0)
                {
                    p.setPrevious(item);
                    return true;
                }
                else return false;
            }
        }
        return false;
    }

    @Override
    public boolean removeItem(ListItem item) {
        if (item != null)
        {
            ListItem current = root;
            ListItem parent = current;
            while (current != null)
            {
                int comparison = current.compareTo(item);
                if (comparison < 0 ) {
                    parent = current;
                    current = current.next();
                }
                else if (comparison > 0)
                {
                    parent = current ;
                    current = current.previous();
                }
                else {
                    performRemoval(parent , current);
                    return true;
                }
            }
            return false;
        }
        return false;
    }
    private void performRemoval(ListItem parent , ListItem current)
    {
        int comparison = current.compareTo(parent);
        if (comparison <0) {
            if (current.previous() == null) {
                parent.setPrevious(current.next());
                return;
            } else if (current.next() == null) {
                parent.setPrevious(current.previous());
                return;
            }
        }else if (comparison > 0) {
            if (current.previous() == null) {
                parent.setNext(current.next());
                return;
            } else if (current.next() == null) {
                parent.setNext(current.previous());
                return;
            }
        }
        ListItem toLeft = current.previous();
        ListItem slave1 = toLeft;
        ListItem slave2 = toLeft;
        toLeft = toLeft.previous();
        slave1 = slave1.previous();
        while (toLeft != null)
        {
            slave2 = slave1;
            slave1 = toLeft;
            toLeft = toLeft.previous();
        }
        current.setValue(slave1.getValue());
        slave2.setPrevious(null);
    }

    @Override
    public void traverse(ListItem root)
    {
        if (root != null)
        {
            traverse(root.previous());
            System.out.println(root.getValue());
            traverse(root.next());
        }
    }

}
