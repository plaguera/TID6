
public class Point3D {
	
	private double x, y, z;
	private int id;
	
	public Point3D(int id, double x, double y, double z) {
		setX(x);
		setY(y);
		setZ(z);
		setID(id);
	}
	
	public Point3D() {
		this(0, 0, 0, 0);
	}
	
	public String toString() {
		//return "(" + getX() + ", " + getY() + ", " + getZ() + ")";
		return String.valueOf(getID());
	}

	/** @return the x */
	public double getX() {
		return x;
	}

	/** @return the y */
	public double getY() {
		return y;
	}

	/** @return the z */
	public double getZ() {
		return z;
	}
	
	/** @return the id */
	public int getID() {
		return id;
	}

	/** @param x the x to set */
	public void setX(double x) {
		this.x = x;
	}

	/** @param y the y to set */
	public void setY(double y) {
		this.y = y;
	}

	/** @param z the z to set */
	public void setZ(double z) {
		this.z = z;
	}
	
	/** @param id the id to set */
	public void setID(int id) {
		this.id = id;
	}
	

}
