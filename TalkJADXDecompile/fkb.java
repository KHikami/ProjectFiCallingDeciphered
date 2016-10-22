import android.app.Activity;
import android.content.Context;
import android.util.SparseArray;

public class fkb extends bcq {
    private static final boolean b;
    boolean a;
    private final SparseArray<Boolean> c;

    static {
        kae kae = glk.o;
        b = false;
    }

    public fkb() {
        this.a = false;
        this.c = new SparseArray();
    }

    public static boolean a(int i) {
        return gwb.b((Boolean) ((fkb) jyn.a(gwb.H(), fkb.class)).c.get(i));
    }

    protected void b(Activity activity) {
        this.a = false;
        bhl bhl = (bhl) jyn.a((Context) activity, bhl.class);
        for (int i : fde.g()) {
            this.c.put(i, Boolean.valueOf(false));
            bhl.a(new fkh(i));
        }
    }

    public static void a(int i, boolean z) {
        ((fkb) jyn.a(gwb.H(), fkb.class)).c.put(i, Boolean.valueOf(z));
    }

    public void c(Activity activity) {
        int i = 0;
        boolean z = new gjg(activity, "com.google.android.apps.hangouts.phone.notify_set_active", "com.google.android.apps.hangouts.phone.force_set_active").a() ? true : (new gjg(activity, "com.google.android.apps.hangouts.phone.notify_set_active", "com.google.android.apps.hangouts.phone.block_set_active").a() || this.a || !(activity instanceof fkc) || gwb.V(activity.getApplicationContext())) ? false : true;
        if (z) {
            this.a = true;
            bhl bhl = (bhl) jyn.a((Context) activity, bhl.class);
            int[] g = fde.g();
            int length = g.length;
            while (i < length) {
                int i2 = g[i];
                if (fde.e(i2) != null) {
                    this.c.append(i2, Boolean.valueOf(true));
                    bhl.a(new fkd(i2));
                }
                i++;
            }
        }
    }
}
