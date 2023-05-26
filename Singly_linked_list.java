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
	//create the first node
	public void createll()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the first integer in the linked list");
		int n=sc.nextInt();
		
		node n1=new node(n); 
		head=n1;
		tail=n1; 
		length=1;
		
		
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
    		return;
    	}
    	
    		head=head.next;
    		temp.next=null;
    		length--;
    		if(length==0)
    		{
    			
    			tail=null;
    			
    		}
    	
    	System.out.println("remove element="+temp.value);
    	
    	
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
           if(head==null)
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
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		single_ll n1=new single_ll();
		Scanner sc=new Scanner(System.in);
		
	
		
		while(true)
		{
			System.out.println("\nenter your choice:");
			System.out.println("-------------------");
			System.out.println("1. Add element at begining of linked list.\n2. Add element at the end of the linkedlist.\n3. Print linked list.\n4. remove last element.\n5. remove first element.\n0. Exit");
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
			
			
			
		}
//		System.out.println("head->"+n1.head.value);
//		System.out.println("tail->"+n1.tail.value);
//		System.out.println("length="+n1.length);

	}

}