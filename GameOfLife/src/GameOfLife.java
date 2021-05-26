
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
	
	public void setAlive(int row, int column, boolean life) {
		game[row][column] = life;
	}
	
	public int getNeighbourCount(int row, int column) {
		int neighbours = 0;
		if (isAlive(row-1, column-1)) {
			 neighbours += 1;
		}
		if (isAlive(row-1, column)) {
			 neighbours += 1;
		}
		if (isAlive(row-1, column+1)) {
			 neighbours += 1;
		}
		if (isAlive(row, column-1)) {
			 neighbours += 1;
		}
		if (isAlive(row, column+1)) {
			 neighbours += 1;
		}
		if (isAlive(row+1, column-1)) {
			 neighbours += 1;
		}
		if (isAlive(row+1, column)) {
			 neighbours += 1;
		}
		if (isAlive(row+1, column+1)) {
			 neighbours += 1;
		}
		return neighbours;
	}
	
	public void calculateNextGeneration() {
		for (int row = 0; row < game.length; row++) {
			for (int col = 0; col <game[row].length; col++) {
				if (isAlive(row, col) == true) {
					if (getNeighbourCount(row, col) <= 1 || getNeighbourCount(row, col) >= 4) {
						game[row][col] = false;
					}
					if (getNeighbourCount(row, col) == 2 || getNeighbourCount(row, col) == 3) {
						game[row][col] = true;
					}
				}
				if (isAlive(row, col) == false) {
					if (getNeighbourCount(row, col) == 3) {
						game[row][col] = true;
					}
					else {
						game[row][col] = false;
					}
				}
			}
	}
	
	}
}
