package p000;

import android.os.Bundle;
import android.os.IBinder;

final class gsv implements gsw<Void> {
    final /* synthetic */ String f16033a;
    final /* synthetic */ Bundle f16034b;

    gsv(String str, Bundle bundle) {
        this.f16033a = str;
        this.f16034b = bundle;
    }

    private Void m18495b(IBinder iBinder) {
        Bundle bundle = (Bundle) gst.m18480a(hda.m19393a(iBinder).mo2456a(this.f16033a, this.f16034b));
        String string = bundle.getString("Error");
        if (bundle.getBoolean("booleanResult")) {
            return null;
        }
        throw new gsr(string);
    }

    public /* synthetic */ Object mo2332a(IBinder iBinder) {
        return m18495b(iBinder);
    }
}
