import android.util.Log;
import java.util.Map;

final class jkr extends ld<jtw, jkj> {
    final /* synthetic */ jkp a;

    jkr(jkp jkp, int i) {
        this.a = jkp;
        super(i);
    }

    protected /* bridge */ /* synthetic */ void a(boolean z, Object obj, Object obj2, Object obj3) {
        a(z, (jtw) obj, (jkj) obj2);
    }

    protected /* synthetic */ int b(Object obj, Object obj2) {
        return ((jkj) obj2).j();
    }

    private void a(boolean z, jtw jtw, jkj jkj) {
        if (z) {
            if (jkj.p()) {
                String valueOf = String.valueOf(jtw);
                new StringBuilder(String.valueOf(valueOf).length() + 26).append("Evicted image from cache: ").append(valueOf);
                if (Log.isLoggable("ImageResourceManager", 2)) {
                    Map g = g();
                    for (jtw jtw2 : g.keySet()) {
                        String valueOf2 = String.valueOf(jtw2);
                        new StringBuilder(String.valueOf(valueOf2).length() + 26).append("   id: ").append(valueOf2).append("; size: ").append(((jkj) g.get(jtw2)).j());
                    }
                }
            }
            jkj.i();
        }
    }
}
