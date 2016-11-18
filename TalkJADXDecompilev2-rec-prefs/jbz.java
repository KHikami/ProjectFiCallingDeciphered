package p000;

import java.util.Comparator;

public final class jbz implements Comparator<Integer> {
    private final jcf f19842a;

    public /* synthetic */ int compare(Object obj, Object obj2) {
        return m23810a((Integer) obj, (Integer) obj2);
    }

    public jbz(jcf jcf) {
        this.f19842a = jcf;
    }

    private int m23810a(Integer num, Integer num2) {
        jch a = this.f19842a.mo3456a(num.intValue());
        jch a2 = this.f19842a.mo3456a(num2.intValue());
        boolean c = a.mo3448c("is_managed_account");
        boolean c2 = a2.mo3448c("is_managed_account");
        if (c && !c2) {
            return 1;
        }
        if (c || !c2) {
            return a.mo3440b("account_name").compareToIgnoreCase(a2.mo3440b("account_name"));
        }
        return -1;
    }
}
