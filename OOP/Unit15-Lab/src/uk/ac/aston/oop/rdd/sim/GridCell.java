package uk.ac.aston.oop.rdd.sim;

import java.util.ArrayList;
import java.util.Random;

public class GridCell {
	private final ArrayList<Actor> contents;
	private final int row, column;
	private final Grid grid;
	
	public GridCell(Grid grid, int row, int column) {
		contents = new ArrayList<Actor>();
		this.row = row;
		this.column = column;
		this.grid = grid;
	}
	
	public ArrayList<Actor> getContents(){return contents;}
	public int getRow() {return row;}
	public int getColumn() {return column;}
	public Grid getGrid() {return grid;}
	
	public ArrayList<GridCell> getAdjacent(){
		ArrayList<GridCell> results = new ArrayList<GridCell>();
		for (int i = row - 1; i <= row + 1; i++) {
			for(int j = column - 1; j <= column + 1; j++) {
				if(i >= 0 && i < grid.getHeight() && j >= 0 && j < grid.getWidth() && !(i == row && j == column)) {
					results.add(grid.get(i,j));
				}
			}
		}
		return results;
	}
	
	public ArrayList<GridCell> getFreeAdjacent(){
		ArrayList<GridCell> results = new ArrayList<GridCell>();
		ArrayList<GridCell> adjResults = getAdjacent();
		for(GridCell cell : adjResults) {
			if(cell.getContents().isEmpty()) {
				results.add(cell);
			}
		}
		return results;
	}
	
	public GridCell getRandomFreeAdjacent(Random rnd) {
		ArrayList<GridCell> freeAdjacent = getFreeAdjacent();
		if(freeAdjacent.isEmpty()) {
			return null;
		} else {
			int random = rnd.nextInt(freeAdjacent.size());
			return freeAdjacent.get(random);
		}
	}
}
 