package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

final class bqa implements bpq, kcd, kcn, kcq, kcr {
    boolean a;
    boolean b;
    boolean c;
    final Context d;
    final iid e;
    final List<gmh> f = new ArrayList();
    gme g;
    int h;
    private final gmf i = new bqb(this);
    private final int j;
    private final ed k;
    private final String l = getClass().getName();

    bqa(Context context, kbu kbu, int i, ed edVar) {
        this.d = context;
        this.j = i;
        this.k = edVar;
        this.e = ((iih) jyn.a(context, iih.class)).a(((jca) jyn.a(context, jca.class)).a());
        kbu.a((kcq) this);
    }

    public void a(Bundle bundle) {
        if (bundle != null) {
            this.h = bundle.getInt("selector_dialog_title_id", 0);
            this.f.clear();
            Bundle bundle2 = bundle.getBundle("selector_dialog_choices");
            if (bundle2 != null) {
                for (int i = 0; i < bundle2.size(); i++) {
                    this.f.add((gmh) bundle2.getSerializable(String.valueOf(i)));
                }
            }
            if (this.h > 0 && this.f.size() > 1) {
                dr a = this.k.a(this.l);
                ew a2 = this.k.a();
                if (a != null) {
                    a2.a(a);
                }
                this.g = ((gmg) jyn.a(this.d, gmg.class)).a(this.d.getResources().getString(this.h), this.f);
                this.g.a(this.i);
                this.g.a(a2, this.l);
            }
        }
    }

    public String a() {
        String valueOf = String.valueOf(getClass().getName());
        return new StringBuilder(String.valueOf(valueOf).length() + 11).append(valueOf).append(this.j).toString();
    }

    public void b(Bundle bundle) {
        if (this.h > 0) {
            bundle.putInt("selector_dialog_title_id", this.h);
        }
        if (bundle.getBundle("selector_dialog_choices") == null) {
            Bundle bundle2 = new Bundle(this.f.size());
            int i = 0;
            for (gmh putSerializable : this.f) {
                int i2 = i + 1;
                bundle2.putSerializable(String.valueOf(i), putSerializable);
                i = i2;
            }
            bundle.putBundle("selector_dialog_choices", bundle2);
        }
        this.h = 0;
    }

    public void a(bjg bjg, bxt bxt, boolean z) {
        dwr dwr = (dwr) jyn.a(this.d, dwr.class);
        this.a = dwr.a(bxt, z);
        this.c = dwr.a(bjg, bxt, z);
        this.b = dwr.a(bjg, z);
        if (z) {
            this.h = gwb.jz;
            String str = "An invited contact must have at least a phone number or email address";
            boolean z2 = bjg.b().isEmpty() && bjg.d().isEmpty();
            iil.b(str, z2);
            if (this.c) {
                this.h = gwb.jB;
            }
        } else {
            switch (bqc.a[bxt.ordinal()]) {
                case 1:
                    this.h = gwb.jy;
                    break;
                case 2:
                    this.h = gwb.jB;
                    break;
                case 3:
                    this.h = gwb.jG;
                    break;
                case 4:
                    this.h = gwb.jF;
                    break;
                default:
                    String valueOf = String.valueOf(bxt);
                    throw new IllegalArgumentException(new StringBuilder(String.valueOf(valueOf).length() + 27).append("Unknown conversation type: ").append(valueOf).toString());
            }
        }
        List b = dwr.b(bjg, bxt, z);
        a(b, bjg, bxt);
        iil.b("No contact details found", b.isEmpty());
        if (b.size() == 1) {
            this.e.b().c(3069);
            ((bpr) jyn.a(this.d, bpr.class)).a((bjd) b.get(0), bps.a);
            return;
        }
        this.e.b().c(2510);
        if (this.a) {
            this.e.b().c(2554);
        }
        if (this.c) {
            this.e.b().c(2557);
        }
        if (this.b) {
            this.e.b().c(2560);
        }
        this.g = ((gmg) jyn.a(this.d, gmg.class)).a(this.d.getResources().getString(this.h), this.f);
        this.g.a(this.i);
        this.g.a(this.k, this.l);
    }

    private void a(List<bjd> list, bjg bjg, bxt bxt) {
        this.f.clear();
        for (bjd bjd : list) {
            Object gmh;
            List list2 = this.f;
            Serializable serializable;
            String c;
            String str;
            if (bjd instanceof bjf) {
                String str2;
                serializable = (bjf) bjd;
                CharSequence f = serializable.f();
                CharSequence e = bjg.e();
                if (!TextUtils.isEmpty(f)) {
                    e = f;
                } else if (TextUtils.isEmpty(e)) {
                    e = null;
                }
                List d = serializable.d();
                List c2 = serializable.c();
                c = d.isEmpty() ? null : ((bje) d.get(0)).c();
                String c3 = c2.isEmpty() ? null : ((bjo) c2.get(0)).c();
                if (c != null) {
                    c3 = c;
                } else if (c3 != null) {
                    c3 = glq.i(this.d, c3);
                } else {
                    c3 = null;
                }
                if (e != null) {
                    str2 = c3;
                    c3 = e;
                } else {
                    str2 = null;
                }
                if (c3 == null) {
                    str = "Babel_ConvCreator";
                    c = "No metadata for contact with gaia id: ";
                    c3 = String.valueOf(glk.b(serializable.b()));
                    glk.a(str, c3.length() != 0 ? c.concat(c3) : new String(c), new Object[0]);
                    c3 = this.d.getResources().getString(gwb.jD);
                }
                str = serializable.e();
                if (TextUtils.isEmpty(str)) {
                    str = bjg.f();
                }
                gmh = new gmh(c3, str2, str, serializable);
            } else if (bjd instanceof bjo) {
                int i;
                serializable = (bjo) bjd;
                if (bxt == bxt.AUDIO_CALL) {
                    i = gwb.jt;
                } else {
                    i = gwb.ju;
                }
                c = serializable.b();
                str = glq.i(this.d, serializable.c());
                if (TextUtils.isEmpty(c)) {
                    c = str;
                    str = null;
                }
                r0 = new gmh(c, str, i, serializable);
            } else if (bjd instanceof bje) {
                serializable = (bje) bjd;
                r0 = new gmh(serializable.b(), serializable.c(), gwb.js, serializable);
            } else {
                String valueOf = String.valueOf(bjd);
                throw new IllegalArgumentException(new StringBuilder(String.valueOf(valueOf).length() + 56).append("Cannot convert unknown contact detail type to ListItem: ").append(valueOf).toString());
            }
            list2.add(gmh);
        }
    }
}
