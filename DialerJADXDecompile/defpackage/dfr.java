package defpackage;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* renamed from: dfr */
public class dfr {
    static final Logger a;
    static final Object[][] b;
    static final dfx c;
    public static final dfr d;
    private static final ThreadLocal e;
    private final dfr f;
    private final Object[][] g;
    private final boolean h;
    private ArrayList i;
    private dfv j;
    private final boolean k;

    static {
        a = Logger.getLogger(dfr.class.getName());
        b = (Object[][]) Array.newInstance(Object.class, new int[]{0, 2});
        c = new dfx("deadline");
        d = new dfr(null);
        e = new dfs();
    }

    public static dfr a() {
        dfr dfr = (dfr) e.get();
        if (dfr == null) {
            return d;
        }
        return dfr;
    }

    private dfr(dfr dfr) {
        this.j = new dfy(this);
        this.f = null;
        Object[][] objArr = new Object[1][];
        objArr[0] = new Object[]{c, null};
        this.g = objArr;
        this.h = false;
        this.k = false;
    }

    dfr(dfr dfr, Object[][] objArr) {
        boolean z = true;
        this.j = new dfy(this);
        this.f = dfr;
        this.g = objArr;
        this.h = true;
        if (this.f == null || !this.f.k) {
            z = false;
        }
        this.k = z;
    }

    dfr(dfr dfr, Object[][] objArr, boolean z) {
        this.j = new dfy(this);
        this.f = dfr;
        this.g = objArr;
        this.h = true;
        this.k = z;
    }

    public dfr b() {
        dfr a = dfr.a();
        e.set(this);
        return a;
    }

    public void a(dfr dfr) {
        cob.i((Object) dfr);
        if (dfr.b() != this) {
            a.log(Level.SEVERE, "Context was not attached when detaching", new Throwable().fillInStackTrace());
        }
    }

    public boolean c() {
        if (this.f == null || !this.h) {
            return false;
        }
        return this.f.c();
    }

    public Throwable d() {
        if (this.f == null || !this.h) {
            return null;
        }
        return this.f.d();
    }

    public final dfz e() {
        return (dfz) c.a(this);
    }

    public final void a(dfv dfv, Executor executor) {
        cob.i((Object) dfv);
        cob.i((Object) executor);
        if (this.k) {
            dfw dfw = new dfw(this, executor, dfv);
            synchronized (this) {
                if (c()) {
                    dfw.a();
                } else if (this.i == null) {
                    this.i = new ArrayList();
                    this.i.add(dfw);
                    this.f.a(this.j, buf.I());
                } else {
                    this.i.add(dfw);
                }
            }
        }
    }

    public final void a(dfv dfv) {
        if (this.k) {
            synchronized (this) {
                if (this.i != null) {
                    for (int size = this.i.size() - 1; size >= 0; size--) {
                        if (((dfw) this.i.get(size)).a == dfv) {
                            this.i.remove(size);
                            break;
                        }
                    }
                    if (this.i.isEmpty()) {
                        this.f.a(this.j);
                        this.i = null;
                    }
                }
            }
        }
    }

    final void f() {
        int i = 0;
        if (this.k) {
            synchronized (this) {
                if (this.i == null) {
                    return;
                }
                ArrayList arrayList = this.i;
                this.i = null;
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    if (!(((dfw) arrayList.get(i2)).a instanceof dfy)) {
                        ((dfw) arrayList.get(i2)).a();
                    }
                }
                while (i < arrayList.size()) {
                    if (((dfw) arrayList.get(i)).a instanceof dfy) {
                        ((dfw) arrayList.get(i)).a();
                    }
                    i++;
                }
                this.f.a(this.j);
            }
        }
    }

    final Object a(dfx dfx) {
        while (true) {
            for (int i = 0; i < this.g.length; i++) {
                if (dfx.equals(this.g[i][0])) {
                    return this.g[i][1];
                }
            }
            if (this.f == null) {
                return null;
            }
            this = this.f;
        }
    }
}
