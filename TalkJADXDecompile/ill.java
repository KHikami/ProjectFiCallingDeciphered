import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

public final class ill {
    private final Context a;
    private final ilm b;
    private Intent c;

    public ill(Context context) {
        this.a = context;
        IntentFilter intentFilter = new IntentFilter("android.intent.action.BATTERY_CHANGED");
        this.b = new ilm(this);
        this.c = context.registerReceiver(this.b, intentFilter);
    }

    void a() {
        if (this.c != null) {
            this.a.unregisterReceiver(this.b);
            this.c = null;
        }
    }

    public void a(inv inv) {
        ikp ikp = ikp.a;
        inv.b(ikp.b());
        inv.c(ikp.d() / 1000);
        inv.d(ikp.e());
        inv.a(this.b.a());
        inv.e(this.b.b());
    }
}
