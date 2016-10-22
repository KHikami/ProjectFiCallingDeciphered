package defpackage;

import android.content.Intent;
import com.google.android.apps.hangouts.requestwriter.RequestWriter;

/* renamed from: fet */
public final class fet extends fhb {
    private final long[] a;

    public fet(bko bko, long[] jArr) {
        super(bko);
        this.a = jArr;
    }

    public void w_() {
        blo blo = new blo(gwb.H(), this.c.a);
        blo.a();
        try {
            for (long j : this.a) {
                Object obj;
                Object obj2;
                Object obj3;
                bme b = blo.b(j);
                String str = null;
                if (b != null) {
                    String str2 = b.b;
                    String str3;
                    if (gwb.h(b.x)) {
                        str3 = str2;
                        obj = 1;
                        obj2 = null;
                        obj3 = 1;
                        str = str3;
                    } else {
                        Object obj4;
                        obj3 = (b.f == fwx.QUEUED || b.f == fwx.SENDING || b.f == fwx.UPLOADING || b.f == fwx.AWAIT_READY) ? 1 : null;
                        obj2 = b.f == fwx.ON_SERVER ? 1 : null;
                        if (obj3 == null && obj2 == null) {
                            obj4 = 1;
                        } else {
                            obj4 = null;
                        }
                        str3 = str2;
                        obj = obj4;
                        str = str3;
                    }
                } else {
                    obj2 = null;
                    obj3 = null;
                    int i = 1;
                }
                if (obj3 != null) {
                    blo.e(str, j);
                    Intent n = RequestWriter.n();
                    String str4 = b.a;
                    String valueOf = String.valueOf(this.c.b.a());
                    n.putExtra("cancel_request", new StringBuilder(((String.valueOf(str4).length() + 23) + String.valueOf(valueOf).length()) + String.valueOf(str).length()).append(str4).append("|").append(j).append("|").append(valueOf).append("|").append(str).toString());
                    gwb.H().startService(n);
                }
                if (obj2 != null) {
                    blo.C();
                }
                if (obj != null) {
                    blf.a(blo, j);
                }
                if (str != null) {
                    blf.d(blo, str);
                }
            }
            blo.b();
        } finally {
            blo.c();
        }
    }
}
