package defpackage;

import android.text.TextUtils;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

/* renamed from: fdt */
public final class fdt extends fhb {
    private final String a;
    private final String b;
    private final String g;
    private final boolean h;
    private final boolean i;

    public fdt(bko bko, String str, String str2, String str3, boolean z, boolean z2) {
        super(bko);
        this.a = str;
        this.b = str2;
        this.g = str3;
        this.h = z;
        this.i = z2;
    }

    public void w_() {
        blo blo = new blo(gwb.H(), this.c.a);
        if (!TextUtils.isEmpty(this.a)) {
            a(new etp(this.a, this.b, this.g, this.h, this.i));
        } else if (!TextUtils.isEmpty(this.b)) {
            blo.a(null, this.b, this.h);
            if (this.h) {
                blo.c(null, this.b, this.g, null);
            } else {
                blo.k(null, this.b);
            }
            if (j() >= 0) {
                RealTimeChatService.a(j(), this.c.b, new fiu(j(), 1, new eyp(new kmw())));
            }
        }
    }
}
