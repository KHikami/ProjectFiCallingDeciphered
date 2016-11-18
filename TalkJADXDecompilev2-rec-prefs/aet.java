package p000;

import android.os.Bundle;
import android.view.View;

final class aet extends lt {
    final /* synthetic */ aes f456a;

    aet(aes aes) {
        this.f456a = aes;
    }

    public void mo13a(View view, ql qlVar) {
        super.mo13a(view, qlVar);
        if (!this.f456a.f454a.m3108v() && this.f456a.f454a.m3072c() != null) {
            this.f456a.f454a.m3072c().m433a(view, qlVar);
        }
    }

    public boolean mo109a(View view, int i, Bundle bundle) {
        if (super.mo109a(view, i, bundle)) {
            return true;
        }
        if (this.f456a.f454a.m3108v() || this.f456a.f454a.m3072c() == null) {
            return false;
        }
        return this.f456a.f454a.m3072c().m443a(view, i, bundle);
    }
}
