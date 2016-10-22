package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* compiled from: PG */
/* renamed from: aff */
final class aff extends BroadcastReceiver {
    private /* synthetic */ afc a;

    aff(afc afc) {
        this.a = afc;
    }

    public final void onReceive(Context context, Intent intent) {
        this.a.d.sendMessage(this.a.d.obtainMessage(1, intent));
    }
}
