/**
 * 
 */
package tyagiabhinav.thoughtworksbootcamp.codingtask;

import java.util.List;

/**
 * @author abhinavtyagi
 *
 */
public class Cell {

	private char cell;
	private boolean isAlive;
	// private Neighbours neighbours;
	private List<Cell> neighbours;
	private int aliveNeighbours;

	Cell() {
		this.cell = '|';
		this.isAlive = false;
	}

	Cell(char c) {
		this.cell = c;
		this.isAlive = (c == 'x' || c == 'X') ? true : false;
	}

	public char getCell() {
		return cell;
	}

	public void setCell(char cell) {
		this.cell = cell;
		setAlive();
	}

	public boolean isAlive() {
		return isAlive;
	}

	private void setAlive() {
		this.isAlive = (this.cell == 'x' || this.cell == 'X') ? true : false;
	}

	public List<Cell> getNeighbours() {
		return neighbours;
	}

	public void setNeighbours(List<Cell> neighbours) {
		this.neighbours = neighbours;
		setAliveNeighbours();
	}
	
	public int getAliveNeighbours() {
		return aliveNeighbours;
	}

	private void setAliveNeighbours() {
		this.aliveNeighbours = getAliveNeighboursCount();
	}

	private int getAliveNeighboursCount() {
		List<Cell> nList = this.getNeighbours();
		return (int) nList.stream().filter(v -> v.isAlive()).count();
	}

	public void printNeighbours() {
		if(neighbours!=null)
		this.neighbours.forEach(v->{
			System.out.print(v.getCell()+" ");
			});
		System.out.println();
	}

}
