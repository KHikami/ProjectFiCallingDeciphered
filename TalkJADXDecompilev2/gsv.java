package defpackage;

import android.os.Bundle;
import android.os.IBinder;

final class gsv implements gsw<Void> {
    final /* synthetic */ String a;
    final /* synthetic */ Bundle b;

    gsv(String str, Bundle bundle) {
        this.a = str;
        this.b = bundle;
    }

    private Void b(IBinder iBinder) {
        Bundle bundle = (Bundle) gst.a(hda.a(iBinder).a(this.a, this.b));
        String string = bundle.getString("Error");
        if (bundle.getBoolean("booleanResult")) {
            return null;
        }
        throw new gsr(string);
    }

    public /* synthetic */ Object a(IBinder iBinder) {
        return b(iBinder);
    }
}
