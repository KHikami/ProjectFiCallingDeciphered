package p000;

public final class mqn extends Exception {
    private final String f28118a;
    private final int f28119b;
    private final int f28120c;

    public static mqn m32711a(String str, String str2, int i, int i2) {
        return new mqn(str, str2, i, i2);
    }

    public static mqn m32710a(String str, String str2, int i) {
        return new mqn(str, str2, i, i + 1);
    }

    public static mqn m32712b(String str, String str2, int i) {
        return new mqn(str, str2, i, -1);
    }

    public synchronized Throwable fillInStackTrace() {
        return this;
    }

    private mqn(String str, String str2, int i, int i2) {
        int length;
        if (i2 < 0) {
            length = str2.length();
        } else {
            length = i2;
        }
        StringBuilder append = new StringBuilder(str).append(": ");
        if (i > 8) {
            append.append("...").append(str2, i - 5, i);
        } else {
            append.append(str2, 0, i);
        }
        append.append('[').append(str2.substring(i, length)).append(']');
        if (str2.length() - length > 8) {
            append.append(str2, length, length + 5).append("...");
        } else {
            append.append(str2, length, str2.length());
        }
        super(append.toString());
        this.f28118a = str2;
        this.f28119b = i;
        this.f28120c = i2;
    }
}