
public class GameOfLife {
	
	int rows;
	int columns;
	
	public GameOfLife(int rows, int columns) {
		this.rows = rows;
		this.columns = columns;
	}
	
	public int getRows() {
		return rows;
	}
	
	public int getColumns() {
		return columns;
	}
	
	public boolean isAlive(int row, int column) {
		boolean isAlive = false;
		if (row > rows || row <= 0 || column > columns || column <= 0) {
			isAlive = false;
		}
		
		return isAlive;
		
	}
	
	public static void setAlive(int row, int columns, boolean life) {
		
	}
	
	public static int getNeighbourCount(int a, int b) {
		
	}
	
	public static void calculateNextGeneration() {
		
	}
	
}
