package p000;

import android.accounts.AuthenticatorException;
import android.util.Log;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;

final class jok {
    final /* synthetic */ joh f20599a;
    private final jco f20600b;
    private final String f20601c;
    private final jmu f20602d;
    private final boolean f20603e;
    private final jci f20604f;
    private jvc f20605g;
    private boolean f20606h;
    private List<jnd> f20607i;
    private int f20608j;
    private Map<jnd, jne> f20609k;
    private List<Exception> f20610l = new ArrayList();
    private boolean f20611m;
    private boolean f20612n;
    private boolean f20613o;

    jok(joh joh, jco jco, String str, jmu jmu, boolean z) {
        jci a;
        this.f20599a = joh;
        this.f20600b = jco;
        this.f20601c = str;
        this.f20602d = jmu;
        this.f20603e = z;
        this.f20608j = joh.f20587d.mo3462b(jco.m23898a(), str);
        if (this.f20608j == -1) {
            a = joh.f20587d.mo3458a(jco.m23898a(), str);
        } else {
            a = joh.f20587d.mo3464b(this.f20608j);
        }
        this.f20604f = a;
        this.f20604f.m23877b("device_index", jco.m23899b());
    }

    void m24847a(List<jnd> list) {
        if (!this.f20611m) {
            if (this.f20600b.m23900c()) {
                this.f20605g = null;
                this.f20606h = true;
                this.f20607i = new ArrayList();
                return;
            }
            this.f20605g = new jvc(this.f20600b.m23898a(), this.f20601c, null, this.f20603e, null);
            boolean z = this.f20599a.m24841d(this.f20608j) || !this.f20603e;
            this.f20606h = z;
            this.f20607i = new ArrayList(list);
        }
    }

    void m24851b(List<Callable<Void>> list) {
        if (!this.f20611m) {
            this.f20609k = new IdentityHashMap();
            List arrayList = new ArrayList();
            for (jnd jnd : this.f20607i) {
                this.f20609k.put(jnd, jnd.mo1731a(this.f20604f, this.f20606h));
            }
            for (jne jne : this.f20609k.values()) {
                if (jne != null) {
                    jne.m24750a(this.f20605g, arrayList);
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

    boolean m24849a() {
        boolean z = true;
        if (!this.f20611m) {
            try {
                for (jnd jnd : this.f20609k.keySet()) {
                    jne jne = (jne) this.f20609k.get(jnd);
                    boolean z2 = jne != null ? jne.m24749a(this.f20604f) == jnf.f20530b ? z : false : false;
                    if (!z2) {
                        this.f20607i.remove(jnd);
                    }
                }
                z = this.f20607i.isEmpty();
            } catch (Exception e) {
                m24846a(e);
            }
        }
        return z;
    }

    void m24850b() {
        boolean z = true;
        if (this.f20611m) {
            if (this.f20613o) {
                this.f20604f.m23881b("has_irrecoverable_error", true);
            } else {
                this.f20604f.m23893e("has_irrecoverable_error");
            }
            this.f20608j = this.f20604f.m23891d();
            if (this.f20613o && this.f20608j != -1) {
                this.f20599a.m24843f(this.f20608j);
                return;
            }
            return;
        }
        this.f20604f.m23878b("LoginManager.last_updated", this.f20599a.f20586c.mo3524a());
        this.f20604f.m23879b("LoginManager.build_version", this.f20599a.f20589f.m24757a());
        List arrayList = new ArrayList();
        if (this.f20599a.f20590g != null) {
            this.f20599a.f20590g.mo1732a(arrayList);
        }
        if (this.f20599a.f20590g != null && this.f20599a.f20590g.mo1733a(this.f20600b.m23898a())) {
            jnc jnc = this.f20599a.f20590g;
        } else if (this.f20602d == null || !this.f20602d.f20501d) {
            z = false;
        } else {
            arrayList.addAll(this.f20602d.f20518u);
        }
        if (z) {
            joh.m24818a(this.f20604f, this.f20599a.m24825a(arrayList));
        }
        if (!this.f20613o) {
            this.f20604f.m23893e("has_irrecoverable_error");
        }
        this.f20608j = this.f20604f.m23891d();
        this.f20599a.m24842e(this.f20608j);
    }

    void m24846a(Exception exception) {
        int i = 0;
        Log.e("LoginManager", "Account update failed", exception);
        this.f20610l.add(exception);
        this.f20611m = true;
        int i2 = 1;
        Throwable th = exception;
        while (th != null) {
            int i3;
            if (th instanceof icu) {
                this.f20599a.f20585b.put(this.f20608j, ((icu) th).m21602a());
                i3 = i2;
            } else if (th instanceof AuthenticatorException) {
                i3 = 0;
            } else {
                i3 = i2;
            }
            th = th.getCause();
            i2 = i3;
        }
        this.f20612n |= i2;
        boolean z = this.f20613o;
        if (i2 == 0) {
            i = 1;
        }
        this.f20613o = z | i;
    }

    public void m24848a(jnl jnl) {
        jnl.f20538a = (!this.f20611m ? 1 : 0) & jnl.f20538a;
        jnl.f20539b |= this.f20612n;
        jnl.f20540c |= this.f20613o;
        jnl.f20543f.add(Integer.valueOf(this.f20608j));
        jnl.f20542e.addAll(this.f20610l);
        jnl.f20541d = this.f20608j;
    }
}
