package p000;

import android.os.SystemClock;
import android.text.TextUtils;

final class iqx implements ijl<lzc> {
    final /* synthetic */ iqw f18736a;

    iqx(iqw iqw) {
        this.f18736a = iqw;
    }

    public /* synthetic */ void mo1431a(nzf nzf) {
        m22986b((lzc) nzf);
    }

    public /* synthetic */ void mo1432b(nzf nzf) {
        m22985a((lzc) nzf);
    }

    private void m22985a(lzc lzc) {
        if (this.f18736a.f18734e) {
            itx.m23287b("vclib", "Resolve flow canceled, ignoring error (%s)", lzc);
        } else if (lzc == null || gwb.m1508a(lzc.f26980b, -1) != 1) {
            itx.m23288c("vclib", "Resolve flow failed (%s)", lzc);
            this.f18736a.f18731b.mo1432b(lzc);
        } else if (iqw.m22981b(this.f18736a.f18730a)) {
            if (this.f18736a.f18733d < 0) {
                this.f18736a.f18733d = SystemClock.elapsedRealtime() + 30000;
            }
            if (SystemClock.elapsedRealtime() >= this.f18736a.f18733d) {
                itx.m23277a(6, "vclib", "Knocking resolve flow timed out");
                this.f18736a.f18731b.mo1432b(lzc);
                return;
            }
            this.f18736a.f18732c.postDelayed(this.f18736a, 5000);
        } else {
            itx.m23288c("vclib", "Resolve flow failed (%s)", lzc);
            this.f18736a.f18731b.mo1432b(lzc);
        }
    }

    private void m22986b(lzc lzc) {
        if (this.f18736a.f18734e) {
            itx.m23282a("vclib", "Resolve flow canceled, ignoring success (%s)", lzc);
        } else if (TextUtils.isEmpty(lzc.f26979a)) {
            itx.m23288c("vclib", "Hangout ID missing in successful resolve response (%s)", lzc);
            iil.m21870a("Hangout ID missing in successful resolve response");
            this.f18736a.f18731b.mo1432b(lzc);
        } else {
            itx.m23282a("vclib", "Successfully resolved hangout (%s)", lzc);
            this.f18736a.f18731b.mo1431a(lzc);
        }
    }
}
