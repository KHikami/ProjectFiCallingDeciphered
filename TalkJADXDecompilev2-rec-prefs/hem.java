package p000;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

final class hem implements hfy {
    final /* synthetic */ hel f16751a;

    hem(hel hel) {
        this.f16751a = hel;
    }

    public void mo2489a(int i, boolean z) {
        this.f16751a.f16743g.lock();
        try {
            if (this.f16751a.f16742f || this.f16751a.f16741e == null || !this.f16751a.f16741e.m9653b()) {
                this.f16751a.f16742f = false;
                hel.m19498a(this.f16751a, i, z);
                return;
            }
            this.f16751a.f16742f = true;
            this.f16751a.f16738b.m19635a(i);
            this.f16751a.f16743g.unlock();
        } finally {
            this.f16751a.f16743g.unlock();
        }
    }

    public void mo2490a(Bundle bundle) {
        this.f16751a.f16743g.lock();
        try {
            hel hel = this.f16751a;
            if (hel.f16739c == null) {
                hel.f16739c = bundle;
            } else if (bundle != null) {
                hel.f16739c.putAll(bundle);
            }
            this.f16751a.f16740d = ConnectionResult.f7256a;
            hel.m19497a(this.f16751a);
        } finally {
            this.f16751a.f16743g.unlock();
        }
    }

    public void mo2491a(ConnectionResult connectionResult) {
        this.f16751a.f16743g.lock();
        try {
            this.f16751a.f16740d = connectionResult;
            hel.m19497a(this.f16751a);
        } finally {
            this.f16751a.f16743g.unlock();
        }
    }
}
