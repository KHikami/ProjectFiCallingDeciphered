package p000;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public final class dme extends dga {
    dhu f10112a;
    final dgg f10113b = dgg.m11692a();
    private List<dhw> f10114c = new ArrayList();

    public List<dhw> mo1600a(Context context, dhu dhu, itl itl, did did) {
        this.f10114c.clear();
        this.f10112a = dhu;
        if (itl.m23242f()) {
            dhw dkz;
            if (((dmn) jyn.m25426a(context, dmn.class)).mo1605b()) {
                this.f10114c.add(new dhw(context, itl, ba.f2706q, bc.uD, gwb.dL, true, true, context.getString(bc.gD), new dmf(this, context)));
            } else {
                dkz = new dkz(context, itl, gwb.eu, gwb.eq, ba.f2706q, bc.uE, bc.uD, context.getString(bc.eJ), context.getString(bc.eK), true, !this.f10113b.m11717i(), null);
                dkz.setOnClickListener(new dmg(this, dkz));
                dkz.m11869a(new dmh(this, dkz));
                this.f10114c.add(dkz);
            }
            this.f10114c.add(new dkz(context, itl, gwb.ea, gwb.ea, ba.f2706q, bc.uB, bc.uB, context.getString(bc.ud), context.getString(bc.ud), true, true, new dmi(this, dhu)));
            boolean a = m12227a(did);
            iry l = this.f10113b.m11720l();
            int i = gwb.eu;
            int i2 = gwb.eq;
            int i3 = ba.f2706q;
            int i4 = bc.uG;
            int i5 = bc.uF;
            String string = context.getString(bc.eH);
            String string2 = context.getString(bc.eI);
            boolean z = l != null && l.mo1322g();
            dkz = new dkz(context, itl, i, i2, i3, i4, i5, string, string2, a, z, null);
            dkz.setOnClickListener(new dmj(this, dhu, dkz));
            dkz.m11869a(new dmk(this, dkz));
            this.f10114c.add(dkz);
            boolean b = m12228b(did);
            dkz = new dhw(context, itl, ba.f2706q, bc.uC, gwb.eu, b, false, context.getResources().getString(bc.eD), null);
            if (b) {
                m12226a(dkz, did);
            }
            dkz.m11869a(new dml(this, dkz));
            this.f10114c.add(dkz);
        }
        return this.f10114c;
    }

    public int mo1599a() {
        return 0;
    }

    boolean m12227a(did did) {
        boolean z;
        if ((this.f10112a.m11857g() & 2) != 0) {
            z = true;
        } else {
            z = false;
        }
        if (m12228b(did) || !r0) {
            return false;
        }
        return true;
    }

    boolean m12228b(did did) {
        boolean z;
        Collection collection = null;
        ikd p = did == null ? null : did.m11994p();
        if (p != null) {
            collection = p.m22138j();
        }
        boolean z2;
        if (collection == null || collection.size() != 1) {
            z2 = false;
        } else {
            z2 = true;
        }
        boolean z3;
        if (collection == null || collection.isEmpty()) {
            z3 = true;
        } else {
            z3 = false;
        }
        if ((this.f10112a.m11857g() & 1) != 0) {
            z = true;
        } else {
            z = false;
        }
        if (z && (r4 || r0)) {
            return true;
        }
        return false;
    }

    void m12226a(dhw dhw, did did) {
        Collection collection;
        iqo iqo = null;
        ikd p = did == null ? null : did.m11994p();
        if (p == null) {
            collection = null;
        } else {
            collection = p.m22138j();
        }
        if (collection != null && collection.size() == 1) {
            iqo iqo2 = (iqo) collection.toArray()[0];
            if (iqo2 instanceof iqu) {
                iqo = iqo2;
            }
        }
        dhw.mo1595a(iqo != null);
        if (iqo != null) {
            dhw.setOnClickListener(new dmm(this));
        }
    }
}
