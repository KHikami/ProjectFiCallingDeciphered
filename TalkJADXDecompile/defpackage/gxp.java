package defpackage;

/* renamed from: gxp */
public final class gxp {
    public static hgt<Integer> a;
    public static hgt<String> b;
    public static hgt<String> c;
    public static hgt<String> d;
    public static hgt<String> e;
    public static hgt<Long> f;

    static {
        a = hgt.a("gms:common:stats:connections:level", Integer.valueOf(gxq.b));
        b = hgt.a("gms:common:stats:connections:ignored_calling_processes", "");
        c = hgt.a("gms:common:stats:connections:ignored_calling_services", "");
        d = hgt.a("gms:common:stats:connections:ignored_target_processes", "");
        e = hgt.a("gms:common:stats:connections:ignored_target_services", "com.google.android.gms.auth.GetToken");
        f = hgt.a("gms:common:stats:connections:time_out_duration", Long.valueOf(600000));
    }
}
