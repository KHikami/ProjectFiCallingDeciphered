package defpackage;

import android.text.TextUtils;
import android.util.Log;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/* renamed from: cra */
public final class cra extends cql {
    public String a;
    public int b;
    public String c;
    private int d;
    private String e;
    private boolean f;
    private boolean g;

    public cra() {
        this(false);
    }

    private cra(boolean z) {
        UUID randomUUID = UUID.randomUUID();
        int leastSignificantBits = (int) (randomUUID.getLeastSignificantBits() & 2147483647L);
        if (leastSignificantBits == 0) {
            leastSignificantBits = (int) (randomUUID.getMostSignificantBits() & 2147483647L);
            if (leastSignificantBits == 0) {
                Log.e("GAv4", "UUID.randomUUID() returned 0.");
                leastSignificantBits = Integer.MAX_VALUE;
            }
        }
        this(false, leastSignificantBits);
    }

    private cra(boolean z, int i) {
        buf.A(i);
        this.b = i;
        this.g = z;
    }

    public final /* synthetic */ void a(cql cql) {
        cra cra = (cra) cql;
        if (!TextUtils.isEmpty(this.a)) {
            cra.a = this.a;
        }
        if (this.b != 0) {
            cra.b = this.b;
        }
        if (this.d != 0) {
            cra.d = this.d;
        }
        if (!TextUtils.isEmpty(this.e)) {
            cra.e = this.e;
        }
        if (!TextUtils.isEmpty(this.c)) {
            Object obj = this.c;
            if (TextUtils.isEmpty(obj)) {
                cra.c = null;
            } else {
                cra.c = obj;
            }
        }
        if (this.f) {
            cra.f = this.f;
        }
        if (this.g) {
            cra.g = this.g;
        }
    }

    public final String toString() {
        Map hashMap = new HashMap();
        hashMap.put("screenName", this.a);
        hashMap.put("interstitial", Boolean.valueOf(this.f));
        hashMap.put("automatic", Boolean.valueOf(this.g));
        hashMap.put("screenId", Integer.valueOf(this.b));
        hashMap.put("referrerScreenId", Integer.valueOf(this.d));
        hashMap.put("referrerScreenName", this.e);
        hashMap.put("referrerUri", this.c);
        return cql.a((Object) hashMap);
    }
}
