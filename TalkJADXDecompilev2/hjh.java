package defpackage;

import android.app.PendingIntent;
import com.google.android.gms.common.api.Status;

public final class hjh extends hjj {
    final /* synthetic */ long a;
    final /* synthetic */ PendingIntent b;
    final /* synthetic */ hjb c;

    public hjh(hjb hjb, gui gui, long j, PendingIntent pendingIntent) {
        this.c = hjb;
        this.a = j;
        this.b = pendingIntent;
        super(gui);
    }

    private void a(hkc hkc) {
        hkc.a(this.a, this.b);
        a(Status.a);
    }
}
