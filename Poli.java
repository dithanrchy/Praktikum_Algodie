import java.util.Scanner;

class Node{
	Node prev,next;
	char data;
	
	Node(char data){
		this.data=data;
	}
}

public class Poli{
	Node head,tail;
	
	public void push(char data){
		Node temp = new Node(data);
		if(head==null)
			head=tail=temp;
		else{
			temp.next = head;
			head.prev = temp;
			head=temp;
		}
	}
	
	public void enque(char data){
		Node temp = new Node(data);
		if(head==null)
			head=tail=temp;
		else{
			tail.next=temp;
			temp.prev=tail;
			tail=temp;
		}
	}
	
	public char deque(){
		Node temp=head;
		head=head.next;
		head.prev=null;
		return temp.data;
	}
	
	public char pop(){
		Node temp=head;
		head=head.next;
		head.prev=null;
		return temp.data;
	}
	
	public static void main(String[] args){
		Poli pp = new Poli();
		Poli ll = new Poli();
		
		boolean pol = true;
		
		Scanner inp = new Scanner(System.in);
		String kata = inp.nextLine();
		
		for(int i=0;i<kata.length();i++){
			pp.push(kata.charAt(i));
			ll.enque(kata.charAt(i));
		}
		
		for(int i=1;i<kata.length();i++){
			if(pp.pop()==ll.deque())
				pol=true;
			else{
				pol = false;
				break;
			}
		}
		
		if(pol==true)
			System.out.println("Kata adalah polindrome");
		else
			System.out.println("Kata bukan polindrome");
	}	
}