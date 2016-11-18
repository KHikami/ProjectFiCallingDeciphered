package p000;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public final class cuo {
    final Collection<edk> f9115a;
    boolean f9116b;
    boolean f9117c;
    final /* synthetic */ cuk f9118d;
    private final long f9119e = glj.m17956a();
    private boolean f9120f;
    private final boolean f9121g;

    cuo(cuk cuk, List<edk> list, boolean z) {
        this.f9118d = cuk;
        Collection arrayList = new ArrayList(list.size());
        arrayList.addAll(list);
        this.f9115a = Collections.unmodifiableCollection(arrayList);
        this.f9121g = z;
    }

    public Collection<edk> m11036a() {
        return this.f9115a;
    }

    public boolean m11037b() {
        return this.f9120f;
    }

    public void m11038c() {
        glk.m17970a("Babel_explane_invite", "Invitation acknowledged", new Object[0]);
        this.f9120f = true;
        for (cuq c : this.f9118d.f9104b) {
            c.mo1430c();
        }
    }

    public boolean m11039d() {
        return this.f9116b;
    }

    public boolean m11040e() {
        return this.f9117c;
    }

    public boolean m11041f() {
        return this.f9121g;
    }

    void m11042g() {
        this.f9116b = false;
        this.f9117c = true;
        for (cuq a : this.f9118d.f9104b) {
            a.mo1428a(this);
        }
    }
}
