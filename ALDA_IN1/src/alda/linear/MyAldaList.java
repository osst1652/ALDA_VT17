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

public class MyAldaList<E> {
	
	//Storlek p� listan. DEFAULT_CAPACITY i kursboken
	private static final int listSize = 10;
	
	//E �r objekten i listan.theItems i kursboken
	private E [] items;
	
	//siz �r f�r storlekskontroll. theSize i kursboken
	private int siz;

	
	/*
	 * add 1 och add 2 funktionerna har jag hittat
	 * liknande versioner i kursboken. 
	 * 
	 * */
	public void add(E element){
		
	}
	
	public void add(int index, E element){
		items[index] = element;
		
	}

	public E remove(int index){
		/*
		 * Ur kursboken. 
		 * */
		E borttaget = items[index];
		for(int i = index; i < siz; i++){
			items[i] = items[i+1];
		}
		siz--;
		return borttaget;
	}
	

	public boolean remove(E element){
		
		return false;
	}

	public E get(int index){
		
		return items[index];
	}

	public boolean contains(E element){
		
		return false;
	}

	public int indexOf(E element){
		
		return 0;
	}

	public void clear(){
		siz = 0;
		
	}

	public int size(){
		return 0;
	}



	
	
}
