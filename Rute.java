class Node{
	Node prev,next;
	String nama;
	int data;
	Node(String nama){
		this.nama=nama;
	}
	Node(int data){
		this.data=data;
	}
}

public class Rute{
	Node head,tail;
	
	public void addBack(String nama){
		Node baru = new Node(nama);
		if(head==null){
			head=baru;
			tail=baru;
		}else{
			tail.prev=baru;
			tail=baru;
		}
	}
	
	public void addEdge(String awal, String akhir, int data){
		Node edge = new Node(data);
		Node temp=head;
		while(temp.nama!=awal){
			temp=temp.prev;
		}
		Node temp2=head;
		while(temp2.nama!=akhir){
			temp2=temp2.prev;
		}
		sambung(temp,temp2,edge);
	}
	
	public void sambung(Node a,Node b,Node edge){
		if(a.next==null){
			a.next=edge;
			edge.prev=b;
		}else{
			Node cek=a.next;
			while(cek.next!=null){
				cek=cek.next;
			}
			cek.next=edge;
			edge.prev=b;
		}
	}
	
	public void tampil(){
		Node temp=head;
		while(temp!=null){
			Node temp2=temp.next;
			while(temp2!=null){
				System.out.println(temp.nama + "->" + temp2.prev.nama + " Jaraknya sebesar : " + temp2.data);
				temp2=temp2.next;
			}
			temp=temp.prev;
		}
	}
	public static void main(String[] args){
		Rute hehe = new Rute();
		
		// hehe.addBack("MCD");
		// hehe.addBack("epic");
		// hehe.addBack("bk");
		// hehe.addBack("kb");
		// hehe.addBack("airlangga");
		// hehe.addBack("unram");
		// hehe.addEdge("MCD","epic",2);
		// hehe.addEdge("MCD","bk",1);
		// hehe.addEdge("bk","kb",1);
		// hehe.addEdge("epic","kb",1);
		// hehe.addEdge("epic","unram",2);
		// hehe.addEdge("kb","airlangga",2);
		// hehe.addEdge("airlangga","unram",1);
		
		hehe.addBack("A");
		hehe.addBack("B");
		hehe.addBack("C");
		hehe.addBack("D");
		hehe.addEdge("A","B",1);
		hehe.addEdge("C","D",2);
		hehe.addEdge("A","C",2);
		hehe.addEdge("B","C",3);
			
		hehe.tampil();
	}
}
