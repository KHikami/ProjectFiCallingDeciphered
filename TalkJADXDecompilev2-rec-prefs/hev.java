package p000;

import com.google.android.gms.common.ConnectionResult;
import java.util.Map;

final class hev extends hfc {
    final /* synthetic */ hes f16786a;
    private final Map<gug, heu> f16787c;

    public hev(hes hes, Map<gug, heu> map) {
        this.f16786a = hes;
        super(hes);
        this.f16787c = map;
    }

    public void mo2501a() {
        Object obj;
        Object obj2 = null;
        for (gug gug : this.f16787c.keySet()) {
            obj = 1;
            if (((heu) this.f16787c.get(gug)).f16782a == 0) {
                break;
            }
            int i = 1;
        }
        obj = obj2;
        int a = obj != null ? this.f16786a.f16763d.mo2334a(this.f16786a.f16762c) : 0;
        if (a != 0) {
            this.f16786a.f16760a.m19639a(new hew(this, this.f16786a, new ConnectionResult(a, null)));
            return;
        }
        if (this.f16786a.f16765f) {
            this.f16786a.f16764e.mo3044j();
        }
        for (gug gug2 : this.f16787c.keySet()) {
            gvu gvu = (gvu) this.f16787c.get(gug2);
            if (a != 0) {
                this.f16786a.f16760a.m19639a(new hex(this, this.f16786a, gvu));
            } else {
                gug2.m18612a(gvu);
            }
        }
    }
}
