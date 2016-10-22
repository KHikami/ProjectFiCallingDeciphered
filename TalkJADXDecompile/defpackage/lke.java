package defpackage;

import java.util.Set;

/* renamed from: lke */
public final class lke {
    private final boolean a;

    lke(Set<Boolean> set) {
        boolean z = true;
        if (set.size() > 1) {
            z = false;
        }
        bm.b(z);
        if (set.isEmpty()) {
            this.a = false;
        } else {
            this.a = ((Boolean) set.iterator().next()).booleanValue();
        }
    }

    public void a(String str) {
        a();
        lkb.b(str);
    }

    public void a(lji lji) {
        a();
        lkb.a(lji);
    }

    private void a() {
        if (!this.a) {
            lkb.a(false);
        }
    }
}
