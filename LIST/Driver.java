import Arraylist.*;
import LinkedList.*;
import OrderedList.*;
import java.util.Scanner;
class Driver{

    public static void main(String args[])
    {
        boolean superflag =true;
        while(superflag){
            System.out.println("1.Array List\n2.Ordered Array List \n3.Linear List\n4.Exit\n\nEnter Choice : ");
            Scanner sc = new Scanner(System.in);
            int num=sc.nextInt();
            switch(num)
            {
                case 1:ArrayList ob=new ArrayList();
                System.out.println("Array List\n\nEnter Size : ");
                int x = sc.nextInt();int q;
                System.out.println("Enter Elements ");
                for(int i=0;i<x;i++)
                {
                    int e = sc.nextInt();
                    ob.add(e);
                }
                ob.TRAVERSE();                        
                boolean flag = true;
                while(flag){
                    System.out.println("1.Add element\n2.Remove element\n3.Add element at postion\n4.Exit\n");
                    q = sc.nextInt();
                    switch(q)
                    {
                        case 1: System.out.println("Enter Element : ");
                        int e=sc.nextInt();
                        ob.add(e);
                        ob.TRAVERSE();
                        break;
                        case 2: System.out.println("Enter Position : ");
                        e=sc.nextInt();
                        ob.remove(e);
                        ob.TRAVERSE();
                        break;
                        case 3: System.out.println("Enter Element and Postion : ");
                        e=sc.nextInt();
                        int pos = sc.nextInt();
                        ob.add(e,pos);
                        ob.TRAVERSE();
                        break;
                        case 4 : flag = false;
                        break;
                    }
                }
                break;

                case 2:OrderedArrayList ob1=new OrderedArrayList();
                System.out.println("Ordered Array List\n\nEnter Size : ");
                int y = sc.nextInt();
                System.out.println("Enter Elements ");
                for(int i=0;i<y;i++)
                {
                    int e = sc.nextInt();
                    ob1.add(e);
                }
                ob1.TRAVERSE();
                flag = true;
                while(flag){
                    System.out.println("1.Add element\n2.Remove element\n3.Exit\n");
                    q = sc.nextInt();
                    switch(q)
                    {
                        case 1: System.out.println("Enter Element : ");
                        int e=sc.nextInt();
                        ob1.add(e);
                        ob1.TRAVERSE();
                        break;
                        case 2: System.out.println("Enter Position : ");
                        e=sc.nextInt();
                        ob1.remove(e);
                        ob1.TRAVERSE();
                        break;
                        case 3 : flag = false;
                        break;
                    }
                }
                break;
                case 3:LinearList ll=new LinearList();
                System.out.println("Linear List \n\nEnter Size : ");
                int z = sc.nextInt();
                System.out.println("Enter Elements ");
                for(int i=0;i<z;i++)
                {
                    int e = sc.nextInt();
                    ll.add(e); 
                }
                flag = true;
                while(flag){
                    System.out.println("1.Add element\n2.Remove element\n3.Add element at postion\n4.Exit\n");
                    q = sc.nextInt();
                    switch(q)
                    {
                        case 1: System.out.println("Enter Element : ");
                        int e=sc.nextInt();
                        ll.add(e);
                        ll.TRAVERSE();
                        break;
                        case 2: System.out.println("Enter Position : ");
                        e=sc.nextInt();
                        ll.remove(e);
                        ll.TRAVERSE();
                        break;
                        case 3: System.out.println("Enter Element and Postion : ");
                        e=sc.nextInt();
                        int pos = sc.nextInt();
                        ll.add(e,pos);
                        ll.TRAVERSE();
                        break;
                        case 4 : flag = false;
                        break;
                    }
                }
                break;
                case 4 : superflag = false;
                break;
            }

        }
    }

}
