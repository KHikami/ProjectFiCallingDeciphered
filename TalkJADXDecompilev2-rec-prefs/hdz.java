package p000;

import com.google.android.gms.common.ConnectionResult;
import java.io.FileDescriptor;
import java.io.PrintWriter;

final class hdz implements gul {
    public final int f16719a;
    public final gui f16720b;
    public final gul f16721c;
    final /* synthetic */ hdy f16722d;

    public hdz(hdy hdy, int i, gui gui, gul gul) {
        this.f16722d = hdy;
        this.f16719a = i;
        this.f16720b = gui;
        this.f16721c = gul;
        gui.mo2514a((gul) this);
    }

    public void m19470a() {
        this.f16720b.mo2520b((gul) this);
        this.f16720b.mo2523d();
    }

    public void mo1151a(ConnectionResult connectionResult) {
        String valueOf = String.valueOf(connectionResult);
        new StringBuilder(String.valueOf(valueOf).length() + 27).append("beginFailureResolution for ").append(valueOf);
        this.f16722d.m19460b(connectionResult, this.f16719a);
    }

    public void m19472a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.append(str).append("GoogleApiClient #").print(this.f16719a);
        printWriter.println(":");
        this.f16720b.mo2516a(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
    }
}
