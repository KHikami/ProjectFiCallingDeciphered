package p000;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ojz {
    static final Logger f28734a = Logger.getLogger(ojz.class.getName());
    public static final ojz f28735b = new ojz(null);
    private static final Object[][] f28736c = ((Object[][]) Array.newInstance(Object.class, new int[]{0, 2}));
    private static final oke<okg> f28737d = new oke("deadline");
    private static final ThreadLocal<ojz> f28738e = new oka();
    private final ojz f28739f = null;
    private final Object[][] f28740g;
    private final boolean f28741h;
    private ArrayList<okd> f28742i;
    private okc f28743j = new okf(this);
    private final boolean f28744k;

    public static ojz m33476a() {
        ojz ojz = (ojz) f28738e.get();
        if (ojz == null) {
            return f28735b;
        }
        return ojz;
    }

    private ojz(ojz ojz) {
        Object[][] objArr = new Object[1][];
        objArr[0] = new Object[]{f28737d, null};
        this.f28740g = objArr;
        this.f28741h = false;
        this.f28744k = false;
    }

    public ojz m33481b() {
        ojz a = ojz.m33476a();
        f28738e.set(this);
        return a;
    }

    public void m33478a(ojz ojz) {
        bm.m6123a((Object) ojz, (Object) "toAttach");
        if (ojz.m33481b() != this) {
            f28734a.log(Level.SEVERE, "Context was not attached when detaching", new Throwable().fillInStackTrace());
        }
    }

    public boolean m33482c() {
        if (this.f28739f == null || !this.f28741h) {
            return false;
        }
        return this.f28739f.m33482c();
    }

    public Throwable m33483d() {
        if (this.f28739f == null || !this.f28741h) {
            return null;
        }
        return this.f28739f.m33483d();
    }

    public okg m33484e() {
        return (okg) f28737d.a(this);
    }

    public void m33480a(okc okc, Executor executor) {
        bm.m6123a((Object) okc, (Object) "cancellationListener");
        bm.m6123a((Object) executor, (Object) "executor");
        if (this.f28744k) {
            okd okd = new okd(this, executor, okc);
            synchronized (this) {
                if (m33482c()) {
                    okd.a();
                } else if (this.f28742i == null) {
                    this.f28742i = new ArrayList();
                    this.f28742i.add(okd);
                    this.f28739f.m33480a(this.f28743j, gwb.aT());
                } else {
                    this.f28742i.add(okd);
                }
            }
        }
    }

    public void m33479a(okc okc) {
        if (this.f28744k) {
            synchronized (this) {
                if (this.f28742i != null) {
                    for (int size = this.f28742i.size() - 1; size >= 0; size--) {
                        if (((okd) this.f28742i.get(size)).a == okc) {
                            this.f28742i.remove(size);
                            break;
                        }
                    }
                    if (this.f28742i.isEmpty()) {
                        this.f28739f.m33479a(this.f28743j);
                        this.f28742i = null;
                    }
                }
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    void m33485f() {
        int i = 0;
        if (this.f28744k) {
            synchronized (this) {
                if (this.f28742i == null) {
                } else {
                    ArrayList arrayList = this.f28742i;
                    this.f28742i = null;
                }
            }
        }
    }

    Object m33477a(oke<?> oke_) {
        while (true) {
            for (int i = 0; i < this.f28740g.length; i++) {
                if (oke_.equals(this.f28740g[i][0])) {
                    return this.f28740g[i][1];
                }
            }
            if (this.f28739f == null) {
                return null;
            }
            this = this.f28739f;
        }
    }
}
