import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* compiled from: PG */
final class atc extends BroadcastReceiver {
    private /* synthetic */ ata a;

    atc(ata ata) {
        this.a = ata;
    }

    public final void onReceive(Context context, Intent intent) {
        boolean z = true;
        if ("android.intent.action.HEADSET_PLUG".equals(intent.getAction())) {
            if (intent.getIntExtra("state", 0) != 1) {
                z = false;
            }
            String str = ata.a;
            new StringBuilder(44).append("ACTION_HEADSET_PLUG event, plugged in: ").append(z);
            ata ata = this.a;
            if (ata.c != z) {
                new StringBuilder(55).append("onHeadsetPluggedInChanged, mIsPluggedIn: ").append(ata.c).append(" -> ").append(z);
                boolean z2 = ata.c;
                ata.c = z;
                if (ata.d != null) {
                    ata.d.a(z2, ata.c);
                }
            }
        }
    }
}
