import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

public final class fpp extends fou {
    private static final boolean d;
    private final List<fpq> e;
    private List<String> f;
    private String g;

    static {
        kae kae = glk.d;
        d = false;
    }

    public fpp(lsr lsr) {
        super(null, null, -1);
        this.e = new ArrayList();
        this.f = new ArrayList();
        StringBuilder stringBuilder = new StringBuilder();
        for (ltk ltk : lsr.a) {
            if (ltk.a == null) {
                glk.d("Babel_ConversationsData", "Empty conversationId in ClientMarkEventObservedNotification from the server.", new Object[0]);
            } else {
                String str = ltk.a.a;
                stringBuilder.append("conid: ").append(str).append(" ");
                for (ltl ltl : ltk.b) {
                    if (TextUtils.isEmpty(ltl.a)) {
                        glk.d("Babel_ConversationsData", "Empty eventId in ClientMarkEventObservedNotification from the server.", new Object[0]);
                    } else {
                        String str2 = ltl.a;
                        this.e.add(new fpq(str, str2, 1));
                        this.f.add(str);
                        stringBuilder.append("msgid: ").append(str2).append(" :" + gwb.a(ltl.c)).append(" ");
                    }
                }
            }
        }
        this.g = stringBuilder.toString();
    }

    private String d() {
        return this.g;
    }

    private List<fpq> e() {
        return this.e;
    }

    private List<String> f() {
        return this.f;
    }

    protected void a(blo blo, fhc fhc) {
        blo.a();
        try {
            int g = blo.g().g();
            if (fdq.w.b(g)) {
                fhc.c((long) g);
            }
            blo.a(e());
            for (fpq fpq : e()) {
                if (fpq.c == 1) {
                    ((ect) jyn.a(blo.f(), ect.class)).a(g, fpq.a, fpq.b);
                }
            }
            if (fdq.F.b(g)) {
                gwb.a(g, 2678, d(), true);
            }
            blo.b();
            for (String d : f()) {
                blf.d(blo, d);
            }
        } finally {
            blo.c();
        }
    }
}
