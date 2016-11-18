package p000;

import android.app.Activity;
import android.content.Context;
import android.content.IntentFilter;

public final class ftc extends bcq {
    private static final boolean f13954c = false;
    private final Context f13955a;
    private final fth f13956b = new fth();

    static {
        kae kae = glk.f15568o;
    }

    public ftc(Context context) {
        this.f13955a = context;
    }

    protected void mo465a(Activity activity) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        this.f13955a.registerReceiver(this.f13956b, intentFilter);
    }

    protected void mo467b(Activity activity) {
        this.f13955a.unregisterReceiver(this.f13956b);
    }
}
