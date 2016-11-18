package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

public final class cdp implements bxr {
    private String a;
    private String b;
    private final List<a> c = new ArrayList();

    public void a(jyn jyn) {
        jyn.a(bxr.class, (Object) this);
    }

    public void a(String str, String str2) {
        if (!TextUtils.equals(this.a, str) || !TextUtils.equals(this.b, str2)) {
            this.a = str;
            this.b = str2;
            for (int size = this.c.size() - 1; size >= 0; size--) {
                this.c.get(size);
            }
        }
    }
}
