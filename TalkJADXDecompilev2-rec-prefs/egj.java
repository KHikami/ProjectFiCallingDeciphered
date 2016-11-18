package p000;

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
    private final egi f11419A;
    boolean f11420b;
    ego f11421c;
    private final Context f11422d;
    private final bko f11423e;
    private final bck f11424f;
    private final bxt f11425g;
    private final boolean f11426h;
    private final iih f11427i;
    private final LayoutInflater f11428j;
    private fnb f11429k;
    private String f11430l;
    private final OnClickListener f11431m;
    private final OnClickListener f11432n;
    private final gnl f11433o;
    private final OnCreateContextMenuListener f11434p;
    private final egi f11435q;
    private final egi f11436r = m13868i();
    private final egi f11437s = m13863a(gou.FREQUENT, gwb.sP);
    private final egi f11438t = m13863a(gou.CONTACTS, gwb.sW);
    private final egi f11439u = m13863a(gou.ON_HANGOUTS, gwb.tg);
    private final egi f11440v;
    private final egi f11441w;
    private final egi f11442x;
    private final egi f11443y;
    private final egi f11444z;

    public /* synthetic */ aer mo738a(ViewGroup viewGroup, int i) {
        return m13866b(viewGroup, i);
    }

    public /* synthetic */ void mo739a(aer aer) {
        ((eex) aer).mo1863v();
    }

    public egj(Context context, bko bko, bck bck, OnCreateContextMenuListener onCreateContextMenuListener, OnClickListener onClickListener, OnClickListener onClickListener2, gnl gnl, bxt bxt, boolean z) {
        super(context);
        this.f11422d = context;
        this.f11428j = (LayoutInflater) context.getSystemService("layout_inflater");
        this.f11423e = bko;
        this.f11424f = bck;
        this.f11434p = onCreateContextMenuListener;
        this.f11432n = onClickListener;
        this.f11431m = onClickListener2;
        this.f11433o = gnl;
        this.f11425g = bxt;
        this.f11426h = z;
        m743a(false);
        this.f11427i = (iih) jyn.m25426a(context, iih.class);
        this.f11435q = new egi(context, bck, eey.f11324b, false, false, this, gou.MANUAL, bxt);
        this.f11440v = m13864a(gou.DOMAIN, context.getString(bc.f2953if, new Object[]{bko.m5640i()}));
        this.f11441w = m13863a(gou.NOT_ON_HANGOUTS, gwb.tf);
        this.f11442x = m13868i();
        this.f11443y = new egk(this, context, bck, eey.f11326d, false, true, this, gou.GOOGLE_PLUS, bxt);
        this.f11444z = m13869j(gwb.ti);
        this.f11419A = m13869j(gwb.th);
        m13851a(new egi(context, bck, eey.f11323a, true, true, this, bxt));
        m13851a(this.f11435q);
        m13851a(this.f11436r);
        m13851a(this.f11437s);
        if (m13867h()) {
            m13851a(this.f11439u);
        } else {
            m13851a(this.f11438t);
        }
        for (eeq a : jyn.m25438c(m13856e(), eeq.class)) {
            m13851a(a.mo1858a((fna) this));
        }
        m13851a(this.f11440v);
        if (m13867h()) {
            m13851a(this.f11441w);
        }
        m13851a(this.f11419A);
        m13851a(this.f11442x);
        m13851a(this.f11443y);
        m13851a(this.f11444z);
    }

    private boolean m13867h() {
        if (this.f11426h) {
            if (fdq.f12774P.m14370b(this.f11423e.m5638g())) {
                return true;
            }
        }
        return false;
    }

    private egi m13868i() {
        return new egi(this.f11422d, this.f11424f, eey.f11327e, false, true, this, this.f11425g);
    }

    private egi m13864a(gou gou, CharSequence charSequence) {
        return new egl(this, this.f11422d, this.f11424f, eey.f11324b, true, false, this, gou, this.f11425g, charSequence);
    }

    private egi m13863a(gou gou, int i) {
        return m13864a(gou, this.f11422d.getString(i));
    }

    private egi m13869j(int i) {
        return new egm(this, this.f11422d, this.f11424f, eey.f11325c, false, true, this, this.f11425g, i);
    }

    public long mo741b(int i) {
        return -1;
    }

    public void m13875a(String str) {
        this.f11430l = str;
        for (eeq a : jyn.m25438c(m13856e(), eeq.class)) {
            a.mo1860a(str);
        }
        for (fmz fmz : m13858f()) {
            if (fmz instanceof egi) {
                fmz.m13776b(true);
            }
        }
        boolean c = m13882c();
        this.f11442x.m13774a(c);
        this.f11443y.m13774a(c);
    }

    private boolean m13870j() {
        return !m13867h() || TextUtils.isEmpty(this.f11424f.m4881j());
    }

    public boolean m13882c() {
        return this.f11426h && !TextUtils.isEmpty(this.f11430l);
    }

    public boolean m13880b(boolean z) {
        boolean h = m13867h();
        egi egi = h ? this.f11441w : this.f11438t;
        if (this.f11426h && m13870j() && !this.f11437s.m13781g()) {
            return false;
        }
        if (h && !this.f11439u.m13781g()) {
            return false;
        }
        if (!z || this.f11440v.m13781g()) {
            return egi.m13781g();
        }
        return false;
    }

    public boolean m13883c(boolean z) {
        if (!m13880b(z)) {
            return false;
        }
        boolean h = m13867h();
        egi egi = h ? this.f11441w : this.f11438t;
        if (this.f11426h && m13870j() && this.f11437s.m13782h()) {
            return false;
        }
        if (h && this.f11439u.m13782h()) {
            return false;
        }
        if (z && this.f11440v.m13782h()) {
            return false;
        }
        return !egi.m13782h();
    }

    public boolean m13886d(boolean z) {
        boolean h = m13867h();
        egi egi = h ? this.f11441w : this.f11438t;
        if (this.f11426h && m13870j() && !this.f11437s.m13779e()) {
            return false;
        }
        if (h && !this.f11439u.m13779e()) {
            return false;
        }
        if (!z || this.f11440v.m13779e()) {
            return egi.m13779e();
        }
        return false;
    }

    public void m13876a(List<bjg> list) {
        boolean z = (list == null || list.isEmpty()) ? false : true;
        this.f11435q.m13772a(z ? new bjl(list) : null);
        this.f11436r.m13774a(z);
    }

    public void m13874a(fnb fnb) {
        if (m13870j()) {
            m13865a(this.f11437s, (Cursor) fnb);
            if (fnb != null && TextUtils.isEmpty(this.f11430l)) {
                int count = fnb.getCount();
                if (count == 0) {
                    this.f11427i.mo1979a(this.f11423e.m5638g()).mo1693b().mo1714c(2548);
                    return;
                } else {
                    this.f11427i.mo1979a(this.f11423e.m5638g()).mo1693b().mo1698a(Integer.valueOf(count)).mo1714c(2547);
                    return;
                }
            }
            return;
        }
        m13865a(this.f11437s, null);
    }

    public void m13879b(fnb fnb) {
        m13865a(this.f11439u, (Cursor) fnb);
    }

    public void m13881c(fnb fnb) {
        m13865a(this.f11438t, (Cursor) fnb);
    }

    public void m13884d(fnb fnb) {
        m13865a(this.f11440v, (Cursor) fnb);
    }

    public void m13887e(fnb fnb) {
        m13865a(this.f11441w, (Cursor) fnb);
    }

    public void m13889f(fnb fnb) {
        this.f11429k = fnb;
        m13871k();
    }

    public boolean m13885d() {
        return this.f11420b;
    }

    public void m13888e(boolean z) {
        if (this.f11420b != z) {
            if (z) {
                this.f11427i.mo1979a(this.f11423e.m5638g()).mo1693b().mo1714c(2553);
            }
            this.f11420b = z;
            m13871k();
            if (this.f11421c != null) {
                this.f11421c.m13893w();
            }
        }
    }

    private <T extends Cursor> void m13865a(fmz<T> fmz_T, T t) {
        boolean z = true;
        String valueOf = String.valueOf(fmz_T);
        new StringBuilder(String.valueOf(valueOf).length() + 23).append("updateCursor partition=").append(valueOf);
        fmz_T.m13772a((Cursor) t);
        if (!(m13880b(true) && m13886d(true))) {
            z = false;
        }
        this.f11419A.m13774a(z);
    }

    private void m13871k() {
        boolean z = false;
        if (this.f11420b) {
            if (this.f11429k != null && this.f11429k.getCount() == 0) {
                z = true;
            }
            this.f11444z.m13774a(z);
            this.f11443y.m13772a(this.f11429k);
            return;
        }
        this.f11444z.m13774a(false);
        this.f11443y.m13772a(null);
    }

    private eex m13866b(ViewGroup viewGroup, int i) {
        View inflate;
        switch (egn.f11450a[eey.m13744a()[i] - 1]) {
            case 1:
                return new egp(this.f11428j.inflate(gwb.ha, viewGroup, false));
            case 2:
                return new egp(this.f11428j.inflate(gwb.sH, viewGroup, false));
            case 3:
                return new egq(this.f11428j.inflate(gwb.sG, viewGroup, false));
            case 4:
                inflate = this.f11428j.inflate(gwb.sF, viewGroup, false);
                inflate.setOnClickListener(this.f11431m);
                gld.m17934a(inflate, true);
                inflate.setFocusable(true);
                return new ego(this, inflate);
            case 5:
                return new eex(this.f11428j.inflate(gwb.sI, viewGroup, false));
            case 6:
                inflate = new gon(this.f11422d, this.f11423e, gou.CONTACTS, this.f11424f);
                inflate.setOnClickListener(this.f11432n);
                if (this.f11433o != null) {
                    inflate.m18165a(this.f11433o);
                }
                inflate.setOnCreateContextMenuListener(this.f11434p);
                gld.m17934a(inflate, true);
                inflate.setFocusable(true);
                return new eex(inflate);
            default:
                for (eeq a : jyn.m25438c(m13856e(), eeq.class)) {
                    eex a2 = a.mo1857a(viewGroup, i, this.f11428j);
                    if (a2 != null) {
                        return a2;
                    }
                }
                return null;
        }
    }

    public Map<egi, List<bjg>> m13878b() {
        List<fmz> f = m13858f();
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
            fnb fnb = (fnb) egi.m13783i();
            if (fnb != null) {
                int position = fnb.getPosition();
                List arrayList3 = new ArrayList(fnb.getCount());
                kyVar.put(egi, arrayList3);
                if (fnb.moveToFirst()) {
                    do {
                        try {
                            arrayList3.add(fnb.mo592a());
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
