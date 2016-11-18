package p000;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;

final class ehg extends ResultReceiver {
    final /* synthetic */ bjg f11496a;
    final /* synthetic */ ehf f11497b;

    ehg(ehf ehf, Handler handler, bjg bjg) {
        this.f11497b = ehf;
        this.f11496a = bjg;
        super(handler);
    }

    protected void onReceiveResult(int i, Bundle bundle) {
        super.onReceiveResult(i, bundle);
        this.f11497b.f11495a.m13896a(this.f11496a, 2768);
    }
}
