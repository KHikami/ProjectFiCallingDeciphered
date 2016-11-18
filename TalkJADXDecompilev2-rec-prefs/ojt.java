package p000;

import java.net.URI;
import java.util.List;
import java.util.Map;

public class ojt<ReqT, RespT> extends okn<ReqT, RespT> {
    public ojo<ReqT, RespT> f33105a;
    public final /* synthetic */ ojn f33106b;
    public final /* synthetic */ olh f33107c;
    public final /* synthetic */ omd f33108d;

    public ojt(ojo<ReqT, RespT> ojo_ReqT__RespT) {
        this.f33105a = ojo_ReqT__RespT;
    }

    public final ojo<ReqT, RespT> mo4153b() {
        return this.f33105a;
    }

    public final void mo4152a(ojp<RespT> ojp_RespT, okw okw) {
        try {
            m38603b(ojp_RespT, okw);
        } catch (Throwable e) {
            this.f33105a = ojr.f33104a;
            ojp_RespT.mo4162a(olv.a(e), new okw());
        }
    }

    public void m38603b(ojp<RespT> ojp_RespT, okw okw) {
        okw okw2;
        URI a = this.f33108d.m38711a(this.f33106b, this.f33107c);
        synchronized (this.f33108d) {
            Map a2 = this.f33108d.m38712a(a);
            if (this.f33108d.f33195b == null || this.f33108d.f33195b != a2) {
                this.f33108d.f33195b = a2;
                omd omd = this.f33108d;
                Map map = this.f33108d.f33195b;
                okw okw3 = new okw();
                if (map != null) {
                    for (String str : map.keySet()) {
                        olf a3 = olf.m38663a(str, okw.b);
                        for (String str2 : (List) map.get(str2)) {
                            okw3.a(a3, str2);
                        }
                    }
                }
                omd.f33194a = okw3;
            }
            okw2 = this.f33108d.f33194a;
        }
        okw.a(okw2);
        this.f33105a.mo4152a((ojp) ojp_RespT, okw);
    }

    public ojt(omd omd, ojo ojo, ojn ojn, olh olh) {
        this.f33108d = omd;
        this.f33106b = ojn;
        this.f33107c = olh;
        this(ojo);
    }
}
