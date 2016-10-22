import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.data.DataHolder;
import java.util.Collection;
import java.util.HashMap;

public final class hvm extends gwg<hve> {
    private static volatile Bundle i;
    private static volatile Bundle j;
    public final String e;
    public final String f;
    public final Context g;
    private final HashMap<hsi, hvw> h;
    private Long k;

    public hvm(Context context, Looper looper, guk guk, gul gul, String str, gwa gwa) {
        super(context.getApplicationContext(), looper, 5, gwa, guk, gul);
        this.h = new HashMap();
        this.k = null;
        this.g = context;
        this.e = str;
        this.f = gwa.f();
    }

    private synchronized void a(Bundle bundle) {
        if (bundle != null) {
            huo.n = bundle.getBoolean("use_contactables_api", true);
            hvl.a.a(bundle);
            i = bundle.getBundle("config.email_type_map");
            j = bundle.getBundle("config.phone_type_map");
        }
    }

    private static PendingIntent b(Bundle bundle) {
        return bundle == null ? null : (PendingIntent) bundle.getParcelable("pendingIntent");
    }

    private hve i() {
        return (hve) super.p();
    }

    private void r() {
        super.n();
    }

    public gws a(hec<hse> hec_hse, long j) {
        gws gws = null;
        r();
        hvb hvp = new hvp(hec_hse);
        try {
            gws = i().b(hvp, j, true);
        } catch (RemoteException e) {
            hvp.a(8, gws, gws, gws);
        }
        return gws;
    }

    public gws a(hec<hse> hec_hse, String str, String str2, int i) {
        gws gws = null;
        Object hvp = new hvp(hec_hse);
        try {
            gws = i().c(hvp, str, str2, 0);
        } catch (RemoteException e) {
            hvp.a(8, gws, gws, gws);
        }
        return gws;
    }

    public gws a(hec<hse> hec_hse, String str, String str2, int i, int i2) {
        hvb hvp = new hvp(hec_hse);
        try {
            return i().b(hvp, str, str2, i, i2);
        } catch (RemoteException e) {
            hvp.a(8, null, null, null);
            return null;
        }
    }

    public hvw a(gui gui, hsi hsi) {
        hvw hvw;
        synchronized (this.h) {
            if (this.h.containsKey(hsi)) {
                hvw = (hvw) this.h.get(hsi);
            } else {
                hvw = new hvw(gui.a((Object) hsi));
                this.h.put(hsi, hvw);
            }
        }
        return hvw;
    }

    public void a() {
        synchronized (this.h) {
            if (b()) {
                for (hvb hvb : this.h.values()) {
                    hvb.a();
                    try {
                        i().a(hvb, false, null, null, 0);
                    } catch (Throwable e) {
                        gwb.a("PeopleClient", "Failed to unregister listener", e);
                    } catch (Throwable e2) {
                        gwb.a("PeopleClient", "PeopleService is in unexpected state", e2);
                    }
                }
            }
            this.h.clear();
        }
        super.a();
    }

    protected void a(int i, IBinder iBinder, Bundle bundle, int i2) {
        if (i == 0 && bundle != null) {
            a(bundle.getBundle("post_init_configuration"));
        }
        super.a(i, iBinder, bundle == null ? null : bundle.getBundle("post_init_resolution"), i2);
    }

    public void a(hec<hsb> hec_hsb, String str, String str2, hsa hsa) {
        if (hsa == null) {
            hsa = hsa.a;
        }
        String a = hsa.a();
        Collection b = hsa.b();
        int c = hsa.c();
        boolean d = hsa.d();
        long e = hsa.e();
        String f = hsa.f();
        int g = hsa.g();
        int h = hsa.h();
        int i = hsa.i();
        r();
        hvb hvq = new hvq(hec_hsb);
        try {
            i().a(hvq, str, str2, a, gwb.c(b), c, d, e, f, g, h, i);
        } catch (RemoteException e2) {
            hvq.a(8, null, null);
        }
    }

    public void a(hec<hrx> hec_hrx, String str, String str2, boolean z, String str3, boolean z2, int i, int i2, String str4, boolean z3, int i3) {
        int i4;
        huo hut;
        r();
        if (i3 == 0 || !TextUtils.isEmpty(str3)) {
            i4 = i3;
        } else {
            gwb.k("PeopleClient", "Ignoring custom sort order for all aggregation.");
            i4 = 0;
        }
        Context context = this.a;
        hus hus = new hus(hec_hrx);
        Bundle bundle = i;
        Bundle bundle2 = j;
        if (TextUtils.isEmpty(str3)) {
            hut = new hut(context, hus, z, i2, bundle, bundle2, str4);
        } else if (TextUtils.isEmpty(str4)) {
            hut = new huu(context, hus, z, i2, bundle, bundle2, str3);
        } else {
            throw new IllegalArgumentException("Search aggregation doesn't support filtering by gaia-id");
        }
        hvb hvv = new hvv(hut);
        try {
            i().a(hvv, str, str2, str3, 7, z2, i, i2, str4, z3, i4, 3);
        } catch (RemoteException e) {
            hvv.a(8, null, null);
        }
        hut.b();
    }

    public void a(hec<hrz> hec_hrz, boolean z, boolean z2, String str, String str2, int i) {
        r();
        hvb hvo = new hvo(hec_hrz);
        try {
            i().a(hvo, false, z2, null, null, i);
        } catch (RemoteException e) {
            hvo.a(8, null, null);
        }
    }

    public void a(hsi hsi) {
        synchronized (this.h) {
            try {
                r();
                if (this.h.containsKey(hsi)) {
                    hvb hvb = (hvw) this.h.get(hsi);
                    hvb.a();
                    i().a(hvb, false, null, null, 0);
                    this.h.remove(hsi);
                    return;
                }
            } finally {
                this.h.remove(hsi);
            }
        }
    }

    public void a(hvw hvw, String str, String str2, int i) {
        r();
        synchronized (this.h) {
            i().a((hvb) hvw, true, str, str2, i);
        }
    }

    public void a(String str, String str2, long j, boolean z, boolean z2) {
        r();
        i().a(str, str2, j, z, z2);
    }

    protected String g() {
        return "com.google.android.gms.people.service.START";
    }

    protected String h() {
        return "com.google.android.gms.people.internal.IPeopleService";
    }

    protected Bundle m() {
        Bundle bundle = new Bundle();
        bundle.putString("social_client_application_id", this.e);
        bundle.putString("real_client_package_name", this.f);
        bundle.putBoolean("support_new_image_callback", true);
        return bundle;
    }

    protected /* synthetic */ IInterface a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.people.internal.IPeopleService");
        return (queryLocalInterface == null || !(queryLocalInterface instanceof hve)) ? new hvg(iBinder) : (hve) queryLocalInterface;
    }

    static /* synthetic */ hwq a(DataHolder dataHolder) {
        return dataHolder == null ? null : new hwq(dataHolder, new huf(j), new hue(i));
    }
}
