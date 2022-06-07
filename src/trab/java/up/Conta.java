package trab.java.up;

import utilitarios.Utils;

public class Conta {
			

	private static int contadorDeContas=  1;
	
		private int numeroConta;
		private Pessoa pessoa;
		private Double saldo = 0.0;
		
		public Conta(int numeroConta, Pessoa pessoa) {
			this.numeroConta = contadorDeContas;
			this.pessoa = pessoa;
			contadorDeContas += 1;
		}

		public int getNumeroConta() {
			return numeroConta;
		}

		public void setNumeroConta(int numeroConta) {
			this.numeroConta = numeroConta;
		}

		public Pessoa getPessoa() {
			return pessoa;
		}

		public void setPessoa(Pessoa pessoa) {
			this.pessoa = pessoa;
		}

		public Double getSaldo() {
			return saldo;
		}

		public void setSaldo(Double saldo) {
			this.saldo = saldo;
		}
		
		public String toString() {
			
			return "\nNumero da conta:  " + this.getNumeroConta() +
					      "\nNome " + this.pessoa.getNome() +  
					      "\nCPF " + this.pessoa.getCPF() +  
					      "\nEmail" + this.pessoa.getEmai() +  
					      "\nSaldo " +  Utils.doubleToString(this.getSaldo()) +
					      "\n";
		}
		
		public void depositar(Double valor) {
			if (valor > 0) {
				setSaldo(getSaldo() + valor);
				System.out.println("Seu deposito foi realizado com sucesso");
			}else {
				System.out.println("N�o foi possivel realizar o deposito");
			}
		}
		
		
		
}
