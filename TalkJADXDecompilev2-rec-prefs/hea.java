package p000;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import java.util.Set;

public final class hea extends heg<gut> {
    private int f16728a;
    private boolean f16729b;

    private gut m19473a(Status status) {
        gut gus;
        synchronized (null) {
            try {
                ky kyVar;
                ConnectionResult connectionResult = new ConnectionResult(8);
                int i = 0;
                while (true) {
                    kyVar = null;
                    if (i >= kyVar.size()) {
                        break;
                    }
                    kyVar = null;
                    m19474a((hdx) kyVar.m28017b(i), connectionResult);
                    i++;
                }
                kyVar = null;
                gus = kyVar.size() == 1 ? new gus(status, null) : new gut(status, null);
            } catch (Throwable th) {
            }
        }
        return gus;
    }

    public void m19474a(hdx<?> hdx_, ConnectionResult connectionResult) {
        synchronized (null) {
            ky kyVar = null;
            try {
                kyVar.put(hdx_, connectionResult);
                this.f16728a--;
                boolean b = connectionResult.m9653b();
                if (!b) {
                    this.f16729b = b;
                }
                if (this.f16728a == 0) {
                    Status status = this.f16729b ? new Status(13) : Status.f7264a;
                    kyVar = null;
                    m18974a(kyVar.size() == 1 ? new gus(status, null) : new gut(status, null));
                }
            } finally {
            }
        }
    }

    protected /* synthetic */ gup mo2424b(Status status) {
        return m19473a(status);
    }

    public Set<hdx<?>> mo2422c() {
        ky kyVar = null;
        return kyVar.keySet();
    }
}
