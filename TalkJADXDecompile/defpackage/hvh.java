package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/* renamed from: hvh */
public final class hvh {
    private static final Integer[] b;
    private final HashMap<Integer, Object> a;

    static {
        b = new Integer[0];
    }

    public hvh() {
        this.a = new HashMap();
    }

    public int a(int i) {
        gwb.L(Integer.valueOf(i));
        Object obj = this.a.get(Integer.valueOf(i));
        return obj == null ? 0 : obj instanceof String ? 1 : ((ArrayList) obj).size();
    }

    public String a(int i, int i2) {
        gwb.L(Integer.valueOf(i));
        gwb.b(i2 >= 0);
        Object obj = this.a.get(Integer.valueOf(i));
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

    public void a(Integer num, String str) {
        gwb.L((Object) num);
        Object obj = this.a.get(num);
        if (obj == null) {
            this.a.put(num, str);
        } else if (obj instanceof String) {
            ArrayList arrayList = new ArrayList(4);
            arrayList.add((String) obj);
            arrayList.add(str);
            this.a.put(num, arrayList);
        } else {
            ((ArrayList) obj).add(str);
        }
    }

    public String toString() {
        StringBuilder a = hvx.a();
        Integer[] numArr = (Integer[]) new ArrayList(this.a.keySet()).toArray(b);
        Arrays.sort(numArr);
        for (Integer num : numArr) {
            if (a.length() > 0) {
                a.append(",");
            }
            a.append(num);
            a.append("=");
            int a2 = a(num.intValue());
            for (int i = 0; i < a2; i++) {
                if (i > 0) {
                    a.append(".");
                }
                a.append(a(num.intValue(), i));
            }
        }
        return a.toString();
    }
}
