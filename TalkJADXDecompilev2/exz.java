package defpackage;

import android.content.Context;
import android.net.Uri;
import android.net.Uri.Builder;
import android.text.TextUtils;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import java.util.ArrayList;
import java.util.List;

public final class exz extends evz {
    private static final long serialVersionUID = 1;
    private String g;
    private String h;
    private final ArrayList<eyb> i = new ArrayList();

    public exz(knc knc) {
        int i = 1;
        int i2 = 0;
        super(knc, knc.apiHeader);
        kqv kqv = knc.a.a;
        if (kqv != null) {
            this.g = kqv.a;
            krf krf = kqv.e;
            if (krf != null) {
                eyb eyb;
                kpk kpk;
                kpr kpr = krf.g;
                if (kpr != null) {
                    kpq[] kpqArr = kpr.b;
                    if (kpqArr.length > 0) {
                        kpq kpq = kpqArr[0];
                        eyb = new eyb();
                        eyb.a = kpq.a;
                        eyb.b = kpq.b;
                        kpk = kpq.c;
                        if (kpk == null) {
                            eyb.d = eyb.a(null);
                            eyb.e = eyb.a(null);
                        } else {
                            eyb.d = eyb.a(kpk.a);
                            eyb.e = eyb.a(kpk.b);
                        }
                        eyb.c = 1;
                        this.i.add(eyb);
                    }
                }
                kpp kpp = krf.h;
                if (kpp != null) {
                    kpo[] kpoArr = kpp.b;
                    if (kpoArr.length > 0) {
                        kpo kpo = kpoArr[0];
                        eyb = new eyb();
                        eyb.a = kpo.a;
                        kpk = kpo.c;
                        if (kpk == null) {
                            eyb.d = eyb.a(null);
                            eyb.e = eyb.a(null);
                        } else {
                            eyb.d = eyb.a(kpk.a);
                            eyb.e = eyb.a(kpk.b);
                        }
                        eyb.c = 2;
                        this.i.add(eyb);
                    }
                }
                kqc kqc = krf.i;
                if (kqc != null) {
                    Object obj = kqc.b;
                    if (!TextUtils.isEmpty(obj)) {
                        eyb eyb2 = new eyb();
                        eyb2.a = obj;
                        eyb2.c = 3;
                        this.i.add(eyb2);
                    }
                }
            }
            kpf kpf = kqv.d;
            if (kpf != null) {
                kqo kqo = kpf.j;
                if (kqo != null) {
                    kqp kqp = kqo.e;
                    Uri parse = Uri.parse(kqp != null ? kqp.a : kqo.f);
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
                    this.h = scheme.build().toString();
                }
            }
        }
    }

    public Uri k() {
        return this.h != null ? Uri.parse(this.h) : null;
    }

    public String l() {
        return this.g;
    }

    public ArrayList<eyb> m() {
        return this.i;
    }

    public void a(Context context, bko bko) {
        RealTimeChatService.i.post(new fhx(bko, this));
    }
}
