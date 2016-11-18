package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public final class bhw extends BroadcastReceiver {
    private boolean f3398a;
    private final CopyOnWriteArrayList<bhx> f3399b = new CopyOnWriteArrayList();

    public void m5281a(bhx bhx) {
        if (bhx != null) {
            this.f3399b.add(bhx);
        }
    }

    public void m5282b(bhx bhx) {
        if (bhx != null) {
            this.f3399b.remove(bhx);
        }
    }

    public void onReceive(Context context, Intent intent) {
        if ("android.intent.action.BATTERY_CHANGED".equals(intent.getAction())) {
            boolean a;
            boolean z = this.f3398a;
            int intExtra = intent.getIntExtra("plugged", -1);
            if (VERSION.SDK_INT < 17) {
                a = bhw.m5280a(intExtra);
            } else if (bhw.m5280a(intExtra) || intExtra == 4) {
                a = true;
            } else {
                a = false;
            }
            this.f3398a = a;
            Iterator it;
            if (this.f3398a && !z) {
                it = this.f3399b.iterator();
                while (it.hasNext()) {
                    ((bhx) it.next()).mo556a();
                }
            } else if (!this.f3398a && z) {
                it = this.f3399b.iterator();
                while (it.hasNext()) {
                    ((bhx) it.next()).mo557b();
                }
            }
        }
    }

    private static boolean m5280a(int i) {
        return i == 1 || i == 2;
    }
}
