package p000;

import android.content.Context;
import android.content.Intent;
import com.google.android.apps.hangouts.requestwriter.RequestWriter;

public class cnz extends fhb implements bhi, bhm {
    private final String f5740a;
    private final long f5741b;

    public cnz(bko bko, String str, long j) {
        super(bko);
        this.f5740a = str;
        this.f5741b = j;
    }

    public int mo539a(Context context, bhb bhb) {
        blo blo = new blo(gwb.m1400H(), this.f5736c.f12721a);
        blo.m5958a();
        try {
            m8046a(context, blo);
            if (this.f5740a != null) {
                blf.m5821d(blo, this.f5740a);
            }
            blo.m6015b();
            return bhn.f3348a;
        } finally {
            blo.m6028c();
        }
    }

    boolean m8047a(int i, fwx fwx) {
        if (gwb.m2237h(i) || fwx == fwx.QUEUED || fwx == fwx.SENDING || fwx == fwx.UPLOADING || fwx == fwx.AWAIT_READY) {
            return true;
        }
        return false;
    }

    boolean m8048b(int i, fwx fwx) {
        return !gwb.m2237h(i) && fwx == fwx.ON_SERVER;
    }

    void m8046a(Context context, blo blo) {
        bme b = blo.m6009b(this.f5741b);
        if (b == null) {
            blf.m5771a(blo, this.f5741b);
        } else if (m8048b(b.f3950x, b.f3932f)) {
            blo.m5910C();
        } else if (m8047a(b.f3950x, b.f3932f)) {
            blo.m6047e(this.f5740a, this.f5741b);
            ((bhl) jyn.m25426a(context, bhl.class)).mo552a(new bhc(b.f3927a));
            Intent n = RequestWriter.m9149n();
            String str = b.f3927a;
            long j = this.f5741b;
            String valueOf = String.valueOf(this.f5736c.f12722b.m5629a());
            String str2 = this.f5740a;
            n.putExtra("cancel_request", new StringBuilder(((String.valueOf(str).length() + 23) + String.valueOf(valueOf).length()) + String.valueOf(str2).length()).append(str).append("|").append(j).append("|").append(valueOf).append("|").append(str2).toString());
            gwb.m1400H().startService(n);
        } else {
            blf.m5771a(blo, this.f5741b);
        }
    }
}
