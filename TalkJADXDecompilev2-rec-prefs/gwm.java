package p000;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.HashSet;
import java.util.Set;

final class gwm {
    final Set<ServiceConnection> f16303a = new HashSet();
    int f16304b = 2;
    IBinder f16305c;
    final gwl f16306d;
    ComponentName f16307e;
    final /* synthetic */ gwk f16308f;
    private final gwn f16309g = new gwn(this);
    private boolean f16310h;

    public gwm(gwk gwk, gwl gwl) {
        this.f16308f = gwk;
        this.f16306d = gwl;
    }

    public void m18792a() {
        this.f16308f.f16298d.m18919a(this.f16308f.f16296b, this.f16309g);
        this.f16310h = false;
        this.f16304b = 2;
    }

    public void m18793a(ServiceConnection serviceConnection) {
        this.f16308f.f16298d.m18922b(this.f16308f.f16296b, serviceConnection);
        this.f16303a.remove(serviceConnection);
    }

    public void m18794a(ServiceConnection serviceConnection, String str) {
        this.f16308f.f16298d.m18920a(this.f16308f.f16296b, serviceConnection, str, this.f16306d.m18791a());
        this.f16303a.add(serviceConnection);
    }

    public void m18795a(String str) {
        this.f16304b = 3;
        this.f16310h = this.f16308f.f16298d.m18921a(this.f16308f.f16296b, str, this.f16306d.m18791a(), this.f16309g, 129);
        if (!this.f16310h) {
            this.f16304b = 2;
            try {
                this.f16308f.f16298d.m18919a(this.f16308f.f16296b, this.f16309g);
            } catch (IllegalArgumentException e) {
            }
        }
    }

    public boolean m18796b() {
        return this.f16310h;
    }

    public boolean m18797b(ServiceConnection serviceConnection) {
        return this.f16303a.contains(serviceConnection);
    }

    public int m18798c() {
        return this.f16304b;
    }

    public boolean m18799d() {
        return this.f16303a.isEmpty();
    }

    public IBinder m18800e() {
        return this.f16305c;
    }

    public ComponentName m18801f() {
        return this.f16307e;
    }
}
