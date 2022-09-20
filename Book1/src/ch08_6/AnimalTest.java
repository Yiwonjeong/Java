package ch08_6;

import java.util.ArrayList;

// 상위클래스 Animal
	class Animal{
		public void move() {
			System.out.println("동물이 움직인다.");
		}
	}
	
	// Animal을 상속받은 Human 클래스 (하위 클래스)
	class Human extends Animal {
		public void move() {
			System.out.println("사람이 두 발로 걷는다.");
		}
		public void readBook() {
			System.out.println("사람이 책을 읽는다.");
		}
	}
	
	// Animal을 상속받은 Tiger 클래스 (하위 클래스)
	class Tiger extends Animal {
		public void move() {
			System.out.println("호랑이가 네 발로 뛴다.");
		}
		public void hunt() {
			System.out.println("호랑이가 사냥을 한다.");
		}
	}
	
	// Animal을 상속받은 Eagle 클래스 (하위 클래스)
	class Eagle extends Animal{
		public void move() {
			System.out.println("독수리가 하늘을 난다.");
		}
		public void flying() {
			System.out.println("독수리가 날개를 쭉 펴고 멀리 날아간다.");
		}
	}
	

public class AnimalTest {
	ArrayList<Animal> aniList = new ArrayList<Animal>();
	
	public static void main(String[] args) {
		
		AnimalTest aTest = new AnimalTest();
		aTest.addAnimal();
		System.out.println("원래의 자료형으로 다운 캐스팅");
		aTest.testCasting();
	}
	
	public void addAnimal() {
		aniList.add(new Human());
		aniList.add(new Tiger());
		aniList.add(new Eagle());
		
		for (Animal ani : aniList) {
			ani.move();
		}
	}
	
	public void testCasting() {
		for (int i=0; i<aniList.size(); i++) {	// 모든 배열 요소를 하나씩 돌면서
			Animal ani = aniList.get(i);	// Animal 형으로 가지고 온다
			if (ani instanceof Human) {	// Human이면
				Human h = (Human)ani;	// Human 형으로 다운 캐스팅
				h.readBook();
			}else if(ani instanceof Tiger) {
				Tiger t = (Tiger)ani;
				t.hunt();
			}else if(ani instanceof Eagle) {
				Eagle e = (Eagle)ani;
				e.flying();
			}else {
				System.out.println("지원되지 않는 형입니다.");
			}
		}
	}
	
}

	



