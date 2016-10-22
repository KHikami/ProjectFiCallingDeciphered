import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

public final class cvh {
    final cus a;
    final List<cvm> b;
    final Map<String, List<cvn>> c;
    private final ite d;
    private final ijf e;
    private final ijd f;
    private final lym g;
    private boolean h;
    private final itg i;
    private final ijj<lym> j;
    private final ijj<mab> k;
    private final cuz l;

    public cvh(Context context, ite ite, cus cus, int i) {
        this.b = new CopyOnWriteArrayList();
        this.c = new HashMap();
        this.i = new cvi(this);
        this.j = new cvj(this);
        this.k = new cvk(this);
        this.l = new cvl(this);
        this.d = ite;
        this.e = (ijf) ite.t().a(ijf.class);
        this.a = cus;
        this.a.a(this.l);
        this.f = (ijd) ite.t().a(ijd.class);
        this.f.a(this.j);
        this.d.a(this.i);
        this.e.a(this.k);
        this.h = true;
        this.g = new lym();
        jch a = ((jcf) jyn.a(context, jcf.class)).a(i);
        this.g.b = "localParticipant";
        this.g.d = a.b("display_name");
        this.g.k = a.b("given_name");
        this.g.e = a.b("profile_photo_url");
    }

    public void a() {
        if (this.h) {
            this.h = false;
            this.d.b(this.i);
            this.e.b(this.k);
            this.a.b(this.l);
            this.f.b(this.j);
        }
    }

    protected void finalize() {
        if (this.h) {
            glk.d("Babel_PMngr", "ParticipantManager should not be valid in finalizer.", new Object[0]);
            a();
        }
        super.finalize();
    }

    public boolean a(String str) {
        if (TextUtils.equals(str, "localParticipant")) {
            return this.a.i();
        }
        for (mab mab : this.e.b().values()) {
            if (gwb.a(mab.d) == 1 && str.equals(mab.b)) {
                return mab.e != null && gwb.b(mab.e.a);
            }
        }
        return false;
    }

    String b(String str) {
        if (str.equals(d())) {
            return "localParticipant";
        }
        return str;
    }

    void a(lym lym) {
        if (!lym.b.equals(d())) {
            for (cvm b : this.b) {
                b.b(lym);
            }
        }
    }

    void b() {
        for (cvm a : this.b) {
            a.a();
        }
    }

    public void a(String str, cvn cvn) {
        List list = (List) this.c.get(str);
        if (list == null) {
            list = new CopyOnWriteArrayList();
            this.c.put(str, list);
        }
        if (!list.contains(cvn)) {
            list.add(cvn);
        }
    }

    public void b(String str, cvn cvn) {
        List list = (List) this.c.get(str);
        if (list != null) {
            list.remove(cvn);
            if (list.isEmpty()) {
                this.c.remove(str);
            }
        }
    }

    public void a(cvm cvm) {
        if (!this.b.contains(cvm)) {
            this.b.add(cvm);
        }
    }

    public void b(cvm cvm) {
        this.b.remove(cvm);
    }

    public Collection<lym> c() {
        Collection<lym> arrayList = new ArrayList();
        CharSequence d = d();
        for (lym lym : this.f.b().values()) {
            if (gwb.b(lym.q) && !TextUtils.equals(d, lym.b)) {
                arrayList.add(lym);
            }
        }
        return arrayList;
    }

    public lym c(String str) {
        if (TextUtils.equals(str, "localParticipant")) {
            return this.g;
        }
        return (lym) this.f.b().get(str);
    }

    String d() {
        lym a = this.f.a();
        return a == null ? null : a.b;
    }

    public static String a(Context context, lym lym) {
        String str = lym.k;
        if (str == null) {
            str = lym.d;
        }
        if (str == null) {
            return context.getString(ba.jM);
        }
        return str;
    }
}
