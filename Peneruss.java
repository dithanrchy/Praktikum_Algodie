import java.util.Random;
class Node{
	int data;
	Node next;
	Node prev;
}
public class Peneruss{
	Node head;
	public void Insert(int d){
		Node add = new Node();
		add.data = d;
		if(head == null){
			head = add;
		}
		else{
			Node temp = head;
			while(temp.next != null)
			{
				temp = temp.next;
			}
			temp.next = add;
			add.prev = temp;
		}
	}
	
	public void show(int x) {
		Node temp =head;
		int c=0;
		while(c!=x) {
			System.out.print(temp.data+"   ");
			temp = temp.next;
			c++;
		}
		System.out.println("");
	}
	public void SortI(int size) {
		Node temp = head;
		Node second = head.next;
		int store;
		for(int i = 0;i<size;i++) {
			second = temp.next;
			for(int j=i+1;j<size;j++) {
				if(second.data>temp.data) {
					store = second.data;
					second.data = temp.data;
					temp.data = store;
				}
				second = second.next;
			}
			temp = temp.next;
		}
	}
	
	public static void main(String[] args) {
		Peneruss raja = new Peneruss();
		Random random = new Random();
		for(int i = 0;i<25;i++) {
			raja.Insert(random.nextInt(100));
		}
		System.out.println("Umur Anak Raja : ");
		raja.show(25);
		raja.SortI(25);
		System.out.println("\n10 Anak Raja Tertua");
		raja.show(25); 
		
		int f;
		int position = 0;
		Node temp = raja.head;
		while(temp!=null){
			f=0;
			for(int j=2;j<100;j++){
				if(temp.data%j==0)
					f++;
			}
			if(f==1){
				System.out.println("\nUmur Penerus Raja = "+temp.data);
				break;
			}else
				temp=temp.next;
		}
	}
}