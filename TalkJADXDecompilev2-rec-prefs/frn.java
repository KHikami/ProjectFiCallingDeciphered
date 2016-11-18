package p000;

import android.os.Bundle;
import java.util.Set;

final class frn implements guk {
    final /* synthetic */ frm f13822a;

    frn(frm frm) {
        this.f13822a = frm;
    }

    public void a_(Bundle bundle) {
        synchronized (this.f13822a.f13818c) {
            if (frm.f13816a) {
                new StringBuilder(87).append("GmsAvatarLoader: People client onConnected. waiting = ").append(this.f13822a.f13820e == null ? 0 : this.f13822a.f13820e.size()).append(" numClient=").append(this.f13822a.f13819d);
            }
            Set<fsr> set = this.f13822a.f13820e;
            this.f13822a.f13820e = null;
        }
        if (set != null) {
            for (fsr b : set) {
                this.f13822a.m16052b(b);
            }
        }
    }

    public void mo1150a(int i) {
    }
}
