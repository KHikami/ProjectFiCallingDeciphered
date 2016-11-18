package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

final class ilm extends BroadcastReceiver {
    final /* synthetic */ ill f17995a;
    private boolean f17996b = true;
    private int f17997c = -1;

    public ilm(ill ill) {
        this.f17995a = ill;
    }

    public boolean m22246a() {
        return this.f17996b;
    }

    public int m22247b() {
        return this.f17997c;
    }

    public void onReceive(Context context, Intent intent) {
        this.f17996b = intent.getIntExtra("plugged", 0) == 0;
        int intExtra = intent.getIntExtra("scale", 0);
        int intExtra2 = intent.getIntExtra("level", 0);
        if (intExtra != 0) {
            this.f17997c = (intExtra2 * 100) / intExtra;
        } else {
            this.f17997c = -1;
        }
    }
}
