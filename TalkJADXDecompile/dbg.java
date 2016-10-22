import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

final class dbg {
    final /* synthetic */ dbe a;
    private final Set<String> b;
    private final Map<String, Long> c;
    private int d;
    private boolean e;

    dbg(dbe dbe) {
        this.a = dbe;
        this.b = new HashSet();
        this.c = new HashMap();
        this.d = 0;
        this.e = false;
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
