
public class GameOfLife {
	
	int rows;
	int columns;
	boolean [][] curGen = null;
	boolean [][] newGen = null;
	
	public GameOfLife(int rows, int columns){
		if (rows < 1 || columns < 1) {
			throw new IllegalArgumentException("The rows and/or columns are out of bounds!");
		}
		this.rows = rows;
		this.columns = columns;
		curGen = new boolean[rows][columns];
		newGen = new boolean [rows][columns];
	}
	
	public int getRows() {
		return rows;
	}
	
	public int getColumns() {
		return columns;
	}
	
	public boolean isAlive(int row, int column) {
		boolean isAlive = false;
		if (row >= rows || row < 0 || column >= columns || column < 0) {
			isAlive = false;
		}
		else {
			isAlive = curGen[row][column];
		}
		
		return isAlive;
		
	}
	
	public void setAlive(int row, int column, boolean life) {
		if(row < rows && row >= 0 && column < columns && column >= 0) {
			curGen[row][column] = life;
		}
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
		boolean [][]temp = null;
		for (int row = 0; row < curGen.length; row++) {
			for (int col = 0; col < curGen[row].length; col++) {
				if (isAlive(row, col) == true) {
					if (getNeighbourCount(row, col) <= 1 || getNeighbourCount(row, col) >= 4) {
						newGen[row][col] = false;
					}
					else {
						newGen[row][col] = true;
					}
				}
				else {
					if (getNeighbourCount(row, col) == 3) {
						newGen[row][col] = true;
					}
					else {
						newGen[row][col] = false;
					}
				}
			}
		}
		temp = curGen;
		curGen = newGen;
		newGen = temp;
	}
	
	public String toString() {
		String textPrint = "";
		for (int row = 0; row < curGen.length; row++) {
			for (int col = 0; col <curGen[row].length; col++) {
				if (isAlive(row, col) == true) {
					textPrint += "*";
				}
				if (isAlive(row, col) == false) {
					textPrint += " ";
				}
			}
			textPrint += "\r\n";
		}
		return textPrint;
	}
}
