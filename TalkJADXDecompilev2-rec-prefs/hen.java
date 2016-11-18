package p000;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

final class hen implements hfy {
    final /* synthetic */ hel f16752a;

    hen(hel hel) {
        this.f16752a = hel;
    }

    public void mo2489a(int i, boolean z) {
        this.f16752a.f16743g.lock();
        try {
            if (this.f16752a.f16742f) {
                this.f16752a.f16742f = false;
                hel.m19498a(this.f16752a, i, z);
                return;
            }
            this.f16752a.f16742f = true;
            this.f16752a.f16737a.m19635a(i);
            this.f16752a.f16743g.unlock();
        } finally {
            this.f16752a.f16743g.unlock();
        }
    }

    public void mo2490a(Bundle bundle) {
        this.f16752a.f16743g.lock();
        try {
            this.f16752a.f16741e = ConnectionResult.f7256a;
            hel.m19497a(this.f16752a);
        } finally {
            this.f16752a.f16743g.unlock();
        }
    }

    public void mo2491a(ConnectionResult connectionResult) {
        this.f16752a.f16743g.lock();
        try {
            this.f16752a.f16741e = connectionResult;
            hel.m19497a(this.f16752a);
        } finally {
            this.f16752a.f16743g.unlock();
        }
    }
}
