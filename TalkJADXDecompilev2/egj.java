package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnCreateContextMenuListener;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public final class egj extends fmy<fmz<? extends Cursor>, eex> {
    private final egi A;
    boolean b;
    ego c;
    private final Context d;
    private final bko e;
    private final bck f;
    private final bxt g;
    private final boolean h;
    private final iih i;
    private final LayoutInflater j;
    private fnb k;
    private String l;
    private final OnClickListener m;
    private final OnClickListener n;
    private final gnl o;
    private final OnCreateContextMenuListener p;
    private final egi q;
    private final egi r = i();
    private final egi s = a(gou.FREQUENT, gwb.sP);
    private final egi t = a(gou.CONTACTS, gwb.sW);
    private final egi u = a(gou.ON_HANGOUTS, gwb.tg);
    private final egi v;
    private final egi w;
    private final egi x;
    private final egi y;
    private final egi z;

    public /* synthetic */ aer a(ViewGroup viewGroup, int i) {
        return b(viewGroup, i);
    }

    public /* synthetic */ void a(aer aer) {
        ((eex) aer).v();
    }

    public egj(Context context, bko bko, bck bck, OnCreateContextMenuListener onCreateContextMenuListener, OnClickListener onClickListener, OnClickListener onClickListener2, gnl gnl, bxt bxt, boolean z) {
        super(context);
        this.d = context;
        this.j = (LayoutInflater) context.getSystemService("layout_inflater");
        this.e = bko;
        this.f = bck;
        this.p = onCreateContextMenuListener;
        this.n = onClickListener;
        this.m = onClickListener2;
        this.o = gnl;
        this.g = bxt;
        this.h = z;
        a(false);
        this.i = (iih) jyn.a(context, iih.class);
        this.q = new egi(context, bck, eey.b, false, false, this, gou.MANUAL, bxt);
        this.v = a(gou.DOMAIN, context.getString(bc.if, new Object[]{bko.i()}));
        this.w = a(gou.NOT_ON_HANGOUTS, gwb.tf);
        this.x = i();
        this.y = new egk(this, context, bck, eey.d, false, true, this, gou.GOOGLE_PLUS, bxt);
        this.z = j(gwb.ti);
        this.A = j(gwb.th);
        a(new egi(context, bck, eey.a, true, true, this, bxt));
        a(this.q);
        a(this.r);
        a(this.s);
        if (h()) {
            a(this.u);
        } else {
            a(this.t);
        }
        for (eeq a : jyn.c(e(), eeq.class)) {
            a(a.a((fna) this));
        }
        a(this.v);
        if (h()) {
            a(this.w);
        }
        a(this.A);
        a(this.x);
        a(this.y);
        a(this.z);
    }

    private boolean h() {
        if (this.h) {
            if (fdq.P.b(this.e.g())) {
                return true;
            }
        }
        return false;
    }

    private egi i() {
        return new egi(this.d, this.f, eey.e, false, true, this, this.g);
    }

    private egi a(gou gou, CharSequence charSequence) {
        return new egl(this, this.d, this.f, eey.b, true, false, this, gou, this.g, charSequence);
    }

    private egi a(gou gou, int i) {
        return a(gou, this.d.getString(i));
    }

    private egi j(int i) {
        return new egm(this, this.d, this.f, eey.c, false, true, this, this.g, i);
    }

    public long b(int i) {
        return -1;
    }

    public void a(String str) {
        this.l = str;
        for (eeq a : jyn.c(e(), eeq.class)) {
            a.a(str);
        }
        for (fmz fmz : f()) {
            if (fmz instanceof egi) {
                fmz.b(true);
            }
        }
        boolean c = c();
        this.x.a(c);
        this.y.a(c);
    }

    private boolean j() {
        return !h() || TextUtils.isEmpty(this.f.j());
    }

    public boolean c() {
        return this.h && !TextUtils.isEmpty(this.l);
    }

    public boolean b(boolean z) {
        boolean h = h();
        egi egi = h ? this.w : this.t;
        if (this.h && j() && !this.s.g()) {
            return false;
        }
        if (h && !this.u.g()) {
            return false;
        }
        if (!z || this.v.g()) {
            return egi.g();
        }
        return false;
    }

    public boolean c(boolean z) {
        if (!b(z)) {
            return false;
        }
        boolean h = h();
        egi egi = h ? this.w : this.t;
        if (this.h && j() && this.s.h()) {
            return false;
        }
        if (h && this.u.h()) {
            return false;
        }
        if (z && this.v.h()) {
            return false;
        }
        return !egi.h();
    }

    public boolean d(boolean z) {
        boolean h = h();
        egi egi = h ? this.w : this.t;
        if (this.h && j() && !this.s.e()) {
            return false;
        }
        if (h && !this.u.e()) {
            return false;
        }
        if (!z || this.v.e()) {
            return egi.e();
        }
        return false;
    }

    public void a(List<bjg> list) {
        boolean z = (list == null || list.isEmpty()) ? false : true;
        this.q.a(z ? new bjl(list) : null);
        this.r.a(z);
    }

    public void a(fnb fnb) {
        if (j()) {
            a(this.s, (Cursor) fnb);
            if (fnb != null && TextUtils.isEmpty(this.l)) {
                int count = fnb.getCount();
                if (count == 0) {
                    this.i.a(this.e.g()).b().c(2548);
                    return;
                } else {
                    this.i.a(this.e.g()).b().a(Integer.valueOf(count)).c(2547);
                    return;
                }
            }
            return;
        }
        a(this.s, null);
    }

    public void b(fnb fnb) {
        a(this.u, (Cursor) fnb);
    }

    public void c(fnb fnb) {
        a(this.t, (Cursor) fnb);
    }

    public void d(fnb fnb) {
        a(this.v, (Cursor) fnb);
    }

    public void e(fnb fnb) {
        a(this.w, (Cursor) fnb);
    }

    public void f(fnb fnb) {
        this.k = fnb;
        k();
    }

    public boolean d() {
        return this.b;
    }

    public void e(boolean z) {
        if (this.b != z) {
            if (z) {
                this.i.a(this.e.g()).b().c(2553);
            }
            this.b = z;
            k();
            if (this.c != null) {
                this.c.w();
            }
        }
    }

    private <T extends Cursor> void a(fmz<T> fmz_T, T t) {
        boolean z = true;
        String valueOf = String.valueOf(fmz_T);
        new StringBuilder(String.valueOf(valueOf).length() + 23).append("updateCursor partition=").append(valueOf);
        fmz_T.a((Cursor) t);
        if (!(b(true) && d(true))) {
            z = false;
        }
        this.A.a(z);
    }

    private void k() {
        boolean z = false;
        if (this.b) {
            if (this.k != null && this.k.getCount() == 0) {
                z = true;
            }
            this.z.a(z);
            this.y.a(this.k);
            return;
        }
        this.z.a(false);
        this.y.a(null);
    }

    private eex b(ViewGroup viewGroup, int i) {
        View inflate;
        switch (egn.a[eey.a()[i] - 1]) {
            case 1:
                return new egp(this.j.inflate(gwb.ha, viewGroup, false));
            case 2:
                return new egp(this.j.inflate(gwb.sH, viewGroup, false));
            case 3:
                return new egq(this.j.inflate(gwb.sG, viewGroup, false));
            case 4:
                inflate = this.j.inflate(gwb.sF, viewGroup, false);
                inflate.setOnClickListener(this.m);
                gld.a(inflate, true);
                inflate.setFocusable(true);
                return new ego(this, inflate);
            case 5:
                return new eex(this.j.inflate(gwb.sI, viewGroup, false));
            case 6:
                inflate = new gon(this.d, this.e, gou.CONTACTS, this.f);
                inflate.setOnClickListener(this.n);
                if (this.o != null) {
                    inflate.a(this.o);
                }
                inflate.setOnCreateContextMenuListener(this.p);
                gld.a(inflate, true);
                inflate.setFocusable(true);
                return new eex(inflate);
            default:
                for (eeq a : jyn.c(e(), eeq.class)) {
                    eex a2 = a.a(viewGroup, i, this.j);
                    if (a2 != null) {
                        return a2;
                    }
                }
                return null;
        }
    }

    public Map<egi, List<bjg>> b() {
        List<fmz> f = f();
        List arrayList = new ArrayList(f.size());
        for (fmz fmz : f) {
            if (fmz instanceof egi) {
                arrayList.add((egi) fmz);
            }
        }
        Map<egi, List<bjg>> kyVar = new ky();
        ArrayList arrayList2 = (ArrayList) arrayList;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            egi egi = (egi) arrayList2.get(i);
            fnb fnb = (fnb) egi.i();
            if (fnb != null) {
                int position = fnb.getPosition();
                List arrayList3 = new ArrayList(fnb.getCount());
                kyVar.put(egi, arrayList3);
                if (fnb.moveToFirst()) {
                    do {
                        try {
                            arrayList3.add(fnb.a());
                        } finally {
                            fnb.moveToPosition(position);
                        }
                    } while (fnb.moveToNext());
                    fnb.moveToPosition(position);
                    i = i2;
                } else {
                    i = i2;
                }
            } else {
                i = i2;
            }
        }
        return kyVar;
    }
}
