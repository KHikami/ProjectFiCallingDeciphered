import android.content.Context;
import android.text.TextUtils;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

final class dkt extends fip implements fqy {
    private static final boolean a;
    private final Context b;
    private final did c;
    private final Map<edk, bke> d;
    private final Map<bke, edk> e;
    private final Map<iqo, bke> f;
    private final Map<bke, iqo> g;
    private final ArrayList<edk> h;
    private final Map<Integer, String> i;
    private final Map<String, Integer> j;
    private final ArrayList<dii> k;
    private final edk l;

    static {
        kae kae = glk.n;
        a = false;
    }

    dkt(Context context, did did, edk edk) {
        this.d = new HashMap();
        this.e = new HashMap();
        this.f = new HashMap();
        this.g = new HashMap();
        this.h = new ArrayList();
        this.i = new HashMap();
        this.j = new HashMap();
        this.k = new ArrayList();
        this.b = context;
        this.c = did;
        this.l = edk;
        a(this.l);
    }

    void a(List<edk> list) {
        iil.a();
        bko k = this.c.k();
        if (k == null) {
            glk.e("Babel_PSTN_META", "Unexpected null account in handleOutgoingInvite", new Object[0]);
            return;
        }
        for (edk edk : list) {
            if (!(edk == null || edk.a != edq.PHONE || TextUtils.isEmpty(edk.c))) {
                a(edk);
                String c = glq.c(this.b, edk.c);
                if (c != null) {
                    RealTimeChatService.a((fip) this);
                    fme a = ((fmf) jyn.a(this.b, fmf.class)).a();
                    int a2 = a.a();
                    this.i.put(Integer.valueOf(a2), c);
                    this.j.put(c, Integer.valueOf(a2));
                    RealTimeChatService.d(a, k.g(), c);
                    if (a) {
                        new StringBuilder(String.valueOf(c).length() + 43).append("requesting rate for ").append(c).append(" request id=").append(a2);
                    }
                }
            }
        }
    }

    void a(iqo iqo) {
        edk c = c(iqo);
        String valueOf;
        if (c != null) {
            if (a) {
                String str = "Pending entity not null, moving participant request to endpoint ep=";
                valueOf = String.valueOf(iqo.b());
                if (valueOf.length() != 0) {
                    str.concat(valueOf);
                } else {
                    valueOf = new String(str);
                }
            }
            bke bke = (bke) this.d.remove(c);
            this.e.remove(bke);
            this.f.put(iqo, bke);
            this.g.put(bke, iqo);
            return;
        }
        edk d = d(iqo);
        if (a) {
            valueOf = String.valueOf(iqo.b());
            String str2 = d == null ? " and no resolved request" : " now attaching data";
            new StringBuilder((String.valueOf(valueOf).length() + 26) + String.valueOf(str2).length()).append("no pending request for ep=").append(valueOf).append(str2);
        }
        if (d != null) {
            iil.a("Expected condition to be true", d.g());
            iqo.a(new dks(d.e, d.c, d.h, d.w));
            a(d.s);
        }
    }

