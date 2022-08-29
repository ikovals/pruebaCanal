import java.util.Scanner;

public class CalculaVuelto {
	
static private Scanner Teclado = new Scanner(System.in);

	public static void main(String[] args) {
	
	int precioCompra;
	System.out.println("ingrese el precio de la compra");
	precioCompra = Teclado.nextInt();
	int pago;
	System.out.println("ingrese con cuanto va a pagar");
	pago = Teclado.nextInt();
	
	int vuelto = pago - precioCompra;
	
	int cambio = vuelto; 
	System.out.println(cambio);
	int billete100 = 0;
	int billete50 = 0;
	int billete20 = 0;
	int billete10 = 0;
	int billete5 = 0;
	int billete2 = 0;
	int billete1 = 0;
	
	
	while(cambio >= 100) {
		billete100 += 1;
		cambio -= 100;
		}
	while(cambio >= 50) {
		billete50 += 1;
		cambio -= 50;
		}
	while(cambio >= 20) {
		billete20 += 1;
		cambio -= 20;
		}
	while(cambio >= 10) {
		billete10 += 1;
		cambio -= 10;
		}
	while(cambio >= 5) {
		billete5 += 1;
		cambio -= 5;
		}
	while(cambio >= 1) {
		billete1 += 1;
		cambio -= 1;
		}
		
	System.out.println("Su vuelto es de : $" + vuelto);
	System.out.println("Billetes de $100: " + billete100);
	System.out.println("Billetes de $50: " + billete50);
	System.out.println("Billetes de $20: " + billete20);
	System.out.println("Billetes de $10: " + billete10);
	System.out.println("Billetes de $5: " + billete5);
	System.out.println("Billetes de $1: " + billete1);
	}

}
