public final class bvt {
    public static cme a;
    public static cme b;
    public static cme c;
    public static cme d;
    public static cme e;
    public static cme f;

    static {
        a = cme.a("gms:common:stats:connections:level", Integer.valueOf(bvv.b));
        b = cme.a("gms:common:stats:connections:ignored_calling_processes", "");
        c = cme.a("gms:common:stats:connections:ignored_calling_services", "");
        d = cme.a("gms:common:stats:connections:ignored_target_processes", "");
        e = cme.a("gms:common:stats:connections:ignored_target_services", "com.google.android.gms.auth.GetToken");
        f = cme.a("gms:common:stats:connections:time_out_duration", Long.valueOf(600000));
    }
}
