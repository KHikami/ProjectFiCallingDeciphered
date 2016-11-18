package defpackage;

import android.content.Context;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public final class grj implements bhm {
    grm a;
    jcf b;
    grt c;
    private final String d;
    private final String e;
    private final int f;

    public grj(String str, String str2, int i) {
        this.d = str;
        this.e = str2;
        this.f = i;
    }

    public int a(Context context, bhb bhb) {
        this.a = ((grq) jyn.a(context, grq.class)).a(context);
        this.b = (jcf) jyn.a(context, jcf.class);
        this.c = ((grv) jyn.a(context, grv.class)).a(context);
        long currentTimeMillis = System.currentTimeMillis();
        try {
            this.a.a().a(1000, TimeUnit.MILLISECONDS);
            if (this.a.a().e()) {
                bko b = grm.b(this.a.f());
                Map hashMap = new HashMap();
                ArrayList a = this.c.a(b.g(), this.e, this.f, hashMap);
                hxz hxz = new hxz();
                hxz.a("7", this.e);
                hxz.a("16", a);
                this.a.c().a(this.a.a(), this.d, "/hangouts/rpc/more_messages/", hxz.a()).a();
                this.a.a(b, hashMap, null);
                if (glk.a("BabelSendMoreMessages", 2)) {
                    new StringBuilder(54).append("WearableService.sendMoreMessages: ").append(System.currentTimeMillis() - currentTimeMillis);
                }
                this.a.e();
                return bhn.a;
            }
            Log.e("BabelSendMoreMessages", "GoogleApiClient failed to connect");
            int i = bhn.d;
            return i;
        } finally {
            this.a.e();
        }
    }
}
