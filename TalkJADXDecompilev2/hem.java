package defpackage;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

final class hem implements hfy {
    final /* synthetic */ hel a;

    hem(hel hel) {
        this.a = hel;
    }

    public void a(int i, boolean z) {
        this.a.g.lock();
        try {
            if (this.a.f || this.a.e == null || !this.a.e.b()) {
                this.a.f = false;
                hel.a(this.a, i, z);
                return;
            }
            this.a.f = true;
            this.a.b.a(i);
            this.a.g.unlock();
        } finally {
            this.a.g.unlock();
        }
    }

    public void a(Bundle bundle) {
        this.a.g.lock();
        try {
            hel hel = this.a;
            if (hel.c == null) {
                hel.c = bundle;
            } else if (bundle != null) {
                hel.c.putAll(bundle);
            }
            this.a.d = ConnectionResult.a;
            hel.a(this.a);
        } finally {
            this.a.g.unlock();
        }
    }

    public void a(ConnectionResult connectionResult) {
        this.a.g.lock();
        try {
            this.a.d = connectionResult;
            hel.a(this.a);
        } finally {
            this.a.g.unlock();
        }
    }
}
