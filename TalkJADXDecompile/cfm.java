import android.text.TextUtils;
import java.util.Locale;
import java.util.Map.Entry;

final class cfm extends iiq<Void, Void, Void> {
    int a;
    final /* synthetic */ cdr b;
    private final ky<String, cgc> c;
    private final bko d;
    private final String e;

    cfm(cdr cdr) {
        this.b = cdr;
        this.a = 0;
        this.c = new ky(this.b.aP);
        this.d = this.b.av;
        this.e = this.b.aG;
    }

    protected /* synthetic */ Object a(Object[] objArr) {
        return b();
    }

    protected /* synthetic */ void onPostExecute(Object obj) {
        a();
    }

    private void a() {
        if (this.a > 1) {
            throw new IllegalStateException("merged more than one hangouts conversation");
        }
    }

    private Void b() {
        blo blo = new blo(this.b.context, this.d.g());
        for (Entry key : this.c.entrySet()) {
            String str = (String) key.getKey();
            bls f = blo.f(str);
            if (f != null) {
                glk.e("Babel", String.format(Locale.US, "possibly invalid merge detected: %s ==> %s (computed merge key %s)", new Object[]{key.getKey(), key.getValue(), blo.a(f)}), new Object[0]);
                if (!(blo.a(str) || !gwb.j(f.c) || TextUtils.equals(r5, this.e))) {
                    this.a++;
                }
            }
        }
        glk.e("Babel", "counted " + this.a + " non-GV, server-based, conversations", new Object[0]);
        return null;
    }
}
