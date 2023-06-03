
import java.util.*;
public class single_ll {
    private node head;
    private node tail;
    private int length;
	class node
	{
		int value;
		node next;
		public node(int value)
		{
			this.value=value;
		}
		
	}
	
	//print list
	public void printlist()
	{
		node temp=head;
		if(head==null)
		{
		  System.out.println("no element is present in linked list");
		}
		while(temp!=null)
		{
			System.out.print(temp.value+"->");
			temp=temp.next;
		}
		System.out.print("null");
		
	}
	 //add element at first
    public void addfirst()
	
	{
    	Scanner sc=new Scanner(System.in);
		System.out.println("enter an integer to add at the begining of linked list");
		int n=sc.nextInt();
    	node n1=new node(n);
    	if(head==null)
    	{
    		head=n1;
    		tail=n1;
    		length=1;
    	}
    	else {
    		n1.next=head;
    		head=n1;
    		length++;
    	
    	}
		
	}	
    //remove first
    public void removefirst()
    {
    	node temp=head;
    	if(head==null)
    	{
    		System.out.println("no element is present in list");
    		return ;
    	}
    	else if(length==0)
    	{
    		tail=null;
    		
    	}
    		
    	else
    		{
    			head=head.next;
        		temp.next=null;
        		length--;
        		System.out.println("remove element="+temp.value);
    		}
    	
     }
    //add  last
     public void addlast() {
    	 Scanner sc=new Scanner(System.in);
 		System.out.println("enter an integer to add at the end of linked list");
 		int n=sc.nextInt();
 		node temp=head;
     	node n1=new node(n);
     	if(head==null)
     	{
     		head=n1;
     		tail=n1;
     		length=1;
     	}
     	else {
         tail.next= n1;
         tail=n1; 
         length++;
    	}
     		    }
     //remove last
     public void removelast() {
           node temp=head;  
           node prev=head;
           if(length==1)
           {
        	   
        	   head=null;
        	   tail=null;
        	   return;
           }
           else if(head==null)
           {
        	   System.out.println("no element is present in linked list");
        	   return;
           }
         
           while(temp.next!=null)
           {
        	   prev=temp;
        	   temp=temp.next;
        	   
           }
           tail=prev;
           tail.next=null;
           length--;
           if(length==0)
           {
        	   head=null;
        	   tail=null;
        	  
           }
           System.out.println("remove element ="+temp.value);
	
     }
	//get element at particular index
     public void getelement()
     {
    	 Scanner sc=new Scanner(System.in);
    	 System.out.println("enter the index");
    	 int index= sc.nextInt();
         node temp=head;
    	 if(index<0||index>=length) {
    		 System.out.println("enter the valid index");
    		 return;
    		 
    	 }
    	 for(int i=0;i<index;i++)
    	 {
    		 temp=temp.next;
    	 }
    	 System.out.println("The value at index '"+index+"' is: "+temp.value);
    	 
     }
     //change value at index
     public void set()
     { 
    	 node temp=head;
    	 Scanner sc=new Scanner(System.in);
    	 System.out.println("enter the index which value you want to change");
    	 int index= sc.nextInt();
    	
    	 if(index<0||index>=length) {
    		 System.out.println("enter the valid index");
    		 return;
    		 
    	 }
    	 else 
    	 {
    	  System.out.println("enter the new value");
    	  int n=sc.nextInt();
    	  for(int i=0;i<index;i++)
    	 {
    		 temp=temp.next;
    	 }
    	  temp.value=n;
    	 System.out.println("The value at index '"+index+"' successfully changed to:"+n);
    	 } 	 
     }
	//insert at particular index
     public void insert()
     {
    
    	 Scanner sc=new Scanner(System.in);
    	 System.out.println("enter the index");
    	 int index= sc.nextInt();
         node temp=head;
         if(index<0||index>length) {
    		 System.out.println("enter the valid index");
    		 return;
    		 
    	 }
         else if(index==0)
         {
         		addfirst();
         	
         		
         }
         else if(index==length)
         {

      		    addlast();
     
      		   
         }
         else {
        	 for(int i=1;i<index;i++)
        	 {
        		 temp=temp.next;
        	 }
        	
        	 System.out.println("Enter the value you want to add");
        	 int n=sc.nextInt();
        	 node n1=new node(n);
        	 n1.next=temp.next;
        	 temp.next=n1;
        	 length++;
        	 System.out.println("The value is added successfully at index :"+index );
         }
     }
     //remove from particular index
     public void remove()
     {
    	 Scanner sc=new Scanner(System.in);
    	 
         node temp=head;
         node prev=head;
        
         if (length==0)
    	 {
           System.out.println("there is no element present in linked list add the first element.");        	 
           return;
    		
    	 }
        if(length==1)
    	  {
    		  removefirst();
    		  return;
    	  }
         
          System.out.println("enter the index");
     	  int index= sc.nextInt();
        
     	  if(index<0 || index>=length) 
     	  {
    		 System.out.println("enter a valid index");
    	  }
     	 
     	  else if(index==0)
    	 {
    		 removefirst();
    		 return;
    	 }
    	
     	  else if(index==length-1)
    	 {
    		 removelast();
    		 
    	 }
    	
    	 else 
    	 {
    		 for(int i=0;i<index;i++)
    		 {
    			 prev=temp;
    			 temp=temp.next;
    			
    		 }
    		 prev.next=temp.next;
    		 temp.next=null; 
    		 length--;
    		 
    		 System.out.println(temp.value+" removed");
    	 }
     }
     
