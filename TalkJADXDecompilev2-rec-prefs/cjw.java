package p000;

import android.content.Intent;
import android.net.Uri;

final class cjw implements jej {
    final /* synthetic */ cjv f5478a;

    cjw(cjv cjv) {
        this.f5478a = cjv;
    }

    public void mo747a(int i, Intent intent) {
        if (i != -1 || intent == null) {
            ((cnh) this.f5478a.binder.m25443a(cnh.class)).m7967a(2328);
            return;
        }
        Uri b = gwb.m1982b(intent);
        if (b != null) {
            int i2;
            Intent a;
            boolean d = ba.m4630d(this.f5478a.getContext().getContentResolver().getType(b));
            cnh cnh = (cnh) this.f5478a.binder.m25443a(cnh.class);
            if (d) {
                i2 = 2327;
            } else {
                i2 = 2326;
            }
            cnh.m7967a(i2);
            if (d) {
                a = chs.m7667a(this.f5478a.context, b, "video/*", false);
            } else {
                a = chs.m7668a(this.f5478a.context, b, false);
            }
            this.f5478a.f5469a.m24035a(gwb.lD, a);
        }
    }
}
