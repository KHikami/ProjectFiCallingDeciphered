package p000;

import android.content.ContentProviderClient;
import android.content.Context;
import com.google.android.gms.location.internal.LocationRequestUpdateData;
import java.util.HashMap;
import java.util.Map;

public final class hjz {
    private final hkg<hjt> f17048a;
    private final Context f17049b;
    private ContentProviderClient f17050c = null;
    private boolean f17051d = false;
    private Map<Object, hkb> f17052e = new HashMap();
    private Map<Object, hka> f17053f = new HashMap();

    public hjz(Context context, hkg<hjt> hkg_hjt) {
        this.f17049b = context;
        this.f17048a = hkg_hjt;
    }

    private void m19984a(boolean z) {
        this.f17048a.m20000b();
        ((hjt) this.f17048a.m19999a()).mo2587a(false);
        this.f17051d = false;
    }

    public void m19985a() {
        try {
            synchronized (this.f17052e) {
                for (hkb hkb : this.f17052e.values()) {
                    if (hkb != null) {
                        ((hjt) this.f17048a.m19999a()).mo2582a(new LocationRequestUpdateData(1, 2, null, hkb.asBinder(), null, null, null));
                    }
                }
                this.f17052e.clear();
            }
            synchronized (this.f17053f) {
                for (hka hka : this.f17053f.values()) {
                    if (hka != null) {
                        ((hjt) this.f17048a.m19999a()).mo2582a(new LocationRequestUpdateData(1, 2, null, null, null, hka.asBinder(), null));
                    }
                }
                this.f17053f.clear();
            }
        } catch (Throwable e) {
            throw new IllegalStateException(e);
        }
    }

    public void m19986b() {
        if (this.f17051d) {
            try {
                m19984a(false);
            } catch (Throwable e) {
                throw new IllegalStateException(e);
            }
        }
    }
}
