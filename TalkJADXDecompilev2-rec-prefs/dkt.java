package p000;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

final class dkt extends fip implements fqy {
    private static final boolean f10033a = false;
    private final Context f10034b;
    private final did f10035c;
    private final Map<edk, bke> f10036d = new HashMap();
    private final Map<bke, edk> f10037e = new HashMap();
    private final Map<iqo, bke> f10038f = new HashMap();
    private final Map<bke, iqo> f10039g = new HashMap();
    private final ArrayList<edk> f10040h = new ArrayList();
    private final Map<Integer, String> f10041i = new HashMap();
    private final Map<String, Integer> f10042j = new HashMap();
    private final ArrayList<dii> f10043k = new ArrayList();
    private final edk f10044l;

    static {
        kae kae = glk.f15567n;
    }

    dkt(Context context, did did, edk edk) {
        this.f10034b = context;
        this.f10035c = did;
        this.f10044l = edk;
        m12143a(this.f10044l);
    }

    void m12154a(List<edk> list) {
        iil.m21867a();
        bko k = this.f10035c.m11989k();
        if (k == null) {
            glk.m17982e("Babel_PSTN_META", "Unexpected null account in handleOutgoingInvite", new Object[0]);
            return;
        }
        for (edk edk : list) {
            if (!(edk == null || edk.f11212a != edq.PHONE || TextUtils.isEmpty(edk.f11214c))) {
                m12143a(edk);
                String c = glq.m18012c(this.f10034b, edk.f11214c);
                if (c != null) {
                    RealTimeChatService.m9040a((fip) this);
                    fme a = ((fmf) jyn.m25426a(this.f10034b, fmf.class)).mo2035a();
                    int a2 = a.m15674a();
                    this.f10041i.put(Integer.valueOf(a2), c);
                    this.f10042j.put(c, Integer.valueOf(a2));
                    RealTimeChatService.m9101d(a, k.m5638g(), c);
                    if (f10033a) {
                        new StringBuilder(String.valueOf(c).length() + 43).append("requesting rate for ").append(c).append(" request id=").append(a2);
                    }
                }
            }
        }
    }

    void m12151a(iqo iqo) {
        edk c = m12145c(iqo);
        String valueOf;
        if (c != null) {
            if (f10033a) {
                String str = "Pending entity not null, moving participant request to endpoint ep=";
                valueOf = String.valueOf(iqo.m22953b());
                if (valueOf.length() != 0) {
                    str.concat(valueOf);
                } else {
                    valueOf = new String(str);
                }
            }
            bke bke = (bke) this.f10036d.remove(c);
            this.f10037e.remove(bke);
            this.f10038f.put(iqo, bke);
            this.f10039g.put(bke, iqo);
            return;
        }
        edk d = m12146d(iqo);
        if (f10033a) {
            valueOf = String.valueOf(iqo.m22953b());
            String str2 = d == null ? " and no resolved request" : " now attaching data";
            new StringBuilder((String.valueOf(valueOf).length() + 26) + String.valueOf(str2).length()).append("no pending request for ep=").append(valueOf).append(str2);
        }
        if (d != null) {
            iil.m21874a("Expected condition to be true", d.m13597g());
            iqo.m22950a(new dks(d.f11216e, d.f11214c, d.f11219h, d.f11234w));
            dkt.m12144a(d.f11230s);
        }
    }

