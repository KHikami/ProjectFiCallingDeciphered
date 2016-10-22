package defpackage;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;

/* renamed from: ehg */
final class ehg extends ResultReceiver {
    final /* synthetic */ bjg a;
    final /* synthetic */ ehf b;

    ehg(ehf ehf, Handler handler, bjg bjg) {
        this.b = ehf;
        this.a = bjg;
        super(handler);
    }

    protected void onReceiveResult(int i, Bundle bundle) {
        super.onReceiveResult(i, bundle);
        this.b.a.a(this.a, 2768);
    }
}
