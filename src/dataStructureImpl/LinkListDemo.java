package dataStructureImpl;

import java.util.Scanner;

public class LinkListDemo {
    Node head;

    public LinkListDemo() {
        this.head = new Node();
    }

    public static void main(String[] args) {
        LinkListDemo makeLinkList = new LinkListDemo();

        Node linkListHead, p;
        linkListHead = makeLinkList.creatLinkList();
        p = linkListHead;

        for (int i = 0; i < linkListHead.length; i++) {
            if (p.next == null) {
                System.out.println("[null]");
            }
            System.out.print("[ " + p.data + " | (" + p.next + ") ]" + "-->");
            p = p.next;
        }

//        System.out.println(linkListHead+"[--]"+linkListHead.data + "--" + linkListHead.next);
//        System.out.println(linkListHead.next+"[--]"+linkListHead.next.data + "--" + linkListHead.next.next);
//        System.out.println(linkListHead.next.next+"[--]"+linkListHead.next.next.data + "--" + linkListHead.next.next.next);
//        System.out.println(linkListHead.next.next.next+"[--]"+linkListHead.next.next.next.data + "--" + linkListHead.next.next.next.next);

    }

    public Node creatLinkList() {
        int n = 0;
        Node p1, p2, head;
        p1 = p2 = null;

        p1 = new Node();

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入数据：");
        int input = sc.nextInt();

        p1.data = input;
        head = p1;
        head.next = null;
        n++;

        while (input != 0) {
            p2 = new Node();

            System.out.println("请输入数据：");
            input = sc.nextInt();

            p2.data = input;
            p1.next = p2;
            p2.next = null;
            p1 = p2;
            n++;
        }
        head.length = n;
        return head;
    }
}
