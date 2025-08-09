import java.util.Scanner;

class ApplyStackEmp
{
	public static void main(String args[])
	{
		int choice ;
		Employee x=null;
		Scanner sc=new Scanner(System.in);
		StackArrayEmployee st=new StackArrayEmployee(8);
		
		st.display();
		
		
		
		while(true)
		{
			System.out.println("1. Push an element.");
			System.out.println("2. Pop an element.");
			System.out.println("3. Display the top element.");
			System.out.println("4. Display all elements.");
			System.out.println("5. Display the size of the stack.");
			System.out.println("6. Quit.\n\n");
			System.out.println("Enter your Choice\n");
			choice=sc.nextInt();
			
			if (choice==6)
				break;
			
			switch(choice)
			{
				case 1: 
							
			System.out.println("enter id and name\n");
		
		      Employee e1=Employee.builder()
		      .id(sc.nextInt())
		      .name(sc.nextLine())
		      .build();
		       st.push(e1);
				break;
				
				case 2: 
				x=st.pop();
				System.out.println("Popped element is "+x);
				break;
				
				case 3: 
				
				System.out.println("element at the top is "+st.peek());
				break;
				
				case 4: 
				
				st.display();
				
				break;
				case 5: 
				
				System.out.println("Size of the stack is "+st.size());
				
				break;
				
				default:
				
				System.out.println("WRONG CHOICE!!!!");
			}
			System.out.println("");
		}
		sc.close();
		
	}
}

				
				
				
				
				
				
			
			
			
			
		