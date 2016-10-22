package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;

/* renamed from: gdo */
public final class gdo {
    public final dhz a;
    public final String b;
    final long c;
    public final long d;
    final gcw e;
    public final int f;
    final boolean g;
    final gec h;

    public static gdo a(Bundle bundle) {
        gcw gcw = null;
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = (Bundle) bundle.getParcelable("com.google.android.apps.hangouts.telephony.hangout_info_bundle");
        if (bundle2 == null) {
            return null;
        }
        bundle2.setClassLoader(dhz.class.getClassLoader());
        dhz dhz = (dhz) bundle2.getParcelable("hangout_request");
        if (dhz == null) {
            return null;
        }
        String string = bundle2.getString("experiment_code");
        String string2 = bundle2.getString("experiment_flags");
        if (!(string == null && string2 == null)) {
            gcw = new gcw(string, string2);
        }
        return new gdo(dhz, bundle2.getString("inviter_phone_number"), bundle2.getLong("invitation_id"), bundle2.getLong("timestamp_millis"), gcw, bundle2.getInt("account_id"), bundle2.getBoolean("did_fallback_to_lte"), (gec) bundle2.getParcelable("network_status"));
    }

    public gdo(dhz dhz, String str, long j, long j2, gcw gcw, int i, boolean z, gec gec) {
        this.a = dhz;
        this.b = str;
        this.c = j;
        this.d = j2;
        this.e = gcw;
        this.f = i;
        this.g = z;
        this.h = gec;
    }

    public Bundle a() {
        Bundle bundle = new Bundle();
        String str = "com.google.android.apps.hangouts.telephony.hangout_info_bundle";
        Parcelable bundle2 = new Bundle();
        bundle2.putParcelable("hangout_request", this.a);
        bundle2.putString("inviter_phone_number", this.b);
        bundle2.putLong("invitation_id", this.c);
        bundle2.putLong("timestamp_millis", this.d);
        if (this.e != null) {
            bundle2.putString("experiment_code", this.e.a());
            bundle2.putString("experiment_flags", this.e.b());
        }
        bundle2.putInt("account_id", this.f);
        bundle2.putBoolean("did_fallback_to_lte", this.g);
        bundle2.putParcelable("network_status", this.h);
        bundle.putParcelable(str, bundle2);
        return bundle;
    }

    public gga b() {
        gga gga = new gga();
        if (this.a != null) {
            dhz dhz = this.a;
            gfy gfy = new gfy();
            if (!TextUtils.isEmpty(dhz.a())) {
                gfy.a = dhz.a();
            }
            gfy.j = dhz.m();
            if (!TextUtils.isEmpty(dhz.b())) {
                gfy.b = dhz.b();
            }
            if (!TextUtils.isEmpty(dhz.d())) {
                gfy.c = dhz.d();
            }
            if (!TextUtils.isEmpty(dhz.e())) {
                gfy.d = dhz.e();
            }
            if (!TextUtils.isEmpty(dhz.f())) {
                gfy.e = dhz.f();
            }
            if (!TextUtils.isEmpty(dhz.g())) {
                gfy.f = dhz.g();
            }
            if (!TextUtils.isEmpty(dhz.h())) {
                gfy.g = dhz.h();
            }
            if (!TextUtils.isEmpty(dhz.i())) {
                gfy.h = dhz.i();
            }
            if (!TextUtils.isEmpty(dhz.j())) {
                gfy.i = dhz.j();
            }
            gfy.k = dhz.l();
            if (!TextUtils.isEmpty(dhz.n())) {
                gfy.l = dhz.n();
            }
            iil.a("Expected null", dhz.o());
            iil.a("Expected null", dhz.k());
            gga.a = gfy;
        }
        if (!TextUtils.isEmpty(this.b)) {
            gga.b = this.b;
        }
        gga.c = this.c;
        gga.d = this.d;
        if (this.e != null) {
            if (!TextUtils.isEmpty(this.e.a())) {
                gga.e = this.e.a();
            }
            if (!TextUtils.isEmpty(this.e.b())) {
                gga.f = this.e.b();
            }
        }
        gga.g = this.f;
        gga.i = this.g;
        if (this.h != null) {
            gga.h = this.h.f();
        }
        return gga;
    }
}
