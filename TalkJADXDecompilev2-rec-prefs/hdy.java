package p000;

import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.common.ConnectionResult;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public class hdy extends hed {
    private final SparseArray<hdz> f16718g = new SparseArray();

    public hdy(hgb hgb) {
        super(hgb);
        this.f.mo2535a("AutoManageHelper", (hga) this);
    }

    public void mo2470a() {
        super.mo2470a();
        boolean z = this.a;
        String valueOf = String.valueOf(this.f16718g);
        new StringBuilder(String.valueOf(valueOf).length() + 14).append("onStart ").append(z).append(" ").append(valueOf);
        if (!this.b) {
            for (int i = 0; i < this.f16718g.size(); i++) {
                ((hdz) this.f16718g.valueAt(i)).f16720b.mo2518b();
            }
        }
    }

    public void m19464a(int i) {
        hdz hdz = (hdz) this.f16718g.get(i);
        this.f16718g.remove(i);
        if (hdz != null) {
            hdz.m19470a();
        }
    }

    public void m19465a(int i, gui gui, gul gul) {
        gwb.m2195f((Object) gui, (Object) "GoogleApiClient instance cannot be null");
        gwb.m1886a(this.f16718g.indexOfKey(i) < 0, "Already managing a GoogleApiClient with id " + i);
        new StringBuilder(54).append("starting AutoManage for client ").append(i).append(" ").append(this.a).append(" ").append(this.b);
        this.f16718g.put(i, new hdz(this, i, gui, gul));
        if (this.a && !this.b) {
            String valueOf = String.valueOf(gui);
            new StringBuilder(String.valueOf(valueOf).length() + 11).append("connecting ").append(valueOf);
            gui.mo2518b();
        }
    }

    protected void mo2475a(ConnectionResult connectionResult, int i) {
        if (i < 0) {
            Log.wtf("AutoManageHelper", "AutoManageLifecycleHelper received onErrorResolutionFailed callback but no failing client ID is set", new Exception());
            return;
        }
        hdz hdz = (hdz) this.f16718g.get(i);
        if (hdz != null) {
            m19464a(i);
            gul gul = hdz.f16721c;
            if (gul != null) {
                gul.mo1151a(connectionResult);
            }
        }
    }

    public void mo2476a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        for (int i = 0; i < this.f16718g.size(); i++) {
            ((hdz) this.f16718g.valueAt(i)).m19472a(str, fileDescriptor, printWriter, strArr);
        }
    }

    public void mo2473b() {
        super.mo2473b();
        for (int i = 0; i < this.f16718g.size(); i++) {
            ((hdz) this.f16718g.valueAt(i)).f16720b.mo2523d();
        }
    }

    protected void mo2477c() {
        for (int i = 0; i < this.f16718g.size(); i++) {
            ((hdz) this.f16718g.valueAt(i)).f16720b.mo2518b();
        }
    }
}
