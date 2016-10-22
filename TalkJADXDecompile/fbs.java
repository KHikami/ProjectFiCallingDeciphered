public enum fbs {
    PROD,
    AUTOPUSH,
    SANDBOX;

    public static fbs a(String str) {
        return (fbs) Enum.valueOf(fbs.class, str);
    }
}
