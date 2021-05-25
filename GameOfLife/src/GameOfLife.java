
public class GameOfLife {
	
	int rows;
	int columns;
	boolean [][] game = null;
	
	public GameOfLife(int rows, int columns) {
		this.rows = rows;
		this.columns = columns;
		game = new boolean[rows][columns];
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
		else {
			isAlive = game[row][column];
		}
		
		return isAlive;
		
	}
	
	public static void setAlive(int row, int column, boolean life) {

	}
	
	public int getNeighbourCount(int row, int column) {
		int neighbours = 0;
		if (isAlive(row-1, column-1)) {
			 neighbours += 1;
		}
	}
	
	public static void calculateNextGeneration() {
		
	}
	
}
