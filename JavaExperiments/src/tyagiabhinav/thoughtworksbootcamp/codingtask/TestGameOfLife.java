package tyagiabhinav.thoughtworksbootcamp.codingtask;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import tyagiabhinav.thoughtworksbootcamp.codingtask.Neighbours.NeighbourBuilder;

public class TestGameOfLife {

	GameOfLife g;
	Cell c;
	Neighbours n;

	@Before
	public void setUp() throws Exception {
		g = new GameOfLife();
		c = new Cell();
		Neighbours.NeighbourBuilder builder = new NeighbourBuilder();
		n = builder.northWestNeighbour(new Cell('X')).northNeighbour(new Cell('X'))
				.northEastNeighbour(new Cell('X')).southNeighbour(new Cell('X')).createNeighbours();
//		c.setNeighbours(n);
	}

//	@Test
//	public void testNeighbourCreation() {
//		assertTrue(c.printNeighbours().equalsIgnoreCase("X,X,X,-,-,-,X,-"));
//	}

	@Test
	public void testCellAlive() {
		c.setCell('X');
		assertTrue(c.isAlive());
	}

	@Test
	public void testCountAliveNeighbours() {
		assertTrue(c.getAliveNeighbours() == 4);
	}

	@Test
	public void testCalculateCellAlive() {
		c.setCell('X');
		// C is alive with 4 neighbours this should return false
		assertFalse(g.calculateCellAlive(c));
	}
}
