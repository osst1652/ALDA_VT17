package alda.linear;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * @author Erik Svärdson svardson@gmail.com
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
		}

		public Node(E data, Node<E> next) {
			this.data = data;
			this.next = next;
		}
	}

	private Node<E> first; // head
	private Node<E> last; // tail
	private int siz = 0;

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

		if (index < 0 || index >= siz || siz == 0) {
			throw new IndexOutOfBoundsException();
		}

		Node<E> currentNode = first;
		Node<E> previousNode = null;

		for (int i = 0; i < index; i++) {

			previousNode = currentNode;
			currentNode = currentNode.next;

		}

		if (currentNode == first) {
			first = currentNode.next;

		} else {
			previousNode.next = currentNode.next;
		}

		if (currentNode == last) {
			last = previousNode;
		}

		siz--;
		return currentNode.data;

	}

	@Override
	public boolean remove(E element) {

		Node<E> currentNode = first;

		for (int i = 0; i < siz; i++) {

			if (currentNode.data == element || currentNode.data.equals(element)) {
				remove(i);
				return true;
			}

			currentNode = currentNode.next;

		}

		return false;

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
		return indexOf(element) != -1;
	}

	@Override
	public int indexOf(E element) {
		int index = 0;
		Node<E> currentNode = first;

		if (element == null) {

			while (currentNode != null) {
				if (currentNode.data == null) {
					return index;
				}
				index++;
				currentNode = currentNode.next;
			}
		} else {
			while (currentNode != null) {
				if (element.equals(currentNode.data)) {
					return index;
				}
				index++;
				currentNode = currentNode.next;
			}
		}

		return -1;

	}

	@Override
	public void clear() {

		last = first = null;

		siz = 0;

	}

	@Override
	public int size() {
		return siz;
	}

	private class MyIter implements Iterator<E> {
		Node<E> currentNode;
		Node<E> previousNode;
		Node<E> prevprevNode;

		private boolean removedOnce;

		public MyIter(Node<E> first) {
			currentNode = first;
			previousNode = null;
			prevprevNode = null;
			removedOnce = false;
		}

		@Override
		public boolean hasNext() {
			if (currentNode == null) {
				return false;
			} else {
				return true;
			}
		}

		@Override
		public E next() {
			if (currentNode == null) {
				throw new NoSuchElementException();
			}

			E value = currentNode.data;
			prevprevNode = previousNode;
			previousNode = currentNode;
			currentNode = currentNode.next;
			removedOnce = false;
			return value;

		}

		@Override
		public void remove() {

			if (previousNode == null || removedOnce) {
				throw new IllegalStateException();
			}

			if (prevprevNode == null) {
				first = currentNode;
			} else {
				prevprevNode.next = currentNode;
			}

			siz--;
			removedOnce = true;
		}

	}

	@Override
	public Iterator<E> iterator() {

		return new MyIter(first);
	}

	@Override
	public String toString() {

		String output = "[";

		if (size() == 0) {
			return "[]";
		} else {

			Node<E> currentNode = first;

			if (currentNode != null) {

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
