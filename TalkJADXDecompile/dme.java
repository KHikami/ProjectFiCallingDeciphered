import android.content.Context;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public final class dme extends dga {
    dhu a;
    final dgg b;
    private List<dhw> c;

    public dme() {
        this.b = dgg.a();
        this.c = new ArrayList();
    }

    public List<dhw> a(Context context, dhu dhu, itl itl, did did) {
        this.c.clear();
        this.a = dhu;
        if (itl.f()) {
            dhw dkz;
            if (((dmn) jyn.a(context, dmn.class)).b()) {
                this.c.add(new dhw(context, itl, ba.q, bc.uD, gwb.dL, true, true, context.getString(bc.gD), new dmf(this, context)));
            } else {
                dkz = new dkz(context, itl, gwb.eu, gwb.eq, ba.q, bc.uE, bc.uD, context.getString(bc.eJ), context.getString(bc.eK), true, !this.b.i(), null);
                dkz.setOnClickListener(new dmg(this, dkz));
                dkz.a(new dmh(this, dkz));
                this.c.add(dkz);
            }
            this.c.add(new dkz(context, itl, gwb.ea, gwb.ea, ba.q, bc.uB, bc.uB, context.getString(bc.ud), context.getString(bc.ud), true, true, new dmi(this, dhu)));
            boolean a = a(did);
            iry l = this.b.l();
            int i = gwb.eu;
            int i2 = gwb.eq;
            int i3 = ba.q;
            int i4 = bc.uG;
            int i5 = bc.uF;
            String string = context.getString(bc.eH);
            String string2 = context.getString(bc.eI);
            boolean z = l != null && l.g();
            dkz = new dkz(context, itl, i, i2, i3, i4, i5, string, string2, a, z, null);
            dkz.setOnClickListener(new dmj(this, dhu, dkz));
            dkz.a(new dmk(this, dkz));
            this.c.add(dkz);
            boolean b = b(did);
            dkz = new dhw(context, itl, ba.q, bc.uC, gwb.eu, b, false, context.getResources().getString(bc.eD), null);
            if (b) {
                a(dkz, did);
            }
            dkz.a(new dml(this, dkz));
            this.c.add(dkz);
        }
        return this.c;
    }

    public int a() {
        return 0;
    }

    boolean a(did did) {
        boolean z;
        if ((this.a.g() & 2) != 0) {
            z = true;
        } else {
            z = false;
        }
        if (b(did) || !r0) {
            return false;
        }
        return true;
    }

    boolean b(did did) {
        boolean z;
        Collection collection = null;
        ikd p = did == null ? null : did.p();
        if (p != null) {
            collection = p.j();
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
        if ((this.a.g() & 1) != 0) {
            z = true;
        } else {
            z = false;
        }
        if (z && (r4 || r0)) {
            return true;
        }
        return false;
    }

    void a(dhw dhw, did did) {
        Collection collection;
        iqo iqo = null;
        ikd p = did == null ? null : did.p();
        if (p == null) {
            collection = null;
        } else {
            collection = p.j();
        }
        if (collection != null && collection.size() == 1) {
            iqo iqo2 = (iqo) collection.toArray()[0];
            if (iqo2 instanceof iqu) {
                iqo = iqo2;
            }
        }
        dhw.a(iqo != null);
        if (iqo != null) {
            dhw.setOnClickListener(new dmm(this));
        }
    }
}
