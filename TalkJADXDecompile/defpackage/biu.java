package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: biu */
public final class biu extends BroadcastReceiver {
    private boolean a;
    private final CopyOnWriteArrayList<biv> b;

    public biu(Context context) {
        this.a = biu.a(context);
        this.b = new CopyOnWriteArrayList();
    }

    public void a(biv biv) {
        if (biv != null) {
            this.b.add(biv);
        }
    }

    public void b(biv biv) {
        if (biv != null) {
            this.b.remove(biv);
        }
    }

    public void onReceive(Context context, Intent intent) {
        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            boolean z = this.a;
            this.a = biu.a(context);
            Iterator it;
            if (this.a && !z) {
                it = this.b.iterator();
                while (it.hasNext()) {
                    ((biv) it.next()).c();
                }
            } else if (!this.a && z) {
                it = this.b.iterator();
                while (it.hasNext()) {
                    ((biv) it.next()).d();
                }
            }
        }
    }

    private static boolean a(Context context) {
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
