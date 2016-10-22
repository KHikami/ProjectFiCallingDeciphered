package defpackage;

import android.os.Build.VERSION;
import android.os.Bundle;

/* compiled from: PG */
/* renamed from: fq */
public final class fq extends fv {
    public final String a() {
        return null;
    }

    public final CharSequence b() {
        return null;
    }

    public final CharSequence[] c() {
        return null;
    }

    public final boolean d() {
        return false;
    }

    public final Bundle e() {
        return null;
    }

    static {
        if (VERSION.SDK_INT >= 20) {
            fs fsVar = new fs();
        } else if (VERSION.SDK_INT >= 16) {
            fu fuVar = new fu();
        } else {
            ft ftVar = new ft();
        }
        fw fwVar = new fw();
    }
}
