package p000;

import java.util.ArrayList;
import java.util.List;

public final class fpn extends fpl {
    private static final long serialVersionUID = 1;
    private final int f13693d;

    public fpn(lqg lqg, int i, long j, lru lru) {
        int i2;
        super(lqg, i, j);
        switch (Integer.parseInt(lru.f26276a.toString())) {
            case 1:
                i2 = 1;
                break;
            case 2:
                i2 = 2;
                break;
            case 3:
                i2 = 3;
                break;
            default:
                i2 = 0;
                break;
        }
        this.f13693d = i2;
    }

    public List<edo> mo2063f() {
        List<edo> arrayList = new ArrayList();
        arrayList.add(this.b);
        return arrayList;
    }

    public int m15911d() {
        return this.f13693d;
    }

    protected void mo2062b(blo blo, fhc fhc) {
        new flf(this).m15629b(blo);
    }
}
