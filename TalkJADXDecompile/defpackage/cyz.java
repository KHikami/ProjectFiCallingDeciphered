package defpackage;

import android.content.res.Resources;
import android.view.View;

/* renamed from: cyz */
public final class cyz extends ccv<czb> {
    gan e;

    public cyz(View view, czb czb, gai gai) {
        super(view, czb, gai);
        this.e = new cza(this);
    }

    protected boolean a() {
        return ((czb) this.c).q() > 0;
    }

    protected gag b() {
        gwb.a(fde.e(((jca) jyn.a(this.b, jca.class)).a()), 1814);
        gah e = e();
        Resources resources = this.b.getResources();
        if (((czb) this.c).q() == 1) {
            e.a(resources.getString(bc.H, new Object[]{((czb) this.c).r().e}));
            e.c(resources.getString(bc.jG));
            e.a(this.e);
        } else {
            e.a(resources.getString(bc.G, new Object[]{Integer.valueOf(((czb) this.c).q())}));
        }
        e.a(true);
        return e.a();
    }
}
