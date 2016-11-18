package p000;

import android.text.TextUtils;
import java.util.Locale;
import java.util.Map.Entry;

final class cfm extends iiq<Void, Void, Void> {
    int f5184a = 0;
    final /* synthetic */ cdr f5185b;
    private final ky<String, cgc> f5186c = new ky(this.f5185b.aP);
    private final bko f5187d = this.f5185b.av;
    private final String f5188e = this.f5185b.aG;

    cfm(cdr cdr) {
        this.f5185b = cdr;
    }

    protected /* synthetic */ Object mo470a(Object[] objArr) {
        return m7489b();
    }

    protected /* synthetic */ void onPostExecute(Object obj) {
        m7488a();
    }

    private void m7488a() {
        if (this.f5184a > 1) {
            throw new IllegalStateException("merged more than one hangouts conversation");
        }
    }

    private Void m7489b() {
        blo blo = new blo(this.f5185b.context, this.f5187d.m5638g());
        for (Entry key : this.f5186c.entrySet()) {
            String str = (String) key.getKey();
            bls f = blo.m6050f(str);
            if (f != null) {
                glk.m17982e("Babel", String.format(Locale.US, "possibly invalid merge detected: %s ==> %s (computed merge key %s)", new Object[]{key.getKey(), key.getValue(), blo.m5949a(f)}), new Object[0]);
                if (!(blo.m5871a(str) || !gwb.m2267j(f.f3757c) || TextUtils.equals(r5, this.f5188e))) {
                    this.f5184a++;
                }
            }
        }
        glk.m17982e("Babel", "counted " + this.f5184a + " non-GV, server-based, conversations", new Object[0]);
        return null;
    }
}
