/**
 * 
 */
package tyagiabhinav.thoughtworksbootcamp.codingtask;

import java.util.ArrayList;
import java.util.List;

/**
 * @author abhinavtyagi
 *
 */
public class Neighbours {

	private Cell north;
	private Cell south;
	private Cell east;
	private Cell west;
	private Cell northEast;
	private Cell northWest;
	private Cell southEast;
	private Cell southWest;

	public Neighbours(Cell north, Cell south, Cell east, Cell west, Cell northEast, Cell northWest, Cell southEast,
			Cell southWest) {
		super();
		this.north = north;
		this.south = south;
		this.east = east;
		this.west = west;
		this.northEast = northEast;
		this.northWest = northWest;
		this.southEast = southEast;
		this.southWest = southWest;
	}
	
	public Cell getNorth() {
		return north;
	}



	public void setNorth(Cell north) {
		this.north = north;
	}



	public Cell getSouth() {
		return south;
	}



	public void setSouth(Cell south) {
		this.south = south;
	}



	public Cell getEast() {
		return east;
	}



	public void setEast(Cell east) {
		this.east = east;
	}



	public Cell getWest() {
		return west;
	}



	public void setWest(Cell west) {
		this.west = west;
	}



	public Cell getNorthEast() {
		return northEast;
	}



	public void setNorthEast(Cell northEast) {
		this.northEast = northEast;
	}



	public Cell getNorthWest() {
		return northWest;
	}



	public void setNorthWest(Cell northWest) {
		this.northWest = northWest;
	}



	public Cell getSouthEast() {
		return southEast;
	}



	public void setSouthEast(Cell southEast) {
		this.southEast = southEast;
	}



	public Cell getSouthWest() {
		return southWest;
	}



	public void setSouthWest(Cell southWest) {
		this.southWest = southWest;
	}

	public List<Cell> getNeighboursList(){
		List<Cell> nList = new ArrayList<>(8);
		nList.add(this.northWest);
		nList.add(this.north);
		nList.add(this.northEast);
		nList.add(this.west);
		nList.add(this.east);
		nList.add(this.southWest);
		nList.add(this.south);
		nList.add(this.southEast);
		
		return nList;
	}

	public static class NeighbourBuilder {
		private Cell northB;
		private Cell southB;
		private Cell eastB;
		private Cell westB;
		private Cell northEastB;
		private Cell northWestB;
		private Cell southEastB;
		private Cell southWestB;
		
		public NeighbourBuilder() {
			this.northB = new Cell();
			this.southB = new Cell();
			this.eastB = new Cell();
			this.westB = new Cell();
			this.northEastB = new Cell();
			this.northWestB = new Cell();
			this.southEastB = new Cell();
			this.southWestB = new Cell();
		}
		
		public NeighbourBuilder northNeighbour(Cell nCell){
			this.northB = nCell;
			return this;
		}
		
		public NeighbourBuilder southNeighbour(Cell sCell){
			this.southB = sCell;
			return this;
		}
		public NeighbourBuilder eastNeighbour(Cell eCell){
			this.eastB = eCell;
			return this;
		}
		public NeighbourBuilder westNeighbour(Cell wCell){
			this.westB = wCell;
			return this;
		}
		public NeighbourBuilder northEastNeighbour(Cell neCell){
			this.northEastB = neCell;
			return this;
		}
		public NeighbourBuilder northWestNeighbour(Cell nwCell){
			this.northWestB = nwCell;
			return this;
		}
		public NeighbourBuilder southEastNeighbour(Cell seCell){
			this.southEastB = seCell;
			return this;
		}
		public NeighbourBuilder southWestNeighbour(Cell swCell){
			this.southWestB = swCell;
			return this;
		}
		public Neighbours createNeighbours(){
			return new Neighbours(northB,southB,eastB,westB,northEastB,northWestB,southEastB,southWestB);
		}
	}
}
