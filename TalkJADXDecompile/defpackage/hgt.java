package defpackage;

/* renamed from: hgt */
public abstract class hgt<T> {
    static a a;
    private static final Object d;
    private static int e;
    private static String f;
    public final String b;
    public final T c;
    private T g;

    static {
        d = new Object();
        a = null;
        e = 0;
        f = "com.google.android.providers.gsf.permission.READ_GSERVICES";
    }

    protected hgt(String str, T t) {
        this.g = null;
        this.b = str;
        this.c = t;
    }

    public static hgt<Integer> a(String str, Integer num) {
        return new hgv(str, num);
    }

    public static hgt<Long> a(String str, Long l) {
        return new hgu(str, l);
    }

    public static hgt<String> a(String str, String str2) {
        return new hgw(str, str2);
    }

    public final T a() {
        return this.g != null ? this.g : a(this.b);
    }

    protected abstract T a(String str);
}
