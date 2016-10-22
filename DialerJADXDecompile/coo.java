public final class coo {
    public static final brb a;
    public static final bqy b;
    public static final coj c;
    public static final cor d;
    private static final bqz e;

    static {
        a = new brb();
        e = new cop();
        b = new bqy("LocationServices.API", e, a);
        c = new coj();
        cok cok = new cok();
        d = new cor();
    }

    public static cpp a(brc brc) {
        boolean z = true;
        buf.b(brc != null, (Object) "GoogleApiClient parameter is required.");
        cpp cpp = (cpp) brc.a(a);
        if (cpp == null) {
            z = false;
        }
        buf.a(z, (Object) "GoogleApiClient is not configured to use the LocationServices.API Api. Pass thisinto GoogleApiClient.Builder#addApi() to use this feature.");
        return cpp;
    }
}
