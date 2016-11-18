package defpackage;

import android.content.Intent;
import android.net.Uri;

final class cjw implements jej {
    final /* synthetic */ cjv a;

    cjw(cjv cjv) {
        this.a = cjv;
    }

    public void a(int i, Intent intent) {
        if (i != -1 || intent == null) {
            ((cnh) this.a.binder.a(cnh.class)).a(2328);
            return;
        }
        Uri b = gwb.b(intent);
        if (b != null) {
            int i2;
            Intent a;
            boolean d = ba.d(this.a.getContext().getContentResolver().getType(b));
            cnh cnh = (cnh) this.a.binder.a(cnh.class);
            if (d) {
                i2 = 2327;
            } else {
                i2 = 2326;
            }
            cnh.a(i2);
            if (d) {
                a = chs.a(this.a.context, b, "video/*", false);
            } else {
                a = chs.a(this.a.context, b, false);
            }
            this.a.a.a(gwb.lD, a);
        }
    }
}
