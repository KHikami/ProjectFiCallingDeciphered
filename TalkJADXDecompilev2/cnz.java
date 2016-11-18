package defpackage;

import android.content.Context;
import android.content.Intent;
import com.google.android.apps.hangouts.requestwriter.RequestWriter;

public class cnz extends fhb implements bhi, bhm {
    private final String a;
    private final long b;

    public cnz(bko bko, String str, long j) {
        super(bko);
        this.a = str;
        this.b = j;
    }

    public int a(Context context, bhb bhb) {
        blo blo = new blo(gwb.H(), this.c.a);
        blo.a();
        try {
            a(context, blo);
            if (this.a != null) {
                blf.d(blo, this.a);
            }
            blo.b();
            return bhn.a;
        } finally {
            blo.c();
        }
    }

    boolean a(int i, fwx fwx) {
        if (gwb.h(i) || fwx == fwx.QUEUED || fwx == fwx.SENDING || fwx == fwx.UPLOADING || fwx == fwx.AWAIT_READY) {
            return true;
        }
        return false;
    }

    boolean b(int i, fwx fwx) {
        return !gwb.h(i) && fwx == fwx.ON_SERVER;
    }

    void a(Context context, blo blo) {
        bme b = blo.b(this.b);
        if (b == null) {
            blf.a(blo, this.b);
        } else if (b(b.x, b.f)) {
            blo.C();
        } else if (a(b.x, b.f)) {
            blo.e(this.a, this.b);
            ((bhl) jyn.a(context, bhl.class)).a(new bhc(b.a));
            Intent n = RequestWriter.n();
            String str = b.a;
            long j = this.b;
            String valueOf = String.valueOf(this.c.b.a());
            String str2 = this.a;
            n.putExtra("cancel_request", new StringBuilder(((String.valueOf(str).length() + 23) + String.valueOf(valueOf).length()) + String.valueOf(str2).length()).append(str).append("|").append(j).append("|").append(valueOf).append("|").append(str2).toString());
            gwb.H().startService(n);
        } else {
            blf.a(blo, this.b);
        }
    }
}
