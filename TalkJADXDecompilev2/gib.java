package defpackage;

import java.util.HashMap;

public final class gib {
    private final HashMap<String, Object> a = new HashMap();

    public gib(String str, Object obj) {
        a(str, obj);
    }

    public gib a(String str, Object obj) {
        this.a.put(str, obj);
        return this;
    }

    public boolean a(gib gib) {
        if (gib == null || gib.a.size() > this.a.size()) {
            return false;
        }
        for (String str : gib.a.keySet()) {
            Object obj = gib.a.get(str);
            Object obj2 = this.a.get(str);
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
        for (String str : this.a.keySet()) {
            String valueOf = String.valueOf(this.a.get(str));
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
        return gwb.g(this.a, ((gib) obj).a);
    }

    public int hashCode() {
        return gwb.c(this.a);
    }
}
