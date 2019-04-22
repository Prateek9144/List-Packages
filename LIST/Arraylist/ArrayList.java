package Arraylist;
public class ArrayList implements List
{
    Object arr[];
    Integer size;
    Integer buffer ;    
   public ArrayList()
    {
        buffer = 5;
        size = 0;
        arr = new Object[buffer];
    }
    public void add(Integer j)
    {
        arr[size]=j;
        size++;
        if(size==buffer)
        {
            buffer*=2;
            Object arr2[] = new Object[buffer];
            for(int i=0;i<size;i++)
            arr2[i]=arr[i];
            arr=arr2;
        }

    }
    public void TRAVERSE()
    {
        for(int j=0;j<size;j++)
        System.out.println(arr[j]);
    }
    public void add(Integer y,Integer pos)
    {
        try{
            if(pos<0||pos>size)
            {
                BoundsException ob=new BoundsException();
                throw ob;
            }
        }   
        catch(BoundsException b)
        {
            b.printError();
            return;
        }
        for(int k=size;k>=pos;k--)
        {
            arr[k]=arr[k-1];
        }
        arr[pos-1]=y;
        size++;
        if(size==buffer)
        {
            buffer*=2;
            Object arr2[] = new Object[buffer];
            for(int i=0;i<size;i++)
            arr2[i]=arr[i];
            arr=arr2;
        }

    }
        public void remove(Integer i)
    {
           for(;i<size;i++)
           arr[i-1]=arr[i]; 
           size--;
    }
    
}
