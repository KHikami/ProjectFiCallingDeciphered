import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.logging.Logger;

public class jbc {
    public static final jbc a;
    private static final Logger b;
    private static final Set<String> c;
    private final jbd d;
    private final Map<Integer, List<String>> e;

    static {
        b = Logger.getLogger(jbc.class.getName());
        a = new jbc(new jbe());
        Set hashSet = new HashSet();
        c = hashSet;
        hashSet.add("BR");
        c.add("CL");
        c.add("NI");
    }

    private jbc(jbd jbd) {
        this.d = jbd;
        this.e = gwb.aB();
    }

    @Deprecated
    public boolean a(String str, String str2) {
        jbg a = jam.a(str2);
        if (a == null) {
            return false;
        }
        return this.d.a(str, a.a);
    }

    public boolean a(jax jax, String str) {
        List list = (List) this.e.get(Integer.valueOf(jax.a()));
        if (list == null) {
            list = new ArrayList(0);
        }
        if (!Collections.unmodifiableList(list).contains(str)) {
            return false;
        }
        jbg a = jam.a(str);
        if (a == null) {
            return false;
        }
        jbd jbd = this.d;
        StringBuilder stringBuilder = new StringBuilder();
        if (jax.f()) {
            char[] cArr = new char[jax.g()];
            Arrays.fill(cArr, '0');
            stringBuilder.append(new String(cArr));
        }
        stringBuilder.append(jax.b());
        return jbd.a(stringBuilder.toString(), a.a);
    }

    public boolean b(String str, String str2) {
        boolean z = false;
        String a = jar.a(str);
        if (jar.b.matcher(a).lookingAt()) {
            return false;
        }
        jbg a2 = jam.a(str2);
        if (a2 == null || a2.k == null) {
            return false;
        }
        a = jar.b(a);
        jbi jbi = a2.k;
        if (!c.contains(str2)) {
            z = true;
        }
        return this.d.a(a, jbi, z);
    }
}
