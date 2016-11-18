package p000;

import android.content.Context;
import android.net.Uri;
import android.net.Uri.Builder;
import android.text.TextUtils;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import java.util.ArrayList;
import java.util.List;

public final class exz extends evz {
    private static final long serialVersionUID = 1;
    private String f12450g;
    private String f12451h;
    private final ArrayList<eyb> f12452i = new ArrayList();

    public exz(knc knc) {
        int i = 1;
        int i2 = 0;
        super(knc, knc.apiHeader);
        kqv kqv = knc.f22416a.f22930a;
        if (kqv != null) {
            this.f12450g = kqv.f22813a;
            krf krf = kqv.f22817e;
            if (krf != null) {
                eyb eyb;
                kpk kpk;
                kpr kpr = krf.f22874g;
                if (kpr != null) {
                    kpq[] kpqArr = kpr.f22690b;
                    if (kpqArr.length > 0) {
                        kpq kpq = kpqArr[0];
                        eyb = new eyb();
                        eyb.f12461a = kpq.f22684a;
                        eyb.f12462b = kpq.f22685b;
                        kpk = kpq.f22686c;
                        if (kpk == null) {
                            eyb.f12464d = eyb.m14768a(null);
                            eyb.f12465e = eyb.m14768a(null);
                        } else {
                            eyb.f12464d = eyb.m14768a(kpk.f22651a);
                            eyb.f12465e = eyb.m14768a(kpk.f22652b);
                        }
                        eyb.f12463c = 1;
                        this.f12452i.add(eyb);
                    }
                }
                kpp kpp = krf.f22875h;
                if (kpp != null) {
                    kpo[] kpoArr = kpp.f22682b;
                    if (kpoArr.length > 0) {
                        kpo kpo = kpoArr[0];
                        eyb = new eyb();
                        eyb.f12461a = kpo.f22676a;
                        kpk = kpo.f22678c;
                        if (kpk == null) {
                            eyb.f12464d = eyb.m14768a(null);
                            eyb.f12465e = eyb.m14768a(null);
                        } else {
                            eyb.f12464d = eyb.m14768a(kpk.f22651a);
                            eyb.f12465e = eyb.m14768a(kpk.f22652b);
                        }
                        eyb.f12463c = 2;
                        this.f12452i.add(eyb);
                    }
                }
                kqc kqc = krf.f22876i;
                if (kqc != null) {
                    Object obj = kqc.f22738b;
                    if (!TextUtils.isEmpty(obj)) {
                        eyb eyb2 = new eyb();
                        eyb2.f12461a = obj;
                        eyb2.f12463c = 3;
                        this.f12452i.add(eyb2);
                    }
                }
            }
            kpf kpf = kqv.f22816d;
            if (kpf != null) {
                kqo kqo = kpf.f22637j;
                if (kqo != null) {
                    kqp kqp = kqo.f22783e;
                    Uri parse = Uri.parse(kqp != null ? kqp.f22787a : kqo.f22784f);
                    Builder scheme = new Builder().scheme(parse.getScheme());
                    scheme.authority(parse.getHost());
                    List pathSegments = parse.getPathSegments();
                    if (pathSegments.size() != 6) {
                        i = 0;
                    }
                    while (i2 < pathSegments.size()) {
                        if (i2 != 4 || r1 == 0) {
                            scheme.appendPath((String) pathSegments.get(i2));
                        }
                        i2++;
                    }
                    this.f12451h = scheme.build().toString();
                }
            }
        }
    }

    public Uri m14764k() {
        return this.f12451h != null ? Uri.parse(this.f12451h) : null;
    }

    public String m14765l() {
        return this.f12450g;
    }

    public ArrayList<eyb> m14766m() {
        return this.f12452i;
    }

    public void mo1958a(Context context, bko bko) {
        RealTimeChatService.f6752i.post(new fhx(bko, this));
    }
}
