package aula06;

import java.util.Iterator;

public class ControleRemoto implements Controlador {

	private int volume;
	private boolean ligado;
	private boolean tocando;
	
	public ControleRemoto() {
		this.setVolume(50);
		this.setLigado(false);
		this.setTocando(false);
	}

	private int getVolume() {
		return volume;
	}

	private void setVolume(int volume) {
		this.volume = volume;
	}

	private boolean getLigado() {
		return ligado;
	}

	private void setLigado(boolean ligado) {
		this.ligado = ligado;
	}

	private boolean getTocando() {
		return tocando;
	}

	private void setTocando(boolean tocando) {
		this.tocando = tocando;
	}

	@Override
	public void ligar() {
		this.setLigado(true);

	}

	@Override
	public void desligar() {
		this.setLigado(false);
	}

	@Override
	public void abrirMenu() {
		if (getLigado() == true) {
			System.out.println("Está ligado? " + this.getLigado());
			System.out.println("Está tocando? " + this.getTocando());
			System.out.print("Volume: " + this.getVolume());
			for (int i = 0; i < this.getVolume(); i += 10) {

				System.out.print("° ");
			}
		}else {
			System.out.println("Impossível abrir menu com a TV desligada.");
		}

	}

	@Override
	public void fecharMenu() {
		if (getLigado() == true) {
			System.out.println("Fechando menu...");
		}else {
			System.out.println("Impossível fechar menu com a TV desligada.");
		}

	}

	@Override
	public void maisVolume() {
		if (getLigado() == true) {
			setVolume( getVolume() + 5);
		}else {
			System.out.println("Impossível aumentar volume com a TV desligada.");
		}
	}

	@Override
	public void menosVolume() {
		if (getLigado() == true) {
			setVolume( getVolume() - 1);
		}else {
			System.out.println("Impossível diminuir volume com a TV desligada.");
		}

	}

	@Override
	public void ligarMudo() {
		if (getLigado() == true && getVolume() > 0) {
			setVolume(0);
		}else {
			System.out.println("Impossível mutar com a TV desligada.");
		}

	}

	@Override
	public void desligarMudo() {
		if (getLigado() == true && getVolume() == 0) {
			setVolume(50);
		}else {
			System.out.println("Impossível desmutar com a TV desligada.");
		}

	}

	@Override
	public void play() {
		if (getLigado() == true && !(this.getTocando())) {
			this.setTocando(true);
			
		}else {
			System.out.println("Impossível dar play com a TV desligada.");
		}

	}

	@Override
	public void pause() {
		if (getLigado() && this.getTocando()) {
			this.setTocando(false);
		}else {
			System.out.println("Impossível pausar com a TV desligada.");
		}

	}

}
