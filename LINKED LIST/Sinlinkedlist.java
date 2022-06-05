import java.util.Scanner;

public class Sinlinkedlist{

    Node head;
class Node{
int data;
Node next;

Node(int data)
{
    this.data=data;
    this.next=null;
}
}

public void addFirst(int data)
{
    char ch;
    Node newNode= new Node(data);
    if(head==null){
      head=newNode;
      return;
    }
    newNode.next=head;
    head=newNode;
    
}

public void addLast(int data)
{
    Node newNode= new Node(data);
    if(head==null){
      head=newNode;
      return;
    }
    Node currNode=head;//for traversing we take cuurNode
    while(currNode!=null)
    {
        currNode=currNode.next;
    }
    currNode.next=newNode;
}

public void deleteFirst()
{
    if(head==null)
    {
        System.out.println("List is empty");
        return;
    }
    head=head.next;    
}

public void deleteLast()
{
    if(head==null)
    {
        System.out.println("list is empty");
        return;
    }
    if(head.next==null)
    {
        head=null;
        return;
    }
    Node secondLast=head;
    Node lastNode=head.next;
    while(lastNode.next!=null)
    {
        lastNode=lastNode.next;
        secondLast=secondLast.next;
    }
    secondLast.next=null;

}
public void display()
{
    if(head==null){
        System.out.println("List is empty");
        return;
    }
    Node currNode=head;
    while(currNode!=null)
    {
        System.out.println(currNode.data+"->");
        currNode=currNode.next;
    }
    System.out.println("NULL");
}

public static void main(String[] args) {
    Sinlinkedlist list=new Sinlinkedlist();
// do{
//     System.out.println("main menu");
//     System.out.println("1.add at first");
//     System.out.println("2.add at last");
//     System.out.println("3.delete from first");
//     System.out.println("4.delete from last");
//     System.out.println("5.Exit");
//     System.out.println("enter your choice ");
//     Scanner sc=new Scanner(System.in);
//     choice=sc.nextInt();
//     data=sc.nextInt();
//     switch(choice)
//     {
//         case 1:
//             list.addFirst(data);
//             break;
//         case 2:
//             list.addLast(data);
//             break;
//         case 3:
//             list.deleteFirst();
//             break;
//         case 4:
//             list.deleteLast();
//             break;
//         case 5:
//             break;
//     }    
//     }while( choice <= 6);

list.addFirst(10);
list.addFirst(20);
list.addLast(30);
list.addFirst(11);
list.addLast(40);
}
}