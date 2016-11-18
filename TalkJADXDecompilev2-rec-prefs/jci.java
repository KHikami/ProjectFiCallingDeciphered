package p000;

import android.content.SharedPreferences.Editor;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class jci implements jck {
    public final String f19850a;
    public final int f19851b;
    public final Map<String, jdi> f19852c;
    public boolean f19853d;
    public final /* synthetic */ jcx f19854e;

    public jci m23879b(String str, String str2) {
        m23872a(str, new jdo(str2));
        return this;
    }

    public jci m23880b(String str, Set<String> set) {
        m23872a(str, new jdp(set));
        return this;
    }

    public jci m23881b(String str, boolean z) {
        m23872a(str, new jdh(z));
        return this;
    }

    public jci m23877b(String str, int i) {
        m23872a(str, new jdk(i));
        return this;
    }

    public jci m23878b(String str, long j) {
        m23872a(str, new jdl(j));
        return this;
    }

    public jci m23893e(String str) {
        m23872a(str, jcx.f19874c);
        return this;
    }

    public jci m23894f(String str) {
        jcx jcx = this.f19854e;
        int i = this.f19851b;
        String valueOf = String.valueOf(this.f19850a);
        String valueOf2 = String.valueOf(str);
        return new jci(jcx, i, valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf), this.f19852c);
    }

    public jci m23884c() {
        this.f19853d = true;
        return this;
    }

    public int m23891d() {
        Object obj;
        int i;
        int i2 = this.f19851b;
        if (!this.f19853d || this.f19851b == -1) {
            obj = null;
        } else {
            obj = 1;
        }
        if (obj != null) {
            for (jcd c : this.f19854e.m23938c()) {
                c.mo1775c(this.f19851b);
            }
        }
        synchronized (this.f19854e) {
            int b = this.f19854e.mo3462b(mo3440b("account_name"), mo3440b("effective_gaia_id"));
            Object obj2 = (b == this.f19851b || b == -1) ? 1 : null;
            if (obj2 == null) {
                throw new czn("Duplicate account.");
            }
            if (i2 == -1 || obj != null) {
                b = this.f19854e.m23940d();
                this.f19854e.m23948h(b);
                i = b;
            } else {
                i = i2;
            }
            Editor edit = this.f19854e.f19875b.edit();
            if (obj != null) {
                jcx jcx = this.f19854e;
                String str = this.f19851b + ".";
                String str2 = i + ".";
                for (Entry entry : jcx.f19875b.getAll().entrySet()) {
                    String str3 = (String) entry.getKey();
                    if (str3.startsWith(str)) {
                        String valueOf = String.valueOf(str2);
                        str3 = String.valueOf(str3.substring(str.length()));
                        str3 = str3.length() != 0 ? valueOf.concat(str3) : new String(valueOf);
                        obj2 = entry.getValue();
                        if (obj2 instanceof String) {
                            edit.putString(str3, (String) obj2);
                        } else if (obj2 instanceof Boolean) {
                            edit.putBoolean(str3, ((Boolean) obj2).booleanValue());
                        } else if (obj2 instanceof Integer) {
                            edit.putInt(str3, ((Integer) obj2).intValue());
                        } else if (obj2 instanceof Long) {
                            edit.putLong(str3, ((Long) obj2).longValue());
                        } else if (obj2 instanceof Float) {
                            edit.putFloat(str3, ((Float) obj2).floatValue());
                        } else if (obj2 instanceof Set) {
                            edit.putStringSet(str3, (Set) obj2);
                        }
                    }
                }
                this.f19854e.m23947g(this.f19851b);
            }
            m23871a(i, edit);
            edit.apply();
            this.f19854e.m23943e();
        }
        if (i != this.f19851b) {
            for (jcd c2 : this.f19854e.m23938c()) {
                c2.mo1774b(i);
            }
        }
        this.f19854e.m23945f();
        return i;
    }

    public jci(jcx jcx, int i) {
        this(jcx, i, "", new HashMap());
    }

    public jci(jcx jcx, int i, String str, Map<String, jdi> map) {
        this.f19854e = jcx;
        this.f19851b = i;
        this.f19850a = String.valueOf(str).concat(".");
        this.f19852c = map;
    }

    public jci m23870a(String str, float f) {
        m23872a(str, new jdj(f));
        return this;
    }

    public boolean mo3438a(String str) {
        String g = m23895g(str);
        jdi jdi = (jdi) this.f19852c.get(g);
        if (jdi != null) {
            return jdi != jcx.f19874c;
        } else {
            return this.f19854e.f19875b.contains(jci.m23865a(this.f19851b, g));
        }
    }

    public String mo3435a(String str, String str2) {
        String g = m23895g(str);
        jdi jdi = (jdi) this.f19852c.get(g);
        if (jdi != null) {
            return (String) jdi.mo3474a(str2);
        }
        return this.f19854e.f19875b.getString(jci.m23865a(this.f19851b, g), str2);
    }

    public String mo3440b(String str) {
        return mo3435a(str, null);
    }

    public Set<String> mo3436a(String str, Set<String> set) {
        String g = m23895g(str);
        jdi jdi = (jdi) this.f19852c.get(g);
        if (jdi != null) {
            return (Set) jdi.mo3474a(null);
        }
        return this.f19854e.f19875b.getStringSet(jci.m23865a(this.f19851b, g), null);
    }

    public boolean mo3439a(String str, boolean z) {
        String g = m23895g(str);
        jdi jdi = (jdi) this.f19852c.get(g);
        if (jdi != null) {
            return ((Boolean) jdi.mo3474a(Boolean.valueOf(z))).booleanValue();
        }
        return this.f19854e.f19875b.getBoolean(jci.m23865a(this.f19851b, g), z);
    }

    public boolean mo3448c(String str) {
        return mo3439a(str, false);
    }

    public int mo3433a(String str, int i) {
        String g = m23895g(str);
        jdi jdi = (jdi) this.f19852c.get(g);
        if (jdi != null) {
            return ((Integer) jdi.mo3474a(Integer.valueOf(i))).intValue();
        }
        return this.f19854e.f19875b.getInt(jci.m23865a(this.f19851b, g), i);
    }

    public long mo3434a(String str, long j) {
        String g = m23895g(str);
        jdi jdi = (jdi) this.f19852c.get(g);
        if (jdi != null) {
            return ((Long) jdi.mo3474a(Long.valueOf(j))).longValue();
        }
        return this.f19854e.f19875b.getLong(jci.m23865a(this.f19851b, g), j);
    }

    public boolean mo3437a() {
        return mo3448c("logged_in");
    }

    public boolean mo3442b() {
        return mo3448c("logged_out");
    }

    public void m23872a(String str, jdi jdi) {
        this.f19852c.put(m23895g(str), jdi);
    }

    public String m23895g(String str) {
        String valueOf = String.valueOf(this.f19850a);
        String valueOf2 = String.valueOf(str);
        return valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
    }

    public static String m23865a(int i, String str) {
        return new StringBuilder(String.valueOf(str).length() + 11).append(i).append(str).toString();
    }

    public void m23871a(int i, Editor editor) {
        for (String str : this.f19852c.keySet()) {
            ((jdi) this.f19852c.get(str)).mo3475a(editor, jci.m23865a(i, str));
        }
    }

    public /* synthetic */ jck mo3450h(String str) {
        return m23894f(str);
    }

    public /* synthetic */ jck mo3451i(String str) {
        return m23893e(str);
    }

    public /* synthetic */ jck mo3441b(String str, float f) {
        return m23870a(str, f);
    }

    public /* synthetic */ jck mo3444c(String str, long j) {
        return m23878b(str, j);
    }

    public /* synthetic */ jck mo3443c(String str, int i) {
        return m23877b(str, i);
    }

    public /* synthetic */ jck mo3447c(String str, boolean z) {
        return m23881b(str, z);
    }

    public /* synthetic */ jck mo3446c(String str, Set set) {
        return m23880b(str, set);
    }

    public /* synthetic */ jck mo3445c(String str, String str2) {
        return m23879b(str, str2);
    }

    public /* synthetic */ jch mo3449d(String str) {
        return m23894f(str);
    }
}
