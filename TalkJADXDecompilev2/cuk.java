package defpackage;

import android.os.Handler;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

public final class cuk {
    final ijh a;
    final Set<cuq> b = new CopyOnWriteArraySet();
    final List<cuo> c = new ArrayList();
    String d;
    final Handler e = new Handler();
    final Runnable f = new cul(this);
    private cuo g;
    private cuo h;

    cuk(ijh ijh, ite ite, cvh cvh) {
        this.a = ijh;
        ite.a(new cum(this, ite));
        cvh.a(new cun(this));
    }

    public cuo a(List<edk> list, boolean z) {
        cuo cuo = new cuo(this, list, z);
        if (z) {
            this.g = cuo;
        }
        this.h = cuo;
        for (cuq d : this.b) {
            d.d();
        }
        if (this.d == null) {
            glk.a("Babel_explane_invite", "Invitation queued until we join the call", new Object[0]);
            this.c.add(cuo);
        } else {
            glk.a("Babel_explane_invite", "Invitation sent", new Object[0]);
            a(cuo);
        }
        return cuo;
    }

    public void a(cuq cuq) {
        this.b.add(cuq);
    }

    public void b(cuq cuq) {
        this.b.remove(cuq);
    }

    public cuo a() {
        return this.h;
    }

    void a(cuo cuo) {
        Iterator it = cuo.d.b.iterator();
        while (it.hasNext()) {
            it.next();
        }
        nzf mbt = new mbt();
        mbt.a = new mbq();
        mbt.a.b = cuo.d.d;
        mbt.a.e = Integer.valueOf(1);
        ArrayList arrayList = new ArrayList();
        for (edk edk : cuo.a) {
            if (!edk.a()) {
                glk.e("Babel_explane_invite", "Attempted to invite someone without a Gaia id! {%s}", edk);
                cuo.g();
                break;
            }
            mby mby = new mby();
            mby.a = new mbz();
            mby.a.b = edk.b();
            mbx mbx = new mbx();
            mbx.a = mby;
            arrayList.add(mbx);
        }
        if (arrayList.isEmpty()) {
            cuo.g();
        } else {
            mbt.a.d = (mbx[]) arrayList.toArray(mbt.a.d);
            cuo.d.a.a("hangout_invitations/add", mbt, mbu.class, new cup(cuo));
        }
        if (cuo.f()) {
            this.e.postDelayed(this.f, gwb.a(gwb.H(), "babel_hangout_outgoing_invite_max_duration_ms", 30000));
        }
    }
}
