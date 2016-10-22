package defpackage;

import java.util.Arrays;

/* renamed from: mex */
public final class mex {
    private final String a;
    private final mey b;
    private mey c;
    private boolean d;

    public mex(String str) {
        this.b = new mey();
        this.c = this.b;
        this.d = false;
        this.a = (String) bm.a((Object) str);
    }

    public mex a(String str, Object obj) {
        return b(str, obj);
    }

    public mex a(String str, boolean z) {
        return b(str, String.valueOf(z));
    }

    public String toString() {
        boolean z = this.d;
        StringBuilder append = new StringBuilder(32).append(this.a).append('{');
        String str = "";
        for (mey mey = this.b.c; mey != null; mey = mey.c) {
            Object obj = mey.b;
            if (!z || obj != null) {
                append.append(str);
                str = ", ";
                if (mey.a != null) {
                    append.append(mey.a).append('=');
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

    private mex b(String str, Object obj) {
        mey mey = new mey();
        this.c.c = mey;
        this.c = mey;
        mey.b = obj;
        mey.a = (String) bm.a((Object) str);
        return this;
    }
}
