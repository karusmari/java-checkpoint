package group3.Singleton;

public class Singleton {
    private static Singleton instance; //staatiline muutuja, mis hoiab ainsa eksemplari

    private Singleton() { //teised klassid ei saa seda kasutada
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public String showMessage() {
        return "Hello, I am a singleton!";
    }
}