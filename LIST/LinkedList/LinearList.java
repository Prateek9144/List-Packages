package LinkedList;
public class LinearList<DataType> implements List<DataType>
{
    Listobject<Integer> head=null;
    Listobject<Integer> tail=null;
    Integer size;
    public  LinearList()
    {
        size = 0;
    } 

    public void add(Integer i)
    {
        Listobject<Integer> ob=new Listobject<Integer>(i);

        if(head==null)
        {
            tail=ob;
            head=ob;
            size++;
        }
        else
        {
            tail.next=ob;
            tail=ob;
        }
    }

    public void add(Integer i,Integer pos)
    {
        try{
            if(pos<1&&pos>size)
                throw new BoundsException();
        }
        catch(BoundsException e)
        {
            e.printError();
        }
        Listobject<Integer> ob=new Listobject<Integer>(i);
        Listobject<Integer> position=head;
        for(int j=1;j<=size;j++)
        {   
            if(j==pos-1){
                ob.next=position.next;
                position.next=ob;
                break;
            }
            else
                position=position.next;
        }
    }

    public void remove(Integer i)
    {
        Listobject<Integer> position=head;
        for(int j=1;j<=size;j++)
        {   
            if(j==i-1){
                position.next=position.next.next;
                break;
            }
            else
                position=position.next;
        }           
    }

    public void TRAVERSE()
    {
        Listobject<Integer> ob=head;
        while (ob!=null)
        {
            System.out.println(ob.val);
            ob=ob.next;
        }
    }
}

