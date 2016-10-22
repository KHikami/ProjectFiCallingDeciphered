import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;

public final class bum extends bve {
    private bui a;
    private final int b;

    public bum(bui bui, int i) {
        this.a = bui;
        this.b = i;
    }

    public final void a(int i, Bundle bundle) {
        Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
    }

    public final void a(int i, IBinder iBinder, Bundle bundle) {
        buf.d(this.a, (Object) "onPostInitComplete can be called only once per call to getRemoteService");
        bui bui = this.a;
        bui.b.sendMessage(bui.b.obtainMessage(1, this.b, -1, new bup(bui, i, iBinder, bundle)));
        this.a = null;
    }
}
