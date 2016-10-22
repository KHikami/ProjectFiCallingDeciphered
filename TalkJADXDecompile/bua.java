import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.List;

public final class bua implements cpw {
    private final Context a;
    private final fwy b;
    private final boolean c;
    private final long d;
    private final int e;
    private final int f;
    private final long g;
    private final int h;
    private final int i;
    private final int j;
    private final long k;
    private final long l;
    private final String m;
    private final String n;
    private final ImageView o;
    private final List<cqc> p;

    public bua(btf btf, int i, View view) {
        this.b = btf.i;
        this.c = btf.i == fwy.OUTGOING_USER_MESSAGE;
        this.d = btf.g / 1000;
        this.f = btf.v.a;
        this.g = btf.v.b;
        this.h = btf.v.c;
        this.i = btf.p;
        this.j = btf.r;
        this.k = btf.v.d;
        this.l = this.k - this.g;
        this.m = btf.c;
        this.n = btf.b;
        this.e = i;
        this.o = (ImageView) view.findViewById(bm.e);
        this.a = view.getContext();
        this.p = jyn.c(this.a, cqc.class);
    }

    public Context a() {
        return this.a;
    }

    public boolean b() {
        return this.c;
    }

    public long c() {
        return this.d;
    }

    public int d() {
        return this.f;
    }

    public long e() {
        return this.g;
    }

    public int f() {
        return this.h;
    }

    public int g() {
        return this.i;
    }

    public int h() {
        return this.j;
    }

    public long i() {
        return this.k;
    }

    public long j() {
        return this.l;
    }

    public String k() {
        return this.m;
    }

    public String l() {
        return this.n;
    }

    public ImageView m() {
        return this.o;
    }

    public boolean n() {
        for (cqc a : this.p) {
            if (a.a(this)) {
                return true;
            }
        }
        return false;
    }

    public List<String> o() {
        List<String> arrayList = new ArrayList();
        for (cqc cqc : this.p) {
            if (cqc.a(this)) {
                arrayList.add(cqc.b(this));
            }
        }
        return arrayList;
    }
}
