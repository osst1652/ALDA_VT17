package alda.linear;

import java.util.Iterator;

/**
 * <h2>Javadoc f�r inl�mning 1 </h1>
 * Taget fr�n inl�mningen:<p>
 * 1:<p>
 * Namnet p� er listklass ska vara MyAldaList och den ska ligga i samma paket som interfacet: alda.linear.<b>CHECK</b> <p>
 * 
 * 2:<p>
 * Det ni ska l�mna in p� den h�r uppgiften �r tv� saker: k�llkoden f�r er listklass och f�r nodklassen. <p>
 * Detta blir allts� en eller tv� javafiler beroende p� om ni placerar nodklassen som en inre klass eller inte.<p> 
 * 
 * 3:<p>
 * Filerna ska inte vara packade p� n�got s�tt vid inl�mningen. <p>
 * 
 * 4:<p>
 * Filerna ska inneh�lla namn och epostadresser till samtliga gruppmedlemmar i en kommentar h�gst upp. <b>CHECK</b>
 * <p>
 * @author Erik Sv�rdson svardson@gmail.com
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
 * 
 */

public class MyAldaList<E> implements ALDAList<E> {
	
	private static class Node<E> {
		E data;
		Node next;
		
		public Node(E data) {
			this.data = data;
		}
	}
	
	//Fr�n f�rel�sningsbilderna
	
	private Node<E> first;
	private Node<E> last;
	
	//Storlek p� listan. DEFAULT_CAPACITY i kursboken
	
//	Denna static metod blir ger fel i testfallen
//	private static final int listSize = 10;
	
	//E �r objekten i listan.theItems i kursboken
	
//	Ger ocks� fel i f�rsta testfallet
//	private E [] items;
	
	//siz �r f�r storlekskontroll. theSize i kursboken
	private int siz;

	
	/*
	 * add 1 och add 2 funktionerna har jag hittat
	 * liknande versioner i kursboken. 
	 * 
	 * */
//	public void add(E element){
//		
//	}
	@Override
	public void add(int index, E element){
//		items[index] = element;
		
	}
	
	//denna fr�n f�rel�sningsbilderna ocks�
	
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
		return null;
	}
	
	@Override
	public boolean remove(E element){
		
		return false;
	}
	
	@Override
	public E get(int index){
		
//		return items[index];
		
		return null;
	}
	
	@Override
	public boolean contains(E element){
		
		return false;
	}
	
	@Override
	public int indexOf(E element){
		
		return 0;
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
	public String toString(){
	return "[]";
	}

}
