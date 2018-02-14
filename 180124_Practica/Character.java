public abstract class Character{
	
	WeaponBehavior weapon = new Fist();

	public abstract void fight();

	public void setWeapon(WeaponBehavior weapon){
		this.weapon = weapon;
	}
}