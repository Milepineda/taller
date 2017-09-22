
public class calcular {
	
    public int resultado;
    public int num1;
    public int num2;
    public float num3;
    public float num4;
    public float resultado1;

public void sumarnumeros(int num1, int num2) {
		
		resultado = num1+num2;
		
		System.out.println("la suma es:" +resultado);
	}
public void restarnumeros(int num1, int num2) {
	
	resultado = num1-num2;
	
	System.out.println("la resta es:" +resultado);
}

public void mulnumeros(int num1, int num2) {
	
	resultado = num1 * num2;
	
	System.out.println("la multiplicación es:" + resultado);
}

public void divnumeros(float num3, float num4) {
	
	try {
		resultado1 = num3 / num4;
	} catch (ArithmeticException ex) {
		resultado1 = 0;
		System.out.println("Error:"+ ex.getMessage());
	}
	
	System.out.println("la division es:" + resultado1);
}

public int getResultado() {
	return resultado;
}

public void setResultado(int resultado) {
	this.resultado = resultado;
}

public int getNum1() {
	return num1;
}

public void setNum1(int num1) {
	this.num1 = num1;
}

public int getNum2() {
	return num2;
}

public void setNum2(int num2) {
	this.num2 = num2;
}
	
}
