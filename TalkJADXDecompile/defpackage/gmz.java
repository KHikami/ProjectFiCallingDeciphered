package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* renamed from: gmz */
final class gmz extends BroadcastReceiver {
    final /* synthetic */ gmx a;

    gmz(gmx gmx) {
        this.a = gmx;
    }

    public void onReceive(Context context, Intent intent) {
        this.a.a(intent);
    }
}
