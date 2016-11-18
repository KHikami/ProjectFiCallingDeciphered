package p000;

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
    private static final Pattern f19577A = Pattern.compile("\\$FG");
    private static final Pattern f19578B = Pattern.compile("\\$CC");
    private static final Pattern f19579C = Pattern.compile("\\(?\\$1\\)?");
    private static jar f19580D = null;
    static final jal f19581a = new jal();
    static final Pattern f19582b = Pattern.compile("[+＋]+");
    static final Pattern f19583c = Pattern.compile("[\\\\/] *x");
    static final Pattern f19584d = Pattern.compile("[[\\P{N}&&\\P{L}]&&[^#]]+$");
    static final String f19585e;
    static final Pattern f19586f = Pattern.compile("(\\D+)");
    private static final Logger f19587g = Logger.getLogger(jar.class.getName());
    private static final Map<Integer, String> f19588h;
    private static final Set<Integer> f19589i;
    private static final Set<Integer> f19590j;
    private static final Map<Character, Character> f19591k;
    private static final Map<Character, Character> f19592l;
    private static final Map<Character, Character> f19593m;
    private static final Map<Character, Character> f19594n;
    private static final Pattern f19595o = Pattern.compile("[\\d]+(?:[~⁓∼～][\\d]+)?");
    private static final String f19596p;
    private static final Pattern f19597q = Pattern.compile("[-x‐-―−ー－-／  ­​⁠　()（）［］.\\[\\]/~⁓∼～]+");
    private static final Pattern f19598r = Pattern.compile("(\\p{Nd})");
    private static final Pattern f19599s = Pattern.compile("[+＋\\p{Nd}]");
    private static final Pattern f19600t = Pattern.compile("(?:.*?[A-Za-z]){3}.*");
    private static final String f19601u;
    private static final String f19602v;
    private static final Pattern f19603w;
    private static final Pattern f19604x;
    private static final Pattern f19605y = Pattern.compile("(\\$\\d)");
    private static final Pattern f19606z = Pattern.compile("\\$NP");
    private final jan f19607E;
    private final Map<Integer, List<String>> f19608F;
    private final Set<String> f19609G = new HashSet(35);
    private final jaz f19610H = new jaz(100);
    private final Set<String> f19611I = new HashSet(320);
    private final Set<Integer> f19612J = new HashSet();

    static {
        Map hashMap = new HashMap();
        hashMap.put(Integer.valueOf(52), "1");
        hashMap.put(Integer.valueOf(54), "9");
        f19588h = Collections.unmodifiableMap(hashMap);
        Collection hashSet = new HashSet();
        hashSet.add(Integer.valueOf(86));
        f19589i = Collections.unmodifiableSet(hashSet);
        Set hashSet2 = new HashSet();
        hashSet2.add(Integer.valueOf(52));
        hashSet2.add(Integer.valueOf(54));
        hashSet2.add(Integer.valueOf(55));
        hashSet2.add(Integer.valueOf(62));
        hashSet2.addAll(hashSet);
        f19590j = Collections.unmodifiableSet(hashSet2);
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
        f19592l = Collections.unmodifiableMap(hashMap);
        hashMap = new HashMap(100);
        hashMap.putAll(f19592l);
        hashMap.putAll(hashMap2);
        f19593m = Collections.unmodifiableMap(hashMap);
        hashMap = new HashMap();
        hashMap.putAll(hashMap2);
        hashMap.put(Character.valueOf('+'), Character.valueOf('+'));
        hashMap.put(Character.valueOf('*'), Character.valueOf('*'));
        f19591k = Collections.unmodifiableMap(hashMap);
        Map hashMap3 = new HashMap();
        for (Character charValue : f19592l.keySet()) {
            char charValue2 = charValue.charValue();
            hashMap3.put(Character.valueOf(Character.toLowerCase(charValue2)), Character.valueOf(charValue2));
            hashMap3.put(Character.valueOf(charValue2), Character.valueOf(charValue2));
        }
        hashMap3.putAll(hashMap2);
        hashMap3.put(Character.valueOf('-'), Character.valueOf('-'));
        hashMap3.put(Character.valueOf('－'), Character.valueOf('-'));
        hashMap3.put(Character.valueOf('‐'), Character.valueOf('-'));
        hashMap3.put(Character.valueOf('‑'), Character.valueOf('-'));
        hashMap3.put(Character.valueOf('‒'), Character.valueOf('-'));
        hashMap3.put(Character.valueOf('–'), Character.valueOf('-'));
        hashMap3.put(Character.valueOf('—'), Character.valueOf('-'));
        hashMap3.put(Character.valueOf('―'), Character.valueOf('-'));
        hashMap3.put(Character.valueOf('−'), Character.valueOf('-'));
        hashMap3.put(Character.valueOf('/'), Character.valueOf('/'));
        hashMap3.put(Character.valueOf('／'), Character.valueOf('/'));
        hashMap3.put(Character.valueOf(' '), Character.valueOf(' '));
        hashMap3.put(Character.valueOf('　'), Character.valueOf(' '));
        hashMap3.put(Character.valueOf('⁠'), Character.valueOf(' '));
        hashMap3.put(Character.valueOf('.'), Character.valueOf('.'));
        hashMap3.put(Character.valueOf('．'), Character.valueOf('.'));
        f19594n = Collections.unmodifiableMap(hashMap3);
        String valueOf = String.valueOf(Arrays.toString(f19592l.keySet().toArray()).replaceAll("[, \\[\\]]", ""));
        String valueOf2 = String.valueOf(Arrays.toString(f19592l.keySet().toArray()).toLowerCase().replaceAll("[, \\[\\]]", ""));
        if (valueOf2.length() != 0) {
            valueOf2 = valueOf.concat(valueOf2);
        } else {
            valueOf2 = new String(valueOf);
        }
        f19596p = valueOf2;
        valueOf2 = String.valueOf(String.valueOf("\\p{Nd}{2}|[+＋]*+(?:[-x‐-―−ー－-／  ­​⁠　()（）［］.\\[\\]/~⁓∼～*]*\\p{Nd}){3,}[-x‐-―−ー－-／  ­​⁠　()（）［］.\\[\\]/~⁓∼～*"));
        valueOf = String.valueOf(String.valueOf(f19596p));
        String valueOf3 = String.valueOf(String.valueOf("\\p{Nd}"));
        f19601u = new StringBuilder(((valueOf2.length() + 2) + valueOf.length()) + valueOf3.length()).append(valueOf2).append(valueOf).append(valueOf3).append("]*").toString();
        valueOf = "xｘ#＃~～";
        valueOf3 = ",";
        valueOf2 = String.valueOf(valueOf);
        f19602v = jar.m23680g(valueOf2.length() != 0 ? valueOf3.concat(valueOf2) : new String(valueOf3));
        f19585e = jar.m23680g(valueOf);
        valueOf2 = String.valueOf(String.valueOf(f19602v));
        f19603w = Pattern.compile(new StringBuilder(valueOf2.length() + 5).append("(?:").append(valueOf2).append(")$").toString(), 66);
        valueOf2 = String.valueOf(String.valueOf(f19601u));
        valueOf = String.valueOf(String.valueOf(f19602v));
        f19604x = Pattern.compile(new StringBuilder((valueOf2.length() + 5) + valueOf.length()).append(valueOf2).append("(?:").append(valueOf).append(")?").toString(), 66);
    }

    private static String m23680g(String str) {
        String valueOf = String.valueOf(String.valueOf(";ext=(\\p{Nd}{1,7})|[  \\t,]*(?:e?xt(?:ensi(?:ó?|ó))?n?|ｅ?ｘｔｎ?|["));
        String valueOf2 = String.valueOf(String.valueOf(str));
        String valueOf3 = String.valueOf(String.valueOf("(\\p{Nd}{1,7})"));
        String valueOf4 = String.valueOf(String.valueOf("\\p{Nd}"));
        return new StringBuilder((((valueOf.length() + 48) + valueOf2.length()) + valueOf3.length()) + valueOf4.length()).append(valueOf).append(valueOf2).append("]|int|anexo|ｉｎｔ)[:\\.．]?[  \\t,-]*").append(valueOf3).append("#?|[- ]+(").append(valueOf4).append("{1,5})#").toString();
    }

    private jar(jan jan, Map<Integer, List<String>> map) {
        this.f19607E = jan;
        this.f19608F = map;
        for (Entry entry : map.entrySet()) {
            List list = (List) entry.getValue();
            if (list.size() == 1 && "001".equals(list.get(0))) {
                this.f19612J.add(entry.getKey());
            } else {
                this.f19611I.addAll(list);
            }
        }
        if (this.f19611I.remove("001")) {
            f19587g.log(Level.WARNING, "invalid metadata (country calling code was mapped to the non-geo entity as well as specific region(s))");
        }
        this.f19609G.addAll((Collection) map.get(Integer.valueOf(1)));
    }

    static String m23668a(String str) {
        Matcher matcher = f19599s.matcher(str);
        if (!matcher.find()) {
            return "";
        }
        String substring = str.substring(matcher.start());
        Matcher matcher2 = f19584d.matcher(substring);
        if (matcher2.find()) {
            String substring2 = substring.substring(0, matcher2.start());
            Logger logger = f19587g;
            Level level = Level.FINER;
            String str2 = "Stripped trailing characters: ";
            substring = String.valueOf(substring2);
            logger.log(level, substring.length() != 0 ? str2.concat(substring) : new String(str2));
            substring = substring2;
        }
        matcher2 = f19583c.matcher(substring);
        if (matcher2.find()) {
            return substring.substring(0, matcher2.start());
        }
        return substring;
    }

    private static boolean m23681h(String str) {
        if (str.length() < 2) {
            return false;
        }
        return f19604x.matcher(str).matches();
    }

    private static void m23677b(StringBuilder stringBuilder) {
        String stringBuilder2;
        String stringBuilder3 = stringBuilder.toString();
        if (f19600t.matcher(stringBuilder3).matches()) {
            Map map = f19593m;
            StringBuilder stringBuilder4 = new StringBuilder(stringBuilder3.length());
            for (int i = 0; i < stringBuilder3.length(); i++) {
                Character ch = (Character) map.get(Character.valueOf(Character.toUpperCase(stringBuilder3.charAt(i))));
                if (ch != null) {
                    stringBuilder4.append(ch);
                }
            }
            stringBuilder2 = stringBuilder4.toString();
        } else {
            stringBuilder2 = jar.m23676b(stringBuilder3);
        }
        stringBuilder.replace(0, stringBuilder.length(), stringBuilder2);
    }

    private static synchronized void m23672a(jar jar) {
        synchronized (jar.class) {
            f19580D = jar;
        }
    }

    public Set<String> m23690a() {
        return Collections.unmodifiableSet(this.f19611I);
    }

    public static synchronized jar m23675b() {
        jar jar;
        synchronized (jar.class) {
            if (f19580D == null) {
                jal jal = f19581a;
                if (jal == null) {
                    throw new IllegalArgumentException("metadataLoader could not be null.");
                }
                jar.m23672a(new jar(new jao(jal), gwb.aB()));
            }
            jar = f19580D;
        }
        return jar;
    }

    static boolean m23679c(String str) {
        return str.length() == 0 || f19579C.matcher(str).matches();
    }

    private boolean m23682i(String str) {
        return str != null && this.f19611I.contains(str);
    }

    public String m23689a(jax jax, int i) {
        if (jax.m23726b() == 0 && jax.m23736h()) {
            String i2 = jax.m23737i();
            if (i2.length() > 0) {
                return i2;
            }
        }
        StringBuilder stringBuilder = new StringBuilder(20);
        m23696a(jax, i, stringBuilder);
        return stringBuilder.toString();
    }

    public void m23696a(jax jax, int i, StringBuilder stringBuilder) {
        stringBuilder.setLength(0);
        int a = jax.m23719a();
        String a2 = m23688a(jax);
        if (i == jau.f19622a) {
            stringBuilder.append(a2);
            jar.m23671a(a, jau.f19622a, stringBuilder);
        } else if (this.f19608F.containsKey(Integer.valueOf(a))) {
            String str;
            jbg a3 = m23670a(a, m23702b(a));
            jbf[] jbfArr = (a3.f19685A.length == 0 || i == jau.f19624c) ? a3.f19715z : a3.f19685A;
            jbf a4 = m23693a(jbfArr, a2);
            if (a4 == null) {
                str = a2;
            } else {
                String str2 = null;
                Object obj = a4.f19679b;
                Matcher matcher = this.f19610H.m23741a(a4.f19678a).matcher(a2);
                if (i != jau.f19624c || str2 == null || str2.length() <= 0 || a4.f19683f.length() <= 0) {
                    str = a4.f19681d;
                    if (i != jau.f19624c || str == null || str.length() <= 0) {
                        str = matcher.replaceAll(obj);
                    } else {
                        str = matcher.replaceAll(f19605y.matcher(obj).replaceFirst(str));
                    }
                } else {
                    str = matcher.replaceAll(f19605y.matcher(obj).replaceFirst(f19578B.matcher(a4.f19683f).replaceFirst(str2)));
                }
                if (i == jau.f19625d) {
                    CharSequence replaceFirst;
                    matcher = f19597q.matcher(replaceFirst);
                    if (matcher.lookingAt()) {
                        replaceFirst = matcher.replaceFirst("");
                    }
                    str = matcher.reset(replaceFirst).replaceAll("-");
                }
            }
            stringBuilder.append(str);
            if (jax.m23731c() && jax.m23732d().length() > 0) {
                if (i == jau.f19625d) {
                    stringBuilder.append(";ext=").append(jax.m23732d());
                } else if (a3.f19711v.equals("")) {
                    stringBuilder.append(" ext. ").append(jax.m23732d());
                } else {
                    stringBuilder.append(a3.f19711v).append(jax.m23732d());
                }
            }
            jar.m23671a(a, i, stringBuilder);
        } else {
            stringBuilder.append(a2);
        }
    }

    private jbg m23670a(int i, String str) {
        return "001".equals(str) ? m23694a(i) : m23706d(str);
    }

    public String m23688a(jax jax) {
        StringBuilder stringBuilder = new StringBuilder();
        if (jax.m23734f()) {
            char[] cArr = new char[jax.m23735g()];
            Arrays.fill(cArr, '0');
            stringBuilder.append(new String(cArr));
        }
        stringBuilder.append(jax.m23726b());
        return stringBuilder.toString();
    }

    private static void m23671a(int i, int i2, StringBuilder stringBuilder) {
        switch (jas.f19614b[i2 - 1]) {
            case 1:
                stringBuilder.insert(0, i).insert(0, '+');
                return;
            case 2:
                stringBuilder.insert(0, " ").insert(0, i).insert(0, '+');
                return;
            case 3:
                stringBuilder.insert(0, "-").insert(0, i).insert(0, '+').insert(0, "tel:");
                return;
            default:
                return;
        }
    }

    jbf m23693a(jbf[] jbfArr, String str) {
        for (jbf jbf : jbfArr) {
            int length = jbf.f19680c.length;
            if ((length == 0 || this.f19610H.m23741a(jbf.f19680c[length - 1]).matcher(str).lookingAt()) && this.f19610H.m23741a(jbf.f19678a).matcher(str).matches()) {
                return jbf;
            }
        }
        return null;
    }

    private int m23666a(String str, jbg jbg) {
        if (!m23703b(str, jbg.f19690a)) {
            return jav.f19638l;
        }
        if (m23703b(str, jbg.f19694e)) {
            return jav.f19631e;
        }
        if (m23703b(str, jbg.f19693d)) {
            return jav.f19630d;
        }
        if (m23703b(str, jbg.f19695f)) {
            return jav.f19632f;
        }
        if (m23703b(str, jbg.f19697h)) {
            return jav.f19633g;
        }
        if (m23703b(str, jbg.f19696g)) {
            return jav.f19634h;
        }
        if (m23703b(str, jbg.f19698i)) {
            return jav.f19635i;
        }
        if (m23703b(str, jbg.f19699j)) {
            return jav.f19636j;
        }
        if (m23703b(str, jbg.f19701l)) {
            return jav.f19637k;
        }
        if (m23703b(str, jbg.f19691b)) {
            if (jbg.f19714y) {
                return jav.f19629c;
            }
            if (m23703b(str, jbg.f19692c)) {
                return jav.f19629c;
            }
            return jav.f19627a;
        } else if (jbg.f19714y || !m23703b(str, jbg.f19692c)) {
            return jav.f19638l;
        } else {
            return jav.f19628b;
        }
    }

    jbg m23706d(String str) {
        if (m23682i(str)) {
            return this.f19607E.mo3430a(str);
        }
        return null;
    }

    jbg m23694a(int i) {
        if (this.f19608F.containsKey(Integer.valueOf(i))) {
            return this.f19607E.mo3429a(i);
        }
        return null;
    }

    boolean m23697a(String str, jbi jbi) {
        return this.f19610H.m23741a(jbi.f19718b).matcher(str).matches();
    }

    boolean m23703b(String str, jbi jbi) {
        return m23697a(str, jbi) && this.f19610H.m23741a(jbi.f19717a).matcher(str).matches();
    }

    public boolean m23704b(jax jax) {
        return m23699a(jax, m23705c(jax));
    }

    public boolean m23699a(jax jax, String str) {
        int a = jax.m23719a();
        jbg a2 = m23670a(a, str);
        if (a2 == null) {
            return false;
        }
        if (("001".equals(str) || a == m23683j(str)) && m23666a(m23688a(jax), a2) != jav.f19638l) {
            return true;
        }
        return false;
    }

    public String m23705c(jax jax) {
        int a = jax.m23719a();
        List list = (List) this.f19608F.get(Integer.valueOf(a));
        if (list == null) {
            String a2 = m23688a(jax);
            Logger logger = f19587g;
            Level level = Level.INFO;
            a2 = String.valueOf(String.valueOf(a2));
            logger.log(level, new StringBuilder(a2.length() + 54).append("Missing/invalid country_code (").append(a).append(") for number ").append(a2).toString());
            return null;
        } else if (list.size() == 1) {
            return (String) list.get(0);
        } else {
            return m23669a(jax, list);
        }
    }

    private String m23669a(jax jax, List<String> list) {
        String a = m23688a(jax);
        for (String str : list) {
            jbg d = m23706d(str);
            if (d.f19687C.equals("")) {
                if (m23666a(a, d) != jav.f19638l) {
                    return str;
                }
            } else if (this.f19610H.m23741a(d.f19687C).matcher(a).lookingAt()) {
                return str;
            }
        }
        return null;
    }

    public String m23702b(int i) {
        List list = (List) this.f19608F.get(Integer.valueOf(i));
        return list == null ? "ZZ" : (String) list.get(0);
    }

    public int m23707e(String str) {
        if (m23682i(str)) {
            return m23683j(str);
        }
        Logger logger = f19587g;
        Level level = Level.WARNING;
        if (str == null) {
            str = "null";
        }
        String valueOf = String.valueOf(String.valueOf(str));
        logger.log(level, new StringBuilder(valueOf.length() + 43).append("Invalid or missing region code (").append(valueOf).append(") provided.").toString());
        return 0;
    }

    private int m23683j(String str) {
        jbg d = m23706d(str);
        if (d != null) {
            return d.f19707r;
        }
        String str2 = "Invalid region code: ";
        String valueOf = String.valueOf(str);
        throw new IllegalArgumentException(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
    }

    private static int m23667a(Pattern pattern, String str) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.matches()) {
            return jaw.f19640a;
        }
        if (matcher.lookingAt()) {
            return jaw.f19643d;
        }
        return jaw.f19642c;
    }

    public jak m23708f(String str) {
        return new jak(str);
    }

    int m23685a(StringBuilder stringBuilder, StringBuilder stringBuilder2) {
        if (stringBuilder.length() == 0 || stringBuilder.charAt(0) == '0') {
            return 0;
        }
        int length = stringBuilder.length();
        int i = 1;
        while (i <= 3 && i <= length) {
            int parseInt = Integer.parseInt(stringBuilder.substring(0, i));
            if (this.f19608F.containsKey(Integer.valueOf(parseInt))) {
                stringBuilder2.append(stringBuilder.substring(i));
                return parseInt;
            }
            i++;
        }
        return 0;
    }

    int m23684a(String str, jbg jbg, StringBuilder stringBuilder, boolean z, jax jax) {
        if (str.length() == 0) {
            return 0;
        }
        StringBuilder stringBuilder2 = new StringBuilder(str);
        String str2 = "NonMatch";
        if (jbg != null) {
            str2 = jbg.f19708s;
        }
        jay a = m23692a(stringBuilder2, str2);
        if (z) {
            jax.m23724a(a);
        }
        int i;
        if (a == jay.FROM_DEFAULT_COUNTRY) {
            if (jbg != null) {
                i = jbg.f19707r;
                String valueOf = String.valueOf(i);
                String stringBuilder3 = stringBuilder2.toString();
                if (stringBuilder3.startsWith(valueOf)) {
                    StringBuilder stringBuilder4 = new StringBuilder(stringBuilder3.substring(valueOf.length()));
                    jbi jbi = jbg.f19690a;
                    Pattern a2 = this.f19610H.m23741a(jbi.f19717a);
                    m23698a(stringBuilder4, jbg, null);
                    Pattern a3 = this.f19610H.m23741a(jbi.f19718b);
                    if ((!a2.matcher(stringBuilder2).matches() && a2.matcher(stringBuilder4).matches()) || jar.m23667a(a3, stringBuilder2.toString()) == jaw.f19643d) {
                        stringBuilder.append(stringBuilder4);
                        if (z) {
                            jax.m23724a(jay.FROM_NUMBER_WITHOUT_PLUS_SIGN);
                        }
                        jax.m23720a(i);
                        return i;
                    }
                }
            }
            jax.m23720a(0);
            return 0;
        } else if (stringBuilder2.length() <= 2) {
            throw new jap(jaq.TOO_SHORT_AFTER_IDD, "Phone number had an IDD, but after this was not long enough to be a viable phone number.");
        } else {
            i = m23685a(stringBuilder2, stringBuilder);
            if (i != 0) {
                jax.m23720a(i);
                return i;
            }
            throw new jap(jaq.INVALID_COUNTRY_CODE, "Country calling code supplied was not recognised.");
        }
    }

    jay m23692a(StringBuilder stringBuilder, String str) {
        int i = 1;
        if (stringBuilder.length() == 0) {
            return jay.FROM_DEFAULT_COUNTRY;
        }
        Matcher matcher = f19582b.matcher(stringBuilder);
        if (matcher.lookingAt()) {
            stringBuilder.delete(0, matcher.end());
            jar.m23677b(stringBuilder);
            return jay.FROM_NUMBER_WITH_PLUS_SIGN;
        }
        Pattern a = this.f19610H.m23741a(str);
        jar.m23677b(stringBuilder);
        matcher = a.matcher(stringBuilder);
        if (matcher.lookingAt()) {
            int end = matcher.end();
            Matcher matcher2 = f19598r.matcher(stringBuilder.substring(end));
            if (!(matcher2.find() && jar.m23676b(matcher2.group(1)).equals("0"))) {
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

    boolean m23698a(StringBuilder stringBuilder, jbg jbg, StringBuilder stringBuilder2) {
        int length = stringBuilder.length();
        String str = jbg.f19712w;
        if (length == 0 || str.length() == 0) {
            return false;
        }
        Matcher matcher = this.f19610H.m23741a(str).matcher(stringBuilder);
        if (!matcher.lookingAt()) {
            return false;
        }
        Pattern a = this.f19610H.m23741a(jbg.f19690a.f19717a);
        boolean matches = a.matcher(stringBuilder).matches();
        int groupCount = matcher.groupCount();
        String str2 = jbg.f19713x;
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

    String m23687a(StringBuilder stringBuilder) {
        Matcher matcher = f19603w.matcher(stringBuilder);
        if (matcher.find() && jar.m23681h(stringBuilder.substring(0, matcher.start()))) {
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

    public jax m23691a(String str, String str2) {
        jax jax = new jax();
        m23695a(str, str2, jax);
        return jax;
    }

    public void m23695a(String str, String str2, jax jax) {
        m23673a(str, str2, false, true, jax);
    }

    private static void m23674a(String str, jax jax) {
        if (str.length() > 1 && str.charAt(0) == '0') {
            jax.m23725a(true);
            int i = 1;
            while (i < str.length() - 1 && str.charAt(i) == '0') {
                i++;
            }
            if (i != 1) {
                jax.m23727b(i);
            }
        }
    }

    private void m23673a(String str, String str2, boolean z, boolean z2, jax jax) {
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
                stringBuilder.append(jar.m23668a(str));
            }
            i = stringBuilder.indexOf(";isub=");
            if (i > 0) {
                stringBuilder.delete(i, stringBuilder.length());
            }
            if (jar.m23681h(stringBuilder.toString())) {
                if (z2) {
                    Object obj2;
                    CharSequence stringBuilder2 = stringBuilder.toString();
                    if (m23682i(str2) || !(stringBuilder2 == null || stringBuilder2.length() == 0 || !f19582b.matcher(stringBuilder2).lookingAt())) {
                        i = 1;
                    } else {
                        obj2 = null;
                    }
                    if (obj2 == null) {
                        throw new jap(jaq.INVALID_COUNTRY_CODE, "Missing or invalid default region.");
                    }
                }
                String a = m23687a(stringBuilder);
                if (a.length() > 0) {
                    jax.m23722a(a);
                }
                jbg d = m23706d(str2);
                StringBuilder stringBuilder3 = new StringBuilder();
                try {
                    i = m23684a(stringBuilder.toString(), d, stringBuilder3, false, jax);
                } catch (jap e) {
                    Matcher matcher = f19582b.matcher(stringBuilder.toString());
                    if (e.m23665a() == jaq.INVALID_COUNTRY_CODE && matcher.lookingAt()) {
                        i = m23684a(stringBuilder.substring(matcher.end()), d, stringBuilder3, false, jax);
                        if (i == 0) {
                            throw new jap(jaq.INVALID_COUNTRY_CODE, "Could not interpret numbers after plus-sign.");
                        }
                    }
                    throw new jap(e.m23665a(), e.getMessage());
                }
                if (i != 0) {
                    String b = m23702b(i);
                    if (!b.equals(str2)) {
                        d = m23670a(i, b);
                    }
                } else {
                    jar.m23677b(stringBuilder);
                    stringBuilder3.append(stringBuilder);
                    if (str2 != null) {
                        jax.m23720a(d.f19707r);
                    }
                }
                if (stringBuilder3.length() < 2) {
                    throw new jap(jaq.TOO_SHORT_NSN, "The string supplied is too short to be a phone number.");
                }
                if (d != null) {
                    StringBuilder stringBuilder4 = new StringBuilder();
                    StringBuilder stringBuilder5 = new StringBuilder(stringBuilder3);
                    m23698a(stringBuilder5, d, stringBuilder4);
                    if (jar.m23667a(this.f19610H.m23741a(d.f19690a.f19718b), stringBuilder5.toString()) == jaw.f19642c) {
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
                    jar.m23674a(stringBuilder3.toString(), jax);
                    jax.m23721a(Long.parseLong(stringBuilder3.toString()));
                    return;
                }
            }
            throw new jap(jaq.NOT_A_NUMBER, "The string supplied did not seem to be a phone number.");
        }
    }

    public jat m23686a(jax jax, jax jax2) {
        jax jax3 = new jax();
        jax3.m23723a(jax);
        jax jax4 = new jax();
        jax4.m23723a(jax2);
        jax3.m23738j();
        jax3.m23739k();
        jax3.m23740l();
        jax4.m23738j();
        jax4.m23739k();
        jax4.m23740l();
        if (jax3.m23731c() && jax3.m23732d().length() == 0) {
            jax3.m23733e();
        }
        if (jax4.m23731c() && jax4.m23732d().length() == 0) {
            jax4.m23733e();
        }
        if (jax3.m23731c() && jax4.m23731c() && !jax3.m23732d().equals(jax4.m23732d())) {
            return jat.NO_MATCH;
        }
        int a = jax3.m23719a();
        int a2 = jax4.m23719a();
        if (a == 0 || a2 == 0) {
            jax3.m23720a(a2);
            if (jax3.m23729b(jax4)) {
                return jat.NSN_MATCH;
            }
            if (jar.m23678b(jax3, jax4)) {
                return jat.SHORT_NSN_MATCH;
            }
            return jat.NO_MATCH;
        } else if (jax3.m23729b(jax4)) {
            return jat.EXACT_MATCH;
        } else {
            if (a == a2 && jar.m23678b(jax3, jax4)) {
                return jat.SHORT_NSN_MATCH;
            }
            return jat.NO_MATCH;
        }
    }

    private static boolean m23678b(jax jax, jax jax2) {
        String valueOf = String.valueOf(jax.m23726b());
        String valueOf2 = String.valueOf(jax2.m23726b());
        return valueOf.endsWith(valueOf2) || valueOf2.endsWith(valueOf);
    }

    public jat m23700b(String str, String str2) {
        try {
            return m23701b(m23691a(str, "ZZ"), str2);
        } catch (jap e) {
            if (e.m23665a() == jaq.INVALID_COUNTRY_CODE) {
                try {
                    return m23701b(m23691a(str2, "ZZ"), str);
                } catch (jap e2) {
                    if (e2.m23665a() == jaq.INVALID_COUNTRY_CODE) {
                        try {
                            jax jax = new jax();
                            jax jax2 = new jax();
                            m23673a(str, null, false, false, jax);
                            m23673a(str2, null, false, false, jax2);
                            return m23686a(jax, jax2);
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

    public jat m23701b(jax jax, String str) {
        try {
            return m23686a(jax, m23691a(str, "ZZ"));
        } catch (jap e) {
            if (e.m23665a() == jaq.INVALID_COUNTRY_CODE) {
                String b = m23702b(jax.m23719a());
                try {
                    if (b.equals("ZZ")) {
                        jax jax2 = new jax();
                        m23673a(str, null, false, false, jax2);
                        return m23686a(jax, jax2);
                    }
                    jat a = m23686a(jax, m23691a(str, b));
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

    public static String m23676b(String str) {
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
