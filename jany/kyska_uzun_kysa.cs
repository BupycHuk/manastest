using System;
class sap1
{
	public string s1;
	public sap1(){}
	
}
class sap2
{
	public string s2;
	public sap2(){}
}
class Program
{
	public static void Main(string[] args)
	{
		int a,b;
		sap1 ob1 = new sap1();
		sap2 ob2 = new sap2();
		ob1.s1=Console.ReadLine();
		ob2.s2=Console.ReadLine();
		a=ob1.s1.Length;
		b=ob2.s2.Length;
		if(a>b) 
			Console.WriteLine(ob2.s2+ob1.s1+ob2.s2);
		else if(a<b)
			Console.WriteLine(ob1.s1+ob2.s2+ob1.s1);
		else
			Console.WriteLine("саптар бирдей узундукта\n"+ob1.s1+ob2.s2+ob1.s1);
		Console.ReadKey(true);
	}
}