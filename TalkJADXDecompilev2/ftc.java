package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.IntentFilter;

public final class ftc extends bcq {
    private static final boolean c = false;
    private final Context a;
    private final fth b = new fth();

    static {
        kae kae = glk.o;
    }

    public ftc(Context context) {
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
