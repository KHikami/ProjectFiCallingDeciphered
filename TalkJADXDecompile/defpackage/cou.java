package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import java.util.ArrayList;
import java.util.List;
import nzr;
import oad;
import oak;
import oaq;
import obl;
import ofr;
import oft;
import ofu;
import ofw;

/* renamed from: cou */
final class cou extends euj<luy, luz> {
    private static final boolean a;
    private final Context b;
    private final int u;
    private final int v;

    protected /* synthetic */ evz a(nzf nzf) {
        return ezj.a((luz) nzf);
    }

    protected /* synthetic */ void b(nzf nzf) {
        a((luy) nzf);
    }

    static {
        kae kae = glk.l;
        a = false;
    }

    public cou(Context context, int i, fom fom, int i2, cpa cpa) {
        super(jvc.newBuilder().a(context, i).a(new juv()).a(), cpa, "conversations/sendchatmessage", fom, new luy(), new luz());
        this.u = i;
        this.b = context;
        this.v = i2;
    }

    protected void a() {
        super.a();
        a((cpa) this.e, 2);
    }

    public String b() {
        return "application/x-protobuf";
    }

    public byte[] c() {
        a((luy) this.t);
        if (a) {
            String valueOf = String.valueOf(k());
            String valueOf2 = String.valueOf(this.t);
            new StringBuilder((String.valueOf(valueOf).length() + 29) + String.valueOf(valueOf2).length()).append("getPostData of url ").append(valueOf).append(" request: ").append(valueOf2);
        }
        return nzf.a(this.t);
    }

    private void a(luy luy, cpa cpa) {
        int i;
        lqm lqm = new lqm();
        lqm.b = blo.c(cpa.c());
        if (!(gwb.a(this.b, "babel_contingency_mode_enabled", false) || cpa.k())) {
            lqm.a = euk.a(cpa.d());
        }
        if (cpa.j()) {
            i = 1;
        } else {
            i = 2;
        }
        lqm.c = Integer.valueOf(i);
        lpk lpk = new lpk();
        lpk.a = Integer.valueOf(cpa.l());
        if (cpa.m() != null) {
            lpk.b = new muu();
            lpk.b.a = cpa.m();
        }
        lqm.d = lpk;
        lqm.e = Integer.valueOf(cpa.n());
        luy.a = lqm;
        if (cpa.e() != null) {
            luy.d = new lsh();
            luy.d.a = cpa.e();
        }
        lof lof = new lof();
        lof.a = Long.valueOf(cpa.i());
        luy.requestHeader = a(new esq().a(this.u).b(this.v).a(true).a(lof).a());
    }

    private void b(luy luy, cpa cpa) {
        List arrayList = new ArrayList();
        arrayList.add(luy.c[0]);
        int i = 0;
        mjq g = cpa.g();
        int size = g.size();
        int i2 = 0;
        int i3 = 0;
        while (i3 < size) {
            loc loc;
            int i4 = i3 + 1;
            bxn bxn = (bxn) g.get(i3);
            if (i2 == 0) {
                loc = (loc) arrayList.get(0);
            } else {
                loc = new loc();
                arrayList.add(loc);
            }
            lod lod = new lod();
            lod.a = String.format("and%d", new Object[]{Integer.valueOf(i2)});
            bxo bxo = bxn.c;
            if (bxo.STICKER.equals(bxn.c)) {
                int i5;
                byg byg = (byg) bxn;
                List h = cpa.h();
                loc.b = new lsv();
                loc.b.d = lod;
                loc.b.b = new lsx();
                loc.b.b.b = byg.f;
                if (h == null || h.size() <= i) {
                    i5 = i;
                } else {
                    int i6 = i + 1;
                    loc.b.b.a = (String) h.get(i);
                    i5 = i6;
                }
                loc.b.b.d = Boolean.valueOf(true);
                i = i5;
            } else if (bxo.LOCATION.equals(bxn.c)) {
                hkh hkh = ((bxw) bxn).f;
                oad oad = new oad();
                oad.n = Double.valueOf(hkh.d().a);
                oad.o = Double.valueOf(hkh.d().b);
                nzr nzr = new nzr();
                nzr.a(oad.a, oad);
                oak oak = new oak();
                oak.c = ((dut) jyn.a(this.b, dut.class)).a(hkh);
                nzr nzr2 = new nzr();
                nzr2.a(oak.a, oak);
                obl obl = new obl();
                obl.s = hkh.b().toString();
                nzr nzr3 = new nzr();
                nzr3.a(obl.a, obl);
                loc.c = new lsq();
                loc.c.c = lod;
                loc.c.a = new oaq();
                Object charSequence = hkh.c().toString();
                if (!TextUtils.isEmpty(charSequence)) {
                    loc.c.a.e = charSequence;
                }
                loc.c.a.w = nzr2;
                loc.c.a.o = nzr;
                loc.c.a.n = nzr3;
            } else if (bxo.PLUS_PHOTO.equals(bxn.c)) {
                bye bye = (bye) bxn;
                loc.b = new lsv();
                loc.b.d = lod;
                loc.b.b = new lsx();
                loc.b.b.b = bye.f;
            }
            i3 = i4;
            i2++;
        }
        luy.c = (loc[]) arrayList.toArray(new loc[arrayList.size()]);
    }

    public void a(int i, String str, Exception exception) {
        evz d = d();
        if (d != null) {
            a((cpa) this.e, 12);
            RealTimeChatService.a(this.u, d);
        }
    }

    private void a(cpa cpa, int i) {
        ba.a(this.u, glj.b(), i, ba.c().a(cpa.d()).b(cpa.c()).d(this.p.c()));
    }

    private void a(luy luy) {
        cpa cpa = (cpa) this.e;
        euj.a(cpa.d(), true);
        a(luy, cpa);
        luy.c = new loc[1];
        luy.c[0] = new loc();
        loc loc = luy.c[0];
        List f = cpa.f();
        int size = f.size();
        if (size > 0) {
            ofu[] ofuArr = new ofu[size];
            for (int i = 0; i < size; i++) {
                fpd fpd = (fpd) f.get(i);
                ofu ofu = new ofu();
                if (fpd.b != null) {
                    ofu.b = fpd.b;
                }
                if (fpd.d != null) {
                    ofu.d = new oft();
                    ofu.d.a = fpd.d;
                    ofu.b = fpd.b;
                }
                if (fpd.c != 0) {
                    boolean z;
                    ofr ofr = new ofr();
                    ofr.a = Boolean.valueOf((fpd.c & 1) != 0);
                    if ((fpd.c & 2) != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    ofr.b = Boolean.valueOf(z);
                    if ((fpd.c & 4) != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    ofr.c = Boolean.valueOf(z);
                    if ((fpd.c & 8) != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    ofr.d = Boolean.valueOf(z);
                    ofu.c = ofr;
                }
                if (fpd.f != null || fpd.g != null) {
                    ofu.e = new ofw();
                    ofu.e.b = fpd.f;
                    ofu.e.c = fpd.g;
                }
                ofu.a = Integer.valueOf(fpd.a);
                ofuArr[i] = ofu;
            }
            loc.a = ofuArr;
        }
        b(luy, cpa);
    }
}
