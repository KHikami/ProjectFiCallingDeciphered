package p000;

import java.util.HashMap;
import java.util.Map;

public abstract class gqa {
    private final Map<mfb<String, String>, gqb> f15892a = new HashMap();

    protected abstract mjq m18288a();

    public final synchronized void m18289a(String str, String str2) {
        this.f15892a.remove(mfb.m31979a(str, str2));
    }

    public final synchronized void m18290a(String str, String str2, gqb gqb) {
        this.f15892a.put(mfb.m31979a(str, str2), gqb);
        m18286b(str, str2);
    }

    private synchronized void m18286b(String str, String str2) {
        gqb c = m18287c(str, str2);
        if (c != null) {
            c.m18291a(m18288a());
        }
    }

    private synchronized gqb m18287c(String str, String str2) {
        return (gqb) this.f15892a.get(mfb.m31979a(str, str2));
    }
}
