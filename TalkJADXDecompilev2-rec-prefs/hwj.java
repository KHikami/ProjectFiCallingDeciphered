package p000;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public final class hwj<T> {
    private final HashMap<String, Object> f17424a = new HashMap();

    public int m21145a(String str) {
        gwb.m1419L((Object) str);
        Object obj = this.f17424a.get(str);
        return obj == null ? 0 : obj instanceof ArrayList ? ((ArrayList) obj).size() : 1;
    }

    public T m21146a(String str, int i) {
        gwb.m1419L((Object) str);
        gwb.m2047b(i >= 0);
        T t = this.f17424a.get(str);
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

    public void m21147a(String str, T t) {
        gwb.m1419L((Object) str);
        Object obj = this.f17424a.get(str);
        if (obj == null) {
            this.f17424a.put(str, t);
        } else if (obj instanceof ArrayList) {
            ((ArrayList) obj).add(t);
        } else {
            ArrayList arrayList = new ArrayList(4);
            arrayList.add(obj);
            arrayList.add(t);
            this.f17424a.put(str, arrayList);
        }
    }

    public String toString() {
        StringBuilder a = hvx.m21118a();
        String[] strArr = (String[]) new ArrayList(this.f17424a.keySet()).toArray(hvx.f17386d);
        Arrays.sort(strArr);
        for (String str : strArr) {
            if (a.length() > 0) {
                a.append(",");
            }
            a.append(str);
            a.append("=");
            int a2 = m21145a(str);
            for (int i = 0; i < a2; i++) {
                if (i > 0) {
                    a.append(".");
                }
                a.append(m21146a(str, i));
            }
        }
        return a.toString();
    }
}
