package p000;

import android.content.res.Resources;
import android.view.View;

public final class ddl extends ccv<ddn> {
    public ddl(View view, ddn ddn, gai gai) {
        super(view, ddn, gai);
    }

    protected boolean mo809a() {
        int C = ((ddn) this.c).mo824C();
        return C == 10 || C == 25;
    }

    protected gag mo810b() {
        gah e = m7186e();
        Resources resources = this.b.getResources();
        if (fdq.f12773O.m14370b(((jca) new jyr(this.b).getBinder().m25443a(jca.class)).mo2317a())) {
            switch (((ddn) this.c).mo824C()) {
                case 10:
                    e.m16814a(resources.getString(bc.av));
                    break;
                case wi.dz /*25*/:
                    e.m16814a(resources.getString(bc.ao));
                    break;
            }
        }
        e.m16814a(resources.getString(bc.av));
        e.m16817c(resources.getString(bc.f2932P));
        e.m16813a(new ddm(this));
        return e.m16811a();
    }
}
