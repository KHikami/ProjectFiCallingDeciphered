package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public final class biu extends BroadcastReceiver {
    private boolean f3457a;
    private final CopyOnWriteArrayList<biv> f3458b = new CopyOnWriteArrayList();

    public biu(Context context) {
        this.f3457a = biu.m5341a(context);
    }

    public void m5342a(biv biv) {
        if (biv != null) {
            this.f3458b.add(biv);
        }
    }

    public void m5343b(biv biv) {
        if (biv != null) {
            this.f3458b.remove(biv);
        }
    }

    public void onReceive(Context context, Intent intent) {
        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            boolean z = this.f3457a;
            this.f3457a = biu.m5341a(context);
            Iterator it;
            if (this.f3457a && !z) {
                it = this.f3458b.iterator();
                while (it.hasNext()) {
                    ((biv) it.next()).mo558c();
                }
            } else if (!this.f3457a && z) {
                it = this.f3458b.iterator();
                while (it.hasNext()) {
                    ((biv) it.next()).mo559d();
                }
            }
        }
    }

    private static boolean m5341a(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager == null) {
            return false;
        }
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        if (activeNetworkInfo != null) {
            return activeNetworkInfo.isConnected();
        }
        return false;
    }
}
