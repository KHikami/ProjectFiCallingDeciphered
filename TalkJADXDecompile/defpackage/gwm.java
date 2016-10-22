package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.HashSet;
import java.util.Set;

/* renamed from: gwm */
final class gwm {
    final Set<ServiceConnection> a;
    int b;
    IBinder c;
    final gwl d;
    ComponentName e;
    final /* synthetic */ gwk f;
    private final gwn g;
    private boolean h;

    public gwm(gwk gwk, gwl gwl) {
        this.f = gwk;
        this.d = gwl;
        this.g = new gwn(this);
        this.a = new HashSet();
        this.b = 2;
    }

    public void a() {
        this.f.d.a(this.f.b, this.g);
        this.h = false;
        this.b = 2;
    }

    public void a(ServiceConnection serviceConnection) {
        this.f.d.b(this.f.b, serviceConnection);
        this.a.remove(serviceConnection);
    }

    public void a(ServiceConnection serviceConnection, String str) {
        this.f.d.a(this.f.b, serviceConnection, str, this.d.a());
        this.a.add(serviceConnection);
    }

    public void a(String str) {
        this.b = 3;
        this.h = this.f.d.a(this.f.b, str, this.d.a(), this.g, 129);
        if (!this.h) {
            this.b = 2;
            try {
                this.f.d.a(this.f.b, this.g);
            } catch (IllegalArgumentException e) {
            }
        }
    }

    public boolean b() {
        return this.h;
    }

    public boolean b(ServiceConnection serviceConnection) {
        return this.a.contains(serviceConnection);
    }

    public int c() {
        return this.b;
    }

    public boolean d() {
        return this.a.isEmpty();
    }

    public IBinder e() {
        return this.c;
    }

    public ComponentName f() {
        return this.e;
    }
}
