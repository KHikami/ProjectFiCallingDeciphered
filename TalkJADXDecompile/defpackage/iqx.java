package defpackage;

import android.os.SystemClock;
import android.text.TextUtils;

/* renamed from: iqx */
final class iqx implements ijl<lzc> {
    final /* synthetic */ iqw a;

    iqx(iqw iqw) {
        this.a = iqw;
    }

    public /* synthetic */ void a(nzf nzf) {
        b((lzc) nzf);
    }

    public /* synthetic */ void b(nzf nzf) {
        a((lzc) nzf);
    }

    private void a(lzc lzc) {
        if (this.a.e) {
            itx.b("vclib", "Resolve flow canceled, ignoring error (%s)", lzc);
        } else if (lzc == null || gwb.a(lzc.b, -1) != 1) {
            itx.c("vclib", "Resolve flow failed (%s)", lzc);
            this.a.b.b(lzc);
        } else if (iqw.b(this.a.a)) {
            if (this.a.d < 0) {
                this.a.d = SystemClock.elapsedRealtime() + 30000;
            }
            if (SystemClock.elapsedRealtime() >= this.a.d) {
                itx.a(6, "vclib", "Knocking resolve flow timed out");
                this.a.b.b(lzc);
                return;
            }
            this.a.c.postDelayed(this.a, 5000);
        } else {
            itx.c("vclib", "Resolve flow failed (%s)", lzc);
            this.a.b.b(lzc);
        }
    }

    private void b(lzc lzc) {
        if (this.a.e) {
            itx.a("vclib", "Resolve flow canceled, ignoring success (%s)", lzc);
        } else if (TextUtils.isEmpty(lzc.a)) {
            itx.c("vclib", "Hangout ID missing in successful resolve response (%s)", lzc);
            iil.a("Hangout ID missing in successful resolve response");
            this.a.b.b(lzc);
        } else {
            itx.a("vclib", "Successfully resolved hangout (%s)", lzc);
            this.a.b.a(lzc);
        }
    }
}
