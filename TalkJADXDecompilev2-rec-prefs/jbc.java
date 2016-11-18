package p000;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.logging.Logger;

public class jbc {
    public static final jbc f19671a = new jbc(new jbe());
    private static final Logger f19672b = Logger.getLogger(jbc.class.getName());
    private static final Set<String> f19673c;
    private final jbd f19674d;
    private final Map<Integer, List<String>> f19675e = gwb.aB();

    static {
        Set hashSet = new HashSet();
        f19673c = hashSet;
        hashSet.add("BR");
        f19673c.add("CL");
        f19673c.add("NI");
    }

    private jbc(jbd jbd) {
        this.f19674d = jbd;
    }

    @Deprecated
    public boolean m23760a(String str, String str2) {
        jbg a = jam.m23657a(str2);
        if (a == null) {
            return false;
        }
        return this.f19674d.mo3431a(str, a.f19690a);
    }

    public boolean m23761a(jax jax, String str) {
        List list = (List) this.f19675e.get(Integer.valueOf(jax.m23719a()));
        if (list == null) {
            list = new ArrayList(0);
        }
        if (!Collections.unmodifiableList(list).contains(str)) {
            return false;
        }
        jbg a = jam.m23657a(str);
        if (a == null) {
            return false;
        }
        jbd jbd = this.f19674d;
        StringBuilder stringBuilder = new StringBuilder();
        if (jax.m23734f()) {
            char[] cArr = new char[jax.m23735g()];
            Arrays.fill(cArr, '0');
            stringBuilder.append(new String(cArr));
        }
        stringBuilder.append(jax.m23726b());
        return jbd.mo3431a(stringBuilder.toString(), a.f19690a);
    }

    public boolean m23762b(String str, String str2) {
        boolean z = false;
        String a = jar.m23668a(str);
        if (jar.f19582b.matcher(a).lookingAt()) {
            return false;
        }
        jbg a2 = jam.m23657a(str2);
        if (a2 == null || a2.f19700k == null) {
            return false;
        }
        a = jar.m23676b(a);
        jbi jbi = a2.f19700k;
        if (!f19673c.contains(str2)) {
            z = true;
        }
        return this.f19674d.mo3432a(a, jbi, z);
    }
}
