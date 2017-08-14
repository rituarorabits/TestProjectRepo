package gameBoard;

public class Snake {

	int startPosition;
	int endPosition;
	int colorElement;
	
	Snake(int start, int end, int color) 
	{
		startPosition= start;
		endPosition= end;
		colorElement= color;
	}
	
	static void newStaticMethod()
	{
		System.out.println("In static method");
	}

}