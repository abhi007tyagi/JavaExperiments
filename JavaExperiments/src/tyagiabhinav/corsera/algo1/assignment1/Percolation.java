///**
// *
// */
//package tyagiabhinav.corsera.algo1.assignment1;
//
//import edu.princeton.cs.algs4.StdIn;
//import edu.princeton.cs.algs4.StdOut;
//import edu.princeton.cs.algs4.UF;
//import edu.princeton.cs.algs4.WeightedQuickUnionUF;
//
///**
// * @author abhinavtyagi
// *
// */
//public class Percolation {
//
//	private int size;
//	private int gridSize;
//	private WeightedQuickUnionUF grid;
//	private boolean[][] val;
//	private int numberOfOpenSites = 0;
//
//
//	public Percolation(int N) {
//		// create N-by-N grid, with all sites blocked
//		size = N;
//		gridSize = size*size +2;
//		grid = new WeightedQuickUnionUF(gridSize);
//		val = new boolean[size][size];
//
//	}
//
//	public int numberOfOpenSites(){
//		return numberOfOpenSites;
//	}
//
//	public void open(int i, int j) {
//		// open site (row i, column j) if it is not open already
//		validate(i, j);
//		if(!isOpen(i, j)){
//			val[i-1][j-1] = true;
//			doUnion(i, j);
//			check(i, j);
//			numberOfOpenSites++;
//		}
//	}
//
//	public boolean isOpen(int i, int j) {
//		// is site (row i, column j) open?
//		validate(i, j);
//		return val[i-1][j-1];
//	}
//
//	public boolean isFull(int i, int j) {
//		// is site (row i, column j) full?
//		validate(i, j);
//		return isOpen(i, j) && isConnected(i, j);
//	}
//
//	public boolean percolates() {
////		System.out.println("Percolates-->"+grid.connected(0, gridSize - 1));
//		return grid.connected(0, gridSize - 1);
//	}
//
//	private void validate(int i, int j){
//		if(i>(size+0) || j>(size+0) || i<1 || j<1){
////			System.out.println("Excepton !!!   i:"+i+"   j:"+j);
//			throw new IndexOutOfBoundsException("Index i or j should be in bounds !!");
//		}
//	}
//
//	private void doUnion(int i, int j){
//		int curr = getIndex(i, j);
//		int top = getIndex(i-1, j);
//		int bottom = getIndex(i+1, j);
//		int left = getIndex(i, j-1);
//		int right = getIndex(i, j+1);
//
//		if(i==1){
//			grid.union(curr, 0);
//		}
//		if(i!=1 && getVal(i-1, j)){
//			grid.union(curr,top);
//		}
//		if(i!=size && getVal(i+1, j)){
//			grid.union(curr, bottom);
//		}
//		if(j!=1 && getVal(i, j-1)){
//			grid.union(curr, left);
//		}
//		if(j!=size && getVal(i, j+1)){
//			grid.union(curr, right);
//		}
//	}
//
//	private void check(int i, int j) {
//		if (isFull(i, j)) {
//			for (int x = 1; x <= size; x++) {
//				if (getVal(size, x) && isFull(size, x)) {
//					grid.union(getIndex(size, x), gridSize - 1);
//				}
//			}
//		}
//	}
//
//
//	private boolean isConnected(int i, int j) {
//		return grid.connected(0, getIndex(i, j));
//	}
//
//	private boolean getVal(int i, int j){
//		validate(i, j);
//		return val[i-1][j-1];
//	}
//
//	private int getIndex(int i, int j){
//		return (size*(i-1)) + j;
//	}
//
//	/**
//	 * @param args
//	 */
//	public static void main(String[] args) {
//		int N = StdIn.readInt();
//		WeightedQuickUnionUF uf = new WeightedQuickUnionUF(N);
//		while (!StdIn.isEmpty()) {
//			int p = StdIn.readInt();
//			int q = StdIn.readInt();
//			p--;
//			q--;
//			if (uf.connected(p, q))
//				continue;
//			uf.union(p, q);
//			StdOut.println(p + " " + q);
//		}
//		StdOut.println(uf.count() + " components");
//	}
//
//}
