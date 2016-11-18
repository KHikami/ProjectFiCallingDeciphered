package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class jak {
    private static final jbg l;
    private static final Pattern o = Pattern.compile("\\[([^\\[\\]])*\\]");
    private static final Pattern p = Pattern.compile("\\d(?=[^,}][^,}])");
    private static final Pattern q = Pattern.compile("[-x‐-―−ー－-／  ­​⁠　()（）［］.\\[\\]/~⁓∼～]*(\\$\\d[-x‐-―−ー－-／  ­​⁠　()（）［］.\\[\\]/~⁓∼～]*)+");
    private static final Pattern r = Pattern.compile("[- ]");
    private static final Pattern s = Pattern.compile(" ");
    private List<jbf> A = new ArrayList();
    private jaz B = new jaz(64);
    private String a = "";
    private StringBuilder b = new StringBuilder();
    private String c = "";
    private StringBuilder d = new StringBuilder();
    private StringBuilder e = new StringBuilder();
    private boolean f = true;
    private boolean g = false;
    private boolean h = false;
    private boolean i = false;
    private final jar j = jar.b();
    private String k;
    private jbg m;
    private jbg n;
    private int t = 0;
    private int u = 0;
    private int v = 0;
    private StringBuilder w = new StringBuilder();
    private boolean x = false;
    private String y = "";
    private StringBuilder z = new StringBuilder();

    static {
        jbg jbg = new jbg();
        l = jbg;
        jbg.s = "NA";
    }

    jak(String str) {
        this.k = str;
        this.n = a(this.k);
        this.m = this.n;
    }

    private jbg a(String str) {
        jbg d = this.j.d(this.j.b(this.j.e(str)));
        return d != null ? d : l;
    }

    private boolean c() {
        Iterator it = this.A.iterator();
        while (it.hasNext()) {
            jbf jbf = (jbf) it.next();
            String str = jbf.a;
            if (this.c.equals(str)) {
                return false;
            }
            boolean z;
            CharSequence charSequence = jbf.a;
            if (charSequence.indexOf(124) == -1) {
                String replaceAll = p.matcher(o.matcher(charSequence).replaceAll("\\\\d")).replaceAll("\\\\d");
                this.b.setLength(0);
                String str2 = jbf.b;
                Matcher matcher = this.B.a(replaceAll).matcher("999999999999999");
                matcher.find();
                String group = matcher.group();
                if (group.length() < this.z.length()) {
                    replaceAll = "";
                } else {
                    replaceAll = group.replaceAll(replaceAll, str2).replaceAll("9", " ");
                }
                if (replaceAll.length() > 0) {
                    this.b.append(replaceAll);
                    z = true;
                    if (z) {
                        it.remove();
                    } else {
                        this.c = str;
                        this.x = r.matcher(jbf.d).find();
                        this.t = 0;
                        return true;
                    }
                }
            }
            z = false;
            if (z) {
                it.remove();
            } else {
                this.c = str;
                this.x = r.matcher(jbf.d).find();
                this.t = 0;
                return true;
            }
        }
        this.f = false;
        return false;
    }

    private void b(String str) {
        int length = str.length() - 3;
        Iterator it = this.A.iterator();
        while (it.hasNext()) {
            jbf jbf = (jbf) it.next();
            if (jbf.c.length != 0) {
                if (!this.B.a(jbf.c[Math.min(length, jbf.c.length - 1)]).matcher(str).lookingAt()) {
                    it.remove();
                }
            }
        }
    }

    public void a() {
        this.a = "";
        this.d.setLength(0);
        this.e.setLength(0);
        this.b.setLength(0);
        this.t = 0;
        this.c = "";
        this.w.setLength(0);
        this.y = "";
        this.z.setLength(0);
        this.f = true;
        this.g = false;
        this.v = 0;
        this.u = 0;
        this.h = false;
        this.i = false;
        this.A.clear();
        this.x = false;
        if (!this.n.equals(this.m)) {
            this.n = a(this.k);
        }
    }

    public String a(char c) {
        this.a = a(c, false);
        return this.a;
    }

    public String b(char c) {
        this.a = a(c, true);
        return this.a;
    }

    private String a(char c, boolean z) {
        boolean z2;
        boolean z3 = true;
        this.d.append(c);
        if (z) {
            this.u = this.d.length();
        }
        if (Character.isDigit(c) || (this.d.length() == 1 && jar.b.matcher(Character.toString(c)).matches())) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            if (c == '+') {
                this.e.append(c);
            } else {
                c = Character.forDigit(Character.digit(c, 10), 10);
                this.e.append(c);
                this.z.append(c);
            }
            if (z) {
                this.v = this.e.length();
            }
        } else {
            this.f = false;
            this.g = true;
        }
        if (this.f) {
            switch (this.e.length()) {
                case 0:
                case 1:
                case 2:
                    return this.d.toString();
                case 3:
                    if (i()) {
                        this.i = true;
                        break;
                    }
                    this.y = h();
                    return f();
            }
            String valueOf;
            String valueOf2;
            if (this.i) {
                if (j()) {
                    this.i = false;
                }
                valueOf = String.valueOf(String.valueOf(this.w));
                valueOf2 = String.valueOf(String.valueOf(this.z.toString()));
                return new StringBuilder((valueOf.length() + 0) + valueOf2.length()).append(valueOf).append(valueOf2).toString();
            } else if (this.A.size() <= 0) {
                return f();
            } else {
                valueOf2 = c(c);
                valueOf = e();
                if (valueOf.length() > 0) {
                    return valueOf;
                }
                b(this.z.toString());
                if (c()) {
                    return g();
                }
                return this.f ? c(valueOf2) : this.d.toString();
            }
        } else if (this.g) {
            return this.d.toString();
        } else {
            if (!i()) {
                if (this.y.length() > 0) {
                    this.z.insert(0, this.y);
                    this.w.setLength(this.w.lastIndexOf(this.y));
                }
                if (this.y.equals(h())) {
                    z3 = false;
                }
                if (z3) {
                    this.w.append(' ');
                    return d();
                }
            } else if (j()) {
                return d();
            }
            return this.d.toString();
        }
    }

    private String d() {
        this.f = true;
        this.i = false;
        this.A.clear();
        this.t = 0;
        this.b.setLength(0);
        this.c = "";
        return f();
    }

    private String e() {
        for (jbf jbf : this.A) {
            Matcher matcher = this.B.a(jbf.a).matcher(this.z);
            if (matcher.matches()) {
                this.x = r.matcher(jbf.d).find();
                return c(matcher.replaceAll(jbf.b));
            }
        }
        return "";
    }

    public int b() {
        int i = 0;
        if (!this.f) {
            return this.u;
        }
        int i2 = 0;
        while (i2 < this.v && i < this.a.length()) {
            if (this.e.charAt(i2) == this.a.charAt(i)) {
                i2++;
            }
            i++;
        }
        return i;
    }

    private String c(String str) {
        int length = this.w.length();
        if (!this.x || length <= 0 || this.w.charAt(length - 1) == ' ') {
            String valueOf = String.valueOf(String.valueOf(this.w));
            String valueOf2 = String.valueOf(String.valueOf(str));
            return new StringBuilder((valueOf.length() + 0) + valueOf2.length()).append(valueOf).append(valueOf2).toString();
        }
        valueOf = String.valueOf(String.valueOf(new String(this.w)));
        valueOf2 = String.valueOf(String.valueOf(str));
        return new StringBuilder((valueOf.length() + 1) + valueOf2.length()).append(valueOf).append(' ').append(valueOf2).toString();
    }

    private String f() {
        int i = 0;
        if (this.z.length() < 3) {
            return c(this.z.toString());
        }
        int i2;
        String stringBuilder = this.z.toString();
        jbf[] jbfArr = (!this.h || this.n.A.length <= 0) ? this.n.z : this.n.A;
        if (this.n.u.equals("")) {
            i2 = 0;
        } else {
            i2 = 1;
        }
        int length = jbfArr.length;
        while (i < length) {
            jbf jbf = jbfArr[i];
            if (i2 == 0 || this.h || jbf.e || jar.c(jbf.d)) {
                if (q.matcher(jbf.b).matches()) {
                    this.A.add(jbf);
                }
            }
            i++;
        }
        b(stringBuilder);
        String e = e();
        if (e.length() > 0) {
            return e;
        }
        return c() ? g() : this.d.toString();
    }

    private String g() {
        int length = this.z.length();
        if (length <= 0) {
            return this.w.toString();
        }
        String str = "";
        for (int i = 0; i < length; i++) {
            str = c(this.z.charAt(i));
        }
        return this.f ? c(str) : this.d.toString();
    }

    private boolean i() {
        jaz jaz = this.B;
        String valueOf = String.valueOf("\\+|");
        String valueOf2 = String.valueOf(this.n.s);
        if (valueOf2.length() != 0) {
            valueOf2 = valueOf.concat(valueOf2);
        } else {
            valueOf2 = new String(valueOf);
        }
        Matcher matcher = jaz.a(valueOf2).matcher(this.e);
        if (!matcher.lookingAt()) {
            return false;
        }
        this.h = true;
        int end = matcher.end();
        this.z.setLength(0);
        this.z.append(this.e.substring(end));
        this.w.setLength(0);
        this.w.append(this.e.substring(0, end));
        if (this.e.charAt(0) != '+') {
            this.w.append(' ');
        }
        return true;
    }

    private boolean j() {
        if (this.z.length() == 0) {
            return false;
        }
        StringBuilder stringBuilder = new StringBuilder();
        int a = this.j.a(this.z, stringBuilder);
        if (a == 0) {
            return false;
        }
        this.z.setLength(0);
        this.z.append(stringBuilder);
        String b = this.j.b(a);
        if ("001".equals(b)) {
            this.n = this.j.a(a);
        } else if (!b.equals(this.k)) {
            this.n = a(b);
        }
        this.w.append(Integer.toString(a)).append(' ');
        this.y = "";
        return true;
    }

    private String c(char c) {
        Matcher matcher = s.matcher(this.b);
        if (matcher.find(this.t)) {
            String replaceFirst = matcher.replaceFirst(Character.toString(c));
            this.b.replace(0, replaceFirst.length(), replaceFirst);
            this.t = matcher.start();
            return this.b.substring(0, this.t + 1);
        }
        if (this.A.size() == 1) {
            this.f = false;
        }
        this.c = "";
        return this.d.toString();
    }

    private String h() {
        int i;
        int i2 = 1;
        if (this.n.r != 1 || this.z.charAt(0) != '1' || this.z.charAt(1) == '0' || this.z.charAt(1) == '1') {
            i = 0;
        } else {
            i = 1;
        }
        if (i != 0) {
            this.w.append('1').append(' ');
            this.h = true;
        } else {
            if (!this.n.w.equals("")) {
                Matcher matcher = this.B.a(this.n.w).matcher(this.z);
                if (matcher.lookingAt() && matcher.end() > 0) {
                    this.h = true;
                    i2 = matcher.end();
                    this.w.append(this.z.substring(0, i2));
                }
            }
            i2 = 0;
        }
        String substring = this.z.substring(0, i2);
        this.z.delete(0, i2);
        return substring;
    }
}
