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

/* compiled from: PG */
public class ddk {
    public static final Logger a;
    public static final Map b;
    private static dde d;
    private static final Map e;
    private static final Map f;
    private static final String g;
    private static Pattern h;
    private static final Pattern i;
    private static final Pattern j;
    private static Pattern k;
    private static Pattern l;
    private static final Pattern m;
    private static final String n;
    private static final String o;
    private static final Pattern p;
    private static final Pattern q;
    private static ddk r;
    public final Map c;
    private final ddg s;
    private final Set t;
    private final ddq u;
    private final Set v;
    private final Set w;

    static {
        d = new dde();
        a = Logger.getLogger(ddk.class.getName());
        Map hashMap = new HashMap();
        hashMap.put(Integer.valueOf(52), "1");
        hashMap.put(Integer.valueOf(54), "9");
        b = Collections.unmodifiableMap(hashMap);
        Set hashSet = new HashSet();
        hashSet.add(Integer.valueOf(52));
        hashSet.add(Integer.valueOf(54));
        hashSet.add(Integer.valueOf(55));
        Collections.unmodifiableSet(hashSet);
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
        e = Collections.unmodifiableMap(hashMap);
        hashMap = new HashMap(100);
        hashMap.putAll(e);
        hashMap.putAll(hashMap2);
        f = Collections.unmodifiableMap(hashMap);
        hashMap = new HashMap();
        hashMap.putAll(hashMap2);
        hashMap.put(Character.valueOf('+'), Character.valueOf('+'));
        hashMap.put(Character.valueOf('*'), Character.valueOf('*'));
        Collections.unmodifiableMap(hashMap);
        Map hashMap3 = new HashMap();
        for (Character charValue : e.keySet()) {
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
        Collections.unmodifiableMap(hashMap3);
        Pattern.compile("[\\d]+(?:[~\u2053\u223c\uff5e][\\d]+)?");
        String valueOf = String.valueOf(Arrays.toString(e.keySet().toArray()).replaceAll("[, \\[\\]]", ""));
        String valueOf2 = String.valueOf(Arrays.toString(e.keySet().toArray()).toLowerCase().replaceAll("[, \\[\\]]", ""));
        if (valueOf2.length() != 0) {
            valueOf2 = valueOf.concat(valueOf2);
        } else {
            valueOf2 = new String(valueOf);
        }
        g = valueOf2;
        h = Pattern.compile("[+\uff0b]+");
        Pattern.compile("[-x\u2010-\u2015\u2212\u30fc\uff0d-\uff0f \u00a0\u00ad\u200b\u2060\u3000()\uff08\uff09\uff3b\uff3d.\\[\\]/~\u2053\u223c\uff5e]+");
        i = Pattern.compile("(\\p{Nd})");
        j = Pattern.compile("[+\uff0b\\p{Nd}]");
        k = Pattern.compile("[\\\\/] *x");
        l = Pattern.compile("[[\\P{N}&&\\P{L}]&&[^#]]+$");
        m = Pattern.compile("(?:.*?[A-Za-z]){3}.*");
        valueOf2 = String.valueOf(String.valueOf("\\p{Nd}{2}|[+\uff0b]*+(?:[-x\u2010-\u2015\u2212\u30fc\uff0d-\uff0f \u00a0\u00ad\u200b\u2060\u3000()\uff08\uff09\uff3b\uff3d.\\[\\]/~\u2053\u223c\uff5e*]*\\p{Nd}){3,}[-x\u2010-\u2015\u2212\u30fc\uff0d-\uff0f \u00a0\u00ad\u200b\u2060\u3000()\uff08\uff09\uff3b\uff3d.\\[\\]/~\u2053\u223c\uff5e*"));
        valueOf = String.valueOf(String.valueOf(g));
        String valueOf3 = String.valueOf(String.valueOf("\\p{Nd}"));
        n = new StringBuilder(((valueOf2.length() + 2) + valueOf.length()) + valueOf3.length()).append(valueOf2).append(valueOf).append(valueOf3).append("]*").toString();
        valueOf = "x\uff58#\uff03~\uff5e";
        valueOf3 = ",";
        valueOf2 = String.valueOf(valueOf);
        o = b(valueOf2.length() != 0 ? valueOf3.concat(valueOf2) : new String(valueOf3));
        b(valueOf);
        valueOf2 = String.valueOf(String.valueOf(o));
        p = Pattern.compile(new StringBuilder(valueOf2.length() + 5).append("(?:").append(valueOf2).append(")$").toString(), 66);
        valueOf2 = String.valueOf(String.valueOf(n));
        valueOf = String.valueOf(String.valueOf(o));
        q = Pattern.compile(new StringBuilder((valueOf2.length() + 5) + valueOf.length()).append(valueOf2).append("(?:").append(valueOf).append(")?").toString(), 66);
        Pattern.compile("(\\D+)");
        Pattern.compile("(\\$\\d)");
        Pattern.compile("\\$NP");
        Pattern.compile("\\$FG");
        Pattern.compile("\\$CC");
        Pattern.compile("\\(?\\$1\\)?");
        r = null;
    }

    private static String b(String str) {
        String valueOf = String.valueOf(String.valueOf(";ext=(\\p{Nd}{1,7})|[ \u00a0\\t,]*(?:e?xt(?:ensi(?:o\u0301?|\u00f3))?n?|\uff45?\uff58\uff54\uff4e?|["));
        String valueOf2 = String.valueOf(String.valueOf(str));
        String valueOf3 = String.valueOf(String.valueOf("(\\p{Nd}{1,7})"));
        String valueOf4 = String.valueOf(String.valueOf("\\p{Nd}"));
        return new StringBuilder((((valueOf.length() + 48) + valueOf2.length()) + valueOf3.length()) + valueOf4.length()).append(valueOf).append(valueOf2).append("]|int|anexo|\uff49\uff4e\uff54)[:\\.\uff0e]?[ \u00a0\\t,-]*").append(valueOf3).append("#?|[- ]+(").append(valueOf4).append("{1,5})#").toString();
    }

    private ddk(ddg ddg, Map map) {
        this.t = new HashSet(35);
        this.u = new ddq(100);
        this.v = new HashSet(320);
        this.w = new HashSet();
        this.s = ddg;
        this.c = map;
        for (Entry entry : map.entrySet()) {
            List list = (List) entry.getValue();
            if (list.size() == 1 && "001".equals(list.get(0))) {
                this.w.add(entry.getKey());
            } else {
                this.v.addAll(list);
            }
        }
        if (this.v.remove("001")) {
            a.log(Level.WARNING, "invalid metadata (country calling code was mapped to the non-geo entity as well as specific region(s))");
        }
        this.t.addAll((Collection) map.get(Integer.valueOf(1)));
    }

    private static boolean c(String str) {
        if (str.length() < 2) {
            return false;
        }
        return q.matcher(str).matches();
    }

    private static void a(StringBuilder stringBuilder) {
        String stringBuilder2;
        String stringBuilder3 = stringBuilder.toString();
        if (m.matcher(stringBuilder3).matches()) {
            Map map = f;
            StringBuilder stringBuilder4 = new StringBuilder(stringBuilder3.length());
            for (int i = 0; i < stringBuilder3.length(); i++) {
                Character ch = (Character) map.get(Character.valueOf(Character.toUpperCase(stringBuilder3.charAt(i))));
                if (ch != null) {
                    stringBuilder4.append(ch);
                }
            }
            stringBuilder2 = stringBuilder4.toString();
        } else {
            stringBuilder2 = d(stringBuilder3);
        }
        stringBuilder.replace(0, stringBuilder.length(), stringBuilder2);
    }

    private static synchronized void a(ddk ddk) {
        synchronized (ddk.class) {
            r = ddk;
        }
    }

    public static synchronized ddk a() {
        ddk ddk;
        synchronized (ddk.class) {
            if (r == null) {
                dde dde = d;
                if (dde == null) {
                    throw new IllegalArgumentException("metadataLoader could not be null.");
                }
                a(new ddk(new ddh(dde), buf.K()));
            }
            ddk = r;
        }
        return ddk;
    }

    private final boolean e(String str) {
        return str != null && this.v.contains(str);
    }

    public final ddv a(int i, String str) {
        if (!"001".equals(str)) {
            return a(str);
        }
        if (this.c.containsKey(Integer.valueOf(i))) {
            return this.s.a(i);
        }
        return null;
    }

    public static String a(ddo ddo) {
        StringBuilder stringBuilder = new StringBuilder();
        if (ddo.f) {
            char[] cArr = new char[ddo.g];
            Arrays.fill(cArr, '0');
            stringBuilder.append(new String(cArr));
        }
        stringBuilder.append(ddo.c);
        return stringBuilder.toString();
    }

    public final int a(String str, ddv ddv) {
        if (!a(str, ddv.a)) {
            return ddm.l;
        }
        if (a(str, ddv.e)) {
            return ddm.e;
        }
        if (a(str, ddv.d)) {
            return ddm.d;
        }
        if (a(str, ddv.f)) {
            return ddm.f;
        }
        if (a(str, ddv.h)) {
            return ddm.g;
        }
        if (a(str, ddv.g)) {
            return ddm.h;
        }
        if (a(str, ddv.i)) {
            return ddm.i;
        }
        if (a(str, ddv.j)) {
            return ddm.j;
        }
        if (a(str, ddv.k)) {
            return ddm.k;
        }
        if (a(str, ddv.b)) {
            if (ddv.p) {
                return ddm.c;
            }
            if (a(str, ddv.c)) {
                return ddm.c;
            }
            return ddm.a;
        } else if (ddv.p || !a(str, ddv.c)) {
            return ddm.l;
        } else {
            return ddm.b;
        }
    }

    public final ddv a(String str) {
        if (e(str)) {
            return this.s.a(str);
        }
        return null;
    }

    private boolean a(String str, ddx ddx) {
        return this.u.a(ddx.b).matcher(str).matches() && this.u.a(ddx.a).matcher(str).matches();
    }

    public final String a(ddo ddo, List list) {
        String a = a(ddo);
        for (String str : list) {
            ddv a2 = a(str);
            if (a2.q.equals("")) {
                if (a(a, a2) != ddm.l) {
                    return str;
                }
            } else if (this.u.a(a2.q).matcher(a).lookingAt()) {
                return str;
            }
        }
        return null;
    }

    public final String a(int i) {
        List list = (List) this.c.get(Integer.valueOf(i));
        return list == null ? "ZZ" : (String) list.get(0);
    }

    private static int a(Pattern pattern, String str) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.matches()) {
            return ddn.a;
        }
        if (matcher.lookingAt()) {
            return ddn.c;
        }
        return ddn.b;
    }

    private int a(StringBuilder stringBuilder, StringBuilder stringBuilder2) {
        if (stringBuilder.length() == 0 || stringBuilder.charAt(0) == '0') {
            return 0;
        }
        int length = stringBuilder.length();
        int i = 1;
        while (i <= 3 && i <= length) {
            int parseInt = Integer.parseInt(stringBuilder.substring(0, i));
            if (this.c.containsKey(Integer.valueOf(parseInt))) {
                stringBuilder2.append(stringBuilder.substring(i));
                return parseInt;
            }
            i++;
        }
        return 0;
    }

    private int a(String str, ddv ddv, StringBuilder stringBuilder, boolean z, ddo ddo) {
        if (str.length() == 0) {
            return 0;
        }
        ddp ddp;
        int end;
        StringBuilder stringBuilder2 = new StringBuilder(str);
        String str2 = "NonMatch";
        if (ddv != null) {
            str2 = ddv.m;
        }
        if (stringBuilder2.length() == 0) {
            ddp = ddp.FROM_DEFAULT_COUNTRY;
        } else {
            Matcher matcher = h.matcher(stringBuilder2);
            if (matcher.lookingAt()) {
                stringBuilder2.delete(0, matcher.end());
                a(stringBuilder2);
                ddp = ddp.FROM_NUMBER_WITH_PLUS_SIGN;
            } else {
                Pattern a = this.u.a(str2);
                a(stringBuilder2);
                Matcher matcher2 = a.matcher(stringBuilder2);
                if (matcher2.lookingAt()) {
                    end = matcher2.end();
                    matcher = i.matcher(stringBuilder2.substring(end));
                    if (!(matcher.find() && d(matcher.group(1)).equals("0"))) {
                        stringBuilder2.delete(0, end);
                        end = 1;
                        if (end == 0) {
                            ddp = ddp.FROM_NUMBER_WITH_IDD;
                        } else {
                            ddp = ddp.FROM_DEFAULT_COUNTRY;
                        }
                    }
                }
                end = 0;
                if (end == 0) {
                    ddp = ddp.FROM_DEFAULT_COUNTRY;
                } else {
                    ddp = ddp.FROM_NUMBER_WITH_IDD;
                }
            }
        }
        if (z) {
            ddo.a(ddp);
        }
        if (ddp == ddp.FROM_DEFAULT_COUNTRY) {
            if (ddv != null) {
                end = ddv.l;
                String valueOf = String.valueOf(end);
                String stringBuilder3 = stringBuilder2.toString();
                if (stringBuilder3.startsWith(valueOf)) {
                    CharSequence stringBuilder4 = new StringBuilder(stringBuilder3.substring(valueOf.length()));
                    ddx ddx = ddv.a;
                    Pattern a2 = this.u.a(ddx.a);
                    a(stringBuilder4, ddv, null);
                    Pattern a3 = this.u.a(ddx.b);
                    if ((!a2.matcher(stringBuilder2).matches() && a2.matcher(stringBuilder4).matches()) || a(a3, stringBuilder2.toString()) == ddn.c) {
                        stringBuilder.append(stringBuilder4);
                        if (z) {
                            ddo.a(ddp.FROM_NUMBER_WITHOUT_PLUS_SIGN);
                        }
                        ddo.a(end);
                        return end;
                    }
                }
            }
            ddo.a(0);
            return 0;
        } else if (stringBuilder2.length() <= 2) {
            throw new ddi(ddj.TOO_SHORT_AFTER_IDD, "Phone number had an IDD, but after this was not long enough to be a viable phone number.");
        } else {
            end = a(stringBuilder2, stringBuilder);
            if (end != 0) {
                ddo.a(end);
                return end;
            }
            throw new ddi(ddj.INVALID_COUNTRY_CODE, "Country calling code supplied was not recognised.");
        }
    }

    private boolean a(StringBuilder stringBuilder, ddv ddv, StringBuilder stringBuilder2) {
        int length = stringBuilder.length();
        String str = ddv.n;
        if (length == 0 || str.length() == 0) {
            return false;
        }
        Matcher matcher = this.u.a(str).matcher(stringBuilder);
        if (!matcher.lookingAt()) {
            return false;
        }
        Pattern a = this.u.a(ddv.a.a);
        boolean matches = a.matcher(stringBuilder).matches();
        int groupCount = matcher.groupCount();
        String str2 = ddv.o;
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

    private static String b(StringBuilder stringBuilder) {
        Matcher matcher = p.matcher(stringBuilder);
        if (matcher.find() && c(stringBuilder.substring(0, matcher.start()))) {
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

    public final ddo a(String str, String str2) {
        ddo ddo = new ddo();
        a(str, str2, false, true, ddo);
        return ddo;
    }

    private static void a(String str, ddo ddo) {
        if (str.length() > 1 && str.charAt(0) == '0') {
            ddo.a(true);
            int i = 1;
            while (i < str.length() - 1 && str.charAt(i) == '0') {
                i++;
            }
            if (i != 1) {
                ddo.b(i);
            }
        }
    }

    private final void a(String str, String str2, boolean z, boolean z2, ddo ddo) {
        int i = 0;
        if (str == null) {
            throw new ddi(ddj.NOT_A_NUMBER, "The phone number supplied was null.");
        } else if (str.length() > 250) {
            throw new ddi(ddj.TOO_LONG, "The string supplied was too long to parse.");
        } else {
            int i2;
            String substring;
            Matcher matcher;
            String substring2;
            StringBuilder stringBuilder = new StringBuilder();
            int indexOf = str.indexOf(";phone-context=");
            if (indexOf > 0) {
                i2 = indexOf + 15;
                if (str.charAt(i2) == '+') {
                    int indexOf2 = str.indexOf(59, i2);
                    if (indexOf2 > 0) {
                        stringBuilder.append(str.substring(i2, indexOf2));
                    } else {
                        stringBuilder.append(str.substring(i2));
                    }
                }
                i2 = str.indexOf("tel:");
                if (i2 >= 0) {
                    i2 += 4;
                } else {
                    i2 = 0;
                }
                stringBuilder.append(str.substring(i2, indexOf));
            } else {
                Matcher matcher2 = j.matcher(str);
                if (matcher2.find()) {
                    substring = str.substring(matcher2.start());
                    matcher = l.matcher(substring);
                    if (matcher.find()) {
                        substring2 = substring.substring(0, matcher.start());
                        Logger logger = a;
                        Level level = Level.FINER;
                        String str3 = "Stripped trailing characters: ";
                        substring = String.valueOf(substring2);
                        logger.log(level, substring.length() != 0 ? str3.concat(substring) : new String(str3));
                        substring = substring2;
                    }
                    matcher = k.matcher(substring);
                    if (matcher.find()) {
                        substring = substring.substring(0, matcher.start());
                    }
                } else {
                    substring = "";
                }
                stringBuilder.append(substring);
            }
            i2 = stringBuilder.indexOf(";isub=");
            if (i2 > 0) {
                stringBuilder.delete(i2, stringBuilder.length());
            }
            if (c(stringBuilder.toString())) {
                if (z2) {
                    CharSequence stringBuilder2 = stringBuilder.toString();
                    if (e(str2) || !(stringBuilder2 == null || stringBuilder2.length() == 0 || !h.matcher(stringBuilder2).lookingAt())) {
                        i2 = 1;
                    } else {
                        i2 = 0;
                    }
                    if (i2 == 0) {
                        throw new ddi(ddj.INVALID_COUNTRY_CODE, "Missing or invalid default region.");
                    }
                }
                substring = b(stringBuilder);
                if (substring.length() > 0) {
                    ddo.a(substring);
                }
                ddv a = a(str2);
                StringBuilder stringBuilder3 = new StringBuilder();
                try {
                    i2 = a(stringBuilder.toString(), a, stringBuilder3, false, ddo);
                } catch (ddi e) {
                    matcher = h.matcher(stringBuilder.toString());
                    if (e.a == ddj.INVALID_COUNTRY_CODE && matcher.lookingAt()) {
                        i2 = a(stringBuilder.substring(matcher.end()), a, stringBuilder3, false, ddo);
                        if (i2 == 0) {
                            throw new ddi(ddj.INVALID_COUNTRY_CODE, "Could not interpret numbers after plus-sign.");
                        }
                    }
                    throw new ddi(e.a, e.getMessage());
                }
                if (i2 != 0) {
                    substring2 = a(i2);
                    if (!substring2.equals(str2)) {
                        a = a(i2, substring2);
                    }
                } else {
                    a(stringBuilder);
                    stringBuilder3.append(stringBuilder);
                    if (str2 != null) {
                        ddo.a(a.l);
                    }
                }
                if (stringBuilder3.length() < 2) {
                    throw new ddi(ddj.TOO_SHORT_NSN, "The string supplied is too short to be a phone number.");
                }
                if (a != null) {
                    StringBuilder stringBuilder4 = new StringBuilder();
                    StringBuilder stringBuilder5 = new StringBuilder(stringBuilder3);
                    a(stringBuilder5, a, stringBuilder4);
                    if (a(this.u.a(a.a.b), stringBuilder5.toString()) == ddn.b) {
                        i = 1;
                    }
                    if (i == 0) {
                        stringBuilder3 = stringBuilder5;
                    }
                }
                i2 = stringBuilder3.length();
                if (i2 < 2) {
                    throw new ddi(ddj.TOO_SHORT_NSN, "The string supplied is too short to be a phone number.");
                } else if (i2 > 17) {
                    throw new ddi(ddj.TOO_LONG, "The string supplied is too long to be a phone number.");
                } else {
                    a(stringBuilder3.toString(), ddo);
                    ddo.a(Long.parseLong(stringBuilder3.toString()));
                    return;
                }
            }
            throw new ddi(ddj.NOT_A_NUMBER, "The string supplied did not seem to be a phone number.");
        }
    }

    private int a(ddo ddo, ddo ddo2) {
        ddo ddo3 = new ddo();
        ddo3.a(ddo);
        ddo ddo4 = new ddo();
        ddo4.a(ddo2);
        ddo3.b();
        ddo3.c();
        ddo3.d();
        ddo4.b();
        ddo4.c();
        ddo4.d();
        if (ddo3.d && ddo3.e.length() == 0) {
            ddo3.a();
        }
        if (ddo4.d && ddo4.e.length() == 0) {
            ddo4.a();
        }
        if (ddo3.d && ddo4.d && !ddo3.e.equals(ddo4.e)) {
            return ddl.b;
        }
        int i = ddo3.b;
        int i2 = ddo4.b;
        if (i == 0 || i2 == 0) {
            ddo3.a(i2);
            if (ddo3.b(ddo4)) {
                return ddl.d;
            }
            if (b(ddo3, ddo4)) {
                return ddl.c;
            }
            return ddl.b;
        } else if (ddo3.b(ddo4)) {
            return ddl.e;
        } else {
            if (i == i2 && b(ddo3, ddo4)) {
                return ddl.c;
            }
            return ddl.b;
        }
    }

    public final int b(String str, String str2) {
        try {
            return a(a(str, "ZZ"), str2);
        } catch (ddi e) {
            if (e.a == ddj.INVALID_COUNTRY_CODE) {
                try {
                    return a(a(str2, "ZZ"), str);
                } catch (ddi e2) {
                    if (e2.a == ddj.INVALID_COUNTRY_CODE) {
                        try {
                            ddo ddo = new ddo();
                            ddo ddo2 = new ddo();
                            a(str, null, false, false, ddo);
                            a(str2, null, false, false, ddo2);
                            return a(ddo, ddo2);
                        } catch (ddi e3) {
                            return ddl.a;
                        }
                    }
                    return ddl.a;
                }
            }
            return ddl.a;
        }
    }

    private int a(ddo ddo, String str) {
        try {
            return a(ddo, a(str, "ZZ"));
        } catch (ddi e) {
            if (e.a == ddj.INVALID_COUNTRY_CODE) {
                String a = a(ddo.b);
                try {
                    if (a.equals("ZZ")) {
                        ddo ddo2 = new ddo();
                        a(str, null, false, false, ddo2);
                        return a(ddo, ddo2);
                    }
                    int a2 = a(ddo, a(str, a));
                    if (a2 == ddl.e) {
                        return ddl.d;
                    }
                    return a2;
                } catch (ddi e2) {
                    return ddl.a;
                }
            }
            return ddl.a;
        }
    }

    private static String d(String str) {
        StringBuilder stringBuilder = new StringBuilder(str.length());
        for (char digit : str.toCharArray()) {
            int digit2 = Character.digit(digit, 10);
            if (digit2 != -1) {
                stringBuilder.append(digit2);
            }
        }
        return stringBuilder.toString();
    }

    private static boolean b(ddo ddo, ddo ddo2) {
        String valueOf = String.valueOf(ddo.c);
        String valueOf2 = String.valueOf(ddo2.c);
        return valueOf.endsWith(valueOf2) || valueOf2.endsWith(valueOf);
    }
}
