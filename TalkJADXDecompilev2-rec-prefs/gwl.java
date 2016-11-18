package p000;

import android.content.ComponentName;
import android.content.Intent;

final class gwl {
    private final String f16300a;
    private final String f16301b;
    private final ComponentName f16302c;

    public gwl(ComponentName componentName) {
        this.f16300a = null;
        this.f16301b = null;
        this.f16302c = (ComponentName) gwb.m1419L((Object) componentName);
    }

    public gwl(String str, String str2) {
        this.f16300a = gwb.m1426M(str);
        this.f16301b = gwb.m1426M(str2);
        this.f16302c = null;
    }

    public Intent m18791a() {
        return this.f16300a != null ? new Intent(this.f16300a).setPackage(this.f16301b) : new Intent().setComponent(this.f16302c);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gwl)) {
            return false;
        }
        gwl gwl = (gwl) obj;
        return gwb.m2186e(this.f16300a, gwl.f16300a) && gwb.m2186e(this.f16302c, gwl.f16302c);
    }

    public int hashCode() {
        return gwb.m1517a(this.f16300a, this.f16302c);
    }

    public String toString() {
        return this.f16300a == null ? this.f16302c.flattenToString() : this.f16300a;
    }
}
