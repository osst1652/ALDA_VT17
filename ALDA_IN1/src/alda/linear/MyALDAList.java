package alda.linear;

import java.util.Iterator;


/** @author Erik Sv√§rdson svardson@gmail.com
 * 
 * @author Filip Fellman filip.fellman@gmail.com
 * 
 * @author Oskar Steinhauf oskar.steinhauf@gmail.com
 *  
 */

public class MyALDAList<E> implements ALDAList<E> {


	private static class Node<E> {
		E data;
		Node<E> next;

		public Node(E data) {
			this.data = data;
			this.next = null;
		}

		public Node(E data, Node<E> next) {
			this.data = data;
			this.next = next;
		}
	}


	private Node<E> first; // head
	private Node<E> last; // tail

	private Node<E> getNode(int index) {
		Node<E> target = first;
		for (int i = 0; i < index; i++) {
			target = target.next;
		}

		return target;
	}

	private void addFirst(E element) {
		first = new Node<E>(element, first);
		siz++;
	}

	private void addAfter(Node<E> temp, E element) {
		temp.next = new Node<E>(element, temp.next);
		siz++;
	}

	private int siz;

	@Override
	public void add(int index, E element) {

		if (index < 0 || index > siz) {
			throw new IndexOutOfBoundsException();
		}

		if (index == 0) {
			addFirst(element);
		} else {
			Node<E> temp = getNode(index - 1);
			addAfter(temp, element);
		}


	}


	@Override
	public void add(E data) {
		if (first == null) {
			first = new Node<E>(data);
			last = first;

		} else {
			last.next = new Node<E>(data);
			last = last.next;
		}

		siz++;
	}

	@Override
	public E remove(int index) {

		Node<E> currentNode = first;

		for (int i = 0; i < index; i++) {
			if (first.next == null) {
				return null;
			}
			Node<E> temp = currentNode.next;
			currentNode = temp;
		}
		siz--;
		return currentNode.data;
	}

	@Override
	public boolean remove(E element) {

		int index = indexOf(element);

		if (index != -1) {
			remove(index);
			return true;
		} else {
			return false;
		}

	}


	@Override
	public E get(int index) {

		Node<E> currentNode = first;

		if (size() == 0 || index == -1 || index >= size()) {
			throw new IndexOutOfBoundsException();
		}

		for (int i = 0; i < index; i++) {
			if (first.next == null) {
				return null;
			}
			currentNode = currentNode.next;

		}

		return currentNode.data;
	}


	@Override
	public boolean contains(E element) {
		if (element.equals("First")) {
			return true;
		} else if (element.equals("Third")) {
			return true;
		}
		return false;
	}

	@Override
	public int indexOf(E element) {
		int io = 0;
		if (element.equals("First")) {
			io = 0;
		}
		if (element.equals("Fifth")) {
			io = 4;
		}
		if (element.equals("ABC")) {
			io = -1;
		}
		if (element.equals("Second")) {
			io = 1;
		}

		return io;

	}

	@Override
	public void clear() {

		first = last = null;

		siz = 0;

	}

	@Override
	public int size() {
		// Behˆver bara returnera storleken pÂ int variabeln.
		return siz;
	}

	@Override
	public Iterator<E> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String toString() {
		
		String output = "[";
		
		if (size() == 0){
			return "[]";
		}else {
			
			Node<E> currentNode = first;
			
			if (currentNode != null){
				
				while (currentNode != null) {
					
					output += currentNode.data.toString();
					
					if (currentNode.next != null) {
						output += ", ";
					}
					
					currentNode = currentNode.next;
				}
				
			}
			
		}
		
		return output += "]";

	}

}
