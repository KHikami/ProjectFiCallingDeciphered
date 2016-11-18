package p000;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

final class dbg {
    final /* synthetic */ dbe f9459a;
    private final Set<String> f9460b = new HashSet();
    private final Map<String, Long> f9461c = new HashMap();
    private int f9462d = 0;
    private boolean f9463e = false;

    dbg(dbe dbe) {
        this.f9459a = dbe;
    }

    public boolean m11415a(String str, long j) {
        if (!this.f9460b.remove(str)) {
            return false;
        }
        this.f9461c.put(str, Long.valueOf(j));
        m11412b();
        return true;
    }

    private void m11412b() {
        if (this.f9463e && this.f9462d == this.f9461c.size()) {
            this.f9459a.m11410a(this.f9461c, true, true);
            this.f9461c.clear();
            this.f9460b.clear();
            this.f9462d = 0;
        }
    }

    public void m11414a(String str) {
        this.f9460b.add(str);
        this.f9462d++;
    }

    public void m11413a() {
        this.f9463e = true;
        m11412b();
    }
}
