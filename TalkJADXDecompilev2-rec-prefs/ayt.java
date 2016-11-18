package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;

public final class ayt {
    private final Set<azi> f2560a = Collections.newSetFromMap(new WeakHashMap());
    private final List<azi> f2561b = new ArrayList();
    private boolean f2562c;

    public void m4369a(azi azi) {
        this.f2560a.add(azi);
        if (this.f2562c) {
            this.f2561b.add(azi);
        } else {
            azi.mo417a();
        }
    }

    public boolean m4371b(azi azi) {
        boolean z = azi != null && (this.f2560a.remove(azi) || this.f2561b.remove(azi));
        if (z) {
            azi.mo422c();
            azi.mo427i();
        }
        return z;
    }

    public void m4368a() {
        this.f2562c = true;
        for (azi azi : baq.m4683a(this.f2560a)) {
            if (azi.mo423e()) {
                azi.mo421b();
                this.f2561b.add(azi);
            }
        }
    }

    public void m4370b() {
        this.f2562c = false;
        for (azi azi : baq.m4683a(this.f2560a)) {
            if (!(azi.mo424f() || azi.mo426h() || azi.mo423e())) {
                azi.mo417a();
            }
        }
        this.f2561b.clear();
    }

    public void m4372c() {
        for (azi b : baq.m4683a(this.f2560a)) {
            m4371b(b);
        }
        this.f2561b.clear();
    }

    public void m4373d() {
        for (azi azi : baq.m4683a(this.f2560a)) {
            if (!(azi.mo424f() || azi.mo426h())) {
                azi.mo421b();
                if (this.f2562c) {
                    this.f2561b.add(azi);
                } else {
                    azi.mo417a();
                }
            }
        }
    }

    public String toString() {
        String valueOf = String.valueOf(super.toString());
        int size = this.f2560a.size();
        return new StringBuilder(String.valueOf(valueOf).length() + 41).append(valueOf).append("{numRequests=").append(size).append(", isPaused=").append(this.f2562c).append("}").toString();
    }
}
