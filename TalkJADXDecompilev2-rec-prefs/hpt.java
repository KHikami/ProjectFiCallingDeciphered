package p000;

import android.os.RemoteException;

public final class hpt {
    private final hqm f17120a;

    public hpt(hqm hqm) {
        this.f17120a = (hqm) gwb.m1419L((Object) hqm);
    }

    public void m20440a() {
        try {
            this.f17120a.mo2899g();
        } catch (RemoteException e) {
            throw new dt(e);
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof hpt)) {
            return false;
        }
        try {
            return this.f17120a.mo2888a(((hpt) obj).f17120a);
        } catch (RemoteException e) {
            throw new dt(e);
        }
    }

    public int hashCode() {
        try {
            return this.f17120a.mo2903k();
        } catch (RemoteException e) {
            throw new dt(e);
        }
    }
}