     //reverse list
     public void reverse()
     {    
    	 node temp=head;
     
    	 head=tail;
	     tail=temp;
    	 
    	 node before=null;
    	 node after=temp.next;
    	
    	 
    	 
    	 for(int i=0;i<length;i++)
    	 {
    		 after=temp.next;
    		 temp.next=before;
    		 
    		 before=temp;
    		temp=after;
    	 }
    	 System.out.println("list is reversed");
     }
     //head point

	 public void head()
	 {
		 if(length>=2)
		 System.out.println("\nhead->"+head.value);
	 }
 
	 //tail point

	 public void tail()
	 {
		 if(length>=2)
		 System.out.println("\ntail->"+tail.value);
	 }
	 //length

	 public void len()

	 {
		 System.out.println("\nlength->"+ length);
	 }
	
	 public static void main(String[] args) {
		// TODO Auto-generated method stub
		single_ll n1=new single_ll();
		
		Scanner sc=new Scanner(System.in);
	
		while(true)
		{
			System.out.println("\nenter your choice:");
			System.out.println("-------------------");
			System.out.println("1. Add element at begining of linked list.\n2. Add element at the end of the linkedlist."
					+ "\n3. Print linked list.\n4. remove last element.\n5. remove first element.\n6. Get a element at particular index."
					+ "\n7. Change the value at  at particular index.\n8. Insert an element at particular index.\n9. Remove.\n10.Reverse the List.\n0. Exit");
			int c=sc.nextInt();
			switch(c)
			{
			
			case 1:{
				n1.addfirst();
				break;
			}
			case 2:{
				n1.addlast();
				break;
			}
			case 3:{
				n1.printlist();
				break;
			}
			case 4:{
				n1.removelast();
				break;
			}
			case 5:{
				n1.removefirst();
				break;
			}
			case 6:{
				n1.getelement();
				break;
			}
			case 7:{
				n1.set();
				break;
			}
			case 8:{
				n1.insert();
				break;
			}
			case 9:{
				n1.remove();
				break;
			}
			case 10:{
				n1.reverse();
				break;
			}
			case 0:{
				System.exit(0);
				break;
			}
			default:
			{
				System.out.println("invalid choice");
				break;
			}
			
		}
			
			
			n1.head();
			n1.tail();
			n1.len();
		}
		
	}

}
