package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* renamed from: ayl */
final class ayl extends BroadcastReceiver {
    final /* synthetic */ ayk a;

    ayl(ayk ayk) {
        this.a = ayk;
    }

    public void onReceive(Context context, Intent intent) {
        boolean z = this.a.b;
        ayk ayk = this.a;
        ayk ayk2 = this.a;
        ayk.b = ayk.a(context);
        if (z != this.a.b) {
            this.a.a.a(this.a.b);
        }
    }
}
