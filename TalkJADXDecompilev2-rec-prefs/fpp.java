package p000;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

public final class fpp extends fou {
    private static final boolean f13700d = false;
    private final List<fpq> f13701e = new ArrayList();
    private List<String> f13702f = new ArrayList();
    private String f13703g;

    static {
        kae kae = glk.f15557d;
    }

    public fpp(lsr lsr) {
        super(null, null, -1);
        StringBuilder stringBuilder = new StringBuilder();
        for (ltk ltk : lsr.f26340a) {
            if (ltk.f26383a == null) {
                glk.m17981d("Babel_ConversationsData", "Empty conversationId in ClientMarkEventObservedNotification from the server.", new Object[0]);
            } else {
                String str = ltk.f26383a.f25931a;
                stringBuilder.append("conid: ").append(str).append(" ");
                for (ltl ltl : ltk.f26384b) {
                    if (TextUtils.isEmpty(ltl.f26386a)) {
                        glk.m17981d("Babel_ConversationsData", "Empty eventId in ClientMarkEventObservedNotification from the server.", new Object[0]);
                    } else {
                        String str2 = ltl.f26386a;
                        this.f13701e.add(new fpq(str, str2, 1));
                        this.f13702f.add(str);
                        stringBuilder.append("msgid: ").append(str2).append(" :" + gwb.m1507a(ltl.f26388c)).append(" ");
                    }
                }
            }
        }
        this.f13703g = stringBuilder.toString();
    }

    private String m15920d() {
        return this.f13703g;
    }

    private List<fpq> m15921e() {
        return this.f13701e;
    }

    private List<String> m15922f() {
        return this.f13702f;
    }

    protected void mo2061a(blo blo, fhc fhc) {
        blo.m5958a();
        try {
            int g = blo.m6056g().m5638g();
            if (fdq.f12807w.m14370b(g)) {
                fhc.m15314c((long) g);
            }
            blo.m5998a(m15921e());
            for (fpq fpq : m15921e()) {
                if (fpq.f13706c == 1) {
                    ((ect) jyn.m25426a(blo.m6049f(), ect.class)).mo1830a(g, fpq.f13704a, fpq.f13705b);
                }
            }
            if (fdq.f12764F.m14370b(g)) {
                gwb.m1731a(g, 2678, m15920d(), true);
            }
            blo.m6015b();
            for (String d : m15922f()) {
                blf.m5821d(blo, d);
            }
        } finally {
            blo.m6028c();
        }
    }
}
