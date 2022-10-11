package aula06;

public class ControleRemotoTeste implements ControladorTeste {
	private int volume;
	private boolean on;
	private boolean playing;

	public ControleRemotoTeste() {
		this.setVolume(50);
		this.setOn(false);
		this.setPlaying(false);
	}

	private int getVolume() {
		return volume;
	}

	private void setVolume(int volume) {
		this.volume = volume;
	}

	private boolean getOn() {
		return on;
	}

	private void setOn(boolean on) {
		this.on = on;
	}

	private boolean getPlaying() {
		return playing;
	}

	private void setPlaying(boolean playing) {
		this.playing = playing;
	}

	@Override
	public void onTv() {
		setOn(true);
	}

	@Override
	public void offTv() {
		setOn(false);
	}

	@Override
	public void play() {
		if (getOn() == true && getPlaying() == false) {
			setPlaying(true);
		}
	}

	@Override
	public void pause() {
		if (getOn() == true && getPlaying() == true) {
			setPlaying(false);
		}
	}

	@Override
	public void openMenu() {
		System.out.println("----------MENU----------");
		if (getOn() == true) {
			if (getOn() == true) {
				System.out.println("The TV is On.");
			} else {
				System.out.println("The TV is Off");
			}
			if (getPlaying() == true) {
				System.out.println("The TV is playing.");
			} else {
				System.out.println("The TV is Off.");
			}
			System.out.print("TV volume: " + getVolume() + " |");

			for (int i = 0; i < getVolume(); i += 10) {
				System.out.print(" °");
			}
		} else {
			System.out.println("The TV must be on to show the menu bar");
		}
	}

	@Override
	public void closeMenu() {
		System.out.println("Closing the menu...");
	}

	@Override
	public void moreVolume() {
		if (getOn() == true) {
			setVolume(getVolume() + 5);
			System.out.println("Volume: " + getVolume());
		} else {
			System.out.println("The TV must be on to set more volume");
		}
	}

	@Override
	public void lessVolume() {
		if (getOn() == true) {
			setVolume(getVolume() - 1);
			System.out.println("Volume: " + getVolume());
		} else {
			System.out.println("The TV must be on to set less volume");
		}
	}

	@Override
	public void mute() {
		if (getVolume() != 0) {
			setVolume(0);
		} else {
			System.out.println("The volume it's already muted");
		}
	}

	@Override
	public void unMute() {
		if (getVolume() == 0) {
			setVolume(50);
		} else {
			System.out.println("The volume it's already unmuted");
		}
	}

}
