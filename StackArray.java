//CONSTRUCTION OF THE STACK

import java.util.EmptyStackException;
class StackArray
{
	private int [] stackArray;
	private int top;
	
	StackArray()
	{
		stackArray=new int[10];
		top=-1;
		System.out.println("array ready for 10 elements");
	}
	StackArray(int maxSize)
	{
		stackArray=new int[maxSize];
		top=-1;
		System.out.println("array is ready for given no of elements");
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
	
// OPERATION ON STACK 
   //push an element
   public void push(int x)
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
   public int pop()
   {
	   int x;
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
   public int peek()
   {
	   if(isEmpty())
	   {
		   System.out.println("Stack UNDERFLOW!!!!!!");
		   throw new EmptyStackException();
	   }
	   return stackArray[top];
   }
   
   //display
   
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
}

	   
	   
   
   
   
	   
   
   
   
   
   
	   
		   
   
	   
		   
	   
   
	
	
	
    

	
	
	
	