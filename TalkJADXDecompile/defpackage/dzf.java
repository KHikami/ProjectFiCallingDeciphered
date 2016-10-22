package defpackage;

import android.app.Activity;
import android.content.Context;
import com.google.android.apps.hangouts.R$drawable;

/* renamed from: dzf */
public final class dzf extends dyy {
    public int a() {
        return bc.bu;
    }

    public int b() {
        return R$drawable.ce;
    }

    public int c() {
        return 4;
    }

    public void a(Activity activity) {
        gwb.a(this.a, 1604);
        if (this.a != null) {
            ((fuz) jyn.a((Context) activity, fuz.class)).a(activity, this.a.g(), null);
        } else {
            glk.e("Babel", "Unexpected null account in dnd_item", new Object[0]);
        }
    }

    public int d() {
        return 1;
    }

    public int e() {
        return 4;
    }
}
