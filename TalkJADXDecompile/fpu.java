import java.util.ArrayList;
import java.util.List;

public final class fpu extends fpl {
    private static final long serialVersionUID = 1;
    private final int d;
    private final int u;
    private final int v;
    private final int w;

    public fpu(lqg lqg, int i, long j, ltq ltq) {
        super(lqg, i, j);
        this.d = gwb.a(ltq.a);
        this.u = gwb.a(ltq.b);
        this.v = gwb.a(ltq.c, 1);
        this.w = gwb.a(ltq.d, 1);
    }

    public List<edo> f() {
        List<edo> arrayList = new ArrayList();
        arrayList.add(this.b);
        return arrayList;
    }

    public int d() {
        return this.d;
    }

    public int e() {
        return this.u;
    }

    public int g() {
        return this.w;
    }

    protected void b(blo blo, fhc fhc) {
        new flh(this).b(blo);
    }
}
