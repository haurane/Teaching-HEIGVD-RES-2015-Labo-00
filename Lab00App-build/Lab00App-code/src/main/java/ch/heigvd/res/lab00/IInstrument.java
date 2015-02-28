package ch.heigvd.res.lab00;

public interface IInstrument {

	public String play();
	public int getSoundVolume();
	public String getColor();
}

class Trumpet implements IInstrument{

	@Override
	public String play() {
		// TODO Auto-generated method stub
		return "pouet";
	}

	@Override
	public int getSoundVolume() {
		// TODO Auto-generated method stub
		return 10;
	}

	@Override
	public String getColor() {
		// TODO Auto-generated method stub
		return "golden";
	}
	
}

class Flute implements IInstrument {

	@Override
	public String play() {
		// TODO Auto-generated method stub
		return "turlututu";
	}

	@Override
	public int getSoundVolume() {
		// TODO Auto-generated method stub
		return 1;
	}

	@Override
	public String getColor() {
		// TODO Auto-generated method stub
		return "brown";
	}
	
}
