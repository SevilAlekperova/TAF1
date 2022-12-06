package configuration;

import java.io.IOException;
import java.util.Properties;

public class ReadProperties {
    private static final Properties properties;

    static {
        properties = new Properties();
        try {
            properties.load(ReadProperties.class.getClassLoader().getResourceAsStream("config.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getUrl() {
        return properties.getProperty("url");
    }

    public static String browserName() {
        return properties.getProperty("browser");
    }

    public static String usernameStandard() {
        return properties.getProperty("usernameStandard");
    }

    public static String usernameBlocked() {
        return properties.getProperty("usernameBlocked");
    }

    public static String usernameProblem() {
        return properties.getProperty("usernameProblem");
    }

    public static String usernamePerformanceGlitch() {
        return properties.getProperty("usernamePerformanceGlitch");
    }

    public static String twiter() {
        return properties.getProperty("twiter");
    }

    public static String link() {
        return properties.getProperty("link");
    }

    public static String facebook() {
        return properties.getProperty("facebook");
    }

    public static String password() {
        return properties.getProperty("password");
    }

    public static boolean isHeadless() {
        return properties.getProperty("headless").equalsIgnoreCase("true");
    }

    public static String firstName() {
        return properties.getProperty("firstName");
    }

    public static String lastName() {
        return properties.getProperty("lastName");
    }

    public static String postalCode() {
        return properties.getProperty("postalCode");
    }

    public static String succsfullCheckout() {
        return properties.getProperty("succsfullCheckout");
    }

}
