import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

final class ayk implements ayo {
    final ayi a;
    boolean b;
    private final Context c;
    private boolean d;
    private final BroadcastReceiver e;

    public ayk(Context context, ayi ayi) {
        this.e = new ayl(this);
        this.c = context.getApplicationContext();
        this.a = ayi;
    }

    static boolean a(Context context) {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public void f() {
    }

    public void d() {
        if (!this.d) {
            this.b = a(this.c);
            this.c.registerReceiver(this.e, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            this.d = true;
        }
    }

    public void h_() {
        if (this.d) {
            this.c.unregisterReceiver(this.e);
            this.d = false;
        }
    }
}
