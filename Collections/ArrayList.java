import java.io.*;
import java.util.*;
public class al
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
ArrayList<String> l=new ArrayList<>();
int ch;
do
{
System.out.println("\n1.Add colors\n2.Iterate\n3.Retrieve\n4.Copy\n5.Join");System.out.println("\nEnter your Choice:");
ch=sc.nextInt();
switch(ch)
{
case 1:
        System.out.println("Enter color to be added:");
        String s=sc.next();
        l.add(s);
        break;
case 2:
        System.out.println("ArrayList Elements are:");
        for(int i=0;i<l.size();i++)
        {
        System.out.println(l.get(i));
        }
        break;
case 3:
        System.out.println("Enter the index to be retrieved: ");
        int c=sc.nextInt();
        for(int i=0;i<l.size();i++)
        {
        if(c==i)
        {
        System.out.println("Element at Index: "+l.get(i));
        }
        }
         break;
case 4:
        List<String> l1=new ArrayList(l);
        for(int i=0;i<l1.size();i++)
        {
        System.out.println(l1.get(i));
        }
        break;

case 5:
        List<String> l2=new ArrayList();
        l2.add("1");
        l2.add("2");
        List<String> l3=new ArrayList();
        l3.addAll(l);
        l3.addAll(l2);
         for(int i=0;i<l3.size();i++)
        {
        System.out.println(l3.get(i));
        }
        break;
}
}while(ch!=6);
}
}
