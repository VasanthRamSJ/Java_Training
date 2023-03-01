package Singleton;

class Singleton {
	static Singleton getInstance;

	private Singleton() {
		System.out.println("Constructor called..");
	}

	static Singleton createInstance() {

		if (getInstance == null) {
			getInstance = new Singleton();
			return getInstance;

		} else {

			return getInstance;
		}

	}

	void print() {
        System.out.println("method called...");
	}
}