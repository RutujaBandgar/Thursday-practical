class Employee
{
  	private String name; 
	private String address;
  	private int year;
	private int salary;
  	public Employee(String n, int y, int sal, String add)
	{
    		name = n;
    		year = y;
    		salary = sal;
    		address = add;
  	}
  	public String getName()
	{
    		return name;
  	}
  	public int getYear()
	{
    		return year;
  	}
  	public int getSalary()
	{
    		return salary;
  	}
  	public String getAddress()
	{
    		return address;
  	}
	public static void main(String[] args)
	{
    		Employee e1 = new Employee("Robert", 1994, 500000, "64C- WallsStreet");
    		Employee e2 = new Employee("Sam", 2000, 740000, "68d- WallsStreet");
    		Employee e3 = new Employee("John", 1999, 600000, "26B- WallsStreet");
    		System.out.println("Name\tYear of joining\tSalary\tAddress");
    		System.out.println(e1.getName()+" "+e1.getYear()+" "+e1.getSalary()+" "+e1.getAddress());  
    		System.out.println(e2.getName()+" "+e2.getYear()+" "+e2.getSalary()+" "+e2.getAddress()); 
    		System.out.println(e3.getName()+" "+e3.getYear()+" "+e3.getSalary()+" "+e3.getAddress());  
  	}
}