    void b(iqo iqo) {
        String valueOf;
        String str;
        String str2;
        iil.a();
        String str3 = null;
        bke bke;
        if (this.f.containsKey(iqo)) {
            bke = (bke) this.f.get(iqo);
            fbt d = bke.d();
            if (d != null) {
                str3 = d.d;
            }
            if (a) {
                valueOf = String.valueOf(bke.c());
                new StringBuilder((String.valueOf(valueOf).length() + 43) + String.valueOf(str3).length()).append("Endpoint exits, cancelling request id=").append(valueOf).append(", ph=").append(str3);
            }
            bke.b();
            this.f.remove(iqo);
            this.g.remove(bke);
            str = str3;
        } else {
            edk c = c(iqo);
            if (c != null) {
                str3 = c.c;
                bke = (bke) this.d.remove(c);
                if (a) {
                    valueOf = String.valueOf(bke.c());
                    new StringBuilder((String.valueOf(valueOf).length() + 68) + String.valueOf(str3).length()).append("Endpoint exits, has pending participant, cancelling request id=").append(valueOf).append(", ph=").append(str3);
                }
                this.e.remove(bke);
                bke.b();
                str = str3;
            } else {
                c = d(iqo);
                if (c != null) {
                    str3 = c.c;
                    this.h.remove(c);
                    if (a) {
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
            String c2 = glq.c(this.b, str);
            if (this.j.containsKey(c2)) {
                Integer num = (Integer) this.j.remove(c2);
                if (a) {
                    str3 = String.valueOf(num);
                    new StringBuilder((String.valueOf(str3).length() + 62) + String.valueOf(str).length()).append("Endpoint exits, removing pending rate request, requestId=").append(str3).append(", ph=").append(str);
                }
                this.i.remove(num);
                if (this.i.isEmpty()) {
                    RealTimeChatService.b((fip) this);
                }
            } else if (c2 != null) {
                ArrayList arrayList = this.k;
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    dii dii = (dii) obj;
                    if (c2.equals(dii.a())) {
                        if (a) {
                            str2 = "Endpoint exits, removing resolved rate request, ph=";
                            valueOf = String.valueOf(str);
                            if (valueOf.length() != 0) {
                                str2.concat(valueOf);
                            } else {
                                valueOf = new String(str2);
                            }
                        }
                        this.k.remove(dii);
                        f();
                        return;
                    }
                }
            }
        }
    }

    void d() {
        if (a) {
            int size = this.d.size();
            int size2 = this.f.size();
            int size3 = this.h.size();
            int size4 = this.i.size();
            new StringBuilder(148).append("Hangout ended, sizes for pending reqPart=").append(size).append(", pending reqEP=").append(size2).append(", resolvedPart=").append(size3).append(", rateReq=").append(size4).append(", callinfo=").append(this.k.size());
        }
        for (bke b : this.d.values()) {
            b.b();
        }
        for (bke b2 : this.f.values()) {
            b2.b();
        }
        this.d.clear();
        this.e.clear();
        this.f.clear();
        this.g.clear();
        this.h.clear();
        this.i.clear();
        this.j.clear();
        this.k.clear();
        f();
        RealTimeChatService.b((fip) this);
    }

    public void a(int i, bko bko, fiu fiu) {
        iil.a();
        if (a) {
            new StringBuilder(54).append("received response for ").append(i).append(", was_requested=").append(this.i.containsKey(Integer.valueOf(i)));
        }
        if (this.i.containsKey(Integer.valueOf(i))) {
            String str = (String) this.i.get(Integer.valueOf(i));
            a(i);
            if (this.c != null && bko.equals(this.c.k())) {
                evz c = fiu.c();
                iil.a("Expected condition to be true", c instanceof exc);
                exc exc = (exc) c;
                String k = exc.l() ? null : exc.k();
                this.k.add(new dii(str, k));
                if (a) {
                    new StringBuilder((String.valueOf(str).length() + 29) + String.valueOf(k).length()).append("valid response for ph=").append(str).append(", rate=").append(k);
                }
                f();
            }
        }
    }

    public void a(int i, bko bko, fok fok, fdo fdo) {
        if (a) {
            String str = this.i.containsKey(Integer.valueOf(i)) ? "" : " not";
            new StringBuilder(String.valueOf(str).length() + 52).append("request failed, id=").append(i).append(", will").append(str).append(" remove request.");
        }
        if (this.i.containsKey(Integer.valueOf(i))) {
            a(i);
        }
    }

    private void a(int i) {
        String str = (String) this.i.remove(Integer.valueOf(i));
        this.j.remove(str);
        if (a) {
            String str2 = this.i.isEmpty() ? ", list empty, stop listening" : "";
            new StringBuilder((String.valueOf(str).length() + 39) + String.valueOf(str2).length()).append("removed request, id=").append(i).append(" for ph=").append(str).append(str2);
        }
        if (this.i.isEmpty()) {
            RealTimeChatService.b((fip) this);
        }
    }

    List<dii> e() {
        iil.a();
        return this.k;
    }

    private void a(edk edk) {
        if (edk != null && edk.a == edq.PHONE && !TextUtils.isEmpty(edk.c)) {
            String str;
            String valueOf;
            if (edk.t) {
                this.h.add(edk);
                if (a) {
                    str = "participant is resolved, ph=";
                    valueOf = String.valueOf(edk.c);
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
            bke a = fqu.a(edk.c, false, this.c.k(), this);
            if (a != null) {
                this.d.put(edk, a);
                this.e.put(a, edk);
                if (a) {
                    str = "sending participant request for ph=";
                    valueOf = String.valueOf(edk.c);
                    if (valueOf.length() != 0) {
                        str.concat(valueOf);
                    } else {
                        valueOf = new String(str);
                    }
                }
            }
        }
    }

    private edk c(iqo iqo) {
        if (iqo instanceof iqu) {
            String str;
            iqu iqu = (iqu) iqo;
            for (edk edk : this.d.keySet()) {
                if (gwb.m(edk.s, iqu.s())) {
                    if (!a) {
                        return edk;
                    }
                    str = "found participant request for endpoint, name=";
                    String valueOf = String.valueOf(iqo.b());
                    if (valueOf.length() != 0) {
                        str.concat(valueOf);
                        return edk;
                    }
                    valueOf = new String(str);
                    return edk;
                }
            }
            if (a) {
                str = "didn't find participant request for endpoint, name=";
                String valueOf2 = String.valueOf(iqo.b());
                if (valueOf2.length() != 0) {
                    str.concat(valueOf2);
                } else {
                    valueOf2 = new String(str);
                }
            }
        }
        return null;
    }

    private edk d(iqo iqo) {
        if (iqo instanceof iqu) {
            String str;
            String valueOf;
            iqu iqu = (iqu) iqo;
            ArrayList arrayList = this.h;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                edk edk = (edk) obj;
                if (gwb.m(edk.s, iqu.s())) {
                    if (!a) {
                        return edk;
                    }
                    str = "found resolved participant for endpoint, name=";
                    valueOf = String.valueOf(iqo.b());
                    if (valueOf.length() != 0) {
                        str.concat(valueOf);
                        return edk;
                    }
                    valueOf = new String(str);
                    return edk;
                }
            }
            if (a) {
                str = "didn't find resolved participant for endpoint, name=";
                valueOf = String.valueOf(iqo.b());
                if (valueOf.length() != 0) {
                    str.concat(valueOf);
                } else {
                    valueOf = new String(str);
                }
            }
        }
        return null;
    }

    private static void a(String str) {
        for (itg b : dgg.a().w()) {
            b.b(str);
        }
    }

    private static void f() {
        iil.a();
        for (itg g : dgg.a().w()) {
            g.g();
        }
    }

    public void a(String str, String str2, bke bke, String str3, bko bko) {
        glk.e("Babel_PSTN_META", "didn't request non-PSTN contact info!", new Object[0]);
    }

    public void a(bke bke) {
        String str;
        String valueOf;
        if (a) {
            str = "contact info failed for request=";
            valueOf = String.valueOf(bke.c());
            if (valueOf.length() != 0) {
                str.concat(valueOf);
            } else {
                valueOf = new String(str);
            }
        }
        if (this.e.containsKey(bke)) {
            edk edk = (edk) this.e.remove(bke);
            this.d.remove(edk);
            if (a) {
                valueOf = "removed waiting entity, name=";
                str = String.valueOf(edk.e);
                if (str.length() != 0) {
                    valueOf.concat(str);
                } else {
                    str = new String(valueOf);
                }
            }
        } else if (this.g.containsKey(bke)) {
            iqo iqo = (iqo) this.g.remove(bke);
            this.f.remove(iqo);
            if (a) {
                valueOf = "removed waiting endpoint, name=";
                str = String.valueOf(iqo.b());
                if (str.length() != 0) {
                    valueOf.concat(str);
                } else {
                    str = new String(valueOf);
                }
            }
        }
    }

    public void a(String str, String str2, int i, bol bol, bko bko) {
        String valueOf;
        if (a) {
            String str3 = "set PSTN contact info for name=";
            valueOf = String.valueOf(str);
            if (valueOf.length() != 0) {
                str3.concat(valueOf);
            } else {
                valueOf = new String(str3);
            }
        }
        String valueOf2;
        if (this.e.containsKey(bol)) {
            edk edk = (edk) this.e.remove(bol);
            this.d.remove(edk);
            edk.e = str;
            edk.h = str2;
            edk.t = true;
            edk.w = i;
            if (a) {
                valueOf = "resolved participant, but no endpoint yet. name=";
                valueOf2 = String.valueOf(str);
                if (valueOf2.length() != 0) {
                    valueOf.concat(valueOf2);
                } else {
                    valueOf2 = new String(valueOf);
                }
            }
            this.h.add(edk);
            a(edk.s);
        } else if (this.g.containsKey(bol)) {
            iqu iqu = (iqu) this.g.remove(bol);
            this.f.remove(iqu);
            valueOf = bol.e();
            if (this.l != null && gwb.m(this.l.s, iqu.s())) {
                valueOf = this.l.f();
            }
            if (a) {
                valueOf2 = String.valueOf(iqu.b());
                new StringBuilder(((String.valueOf(str).length() + 51) + String.valueOf(valueOf2).length()) + String.valueOf(valueOf).length()).append("resolved participant, has endpoint. name=").append(str).append(", ep=").append(valueOf2).append(", ph=").append(valueOf);
            }
            iqu.a((Object) new dks(str, valueOf, str2, i));
            a(iqu.s());
        }
    }
}
