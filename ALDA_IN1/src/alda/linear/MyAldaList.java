package alda.linear;

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
 * @author Erik Svärdson <email>
 * 
 * @author Filip Fellman <email>
 * 
 * @author Oskar Steinhauf <email>
 * 
 * @version 1
 * @since 2017-01-18
 *
 *
 * 
 * 
 */
public class MyAldaList {
	
	public interface ALDAList<E> extends Iterable <E>{
		public void add(E element);

		public void add(int index, E element);

		public E remove(int index);

		public boolean remove(E element);

		public E get(int index);

		public boolean contains(E element);

		public int indexOf(E element);

		public void clear();

		public int size();
	}

}
