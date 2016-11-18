package p000;

import android.content.Intent;
import android.util.Log;

public class ihh {
    public final /* synthetic */ kdb f17683a;

    public void m21788a(int i, Intent intent) {
        Log.e("SslGuard", "Failed to install security updates: error=" + i);
        if (intent != null) {
            this.f17683a.f21397b.mo3172a(i, kdd.f21399a.f21400b);
        }
    }

    public ihh(kdb kdb) {
        this.f17683a = kdb;
    }
}
