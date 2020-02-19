import java.lang.reflect.*;
import java.lang.annotation.*;
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})
 @interface Getter
{
}
class AnnotTest1
{
	private String name;
	private int value;
	private int age;
	public AnnotationTestMain(String name,int value,int age)
	{
		this.name=name;
		this.value=value;
		this.age=age;
	}
	@Getter
	public String getName()
	{
		return this.name;
	}
	@Getter
	public int getValue()
	{
		return this.value;
	}
	@Getter
	public int getAge()
	{
		return this.age;
	}
	public void setAge(int aGE)
	{
		this.age=age;
	}
	public static void main(String args[])
	{   Class c=AnnotationTestMain.class;
		Method m[]=c.getDeclaredMethods();
		String s="";
		int flag=0,flag1=0;
		for(Method allMethods:m)
		{
			 if (allMethods.isAnnotationPresent(Getter.class)) 
			 {
				 s=allMethods.getName();
				 if(s.startsWith("get"))
				 {
					 String s1=s.substring(3);
					 if(!Character.isUpperCase(s1.charAt(0)))
					 {
						 flag1=1;
						 System.out.println(s+"is not a getterMethod");
					 }
					 else
					 {
						s1=s1.toLowerCase();
						Field[] fields = c.getDeclaredFields();
						for(Field field:fields)
						{
							if(field.getName().equals(s1))
							{
								flag=1;
								break;
							}
						}
							if(flag==0)
							{	flag1=1;
								System.out.println(s+"is not a getterMethod");
							}
						
						
					}
				 }
						else
						{    
							flag1=1;
							System.out.println(s+"is not a getterMethod");
						}
					 
					
				 
				}
		}
				if(flag1==0)
				{
					System.out.println("Everything is fine");
				}
			 
			 
		}
	}

		
	
	
	
	