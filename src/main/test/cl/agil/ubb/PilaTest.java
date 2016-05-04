package cl.agil.ubb;
import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.is;

public class PilaTest {
	@Test
	public void ParteVacia(){
		Pila p= new Pila();
		boolean r=p.estaVacia();
		assertThat(r,is(true));
	}
	
	@Test
	public void agregarUno(){
		Pila p= new Pila();
		p.agregar(1);
		boolean r=p.estaVacia();
		assertThat(r, is(false));
	}
	
	@Test
	public void agregarUnoYdos(){
		Pila p= new Pila();
		p.agregar(1);
		p.agregar(2);
		boolean r=p.estaVacia();
		assertThat(r, is(false));
	}
	@Test
	public void agregarUnoYdosTamañoStackDos(){
		Pila p= new Pila();
		p.agregar(1);
		p.agregar(2);
		int r=p.tamaño();
		assertThat(r, is(2));
	}

	@Test
	public void agregarUnoHacePOPUno(){
		Pila p= new Pila();
		p.agregar(1);	
		int r=p.pop();
		assertThat(r, is(1));
	}
	
	@Test
	public void agregarUnoYDosHacePOPDos(){
		Pila p= new Pila();
		p.agregar(1);
		p.agregar(2);
		int r=p.pop();
		assertThat(r, is(2));
	}
	
}
;