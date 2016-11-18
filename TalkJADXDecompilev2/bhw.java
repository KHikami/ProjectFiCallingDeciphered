package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public final class bhw extends BroadcastReceiver {
    private boolean a;
    private final CopyOnWriteArrayList<bhx> b = new CopyOnWriteArrayList();

    public void a(bhx bhx) {
        if (bhx != null) {
            this.b.add(bhx);
        }
    }

    public void b(bhx bhx) {
        if (bhx != null) {
            this.b.remove(bhx);
        }
    }

    public void onReceive(Context context, Intent intent) {
        if ("android.intent.action.BATTERY_CHANGED".equals(intent.getAction())) {
            boolean a;
            boolean z = this.a;
            int intExtra = intent.getIntExtra("plugged", -1);
            if (VERSION.SDK_INT < 17) {
                a = bhw.a(intExtra);
            } else if (bhw.a(intExtra) || intExtra == 4) {
                a = true;
            } else {
                a = false;
            }
            this.a = a;
            Iterator it;
            if (this.a && !z) {
                it = this.b.iterator();
                while (it.hasNext()) {
                    ((bhx) it.next()).a();
                }
            } else if (!this.a && z) {
                it = this.b.iterator();
                while (it.hasNext()) {
                    ((bhx) it.next()).b();
                }
            }
        }
    }

    private static boolean a(int i) {
        return i == 1 || i == 2;
    }
}
