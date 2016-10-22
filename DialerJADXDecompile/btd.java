import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;

abstract class btd extends BroadcastReceiver {
    private Context a;

    btd() {
    }

    public static btd a(Context context, btd btd, bqp bqp) {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
        intentFilter.addDataScheme("package");
        context.registerReceiver(btd, intentFilter);
        btd.a = context;
        if (bqp.a(context, "com.google.android.gms")) {
            return btd;
        }
        btd.a();
        btd.b();
        return null;
    }

    protected abstract void a();

    public final synchronized void b() {
        if (this.a != null) {
            this.a.unregisterReceiver(this);
        }
        this.a = null;
    }

    public void onReceive(Context context, Intent intent) {
        Uri data = intent.getData();
        Object obj = null;
        if (data != null) {
            obj = data.getSchemeSpecificPart();
        }
        if ("com.google.android.gms".equals(obj)) {
            a();
            b();
        }
    }
}
