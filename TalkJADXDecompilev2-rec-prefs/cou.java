package p000;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import java.util.ArrayList;
import java.util.List;

final class cou extends euj<luy, luz> {
    private static final boolean f8741a = false;
    private final Context f8742b;
    private final int f8743u;
    private final int f8744v;

    protected /* synthetic */ evz mo1045a(nzf nzf) {
        return ezj.m14806a((luz) nzf);
    }

    protected /* synthetic */ void mo1041b(nzf nzf) {
        m10585a((luy) nzf);
    }

    static {
        kae kae = glk.f15565l;
    }

    public cou(Context context, int i, fom fom, int i2, cpa cpa) {
        super(jvc.newBuilder().m25299a(context, i).m25302a(new juv()).m25298a(), cpa, "conversations/sendchatmessage", fom, new luy(), new luz());
        this.f8743u = i;
        this.f8742b = context;
        this.f8744v = i2;
    }

    protected void mo1040a() {
        super.mo1040a();
        m10584a((cpa) this.f5790e, 2);
    }

    public String mo1035b() {
        return "application/x-protobuf";
    }

    public byte[] mo1038c() {
        m10585a((luy) this.t);
        if (f8741a) {
            String valueOf = String.valueOf(mo1037k());
            String valueOf2 = String.valueOf(this.t);
            new StringBuilder((String.valueOf(valueOf).length() + 29) + String.valueOf(valueOf2).length()).append("getPostData of url ").append(valueOf).append(" request: ").append(valueOf2);
        }
        return nzf.m1029a(this.t);
    }

    private void m10586a(luy luy, cpa cpa) {
        int i;
        lqm lqm = new lqm();
        lqm.f26145b = blo.m5887c(cpa.m8180c());
        if (!(gwb.m1906a(this.f8742b, "babel_contingency_mode_enabled", false) || cpa.m8188k())) {
            lqm.f26144a = euk.m14555a(cpa.m8181d());
        }
        if (cpa.m8187j()) {
            i = 1;
        } else {
            i = 2;
        }
        lqm.f26146c = Integer.valueOf(i);
        lpk lpk = new lpk();
        lpk.f26004a = Integer.valueOf(cpa.m8189l());
        if (cpa.m8190m() != null) {
            lpk.f26005b = new muu();
            lpk.f26005b.f28411a = cpa.m8190m();
        }
        lqm.f26147d = lpk;
        lqm.f26148e = Integer.valueOf(cpa.m8191n());
        luy.f26553a = lqm;
        if (cpa.m8182e() != null) {
            luy.f26556d = new lsh();
            luy.f26556d.f26315a = cpa.m8182e();
        }
        lof lof = new lof();
        lof.f25861a = Long.valueOf(cpa.m8186i());
        luy.requestHeader = m8100a(new esq().m14381a(this.f8743u).m14384b(this.f8744v).m14383a(true).m14382a(lof).m14380a());
    }

