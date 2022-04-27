package pack;

	class A
	{	
		int i=10;
		void method1()
		{
			System.out.println("Parent");
		}
	}
	class B extends A
	{
		int j=20;
		void method2() 
		{
			System.out.println("Child 1");
		}
	}
	class C extends A
	{
		int k=30;
		void method3()
		{
			System.out.println("Child 2");
		}
	}
public class Hirarhical_Inheritance 
{
		public static void main(String[] args) 
		{
		     B obj1 =new B();
		     System.out.println(obj1.j);
		     obj1.method2();
		     System.out.println(obj1.i);
		     obj1.method1();
		     System.out.println();
		     C obj2 =new C();
		     System.out.println(obj2.k);
		     obj2.method3();
		     System.out.println(obj2.i);
		     obj2.method1();
		     
		}	 
}
