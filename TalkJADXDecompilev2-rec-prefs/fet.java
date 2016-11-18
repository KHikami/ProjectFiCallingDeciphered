package p000;

import android.content.Intent;
import com.google.android.apps.hangouts.requestwriter.RequestWriter;

public final class fet extends fhb {
    private final long[] f12938a;

    public fet(bko bko, long[] jArr) {
        super(bko);
        this.f12938a = jArr;
    }

    public void w_() {
        blo blo = new blo(gwb.m1400H(), this.f5736c.f12721a);
        blo.m5958a();
        try {
            for (long j : this.f12938a) {
                Object obj;
                Object obj2;
                Object obj3;
                bme b = blo.m6009b(j);
                String str = null;
                if (b != null) {
                    String str2 = b.f3928b;
                    String str3;
                    if (gwb.m2237h(b.f3950x)) {
                        str3 = str2;
                        obj = 1;
                        obj2 = null;
                        obj3 = 1;
                        str = str3;
                    } else {
                        Object obj4;
                        obj3 = (b.f3932f == fwx.QUEUED || b.f3932f == fwx.SENDING || b.f3932f == fwx.UPLOADING || b.f3932f == fwx.AWAIT_READY) ? 1 : null;
                        obj2 = b.f3932f == fwx.ON_SERVER ? 1 : null;
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
                    blo.m6047e(str, j);
                    Intent n = RequestWriter.m9149n();
                    String str4 = b.f3927a;
                    String valueOf = String.valueOf(this.f5736c.f12722b.m5629a());
                    n.putExtra("cancel_request", new StringBuilder(((String.valueOf(str4).length() + 23) + String.valueOf(valueOf).length()) + String.valueOf(str).length()).append(str4).append("|").append(j).append("|").append(valueOf).append("|").append(str).toString());
                    gwb.m1400H().startService(n);
                }
                if (obj2 != null) {
                    blo.m5910C();
                }
                if (obj != null) {
                    blf.m5771a(blo, j);
                }
                if (str != null) {
                    blf.m5821d(blo, str);
                }
            }
            blo.m6015b();
        } finally {
            blo.m6028c();
        }
    }
}
