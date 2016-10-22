package defpackage;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

/* renamed from: hen */
final class hen implements hfy {
    final /* synthetic */ hel a;

    hen(hel hel) {
        this.a = hel;
    }

    public void a(int i, boolean z) {
        this.a.g.lock();
        try {
            if (this.a.f) {
                this.a.f = false;
                hel.a(this.a, i, z);
                return;
            }
            this.a.f = true;
            this.a.a.a(i);
            this.a.g.unlock();
        } finally {
            this.a.g.unlock();
        }
    }

    public void a(Bundle bundle) {
        this.a.g.lock();
        try {
            this.a.e = ConnectionResult.a;
            hel.a(this.a);
        } finally {
            this.a.g.unlock();
        }
    }

    public void a(ConnectionResult connectionResult) {
        this.a.g.lock();
        try {
            this.a.e = connectionResult;
            hel.a(this.a);
        } finally {
            this.a.g.unlock();
        }
    }
}
