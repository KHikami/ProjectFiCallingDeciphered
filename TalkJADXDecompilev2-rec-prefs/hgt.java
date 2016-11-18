package p000;

public abstract class hgt<T> {
    static C0000a f16934a = null;
    private static final Object f16935d = new Object();
    private static int f16936e = 0;
    private static String f16937f = "com.google.android.providers.gsf.permission.READ_GSERVICES";
    public final String f16938b;
    public final T f16939c;
    private T f16940g = null;

    protected hgt(String str, T t) {
        this.f16938b = str;
        this.f16939c = t;
    }

    public static hgt<Integer> m19762a(String str, Integer num) {
        return new hgv(str, num);
    }

    public static hgt<Long> m19763a(String str, Long l) {
        return new hgu(str, l);
    }

    public static hgt<String> m19764a(String str, String str2) {
        return new hgw(str, str2);
    }

    public final T m19765a() {
        return this.f16940g != null ? this.f16940g : mo2538a(this.f16938b);
    }

    protected abstract T mo2538a(String str);
}
