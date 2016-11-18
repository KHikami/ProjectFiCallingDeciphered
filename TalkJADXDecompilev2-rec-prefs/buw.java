package p000;

import android.content.Context;
import java.util.List;

final class buw extends hv<String> {
    private final int f4545f;
    private final String f4546g;

    public /* synthetic */ Object mo213d() {
        return m6733h();
    }

    public buw(Context context, int i, String str) {
        super(context);
        this.f4545f = i;
        this.f4546g = str;
    }

    private String m6733h() {
        List<String> g = blf.m5824g(new blo(m1286o(), this.f4545f), this.f4546g);
        if (g == null || g.isEmpty()) {
            return null;
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (String str : g) {
            if (stringBuilder.length() != 0) {
                stringBuilder.append(", ");
            }
            stringBuilder.append(glq.m18038i(m1286o(), str));
        }
        return stringBuilder.toString();
    }
}
