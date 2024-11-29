package com.stack;

import java.util.Scanner;

public class CreationOfStack {
	public static void main(String[] args) {
		int operation=0;
		
		
		
		Scanner scan = new Scanner(System.in);
		Stack s = new Stack();
		while(operation!=4) {
			System.out.println("Which operation do want to do on Stack");
			System.out.println("1 for push");
			System.out.println("2 for pop");
			System.out.println("3 for view stack");
			
			operation = scan.nextInt();
			switch (operation) {
			case 1: s.push();
					break;
			case 2: s.pop();
					break;
			case 3: s.view();
					break;
			default: System.out.println("Invalid Input");

			}
			
		}
		
		
		
		
		
	}

}
class Stack{
	
	Scanner s = new Scanner(System.in);
	int size = 5;
	int top = -1;
	
	int [] stack = new int[size];
	
	
	public boolean isEmpty() {
		if(top==-1) {
			return true;
		}
		return false;
		
	}
	public boolean isFull() {
		if(top == size-1) {
			return true;
		}
		return false;
		
	}
	//push
	public void push() {
		if(isFull()) {
			System.out.println("The Stack is Full. You can't add element in stack");
			return;
		}
		System.out.println("Enter element to push in stack");
		int num = s.nextInt();
		top=top+1;
		stack[top]=num;
	}
	//pop
	public void pop() {
		if(isEmpty()) {
			System.out.println("The Stack is Empty. You can't pop element");
			return;
		}
		int prevTopElement=stack[top];
		top= top -1;
		System.out.println("poped element "+prevTopElement);
	}
	public void view() {
		for(int i=top; i>=0; i--) {
			System.out.println(stack[i]);
		}
	}	
}
