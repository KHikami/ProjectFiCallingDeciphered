package p000;

import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;

public final class hg extends hm {
    public static final hn f16886a = new hn();
    private static final hi f16887g;
    private final String f16888b;
    private final CharSequence f16889c;
    private final CharSequence[] f16890d;
    private final boolean f16891e;
    private final Bundle f16892f;

    hg(String str, CharSequence charSequence, CharSequence[] charSequenceArr, boolean z, Bundle bundle) {
        this.f16888b = str;
        this.f16889c = charSequence;
        this.f16890d = charSequenceArr;
        this.f16891e = z;
        this.f16892f = bundle;
    }

    public String mo2528a() {
        return this.f16888b;
    }

    public CharSequence mo2529b() {
        return this.f16889c;
    }

    public CharSequence[] mo2530c() {
        return this.f16890d;
    }

    public boolean mo2531d() {
        return this.f16891e;
    }

    public Bundle mo2532e() {
        return this.f16892f;
    }

    public static Bundle m19713a(Intent intent) {
        return f16887g.mo2559a(intent);
    }

    static {
        if (VERSION.SDK_INT >= 20) {
            f16887g = new hj();
        } else if (VERSION.SDK_INT >= 16) {
            f16887g = new hl();
        } else {
            f16887g = new hk();
        }
    }
}
