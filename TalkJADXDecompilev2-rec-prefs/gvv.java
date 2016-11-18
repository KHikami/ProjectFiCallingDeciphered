package p000;

import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;

public final class gvv extends gwz {
    private gvo f16251a;
    private final int f16252b;

    public gvv(gvo gvo, int i) {
        this.f16251a = gvo;
        this.f16252b = i;
    }

    public void mo2350a(int i, Bundle bundle) {
        Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
    }

    public void mo2351a(int i, IBinder iBinder, Bundle bundle) {
        gwb.m2195f(this.f16251a, (Object) "onPostInitComplete can be called only once per call to getRemoteService");
        this.f16251a.mo3023a(i, iBinder, bundle, this.f16252b);
        this.f16251a = null;
    }
}
