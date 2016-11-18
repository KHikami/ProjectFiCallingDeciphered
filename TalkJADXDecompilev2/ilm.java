package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

final class ilm extends BroadcastReceiver {
    final /* synthetic */ ill a;
    private boolean b = true;
    private int c = -1;

    public ilm(ill ill) {
        this.a = ill;
    }

    public boolean a() {
        return this.b;
    }

    public int b() {
        return this.c;
    }

    public void onReceive(Context context, Intent intent) {
        this.b = intent.getIntExtra("plugged", 0) == 0;
        int intExtra = intent.getIntExtra("scale", 0);
        int intExtra2 = intent.getIntExtra("level", 0);
        if (intExtra != 0) {
            this.c = (intExtra2 * 100) / intExtra;
        } else {
            this.c = -1;
        }
    }
}
