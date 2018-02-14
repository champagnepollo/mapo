class MedievalFightClub{
	public static void main(String[] args) {
		Character character = new King();
		Sword baa = new Sword();

		character.fight();
		character.setWeapon(baa);
		character.fight();
	}
}