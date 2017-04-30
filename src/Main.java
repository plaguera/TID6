import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Set> sets = new ArrayList<Set>();
		sets.add(new Set(new Point3D(1, 2.1, 2.5, 3.5)));
		sets.add(new Set(new Point3D(2, 3.2, 5.2, 3.5)));
		sets.add(new Set(new Point3D(3, 4.5, 4.6, 3.6)));
		sets.add(new Set(new Point3D(4, 3.6, 2.9, 2.9)));
		sets.add(new Set(new Point3D(5, 3.7, 2.9, 2.7)));
		sets.add(new Set(new Point3D(6, 3.4, 3.5, 3.4)));
		sets.add(new Set(new Point3D(7, 4.2, 4.2, 3.7)));
		sets.add(new Set(new Point3D(8 ,2.8, 6.1, 4.9)));
		sets.add(new Set(new Point3D(9, 3.6, 2.7, 4.2)));
		sets.add(new Set(new Point3D(10, 2.8, 1.9, 3.8)));
		int count = 0;
		List<Set> solution;
		do {
			Set s1Min = null, s2Min = null;
			double min = Double.MAX_VALUE;
			solution = new ArrayList<Set>();
			for(Set set1 : sets) {
				for(Set set2 : sets) {
					if(!set1.equals(set2)) {
						//System.out.println(Set.distance(set1, set2));
						if(Set.distance(set1, set2) < min) {
							s1Min = set1;
							s2Min = set2;
							min = Set.distance(set1, set2);
						}
					}
				}
			}
			solution.add(Set.merge(s1Min, s2Min));
			for(Set set : sets)
				if(!set.equals(s1Min) && !set.equals(s2Min))
					solution.add(set);
			sets = solution;
			System.out.println("ITERATION: " + ++count);
			System.out.println("S1: " + s1Min);
			System.out.println("S2: " + s2Min);
			System.out.println("Distance: " + min);
			System.out.println(solution);
		} while(solution.size() > 1);
		// 4 5
	}
	
	public static double distance(Point3D p1, Point3D p2) {
		return Math.sqrt((Math.pow((p2.getX() - p1.getX()), 2) + Math.pow((p2.getY() - p1.getY()), 2) + Math.pow((p2.getZ() - p1.getZ()), 2)));
	}

}
