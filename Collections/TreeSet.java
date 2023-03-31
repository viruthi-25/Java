import java.io.*;
import java.util.*;
public class ts
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
TreeSet<String> l=new TreeSet<>();
int ch;
do
{
System.out.println("\n1.Append\n2.Iterate\n3.Copy\n4.Retrieve\n5.Remove");
System.out.println("\nEnter your Choice:");
ch=sc.nextInt();
switch(ch)
{
case 1:
        System.out.println("Enter element:");
        String s=sc.next();
        l.add(s);
        break;
case 2:
        System.out.println("TreeSet Elements are:");
        Iterator p=l.iterator();
        while(p.hasNext())
        {
        System.out.println(p.next());
        }
        break;
case 3:
                TreeSet<String> l2=new TreeSet<>();
        System.out.println("Copy of TreeSet Elements are:");
                l2.addAll(l);
  Iterator p1=l2.iterator();
        while(p1.hasNext())
        {
        System.out.println(p1.next());
        }
      break;
case 4:
        TreeSet<Integer> set = new TreeSet<>();
set.add(40);
        set.add(50);
        set.add(30);
        set.add(10);
        set.add(20);
System.out.println("TreeSet: " + set);
System.out.println("Ceiling value of 23: "
                           + set.ceiling(23));
                break;
case 5:
       System.out.println("Removing the First Element is :"+l.pollFirst());
        break;
}
}while(ch!=6);
}
}
