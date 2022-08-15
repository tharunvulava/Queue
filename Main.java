import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
	   Queue <Integer> q=new LinkedList<Integer>(); 
           q.add(30);                           
           q.add(9);
           q.add(2000);
           q.add(8);
           q.add(10);
           q.add(2006);
           System.out.println(q);
           System.out.println(q.peek());
           q.poll();
           System.out.println(q.peek());
           q.poll();
           System.out.println(q);
	}   
}
