package Proyecto_Calculadora.Proyecto_Calculadora;

import javax.swing.JOptionPane;

public class Calculadora {
	private int operador1;
	private int operador2;
	private int operacio;
	
	public Calculadora(int primero, int segundo) {
		this.operador1=primero;
		this.operador2=segundo;
	}
	
	public Calculadora() {
		this.operador1=0;
		this.operador2=0;
	}
	
	public int operacio() {
		switch(this.operacio) {
			case 1: return suma();
			case 2: return resta();
			case 3: return multiplicacio();
			case 4: return divisio();
		}
		return 0;
	}
	
	public int suma() {
		return operador1+operador2;
	}
	
	public int resta() {
		return operador1-operador2;
	}
	
	public int multiplicacio() {
		return operador1*operador2;
	}
	
	public int divisio(){
		try {
			return operador1/operador2;
		}catch(ArithmeticException ae) {
			JOptionPane.showMessageDialog(null,"Arithmetic Exception occurred, maybe you are trying to divide / 0 !");
		}
		return 0;
	}
	
	public int getOperador1() {
		return operador1;
	}

	public void setOperador1(int operador1) {
		this.operador1 = operador1;
	}

	public int getOperador2() {
		return operador2;
	}

	public void setOperador2(int operador2) {
		this.operador2 = operador2;
	}


	public int getOperacio() {
		return operacio;
	}

	public void setOperacio(int operacio) {
		this.operacio = operacio;
	}
	
	
}
