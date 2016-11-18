package p000;

import java.util.Arrays;

public final class mex {
    private final String f27597a;
    private final mey f27598b = new mey();
    private mey f27599c = this.f27598b;
    private boolean f27600d = false;

    public mex(String str) {
        this.f27597a = (String) bm.m6122a((Object) str);
    }

    public mex m31974a(String str, Object obj) {
        return m31973b(str, obj);
    }

    public mex m31975a(String str, boolean z) {
        return m31973b(str, String.valueOf(z));
    }

    public String toString() {
        boolean z = this.f27600d;
        StringBuilder append = new StringBuilder(32).append(this.f27597a).append('{');
        String str = "";
        for (mey mey = this.f27598b.f27603c; mey != null; mey = mey.f27603c) {
            Object obj = mey.f27602b;
            if (!z || obj != null) {
                append.append(str);
                str = ", ";
                if (mey.f27601a != null) {
                    append.append(mey.f27601a).append('=');
                }
                if (obj == null || !obj.getClass().isArray()) {
                    append.append(obj);
                } else {
                    CharSequence deepToString = Arrays.deepToString(new Object[]{obj});
                    append.append(deepToString, 1, deepToString.length() - 1);
                }
            }
        }
        return append.append('}').toString();
    }

    private mex m31973b(String str, Object obj) {
        mey mey = new mey();
        this.f27599c.f27603c = mey;
        this.f27599c = mey;
        mey.f27602b = obj;
        mey.f27601a = (String) bm.m6122a((Object) str);
        return this;
    }
}
