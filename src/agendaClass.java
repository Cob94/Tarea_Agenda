import java.util.Scanner;
public class agendaClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	// Declaramos el Escaner
		Scanner mi_s= new Scanner(System.in);
		
	// declaramos el arreglo y sera de tipo Integer
		int Arreglo[];
		
	// asignaremos la extencion del arreglo mediante el escaner
		System.out.print("¿Cunatos contacnos desea Ingresar?= ");
		Arreglo= new int [mi_s.nextInt()];
	// creamos un Ciclo For para ingresar la cantidad de numeros
	//	que desea ingresar el Usuario
		
	for (int i=0; i<Arreglo.length; i++){
		System.out.print("Ingrese numero "+i+":");
		Arreglo [i]=mi_s.nextInt();
	}
	System.out.println("\n Agenda");
	System.out.println("--------");
	for (int i=0; i<Arreglo.length; i++){
		System.out.println(Arreglo[i]);
	}
	System.out.println("--------");
	}

}
