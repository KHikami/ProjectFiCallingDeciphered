package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.IntentFilter;

/* renamed from: ftc */
public final class ftc extends bcq {
    private static final boolean c;
    private final Context a;
    private final fth b;

    static {
        kae kae = glk.o;
        c = false;
    }

    public ftc(Context context) {
        this.b = new fth();
        this.a = context;
    }

    protected void a(Activity activity) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        this.a.registerReceiver(this.b, intentFilter);
    }

    protected void b(Activity activity) {
        this.a.unregisterReceiver(this.b);
    }
}
