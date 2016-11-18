package p000;

public enum fbs {
    PROD,
    AUTOPUSH,
    SANDBOX;

    public static fbs m14915a(String str) {
        return (fbs) Enum.valueOf(fbs.class, str);
    }
}
