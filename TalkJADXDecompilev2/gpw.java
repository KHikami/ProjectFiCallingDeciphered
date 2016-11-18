package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;

final class gpw extends hv<String> {
    private final int f;
    private final String g;

    public /* synthetic */ Object d() {
        return h();
    }

    public gpw(Context context, int i, String str) {
        super(context);
        this.f = i;
        this.g = str;
    }

    private String h() {
        List<String> g = blf.g(new blo(o(), this.f), this.g);
        if (g == null || g.isEmpty()) {
            return null;
        }
        Iterable arrayList = new ArrayList(g.size());
        for (String i : g) {
            arrayList.add(glq.i(gwb.H(), i));
        }
        return meu.a(", ").a(arrayList);
    }
}
