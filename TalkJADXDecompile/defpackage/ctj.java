package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: ctj */
public final class ctj {
    String a;
    String b;
    private final ite c;
    private final List<ctm> d;
    private final ijd e;
    private String f;
    private final ijj<lym> g;
    private final itg h;

    public ctj(ite ite) {
        this.d = new ArrayList();
        this.f = "localParticipant";
        this.g = new ctk(this);
        this.h = new ctl(this);
        this.c = ite;
        this.e = (ijd) ite.t().a(ijd.class);
    }

    public void a() {
        this.c.a(this.h);
        this.e.a(this.g);
        e();
    }

    public void b() {
        this.c.b(this.h);
        this.e.b(this.g);
    }

    public void a(String str) {
        if (!b(str)) {
            str = null;
        }
        if (!TextUtils.equals(str, this.a)) {
            this.a = str;
            for (ctm a : this.d) {
                a.a();
            }
            e();
        }
    }

    public String c() {
        return this.a;
    }

    public String d() {
        return this.f;
    }

    boolean b(String str) {
        lym a = this.e.a();
        Object obj = a != null ? a.b : null;
        Map b = this.e.b();
        if (str == null) {
            return true;
        }
        if ("localParticipant".equals(str)) {
            return b.size() > 1;
        } else {
            if (str.equals(obj)) {
                return false;
            }
            a = (lym) b.get(str);
            return a != null && gwb.b(a.q);
        }
    }

    void e() {
        Object obj = null;
        if (this.a != null) {
            obj = this.a;
        } else if (this.b != null) {
            obj = this.b;
        } else {
            String str;
            lym a = this.e.a();
            Object obj2 = a != null ? a.b : null;
            for (lym a2 : this.e.b().values()) {
                String str2;
                if (gwb.b(a2.q) && !a2.b.equals(obj2) && (str == null || TextUtils.equals(this.f, a2.b))) {
                    str2 = a2.b;
                } else {
                    str2 = str;
                }
                str = str2;
            }
            if (str == null) {
                obj = "localParticipant";
            }
        }
        if (!TextUtils.equals(this.f, obj)) {
            this.f = obj;
            for (ctm a3 : this.d) {
                a3.a(this.f);
            }
        }
    }

    public void a(ctm ctm) {
        this.d.add(ctm);
        ctm.a();
        ctm.a(this.f);
    }

    public void b(ctm ctm) {
        this.d.remove(ctm);
    }
}
