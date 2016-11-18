package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public final class cuo {
    final Collection<edk> a;
    boolean b;
    boolean c;
    final /* synthetic */ cuk d;
    private final long e = glj.a();
    private boolean f;
    private final boolean g;

    cuo(cuk cuk, List<edk> list, boolean z) {
        this.d = cuk;
        Collection arrayList = new ArrayList(list.size());
        arrayList.addAll(list);
        this.a = Collections.unmodifiableCollection(arrayList);
        this.g = z;
    }

    public Collection<edk> a() {
        return this.a;
    }

    public boolean b() {
        return this.f;
    }

    public void c() {
        glk.a("Babel_explane_invite", "Invitation acknowledged", new Object[0]);
        this.f = true;
        for (cuq c : this.d.b) {
            c.c();
        }
    }

    public boolean d() {
        return this.b;
    }

    public boolean e() {
        return this.c;
    }

    public boolean f() {
        return this.g;
    }

    void g() {
        this.b = false;
        this.c = true;
        for (cuq a : this.d.b) {
            a.a(this);
        }
    }
}
