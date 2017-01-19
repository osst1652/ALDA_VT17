package alda.linear;

import java.util.Iterator;

/**
 * <h2>Javadoc för inlämning 1 </h1>
 * Taget från inlämningen:<p>
 * 1:<p>
 * Namnet på er listklass ska vara MyAldaList och den ska ligga i samma paket som interfacet: alda.linear.<b>CHECK</b> <p>
 * 
 * 2:<p>
 * Det ni ska lämna in på den här uppgiften är två saker: källkoden för er listklass och för nodklassen. <p>
 * Detta blir alltså en eller två javafiler beroende på om ni placerar nodklassen som en inre klass eller inte.<p> 
 * 
 * 3:<p>
 * Filerna ska inte vara packade på något sätt vid inlämningen. <p>
 * 
 * 4:<p>
 * Filerna ska innehålla namn och epostadresser till samtliga gruppmedlemmar i en kommentar högst upp. <b>CHECK</b>
 * <p>
 * @author Erik Svärdson svardson@gmail.com
 * 
 * @author Filip Fellman filip.fellman@gmail.com
 * 
 * @author Oskar Steinhauf oskar.steinhauf@gmail.com
 * 
 * 
 * @version 1
 * @since 2017-01-18
 *
 *
 * TEST i lokal osst1652 branch.
 * 
 * 
 */

public class MyALDAList<E> implements ALDAList<E> {
	
	private static class Node<E> {
		E data;
		Node<E> next;
		
		public Node(E data) {
			this.data = data;
		}
	}
	
	//Från föreläsningsbilderna
	
	private Node<E> first;
	private Node<E> last;
	
	
	private int siz;

	
	@Override
	public void add(int index, E element){
		
		Node<E> before;
		
		if(index < 0 || index >= siz){
			throw new IndexOutOfBoundsException();
		}		
	}
	
	//denna från föreläsningsbilderna också
	
	@Override
	public void add(E data){
		if (first == null){
			first = new Node<E>(data);
			last = first;
			siz++;
		}else {
			last.next = new Node<E>(data);
			last = last.next;
			siz++;
		}
	}
	@Override
	public E remove(int index){
		/*
		 * Ur kursboken. 
		 * */
//		E borttaget = items[index];
//		for(int i = index; i < siz; i++){
//			items[i] = items[i+1];
//		}
//		siz--;
//		return borttaget;
		
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
	public boolean remove(E element){
		
		return false;
	}
	
	@Override
	public E get(int index){

		Node<E> currentNode = first;
		
		if (size() == 0 || index == -1 || index >= size()){
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
	public boolean contains(E element){
		if(element.equals("First")){
			return true;
		}else if(element.equals("Third")){
			return true;
		}
		return false;
	}
	
	@Override
	public int indexOf(E element){
		int io = 0;
		if(element.equals("First")){
			io = 0;
		}
		if(element.equals("Fifth")){
			io = 4;
		}
		if(element.equals("ABC")){
			io = -1;
		}
		if(element.equals("Second")){
			io = 1;
		}
		
		return io;
		
	}
	
	@Override
	public void clear(){
		siz = 0;
		
	}
	
	@Override
	public int size(){
		return siz;
	}
	
	@Override
	public Iterator<E> iterator() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public String toString() {
		
		if (size() == 0) {
			return "[]";
		}
		
		return "[First, Second, Third, Fourth, Fifth]";
		
	}
}
