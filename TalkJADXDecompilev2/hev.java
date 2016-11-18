package defpackage;

import com.google.android.gms.common.ConnectionResult;
import java.util.Map;

final class hev extends hfc {
    final /* synthetic */ hes a;
    private final Map<gug, heu> c;

    public hev(hes hes, Map<gug, heu> map) {
        this.a = hes;
        super(hes);
        this.c = map;
    }

    public void a() {
        Object obj;
        Object obj2 = null;
        for (gug gug : this.c.keySet()) {
            obj = 1;
            if (((heu) this.c.get(gug)).a == 0) {
                break;
            }
            int i = 1;
        }
        obj = obj2;
        int a = obj != null ? this.a.d.a(this.a.c) : 0;
        if (a != 0) {
            this.a.a.a(new hew(this, this.a, new ConnectionResult(a, null)));
            return;
        }
        if (this.a.f) {
            this.a.e.j();
        }
        for (gug gug2 : this.c.keySet()) {
            gvu gvu = (gvu) this.c.get(gug2);
            if (a != 0) {
                this.a.a.a(new hex(this, this.a, gvu));
            } else {
                gug2.a(gvu);
            }
        }
    }
}
