package defpackage;

import android.os.Bundle;
import java.util.Set;

final class frn implements guk {
    final /* synthetic */ frm a;

    frn(frm frm) {
        this.a = frm;
    }

    public void a_(Bundle bundle) {
        synchronized (this.a.c) {
            if (frm.a) {
                new StringBuilder(87).append("GmsAvatarLoader: People client onConnected. waiting = ").append(this.a.e == null ? 0 : this.a.e.size()).append(" numClient=").append(this.a.d);
            }
            Set<fsr> set = this.a.e;
            this.a.e = null;
        }
        if (set != null) {
            for (fsr b : set) {
                this.a.b(b);
            }
        }
    }

    public void a(int i) {
    }
}
