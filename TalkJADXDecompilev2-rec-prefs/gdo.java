package p000;

import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;

public final class gdo {
    public final dhz f14770a;
    public final String f14771b;
    final long f14772c;
    public final long f14773d;
    final gcw f14774e;
    public final int f14775f;
    final boolean f14776g;
    final gec f14777h;

    public static gdo m17063a(Bundle bundle) {
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
        this.f14770a = dhz;
        this.f14771b = str;
        this.f14772c = j;
        this.f14773d = j2;
        this.f14774e = gcw;
        this.f14775f = i;
        this.f14776g = z;
        this.f14777h = gec;
    }

    public Bundle m17064a() {
        Bundle bundle = new Bundle();
        String str = "com.google.android.apps.hangouts.telephony.hangout_info_bundle";
        Parcelable bundle2 = new Bundle();
        bundle2.putParcelable("hangout_request", this.f14770a);
        bundle2.putString("inviter_phone_number", this.f14771b);
        bundle2.putLong("invitation_id", this.f14772c);
        bundle2.putLong("timestamp_millis", this.f14773d);
        if (this.f14774e != null) {
            bundle2.putString("experiment_code", this.f14774e.m16992a());
            bundle2.putString("experiment_flags", this.f14774e.m16994b());
        }
        bundle2.putInt("account_id", this.f14775f);
        bundle2.putBoolean("did_fallback_to_lte", this.f14776g);
        bundle2.putParcelable("network_status", this.f14777h);
        bundle.putParcelable(str, bundle2);
        return bundle;
    }

    public gga m17065b() {
        gga gga = new gga();
        if (this.f14770a != null) {
            dhz dhz = this.f14770a;
            gfy gfy = new gfy();
            if (!TextUtils.isEmpty(dhz.m11885a())) {
                gfy.f15193a = dhz.m11885a();
            }
            gfy.f15202j = dhz.m11903m();
            if (!TextUtils.isEmpty(dhz.m11889b())) {
                gfy.f15194b = dhz.m11889b();
            }
            if (!TextUtils.isEmpty(dhz.m11893d())) {
                gfy.f15195c = dhz.m11893d();
            }
            if (!TextUtils.isEmpty(dhz.m11895e())) {
                gfy.f15196d = dhz.m11895e();
            }
            if (!TextUtils.isEmpty(dhz.m11896f())) {
                gfy.f15197e = dhz.m11896f();
            }
            if (!TextUtils.isEmpty(dhz.m11897g())) {
                gfy.f15198f = dhz.m11897g();
            }
            if (!TextUtils.isEmpty(dhz.m11898h())) {
                gfy.f15199g = dhz.m11898h();
            }
            if (!TextUtils.isEmpty(dhz.m11899i())) {
                gfy.f15200h = dhz.m11899i();
            }
            if (!TextUtils.isEmpty(dhz.m11900j())) {
                gfy.f15201i = dhz.m11900j();
            }
            gfy.f15203k = dhz.m11902l();
            if (!TextUtils.isEmpty(dhz.m11904n())) {
                gfy.f15204l = dhz.m11904n();
            }
            iil.m21872a("Expected null", dhz.m11905o());
            iil.m21872a("Expected null", dhz.m11901k());
            gga.f15209a = gfy;
        }
        if (!TextUtils.isEmpty(this.f14771b)) {
            gga.f15210b = this.f14771b;
        }
        gga.f15211c = this.f14772c;
        gga.f15212d = this.f14773d;
        if (this.f14774e != null) {
            if (!TextUtils.isEmpty(this.f14774e.m16992a())) {
                gga.f15213e = this.f14774e.m16992a();
            }
            if (!TextUtils.isEmpty(this.f14774e.m16994b())) {
                gga.f15214f = this.f14774e.m16994b();
            }
        }
        gga.f15215g = this.f14775f;
        gga.f15217i = this.f14776g;
        if (this.f14777h != null) {
            gga.f15216h = this.f14777h.m17124f();
        }
        return gga;
    }
}
