import java.util.Scanner;

class Node{
	Node next;
	char x;
	
	Node(char x){
		this.x=x;
	}
}

public class Respon{
	Node head,tail;
	int c;
	
	public void addBack(char x){
		Node temp=new Node(x);
		if(head==null)
			head=tail=temp;
		else{
			temp.next = head;
			head = temp;
		}
		c++;
	}
	
	public void cek(){
		int tengah = c/2;
		int x=0;
		while(head!=tail){
			Node temp=head;
			while(temp.next!=tail){
				temp=temp.next;
			}
			if(head.x==tail.x){
					x++;
					tail=temp;
					head=head.next;
			}else
				break;
		}
		if(x==tengah)
			System.out.println("Kata Palindrome");
		else
			System.out.println("Kata bukan Palindrome");
	}
	
	public static void main(String[] args){
	
		Scanner input = new Scanner(System.in);
		
		Respon hehe = new Respon();
		
		System.out.print("Masukkan kata : ");
		String kata = input.nextLine();
		String lower = kata.toLowerCase();
		
		int n=kata.length();
		int[] arr = new int[n];
		
		for(int i=0;i<kata.length();i++){
			if(lower.charAt(i)>='a' && lower.charAt(i)<='z'){
				hehe.addBack(kata.charAt(i));
			}
			else
				i--;
		}
		
		hehe.cek();
	}
}