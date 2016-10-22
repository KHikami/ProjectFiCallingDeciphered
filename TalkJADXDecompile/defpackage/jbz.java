package defpackage;

import java.util.Comparator;

/* renamed from: jbz */
public final class jbz implements Comparator<Integer> {
    private final jcf a;

    public /* synthetic */ int compare(Object obj, Object obj2) {
        return a((Integer) obj, (Integer) obj2);
    }

    public jbz(jcf jcf) {
        this.a = jcf;
    }

    private int a(Integer num, Integer num2) {
        jch a = this.a.a(num.intValue());
        jch a2 = this.a.a(num2.intValue());
        boolean c = a.c("is_managed_account");
        boolean c2 = a2.c("is_managed_account");
        if (c && !c2) {
            return 1;
        }
        if (c || !c2) {
            return a.b("account_name").compareToIgnoreCase(a2.b("account_name"));
        }
        return -1;
    }
}
