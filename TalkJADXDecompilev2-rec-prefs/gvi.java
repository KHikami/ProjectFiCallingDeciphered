package p000;

import java.util.ArrayList;
import java.util.List;

public final class gvi {
    private final List<String> f16212a = new ArrayList();
    private final Object f16213b;

    public gvi(Object obj) {
        this.f16213b = gwb.m1419L(obj);
    }

    public gvi m18680a(String str, Object obj) {
        List list = this.f16212a;
        String str2 = (String) gwb.m1419L((Object) str);
        String valueOf = String.valueOf(String.valueOf(obj));
        list.add(new StringBuilder((String.valueOf(str2).length() + 1) + String.valueOf(valueOf).length()).append(str2).append("=").append(valueOf).toString());
        return this;
    }

    public String toString() {
        StringBuilder append = new StringBuilder(100).append(this.f16213b.getClass().getSimpleName()).append('{');
        int size = this.f16212a.size();
        for (int i = 0; i < size; i++) {
            append.append((String) this.f16212a.get(i));
            if (i < size - 1) {
                append.append(", ");
            }
        }
        return append.append('}').toString();
    }
}
