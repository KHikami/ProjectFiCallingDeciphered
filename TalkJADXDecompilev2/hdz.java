package defpackage;

import com.google.android.gms.common.ConnectionResult;
import java.io.FileDescriptor;
import java.io.PrintWriter;

final class hdz implements gul {
    public final int a;
    public final gui b;
    public final gul c;
    final /* synthetic */ hdy d;

    public hdz(hdy hdy, int i, gui gui, gul gul) {
        this.d = hdy;
        this.a = i;
        this.b = gui;
        this.c = gul;
        gui.a((gul) this);
    }

    public void a() {
        this.b.b((gul) this);
        this.b.d();
    }

    public void a(ConnectionResult connectionResult) {
        String valueOf = String.valueOf(connectionResult);
        new StringBuilder(String.valueOf(valueOf).length() + 27).append("beginFailureResolution for ").append(valueOf);
        this.d.b(connectionResult, this.a);
    }

    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.append(str).append("GoogleApiClient #").print(this.a);
        printWriter.println(":");
        this.b.a(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
    }
}
