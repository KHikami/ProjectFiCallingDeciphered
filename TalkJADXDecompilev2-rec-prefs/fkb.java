package p000;

import android.app.Activity;
import android.content.Context;
import android.util.SparseArray;

public class fkb extends bcq {
    private static final boolean f13304b = false;
    boolean f13305a = false;
    private final SparseArray<Boolean> f13306c = new SparseArray();

    static {
        kae kae = glk.f15568o;
    }

    public static boolean m15538a(int i) {
        return gwb.m2061b((Boolean) ((fkb) jyn.m25426a(gwb.m1400H(), fkb.class)).f13306c.get(i));
    }

    protected void mo467b(Activity activity) {
        this.f13305a = false;
        bhl bhl = (bhl) jyn.m25426a((Context) activity, bhl.class);
        for (int i : fde.m15024g()) {
            this.f13306c.put(i, Boolean.valueOf(false));
            bhl.mo550a(new fkh(i));
        }
    }

    public static void m15537a(int i, boolean z) {
        ((fkb) jyn.m25426a(gwb.m1400H(), fkb.class)).f13306c.put(i, Boolean.valueOf(z));
    }

    public void mo2023c(Activity activity) {
        int i = 0;
        boolean z = new gjg(activity, "com.google.android.apps.hangouts.phone.notify_set_active", "com.google.android.apps.hangouts.phone.force_set_active").m17805a() ? true : (new gjg(activity, "com.google.android.apps.hangouts.phone.notify_set_active", "com.google.android.apps.hangouts.phone.block_set_active").m17805a() || this.f13305a || !(activity instanceof fkc) || gwb.m1459V(activity.getApplicationContext())) ? false : true;
        if (z) {
            this.f13305a = true;
            bhl bhl = (bhl) jyn.m25426a((Context) activity, bhl.class);
            int[] g = fde.m15024g();
            int length = g.length;
            while (i < length) {
                int i2 = g[i];
                if (fde.m15018e(i2) != null) {
                    this.f13306c.append(i2, Boolean.valueOf(true));
                    bhl.mo550a(new fkd(i2));
                }
                i++;
            }
        }
    }
}
