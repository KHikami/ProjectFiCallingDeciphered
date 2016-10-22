import android.os.AsyncTask;

public final class han {
    public static final gue a;
    public static final guc<hae, Object> b;
    public static final gtz<Object> c;
    public static final hal d;

    static {
        a = new gue((byte) 0);
        b = new hao();
        c = new gtz("Help.API", b, a);
        d = new haa();
    }

    public static void a(gui gui, har har) {
        AsyncTask hap = new hap(gui, har);
        if (gwb.Z()) {
            hap.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        } else {
            hap.execute(new Void[0]);
        }
    }
}
