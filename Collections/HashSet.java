import java.io.*;
import java.util.*;
public class hs
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
HashSet<String> l=new HashSet<>();
int ch;
do
{
System.out.println("\n1.Append\n2.Iterate\n3.Convert to Array\n4.Compare\n5.Remove");
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
        System.out.println("HashSet Elements are:");
        Iterator<String> p=l.iterator();
        while(p.hasNext())
        {
        System.out.println(p.next());
        }
        break;
case 3:
        System.out.println("ArrayList Elements are :");
                //String arr[]=new String[l.size()];
                Object[] arr=l.toArray();
                for(int i=0;i<arr.length;i++)
                {
                System.out.println(arr[i]);
                }
      break;
case 4:
        HashSet<String> l1=new HashSet<>();
                l1.add("Viru");
                l1.add("thika");
                l1.add("Murugesan");
                l.retainAll(l1);
                System.out.println("Common Elements :"+l);
        break;
case 5:
       l.clear();
        break;
}
}while(ch!=6);
}
}
