///**
// *
// */
//package tyagiabhinav.corsera.algo1.assignment1;
//
//import java.util.Scanner;
//
//import edu.princeton.cs.algs4.Out;
//import edu.princeton.cs.algs4.StdRandom;
//import edu.princeton.cs.algs4.StdStats;
//
///**
// * @author abhinavtyagi
// *
// */
//
//public class PercolationStats {
//
//	private double[] thresholds;
//	private Percolation percolation;
//	private static double highConf;
//	private static double lowConf;
//
//	public PercolationStats(int N, int T) {
//		if (N <= 0 || T <= 0){
//			throw new IllegalArgumentException();
//		}
//		thresholds = new double[T];
//
//		for (int i = 0; i < T; i++) {
//			percolation = new Percolation(N);
//			int count = 0;
//			while (!percolation.percolates()) {
//				int x = StdRandom.uniform(N) + 1;
//				int y = StdRandom.uniform(N) + 1;
//				if (!percolation.isOpen(x, y)) {
//					percolation.open(x, y);
//					count++;
//				}
//			}
//			thresholds[i] = Integer.valueOf(count).doubleValue() / (N * N);
//		}
//	}
//
//	public double stddev() {
//		return StdStats.stddev(thresholds);
//	}
//
//	public double mean() {
//		return StdStats.mean(thresholds);
//	}
//
//	public double confidenceHi(){
//		return highConf;
//	}
//	public double confidenceLo(){
//		return lowConf;
//	}
//
//	public static void main(String[] args) {
//		Out out = new Out();
//		Scanner sc = new Scanner(System.in);
//		int N = sc.nextInt();
//		int T = sc.nextInt();
//		sc.close();
//
//		PercolationStats pStat = new PercolationStats(N, T);
//
//		double mean = pStat.mean();
//		double stddev = pStat.stddev();
//		lowConf = mean - (1.96 * stddev / Math.sqrt(T));
//		highConf = mean + (1.96 * stddev / Math.sqrt(T));
//
//		out.printf("mean \t = %f\n", mean);
//		out.printf("stddev \t = %f\n", stddev);
//		out.printf("95%% confidence interval = %f, %f\n", lowConf, highConf);
//		out.close();
//	}
//}