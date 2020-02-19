import java.lang.annotation.*;
import java.lang.reflect.*;
@Retention(RetentionPolicy.RUNTIME) 
@Target({ElementType.METHOD}) 
@interface Getter {
	int marks=12;
}
class GetAnnot
{
	private int marks=91;
	
	@Getter
	public int getMarks()
	{
		return marks;
	}
	
	@Getter
	public int getmarks()
	{
		return 1;
	}
	
	public int PseudoAnnot()
	{
		return 5;
	}
}

class GetAnnotTest
{
	public static boolean checkField(String s2)
	{
		Field fields[]=c.getDeclaredFields();
		for(Field field:fields)
		{
			if(field.getName().equals(s2))
				break;
			 
		}
		
	}
	public static void main(String args[]) throws Exception
	{
		Class c = Class.forName("GetAnnot"); 
	    Method m[] = c.getDeclaredMethods();
		String m1[]=new String[100];
		for(int i=0;i<m.length;i++)
		{
			 m1[i] = m[i].getName();
		}
		for(int i=0;i<m.length;i++)
		{
			//System.out.println(m1[i]);
			Method myMethod=m[i];
			Annotation annotations[]=myMethod.getDeclaredAnnotations();
			for(Method me:m)
			{
					if(me.isAnnotationPresent(Getter.class))
					{
						String s=me.getName();
						if(s.startsWith("get"))
						{
							String s1=s.substring(3);
							if(Character.isUpperCase(s1.charAt(0)))
							{
								s1=s1.toLowerCase();
								Boolean Ans=checkField(s1);
							}
							else
							{
								System.out.println(s+"is not a getterMethod");
							}
						}
					}
					else
					{
						System.out.println(s+"is not a getterMethod");
					}
					
			}
		
		}
	}
}