package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

final class ouj extends BroadcastReceiver {
    final /* synthetic */ Context f34304a;
    final /* synthetic */ oui f34305b;

    ouj(oui oui, Context context) {
        this.f34305b = oui;
        this.f34304a = context;
    }

    public void onReceive(Context context, Intent intent) {
        this.f34304a.unregisterReceiver(this);
        this.f34305b.f34302a.f34307b.getAuthToken(this.f34305b.f34302a.f34310e, this.f34305b.f34302a.f34309d, this.f34305b.f34302a.f34308c, true, new oui(this.f34305b.f34303b, this.f34305b.f34302a), null);
    }
}
