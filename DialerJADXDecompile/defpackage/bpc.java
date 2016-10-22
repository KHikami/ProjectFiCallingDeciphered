package defpackage;

/* renamed from: bpc */
public final class bpc {
    public static final String a;
    public static final String b;

    static {
        a = String.valueOf(bqp.b / 1000).replaceAll("(\\d+)(\\d)(\\d\\d)", "$1.$2.$3");
        b = "ma" + a;
    }
}
