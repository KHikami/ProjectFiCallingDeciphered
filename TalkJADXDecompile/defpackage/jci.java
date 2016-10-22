package defpackage;

import android.content.SharedPreferences.Editor;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/* renamed from: jci */
public class jci implements jck {
    public final String a;
    public final int b;
    public final Map<String, jdi> c;
    public boolean d;
    public final /* synthetic */ jcx e;

    public jci b(String str, String str2) {
        a(str, new jdo(str2));
        return this;
    }

    public jci b(String str, Set<String> set) {
        a(str, new jdp(set));
        return this;
    }

    public jci b(String str, boolean z) {
        a(str, new jdh(z));
        return this;
    }

    public jci b(String str, int i) {
        a(str, new jdk(i));
        return this;
    }

    public jci b(String str, long j) {
        a(str, new jdl(j));
        return this;
    }

    public jci e(String str) {
        a(str, jcx.c);
        return this;
    }

    public jci f(String str) {
        jcx jcx = this.e;
        int i = this.b;
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(str);
        return new jci(jcx, i, valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf), this.c);
    }

    public jci c() {
        this.d = true;
        return this;
    }

    public int d() {
        Object obj;
        int i;
        int i2 = this.b;
        if (!this.d || this.b == -1) {
            obj = null;
        } else {
            obj = 1;
        }
        if (obj != null) {
            for (jcd c : this.e.c()) {
                c.c(this.b);
            }
        }
        synchronized (this.e) {
            int b = this.e.b(b("account_name"), b("effective_gaia_id"));
            Object obj2 = (b == this.b || b == -1) ? 1 : null;
            if (obj2 == null) {
                throw new czn("Duplicate account.");
            }
            if (i2 == -1 || obj != null) {
                b = this.e.d();
                this.e.h(b);
                i = b;
            } else {
                i = i2;
            }
            Editor edit = this.e.b.edit();
            if (obj != null) {
                jcx jcx = this.e;
                String str = this.b + ".";
                String str2 = i + ".";
                for (Entry entry : jcx.b.getAll().entrySet()) {
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
                this.e.g(this.b);
            }
            a(i, edit);
            edit.apply();
            this.e.e();
        }
        if (i != this.b) {
            for (jcd c2 : this.e.c()) {
                c2.b(i);
            }
        }
        this.e.f();
        return i;
    }

    public jci(jcx jcx, int i) {
        this(jcx, i, "", new HashMap());
    }

    public jci(jcx jcx, int i, String str, Map<String, jdi> map) {
        this.e = jcx;
        this.b = i;
        this.a = String.valueOf(str).concat(".");
        this.c = map;
    }

    public jci a(String str, float f) {
        a(str, new jdj(f));
        return this;
    }

    public boolean a(String str) {
        String g = g(str);
        jdi jdi = (jdi) this.c.get(g);
        if (jdi != null) {
            return jdi != jcx.c;
        } else {
            return this.e.b.contains(jci.a(this.b, g));
        }
    }

    public String a(String str, String str2) {
        String g = g(str);
        jdi jdi = (jdi) this.c.get(g);
        if (jdi != null) {
            return (String) jdi.a(str2);
        }
        return this.e.b.getString(jci.a(this.b, g), str2);
    }

    public String b(String str) {
        return a(str, null);
    }

    public Set<String> a(String str, Set<String> set) {
        String g = g(str);
        jdi jdi = (jdi) this.c.get(g);
        if (jdi != null) {
            return (Set) jdi.a(null);
        }
        return this.e.b.getStringSet(jci.a(this.b, g), null);
    }

    public boolean a(String str, boolean z) {
        String g = g(str);
        jdi jdi = (jdi) this.c.get(g);
        if (jdi != null) {
            return ((Boolean) jdi.a(Boolean.valueOf(z))).booleanValue();
        }
        return this.e.b.getBoolean(jci.a(this.b, g), z);
    }

    public boolean c(String str) {
        return a(str, false);
    }

    public int a(String str, int i) {
        String g = g(str);
        jdi jdi = (jdi) this.c.get(g);
        if (jdi != null) {
            return ((Integer) jdi.a(Integer.valueOf(i))).intValue();
        }
        return this.e.b.getInt(jci.a(this.b, g), i);
    }

    public long a(String str, long j) {
        String g = g(str);
        jdi jdi = (jdi) this.c.get(g);
        if (jdi != null) {
            return ((Long) jdi.a(Long.valueOf(j))).longValue();
        }
        return this.e.b.getLong(jci.a(this.b, g), j);
    }

    public boolean a() {
        return c("logged_in");
    }

    public boolean b() {
        return c("logged_out");
    }

    public void a(String str, jdi jdi) {
        this.c.put(g(str), jdi);
    }

    public String g(String str) {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(str);
        return valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
    }

    public static String a(int i, String str) {
        return new StringBuilder(String.valueOf(str).length() + 11).append(i).append(str).toString();
    }

    public void a(int i, Editor editor) {
        for (String str : this.c.keySet()) {
            ((jdi) this.c.get(str)).a(editor, jci.a(i, str));
        }
    }

    public /* synthetic */ jck h(String str) {
        return f(str);
    }

    public /* synthetic */ jck i(String str) {
        return e(str);
    }

    public /* synthetic */ jck b(String str, float f) {
        return a(str, f);
    }

    public /* synthetic */ jck c(String str, long j) {
        return b(str, j);
    }

    public /* synthetic */ jck c(String str, int i) {
        return b(str, i);
    }

    public /* synthetic */ jck c(String str, boolean z) {
        return b(str, z);
    }

    public /* synthetic */ jck c(String str, Set set) {
        return b(str, set);
    }

    public /* synthetic */ jck c(String str, String str2) {
        return b(str, str2);
    }

    public /* synthetic */ jch d(String str) {
        return f(str);
    }
}
