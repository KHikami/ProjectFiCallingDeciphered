package defpackage;

import android.app.PendingIntent;
import android.os.Bundle;

/* renamed from: fr */
public final class fr extends gq {
    public static final gr d;
    public int a;
    public CharSequence b;
    public PendingIntent c;
    private final Bundle e;
    private final hg[] f;
    private boolean g;

    public /* synthetic */ hm[] f() {
        return g();
    }

    public fr(int i, CharSequence charSequence, PendingIntent pendingIntent) {
        this(i, charSequence, pendingIntent, new Bundle(), null, false);
    }

    fr(int i, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, hg[] hgVarArr, boolean z) {
        this.g = false;
        this.a = i;
        this.b = fx.d(charSequence);
        this.c = pendingIntent;
        if (bundle == null) {
            bundle = new Bundle();
        }
        this.e = bundle;
        this.f = hgVarArr;
        this.g = z;
    }

    public int a() {
        return this.a;
    }

    public CharSequence b() {
        return this.b;
    }

    public PendingIntent c() {
        return this.c;
    }

    public Bundle d() {
        return this.e;
    }

    public boolean e() {
        return this.g;
    }

    private hg[] g() {
        return this.f;
    }

    static {
        d = new gr();
    }
}
