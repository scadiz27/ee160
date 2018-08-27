public class Bug {
	
	private EZImage bugPicture;
	private int x, y;

	public Bug(String filename, int posx, int posy){
		bugPicture = EZ.addImage(filename, posx, posy);
		x=posx;
		y=posy;
	}
	public int getX() {return x;} // Declare a member function called getX that returns an integer for the value in member variable x
	public int getY() {return y;}
	
	public void setPosition(int posx, int posy){
		x = posx; y=posy;
		setBugImagePosition(x,y);
	}
	
	private void setBugImagePosition(int posx, int posy) {
		bugPicture.translateTo(posx, posy);
	}
	
	public void moveLeft(int step){
		x=x-step;
		setBugImagePosition(x,y);
	}
	public void moveRight(int step){
		x=x+step;
		setBugImagePosition(x,y);
	}
	public void moveUp(int pace){
		y=y-pace;
		setBugImagePosition(x,y);
	}
	public void moveDown(int step) {
		y=y+step;
		setBugImagePosition(x,y);
	}
}
