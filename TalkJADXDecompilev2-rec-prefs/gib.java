package p000;

import java.util.HashMap;

public final class gib {
    private final HashMap<String, Object> f15286a = new HashMap();

    public gib(String str, Object obj) {
        m17706a(str, obj);
    }

    public gib m17706a(String str, Object obj) {
        this.f15286a.put(str, obj);
        return this;
    }

    public boolean m17707a(gib gib) {
        if (gib == null || gib.f15286a.size() > this.f15286a.size()) {
            return false;
        }
        for (String str : gib.f15286a.keySet()) {
            Object obj = gib.f15286a.get(str);
            Object obj2 = this.f15286a.get(str);
            if (obj2 != null) {
                if (!obj2.equals(obj)) {
                }
            }
            return false;
        }
        return true;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (String str : this.f15286a.keySet()) {
            String valueOf = String.valueOf(this.f15286a.get(str));
            stringBuilder.append(new StringBuilder((String.valueOf(str).length() + 5) + String.valueOf(valueOf).length()).append(str).append(" = ").append(valueOf).append("; ").toString());
        }
        return stringBuilder.toString();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return gwb.m2223g(this.f15286a, ((gib) obj).f15286a);
    }

    public int hashCode() {
        return gwb.m2074c(this.f15286a);
    }
}
