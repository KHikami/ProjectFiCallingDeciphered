import android.content.Context;

public abstract class jgw {
    public final Context c;
    public final ed d;
    public boolean e;

    public abstract void a(String str);

    public abstract void a(String str, String str2, String str3, boolean z);

    public abstract boolean a(jgz jgz);

    public jgw(Context context, ed edVar) {
        this.c = context;
        this.d = edVar;
    }

    public void a(jgc jgc) {
        a(jgc, false);
    }

    public void a(jgc jgc, boolean z) {
        String b = jgc.b(this.c);
        if (b == null) {
            b = jgc.g();
        }
        jgc.i();
        jgc.h();
        a(b, null, jgc.j(), false);
    }

    public boolean b() {
        return this.e;
    }

    public void a(boolean z) {
        this.e = z;
    }
}
