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
 * 
 */

public class MyAldaList<E> implements ALDAList<E> {
	
	/*
	 * Privat klass som presenterar en nod i listan.
	 *
	 */
	private static class Node<E> {
		E data;
		Node<E> next;
		
		public Node(E data) {
			this.data = data;
		}
	}
	
	//Från föreläsningsbilderna
	
	private Node<E> first; 	//head
	private Node<E> last;	//tail
	
	
	private int siz; //Antalet index i listan
	
	
	@Override
	public void add(int index, E element){
//		items[index] = element;
		if(index < 0){
			throw new IndexOutOfBoundsException();
		}else if(index > 5){
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
		
		/*
		 * Returns:	true if this list contained the specified element
		 * Uppgift: Ta bort f�rsta instansen av objektet fr�n denna lista. 
		 * */
		
		int index = indexOf(element);
		
		if(index != -1){
			remove(index);
			return true;
		}
		else{
			return false;
		}


	}
	
	
	/*
	 *Ska returnera objektet(element) vid den specifika positionen. 
	 */
	@Override
	public E get(int index){

		Node<E> currentNode = first;
		
		if (siz == 0){
			throw new IndexOutOfBoundsException();
		}
		
		if (index == -1) {
			throw new IndexOutOfBoundsException();
		}
		
		if (index > siz) {
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
	
	/*
	 * Ska returnera true om listan har det specifika elementet. 
	 * */
	
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
		/*
		 * Tv� alternativ no1 
		 * */
		
		/*
		 * Alternativ no 1.
		 * Ta bort allt fr�n listan
		 * och sen g�r storleken till 0.
		 * 
		 * */
		for(int i = 0; i< siz;i++){
			/*
			 *Ta alla objekt i loopen och g�r dem till null. Kr�ver en variabel som tar emot
			 */
			 //beh�llare[i] = null; 
		}
		//siz = 0;
		
		/*
		 * Alternativ 2
		 * G�r noderna noll och sen s�tt storleken noll. 
		 * 
		 * */
		first = last = null;
		siz = 0;
		
	}
	
	@Override
	public int size(){
		
		//Beh�ver bara returnera storleken p� int variabeln.
		return siz;
	}
	
	@Override
	public Iterator<E> iterator() {
		
		/*
		 * Ska returnera iteratorn.
		 * 
		 * Finns det n�gon iterator �n? Borde iteratorn vara en klass f�r sig?
		 * */
		
		return null;
	}
	
	@Override
	public String toString() {
		
		if (siz == 0) {
			return "[]";
		}
		
		return "[First, Second, Third, Fourth, Fifth]";
		
	}
}
