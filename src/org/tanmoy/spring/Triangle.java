package org.tanmoy.spring;

public class Triangle {

	String name;
	int ht;
	public Point getP1() {
		return p1;
	}

	public void setP1(Point p1) {
		this.p1 = p1;
	}

	public Point getP2() {
		return p2;
	}

	public void setP2(Point p2) {
		this.p2 = p2;
	}

	public Point getP3() {
		return p3;
	}

	public void setP3(Point p3) {
		this.p3 = p3;
	}

	Point p1,p2,p3;
	/*public Triangle(String name)
	{
		this.name=name;
	}*/
	
	public Triangle(String name,int ht)
	{
		this.name=name;
		this.ht=ht+1;
		/*this.p1=p1;
		this.p2=p2;
		this.p3=p3;*/
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void draw(){
		System.out.println(name+" Triangle drawn of ht="+ht);
		System.out.println("On points=("+p1.getX()+","+p1.getY()+"),("+p2.getX()+","+p2.getY()+"),("
				+p3.getX()+","+p3.getY()+")");
		
	}
}
