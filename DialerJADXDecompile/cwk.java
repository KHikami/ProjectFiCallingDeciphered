import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

/* compiled from: PG */
final class cwk extends BroadcastReceiver {
    cwk() {
    }

    public final void onReceive(Context context, Intent intent) {
        if (Log.isLoggable("PrimesGservices", 3)) {
            String str = "onReceive, action=";
            String valueOf = String.valueOf(intent.getAction());
            if (valueOf.length() != 0) {
                str.concat(valueOf);
            } else {
                valueOf = new String(str);
            }
        }
        if (cwj.a.c) {
            context.unregisterReceiver(this);
        } else if ("com.google.gservices.intent.action.GSERVICES_CHANGED".equals(intent.getAction())) {
            cwj.a.a(context);
        }
    }
}
