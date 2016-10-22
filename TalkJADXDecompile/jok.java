import android.accounts.AuthenticatorException;
import android.util.Log;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;

final class jok {
    final /* synthetic */ joh a;
    private final jco b;
    private final String c;
    private final jmu d;
    private final boolean e;
    private final jci f;
    private jvc g;
    private boolean h;
    private List<jnd> i;
    private int j;
    private Map<jnd, jne> k;
    private List<Exception> l;
    private boolean m;
    private boolean n;
    private boolean o;

    jok(joh joh, jco jco, String str, jmu jmu, boolean z) {
        jci a;
        this.a = joh;
        this.l = new ArrayList();
        this.b = jco;
        this.c = str;
        this.d = jmu;
        this.e = z;
        this.j = joh.d.b(jco.a(), str);
        if (this.j == -1) {
            a = joh.d.a(jco.a(), str);
        } else {
            a = joh.d.b(this.j);
        }
        this.f = a;
        this.f.b("device_index", jco.b());
    }

    void a(List<jnd> list) {
        if (!this.m) {
            if (this.b.c()) {
                this.g = null;
                this.h = true;
                this.i = new ArrayList();
                return;
            }
            this.g = new jvc(this.b.a(), this.c, null, this.e, null);
            boolean z = this.a.d(this.j) || !this.e;
            this.h = z;
            this.i = new ArrayList(list);
        }
    }

    void b(List<Callable<Void>> list) {
        if (!this.m) {
            this.k = new IdentityHashMap();
            List arrayList = new ArrayList();
            for (jnd jnd : this.i) {
                this.k.put(jnd, jnd.a(this.f, this.h));
            }
            for (jne jne : this.k.values()) {
                if (jne != null) {
                    jne.a(this.g, arrayList);
                }
            }
            ArrayList arrayList2 = (ArrayList) arrayList;
            int size = arrayList2.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList2.get(i);
                i++;
                list.add(new jol(this, (juo) obj));
            }
        }
    }

    boolean a() {
        boolean z = true;
        if (!this.m) {
            try {
                for (jnd jnd : this.k.keySet()) {
                    jne jne = (jne) this.k.get(jnd);
                    boolean z2 = jne != null ? jne.a(this.f) == jnf.b ? z : false : false;
                    if (!z2) {
                        this.i.remove(jnd);
                    }
                }
                z = this.i.isEmpty();
            } catch (Exception e) {
                a(e);
            }
        }
        return z;
    }

    void b() {
        boolean z = true;
        if (this.m) {
            if (this.o) {
                this.f.b("has_irrecoverable_error", true);
            } else {
                this.f.e("has_irrecoverable_error");
            }
            this.j = this.f.d();
            if (this.o && this.j != -1) {
                this.a.f(this.j);
                return;
            }
            return;
        }
        this.f.b("LoginManager.last_updated", this.a.c.a());
        this.f.b("LoginManager.build_version", this.a.f.a());
        List arrayList = new ArrayList();
        if (this.a.g != null) {
            this.a.g.a(arrayList);
        }
        if (this.a.g != null && this.a.g.a(this.b.a())) {
            jnc jnc = this.a.g;
        } else if (this.d == null || !this.d.d) {
            z = false;
        } else {
            arrayList.addAll(this.d.u);
        }
        if (z) {
            joh.a(this.f, this.a.a(arrayList));
        }
        if (!this.o) {
            this.f.e("has_irrecoverable_error");
        }
        this.j = this.f.d();
        this.a.e(this.j);
    }

    void a(Exception exception) {
        int i = 0;
        Log.e("LoginManager", "Account update failed", exception);
        this.l.add(exception);
        this.m = true;
        int i2 = 1;
        Throwable th = exception;
        while (th != null) {
            int i3;
            if (th instanceof icu) {
                this.a.b.put(this.j, ((icu) th).a());
                i3 = i2;
            } else if (th instanceof AuthenticatorException) {
                i3 = 0;
            } else {
                i3 = i2;
            }
            th = th.getCause();
            i2 = i3;
        }
        this.n |= i2;
        boolean z = this.o;
        if (i2 == 0) {
            i = 1;
        }
        this.o = z | i;
    }

    public void a(jnl jnl) {
        jnl.a = (!this.m ? 1 : 0) & jnl.a;
        jnl.b |= this.n;
        jnl.c |= this.o;
        jnl.f.add(Integer.valueOf(this.j));
        jnl.e.addAll(this.l);
        jnl.d = this.j;
    }
}
