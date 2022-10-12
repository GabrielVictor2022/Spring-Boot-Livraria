package aula05;

public class ContaBancoTreino {

	private String numConta;
	protected String tipo;
	private String dono;
	private double saldo;
	private boolean status;

	public ContaBancoTreino() {
		this.setSaldo(0);
		this.setStatus(false);
	}

	public void estadoAtual() {
		System.out.println("--------------------------");
		System.out.println("Conta: " + getNumConta());
		System.out.println("Tipo: " + getTipo());
		System.out.println("Dono: " + getDono());
		System.out.println("Saldo: " + getSaldo());
		System.out.println("Status: " + getStatus());
	}

	public void abrirConta(String t) {
		setTipo(t);
		setStatus(true);

		if (t.equalsIgnoreCase("CC")) {

			setSaldo(getSaldo() + 50);

		} else if (t.equalsIgnoreCase("CP")) {
			setSaldo(getSaldo() + 150);
		}
	}

	public void fecharConta() {
		if (getStatus() == true) {
			if (getSaldo() == 0) {
				setStatus(false);
				System.out.println("Conta fechada com sucesso.");
			} else if (getSaldo() > 0) {
				System.out.println("Erro, a conta precisa ser esvaziada para cancelar.");
			} else {
				System.out.println("Erro, os débitos precisam ser pagos para cancelar.");
			}
		} else {
			System.out.println("A conta deve está aberta para cancelar.");
		}
	}

	public void depositar(double v) {
		if (getStatus() == true) {
			setSaldo(getSaldo() + v);
			System.out.println("Depósito realizado com sucesso!");
		} else {
			System.out.println("A conta deve está aberta para depositar.");
		}
	}

	public void sacar(double v) {
		if (getStatus() == true) {
			if (getSaldo() >= v) {
				setSaldo(getSaldo() - v);
				System.out.println("Saque no valor de " + v + "R$ realizado com sucesso!");
			} else {
				System.out.println("Saldo insuficiente para saque!");
			}
		} else {
			System.out.println("A conta deve está aberta para sacar.");
		}
	}

	public void pagarMensal() {
		if (getStatus() == true) {
			double v = 0;
			if (getTipo().equalsIgnoreCase("CC")) {
				v = 12;
				setSaldo(getSaldo() - v);
				System.out.printf("Mensalidade de %.2fR$ paga com sucesso!", v);
			} else {
				v = 20;
				setSaldo(getSaldo() - v);
				System.out.printf("Mensalidade de %.2fR$ paga com sucesso!", v);
			}
		} else {
			System.out.println("A conta deve está aberta para ser paga a mensalidade.");
		}
	}

	String getNumConta() {
		return numConta;
	}

	void setNumConta(String numConta) {
		this.numConta = numConta;
	}

	String getTipo() {
		return tipo;
	}

	void setTipo(String tipo) {
		this.tipo = tipo;
	}

	String getDono() {
		return dono;
	}

	void setDono(String dono) {
		this.dono = dono;
	}

	double getSaldo() {
		return saldo;
	}

	void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	boolean getStatus() {
		return status;
	}

	void setStatus(boolean status) {
		this.status = status;
	}

}
