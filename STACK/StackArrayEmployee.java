//CONSTRUCTION OF THE STACK OF Employees

import java.util.EmptyStackException;
class StackArrayEmployee
{
	private Employee [] stackArray;
	private int top;
	
	
	StackArrayEmployee(int maxSize)
	{
		stackArray=new Employee[maxSize];
		top=-1;
		System.out.println("array is ready for given no of Employees");
	}


// OPERATION ON STACK CHECKING ON CONDITIONS AND SIZE
    public int size()
	{
		return top+1; // as array is 0 index based
	}
	public boolean isFull()//overflow in stack
	{
		return (top==stackArray.length-1);
	}
	public boolean isEmpty()//underflow in stack
	{
		return (top==-1);
	}


 public void display()
   {
	   if(isEmpty())
	   {
		   System.out.println("Stack UNDERFLOW!!!!!!");
		   return;
	   }
	   System.out.println("-----Array is-----------");
	   for(int i=top;i>=0;i--)
		   System.out.println(stackArray[i]+" ");
	   System.out.println();
   }

	
//OPERATION ON STACK 
  // push an element
   public void push(Employee x)
   {
	   if(isFull())
	   {
		   System.out.println("Stack OVERFLOW!!!!!!");
		   return;
	   }
	   top=top+1;
	   stackArray[top]=x;
   }



   //pop 
   public Employee pop()
   {
	  Employee x;
	   if(isEmpty())
	   {
		   System.out.println("Stack UNDERFLOW!!!!!!");
		   throw new EmptyStackException();
	   }
	   x=stackArray[top];
	   top=top-1;
	   return x;
   }
   
   
   //peek
   public Employee peek()
   {
	   if(isEmpty())
	   {
		   System.out.println("Stack UNDERFLOW!!!!!!");
		   throw new EmptyStackException();
	   }
	   return stackArray[top];
   }
   
   
}

 
	   
   
   
   
	   
   
   
   
   
   
	   
		   
   
	   
		   
	   
   
	
	
	
    

	
	
	
	