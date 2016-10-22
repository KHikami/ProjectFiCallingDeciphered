package defpackage;

import android.util.Log;
import java.util.Locale;

/* renamed from: ife */
final class ife implements iee<ied> {
    final /* synthetic */ ifa a;

    ife(ifa ifa) {
        this.a = ifa;
    }

    public /* synthetic */ void a(ied ied) {
        b(ied);
    }

    private void b(ied ied) {
        if (Log.isLoggable("ClearcutLogger", 3)) {
            String.format(Locale.US, "ClearcutLogger log result: %s ", new Object[]{ied.toString()});
        }
        this.a.a.postDelayed(this.a.b, 10000);
    }
}
