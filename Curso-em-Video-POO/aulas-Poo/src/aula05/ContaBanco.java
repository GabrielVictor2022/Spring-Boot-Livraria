package aula05;

public class ContaBanco {

	public int numConta;
	protected String tipo;
	private String dono;
	private double saldo;
	private boolean status;

	public ContaBanco(double saldo, boolean status) {
		this.setSaldo(0);
		this.setStatus(false);
		;
	}

	public void estadoAtual() {
		System.out.println("----------------------------");
		System.out.println("Conta: " + this.getNumConta());
		System.out.println("Tipo: " + this.getTipo());
		System.out.println("Dono: " + this.getDono());
		System.out.println("Saldo: " + this.getSaldo());
		System.out.println("Status: " + this.getStatus());

	}

	public void abrirConta(String t) {
		System.out.println("----------------------------");
		this.setTipo(t);
		if ("CC".equalsIgnoreCase(t)) {
			this.setSaldo(50);
		} else if ("CP".equalsIgnoreCase(t)) {
			this.setSaldo(150);
		}
		this.setStatus(true);
		System.out.println("Conta aberta com sucesso!");
	}

	public void fecharConta() {
		System.out.println("----------------------------");
		if (this.getSaldo() > 0) {
			System.out.println("Você precisa retirar todo o dinheiro para fechar a conta.");
		} else if (this.getSaldo() < 0) {
			System.out.println("Você precisa quitar seus débitos para fechar a conta.");
		} else {
			System.out.println("Conta fechada com sucesso.");
			this.setStatus(false);
		}

	}

	public void depositar(double v) {
		System.out.println("----------------------------");
		if (getStatus()) {
			// saldo += v;
			this.setSaldo(this.getSaldo() + v);
			System.out.println("Deposito realizado na conta de " + getDono());
		} else {
			System.out.println("Impossível depositar");
		}

	}

	public void sacar(double v) {
		System.out.println("----------------------------");
		if (this.getStatus()) {
			if (this.getSaldo() >= 0 && v <= this.getSaldo()) {
				// saldo = -v;
				this.setSaldo(getSaldo() - v);
				System.out.println("Saque realizado na conta de " + getDono());

			} else {
				System.out.println("Saldo insuficiente.");
			}
		} else {
			System.out.println("Impossível sacar.");
		}
	}

	public void pagarMensalidade() {
		System.out.println("----------------------------");
		double v = 0;
		if ("CC".equalsIgnoreCase(this.getTipo())) {
			v = 12;
		} else if ("CP".equalsIgnoreCase(this.getTipo())) {
			v = 20;
		}
		if (this.getStatus()) {
			if (this.getSaldo() > v) {
				// saldo -= v;
				this.setSaldo(getSaldo() - v);
				System.out.println("Mensalidade paga!");
			} else {
				System.out.println("Saldo insuficiente");
			}
		} else {
			System.out.println("Não paga mensalidade");
		}
	}

	public int getNumConta() {
		return numConta;
	}

	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getDono() {
		return dono;
	}

	public void setDono(String dono) {
		this.dono = dono;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public boolean getStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

}
