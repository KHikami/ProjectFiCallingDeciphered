package p000;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;

final class gpw extends hv<String> {
    private final int f15885f;
    private final String f15886g;

    public /* synthetic */ Object mo213d() {
        return m18283h();
    }

    public gpw(Context context, int i, String str) {
        super(context);
        this.f15885f = i;
        this.f15886g = str;
    }

    private String m18283h() {
        List<String> g = blf.m5824g(new blo(m1286o(), this.f15885f), this.f15886g);
        if (g == null || g.isEmpty()) {
            return null;
        }
        Iterable arrayList = new ArrayList(g.size());
        for (String i : g) {
            arrayList.add(glq.m18038i(gwb.m1400H(), i));
        }
        return meu.m31960a(", ").m31963a(arrayList);
    }
}
