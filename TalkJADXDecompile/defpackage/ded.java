package defpackage;

import android.os.Bundle;

/* renamed from: ded */
public final class ded extends dr {
    static fyy a;
    static String b;

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        fyy b = fyx.b();
        a = b;
        b = fyx.a(b);
        ew a = getFragmentManager().a();
        dee dee = new dee();
        dee.setTargetFragment(this, 0);
        dee.a(a, null);
    }
}
