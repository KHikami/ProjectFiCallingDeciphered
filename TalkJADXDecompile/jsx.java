import android.content.Context;
import android.os.Bundle;
import android.util.SparseArray;
import java.util.List;

final class jsx implements jsw, jtl, jza, kcj, kcm, kcq {
    final SparseArray<jtf> a;
    jti b;
    private jfd c;

    jsx(kbu kbu) {
        this.a = new SparseArray();
        kbu.a((kcq) this);
    }

    public jsw a(int i, jtf jtf) {
        if (this.a.get(i) != null) {
            throw new IllegalArgumentException("Cannot register more than one handler for a given  id: " + i);
        }
        new StringBuilder(21).append("register: ").append(i);
        this.a.put(i, jtf);
        return this;
    }

    public void a(jte jte, int i, List<String> list) {
        this.c.a(i);
        if (((jtf) this.a.get(i)) == null) {
            throw new IllegalStateException("You must register a result handler for request code " + i + " before requesting permissions with that request code");
        }
        this.b.a(jte, this.c.b(i), (List) list);
    }

    public void a(Context context, jyn jyn, Bundle bundle) {
        this.b = (jti) jyn.a(jti.class);
        this.c = (jfd) jyn.a(jfd.class);
    }

    public void R_() {
        this.b.a((jtl) this);
        this.c.a(new jsy(this));
    }

    public boolean a(jtc jtc) {
        return this.c.a(jtc.a, new jsz(this, jtc));
    }

    public void T_() {
        this.b.b((jtl) this);
    }
}
