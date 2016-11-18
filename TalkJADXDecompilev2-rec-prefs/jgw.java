package p000;

import android.content.Context;

public abstract class jgw {
    public final Context f4844c;
    public final ed f4845d;
    public boolean f4846e;

    public abstract void mo794a(String str);

    public abstract void mo795a(String str, String str2, String str3, boolean z);

    public abstract boolean mo796a(jgz jgz);

    public jgw(Context context, ed edVar) {
        this.f4844c = context;
        this.f4845d = edVar;
    }

    public void m7029a(jgc jgc) {
        m7030a(jgc, false);
    }

    public void m7030a(jgc jgc, boolean z) {
        String b = jgc.mo649b(this.f4844c);
        if (b == null) {
            b = jgc.m6408g();
        }
        jgc.m6410i();
        jgc.m6409h();
        mo795a(b, null, jgc.m6411j(), false);
    }

    public boolean m7033b() {
        return this.f4846e;
    }

    public void m7031a(boolean z) {
        this.f4846e = z;
    }
}
