///**
// *
// */
//package tyagiabhinav.corsera.algo1.assignment3;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.Collections;
//import java.util.LinkedList;
//
///**
// * @author abhinavtyagi
// *
// */
//public class FastCollinearPoints {
//
//	private Point[] points;
//	private ArrayList<LineSegment> collinear = new ArrayList<>();;
//	private int numberOfSegments = 0;
//
//	public FastCollinearPoints(Point[] points) {
//		this.points = points;
//		init();
//	}
//
//	private void init() {
//		int size = points.length;
//		for (int i = 0; i < size; i++) {
//			Point pivot = points[i];
//			Point[] tempCopy = new Point[size];
//			for (int k = 0; k < size; k++) {
//				tempCopy[k] = points[k];
//			}
//			Arrays.sort(tempCopy, pivot.slopeOrder());
//
//			int j = 0;
//			double oldSlope = 0.0;
//			LinkedList<Point> collinearList = new LinkedList<Point>();
//			for (Point p : tempCopy) {
//				double newSlope = p.slopeTo(pivot);
//				if (j == 0 || newSlope != oldSlope) {
//					if (collinearList.size() > 2 ) {
//						collinearList.add(pivot);
//						Collections.sort(collinearList);
//						if (pivot == collinearList.getFirst()) {
//							LineSegment segment = new LineSegment(pivot, collinearList.getLast());
//							collinear.add(segment);
//							numberOfSegments++;
//						}
//
//					}
//					collinearList.clear();
//				}
//				collinearList.add(p);
//
//				oldSlope = newSlope;
//				j++;
//			}
//
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
//}
