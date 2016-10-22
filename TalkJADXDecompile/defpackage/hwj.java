package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/* renamed from: hwj */
public final class hwj<T> {
    private final HashMap<String, Object> a;

    public hwj() {
        this.a = new HashMap();
    }

    public int a(String str) {
        gwb.L((Object) str);
        Object obj = this.a.get(str);
        return obj == null ? 0 : obj instanceof ArrayList ? ((ArrayList) obj).size() : 1;
    }

    public T a(String str, int i) {
        gwb.L((Object) str);
        gwb.b(i >= 0);
        T t = this.a.get(str);
        if (t == null) {
            throw new IndexOutOfBoundsException("Size=0, requested=" + i);
        } else if (t instanceof ArrayList) {
            ArrayList arrayList = (ArrayList) t;
            if (i <= arrayList.size()) {
                return arrayList.get(i);
            }
            throw new IndexOutOfBoundsException("Size=" + arrayList.size() + ", requested=" + i);
        } else if (i <= 0) {
            return t;
        } else {
            throw new IndexOutOfBoundsException("Size=1, requested=" + i);
        }
    }

    public void a(String str, T t) {
        gwb.L((Object) str);
        Object obj = this.a.get(str);
        if (obj == null) {
            this.a.put(str, t);
        } else if (obj instanceof ArrayList) {
            ((ArrayList) obj).add(t);
        } else {
            ArrayList arrayList = new ArrayList(4);
            arrayList.add(obj);
            arrayList.add(t);
            this.a.put(str, arrayList);
        }
    }

    public String toString() {
        StringBuilder a = hvx.a();
        String[] strArr = (String[]) new ArrayList(this.a.keySet()).toArray(hvx.d);
        Arrays.sort(strArr);
        for (String str : strArr) {
            if (a.length() > 0) {
                a.append(",");
            }
            a.append(str);
            a.append("=");
            int a2 = a(str);
            for (int i = 0; i < a2; i++) {
                if (i > 0) {
                    a.append(".");
                }
                a.append(a(str, i));
            }
        }
        return a.toString();
    }
}
