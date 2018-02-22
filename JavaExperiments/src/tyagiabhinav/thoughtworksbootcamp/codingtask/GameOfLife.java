/**
 * 
 */
package tyagiabhinav.thoughtworksbootcamp.codingtask;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author abhinavtyagi
 *
 */
public class GameOfLife {

	static List<ArrayList<Cell>> gameOfLife = new ArrayList<ArrayList<Cell>>();
	static int rowSize;
	static int colSize;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		rowSize = sc.nextInt();
		colSize = sc.nextInt();

		System.out.println(rowSize);
		System.out.println(colSize);

		for (int i = 0; i < rowSize; i++) {
			ArrayList<Cell> row = new ArrayList<>();
			for (int j = 0; j < colSize; j++) {
				char in = sc.next(".").charAt(0);
				row.add(new Cell(in));
			}
			gameOfLife.add(row);
		}

		sc.close();

		printPattern();

		// set neighbours
		setNeighbours();

		// evaluate life
		evaluateLife();

		printPattern();

	}

	private static void setNeighbours() {

		int i = 0;
		for (ArrayList<Cell> row : gameOfLife) {
			int j = 0;
			for (Cell c : row) {
				c.setNeighbours(generateCellNeighbours(c, i, j));
//				c.printNeighbours();
				row.set(j++, c);
			}
			gameOfLife.set(i++, row);
		}
	}

	private static void evaluateLife()  {
		int i = 0;
		for (ArrayList<Cell> row : gameOfLife) {
			int j = 0;
			for (Cell c : row) {
				Cell cNew = checkAndSetCell(c);
				cNew.setNeighbours(generateCellNeighbours(cNew, i, j));
				row.set(j++, cNew);
			}
			gameOfLife.set(i++, row);
		}
	}

	private static List<Cell> generateCellNeighbours(Cell c, int i, int j) {
		List<Cell> neighbours = new ArrayList<>(8);

		// North West
		if (i - 1 >= 0 && j - 1 >= 0)
			neighbours.add(gameOfLife.get(i - 1).get(j - 1));
		else
			neighbours.add(new Cell());

		// North
		if (i - 1 >= 0 && j >= 0)
			neighbours.add(gameOfLife.get(i - 1).get(j));
		else
			neighbours.add(new Cell());

		// North East
		if (i - 1 >= 0 && j + 1 < colSize)
			neighbours.add(gameOfLife.get(i - 1).get(j + 1));
		else
			neighbours.add(new Cell());

		// West
		if (i >= 0 && j - 1 >= 0)
			neighbours.add(gameOfLife.get(i).get(j - 1));
		else
			neighbours.add(new Cell());

		// East
		if (i >= 0 && j + 1 < colSize)
			neighbours.add(gameOfLife.get(i).get(j + 1));
		else
			neighbours.add(new Cell());

		// South West
		if (i + 1 < rowSize && j - 1 >= 0)
			neighbours.add(gameOfLife.get(i + 1).get(j - 1));
		else
			neighbours.add(new Cell());

		// South
		if (i + 1 < rowSize && j >= 0)
			neighbours.add(gameOfLife.get(i + 1).get(j));
		else
			neighbours.add(new Cell());

		// South West
		if (i + 1 < rowSize && j + 1 < colSize)
			neighbours.add(gameOfLife.get(i + 1).get(j + 1));
		else
			neighbours.add(new Cell());

		return neighbours;
	}

	static boolean calculateCellAlive(Cell c) {
		if (c.isAlive()) {
			if (c.getAliveNeighbours() >= 2 && c.getAliveNeighbours() < 4)
				return true;
			else
				return false;
		} else {
			if (c.getAliveNeighbours() == 3)
				return true;
			else
				return false;
		}
	}

	public static Cell checkAndSetCell(Cell c) {
		if (calculateCellAlive(c)) {
			if (!c.isAlive()) {
				// Birth of Cell
				c.setCell('X');
			}
		} else {
			if (c.isAlive()) {
				// Cell Death
				c.setCell('-');
			}
		}
		return c;
		// System.out.println(c.getCell());
	}

	private static void printPattern() {
		for (ArrayList<Cell> row : gameOfLife) {
			for (Cell c : row) {
				System.out.print(c.getCell());
			}
			System.out.println();
		}
	}

}
