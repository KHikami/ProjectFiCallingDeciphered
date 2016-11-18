package p000;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public final class hvh {
    private static final Integer[] f17351b = new Integer[0];
    private final HashMap<Integer, Object> f17352a = new HashMap();

    public int m21048a(int i) {
        gwb.m1419L(Integer.valueOf(i));
        Object obj = this.f17352a.get(Integer.valueOf(i));
        return obj == null ? 0 : obj instanceof String ? 1 : ((ArrayList) obj).size();
    }

    public String m21049a(int i, int i2) {
        gwb.m1419L(Integer.valueOf(i));
        gwb.m2047b(i2 >= 0);
        Object obj = this.f17352a.get(Integer.valueOf(i));
        if (obj == null) {
            throw new IndexOutOfBoundsException("Size=0, requested=" + i2);
        } else if (!(obj instanceof String)) {
            ArrayList arrayList = (ArrayList) obj;
            if (i2 <= arrayList.size()) {
                return (String) arrayList.get(i2);
            }
            throw new IndexOutOfBoundsException("Size=" + arrayList.size() + ", requested=" + i2);
        } else if (i2 <= 0) {
            return (String) obj;
        } else {
            throw new IndexOutOfBoundsException("Size=1, requested=" + i2);
        }
    }

    public void m21050a(Integer num, String str) {
        gwb.m1419L((Object) num);
        Object obj = this.f17352a.get(num);
        if (obj == null) {
            this.f17352a.put(num, str);
        } else if (obj instanceof String) {
            ArrayList arrayList = new ArrayList(4);
            arrayList.add((String) obj);
            arrayList.add(str);
            this.f17352a.put(num, arrayList);
        } else {
            ((ArrayList) obj).add(str);
        }
    }

    public String toString() {
        StringBuilder a = hvx.m21118a();
        Integer[] numArr = (Integer[]) new ArrayList(this.f17352a.keySet()).toArray(f17351b);
        Arrays.sort(numArr);
        for (Integer num : numArr) {
            if (a.length() > 0) {
                a.append(",");
            }
            a.append(num);
            a.append("=");
            int a2 = m21048a(num.intValue());
            for (int i = 0; i < a2; i++) {
                if (i > 0) {
                    a.append(".");
                }
                a.append(m21049a(num.intValue(), i));
            }
        }
        return a.toString();
    }
}
