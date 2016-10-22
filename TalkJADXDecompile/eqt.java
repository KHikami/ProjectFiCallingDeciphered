import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

final class eqt extends BroadcastReceiver {
    final /* synthetic */ eqs a;

    eqt(eqs eqs) {
        this.a = eqs;
    }

    public void onReceive(Context context, Intent intent) {
        this.a.e = (epu) intent.getSerializableExtra("phone_verification_result");
        this.a.q();
        this.a.a.sendAccessibilityEvent(32);
    }
}
