import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;

public final class gvv extends gwz {
    private gvo a;
    private final int b;

    public gvv(gvo gvo, int i) {
        this.a = gvo;
        this.b = i;
    }

    public void a(int i, Bundle bundle) {
        Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
    }

    public void a(int i, IBinder iBinder, Bundle bundle) {
        gwb.f(this.a, (Object) "onPostInitComplete can be called only once per call to getRemoteService");
        this.a.a(i, iBinder, bundle, this.b);
        this.a = null;
    }
}
