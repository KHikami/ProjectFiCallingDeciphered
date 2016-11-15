import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.Locale;

final class gfu extends BroadcastReceiver {//TeleWifiMonitor.receiver
    final /* synthetic */ gfq a;

    gfu(gfq gfq) {
        this.a = gfq;
    }

    public void onReceive(Context context, Intent intent) {
        if (gfq.a) {
            String str = "TeleWifiMonitor.Receiver.onReceive, action: ";
            String valueOf = String.valueOf(intent.getAction());
            if (valueOf.length() != 0) {
                str.concat(valueOf);
            } else {
                valueOf = new String(str);
            }
        }
        gfq gfq = this.a;
        iil.a();
        gfv a = gfq.a(gfq.b);
        if (!a.equals(gfq.d)) {
            glk.c("Babel_telephony", String.format(Locale.US, "TeleWifiMonitor.updateSignalState, (%s) -> (%s)", new Object[]{gfq.d, a}), new Object[0]);
            gfq.d = a;
            if (gfq.c != null) {
                gfq.c.a(gfq.d);
            }
        }
    }
}
