package pack;

public class Door {
private Lock lock = new Lock() {
	public boolean isUnlocked(String key) {
		if(key.equals("qwerty")) {
			return true;
		}else {
			return false;
		}
	}
};

public Lock getLock() {
	return lock;
}

}
