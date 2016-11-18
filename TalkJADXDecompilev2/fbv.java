package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public final class fbv implements Serializable {
    private static final long serialVersionUID = 1;
    public final fbw a;
    public final int b;
    private final String c;

    private fbv(lsg lsg) {
        this.a = new fbw(lsg.a);
        this.c = lsg.b;
        this.b = gwb.a(lsg.c);
    }

    public static List<fbv> a(lsg[] lsgArr) {
        List<fbv> arrayList = new ArrayList();
        for (lsg fbv : lsgArr) {
            arrayList.add(new fbv(fbv));
        }
        return arrayList;
    }
}
