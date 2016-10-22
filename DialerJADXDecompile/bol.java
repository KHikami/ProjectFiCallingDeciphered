public enum bol {
    NONE,
    GZIP;

    public static bol a(String str) {
        return "GZIP".equalsIgnoreCase(str) ? GZIP : NONE;
    }
}
