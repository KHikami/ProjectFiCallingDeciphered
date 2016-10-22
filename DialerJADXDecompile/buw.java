import android.annotation.TargetApi;
import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.HashSet;
import java.util.Set;

final class buw {
    final bux a;
    final Set b;
    int c;
    boolean d;
    IBinder e;
    final buv f;
    ComponentName g;
    final /* synthetic */ buu h;

    public buw(buu buu, buv buv) {
        this.h = buu;
        this.f = buv;
        this.a = new bux(this);
        this.b = new HashSet();
        this.c = 2;
    }

    public final void a(ServiceConnection serviceConnection, String str) {
        this.h.d.a(this.h.b, bvr.a(serviceConnection), str, this.f.a(), 3);
        this.b.add(serviceConnection);
    }

    @TargetApi(14)
    public final void a(String str) {
        this.c = 3;
        this.d = this.h.d.a(this.h.b, str, this.f.a(), this.a, 129);
        if (!this.d) {
            this.c = 2;
            try {
                this.h.d.a(this.h.b, this.a);
            } catch (IllegalArgumentException e) {
            }
        }
    }

    public final boolean a() {
        return this.b.isEmpty();
    }

    public final boolean a(ServiceConnection serviceConnection) {
        return this.b.contains(serviceConnection);
    }
}
