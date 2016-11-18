package p000;

import android.os.Handler;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

public final class cuk {
    final ijh f9103a;
    final Set<cuq> f9104b = new CopyOnWriteArraySet();
    final List<cuo> f9105c = new ArrayList();
    String f9106d;
    final Handler f9107e = new Handler();
    final Runnable f9108f = new cul(this);
    private cuo f9109g;
    private cuo f9110h;

    cuk(ijh ijh, ite ite, cvh cvh) {
        this.f9103a = ijh;
        ite.mo3217a(new cum(this, ite));
        cvh.m11092a(new cun(this));
    }

    public cuo m11029a(List<edk> list, boolean z) {
        cuo cuo = new cuo(this, list, z);
        if (z) {
            this.f9109g = cuo;
        }
        this.f9110h = cuo;
        for (cuq d : this.f9104b) {
            d.mo1443d();
        }
        if (this.f9106d == null) {
            glk.m17970a("Babel_explane_invite", "Invitation queued until we join the call", new Object[0]);
            this.f9105c.add(cuo);
        } else {
            glk.m17970a("Babel_explane_invite", "Invitation sent", new Object[0]);
            m11030a(cuo);
        }
        return cuo;
    }

    public void m11031a(cuq cuq) {
        this.f9104b.add(cuq);
    }

    public void m11032b(cuq cuq) {
        this.f9104b.remove(cuq);
    }

    public cuo m11028a() {
        return this.f9110h;
    }

    void m11030a(cuo cuo) {
        Iterator it = cuo.f9118d.f9104b.iterator();
        while (it.hasNext()) {
            it.next();
        }
        nzf mbt = new mbt();
        mbt.f27270a = new mbq();
        mbt.f27270a.f27253b = cuo.f9118d.f9106d;
        mbt.f27270a.f27256e = Integer.valueOf(1);
        ArrayList arrayList = new ArrayList();
        for (edk edk : cuo.f9115a) {
            if (!edk.m13589a()) {
                glk.m17982e("Babel_explane_invite", "Attempted to invite someone without a Gaia id! {%s}", edk);
                cuo.m11042g();
                break;
            }
            mby mby = new mby();
            mby.f27283a = new mbz();
            mby.f27283a.f27286b = edk.m13590b();
            mbx mbx = new mbx();
            mbx.f27279a = mby;
            arrayList.add(mbx);
        }
        if (arrayList.isEmpty()) {
            cuo.m11042g();
        } else {
            mbt.f27270a.f27255d = (mbx[]) arrayList.toArray(mbt.f27270a.f27255d);
            cuo.f9118d.f9103a.mo3358a("hangout_invitations/add", mbt, mbu.class, new cup(cuo));
        }
        if (cuo.m11041f()) {
            this.f9107e.postDelayed(this.f9108f, gwb.m1519a(gwb.m1400H(), "babel_hangout_outgoing_invite_max_duration_ms", 30000));
        }
    }
}
