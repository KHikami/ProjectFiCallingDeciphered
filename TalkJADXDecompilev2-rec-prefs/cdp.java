package p000;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

public final class cdp implements bxr {
    private String f5083a;
    private String f5084b;
    private final List<C0000a> f5085c = new ArrayList();

    public void m7287a(jyn jyn) {
        jyn.m25444a(bxr.class, (Object) this);
    }

    public void m7286a(String str, String str2) {
        if (!TextUtils.equals(this.f5083a, str) || !TextUtils.equals(this.f5084b, str2)) {
            this.f5083a = str;
            this.f5084b = str2;
            for (int size = this.f5085c.size() - 1; size >= 0; size--) {
                this.f5085c.get(size);
            }
        }
    }
}
