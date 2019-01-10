public class Sembako{
	Node head,tail;
	
	class Node{
	int data; 
	Node next,prev; //atribut
	
		public Node(int data){ //method
		this.data=data; 
		}
	}
	
	public void enque(int data){
		Node temp = new Node(data);
		if(head==null)
			head=tail=temp;
		else{
			tail.next=temp;
			temp.prev=tail;
			tail=temp;
		}
	}
	
	public void deque(){
		Node temp=head;
		if(head==null)
			System.out.println("Antrian kosong!");
		else{
			head=head.next;
			head.prev=null;
		}
	}
	
	public void deleteAll(){
		head=null;
	}
	
	public void show(){
		Node temp=head;
		while(temp!=null){
			System.out.print(temp.data + " ");
			temp=temp.next;
		}
		System.out.println();
	}
	
	public static void main(String[] args){
		Sembako hehe = new Sembako();
		
		for(int i=1;i<=50;i++){
			hehe.enque(i);
		}
		System.out.println("Antrian sekarang : ");
		hehe.show();
		
		for(int i=0;i<15;i++){
			hehe.deque();
		}
		System.out.println("No.1-15 keluar, antrian sekarang : ");
		hehe.show();
		
		System.out.println("Hari Berganti. Antrian dihapus");
		hehe.deleteAll();
		
		for(int i=20;i<=30;i++){
			hehe.enque(i);
		}
		System.out.println("Antrian sekarang : ");
		hehe.show();
		
		hehe.deleteAll();
		
		for(int i=16;i<=19;i++){
			hehe.enque(i);
		}
		System.out.println("Antrian sekarang : ");
		for(int i=31;i<=50;i++){
			hehe.enque(i);
		}
		hehe.show();
	}
}