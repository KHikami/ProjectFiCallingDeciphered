import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build.VERSION;

class bou extends BroadcastReceiver {
    private static String d;
    final bnp a;
    boolean b;
    boolean c;

    static {
        d = bou.class.getName();
    }

    bou(bnp bnp) {
        buf.A((Object) bnp);
        this.a = bnp;
    }

    public final void b() {
        if (this.b) {
            this.a.a().b("Unregistering connectivity change receiver");
            this.b = false;
            this.c = false;
            try {
                this.a.a.unregisterReceiver(this);
            } catch (IllegalArgumentException e) {
                this.a.a().e("Failed to unregister the network broadcast receiver", e);
            }
        }
    }

    public final void c() {
        if (VERSION.SDK_INT > 10) {
            Context context = this.a.a;
            Intent intent = new Intent("com.google.analytics.RADIO_POWERED");
            intent.addCategory(context.getPackageName());
            intent.putExtra(d, true);
            context.sendOrderedBroadcast(intent, null);
        }
    }

    protected final boolean d() {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.a.a.getSystemService("connectivity")).getActiveNetworkInfo();
            return activeNetworkInfo != null && activeNetworkInfo.isConnected();
        } catch (SecurityException e) {
            return false;
        }
    }

    public void onReceive(Context context, Intent intent) {
        a();
        String action = intent.getAction();
        this.a.a().a("NetworkBroadcastReceiver received action", action);
        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
            boolean d = d();
            if (this.c != d) {
                this.c = d;
                bno c = this.a.c();
                c.a("Network connectivity status changed", Boolean.valueOf(d));
                c.f.b().a(new bnk(c, d));
            }
        } else if (!"com.google.analytics.RADIO_POWERED".equals(action)) {
            this.a.a().d("NetworkBroadcastReceiver received unknown action", action);
        } else if (!intent.hasExtra(d)) {
            bni c2 = this.a.c();
            c2.b("Radio powered up");
            c2.b();
        }
    }

    final void a() {
        this.a.a();
        this.a.c();
    }
}
