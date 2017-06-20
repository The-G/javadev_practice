package oop.exam3;

public class HumanTest {
	public static void main(String[] args) {
		Human h = new Human();
		
		h.setName("JiHyuk Kim");
		h.setGender(1);
		h.setBirth(1990);
		h.setJob("To be Gooood developer");
		h.setMarried(true);
		h.setWeight(000);
		h.setHeight(000);
		h.setHobby("코딩");
		
//		System.out.println(h);
		System.out.println(h.toString());
		
		AnimalLover al = new AnimalLover();
		
		al.setName("JiHyuk Kim");
		al.setGender(1);
		al.setBirth(1990);
		al.setJob("To be Gooood developer");
		al.setMarried(true);
		al.setWeight(000);
		al.setHeight(000);
		al.setHobby("코딩");
		al.setAnimalType("코기코기");
		al.setAnimal_birth(2016);
		
		System.out.println(al.toString());
	}
}
