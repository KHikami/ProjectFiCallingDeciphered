package defpackage;

import android.content.ComponentName;
import android.content.Intent;

/* renamed from: gwl */
final class gwl {
    private final String a;
    private final String b;
    private final ComponentName c;

    public gwl(ComponentName componentName) {
        this.a = null;
        this.b = null;
        this.c = (ComponentName) gwb.L((Object) componentName);
    }

    public gwl(String str, String str2) {
        this.a = gwb.M(str);
        this.b = gwb.M(str2);
        this.c = null;
    }

    public Intent a() {
        return this.a != null ? new Intent(this.a).setPackage(this.b) : new Intent().setComponent(this.c);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gwl)) {
            return false;
        }
        gwl gwl = (gwl) obj;
        return gwb.e(this.a, gwl.a) && gwb.e(this.c, gwl.c);
    }

    public int hashCode() {
        return gwb.a(this.a, this.c);
    }

    public String toString() {
        return this.a == null ? this.c.flattenToString() : this.a;
    }
}
