package defpackage;

import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.common.ConnectionResult;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public class hdy extends hed {
    private final SparseArray<hdz> g = new SparseArray();

    public hdy(hgb hgb) {
        super(hgb);
        this.f.a("AutoManageHelper", (hga) this);
    }

    public void a() {
        super.a();
        boolean z = this.a;
        String valueOf = String.valueOf(this.g);
        new StringBuilder(String.valueOf(valueOf).length() + 14).append("onStart ").append(z).append(" ").append(valueOf);
        if (!this.b) {
            for (int i = 0; i < this.g.size(); i++) {
                ((hdz) this.g.valueAt(i)).b.b();
            }
        }
    }

    public void a(int i) {
        hdz hdz = (hdz) this.g.get(i);
        this.g.remove(i);
        if (hdz != null) {
            hdz.a();
        }
    }

    public void a(int i, gui gui, gul gul) {
        gwb.f((Object) gui, (Object) "GoogleApiClient instance cannot be null");
        gwb.a(this.g.indexOfKey(i) < 0, "Already managing a GoogleApiClient with id " + i);
        new StringBuilder(54).append("starting AutoManage for client ").append(i).append(" ").append(this.a).append(" ").append(this.b);
        this.g.put(i, new hdz(this, i, gui, gul));
        if (this.a && !this.b) {
            String valueOf = String.valueOf(gui);
            new StringBuilder(String.valueOf(valueOf).length() + 11).append("connecting ").append(valueOf);
            gui.b();
        }
    }

    protected void a(ConnectionResult connectionResult, int i) {
        if (i < 0) {
            Log.wtf("AutoManageHelper", "AutoManageLifecycleHelper received onErrorResolutionFailed callback but no failing client ID is set", new Exception());
            return;
        }
        hdz hdz = (hdz) this.g.get(i);
        if (hdz != null) {
            a(i);
            gul gul = hdz.c;
            if (gul != null) {
                gul.a(connectionResult);
            }
        }
    }

    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        for (int i = 0; i < this.g.size(); i++) {
            ((hdz) this.g.valueAt(i)).a(str, fileDescriptor, printWriter, strArr);
        }
    }

    public void b() {
        super.b();
        for (int i = 0; i < this.g.size(); i++) {
            ((hdz) this.g.valueAt(i)).b.d();
        }
    }

    protected void c() {
        for (int i = 0; i < this.g.size(); i++) {
            ((hdz) this.g.valueAt(i)).b.b();
        }
    }
}
