package defpackage;

import android.content.Context;
import java.util.List;

final class buw extends hv<String> {
    private final int f;
    private final String g;

    public /* synthetic */ Object d() {
        return h();
    }

    public buw(Context context, int i, String str) {
        super(context);
        this.f = i;
        this.g = str;
    }

    private String h() {
        List<String> g = blf.g(new blo(o(), this.f), this.g);
        if (g == null || g.isEmpty()) {
            return null;
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (String str : g) {
            if (stringBuilder.length() != 0) {
                stringBuilder.append(", ");
            }
            stringBuilder.append(glq.i(o(), str));
        }
        return stringBuilder.toString();
    }
}
