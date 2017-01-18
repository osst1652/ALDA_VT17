package alda.linear;

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
 * @author Erik Sv�rdson <email>
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
