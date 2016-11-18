package p000;

import java.util.concurrent.CopyOnWriteArrayList;

public final class ius {
    final CopyOnWriteArrayList<iuq> f19068a;
    final lo<iuq, Boolean> f19069b;
    int f19070c;
    long f19071d;
    boolean f19072e;
    private final iui f19073f = iui.m23311a();
    private boolean f19074g;
    private final iur f19075h = new iut(this);
    private final iuk f19076i = new iuu(this);

    public ius(iuq... iuqArr) {
        this.f19068a = new CopyOnWriteArrayList(iuqArr);
        this.f19069b = new lo(iuqArr.length);
        this.f19070c = iuqArr.length;
        for (int i = 0; i < iuqArr.length; i++) {
            iuqArr[i].m23321a(this.f19075h);
            this.f19069b.put(iuqArr[i], Boolean.valueOf(true));
        }
    }

    public void m23327a() {
        if (!this.f19074g) {
            this.f19074g = true;
            this.f19071d = -1;
            m23329c();
        }
    }

    public void m23328b() {
        if (this.f19074g) {
            if (this.f19072e) {
                this.f19072e = false;
                this.f19073f.mo3401b(this.f19076i);
            }
            this.f19074g = false;
        }
    }

    void m23329c() {
        if (!this.f19072e && this.f19074g && this.f19070c != 0) {
            this.f19072e = true;
            this.f19073f.mo3400a(this.f19076i);
        }
    }
}
