import android.content.ContentProviderClient;
import android.content.Context;
import com.google.android.gms.location.internal.LocationRequestUpdateData;
import java.util.HashMap;
import java.util.Map;

public final class hjz {
    private final hkg<hjt> a;
    private final Context b;
    private ContentProviderClient c;
    private boolean d;
    private Map<Object, hkb> e;
    private Map<Object, hka> f;

    public hjz(Context context, hkg<hjt> hkg_hjt) {
        this.c = null;
        this.d = false;
        this.e = new HashMap();
        this.f = new HashMap();
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
