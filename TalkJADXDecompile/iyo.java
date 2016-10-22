import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

final class iyo extends BroadcastReceiver {
    iyo() {
    }

    public void onReceive(Context context, Intent intent) {
        if (Log.isLoggable("PrimesGservices", 3)) {
            String str = "onReceive, action=";
            String valueOf = String.valueOf(intent.getAction());
            if (valueOf.length() != 0) {
                str.concat(valueOf);
            } else {
                valueOf = new String(str);
            }
        }
        if (iyn.a.a()) {
            context.unregisterReceiver(this);
        } else if ("com.google.gservices.intent.action.GSERVICES_CHANGED".equals(intent.getAction())) {
            ixx ixx = ixx.c;
            ixx.b().submit(new iyp(this, context));
        }
    }
}
