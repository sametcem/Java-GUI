package java_gui.BGX_019;

// BGX-Singlet/Config.java

public class Config {
    // eager evaluation
    private final static Config config = new Config();

    private Config() {  // no one can create another object
        // ...
    }

    public static Config getInstance() {
        return config;
    }
}

