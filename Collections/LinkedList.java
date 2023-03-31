import java.io.*;
import java.util.*;
public class ll
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
LinkedList<String> l=new LinkedList<>();
int ch;
do
{
System.out.println("\n1.Append\n2.Iterate\n3.Iterate in Reverse\n4.Retrieve\n5.Shuffle");
System.out.println("\nEnter your Choice:");
ch=sc.nextInt();
switch(ch)
{
case 1:
        System.out.println("Enter color to be added:");
        String s=sc.next();
        l.add(s);
        break;
case 2:
        System.out.println("LinkedList Elements are:");
        Iterator p=l.listIterator();
        while(p.hasNext())
        {
        System.out.println(p.next());
        }
        break;
case 3:
        System.out.println("Reverse Order is:  ");
        Collections.reverse(l);
        Iterator p1=l.listIterator();
        while(p1.hasNext())
        {
        System.out.println(p1.next());
        }
      break;
case 4:
        System.out.println("First Element is:"+l.getFirst());
        System.out.println("Last Element is :"+l.getLast());
        break;
case 5:
       System.out.println("After Shuffling is:  ");
        Collections.shuffle(l);
        Iterator p2=l.listIterator();
        while(p2.hasNext())
        {
        System.out.println(p2.next());
        }
        break;
}
}while(ch!=6);
}
}