    private void m10587b(luy luy, cpa cpa) {
        List arrayList = new ArrayList();
        arrayList.add(luy.f26555c[0]);
        int i = 0;
        mjq g = cpa.m8184g();
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
            lod.f25856a = String.format("and%d", new Object[]{Integer.valueOf(i2)});
            bxo bxo = bxn.f4741c;
            if (bxo.STICKER.equals(bxn.f4741c)) {
                int i5;
                byg byg = (byg) bxn;
                List h = cpa.m8185h();
                loc.f25851b = new lsv();
                loc.f25851b.f26349d = lod;
                loc.f25851b.f26347b = new lsx();
                loc.f25851b.f26347b.f26352b = byg.f4767f;
                if (h == null || h.size() <= i) {
                    i5 = i;
                } else {
                    int i6 = i + 1;
                    loc.f25851b.f26347b.f26351a = (String) h.get(i);
                    i5 = i6;
                }
                loc.f25851b.f26347b.f26354d = Boolean.valueOf(true);
                i = i5;
            } else if (bxo.LOCATION.equals(bxn.f4741c)) {
                hkh hkh = ((bxw) bxn).f4756f;
                oad oad = new oad();
                oad.n = Double.valueOf(hkh.mo1286d().f7681a);
                oad.o = Double.valueOf(hkh.mo1286d().f7682b);
                nzr nzr = new nzr();
                nzr.a(oad.a, oad);
                oak oak = new oak();
                oak.c = ((dut) jyn.m25426a(this.f8742b, dut.class)).mo1685a(hkh);
                nzr nzr2 = new nzr();
                nzr2.a(oak.a, oak);
                obl obl = new obl();
                obl.s = hkh.mo1284b().toString();
                nzr nzr3 = new nzr();
                nzr3.a(obl.a, obl);
                loc.f25852c = new lsq();
                loc.f25852c.f26339c = lod;
                loc.f25852c.f26337a = new oaq();
                Object charSequence = hkh.mo1285c().toString();
                if (!TextUtils.isEmpty(charSequence)) {
                    loc.f25852c.f26337a.e = charSequence;
                }
                loc.f25852c.f26337a.w = nzr2;
                loc.f25852c.f26337a.o = nzr;
                loc.f25852c.f26337a.n = nzr3;
            } else if (bxo.PLUS_PHOTO.equals(bxn.f4741c)) {
                bye bye = (bye) bxn;
                loc.f25851b = new lsv();
                loc.f25851b.f26349d = lod;
                loc.f25851b.f26347b = new lsx();
                loc.f25851b.f26347b.f26352b = bye.f4764f;
            }
            i3 = i4;
            i2++;
        }
        luy.f26555c = (loc[]) arrayList.toArray(new loc[arrayList.size()]);
    }

    public void mo1046a(int i, String str, Exception exception) {
        evz d = mo1043d();
        if (d != null) {
            m10584a((cpa) this.f5790e, 12);
            RealTimeChatService.m8998a(this.f8743u, d);
        }
    }

    private void m10584a(cpa cpa, int i) {
        ba.m4548a(this.f8743u, glj.m17963b(), i, ba.m4618c().m12789a(cpa.m8181d()).m12794b(cpa.m8180c()).m12800d(this.f5769p.m25280c()));
    }

    private void m10585a(luy luy) {
        cpa cpa = (cpa) this.f5790e;
        euj.m8097a(cpa.m8181d(), true);
        m10586a(luy, cpa);
        luy.f26555c = new loc[1];
        luy.f26555c[0] = new loc();
        loc loc = luy.f26555c[0];
        List f = cpa.m8183f();
        int size = f.size();
        if (size > 0) {
            ofu[] ofuArr = new ofu[size];
            for (int i = 0; i < size; i++) {
                fpd fpd = (fpd) f.get(i);
                ofu ofu = new ofu();
                if (fpd.f13646b != null) {
                    ofu.b = fpd.f13646b;
                }
                if (fpd.f13648d != null) {
                    ofu.d = new oft();
                    ofu.d.a = fpd.f13648d;
                    ofu.b = fpd.f13646b;
                }
                if (fpd.f13647c != 0) {
                    boolean z;
                    ofr ofr = new ofr();
                    ofr.a = Boolean.valueOf((fpd.f13647c & 1) != 0);
                    if ((fpd.f13647c & 2) != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    ofr.b = Boolean.valueOf(z);
                    if ((fpd.f13647c & 4) != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    ofr.c = Boolean.valueOf(z);
                    if ((fpd.f13647c & 8) != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    ofr.d = Boolean.valueOf(z);
                    ofu.c = ofr;
                }
                if (fpd.f13650f != null || fpd.f13651g != null) {
                    ofu.e = new ofw();
                    ofu.e.b = fpd.f13650f;
                    ofu.e.c = fpd.f13651g;
                }
                ofu.a = Integer.valueOf(fpd.f13645a);
                ofuArr[i] = ofu;
            }
            loc.f25850a = ofuArr;
        }
        m10587b(luy, cpa);
    }
}
