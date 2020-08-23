///**
// *
// */
//package tyagiabhinav.corsera.algo1.assignment3;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//
///**
// * @author abhinavtyagi
// *
// */
//public class BruteCollinearPoints {
//
//	private Point[] points;
//	private ArrayList<LineSegment> collinear = new ArrayList<>();;
//	private int numberOfSegments = 0;
//
//	public BruteCollinearPoints(Point[] points) {
//		this.points = points;
//		init();
//	}
//
//	private void init() {
//		int size = points.length;
//		Arrays.sort(points);
//		for (int i = 0; i < size; i++) {
//			Point a = points[i];
//			for (int j = i + 1; j < size; j++) {
//				Point b = points[j];
//				for (int k = j + 1; k < size; k++) {
//					Point c = points[k];
//					if (a.slopeTo(b) == a.slopeTo(c)) {
//						for (int l = k + 1; l < size; l++) {
//							Point d = points[l];
//							if (a.slopeTo(c) == a.slopeTo(d)) {
//								collinear.add(new LineSegment(a, d));
//								numberOfSegments++;
//							}
//						}
//					}
//				}
//			}
//		}
//	}
//
//	public int numberOfSegments() {
//		return this.numberOfSegments;
//	}
//
//	public LineSegment[] segments() {
//		LineSegment[] segments = new LineSegment[this.collinear.size()];
//		int i = 0;
//		for (LineSegment lineSegment : collinear) {
//			segments[i++] = lineSegment;
//		}
//		return segments;
//	}
//
//}
