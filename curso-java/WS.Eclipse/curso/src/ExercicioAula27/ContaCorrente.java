package ExercicioAula27;

import java.util.Scanner;

public class ContaCorrente {
	
	int agencia;
	int conta;
	double saldo;
	double saldoTotal;
	double limiteChequeEspecial;
	double saque;
	double deposito;
	boolean status;
	double saqueLimite;
	

	Scanner scan = new Scanner(System.in);
	
	void realizarSaque() {
		
		System.out.println("Informe valor saque:");
		saque = scan.nextDouble();
		
		if(saque > saldo) {
			//consultarSaldo();
			saldoTotal = saldo + limiteChequeEspecial;
			if(saldoTotal > saque) {
				saldoTotal -= saque;
				saqueLimite = saldoTotal;				
				ConsultarSaldoTotal();
			}else {
				System.out.println("Sem limite na conta.");
			}
			//System.out.println("Sem limite para saque:");
			//System.out.println(saldoTotal);
		}else {
			saldoTotal = saldo - saque;
			status=false;
			ConsultarSaldoTotal();
			System.out.println("Saque realizado:");
		}
		
	}
	void depositar(){
		System.out.println("Informe valor do deposito:");
		deposito = scan.nextDouble();
		saldo = saldo + deposito;
		//System.out.println(saldo);
		
	}
	void ConsultarSaldoTotal() {
		
		if(status) {
			consultarSaldoLimiteEspecia();
		}else {
			ConsultarSaldoSemLimite();
		}
		
		
	}
	void consultarSaldoLimiteEspecia(){
		System.out.println("Saldo da conta        :" + saldo);
		System.out.println("Valor retirado        :" + saque);		
		System.out.println("Saldo limite Especial :" + saqueLimite);
		System.out.println("Saldo total           :" + saldoTotal);
		
	}	
	void ConsultarSaldoSemLimite(){
		System.out.println("Saldo da conta        :" + saldo);
		System.out.println("Valor retirado        :" + saque);
		System.out.println("Saldo limite Especial :" + limiteChequeEspecial);
		System.out.println("Saldo total           :" + saldoTotal);
	}

		
}
