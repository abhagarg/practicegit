package p1;
public class A
{
 public int x=10;
 private int y;
 protected int z ;
 int q;
  
	 public  void display()
	{
       System.out.println(x);
       System.out.println(y);
       System.out.println(z);
       System.out.println(q);
	}

}
class B extends A
{
 
	 public  void display()
	{
       System.out.println(x);
       System.out.println(y);
       System.out.println(z);
       System.out.println(q);
	}

}
class C 
{
 
	 public  void display()
	{
       A a1=new A();
       System.out.println(x);
       System.out.println(y);
       System.out.println(z);
       System.out.println(q);
	}

}
