package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

final class ayl extends BroadcastReceiver {
    final /* synthetic */ ayk f2547a;

    ayl(ayk ayk) {
        this.f2547a = ayk;
    }

    public void onReceive(Context context, Intent intent) {
        boolean z = this.f2547a.f2543b;
        ayk ayk = this.f2547a;
        ayk ayk2 = this.f2547a;
        ayk.f2543b = ayk.m4346a(context);
        if (z != this.f2547a.f2543b) {
            this.f2547a.f2542a.m4344a(this.f2547a.f2543b);
        }
    }
}
