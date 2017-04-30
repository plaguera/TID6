import java.util.ArrayList;
import java.util.List;

public class Set {
	
	List<Point3D> points;
	
	public Set(Point3D representative) {
		this.points = new ArrayList<Point3D>();
		points.add(representative);
	}
	
	public Set(List<Point3D> points) {
		this.points = points;
	}
	
	public static double distance(Set A, Set B) {
		List<Point3D> aPoints = A.points;
		List<Point3D> bPoints = B.points;
		double min = Double.MAX_VALUE;
		Point3D p1m = null, p2m = null;
		for(Point3D p1 : aPoints)
			for(Point3D p2 : bPoints)
				if(!p1.equals(p2))
					if(distance(p1, p2) < min) {
						min = distance(p1, p2);
						p1m = p1;
						p2m = p2;
					}
		return min;
	}
	
	public static double distance1(Set A, Set B) {
		List<Point3D> aPoints = A.points;
		List<Point3D> bPoints = B.points;
		double sum = 0;
		for(Point3D p1 : aPoints)
			for(Point3D p2 : bPoints)
				if(!p1.equals(p2))
					sum += distance(p1, p2);
		//System.out.println(sum);
		return (double)(sum / (A.size() + B.size()));
	}
	
	public static double distance(Point3D p1, Point3D p2) {
		return Math.sqrt((Math.pow((p2.getX() - p1.getX()), 2) + Math.pow((p2.getY() - p1.getY()), 2) + Math.pow((p2.getZ() - p1.getZ()), 2)));
	}
	
	public static Set merge(Set A, Set B) {
		List<Point3D> aPoints = A.points;
		List<Point3D> bPoints = B.points;
		List<Point3D> finalPoints = new ArrayList<Point3D>();
		finalPoints.addAll(aPoints);
		finalPoints.addAll(bPoints);
		return new Set(finalPoints);
	}
	
	public int size() {
		return points.size();
	}
	
	public String toString() { 
		return points.toString();
	}

}
