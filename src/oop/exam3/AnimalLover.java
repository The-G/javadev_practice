package oop.exam3;

public class AnimalLover extends Human {
	private String animalType;
	private int animal_birth;
	
	public String getAnimalType() {
		return animalType;
	}
	public void setAnimalType(String animalType) {
		this.animalType = animalType;
	}
	public int getAnimal_birth() {
		return animal_birth;
	}
	public void setAnimal_birth(int animal_birth) {
		this.animal_birth = animal_birth;
	}
	@Override
	public String toString() {
		return super.toString() + "\n" + 
			   "키우는 애완동물은 " + animalType + "이며\n" + 
				"제 katty는 " + animal_birth + "에 태어 났습니다.";
	}
	
	
	
}
