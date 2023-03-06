import com.rana_pratap.Link;
import org.w3c.dom.Node;

public class LinkM<head> {
public Node head=null;
public Node tail=null;
public class Node{
    int data;
    Node next;
    Node(int d){
        data=d;
        next=null;
    }
}
public int size=0;
public void newNode(int data){
    Node newNode=new Node(data) ;
    if(head==null){
       head=newNode;
       tail=newNode;
    }else{
tail.next=newNode;
tail=newNode;
    }
    size++;
}
public void display(){
    Node current=head;
    if(head==null){
        System.out.println("list is empty");
        return;
    }else{
        while(current!=null){
            System.out.println(current.data);
            current=current.next;
        }
    }
}



//counting the node in the list
    public int count(){
    Node current=head;
    int count=0;
    while(current!=null){
        current=current.next;
        count++;
    }
    return count;
    }




// reverse the total list
    public void reverse(Node current){
    if(head==null){
        System.out.println("list is empty");
        return;
    }else{
        if(current.next==null){
            System.out.println(current.data);
            return;
        }
        reverse(current.next);
        System.out.println(current.data+" ");
    }
    }
    //deelte from thee start node of the list
//    public void deleteStart(){
//    Node current=head;
//    if(head==null){
//        System.out.println("list is already empty");
//        return;
//    }else{
//        if(head!=tail)
//            head=head.next;
//        else
//            head=tail=null;
//    }
//    }


                               // delete from the mid
    public void deleteMid(){
    Node temp,current;
    if(head==null){
        return;
    }else{
        int count=(size%2==0)?(size/2):((size+1)/2);
        if(head!=tail){
            temp=head;
            current=null;
            for(int i=0; i<count-1; i++ ){
                current=temp;
                temp=temp.next;
            }
            if(current!=null){
                current.next=temp.next;
                temp=null;
            }else{
                head=tail=temp.next;
                temp=null;
            }

        }
        else{
            head=tail=null;
        }
    }
    size--;
    }


    //deleting last node of the list


//    public void deleteLast(){
//    if(head==null){
//        System.out.println("list is empty ");
//        return;
//    }
//    else{
//        if(head!=tail){
//        Node current=head;
//        while(current.next!=tail) {
//            current = current.next;
//        }
//        tail=current;
//        tail.next=null;
//        }
//        else{
//            head=tail=null;
//        }
//    }
//    }



    //find the minnimum
    public void minimum(){
    int min=0;
    Node current=head;
    if(head==null){
        return;
    }else{
        min=head.data;
        while(current!=null){
            if(min>current.data)
                min=current.data;
            current=current.next;
        }
    }
        System.out.println(min);
    }


    // for max node in the list
    public void maximum() {
        int max = 0;
        Node current = head;
        if (head == null) {
            return;
        }else{
            max=head.data;
            while(current!=null){
                if(max<current.data)
                    max=current.data;
                current=current.next;
            }
        }
        System.out.println(max);
    }


// insert new node at the middle
    public void newMidNOde(int data){
    Node newNode=new Node(data);
    if(head==null){
        head=newNode;
        tail=newNode;
    }else{
        int count=(size%2==0)?(size/2):((size+1)/2);
        // node temp will point to head
        Node temp,current;
        temp=head;
        current=null;
        for(int i=0; i<count-1; i++){
            current=temp;
            temp=temp.next;
        }
        current.next=newNode;
        newNode.next=temp;
    }
    size++;
    }


    // Insert node at the begining of the list
    public void addBeg(int data){
    Node newNode=new Node(data);
    if(head==null){
        head=newNode;
        tail=newNode;
    }else{
        Node temp=head;
        newNode.next=temp;
        head=newNode;
    }
    }


    // remove the duplicate from the  list
    public void duplicaate(){
    Node current=head, index=null,temp=null;
        if(head==null){
            return;
        }else{
            while(current!=null){
                temp=current;
                index=current.next;
                while(index!=null){
                    if(current.data==index.data){
                        temp.next=index.next;
                    }
                    else{
                        temp=index;
                    }
                    index=index.next;
                }
                current=current.next;

            }
        }

    }


    // searching in the list
    public void searchNode(int data){
    Node current=head;
    int i=1;
    boolean flag=false;
    if(head==null){
        return;
    }else{
        while(current!=null){
            if(current.data==data){
                flag=true;
                break;
            }
            i++;
            current=current.next;
        }
    }
    if(flag)
        System.out.println("the value reach"+i+"times");
    else
        System.out.println("doesn't in the list");
    }

//    public  void isPalindrome(){
//        LinkM.Node current=head;
//        boolean flag=true;
//        int mid=(size%2==0)?(size/2):((size+1)/2);
//        for(int i=0; i<mid; i++){
//            current=current.next;
//        }
//        LinkM.Node revHead=reverse(current.next);
//        while(head!=null && revHead!=null){
//            if(head.data!=revHead.data){
//                flag=false;
//                break;
//            }
//            head=head.next;
//            revHead=revHead.next;
//        }
//        if(flag)
//            System.out.println("palindrome");
//        else{
//            System.out.println("is not palindrome");
//        }
//    }


// Driver code of tthe list
    public static void main(String[] args) {
   LinkM h1=new LinkM();
   h1.newNode(200);
   h1.newNode(400);
   h1.newNode(500);
   h1.newNode(600);
        h1.display();

        System.out.println("the no of node in the list is "+h1.count());
        h1.reverse(h1.head);
//        h1.deleteStart();
//        h1.deleteLast();
        h1.deleteMid();
        System.out.println("here we go");
        h1.display();
        System.out.println("minimum data is");
        h1.minimum();
        System.out.println("maximum data  is");
        h1.maximum();h1.newMidNOde(100);
        h1.newMidNOde(500);
        h1.display();
        System.out.println("here the new one");
        h1.addBeg(2);
        h1.addBeg(2);
h1.display();
h1.duplicaate();
h1.display();
h1.searchNode(
        500
);
    }
}