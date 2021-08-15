package br.com.bytebank.banco.test;
import br.com.bytebank.banco.modelo.*;
public class testeArrayDeReferencias {

	
	public static void main(String[] args) {
		
		ContaCorrente[] contas = new ContaCorrente[5];
	    ContaCorrente conta1= new ContaCorrente(3545, 456719);
	    ContaCorrente conta2= new ContaCorrente(3545, 456729);
	    ContaCorrente conta3= new ContaCorrente(3545, 456739);
	    ContaCorrente conta4= new ContaCorrente(3545, 456749);
	    ContaCorrente conta5= new ContaCorrente(3545, 456799);

	    contas[0]=conta1;
	    contas[1]=conta2;
	    contas[2]=conta3;
	    contas[3]=conta4;
	    contas[4]=conta5;
		
	    for(int i = 0; i<=4; i++){
	    	System.out.println(contas[i]);
	    	System.out.println(contas[i].getNumero());
	    }
	}

}
