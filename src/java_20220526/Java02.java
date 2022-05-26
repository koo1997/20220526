package java_20220526;

import java.util.Objects;

public class Java02 {
	String name;
	String food;
	String flavor;
	@Override
	public int hashCode() {
		return Objects.hash(flavor, food, name, year);
	}
 

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Java02 other = (Java02) obj;
		return Objects.equals(flavor, other.flavor) && Objects.equals(food, other.food)
				&& Objects.equals(name, other.name) && year == other.year;
	}


	int year;
	
	
	@Override
	public String toString() {
		return "Java02 [name=" + name + ", food=" + food + ", flavor=" + flavor + ", year=" + year + "]";
	}


	public static void main(String[] args) {
	
		
		Java02 o1 = new Java02();
		o1.name="햄버거";
		o1.food="햄치즈 버거";
		o1.flavor="best";
		o1.year=20;
		
		
		Java02 o2 = new Java02();
		o2.name="버거";
		o2.food="치즈 버거";
		o2.flavor="best";
		o2.year=10;
		
		System.out.println(o1.toString());

		System.out.println(o1);
	
		System.out.println(o1.hashCode());
		System.out.println(o2.hashCode());
		System.out.println(o1.equals(o2));
	
	
	
	
	
	
	
	}

}
