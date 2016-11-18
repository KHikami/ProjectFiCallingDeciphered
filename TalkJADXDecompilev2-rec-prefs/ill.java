package p000;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

public final class ill {
    private final Context f17992a;
    private final ilm f17993b = new ilm(this);
    private Intent f17994c;

    public ill(Context context) {
        this.f17992a = context;
        IntentFilter intentFilter = new IntentFilter("android.intent.action.BATTERY_CHANGED");
        this.f17994c = context.registerReceiver(this.f17993b, intentFilter);
    }

    void m22244a() {
        if (this.f17994c != null) {
            this.f17992a.unregisterReceiver(this.f17993b);
            this.f17994c = null;
        }
    }

    public void m22245a(inv inv) {
        ikp ikp = ikp.f17924a;
        inv.m22394b(ikp.m22194b());
        inv.m22395c(ikp.m22196d() / 1000);
        inv.m22396d(ikp.m22197e());
        inv.m22393a(this.f17993b.m22246a());
        inv.m22397e(this.f17993b.m22247b());
    }
}
