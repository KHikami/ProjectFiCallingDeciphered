package p000;

import android.app.PendingIntent;
import android.os.Bundle;

public final class fr extends gq {
    public static final gr f13794d = new gr();
    public int f13795a;
    public CharSequence f13796b;
    public PendingIntent f13797c;
    private final Bundle f13798e;
    private final hg[] f13799f;
    private boolean f13800g;

    public /* synthetic */ hm[] mo2071f() {
        return m16021g();
    }

    public fr(int i, CharSequence charSequence, PendingIntent pendingIntent) {
        this(i, charSequence, pendingIntent, new Bundle(), null, false);
    }

    fr(int i, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, hg[] hgVarArr, boolean z) {
        this.f13800g = false;
        this.f13795a = i;
        this.f13796b = fx.m16415d(charSequence);
        this.f13797c = pendingIntent;
        if (bundle == null) {
            bundle = new Bundle();
        }
        this.f13798e = bundle;
        this.f13799f = hgVarArr;
        this.f13800g = z;
    }

    public int mo2066a() {
        return this.f13795a;
    }

    public CharSequence mo2067b() {
        return this.f13796b;
    }

    public PendingIntent mo2068c() {
        return this.f13797c;
    }

    public Bundle mo2069d() {
        return this.f13798e;
    }

    public boolean mo2070e() {
        return this.f13800g;
    }

    private hg[] m16021g() {
        return this.f13799f;
    }
}
