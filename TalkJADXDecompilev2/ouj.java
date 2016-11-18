package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

final class ouj extends BroadcastReceiver {
    final /* synthetic */ Context a;
    final /* synthetic */ oui b;

    ouj(oui oui, Context context) {
        this.b = oui;
        this.a = context;
    }

    public void onReceive(Context context, Intent intent) {
        this.a.unregisterReceiver(this);
        this.b.a.b.getAuthToken(this.b.a.e, this.b.a.d, this.b.a.c, true, new oui(this.b.b, this.b.a), null);
    }
}
