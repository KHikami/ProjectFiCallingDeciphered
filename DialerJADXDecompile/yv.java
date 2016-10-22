import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
public abstract class yv {
    private ArrayList a;
    public yw h;
    long i;
    long j;
    long k;
    long l;

    public abstract void a();

    public abstract boolean a(zk zkVar, yx yxVar, yx yxVar2);

    public abstract boolean a(zk zkVar, zk zkVar2, yx yxVar, yx yxVar2);

    public abstract boolean b();

    public abstract boolean b(zk zkVar, yx yxVar, yx yxVar2);

    public abstract void c(zk zkVar);

    public abstract boolean c(zk zkVar, yx yxVar, yx yxVar2);

    public abstract void d();

    public yv() {
        this.h = null;
        this.a = new ArrayList();
        this.i = 120;
        this.j = 120;
        this.k = 250;
        this.l = 250;
    }

    public static int d(zk zkVar) {
        int i = zkVar.i & 14;
        if (zkVar.j()) {
            return 4;
        }
        if ((i & 4) != 0) {
            return i;
        }
        int i2 = zkVar.c;
        int d = zkVar.d();
        if (i2 == -1 || d == -1 || i2 == d) {
            return i;
        }
        return i | 2048;
    }

    public final void e(zk zkVar) {
        if (this.h != null) {
            this.h.a(zkVar);
        }
    }

    public boolean f(zk zkVar) {
        return true;
    }

    public boolean a(zk zkVar, List list) {
        return f(zkVar);
    }

    public final void e() {
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            this.a.get(i);
        }
        this.a.clear();
    }
}
