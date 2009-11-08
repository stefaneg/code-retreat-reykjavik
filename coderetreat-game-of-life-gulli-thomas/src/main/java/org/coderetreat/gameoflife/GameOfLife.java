/* This page is part of the Game of Life source code */

/**
 * Copyright 1996-2004 Edwin Martin <edwin@bitstorm.nl>
 * @author Edwin Martin
 */

package org.coderetreat.gameoflife;

import java.util.Iterator;

/**
 * This is the class that gets loaded up by the applet, and should contain
 * the algorithm, etc.
 * 
 * The algorithm to be implemented can be found here:
 * 	http://en.wikipedia.org/wiki/Conway's_Game_of_Life#Rules
 * 
 * Contains the cellgrid, the current shape and the Game Of Life algorithm that
 * changes it.
 * 
 * @author Edwin Martin
 */
public class GameOfLife implements CellGrid {

	public GameOfLife(int cellCols, int cellRows) {
	}

	/**
	 * Clears grid.
	 */
	public void clear() {
	}


	/**
	 * Create next generation of shape.
	 */
	public void nextGeneration() {
		throw new UnsupportedOperationException("Not implemented yet");
	}

	/**
	 * Get all the cells of a grid
	 * 
	 * @see org.coderetreat.gameoflife.CellGrid#getCellIterator()
	 */
	public Iterator<Cell> getCellIterator() {
		throw new UnsupportedOperationException("Not implemented yet");
	}


	/**
	 * Get value of cell.
	 * 
	 * @param col
	 *            x-coordinate of cell
	 * @param row
	 *            y-coordinate of cell
	 * @return value of cell
	 */
	public boolean getCell(int col, int row) {
		throw new UnsupportedOperationException("Not implemented yet");
	}


	/**
	 * Set value of cell.
	 * 
	 * @param col
	 *            x-coordinate of cell
	 * @param row
	 *            y-coordinate of cell
	 * @param c
	 *            value of cell
	 */
	public void setCell(int col, int row, boolean c) {
		throw new UnsupportedOperationException("Not implemented yet");
	}


	/**
	 * Get number of generations.
	 * 
	 * @return number of generations
	 */
	public int getGenerations() {
		throw new UnsupportedOperationException("Not implemented yet");
	}


	/**
	 * Resize grid. Reuse existing cells.
	 */
	public void resize(int cellColsNew, int cellRowsNew) {
		throw new UnsupportedOperationException("Not implemented yet");
	}


	public int getColumns() {
		throw new UnsupportedOperationException("Not implemented yet");
	}

	public int getRows() {
		throw new UnsupportedOperationException("Not implemented yet");
	}
}