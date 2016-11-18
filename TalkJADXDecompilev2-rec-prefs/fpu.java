package p000;

import java.util.ArrayList;
import java.util.List;

public final class fpu extends fpl {
    private static final long serialVersionUID = 1;
    private final int f13714d;
    private final int f13715u;
    private final int f13716v;
    private final int f13717w;

    public fpu(lqg lqg, int i, long j, ltq ltq) {
        super(lqg, i, j);
        this.f13714d = gwb.m1507a(ltq.f26397a);
        this.f13715u = gwb.m1507a(ltq.f26398b);
        this.f13716v = gwb.m1508a(ltq.f26399c, 1);
        this.f13717w = gwb.m1508a(ltq.f26400d, 1);
    }

    public List<edo> mo2063f() {
        List<edo> arrayList = new ArrayList();
        arrayList.add(this.b);
        return arrayList;
    }

    public int m15936d() {
        return this.f13714d;
    }

    public int m15937e() {
        return this.f13715u;
    }

    public int m15939g() {
        return this.f13717w;
    }

    protected void mo2062b(blo blo, fhc fhc) {
        new flh(this).m15635b(blo);
    }
}
