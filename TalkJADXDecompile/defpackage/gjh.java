package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* renamed from: gjh */
final class gjh extends BroadcastReceiver {
    final /* synthetic */ gjg a;

    gjh(gjg gjg) {
        this.a = gjg;
    }

    public void onReceive(Context context, Intent intent) {
        this.a.a = true;
    }
}
