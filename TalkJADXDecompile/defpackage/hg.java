package defpackage;

import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;

/* renamed from: hg */
public final class hg extends hm {
    public static final hn a;
    private static final hi g;
    private final String b;
    private final CharSequence c;
    private final CharSequence[] d;
    private final boolean e;
    private final Bundle f;

    hg(String str, CharSequence charSequence, CharSequence[] charSequenceArr, boolean z, Bundle bundle) {
        this.b = str;
        this.c = charSequence;
        this.d = charSequenceArr;
        this.e = z;
        this.f = bundle;
    }

    public String a() {
        return this.b;
    }

    public CharSequence b() {
        return this.c;
    }

    public CharSequence[] c() {
        return this.d;
    }

    public boolean d() {
        return this.e;
    }

    public Bundle e() {
        return this.f;
    }

    public static Bundle a(Intent intent) {
        return g.a(intent);
    }

    static {
        if (VERSION.SDK_INT >= 20) {
            g = new hj();
        } else if (VERSION.SDK_INT >= 16) {
            g = new hl();
        } else {
            g = new hk();
        }
        a = new hn();
    }
}
