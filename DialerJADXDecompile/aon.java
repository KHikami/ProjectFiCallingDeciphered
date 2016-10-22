import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.android.dialer.app.dialpad.DialpadFragment;

/* compiled from: PG */
public final class aon extends BroadcastReceiver {
    private /* synthetic */ DialpadFragment a;

    public aon(DialpadFragment dialpadFragment) {
        this.a = dialpadFragment;
    }

    public final void onReceive(Context context, Intent intent) {
        CharSequence stringExtra = intent.getStringExtra("state");
        if ((TextUtils.equals(stringExtra, TelephonyManager.EXTRA_STATE_IDLE) || TextUtils.equals(stringExtra, TelephonyManager.EXTRA_STATE_OFFHOOK)) && this.a.b()) {
            this.a.a(false);
        }
    }
}
