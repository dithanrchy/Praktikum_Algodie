class node {
    String data;
    node next;
        
    public node (String data){
        this.data=data;
    }
}
public class Polindrom {
    node head;
    node tail;
    int count;
	
    public void tambahdepan (String data){
        node baru = new node(data);
        if(head==null){
            head=baru;
            tail=baru;
        }
	else {
            baru.next=head;
            head=baru;
	}
	count++;		
    }
    
    public void text(){
        int z = count/2;
        int x = 0;
        while (head != tail){
            node tmp=head;
            while (tmp.next!=tail){
                tmp=tmp.next;
            }
            if(head.data==tail.data){
                x++;
                tail=tmp;
                head=head.next;
            }
            else{
                break;
            }
        }
        if (x==z){
            System.out.println("Polindrome");
        }
        else {
            System.out.println("Tidak Polindrome");
        }
    }
    
    public void tampil(){
	node lihat;
	lihat=head;
	while (lihat!=null){
       	System.out.print(lihat.data + " ");		
            lihat=lihat.next;
	}
        System.out.println();
    }
    public void hapus(){
        head=null;
        count=0;
    }
    
    public static void main(String[] args) {
	Polindrom x= new Polindrom();
	x.tambahdepan("m");
	x.tambahdepan("a");
	x.tambahdepan("l");
	x.tambahdepan("a");
	x.tambahdepan("m");
        x.tampil();
        x.text();
        x.hapus();
        x.tambahdepan("m");
	x.tambahdepan("a");
	x.tambahdepan("l");
	x.tambahdepan("a");
        x.tampil();
        x.text();
        
    }
    
}