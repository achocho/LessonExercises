package Farmer;

public class cactus {
	String name;
	double NeededAge;
	double Age;
	boolean dead;
	boolean selected;
	cactus(String name,double NeededAge,double Age,boolean dead,boolean selected)
	{
		this.name=name;
		this.NeededAge=NeededAge;
		this.Age=Age;
		this.dead=dead;
		this.selected=selected;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getNeededAge() {
		return NeededAge;
	}
	public void setNeededAge(double neededAge) {
		NeededAge = neededAge;
	}
	public double getAge() {
		return Age;
	}
	public void setAge(double age) {
		Age = age;
	}
	public boolean isDead() {
		return dead;
	}
	public void setDead(boolean dead) {
		this.dead = dead;
	}
	public boolean isSelected() {
		return selected;
	}
	public void setSelected(boolean selected) {
		this.selected = selected;
	}

}
