package p000;

import android.text.TextUtils;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

public final class fdt extends fhb {
    private final String f12816a;
    private final String f12817b;
    private final String f12818g;
    private final boolean f12819h;
    private final boolean f12820i;

    public fdt(bko bko, String str, String str2, String str3, boolean z, boolean z2) {
        super(bko);
        this.f12816a = str;
        this.f12817b = str2;
        this.f12818g = str3;
        this.f12819h = z;
        this.f12820i = z2;
    }

    public void w_() {
        blo blo = new blo(gwb.m1400H(), this.f5736c.f12721a);
        if (!TextUtils.isEmpty(this.f12816a)) {
            m8039a(new etp(this.f12816a, this.f12817b, this.f12818g, this.f12819h, this.f12820i));
        } else if (!TextUtils.isEmpty(this.f12817b)) {
            blo.m5994a(null, this.f12817b, this.f12819h);
            if (this.f12819h) {
                blo.m6031c(null, this.f12817b, this.f12818g, null);
            } else {
                blo.m6078k(null, this.f12817b);
            }
            if (m8044j() >= 0) {
                RealTimeChatService.m8997a(m8044j(), this.f5736c.f12722b, new fiu(m8044j(), 1, new eyp(new kmw())));
            }
        }
    }
}
