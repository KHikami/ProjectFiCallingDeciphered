package p000;

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
    private static volatile Bundle f17357i;
    private static volatile Bundle f17358j;
    public final String f17359e;
    public final String f17360f;
    public final Context f17361g;
    private final HashMap<hsi, hvw> f17362h = new HashMap();
    private Long f17363k = null;

    public hvm(Context context, Looper looper, guk guk, gul gul, String str, gwa gwa) {
        super(context.getApplicationContext(), looper, 5, gwa, guk, gul);
        this.f17361g = context;
        this.f17359e = str;
        this.f17360f = gwa.m18760f();
    }

    private synchronized void m21073a(Bundle bundle) {
        if (bundle != null) {
            huo.f17315n = bundle.getBoolean("use_contactables_api", true);
            hvl.f17354a.m21069a(bundle);
            f17357i = bundle.getBundle("config.email_type_map");
            f17358j = bundle.getBundle("config.phone_type_map");
        }
    }

    private static PendingIntent m21074b(Bundle bundle) {
        return bundle == null ? null : (PendingIntent) bundle.getParcelable("pendingIntent");
    }

    private hve m21075i() {
        return (hve) super.m18714p();
    }

    private void m21076r() {
        super.m18712n();
    }

    public gws m21078a(hec<hse> hec_hse, long j) {
        gws gws = null;
        m21076r();
        hvb hvp = new hvp(hec_hse);
        try {
            gws = m21075i().mo3010b(hvp, j, true);
        } catch (RemoteException e) {
            hvp.mo2958a(8, gws, gws, gws);
        }
        return gws;
    }

    public gws m21079a(hec<hse> hec_hse, String str, String str2, int i) {
        gws gws = null;
        Object hvp = new hvp(hec_hse);
        try {
            gws = m21075i().mo3020c(hvp, str, str2, 0);
        } catch (RemoteException e) {
            hvp.mo2958a(8, gws, gws, gws);
        }
        return gws;
    }

    public gws m21080a(hec<hse> hec_hse, String str, String str2, int i, int i2) {
        hvb hvp = new hvp(hec_hse);
        try {
            return m21075i().mo3013b(hvp, str, str2, i, i2);
        } catch (RemoteException e) {
            hvp.mo2958a(8, null, null, null);
            return null;
        }
    }

    public hvw m21081a(gui gui, hsi hsi) {
        hvw hvw;
        synchronized (this.f17362h) {
            if (this.f17362h.containsKey(hsi)) {
                hvw = (hvw) this.f17362h.get(hsi);
            } else {
                hvw = new hvw(gui.mo2511a((Object) hsi));
                this.f17362h.put(hsi, hvw);
            }
        }
        return hvw;
    }

    public void mo2600a() {
        synchronized (this.f17362h) {
            if (m18702b()) {
                for (hvb hvb : this.f17362h.values()) {
                    hvb.m21114a();
                    try {
                        m21075i().mo2962a(hvb, false, null, null, 0);
                    } catch (Throwable e) {
                        gwb.m1870a("PeopleClient", "Failed to unregister listener", e);
                    } catch (Throwable e2) {
                        gwb.m1870a("PeopleClient", "PeopleService is in unexpected state", e2);
                    }
                }
            }
            this.f17362h.clear();
        }
        super.mo2600a();
    }

    protected void mo3023a(int i, IBinder iBinder, Bundle bundle, int i2) {
        if (i == 0 && bundle != null) {
            m21073a(bundle.getBundle("post_init_configuration"));
        }
        super.mo3023a(i, iBinder, bundle == null ? null : bundle.getBundle("post_init_resolution"), i2);
    }

    public void m21084a(hec<hsb> hec_hsb, String str, String str2, hsa hsa) {
        if (hsa == null) {
            hsa = hsa.f17153a;
        }
        String a = hsa.m20752a();
        Collection b = hsa.m20753b();
        int c = hsa.m20754c();
        boolean d = hsa.m20755d();
        long e = hsa.m20756e();
        String f = hsa.m20757f();
        int g = hsa.m20758g();
        int h = hsa.m20759h();
        int i = hsa.m20760i();
        m21076r();
        hvb hvq = new hvq(hec_hsb);
        try {
            m21075i().mo2998a(hvq, str, str2, a, gwb.m2090c(b), c, d, e, f, g, h, i);
        } catch (RemoteException e2) {
            hvq.mo2959a(8, null, null);
        }
    }

    public void m21085a(hec<hrx> hec_hrx, String str, String str2, boolean z, String str3, boolean z2, int i, int i2, String str4, boolean z3, int i3) {
        int i4;
        huo hut;
        m21076r();
        if (i3 == 0 || !TextUtils.isEmpty(str3)) {
            i4 = i3;
        } else {
            gwb.m2279k("PeopleClient", "Ignoring custom sort order for all aggregation.");
            i4 = 0;
        }
        Context context = this.f16215a;
        hus hus = new hus(hec_hrx);
        Bundle bundle = f17357i;
        Bundle bundle2 = f17358j;
        if (TextUtils.isEmpty(str3)) {
            hut = new hut(context, hus, z, i2, bundle, bundle2, str4);
        } else if (TextUtils.isEmpty(str4)) {
            hut = new huu(context, hus, z, i2, bundle, bundle2, str3);
        } else {
            throw new IllegalArgumentException("Search aggregation doesn't support filtering by gaia-id");
        }
        hvb hvv = new hvv(hut);
        try {
            m21075i().mo2990a(hvv, str, str2, str3, 7, z2, i, i2, str4, z3, i4, 3);
        } catch (RemoteException e) {
            hvv.mo2960a(8, null, null);
        }
        hut.m20886b();
    }

    public void m21086a(hec<hrz> hec_hrz, boolean z, boolean z2, String str, String str2, int i) {
        m21076r();
        hvb hvo = new hvo(hec_hrz);
        try {
            m21075i().mo3006a(hvo, false, z2, null, null, i);
        } catch (RemoteException e) {
            hvo.mo2959a(8, null, null);
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m21087a(hsi hsi) {
        synchronized (this.f17362h) {
            try {
                m21076r();
                if (this.f17362h.containsKey(hsi)) {
                    hvb hvb = (hvw) this.f17362h.get(hsi);
                    hvb.m21114a();
                    m21075i().mo2962a(hvb, false, null, null, 0);
                    this.f17362h.remove(hsi);
                }
            } finally {
                this.f17362h.remove(hsi);
            }
        }
    }

    public void m21088a(hvw hvw, String str, String str2, int i) {
        m21076r();
        synchronized (this.f17362h) {
            m21075i().mo2962a((hvb) hvw, true, str, str2, i);
        }
    }

    public void m21089a(String str, String str2, long j, boolean z, boolean z2) {
        m21076r();
        m21075i().mo2966a(str, str2, j, z, z2);
    }

    protected String mo2346g() {
        return "com.google.android.gms.people.service.START";
    }

    protected String mo2347h() {
        return "com.google.android.gms.people.internal.IPeopleService";
    }

    protected Bundle mo2560m() {
        Bundle bundle = new Bundle();
        bundle.putString("social_client_application_id", this.f17359e);
        bundle.putString("real_client_package_name", this.f17360f);
        bundle.putBoolean("support_new_image_callback", true);
        return bundle;
    }

    protected /* synthetic */ IInterface mo2345a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.people.internal.IPeopleService");
        return (queryLocalInterface == null || !(queryLocalInterface instanceof hve)) ? new hvg(iBinder) : (hve) queryLocalInterface;
    }

    static /* synthetic */ hwq m21072a(DataHolder dataHolder) {
        return dataHolder == null ? null : new hwq(dataHolder, new huf(f17358j), new hue(f17357i));
    }
}
