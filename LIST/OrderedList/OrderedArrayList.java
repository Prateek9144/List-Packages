package OrderedList;

public class OrderedArrayList implements List
{
    Object arr[];
    Integer size;
    Integer buffer ;    
    public OrderedArrayList()
    {
        buffer = 5;
        size = 0;
        arr = new Object[buffer];
    }
    public void add(Integer j)
    {
        if(size==0)
            arr[size]=j;
        size++;
        if(size>=buffer)
        {
            buffer*=2;
            Object arr2[] = new Object[buffer];
            for(int i=0;i<size-1;i++)
            arr2[i]=arr[i];
            arr=arr2;
        }   
        int i;
            for(i=0;i<size-1;i++)
            {
                if(j<(Integer)arr[i])
                {
                    for(int k=size-1;k>=i;k--)
                    arr[k+1]=arr[k];            
                    arr[i]=j;
                    break;
                }
            }
            if(arr[i]==null)
            arr[i]=j;               
    }
    public void remove(Integer i)
    {
        OrderedArrayList ob=new OrderedArrayList();
        for(;i<size;i++)
        arr[i-1]=arr[i]; 
        size--;
    }
    public void TRAVERSE()
    {
        for(int j=0;j<size;j++)
        System.out.println(arr[j]);
    }
     
    
}

