package defpackage;

import android.content.ContentProviderClient;
import android.content.Context;
import com.google.android.gms.location.internal.LocationRequestUpdateData;
import java.util.HashMap;
import java.util.Map;

public final class hjz {
    private final hkg<hjt> a;
    private final Context b;
    private ContentProviderClient c = null;
    private boolean d = false;
    private Map<Object, hkb> e = new HashMap();
    private Map<Object, hka> f = new HashMap();

    public hjz(Context context, hkg<hjt> hkg_hjt) {
        this.b = context;
        this.a = hkg_hjt;
    }

    private void a(boolean z) {
        this.a.b();
        ((hjt) this.a.a()).a(false);
        this.d = false;
    }

    public void a() {
        try {
            synchronized (this.e) {
                for (hkb hkb : this.e.values()) {
                    if (hkb != null) {
                        ((hjt) this.a.a()).a(new LocationRequestUpdateData(1, 2, null, hkb.asBinder(), null, null, null));
                    }
                }
                this.e.clear();
            }
            synchronized (this.f) {
                for (hka hka : this.f.values()) {
                    if (hka != null) {
                        ((hjt) this.a.a()).a(new LocationRequestUpdateData(1, 2, null, null, null, hka.asBinder(), null));
                    }
                }
                this.f.clear();
            }
        } catch (Throwable e) {
            throw new IllegalStateException(e);
        }
    }

    public void b() {
        if (this.d) {
            try {
                a(false);
            } catch (Throwable e) {
                throw new IllegalStateException(e);
            }
        }
    }
}
