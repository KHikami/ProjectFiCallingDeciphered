import android.os.RemoteException;

public final class hpt {
    private final hqm a;

    public hpt(hqm hqm) {
        this.a = (hqm) gwb.L((Object) hqm);
    }

    public void a() {
        try {
            this.a.g();
        } catch (RemoteException e) {
            throw new dt(e);
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof hpt)) {
            return false;
        }
        try {
            return this.a.a(((hpt) obj).a);
        } catch (RemoteException e) {
            throw new dt(e);
        }
    }

    public int hashCode() {
        try {
            return this.a.k();
        } catch (RemoteException e) {
            throw new dt(e);
        }
    }
}
