import java.util.ArrayList;
import java.util.List;

public final class fpn extends fpl {
    private static final long serialVersionUID = 1;
    private final int d;

    public fpn(lqg lqg, int i, long j, lru lru) {
        int i2;
        super(lqg, i, j);
        switch (Integer.parseInt(lru.a.toString())) {
            case wi.j /*1*/:
                i2 = 1;
                break;
            case wi.l /*2*/:
                i2 = 2;
                break;
            case wi.z /*3*/:
                i2 = 3;
                break;
            default:
                i2 = 0;
                break;
        }
        this.d = i2;
    }

    public List<edo> f() {
        List<edo> arrayList = new ArrayList();
        arrayList.add(this.b);
        return arrayList;
    }

    public int d() {
        return this.d;
    }

    protected void b(blo blo, fhc fhc) {
        new flf(this).b(blo);
    }
}
