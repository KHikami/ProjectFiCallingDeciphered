package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

final class eqt extends BroadcastReceiver {
    final /* synthetic */ eqs f12081a;

    eqt(eqs eqs) {
        this.f12081a = eqs;
    }

    public void onReceive(Context context, Intent intent) {
        this.f12081a.f12076e = (epu) intent.getSerializableExtra("phone_verification_result");
        this.f12081a.m14285q();
        this.f12081a.f12072a.sendAccessibilityEvent(32);
    }
}
