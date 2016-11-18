package defpackage;

import java.net.URI;
import java.util.List;
import java.util.Map;

public class ojt<ReqT, RespT> extends okn<ReqT, RespT> {
    public ojo<ReqT, RespT> a;
    public final /* synthetic */ ojn b;
    public final /* synthetic */ olh c;
    public final /* synthetic */ omd d;

    public ojt(ojo<ReqT, RespT> ojo_ReqT__RespT) {
        this.a = ojo_ReqT__RespT;
    }

    public final ojo<ReqT, RespT> b() {
        return this.a;
    }

    public final void a(ojp<RespT> ojp_RespT, okw okw) {
        try {
            b(ojp_RespT, okw);
        } catch (Throwable e) {
            this.a = ojr.a;
            ojp_RespT.a(olv.a(e), new okw());
        }
    }

    public void b(ojp<RespT> ojp_RespT, okw okw) {
        okw okw2;
        URI a = this.d.a(this.b, this.c);
        synchronized (this.d) {
            Map a2 = this.d.a(a);
            if (this.d.b == null || this.d.b != a2) {
                this.d.b = a2;
                omd omd = this.d;
                Map map = this.d.b;
                okw okw3 = new okw();
                if (map != null) {
                    for (String str : map.keySet()) {
                        olf a3 = olf.a(str, okw.b);
                        for (String str2 : (List) map.get(str2)) {
                            okw3.a(a3, str2);
                        }
                    }
                }
                omd.a = okw3;
            }
            okw2 = this.d.a;
        }
        okw.a(okw2);
        this.a.a((ojp) ojp_RespT, okw);
    }

    public ojt(omd omd, ojo ojo, ojn ojn, olh olh) {
        this.d = omd;
        this.b = ojn;
        this.c = olh;
        this(ojo);
    }
}
