import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class jar {
    private static final Pattern A;
    private static final Pattern B;
    private static final Pattern C;
    private static jar D;
    static final jal a;
    static final Pattern b;
    static final Pattern c;
    static final Pattern d;
    static final String e;
    static final Pattern f;
    private static final Logger g;
    private static final Map<Integer, String> h;
    private static final Set<Integer> i;
    private static final Set<Integer> j;
    private static final Map<Character, Character> k;
    private static final Map<Character, Character> l;
    private static final Map<Character, Character> m;
    private static final Map<Character, Character> n;
    private static final Pattern o;
    private static final String p;
    private static final Pattern q;
    private static final Pattern r;
    private static final Pattern s;
    private static final Pattern t;
    private static final String u;
    private static final String v;
    private static final Pattern w;
    private static final Pattern x;
    private static final Pattern y;
    private static final Pattern z;
    private final jan E;
    private final Map<Integer, List<String>> F;
    private final Set<String> G;
    private final jaz H;
    private final Set<String> I;
    private final Set<Integer> J;

    static {
        a = new jal();
        g = Logger.getLogger(jar.class.getName());
        Map hashMap = new HashMap();
        hashMap.put(Integer.valueOf(52), "1");
        hashMap.put(Integer.valueOf(54), "9");
        h = Collections.unmodifiableMap(hashMap);
        Collection hashSet = new HashSet();
        hashSet.add(Integer.valueOf(86));
        i = Collections.unmodifiableSet(hashSet);
        Set hashSet2 = new HashSet();
        hashSet2.add(Integer.valueOf(52));
        hashSet2.add(Integer.valueOf(54));
        hashSet2.add(Integer.valueOf(55));
        hashSet2.add(Integer.valueOf(62));
        hashSet2.addAll(hashSet);
        j = Collections.unmodifiableSet(hashSet2);
        Map hashMap2 = new HashMap();
        hashMap2.put(Character.valueOf('0'), Character.valueOf('0'));
        hashMap2.put(Character.valueOf('1'), Character.valueOf('1'));
        hashMap2.put(Character.valueOf('2'), Character.valueOf('2'));
        hashMap2.put(Character.valueOf('3'), Character.valueOf('3'));
        hashMap2.put(Character.valueOf('4'), Character.valueOf('4'));
        hashMap2.put(Character.valueOf('5'), Character.valueOf('5'));
        hashMap2.put(Character.valueOf('6'), Character.valueOf('6'));
        hashMap2.put(Character.valueOf('7'), Character.valueOf('7'));
        hashMap2.put(Character.valueOf('8'), Character.valueOf('8'));
        hashMap2.put(Character.valueOf('9'), Character.valueOf('9'));
        hashMap = new HashMap(40);
        hashMap.put(Character.valueOf('A'), Character.valueOf('2'));
        hashMap.put(Character.valueOf('B'), Character.valueOf('2'));
        hashMap.put(Character.valueOf('C'), Character.valueOf('2'));
        hashMap.put(Character.valueOf('D'), Character.valueOf('3'));
        hashMap.put(Character.valueOf('E'), Character.valueOf('3'));
        hashMap.put(Character.valueOf('F'), Character.valueOf('3'));
        hashMap.put(Character.valueOf('G'), Character.valueOf('4'));
        hashMap.put(Character.valueOf('H'), Character.valueOf('4'));
        hashMap.put(Character.valueOf('I'), Character.valueOf('4'));
        hashMap.put(Character.valueOf('J'), Character.valueOf('5'));
        hashMap.put(Character.valueOf('K'), Character.valueOf('5'));
        hashMap.put(Character.valueOf('L'), Character.valueOf('5'));
        hashMap.put(Character.valueOf('M'), Character.valueOf('6'));
        hashMap.put(Character.valueOf('N'), Character.valueOf('6'));
        hashMap.put(Character.valueOf('O'), Character.valueOf('6'));
        hashMap.put(Character.valueOf('P'), Character.valueOf('7'));
        hashMap.put(Character.valueOf('Q'), Character.valueOf('7'));
        hashMap.put(Character.valueOf('R'), Character.valueOf('7'));
        hashMap.put(Character.valueOf('S'), Character.valueOf('7'));
        hashMap.put(Character.valueOf('T'), Character.valueOf('8'));
        hashMap.put(Character.valueOf('U'), Character.valueOf('8'));
        hashMap.put(Character.valueOf('V'), Character.valueOf('8'));
        hashMap.put(Character.valueOf('W'), Character.valueOf('9'));
        hashMap.put(Character.valueOf('X'), Character.valueOf('9'));
        hashMap.put(Character.valueOf('Y'), Character.valueOf('9'));
        hashMap.put(Character.valueOf('Z'), Character.valueOf('9'));
        l = Collections.unmodifiableMap(hashMap);
        hashMap = new HashMap(100);
        hashMap.putAll(l);
        hashMap.putAll(hashMap2);
        m = Collections.unmodifiableMap(hashMap);
        hashMap = new HashMap();
        hashMap.putAll(hashMap2);
        hashMap.put(Character.valueOf('+'), Character.valueOf('+'));
        hashMap.put(Character.valueOf('*'), Character.valueOf('*'));
        k = Collections.unmodifiableMap(hashMap);
        Map hashMap3 = new HashMap();
        for (Character charValue : l.keySet()) {
            char charValue2 = charValue.charValue();
            hashMap3.put(Character.valueOf(Character.toLowerCase(charValue2)), Character.valueOf(charValue2));
            hashMap3.put(Character.valueOf(charValue2), Character.valueOf(charValue2));
        }
        hashMap3.putAll(hashMap2);
        hashMap3.put(Character.valueOf('-'), Character.valueOf('-'));
        hashMap3.put(Character.valueOf('\uff0d'), Character.valueOf('-'));
        hashMap3.put(Character.valueOf('\u2010'), Character.valueOf('-'));
        hashMap3.put(Character.valueOf('\u2011'), Character.valueOf('-'));
        hashMap3.put(Character.valueOf('\u2012'), Character.valueOf('-'));
        hashMap3.put(Character.valueOf('\u2013'), Character.valueOf('-'));
        hashMap3.put(Character.valueOf('\u2014'), Character.valueOf('-'));
        hashMap3.put(Character.valueOf('\u2015'), Character.valueOf('-'));
        hashMap3.put(Character.valueOf('\u2212'), Character.valueOf('-'));
        hashMap3.put(Character.valueOf('/'), Character.valueOf('/'));
        hashMap3.put(Character.valueOf('\uff0f'), Character.valueOf('/'));
        hashMap3.put(Character.valueOf(' '), Character.valueOf(' '));
        hashMap3.put(Character.valueOf('\u3000'), Character.valueOf(' '));
        hashMap3.put(Character.valueOf('\u2060'), Character.valueOf(' '));
        hashMap3.put(Character.valueOf('.'), Character.valueOf('.'));
        hashMap3.put(Character.valueOf('\uff0e'), Character.valueOf('.'));
        n = Collections.unmodifiableMap(hashMap3);
        o = Pattern.compile("[\\d]+(?:[~\u2053\u223c\uff5e][\\d]+)?");
        String valueOf = String.valueOf(Arrays.toString(l.keySet().toArray()).replaceAll("[, \\[\\]]", ""));
        String valueOf2 = String.valueOf(Arrays.toString(l.keySet().toArray()).toLowerCase().replaceAll("[, \\[\\]]", ""));
        if (valueOf2.length() != 0) {
            valueOf2 = valueOf.concat(valueOf2);
        } else {
            valueOf2 = new String(valueOf);
        }
        p = valueOf2;
        b = Pattern.compile("[+\uff0b]+");
        q = Pattern.compile("[-x\u2010-\u2015\u2212\u30fc\uff0d-\uff0f \u00a0\u00ad\u200b\u2060\u3000()\uff08\uff09\uff3b\uff3d.\\[\\]/~\u2053\u223c\uff5e]+");
        r = Pattern.compile("(\\p{Nd})");
        s = Pattern.compile("[+\uff0b\\p{Nd}]");
        c = Pattern.compile("[\\\\/] *x");
        d = Pattern.compile("[[\\P{N}&&\\P{L}]&&[^#]]+$");
        t = Pattern.compile("(?:.*?[A-Za-z]){3}.*");
        valueOf2 = String.valueOf(String.valueOf("\\p{Nd}{2}|[+\uff0b]*+(?:[-x\u2010-\u2015\u2212\u30fc\uff0d-\uff0f \u00a0\u00ad\u200b\u2060\u3000()\uff08\uff09\uff3b\uff3d.\\[\\]/~\u2053\u223c\uff5e*]*\\p{Nd}){3,}[-x\u2010-\u2015\u2212\u30fc\uff0d-\uff0f \u00a0\u00ad\u200b\u2060\u3000()\uff08\uff09\uff3b\uff3d.\\[\\]/~\u2053\u223c\uff5e*"));
        valueOf = String.valueOf(String.valueOf(p));
        String valueOf3 = String.valueOf(String.valueOf("\\p{Nd}"));
        u = new StringBuilder(((valueOf2.length() + 2) + valueOf.length()) + valueOf3.length()).append(valueOf2).append(valueOf).append(valueOf3).append("]*").toString();
        valueOf = "x\uff58#\uff03~\uff5e";
        valueOf3 = ",";
        valueOf2 = String.valueOf(valueOf);
        v = g(valueOf2.length() != 0 ? valueOf3.concat(valueOf2) : new String(valueOf3));
        e = g(valueOf);
        valueOf2 = String.valueOf(String.valueOf(v));
        w = Pattern.compile(new StringBuilder(valueOf2.length() + 5).append("(?:").append(valueOf2).append(")$").toString(), 66);
        valueOf2 = String.valueOf(String.valueOf(u));
        valueOf = String.valueOf(String.valueOf(v));
        x = Pattern.compile(new StringBuilder((valueOf2.length() + 5) + valueOf.length()).append(valueOf2).append("(?:").append(valueOf).append(")?").toString(), 66);
        f = Pattern.compile("(\\D+)");
        y = Pattern.compile("(\\$\\d)");
        z = Pattern.compile("\\$NP");
        A = Pattern.compile("\\$FG");
        B = Pattern.compile("\\$CC");
        C = Pattern.compile("\\(?\\$1\\)?");
        D = null;
    }

    private static String g(String str) {
        String valueOf = String.valueOf(String.valueOf(";ext=(\\p{Nd}{1,7})|[ \u00a0\\t,]*(?:e?xt(?:ensi(?:o\u0301?|\u00f3))?n?|\uff45?\uff58\uff54\uff4e?|["));
        String valueOf2 = String.valueOf(String.valueOf(str));
        String valueOf3 = String.valueOf(String.valueOf("(\\p{Nd}{1,7})"));
        String valueOf4 = String.valueOf(String.valueOf("\\p{Nd}"));
        return new StringBuilder((((valueOf.length() + 48) + valueOf2.length()) + valueOf3.length()) + valueOf4.length()).append(valueOf).append(valueOf2).append("]|int|anexo|\uff49\uff4e\uff54)[:\\.\uff0e]?[ \u00a0\\t,-]*").append(valueOf3).append("#?|[- ]+(").append(valueOf4).append("{1,5})#").toString();
    }

    private jar(jan jan, Map<Integer, List<String>> map) {
        this.G = new HashSet(35);
        this.H = new jaz(100);
        this.I = new HashSet(320);
        this.J = new HashSet();
        this.E = jan;
        this.F = map;
        for (Entry entry : map.entrySet()) {
            List list = (List) entry.getValue();
            if (list.size() == 1 && "001".equals(list.get(0))) {
                this.J.add(entry.getKey());
            } else {
                this.I.addAll(list);
            }
        }
        if (this.I.remove("001")) {
            g.log(Level.WARNING, "invalid metadata (country calling code was mapped to the non-geo entity as well as specific region(s))");
        }
        this.G.addAll((Collection) map.get(Integer.valueOf(1)));
    }

    static String a(String str) {
        Matcher matcher = s.matcher(str);
        if (!matcher.find()) {
            return "";
        }
        String substring = str.substring(matcher.start());
        Matcher matcher2 = d.matcher(substring);
        if (matcher2.find()) {
            String substring2 = substring.substring(0, matcher2.start());
            Logger logger = g;
            Level level = Level.FINER;
            String str2 = "Stripped trailing characters: ";
            substring = String.valueOf(substring2);
            logger.log(level, substring.length() != 0 ? str2.concat(substring) : new String(str2));
            substring = substring2;
        }
        matcher2 = c.matcher(substring);
        if (matcher2.find()) {
            return substring.substring(0, matcher2.start());
        }
        return substring;
    }

    private static boolean h(String str) {
        if (str.length() < 2) {
            return false;
        }
        return x.matcher(str).matches();
    }

    private static void b(StringBuilder stringBuilder) {
        String stringBuilder2;
        String stringBuilder3 = stringBuilder.toString();
        if (t.matcher(stringBuilder3).matches()) {
            Map map = m;
            StringBuilder stringBuilder4 = new StringBuilder(stringBuilder3.length());
            for (int i = 0; i < stringBuilder3.length(); i++) {
                Character ch = (Character) map.get(Character.valueOf(Character.toUpperCase(stringBuilder3.charAt(i))));
                if (ch != null) {
                    stringBuilder4.append(ch);
                }
            }
            stringBuilder2 = stringBuilder4.toString();
        } else {
            stringBuilder2 = b(stringBuilder3);
        }
        stringBuilder.replace(0, stringBuilder.length(), stringBuilder2);
    }

    private static synchronized void a(jar jar) {
        synchronized (jar.class) {
            D = jar;
        }
    }

    public Set<String> a() {
        return Collections.unmodifiableSet(this.I);
    }

    public static synchronized jar b() {
        jar jar;
        synchronized (jar.class) {
            if (D == null) {
                jal jal = a;
                if (jal == null) {
                    throw new IllegalArgumentException("metadataLoader could not be null.");
                }
                a(new jar(new jao(jal), gwb.aB()));
            }
            jar = D;
        }
        return jar;
    }

    static boolean c(String str) {
        return str.length() == 0 || C.matcher(str).matches();
    }

    private boolean i(String str) {
        return str != null && this.I.contains(str);
    }

    public String a(jax jax, int i) {
        if (jax.b() == 0 && jax.h()) {
            String i2 = jax.i();
            if (i2.length() > 0) {
                return i2;
            }
        }
        StringBuilder stringBuilder = new StringBuilder(20);
        a(jax, i, stringBuilder);
        return stringBuilder.toString();
    }

    public void a(jax jax, int i, StringBuilder stringBuilder) {
        stringBuilder.setLength(0);
        int a = jax.a();
        String a2 = a(jax);
        if (i == jau.a) {
            stringBuilder.append(a2);
            a(a, jau.a, stringBuilder);
        } else if (this.F.containsKey(Integer.valueOf(a))) {
            String str;
            jbg a3 = a(a, b(a));
            jbf[] jbfArr = (a3.A.length == 0 || i == jau.c) ? a3.z : a3.A;
            jbf a4 = a(jbfArr, a2);
            if (a4 == null) {
                str = a2;
            } else {
                String str2 = null;
                Object obj = a4.b;
                Matcher matcher = this.H.a(a4.a).matcher(a2);
                if (i != jau.c || str2 == null || str2.length() <= 0 || a4.f.length() <= 0) {
                    str = a4.d;
                    if (i != jau.c || str == null || str.length() <= 0) {
                        str = matcher.replaceAll(obj);
                    } else {
                        str = matcher.replaceAll(y.matcher(obj).replaceFirst(str));
                    }
                } else {
                    str = matcher.replaceAll(y.matcher(obj).replaceFirst(B.matcher(a4.f).replaceFirst(str2)));
                }
                if (i == jau.d) {
                    CharSequence replaceFirst;
                    matcher = q.matcher(replaceFirst);
                    if (matcher.lookingAt()) {
                        replaceFirst = matcher.replaceFirst("");
                    }
                    str = matcher.reset(replaceFirst).replaceAll("-");
                }
            }
            stringBuilder.append(str);
            if (jax.c() && jax.d().length() > 0) {
                if (i == jau.d) {
                    stringBuilder.append(";ext=").append(jax.d());
                } else if (a3.v.equals("")) {
                    stringBuilder.append(" ext. ").append(jax.d());
                } else {
                    stringBuilder.append(a3.v).append(jax.d());
                }
            }
            a(a, i, stringBuilder);
        } else {
            stringBuilder.append(a2);
        }
    }

    private jbg a(int i, String str) {
        return "001".equals(str) ? a(i) : d(str);
    }

    public String a(jax jax) {
        StringBuilder stringBuilder = new StringBuilder();
        if (jax.f()) {
            char[] cArr = new char[jax.g()];
            Arrays.fill(cArr, '0');
            stringBuilder.append(new String(cArr));
        }
        stringBuilder.append(jax.b());
        return stringBuilder.toString();
    }

    private static void a(int i, int i2, StringBuilder stringBuilder) {
        switch (jas.b[i2 - 1]) {
            case wi.j /*1*/:
                stringBuilder.insert(0, i).insert(0, '+');
            case wi.l /*2*/:
                stringBuilder.insert(0, " ").insert(0, i).insert(0, '+');
            case wi.z /*3*/:
                stringBuilder.insert(0, "-").insert(0, i).insert(0, '+').insert(0, "tel:");
            default:
        }
    }

    jbf a(jbf[] jbfArr, String str) {
        for (jbf jbf : jbfArr) {
            int length = jbf.c.length;
            if ((length == 0 || this.H.a(jbf.c[length - 1]).matcher(str).lookingAt()) && this.H.a(jbf.a).matcher(str).matches()) {
                return jbf;
            }
        }
        return null;
    }

    private int a(String str, jbg jbg) {
        if (!b(str, jbg.a)) {
            return jav.l;
        }
        if (b(str, jbg.e)) {
            return jav.e;
        }
        if (b(str, jbg.d)) {
            return jav.d;
        }
        if (b(str, jbg.f)) {
            return jav.f;
        }
        if (b(str, jbg.h)) {
            return jav.g;
        }
        if (b(str, jbg.g)) {
            return jav.h;
        }
        if (b(str, jbg.i)) {
            return jav.i;
        }
        if (b(str, jbg.j)) {
            return jav.j;
        }
        if (b(str, jbg.l)) {
            return jav.k;
        }
        if (b(str, jbg.b)) {
            if (jbg.y) {
                return jav.c;
            }
            if (b(str, jbg.c)) {
                return jav.c;
            }
            return jav.a;
        } else if (jbg.y || !b(str, jbg.c)) {
            return jav.l;
        } else {
            return jav.b;
        }
    }

    jbg d(String str) {
        if (i(str)) {
            return this.E.a(str);
        }
        return null;
    }

    jbg a(int i) {
        if (this.F.containsKey(Integer.valueOf(i))) {
            return this.E.a(i);
        }
        return null;
    }

    boolean a(String str, jbi jbi) {
        return this.H.a(jbi.b).matcher(str).matches();
    }

    boolean b(String str, jbi jbi) {
        return a(str, jbi) && this.H.a(jbi.a).matcher(str).matches();
    }

    public boolean b(jax jax) {
        return a(jax, c(jax));
    }

    public boolean a(jax jax, String str) {
        int a = jax.a();
        jbg a2 = a(a, str);
        if (a2 == null) {
            return false;
        }
        if (("001".equals(str) || a == j(str)) && a(a(jax), a2) != jav.l) {
            return true;
        }
        return false;
    }

    public String c(jax jax) {
        int a = jax.a();
        List list = (List) this.F.get(Integer.valueOf(a));
        if (list == null) {
            String a2 = a(jax);
            Logger logger = g;
            Level level = Level.INFO;
            a2 = String.valueOf(String.valueOf(a2));
            logger.log(level, new StringBuilder(a2.length() + 54).append("Missing/invalid country_code (").append(a).append(") for number ").append(a2).toString());
            return null;
        } else if (list.size() == 1) {
            return (String) list.get(0);
        } else {
            return a(jax, list);
        }
    }

    private String a(jax jax, List<String> list) {
        String a = a(jax);
        for (String str : list) {
            jbg d = d(str);
            if (d.C.equals("")) {
                if (a(a, d) != jav.l) {
                    return str;
                }
            } else if (this.H.a(d.C).matcher(a).lookingAt()) {
                return str;
            }
        }
        return null;
    }

    public String b(int i) {
        List list = (List) this.F.get(Integer.valueOf(i));
        return list == null ? "ZZ" : (String) list.get(0);
    }

    public int e(String str) {
        if (i(str)) {
            return j(str);
        }
        Logger logger = g;
        Level level = Level.WARNING;
        if (str == null) {
            str = "null";
        }
        String valueOf = String.valueOf(String.valueOf(str));
        logger.log(level, new StringBuilder(valueOf.length() + 43).append("Invalid or missing region code (").append(valueOf).append(") provided.").toString());
        return 0;
    }

    private int j(String str) {
        jbg d = d(str);
        if (d != null) {
            return d.r;
        }
        String str2 = "Invalid region code: ";
        String valueOf = String.valueOf(str);
        throw new IllegalArgumentException(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
    }

    private static int a(Pattern pattern, String str) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.matches()) {
            return jaw.a;
        }
        if (matcher.lookingAt()) {
            return jaw.d;
        }
        return jaw.c;
    }

    public jak f(String str) {
        return new jak(str);
    }

    int a(StringBuilder stringBuilder, StringBuilder stringBuilder2) {
        if (stringBuilder.length() == 0 || stringBuilder.charAt(0) == '0') {
            return 0;
        }
        int length = stringBuilder.length();
        int i = 1;
        while (i <= 3 && i <= length) {
            int parseInt = Integer.parseInt(stringBuilder.substring(0, i));
            if (this.F.containsKey(Integer.valueOf(parseInt))) {
                stringBuilder2.append(stringBuilder.substring(i));
                return parseInt;
            }
            i++;
        }
        return 0;
    }

    int a(String str, jbg jbg, StringBuilder stringBuilder, boolean z, jax jax) {
        if (str.length() == 0) {
            return 0;
        }
        StringBuilder stringBuilder2 = new StringBuilder(str);
        String str2 = "NonMatch";
        if (jbg != null) {
            str2 = jbg.s;
        }
        jay a = a(stringBuilder2, str2);
        if (z) {
            jax.a(a);
        }
        int i;
        if (a == jay.FROM_DEFAULT_COUNTRY) {
            if (jbg != null) {
                i = jbg.r;
                String valueOf = String.valueOf(i);
                String stringBuilder3 = stringBuilder2.toString();
                if (stringBuilder3.startsWith(valueOf)) {
                    StringBuilder stringBuilder4 = new StringBuilder(stringBuilder3.substring(valueOf.length()));
                    jbi jbi = jbg.a;
                    Pattern a2 = this.H.a(jbi.a);
                    a(stringBuilder4, jbg, null);
                    Pattern a3 = this.H.a(jbi.b);
                    if ((!a2.matcher(stringBuilder2).matches() && a2.matcher(stringBuilder4).matches()) || a(a3, stringBuilder2.toString()) == jaw.d) {
                        stringBuilder.append(stringBuilder4);
                        if (z) {
                            jax.a(jay.FROM_NUMBER_WITHOUT_PLUS_SIGN);
                        }
                        jax.a(i);
                        return i;
                    }
                }
            }
            jax.a(0);
            return 0;
        } else if (stringBuilder2.length() <= 2) {
            throw new jap(jaq.TOO_SHORT_AFTER_IDD, "Phone number had an IDD, but after this was not long enough to be a viable phone number.");
        } else {
            i = a(stringBuilder2, stringBuilder);
            if (i != 0) {
                jax.a(i);
                return i;
            }
            throw new jap(jaq.INVALID_COUNTRY_CODE, "Country calling code supplied was not recognised.");
        }
    }

    jay a(StringBuilder stringBuilder, String str) {
        int i = 1;
        if (stringBuilder.length() == 0) {
            return jay.FROM_DEFAULT_COUNTRY;
        }
        Matcher matcher = b.matcher(stringBuilder);
        if (matcher.lookingAt()) {
            stringBuilder.delete(0, matcher.end());
            b(stringBuilder);
            return jay.FROM_NUMBER_WITH_PLUS_SIGN;
        }
        Pattern a = this.H.a(str);
        b(stringBuilder);
        matcher = a.matcher(stringBuilder);
        if (matcher.lookingAt()) {
            int end = matcher.end();
            Matcher matcher2 = r.matcher(stringBuilder.substring(end));
            if (!(matcher2.find() && b(matcher2.group(1)).equals("0"))) {
                stringBuilder.delete(0, end);
                if (i == 0) {
                    return jay.FROM_NUMBER_WITH_IDD;
                }
                return jay.FROM_DEFAULT_COUNTRY;
            }
        }
        i = 0;
        if (i == 0) {
            return jay.FROM_DEFAULT_COUNTRY;
        }
        return jay.FROM_NUMBER_WITH_IDD;
    }

    boolean a(StringBuilder stringBuilder, jbg jbg, StringBuilder stringBuilder2) {
        int length = stringBuilder.length();
        String str = jbg.w;
        if (length == 0 || str.length() == 0) {
            return false;
        }
        Matcher matcher = this.H.a(str).matcher(stringBuilder);
        if (!matcher.lookingAt()) {
            return false;
        }
        Pattern a = this.H.a(jbg.a.a);
        boolean matches = a.matcher(stringBuilder).matches();
        int groupCount = matcher.groupCount();
        String str2 = jbg.x;
        if (str2 != null && str2.length() != 0 && matcher.group(groupCount) != null) {
            StringBuilder stringBuilder3 = new StringBuilder(stringBuilder);
            stringBuilder3.replace(0, length, matcher.replaceFirst(str2));
            if (matches && !a.matcher(stringBuilder3.toString()).matches()) {
                return false;
            }
            if (stringBuilder2 != null && groupCount > 1) {
                stringBuilder2.append(matcher.group(1));
            }
            stringBuilder.replace(0, stringBuilder.length(), stringBuilder3.toString());
            return true;
        } else if (matches && !a.matcher(stringBuilder.substring(matcher.end())).matches()) {
            return false;
        } else {
            if (!(stringBuilder2 == null || groupCount <= 0 || matcher.group(groupCount) == null)) {
                stringBuilder2.append(matcher.group(1));
            }
            stringBuilder.delete(0, matcher.end());
            return true;
        }
    }

    String a(StringBuilder stringBuilder) {
        Matcher matcher = w.matcher(stringBuilder);
        if (matcher.find() && h(stringBuilder.substring(0, matcher.start()))) {
            int groupCount = matcher.groupCount();
            for (int i = 1; i <= groupCount; i++) {
                if (matcher.group(i) != null) {
                    String group = matcher.group(i);
                    stringBuilder.delete(matcher.start(), stringBuilder.length());
                    return group;
                }
            }
        }
        return "";
    }

    public jax a(String str, String str2) {
        jax jax = new jax();
        a(str, str2, jax);
        return jax;
    }

    public void a(String str, String str2, jax jax) {
        a(str, str2, false, true, jax);
    }

    private static void a(String str, jax jax) {
        if (str.length() > 1 && str.charAt(0) == '0') {
            jax.a(true);
            int i = 1;
            while (i < str.length() - 1 && str.charAt(i) == '0') {
                i++;
            }
            if (i != 1) {
                jax.b(i);
            }
        }
    }

    private void a(String str, String str2, boolean z, boolean z2, jax jax) {
        Object obj = null;
        if (str == null) {
            throw new jap(jaq.NOT_A_NUMBER, "The phone number supplied was null.");
        } else if (str.length() > 250) {
            throw new jap(jaq.TOO_LONG, "The string supplied was too long to parse.");
        } else {
            int i;
            StringBuilder stringBuilder = new StringBuilder();
            int indexOf = str.indexOf(";phone-context=");
            if (indexOf > 0) {
                i = indexOf + 15;
                if (str.charAt(i) == '+') {
                    int indexOf2 = str.indexOf(59, i);
                    if (indexOf2 > 0) {
                        stringBuilder.append(str.substring(i, indexOf2));
                    } else {
                        stringBuilder.append(str.substring(i));
                    }
                }
                i = str.indexOf("tel:");
                if (i >= 0) {
                    i += 4;
                } else {
                    i = 0;
                }
                stringBuilder.append(str.substring(i, indexOf));
            } else {
                stringBuilder.append(a(str));
            }
            i = stringBuilder.indexOf(";isub=");
            if (i > 0) {
                stringBuilder.delete(i, stringBuilder.length());
            }
            if (h(stringBuilder.toString())) {
                if (z2) {
                    Object obj2;
                    CharSequence stringBuilder2 = stringBuilder.toString();
                    if (i(str2) || !(stringBuilder2 == null || stringBuilder2.length() == 0 || !b.matcher(stringBuilder2).lookingAt())) {
                        i = 1;
                    } else {
                        obj2 = null;
                    }
                    if (obj2 == null) {
                        throw new jap(jaq.INVALID_COUNTRY_CODE, "Missing or invalid default region.");
                    }
                }
                String a = a(stringBuilder);
                if (a.length() > 0) {
                    jax.a(a);
                }
                jbg d = d(str2);
                StringBuilder stringBuilder3 = new StringBuilder();
                try {
                    i = a(stringBuilder.toString(), d, stringBuilder3, false, jax);
                } catch (jap e) {
                    Matcher matcher = b.matcher(stringBuilder.toString());
                    if (e.a() == jaq.INVALID_COUNTRY_CODE && matcher.lookingAt()) {
                        i = a(stringBuilder.substring(matcher.end()), d, stringBuilder3, false, jax);
                        if (i == 0) {
                            throw new jap(jaq.INVALID_COUNTRY_CODE, "Could not interpret numbers after plus-sign.");
                        }
                    }
                    throw new jap(e.a(), e.getMessage());
                }
                if (i != 0) {
                    String b = b(i);
                    if (!b.equals(str2)) {
                        d = a(i, b);
                    }
                } else {
                    b(stringBuilder);
                    stringBuilder3.append(stringBuilder);
                    if (str2 != null) {
                        jax.a(d.r);
                    }
                }
                if (stringBuilder3.length() < 2) {
                    throw new jap(jaq.TOO_SHORT_NSN, "The string supplied is too short to be a phone number.");
                }
                if (d != null) {
                    StringBuilder stringBuilder4 = new StringBuilder();
                    StringBuilder stringBuilder5 = new StringBuilder(stringBuilder3);
                    a(stringBuilder5, d, stringBuilder4);
                    if (a(this.H.a(d.a.b), stringBuilder5.toString()) == jaw.c) {
                        obj = 1;
                    }
                    if (obj == null) {
                        stringBuilder3 = stringBuilder5;
                    }
                }
                i = stringBuilder3.length();
                if (i < 2) {
                    throw new jap(jaq.TOO_SHORT_NSN, "The string supplied is too short to be a phone number.");
                } else if (i > 17) {
                    throw new jap(jaq.TOO_LONG, "The string supplied is too long to be a phone number.");
                } else {
                    a(stringBuilder3.toString(), jax);
                    jax.a(Long.parseLong(stringBuilder3.toString()));
                    return;
                }
            }
            throw new jap(jaq.NOT_A_NUMBER, "The string supplied did not seem to be a phone number.");
        }
    }

    public jat a(jax jax, jax jax2) {
        jax jax3 = new jax();
        jax3.a(jax);
        jax jax4 = new jax();
        jax4.a(jax2);
        jax3.j();
        jax3.k();
        jax3.l();
        jax4.j();
        jax4.k();
        jax4.l();
        if (jax3.c() && jax3.d().length() == 0) {
            jax3.e();
        }
        if (jax4.c() && jax4.d().length() == 0) {
            jax4.e();
        }
        if (jax3.c() && jax4.c() && !jax3.d().equals(jax4.d())) {
            return jat.NO_MATCH;
        }
        int a = jax3.a();
        int a2 = jax4.a();
        if (a == 0 || a2 == 0) {
            jax3.a(a2);
            if (jax3.b(jax4)) {
                return jat.NSN_MATCH;
            }
            if (b(jax3, jax4)) {
                return jat.SHORT_NSN_MATCH;
            }
            return jat.NO_MATCH;
        } else if (jax3.b(jax4)) {
            return jat.EXACT_MATCH;
        } else {
            if (a == a2 && b(jax3, jax4)) {
                return jat.SHORT_NSN_MATCH;
            }
            return jat.NO_MATCH;
        }
    }

    private static boolean b(jax jax, jax jax2) {
        String valueOf = String.valueOf(jax.b());
        String valueOf2 = String.valueOf(jax2.b());
        return valueOf.endsWith(valueOf2) || valueOf2.endsWith(valueOf);
    }

    public jat b(String str, String str2) {
        try {
            return b(a(str, "ZZ"), str2);
        } catch (jap e) {
            if (e.a() == jaq.INVALID_COUNTRY_CODE) {
                try {
                    return b(a(str2, "ZZ"), str);
                } catch (jap e2) {
                    if (e2.a() == jaq.INVALID_COUNTRY_CODE) {
                        try {
                            jax jax = new jax();
                            jax jax2 = new jax();
                            a(str, null, false, false, jax);
                            a(str2, null, false, false, jax2);
                            return a(jax, jax2);
                        } catch (jap e3) {
                            return jat.NOT_A_NUMBER;
                        }
                    }
                    return jat.NOT_A_NUMBER;
                }
            }
            return jat.NOT_A_NUMBER;
        }
    }

    public jat b(jax jax, String str) {
        try {
            return a(jax, a(str, "ZZ"));
        } catch (jap e) {
            if (e.a() == jaq.INVALID_COUNTRY_CODE) {
                String b = b(jax.a());
                try {
                    if (b.equals("ZZ")) {
                        jax jax2 = new jax();
                        a(str, null, false, false, jax2);
                        return a(jax, jax2);
                    }
                    jat a = a(jax, a(str, b));
                    if (a == jat.EXACT_MATCH) {
                        return jat.NSN_MATCH;
                    }
                    return a;
                } catch (jap e2) {
                    return jat.NOT_A_NUMBER;
                }
            }
            return jat.NOT_A_NUMBER;
        }
    }

    public static String b(String str) {
        StringBuilder stringBuilder = new StringBuilder(str.length());
        for (char digit : str.toCharArray()) {
            int digit2 = Character.digit(digit, 10);
            if (digit2 != -1) {
                stringBuilder.append(digit2);
            }
        }
        return stringBuilder.toString();
    }
}
