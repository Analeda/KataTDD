package cl.agil.ubb;

public class Pila {

	int [] arr;
	int num;
	public Pila(){
		arr = new int[2];
		num=-1;
	}
	
	public boolean estaVacia(){
		if(num==-1){
			return true;
		}else
			return false;
	}
	
	public void agregar(int num1){
		num++;
		arr[num]=num1;
	}
	
	public int tamaño(){
		return arr.length;
	}
	public int pop(){
		return arr[num--];		
	}
	
}
