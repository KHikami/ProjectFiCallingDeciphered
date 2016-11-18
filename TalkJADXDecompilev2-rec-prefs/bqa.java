package p000;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

final class bqa implements bpq, kcd, kcn, kcq, kcr {
    boolean f4172a;
    boolean f4173b;
    boolean f4174c;
    final Context f4175d;
    final iid f4176e;
    final List<gmh> f4177f = new ArrayList();
    gme f4178g;
    int f4179h;
    private final gmf f4180i = new bqb(this);
    private final int f4181j;
    private final ed f4182k;
    private final String f4183l = getClass().getName();

    bqa(Context context, kbu kbu, int i, ed edVar) {
        this.f4175d = context;
        this.f4181j = i;
        this.f4182k = edVar;
        this.f4176e = ((iih) jyn.m25426a(context, iih.class)).mo1979a(((jca) jyn.m25426a(context, jca.class)).mo2317a());
        kbu.m25514a((kcq) this);
    }

    public void mo643a(Bundle bundle) {
        if (bundle != null) {
            this.f4179h = bundle.getInt("selector_dialog_title_id", 0);
            this.f4177f.clear();
            Bundle bundle2 = bundle.getBundle("selector_dialog_choices");
            if (bundle2 != null) {
                for (int i = 0; i < bundle2.size(); i++) {
                    this.f4177f.add((gmh) bundle2.getSerializable(String.valueOf(i)));
                }
            }
            if (this.f4179h > 0 && this.f4177f.size() > 1) {
                dr a = this.f4182k.mo1844a(this.f4183l);
                ew a2 = this.f4182k.mo1845a();
                if (a != null) {
                    a2.mo1527a(a);
                }
                this.f4178g = ((gmg) jyn.m25426a(this.f4175d, gmg.class)).mo2296a(this.f4175d.getResources().getString(this.f4179h), this.f4177f);
                this.f4178g.mo2297a(this.f4180i);
                this.f4178g.m7000a(a2, this.f4183l);
            }
        }
    }

    public String mo642a() {
        String valueOf = String.valueOf(getClass().getName());
        return new StringBuilder(String.valueOf(valueOf).length() + 11).append(valueOf).append(this.f4181j).toString();
    }

    public void mo645b(Bundle bundle) {
        if (this.f4179h > 0) {
            bundle.putInt("selector_dialog_title_id", this.f4179h);
        }
        if (bundle.getBundle("selector_dialog_choices") == null) {
            Bundle bundle2 = new Bundle(this.f4177f.size());
            int i = 0;
            for (gmh putSerializable : this.f4177f) {
                int i2 = i + 1;
                bundle2.putSerializable(String.valueOf(i), putSerializable);
                i = i2;
            }
            bundle.putBundle("selector_dialog_choices", bundle2);
        }
        this.f4179h = 0;
    }

    public void mo644a(bjg bjg, bxt bxt, boolean z) {
        dwr dwr = (dwr) jyn.m25426a(this.f4175d, dwr.class);
        this.f4172a = dwr.mo1743a(bxt, z);
        this.f4174c = dwr.mo1741a(bjg, bxt, z);
        this.f4173b = dwr.mo1742a(bjg, z);
        if (z) {
            this.f4179h = gwb.jz;
            String str = "An invited contact must have at least a phone number or email address";
            boolean z2 = bjg.mo568b().isEmpty() && bjg.mo570d().isEmpty();
            iil.m21879b(str, z2);
            if (this.f4174c) {
                this.f4179h = gwb.jB;
            }
        } else {
            switch (bqc.f4185a[bxt.ordinal()]) {
                case 1:
                    this.f4179h = gwb.jy;
                    break;
                case 2:
                    this.f4179h = gwb.jB;
                    break;
                case 3:
                    this.f4179h = gwb.jG;
                    break;
                case 4:
                    this.f4179h = gwb.jF;
                    break;
                default:
                    String valueOf = String.valueOf(bxt);
                    throw new IllegalArgumentException(new StringBuilder(String.valueOf(valueOf).length() + 27).append("Unknown conversation type: ").append(valueOf).toString());
            }
        }
        List b = dwr.mo1744b(bjg, bxt, z);
        m6386a(b, bjg, bxt);
        iil.m21879b("No contact details found", b.isEmpty());
        if (b.size() == 1) {
            this.f4176e.mo1693b().mo1714c(3069);
            ((bpr) jyn.m25426a(this.f4175d, bpr.class)).mo659a((bjd) b.get(0), bps.f4164a);
            return;
        }
        this.f4176e.mo1693b().mo1714c(2510);
        if (this.f4172a) {
            this.f4176e.mo1693b().mo1714c(2554);
        }
        if (this.f4174c) {
            this.f4176e.mo1693b().mo1714c(2557);
        }
        if (this.f4173b) {
            this.f4176e.mo1693b().mo1714c(2560);
        }
        this.f4178g = ((gmg) jyn.m25426a(this.f4175d, gmg.class)).mo2296a(this.f4175d.getResources().getString(this.f4179h), this.f4177f);
        this.f4178g.mo2297a(this.f4180i);
        this.f4178g.mo2341a(this.f4182k, this.f4183l);
    }

    private void m6386a(List<bjd> list, bjg bjg, bxt bxt) {
        this.f4177f.clear();
        for (bjd bjd : list) {
            Object gmh;
            List list2 = this.f4177f;
            Serializable serializable;
            String c;
            String str;
            if (bjd instanceof bjf) {
                String str2;
                serializable = (bjf) bjd;
                CharSequence f = serializable.m5376f();
                CharSequence e = bjg.mo571e();
                if (!TextUtils.isEmpty(f)) {
                    e = f;
                } else if (TextUtils.isEmpty(e)) {
                    e = null;
                }
                List d = serializable.m5374d();
                List c2 = serializable.m5373c();
                c = d.isEmpty() ? null : ((bje) d.get(0)).m5365c();
                String c3 = c2.isEmpty() ? null : ((bjo) c2.get(0)).m5473c();
                if (c != null) {
                    c3 = c;
                } else if (c3 != null) {
                    c3 = glq.m18038i(this.f4175d, c3);
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
                    c3 = String.valueOf(glk.m17974b(serializable.m5371b()));
                    glk.m17970a(str, c3.length() != 0 ? c.concat(c3) : new String(c), new Object[0]);
                    c3 = this.f4175d.getResources().getString(gwb.jD);
                }
                str = serializable.m5375e();
                if (TextUtils.isEmpty(str)) {
                    str = bjg.mo572f();
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
                c = serializable.m5472b();
                str = glq.m18038i(this.f4175d, serializable.m5473c());
                if (TextUtils.isEmpty(c)) {
                    c = str;
                    str = null;
                }
                r0 = new gmh(c, str, i, serializable);
            } else if (bjd instanceof bje) {
                serializable = (bje) bjd;
                r0 = new gmh(serializable.m5364b(), serializable.m5365c(), gwb.js, serializable);
            } else {
                String valueOf = String.valueOf(bjd);
                throw new IllegalArgumentException(new StringBuilder(String.valueOf(valueOf).length() + 56).append("Cannot convert unknown contact detail type to ListItem: ").append(valueOf).toString());
            }
            list2.add(gmh);
        }
    }
}
