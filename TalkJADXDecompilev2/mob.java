package defpackage;

public class mob {
    public static final mob a = new mob((byte) 0);

    public final String toString() {
        return "LogSite{ class=" + a() + ", method=" + b() + ", line=0" + " }";
    }

    public String a() {
        return "<unknown class>";
    }

    public String b() {
        return "<unknown method>";
    }

    mob(byte b) {
        this();
    }
}
