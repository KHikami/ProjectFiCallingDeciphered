package p000;

import android.util.Log;
import java.util.Locale;

final class ife implements iee<ied> {
    final /* synthetic */ ifa f17634a;

    ife(ifa ifa) {
        this.f17634a = ifa;
    }

    public /* synthetic */ void mo1921a(ied ied) {
        m21688b(ied);
    }

    private void m21688b(ied ied) {
        if (Log.isLoggable("ClearcutLogger", 3)) {
            String.format(Locale.US, "ClearcutLogger log result: %s ", new Object[]{ied.toString()});
        }
        this.f17634a.f17625a.postDelayed(this.f17634a.f17626b, 10000);
    }
}
