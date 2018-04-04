public class Main {

	public static void main(String[] args) {
		Cat cat = new Cat();
		CatDogAdapter adapter = new CatDogAdapter();
		adapter.myCat = cat;
		
		Turkey turkey = new Turkey();
		TurkeyDogAdapter t = new TurkeyDogAdapter();
		t.myTurkey = turkey;
		t.bite();
		adapter.bark();
	}

}
