package p000;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public final class fbv implements Serializable {
    private static final long serialVersionUID = 1;
    public final fbw f12663a;
    public final int f12664b;
    private final String f12665c;

    private fbv(lsg lsg) {
        this.f12663a = new fbw(lsg.f26308a);
        this.f12665c = lsg.f26309b;
        this.f12664b = gwb.m1507a(lsg.f26310c);
    }

    public static List<fbv> m14926a(lsg[] lsgArr) {
        List<fbv> arrayList = new ArrayList();
        for (lsg fbv : lsgArr) {
            arrayList.add(new fbv(fbv));
        }
        return arrayList;
    }
}
