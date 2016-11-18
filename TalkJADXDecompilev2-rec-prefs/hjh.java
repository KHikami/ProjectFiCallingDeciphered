package p000;

import android.app.PendingIntent;
import com.google.android.gms.common.api.Status;

public final class hjh extends hjj {
    final /* synthetic */ long f17037a;
    final /* synthetic */ PendingIntent f17038b;
    final /* synthetic */ hjb f17039c;

    public hjh(hjb hjb, gui gui, long j, PendingIntent pendingIntent) {
        this.f17039c = hjb;
        this.f17037a = j;
        this.f17038b = pendingIntent;
        super(gui);
    }

    private void m19900a(hkc hkc) {
        hkc.m19997a(this.f17037a, this.f17038b);
        m18974a(Status.f7264a);
    }
}
