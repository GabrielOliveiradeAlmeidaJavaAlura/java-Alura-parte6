package br.com.bytebank.banco.test;
import br.com.bytebank.banco.modelo.*;
public class testeArrayDeReferencias {

	
	public static void main(String[] args) {
		
		Conta[] contas = new Conta[5];
		
		ContaCorrente cc1 = new ContaCorrente(22, 11);
		contas[0] = cc1;
		
		ContaPoupanca cc2 = new ContaPoupanca(11, 22);
		contas[1]= cc2;
		
		System.out.println(contas[1].getNumero());
		
		ContaCorrente ref = (ContaCorrente) contas[0];
		System.out.println(cc2.getNumero());
		System.out.println(ref.getNumero());
		
		for(int i=0 ; i< contas.length; i++ ){
			System.out.println(contas[i]);
		}
	    }
	}


