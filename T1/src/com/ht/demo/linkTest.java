package com.ht.demo;

public class linkTest {
	public static void main(String[] args) {
		Node n1=new Node("����");
		Node n2=new Node("�ܼ�");
		Node n3=new Node("�鳤");
		
		Link link =new Link();		
		link.addNode(n1);
		link.addNode(n2);
		link.addNode(n3);
		
		//link.deleteNode(n1);
		//link.deleteNode(n3);
		
		link.seeNode();
	}

}