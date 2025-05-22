package Constructores2;

public class Prueba {

	public static void main(String[] args) {
		
		CuentaBancaria cuenta = new CuentaBancaria("Agustina Banegas");
		
		cuenta.depositar(500);
		
		System.out.println("Estado inicial de la cuenta: ");
		System.out.println(cuenta);
		
		cuenta.depositar(500);
		cuenta.extraer(100);
		cuenta.depositar(1500);
		
		System.out.println("Estado final de la cuenta:");
		System.out.println(cuenta);

	}

}
