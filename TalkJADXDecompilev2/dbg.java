package defpackage;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

final class dbg {
    final /* synthetic */ dbe a;
    private final Set<String> b = new HashSet();
    private final Map<String, Long> c = new HashMap();
    private int d = 0;
    private boolean e = false;

    dbg(dbe dbe) {
        this.a = dbe;
    }

    public boolean a(String str, long j) {
        if (!this.b.remove(str)) {
            return false;
        }
        this.c.put(str, Long.valueOf(j));
        b();
        return true;
    }

    private void b() {
        if (this.e && this.d == this.c.size()) {
            this.a.a(this.c, true, true);
            this.c.clear();
            this.b.clear();
            this.d = 0;
        }
    }

    public void a(String str) {
        this.b.add(str);
        this.d++;
    }

    public void a() {
        this.e = true;
        b();
    }
}