    void m12155b(iqo iqo) {
        String valueOf;
        String str;
        String str2;
        iil.m21867a();
        String str3 = null;
        bke bke;
        if (this.f10038f.containsKey(iqo)) {
            bke = (bke) this.f10038f.get(iqo);
            fbt d = bke.m5576d();
            if (d != null) {
                str3 = d.f12661d;
            }
            if (f10033a) {
                valueOf = String.valueOf(bke.mo594c());
                new StringBuilder((String.valueOf(valueOf).length() + 43) + String.valueOf(str3).length()).append("Endpoint exits, cancelling request id=").append(valueOf).append(", ph=").append(str3);
            }
            bke.mo607b();
            this.f10038f.remove(iqo);
            this.f10039g.remove(bke);
            str = str3;
        } else {
            edk c = m12145c(iqo);
            if (c != null) {
                str3 = c.f11214c;
                bke = (bke) this.f10036d.remove(c);
                if (f10033a) {
                    valueOf = String.valueOf(bke.mo594c());
                    new StringBuilder((String.valueOf(valueOf).length() + 68) + String.valueOf(str3).length()).append("Endpoint exits, has pending participant, cancelling request id=").append(valueOf).append(", ph=").append(str3);
                }
                this.f10037e.remove(bke);
                bke.mo607b();
                str = str3;
            } else {
                c = m12146d(iqo);
                if (c != null) {
                    str3 = c.f11214c;
                    this.f10040h.remove(c);
                    if (f10033a) {
                        str2 = "Endpoint exits, removing resolved participant, ph=";
                        valueOf = String.valueOf(str3);
                        if (valueOf.length() != 0) {
                            str2.concat(valueOf);
                            str = str3;
                        } else {
                            valueOf = new String(str2);
                        }
                    }
                    str = str3;
                } else {
                    str = null;
                }
            }
        }
        if (str != null) {
            String c2 = glq.m18012c(this.f10034b, str);
            if (this.f10042j.containsKey(c2)) {
                Integer num = (Integer) this.f10042j.remove(c2);
                if (f10033a) {
                    str3 = String.valueOf(num);
                    new StringBuilder((String.valueOf(str3).length() + 62) + String.valueOf(str).length()).append("Endpoint exits, removing pending rate request, requestId=").append(str3).append(", ph=").append(str);
                }
                this.f10041i.remove(num);
                if (this.f10041i.isEmpty()) {
                    RealTimeChatService.m9077b((fip) this);
                }
            } else if (c2 != null) {
                ArrayList arrayList = this.f10043k;
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    dii dii = (dii) obj;
                    if (c2.equals(dii.m12005a())) {
                        if (f10033a) {
                            str2 = "Endpoint exits, removing resolved rate request, ph=";
                            valueOf = String.valueOf(str);
                            if (valueOf.length() != 0) {
                                str2.concat(valueOf);
                            } else {
                                valueOf = new String(str2);
                            }
                        }
                        this.f10043k.remove(dii);
                        dkt.m12147f();
                        return;
                    }
                }
            }
        }
    }

    void m12156d() {
        if (f10033a) {
            int size = this.f10036d.size();
            int size2 = this.f10038f.size();
            int size3 = this.f10040h.size();
            int size4 = this.f10041i.size();
            new StringBuilder(148).append("Hangout ended, sizes for pending reqPart=").append(size).append(", pending reqEP=").append(size2).append(", resolvedPart=").append(size3).append(", rateReq=").append(size4).append(", callinfo=").append(this.f10043k.size());
        }
        for (bke b : this.f10036d.values()) {
            b.mo607b();
        }
        for (bke b2 : this.f10038f.values()) {
            b2.mo607b();
        }
        this.f10036d.clear();
        this.f10037e.clear();
        this.f10038f.clear();
        this.f10039g.clear();
        this.f10040h.clear();
        this.f10041i.clear();
        this.f10042j.clear();
        this.f10043k.clear();
        dkt.m12147f();
        RealTimeChatService.m9077b((fip) this);
    }

    public void mo610a(int i, bko bko, fiu fiu) {
        iil.m21867a();
        if (f10033a) {
            new StringBuilder(54).append("received response for ").append(i).append(", was_requested=").append(this.f10041i.containsKey(Integer.valueOf(i)));
        }
        if (this.f10041i.containsKey(Integer.valueOf(i))) {
            String str = (String) this.f10041i.get(Integer.valueOf(i));
            m12142a(i);
            if (this.f10035c != null && bko.equals(this.f10035c.m11989k())) {
                evz c = fiu.m15392c();
                iil.m21874a("Expected condition to be true", c instanceof exc);
                exc exc = (exc) c;
                String k = exc.m14738l() ? null : exc.m14737k();
                this.f10043k.add(new dii(str, k));
                if (f10033a) {
                    new StringBuilder((String.valueOf(str).length() + 29) + String.valueOf(k).length()).append("valid response for ph=").append(str).append(", rate=").append(k);
                }
                dkt.m12147f();
            }
        }
    }

    public void mo640a(int i, bko bko, fok fok, fdo fdo) {
        if (f10033a) {
            String str = this.f10041i.containsKey(Integer.valueOf(i)) ? "" : " not";
            new StringBuilder(String.valueOf(str).length() + 52).append("request failed, id=").append(i).append(", will").append(str).append(" remove request.");
        }
        if (this.f10041i.containsKey(Integer.valueOf(i))) {
            m12142a(i);
        }
    }

    private void m12142a(int i) {
        String str = (String) this.f10041i.remove(Integer.valueOf(i));
        this.f10042j.remove(str);
        if (f10033a) {
            String str2 = this.f10041i.isEmpty() ? ", list empty, stop listening" : "";
            new StringBuilder((String.valueOf(str).length() + 39) + String.valueOf(str2).length()).append("removed request, id=").append(i).append(" for ph=").append(str).append(str2);
        }
        if (this.f10041i.isEmpty()) {
            RealTimeChatService.m9077b((fip) this);
        }
    }

    List<dii> m12157e() {
        iil.m21867a();
        return this.f10043k;
    }

    private void m12143a(edk edk) {
        if (edk != null && edk.f11212a == edq.PHONE && !TextUtils.isEmpty(edk.f11214c)) {
            String str;
            String valueOf;
            if (edk.f11231t) {
                this.f10040h.add(edk);
                if (f10033a) {
                    str = "participant is resolved, ph=";
                    valueOf = String.valueOf(edk.f11214c);
                    if (valueOf.length() != 0) {
                        str.concat(valueOf);
                        return;
                    } else {
                        valueOf = new String(str);
                        return;
                    }
                }
                return;
            }
            bke a = fqu.m15999a(edk.f11214c, false, this.f10035c.m11989k(), this);
            if (a != null) {
                this.f10036d.put(edk, a);
                this.f10037e.put(a, edk);
                if (f10033a) {
                    str = "sending participant request for ph=";
                    valueOf = String.valueOf(edk.f11214c);
                    if (valueOf.length() != 0) {
                        str.concat(valueOf);
                    } else {
                        valueOf = new String(str);
                    }
                }
            }
        }
    }

    private edk m12145c(iqo iqo) {
        if (iqo instanceof iqu) {
            String str;
            iqu iqu = (iqu) iqo;
            for (edk edk : this.f10036d.keySet()) {
                if (gwb.m2302m(edk.f11230s, iqu.m22979s())) {
                    if (!f10033a) {
                        return edk;
                    }
                    str = "found participant request for endpoint, name=";
                    String valueOf = String.valueOf(iqo.m22953b());
                    if (valueOf.length() != 0) {
                        str.concat(valueOf);
                        return edk;
                    }
                    valueOf = new String(str);
                    return edk;
                }
            }
            if (f10033a) {
                str = "didn't find participant request for endpoint, name=";
                String valueOf2 = String.valueOf(iqo.m22953b());
                if (valueOf2.length() != 0) {
                    str.concat(valueOf2);
                } else {
                    valueOf2 = new String(str);
                }
            }
        }
        return null;
    }

    private edk m12146d(iqo iqo) {
        if (iqo instanceof iqu) {
            String str;
            String valueOf;
            iqu iqu = (iqu) iqo;
            ArrayList arrayList = this.f10040h;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                edk edk = (edk) obj;
                if (gwb.m2302m(edk.f11230s, iqu.m22979s())) {
                    if (!f10033a) {
                        return edk;
                    }
                    str = "found resolved participant for endpoint, name=";
                    valueOf = String.valueOf(iqo.m22953b());
                    if (valueOf.length() != 0) {
                        str.concat(valueOf);
                        return edk;
                    }
                    valueOf = new String(str);
                    return edk;
                }
            }
            if (f10033a) {
                str = "didn't find resolved participant for endpoint, name=";
                valueOf = String.valueOf(iqo.m22953b());
                if (valueOf.length() != 0) {
                    str.concat(valueOf);
                } else {
                    valueOf = new String(str);
                }
            }
        }
        return null;
    }

    private static void m12144a(String str) {
        for (itg b : dgg.m11692a().m11731w()) {
            b.mo1591b(str);
        }
    }

    private static void m12147f() {
        iil.m21867a();
        for (itg g : dgg.m11692a().m11731w()) {
            g.mo1562g();
        }
    }

    public void mo1118a(String str, String str2, bke bke, String str3, bko bko) {
        glk.m17982e("Babel_PSTN_META", "didn't request non-PSTN contact info!", new Object[0]);
    }

    public void mo1114a(bke bke) {
        String str;
        String valueOf;
        if (f10033a) {
            str = "contact info failed for request=";
            valueOf = String.valueOf(bke.mo594c());
            if (valueOf.length() != 0) {
                str.concat(valueOf);
            } else {
                valueOf = new String(str);
            }
        }
        if (this.f10037e.containsKey(bke)) {
            edk edk = (edk) this.f10037e.remove(bke);
            this.f10036d.remove(edk);
            if (f10033a) {
                valueOf = "removed waiting entity, name=";
                str = String.valueOf(edk.f11216e);
                if (str.length() != 0) {
                    valueOf.concat(str);
                } else {
                    str = new String(valueOf);
                }
            }
        } else if (this.f10039g.containsKey(bke)) {
            iqo iqo = (iqo) this.f10039g.remove(bke);
            this.f10038f.remove(iqo);
            if (f10033a) {
                valueOf = "removed waiting endpoint, name=";
                str = String.valueOf(iqo.m22953b());
                if (str.length() != 0) {
                    valueOf.concat(str);
                } else {
                    str = new String(valueOf);
                }
            }
        }
    }

    public void mo1117a(String str, String str2, int i, bol bol, bko bko) {
        String valueOf;
        if (f10033a) {
            String str3 = "set PSTN contact info for name=";
            valueOf = String.valueOf(str);
            if (valueOf.length() != 0) {
                str3.concat(valueOf);
            } else {
                valueOf = new String(str3);
            }
        }
        String valueOf2;
        if (this.f10037e.containsKey(bol)) {
            edk edk = (edk) this.f10037e.remove(bol);
            this.f10036d.remove(edk);
            edk.f11216e = str;
            edk.f11219h = str2;
            edk.f11231t = true;
            edk.f11234w = i;
            if (f10033a) {
                valueOf = "resolved participant, but no endpoint yet. name=";
                valueOf2 = String.valueOf(str);
                if (valueOf2.length() != 0) {
                    valueOf.concat(valueOf2);
                } else {
                    valueOf2 = new String(valueOf);
                }
            }
            this.f10040h.add(edk);
            dkt.m12144a(edk.f11230s);
        } else if (this.f10039g.containsKey(bol)) {
            iqu iqu = (iqu) this.f10039g.remove(bol);
            this.f10038f.remove(iqu);
            valueOf = bol.m6300e();
            if (this.f10044l != null && gwb.m2302m(this.f10044l.f11230s, iqu.m22979s())) {
                valueOf = this.f10044l.m13596f();
            }
            if (f10033a) {
                valueOf2 = String.valueOf(iqu.m22953b());
                new StringBuilder(((String.valueOf(str).length() + 51) + String.valueOf(valueOf2).length()) + String.valueOf(valueOf).length()).append("resolved participant, has endpoint. name=").append(str).append(", ep=").append(valueOf2).append(", ph=").append(valueOf);
            }
            iqu.m22950a((Object) new dks(str, valueOf, str2, i));
            dkt.m12144a(iqu.m22979s());
        }
    }
}
