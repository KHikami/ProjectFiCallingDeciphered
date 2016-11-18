package defpackage;

import java.util.HashMap;
import java.util.Map;

public abstract class gqa {
    private final Map<mfb<String, String>, gqb> a = new HashMap();

    protected abstract mjq a();

    public final synchronized void a(String str, String str2) {
        this.a.remove(mfb.a(str, str2));
    }

    public final synchronized void a(String str, String str2, gqb gqb) {
        this.a.put(mfb.a(str, str2), gqb);
        b(str, str2);
    }

    private synchronized void b(String str, String str2) {
        gqb c = c(str, str2);
        if (c != null) {
            c.a(a());
        }
    }

    private synchronized gqb c(String str, String str2) {
        return (gqb) this.a.get(mfb.a(str, str2));
    }
}
