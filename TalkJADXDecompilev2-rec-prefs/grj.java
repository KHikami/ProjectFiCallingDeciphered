package p000;

import android.content.Context;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public final class grj implements bhm {
    grm f15958a;
    jcf f15959b;
    grt f15960c;
    private final String f15961d;
    private final String f15962e;
    private final int f15963f;

    public grj(String str, String str2, int i) {
        this.f15961d = str;
        this.f15962e = str2;
        this.f15963f = i;
    }

    public int mo539a(Context context, bhb bhb) {
        this.f15958a = ((grq) jyn.m25426a(context, grq.class)).mo2324a(context);
        this.f15959b = (jcf) jyn.m25426a(context, jcf.class);
        this.f15960c = ((grv) jyn.m25426a(context, grv.class)).mo2325a(context);
        long currentTimeMillis = System.currentTimeMillis();
        try {
            this.f15958a.m18345a().mo2508a(1000, TimeUnit.MILLISECONDS);
            if (this.f15958a.m18345a().mo2524e()) {
                bko b = grm.m18339b(this.f15958a.m18354f());
                Map hashMap = new HashMap();
                ArrayList a = this.f15960c.m18372a(b.m5638g(), this.f15962e, this.f15963f, hashMap);
                hxz hxz = new hxz();
                hxz.m21223a("7", this.f15962e);
                hxz.m21224a("16", a);
                this.f15958a.m18351c().m21246a(this.f15958a.m18345a(), this.f15961d, "/hangouts/rpc/more_messages/", hxz.m21230a()).mo2418a();
                this.f15958a.m18348a(b, hashMap, null);
                if (glk.m17973a("BabelSendMoreMessages", 2)) {
                    new StringBuilder(54).append("WearableService.sendMoreMessages: ").append(System.currentTimeMillis() - currentTimeMillis);
                }
                this.f15958a.m18353e();
                return bhn.f3348a;
            }
            Log.e("BabelSendMoreMessages", "GoogleApiClient failed to connect");
            int i = bhn.f3351d;
            return i;
        } finally {
            this.f15958a.m18353e();
        }
    }
}
