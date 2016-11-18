package p000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class jak {
    private static final jbg f19531l;
    private static final Pattern f19532o = Pattern.compile("\\[([^\\[\\]])*\\]");
    private static final Pattern f19533p = Pattern.compile("\\d(?=[^,}][^,}])");
    private static final Pattern f19534q = Pattern.compile("[-x‐-―−ー－-／  ­​⁠　()（）［］.\\[\\]/~⁓∼～]*(\\$\\d[-x‐-―−ー－-／  ­​⁠　()（）［］.\\[\\]/~⁓∼～]*)+");
    private static final Pattern f19535r = Pattern.compile("[- ]");
    private static final Pattern f19536s = Pattern.compile(" ");
    private List<jbf> f19537A = new ArrayList();
    private jaz f19538B = new jaz(64);
    private String f19539a = "";
    private StringBuilder f19540b = new StringBuilder();
    private String f19541c = "";
    private StringBuilder f19542d = new StringBuilder();
    private StringBuilder f19543e = new StringBuilder();
    private boolean f19544f = true;
    private boolean f19545g = false;
    private boolean f19546h = false;
    private boolean f19547i = false;
    private final jar f19548j = jar.m23675b();
    private String f19549k;
    private jbg f19550m;
    private jbg f19551n;
    private int f19552t = 0;
    private int f19553u = 0;
    private int f19554v = 0;
    private StringBuilder f19555w = new StringBuilder();
    private boolean f19556x = false;
    private String f19557y = "";
    private StringBuilder f19558z = new StringBuilder();

    static {
        jbg jbg = new jbg();
        f19531l = jbg;
        jbg.f19708s = "NA";
    }

    jak(String str) {
        this.f19549k = str;
        this.f19551n = m23640a(this.f19549k);
        this.f19550m = this.f19551n;
    }

    private jbg m23640a(String str) {
        jbg d = this.f19548j.m23706d(this.f19548j.m23702b(this.f19548j.m23707e(str)));
        return d != null ? d : f19531l;
    }

    private boolean m23644c() {
        Iterator it = this.f19537A.iterator();
        while (it.hasNext()) {
            jbf jbf = (jbf) it.next();
            String str = jbf.f19678a;
            if (this.f19541c.equals(str)) {
                return false;
            }
            boolean z;
            CharSequence charSequence = jbf.f19678a;
            if (charSequence.indexOf(124) == -1) {
                String replaceAll = f19533p.matcher(f19532o.matcher(charSequence).replaceAll("\\\\d")).replaceAll("\\\\d");
                this.f19540b.setLength(0);
                String str2 = jbf.f19679b;
                Matcher matcher = this.f19538B.m23741a(replaceAll).matcher("999999999999999");
                matcher.find();
                String group = matcher.group();
                if (group.length() < this.f19558z.length()) {
                    replaceAll = "";
                } else {
                    replaceAll = group.replaceAll(replaceAll, str2).replaceAll("9", " ");
                }
                if (replaceAll.length() > 0) {
                    this.f19540b.append(replaceAll);
                    z = true;
                    if (z) {
                        it.remove();
                    } else {
                        this.f19541c = str;
                        this.f19556x = f19535r.matcher(jbf.f19681d).find();
                        this.f19552t = 0;
                        return true;
                    }
                }
            }
            z = false;
            if (z) {
                it.remove();
            } else {
                this.f19541c = str;
                this.f19556x = f19535r.matcher(jbf.f19681d).find();
                this.f19552t = 0;
                return true;
            }
        }
        this.f19544f = false;
        return false;
    }

    private void m23641b(String str) {
        int length = str.length() - 3;
        Iterator it = this.f19537A.iterator();
        while (it.hasNext()) {
            jbf jbf = (jbf) it.next();
            if (jbf.f19680c.length != 0) {
                if (!this.f19538B.m23741a(jbf.f19680c[Math.min(length, jbf.f19680c.length - 1)]).matcher(str).lookingAt()) {
                    it.remove();
                }
            }
        }
    }

    public void m23653a() {
        this.f19539a = "";
        this.f19542d.setLength(0);
        this.f19543e.setLength(0);
        this.f19540b.setLength(0);
        this.f19552t = 0;
        this.f19541c = "";
        this.f19555w.setLength(0);
        this.f19557y = "";
        this.f19558z.setLength(0);
        this.f19544f = true;
        this.f19545g = false;
        this.f19554v = 0;
        this.f19553u = 0;
        this.f19546h = false;
        this.f19547i = false;
        this.f19537A.clear();
        this.f19556x = false;
        if (!this.f19551n.equals(this.f19550m)) {
            this.f19551n = m23640a(this.f19549k);
        }
    }

    public String m23652a(char c) {
        this.f19539a = m23639a(c, false);
        return this.f19539a;
    }

    public String m23655b(char c) {
        this.f19539a = m23639a(c, true);
        return this.f19539a;
    }

    private String m23639a(char c, boolean z) {
        boolean z2;
        boolean z3 = true;
        this.f19542d.append(c);
        if (z) {
            this.f19553u = this.f19542d.length();
        }
        if (Character.isDigit(c) || (this.f19542d.length() == 1 && jar.f19582b.matcher(Character.toString(c)).matches())) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            if (c == '+') {
                this.f19543e.append(c);
            } else {
                c = Character.forDigit(Character.digit(c, 10), 10);
                this.f19543e.append(c);
                this.f19558z.append(c);
            }
            if (z) {
                this.f19554v = this.f19543e.length();
            }
        } else {
            this.f19544f = false;
            this.f19545g = true;
        }
        if (this.f19544f) {
            switch (this.f19543e.length()) {
                case 0:
                case 1:
                case 2:
                    return this.f19542d.toString();
                case 3:
                    if (m23650i()) {
                        this.f19547i = true;
                        break;
                    }
                    this.f19557y = m23649h();
                    return m23647f();
            }
            String valueOf;
            String valueOf2;
            if (this.f19547i) {
                if (m23651j()) {
                    this.f19547i = false;
                }
                valueOf = String.valueOf(String.valueOf(this.f19555w));
                valueOf2 = String.valueOf(String.valueOf(this.f19558z.toString()));
                return new StringBuilder((valueOf.length() + 0) + valueOf2.length()).append(valueOf).append(valueOf2).toString();
            } else if (this.f19537A.size() <= 0) {
                return m23647f();
            } else {
                valueOf2 = m23642c(c);
                valueOf = m23646e();
                if (valueOf.length() > 0) {
                    return valueOf;
                }
                m23641b(this.f19558z.toString());
                if (m23644c()) {
                    return m23648g();
                }
                return this.f19544f ? m23643c(valueOf2) : this.f19542d.toString();
            }
        } else if (this.f19545g) {
            return this.f19542d.toString();
        } else {
            if (!m23650i()) {
                if (this.f19557y.length() > 0) {
                    this.f19558z.insert(0, this.f19557y);
                    this.f19555w.setLength(this.f19555w.lastIndexOf(this.f19557y));
                }
                if (this.f19557y.equals(m23649h())) {
                    z3 = false;
                }
                if (z3) {
                    this.f19555w.append(' ');
                    return m23645d();
                }
            } else if (m23651j()) {
                return m23645d();
            }
            return this.f19542d.toString();
        }
    }

    private String m23645d() {
        this.f19544f = true;
        this.f19547i = false;
        this.f19537A.clear();
        this.f19552t = 0;
        this.f19540b.setLength(0);
        this.f19541c = "";
        return m23647f();
    }

    private String m23646e() {
        for (jbf jbf : this.f19537A) {
            Matcher matcher = this.f19538B.m23741a(jbf.f19678a).matcher(this.f19558z);
            if (matcher.matches()) {
                this.f19556x = f19535r.matcher(jbf.f19681d).find();
                return m23643c(matcher.replaceAll(jbf.f19679b));
            }
        }
        return "";
    }

    public int m23654b() {
        int i = 0;
        if (!this.f19544f) {
            return this.f19553u;
        }
        int i2 = 0;
        while (i2 < this.f19554v && i < this.f19539a.length()) {
            if (this.f19543e.charAt(i2) == this.f19539a.charAt(i)) {
                i2++;
            }
            i++;
        }
        return i;
    }

    private String m23643c(String str) {
        int length = this.f19555w.length();
        if (!this.f19556x || length <= 0 || this.f19555w.charAt(length - 1) == ' ') {
            String valueOf = String.valueOf(String.valueOf(this.f19555w));
            String valueOf2 = String.valueOf(String.valueOf(str));
            return new StringBuilder((valueOf.length() + 0) + valueOf2.length()).append(valueOf).append(valueOf2).toString();
        }
        valueOf = String.valueOf(String.valueOf(new String(this.f19555w)));
        valueOf2 = String.valueOf(String.valueOf(str));
        return new StringBuilder((valueOf.length() + 1) + valueOf2.length()).append(valueOf).append(' ').append(valueOf2).toString();
    }

    private String m23647f() {
        int i = 0;
        if (this.f19558z.length() < 3) {
            return m23643c(this.f19558z.toString());
        }
        int i2;
        String stringBuilder = this.f19558z.toString();
        jbf[] jbfArr = (!this.f19546h || this.f19551n.f19685A.length <= 0) ? this.f19551n.f19715z : this.f19551n.f19685A;
        if (this.f19551n.f19710u.equals("")) {
            i2 = 0;
        } else {
            i2 = 1;
        }
        int length = jbfArr.length;
        while (i < length) {
            jbf jbf = jbfArr[i];
            if (i2 == 0 || this.f19546h || jbf.f19682e || jar.m23679c(jbf.f19681d)) {
                if (f19534q.matcher(jbf.f19679b).matches()) {
                    this.f19537A.add(jbf);
                }
            }
            i++;
        }
        m23641b(stringBuilder);
        String e = m23646e();
        if (e.length() > 0) {
            return e;
        }
        return m23644c() ? m23648g() : this.f19542d.toString();
    }

    private String m23648g() {
        int length = this.f19558z.length();
        if (length <= 0) {
            return this.f19555w.toString();
        }
        String str = "";
        for (int i = 0; i < length; i++) {
            str = m23642c(this.f19558z.charAt(i));
        }
        return this.f19544f ? m23643c(str) : this.f19542d.toString();
    }

    private boolean m23650i() {
        jaz jaz = this.f19538B;
        String valueOf = String.valueOf("\\+|");
        String valueOf2 = String.valueOf(this.f19551n.f19708s);
        if (valueOf2.length() != 0) {
            valueOf2 = valueOf.concat(valueOf2);
        } else {
            valueOf2 = new String(valueOf);
        }
        Matcher matcher = jaz.m23741a(valueOf2).matcher(this.f19543e);
        if (!matcher.lookingAt()) {
            return false;
        }
        this.f19546h = true;
        int end = matcher.end();
        this.f19558z.setLength(0);
        this.f19558z.append(this.f19543e.substring(end));
        this.f19555w.setLength(0);
        this.f19555w.append(this.f19543e.substring(0, end));
        if (this.f19543e.charAt(0) != '+') {
            this.f19555w.append(' ');
        }
        return true;
    }

    private boolean m23651j() {
        if (this.f19558z.length() == 0) {
            return false;
        }
        StringBuilder stringBuilder = new StringBuilder();
        int a = this.f19548j.m23685a(this.f19558z, stringBuilder);
        if (a == 0) {
            return false;
        }
        this.f19558z.setLength(0);
        this.f19558z.append(stringBuilder);
        String b = this.f19548j.m23702b(a);
        if ("001".equals(b)) {
            this.f19551n = this.f19548j.m23694a(a);
        } else if (!b.equals(this.f19549k)) {
            this.f19551n = m23640a(b);
        }
        this.f19555w.append(Integer.toString(a)).append(' ');
        this.f19557y = "";
        return true;
    }

    private String m23642c(char c) {
        Matcher matcher = f19536s.matcher(this.f19540b);
        if (matcher.find(this.f19552t)) {
            String replaceFirst = matcher.replaceFirst(Character.toString(c));
            this.f19540b.replace(0, replaceFirst.length(), replaceFirst);
            this.f19552t = matcher.start();
            return this.f19540b.substring(0, this.f19552t + 1);
        }
        if (this.f19537A.size() == 1) {
            this.f19544f = false;
        }
        this.f19541c = "";
        return this.f19542d.toString();
    }

    private String m23649h() {
        int i;
        int i2 = 1;
        if (this.f19551n.f19707r != 1 || this.f19558z.charAt(0) != '1' || this.f19558z.charAt(1) == '0' || this.f19558z.charAt(1) == '1') {
            i = 0;
        } else {
            i = 1;
        }
        if (i != 0) {
            this.f19555w.append('1').append(' ');
            this.f19546h = true;
        } else {
            if (!this.f19551n.f19712w.equals("")) {
                Matcher matcher = this.f19538B.m23741a(this.f19551n.f19712w).matcher(this.f19558z);
                if (matcher.lookingAt() && matcher.end() > 0) {
                    this.f19546h = true;
                    i2 = matcher.end();
                    this.f19555w.append(this.f19558z.substring(0, i2));
                }
            }
            i2 = 0;
        }
        String substring = this.f19558z.substring(0, i2);
        this.f19558z.delete(0, i2);
        return substring;
    }
}
