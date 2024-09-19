package io.github.unlp_oo.ejercicio8_LookupEmpleados;

public class EmpleadoTest {

	
	
	public static void main(String[] args) {
		Gerente alan = new Gerente("Alan Turing");
		double aportesDeAlan = alan.aportes();
		System.out.println(aportesDeAlan);
		
		double sueldoBasicoDeAlan = alan.sueldoBasico();
		System.out.println(sueldoBasicoDeAlan);
		
	// ¿Qué valores tendrán las variables aportesDeAlan y 
    //		sueldoBasicoDeAlan luego de ejecutar cada fragmento de código?
		
	// aportesDeAlan = 57.000 * 0.05 = 2850
		
	// sueldoBasicoDeAlan = monto basico + aportes , ya que lo va a buscar a la ant clase (Empleado)
	// sabe su comportamiento pero los metodos para calcular el sueldo basico los saca de la clase Gerente. 
    }
	
	
	
	
	
	
	
}
