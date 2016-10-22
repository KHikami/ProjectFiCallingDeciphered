package defpackage;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

/* renamed from: bsa */
final class bsa implements bti {
    private /* synthetic */ brz a;

    bsa(brz brz) {
        this.a = brz;
    }

    public final void a(int i, boolean z) {
        this.a.g.lock();
        try {
            if (this.a.f || this.a.e == null || !this.a.e.b()) {
                this.a.f = false;
                brz.a(this.a, i, z);
                return;
            }
            this.a.f = true;
            this.a.b.a(i);
            this.a.g.unlock();
        } finally {
            this.a.g.unlock();
        }
    }

    public final void a(Bundle bundle) {
        this.a.g.lock();
        try {
            brz brz = this.a;
            if (brz.c == null) {
                brz.c = bundle;
            } else if (bundle != null) {
                brz.c.putAll(bundle);
            }
            this.a.d = ConnectionResult.a;
            brz.a(this.a);
        } finally {
            this.a.g.unlock();
        }
    }

    public final void a(ConnectionResult connectionResult) {
        this.a.g.lock();
        try {
            this.a.d = connectionResult;
            brz.a(this.a);
        } finally {
            this.a.g.unlock();
        }
    }
}
