import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;

public final class ayt {
    private final Set<azi> a;
    private final List<azi> b;
    private boolean c;

    public ayt() {
        this.a = Collections.newSetFromMap(new WeakHashMap());
        this.b = new ArrayList();
    }

    public void a(azi azi) {
        this.a.add(azi);
        if (this.c) {
            this.b.add(azi);
        } else {
            azi.a();
        }
    }

    public boolean b(azi azi) {
        boolean z = azi != null && (this.a.remove(azi) || this.b.remove(azi));
        if (z) {
            azi.c();
            azi.i();
        }
        return z;
    }

    public void a() {
        this.c = true;
        for (azi azi : baq.a(this.a)) {
            if (azi.e()) {
                azi.b();
                this.b.add(azi);
            }
        }
    }

    public void b() {
        this.c = false;
        for (azi azi : baq.a(this.a)) {
            if (!(azi.f() || azi.h() || azi.e())) {
                azi.a();
            }
        }
        this.b.clear();
    }

    public void c() {
        for (azi b : baq.a(this.a)) {
            b(b);
        }
        this.b.clear();
    }

    public void d() {
        for (azi azi : baq.a(this.a)) {
            if (!(azi.f() || azi.h())) {
                azi.b();
                if (this.c) {
                    this.b.add(azi);
                } else {
                    azi.a();
                }
            }
        }
    }

    public String toString() {
        String valueOf = String.valueOf(super.toString());
        int size = this.a.size();
        return new StringBuilder(String.valueOf(valueOf).length() + 41).append(valueOf).append("{numRequests=").append(size).append(", isPaused=").append(this.c).append("}").toString();
    }
}
