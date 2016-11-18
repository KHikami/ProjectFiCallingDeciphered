package p000;

import java.util.Set;

public final class lke {
    private final boolean f25144a;

    lke(Set<Boolean> set) {
        boolean z = true;
        if (set.size() > 1) {
            z = false;
        }
        bm.m6150b(z);
        if (set.isEmpty()) {
            this.f25144a = false;
        } else {
            this.f25144a = ((Boolean) set.iterator().next()).booleanValue();
        }
    }

    public void m29215a(String str) {
        m29214a();
        lkb.m29210b(str);
    }

    public void m29216a(lji lji) {
        m29214a();
        lkb.m29205a(lji);
    }

    private void m29214a() {
        if (!this.f25144a) {
            lkb.m29207a(false);
        }
    }
}
