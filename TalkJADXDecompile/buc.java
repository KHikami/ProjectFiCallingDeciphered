import android.view.ViewGroup;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class buc extends ady<aer> {
    private final dr b;
    private final bvc c;
    private final bto d;
    private wt<btf> e;
    private int f;
    private final Map<aer, Void> g;
    private boolean h;
    private boolean i;

    public buc(dr drVar) {
        this.g = new ky();
        this.b = drVar;
        this.c = new bvc(drVar.getContext());
        this.d = (bto) jyn.a(drVar.getContext(), bto.class);
        a(true);
    }

    public void a(wt<btf> wtVar) {
        boolean z;
        boolean z2 = true;
        if (this.e == null) {
            z = true;
        } else {
            z = false;
        }
        ba.b(z, (Object) "Must be called only once.");
        if (wtVar == null) {
            z2 = false;
        }
        ba.a(z2, (Object) "MessageList must be valid.");
        this.e = wtVar;
        this.f = wtVar.a();
    }

    public int a() {
        return (e() ? 1 : 0) + c();
    }

    public int a(int i) {
        if (i >= c()) {
            return -1;
        }
        if (i == 0) {
            return -2;
        }
        return this.c.a(((btf) this.e.a(i - 1)).i);
    }

    public long b(int i) {
        if (i >= c()) {
            return -1;
        }
        if (i == 0) {
            return -2;
        }
        return ((btf) this.e.a(i - 1)).a;
    }

    private int c() {
        if (d()) {
            return this.e.a() + 1;
        }
        return this.e.a();
    }

    private boolean d() {
        return this.e.a() > 0;
    }

    public aer a(ViewGroup viewGroup, int i) {
        switch (i) {
            case -2:
                return new btv(this.b.getContext(), viewGroup);
            case -1:
                return new bud(this.b.getContext(), viewGroup);
            default:
                return this.c.a(this.b, viewGroup, i);
        }
    }

    public void a(aer aer, int i) {
        if (!(aer instanceof bud)) {
            if (i == 0) {
                ((btv) aer).a(this.d.a(((btf) this.e.a(0)).g, Long.MAX_VALUE));
            } else {
                List emptyList;
                int i2 = i - 1;
                btf btf = (btf) this.e.a(i2);
                bwd bwd = (bwd) aer;
                if (i2 == 0) {
                    emptyList = Collections.emptyList();
                } else {
                    emptyList = this.d.a(btf.g, ((btf) this.e.a(i2 - 1)).g);
                }
                bwd.a(btf, emptyList);
            }
            this.g.put(aer, null);
        }
    }

    public void a(aer aer) {
        super.a(aer);
        if (!(aer instanceof bud)) {
            this.g.remove(aer);
        }
    }

    public void b(aer aer) {
        super.b(aer);
        if (aer instanceof bwd) {
            ((bwd) aer).w();
        }
    }

    private boolean e() {
        return (this.h && this.i) ? false : true;
    }

    public void b(boolean z) {
        boolean e = e();
        this.h = z;
        boolean e2 = e();
        if (e != e2) {
            int c = c();
            if (e2) {
                new Object[1][0] = Integer.valueOf(c);
                d(c);
                return;
            }
            new Object[1][0] = Integer.valueOf(c);
            e(c);
        }
    }

    public void c(boolean z) {
        boolean e = e();
        this.i = z;
        boolean e2 = e();
        if (e != e2) {
            int c = c();
            if (e2) {
                new Object[1][0] = Integer.valueOf(c);
                d(c);
                return;
            }
            new Object[1][0] = Integer.valueOf(c);
            e(c);
        }
    }

    public void b() {
        for (aer e : this.g.keySet()) {
            int e2 = e.e();
            new Object[1][0] = Integer.valueOf(e2);
            a_(e2);
        }
    }

    public void f(int i) {
        Object[] objArr = new Object[]{Integer.valueOf(i), Integer.valueOf(i + 1)};
        a_(i + 1);
    }

    public void b(int i, Object obj) {
        Object[] objArr = new Object[]{Integer.valueOf(1), obj, Integer.valueOf(2), obj};
        a(2, obj);
    }

    public void e(int i, int i2) {
        Object[] objArr = new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i + 1), Integer.valueOf(i2 + 1)};
        b(i + 1, i2 + 1);
    }

    public void f(int i, int i2) {
        Object[] objArr = new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i + 1), Integer.valueOf(i2)};
        a(i + 1, i2);
    }

    public void g(int i, int i2) {
        Object[] objArr = new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i + 1), Integer.valueOf(i2)};
        f();
        c(i + 1, i2);
    }

    public void h(int i, int i2) {
        Object[] objArr = new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i + 1), Integer.valueOf(i2)};
        d(i + 1, i2);
        f();
    }

    public void d(boolean z) {
        if (d()) {
            Object[] objArr = new Object[]{Boolean.valueOf(z), Boolean.valueOf(z)};
            a(0, (Object) Boolean.valueOf(z));
        }
    }

    private void f() {
        int i = this.f;
        int a = this.e.a();
        this.f = a;
        if (i == 0 && a > 0) {
            d(0);
        } else if (i > 0 && a == 0) {
            e(0);
        }
    }
}
