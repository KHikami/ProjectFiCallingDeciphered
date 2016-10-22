package defpackage;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.logging.Level;
import java.util.logging.Logger;
import oka;
import okc;
import okd;
import oke;
import okf;
import okg;

/* renamed from: ojz */
public class ojz {
    static final Logger a;
    public static final ojz b;
    private static final Object[][] c;
    private static final oke<okg> d;
    private static final ThreadLocal<ojz> e;
    private final ojz f;
    private final Object[][] g;
    private final boolean h;
    private ArrayList<okd> i;
    private okc j;
    private final boolean k;

    static {
        a = Logger.getLogger(ojz.class.getName());
        c = (Object[][]) Array.newInstance(Object.class, new int[]{0, 2});
        d = new oke("deadline");
        b = new ojz(null);
        e = new oka();
    }

    public static ojz a() {
        ojz ojz = (ojz) e.get();
        if (ojz == null) {
            return b;
        }
        return ojz;
    }

    private ojz(ojz ojz) {
        this.j = new okf(this);
        this.f = null;
        Object[][] objArr = new Object[1][];
        objArr[0] = new Object[]{d, null};
        this.g = objArr;
        this.h = false;
        this.k = false;
    }

    public ojz b() {
        ojz a = ojz.a();
        e.set(this);
        return a;
    }

    public void a(ojz ojz) {
        bm.a((Object) ojz, (Object) "toAttach");
        if (ojz.b() != this) {
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

    public okg e() {
        return (okg) d.a(this);
    }

    public void a(okc okc, Executor executor) {
        bm.a((Object) okc, (Object) "cancellationListener");
        bm.a((Object) executor, (Object) "executor");
        if (this.k) {
            okd okd = new okd(this, executor, okc);
            synchronized (this) {
                if (c()) {
                    okd.a();
                } else if (this.i == null) {
                    this.i = new ArrayList();
                    this.i.add(okd);
                    this.f.a(this.j, gwb.aT());
                } else {
                    this.i.add(okd);
                }
            }
        }
    }

    public void a(okc okc) {
        if (this.k) {
            synchronized (this) {
                if (this.i != null) {
                    for (int size = this.i.size() - 1; size >= 0; size--) {
                        if (((okd) this.i.get(size)).a == okc) {
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

    void f() {
        int i = 0;
        if (this.k) {
            synchronized (this) {
                if (this.i == null) {
                    return;
                }
                ArrayList arrayList = this.i;
                this.i = null;
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    if (!(((okd) arrayList.get(i2)).a instanceof okf)) {
                        ((okd) arrayList.get(i2)).a();
                    }
                }
                while (i < arrayList.size()) {
                    if (((okd) arrayList.get(i)).a instanceof okf) {
                        ((okd) arrayList.get(i)).a();
                    }
                    i++;
                }
                this.f.a(this.j);
            }
        }
    }

    Object a(oke<?> oke_) {
        while (true) {
            for (int i = 0; i < this.g.length; i++) {
                if (oke_.equals(this.g[i][0])) {
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
