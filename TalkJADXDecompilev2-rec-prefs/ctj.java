package p000;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public final class ctj {
    String f9033a;
    String f9034b;
    private final ite f9035c;
    private final List<ctm> f9036d = new ArrayList();
    private final ijd f9037e;
    private String f9038f = "localParticipant";
    private final ijj<lym> f9039g = new ctk(this);
    private final itg f9040h = new ctl(this);

    public ctj(ite ite) {
        this.f9035c = ite;
        this.f9037e = (ijd) ite.mo3229t().m21926a(ijd.class);
    }

    public void m10938a() {
        this.f9035c.mo3217a(this.f9040h);
        this.f9037e.mo3363a(this.f9039g);
        m10946e();
    }

    public void m10941b() {
        this.f9035c.mo3219b(this.f9040h);
        this.f9037e.mo3366b(this.f9039g);
    }

    public void m10940a(String str) {
        if (!m10943b(str)) {
            str = null;
        }
        if (!TextUtils.equals(str, this.f9033a)) {
            this.f9033a = str;
            for (ctm a : this.f9036d) {
                a.mo1418a();
            }
            m10946e();
        }
    }

    public String m10944c() {
        return this.f9033a;
    }

    public String m10945d() {
        return this.f9038f;
    }

    boolean m10943b(String str) {
        lym a = this.f9037e.mo3376a();
        Object obj = a != null ? a.f26907b : null;
        Map b = this.f9037e.mo3365b();
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
            return a != null && gwb.m2061b(a.f26922q);
        }
    }

    void m10946e() {
        Object obj = null;
        if (this.f9033a != null) {
            obj = this.f9033a;
        } else if (this.f9034b != null) {
            obj = this.f9034b;
        } else {
            String str;
            lym a = this.f9037e.mo3376a();
            Object obj2 = a != null ? a.f26907b : null;
            for (lym a2 : this.f9037e.mo3365b().values()) {
                String str2;
                if (gwb.m2061b(a2.f26922q) && !a2.f26907b.equals(obj2) && (str == null || TextUtils.equals(this.f9038f, a2.f26907b))) {
                    str2 = a2.f26907b;
                } else {
                    str2 = str;
                }
                str = str2;
            }
            if (str == null) {
                obj = "localParticipant";
            }
        }
        if (!TextUtils.equals(this.f9038f, obj)) {
            this.f9038f = obj;
            for (ctm a3 : this.f9036d) {
                a3.mo1419a(this.f9038f);
            }
        }
    }

    public void m10939a(ctm ctm) {
        this.f9036d.add(ctm);
        ctm.mo1418a();
        ctm.mo1419a(this.f9038f);
    }

    public void m10942b(ctm ctm) {
        this.f9036d.remove(ctm);
    }
}
