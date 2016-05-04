package cl.agil.ubb;

public class Pila {

	int [] arr;
	int num;
	public Pila(){
		arr = new int[3];
		num=-1;
	}
	
	public boolean estaVacia(){
		if(num==-1){
			return true;
		}else
			return false;
	}
}
