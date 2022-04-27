package pack;
 class Parent

	{
	int a=10;
	void display()
	{
		System.out.println("hello");
	}
	}
	class Child extends Parent
	{
		int b=20;
		void show()
		{
			System.out.println("hii");
		}
	}
	class Inherit{
	public static void main(String[] args) 
	{
		Child p=new Child();
		System.out.println(p.a);
		p.display();
		p.show();
	}
}
