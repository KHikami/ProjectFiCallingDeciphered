package p000;

import android.content.Intent;
import java.util.ArrayList;
import java.util.List;

public final class fov implements fqd {
    private static final long serialVersionUID = 1;
    private final List<fow> f13596a = new ArrayList();

    public fov(lnu lnu) {
        for (lnv lnv : lnu.f25826a) {
            this.f13596a.add(new fow(lnv.f25828a.f26403b, gwb.m1507a(lnv.f25829b)));
        }
    }

    public List<fow> m15833a() {
        return this.f13596a;
    }

    public void mo2060a(int i, mfa<Intent> mfa_android_content_Intent) {
        fhc fhc = new fhc();
        new fdu(this).m15100a(new blo(gwb.m1400H(), i));
        fhc.m15313c();
    }
}
