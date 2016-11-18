package p000;

import android.content.Context;
import android.os.Bundle;
import android.util.SparseArray;
import java.util.List;

final class jsx implements jsw, jtl, jza, kcj, kcm, kcq {
    final SparseArray<jtf> f21013a = new SparseArray();
    jti f21014b;
    private jfd f21015c;

    jsx(kbu kbu) {
        kbu.m25514a((kcq) this);
    }

    public jsw mo3604a(int i, jtf jtf) {
        if (this.f21013a.get(i) != null) {
            throw new IllegalArgumentException("Cannot register more than one handler for a given  id: " + i);
        }
        new StringBuilder(21).append("register: ").append(i);
        this.f21013a.put(i, jtf);
        return this;
    }

    public void mo3605a(jte jte, int i, List<String> list) {
        this.f21015c.m24075a(i);
        if (((jtf) this.f21013a.get(i)) == null) {
            throw new IllegalStateException("You must register a result handler for request code " + i + " before requesting permissions with that request code");
        }
        this.f21014b.m25195a(jte, this.f21015c.m24080b(i), (List) list);
    }

    public void mo479a(Context context, jyn jyn, Bundle bundle) {
        this.f21014b = (jti) jyn.m25443a(jti.class);
        this.f21015c = (jfd) jyn.m25443a(jfd.class);
    }

    public void R_() {
        this.f21014b.m25196a((jtl) this);
        this.f21015c.m24078a(new jsy(this));
    }

    public boolean mo3606a(jtc jtc) {
        return this.f21015c.m24079a(jtc.f21019a, new jsz(this, jtc));
    }

    public void T_() {
        this.f21014b.m25198b((jtl) this);
    }
}
