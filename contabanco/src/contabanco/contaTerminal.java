package contabanco;
import java.util.Scanner;
public class contaTerminal {
public static void main(String[] args) {
	
	Scanner teclado = new Scanner(System.in);
	
	int numero;
	String agencia;
	String nomeCliente;
	float saldo;
	
	System.out.println("Por Favor, digite o numero da conta: ");
	numero = teclado.nextInt();
	//System.out.println("Conta: " + numero);  criei apenas para conferir se estava funcionando
	
		System.out.println();
	
	System.out.println("Por Favor, digite o numero da agencia: ");
	agencia = teclado.next();
	//System.out.println("Agencia: " + agencia);  criei apenas para conferir se estava funcionando

		System.out.println();
	
	System.out.println("Por Favor, digite o seu nome: ");
	nomeCliente = teclado.next();
	//System.out.println("Agencia: " + nomeCliente); criei apenas para conferir se estava funcionando
	
		System.out.println();
	
	System.out.println("Por Favor, digite a quantia que deseja depositar: ");
	saldo = teclado.nextFloat();
	//System.out.println("saldo: " + saldo);  criei apenas para conferir se estava funcionando
	
		System.out.println();
	
	System.out.println("Ola " + nomeCliente +", obrigado por criar uma conta em nosso banco, sua agencia e " + agencia + ", conta "+ numero + " e seu saldo " + saldo + " ja esta disponivel para saque");
	
	
	}
}
