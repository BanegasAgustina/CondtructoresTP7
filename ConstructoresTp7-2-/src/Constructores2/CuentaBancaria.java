package Constructores2;

public class CuentaBancaria {
	private String titular;
	private double saldo;
	private int cantidadDepositos;
	private int cantidadExtracciones;
	
	
	public String getTitular() {
		return titular;
	}
	
	
	public double getSaldo() {
		return saldo;
	}
	
	public int getCantidadDepositos() {
		return cantidadDepositos;
	}
	
	public int getCantidadExtracciones() {
		return cantidadExtracciones;
	}
	
	
	
	public CuentaBancaria(String titular) {
		super();
		this.titular = titular;
	}


	public void depositar(double cantidad) {
		
		 if (cantidad > 0) {
	            saldo += cantidad;
	            cantidadDepositos++;
	        }
	}
	
	
	
	public boolean extraer(double cantidad) {
		boolean flag=false;
		if(cantidad>0 && saldo>=cantidad) { 
			saldo-=cantidad;
			cantidadExtracciones++;
			flag=true;	
			}
	
		return flag;
	}


	@Override
	public String toString() {
		return "CuentaBancaria [titular=" + titular + ", saldo=" + saldo + ", cantidadDepositos=" + cantidadDepositos
				+ ", cantidadExtracciones=" + cantidadExtracciones + "]";
	}
	
}
