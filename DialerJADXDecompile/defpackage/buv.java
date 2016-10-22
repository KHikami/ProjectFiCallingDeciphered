package defpackage;

import android.content.ComponentName;
import android.content.Intent;

/* renamed from: buv */
final class buv {
    private final String a;
    private final ComponentName b;

    public buv(ComponentName componentName) {
        this.a = null;
        this.b = (ComponentName) buf.A((Object) componentName);
    }

    public buv(String str) {
        this.a = buf.n(str);
        this.b = null;
    }

    public final Intent a() {
        return this.a != null ? new Intent(this.a).setPackage("com.google.android.gms") : new Intent().setComponent(this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof buv)) {
            return false;
        }
        buv buv = (buv) obj;
        return buf.c(this.a, buv.a) && buf.c(this.b, buv.b);
    }

    public final int hashCode() {
        return buf.a(this.a, this.b);
    }

    public final String toString() {
        return this.a == null ? this.b.flattenToString() : this.a;
    }
}
