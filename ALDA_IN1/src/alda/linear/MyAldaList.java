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
 * 
 */

public class MyAldaList<E> {
	
	//Storlek på listan. DEFAULT_CAPACITY i kursboken
	private static final int listSize = 10;
	
	//E är objekten i listan.theItems i kursboken
	private E [] items;
	
	//siz är för storlekskontroll. theSize i kursboken
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
