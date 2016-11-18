package defpackage;

import java.util.ArrayList;

public final class hvi {
    private final ArrayList<Object> a = new ArrayList();

    private static IndexOutOfBoundsException b(int i, int i2) {
        return new IndexOutOfBoundsException(String.format("Size=%d, requested=%d", new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}));
    }

    public int a() {
        return this.a.size();
    }

    public int a(int i, int i2) {
        Object obj = this.a.get(i);
        if (obj == null) {
            throw hvi.b(0, i2);
        } else if (!(obj instanceof Integer)) {
            ArrayList arrayList = (ArrayList) obj;
            if (i2 <= arrayList.size()) {
                return ((Integer) arrayList.get(i2)).intValue();
            }
            throw hvi.b(arrayList.size(), i2);
        } else if (i2 <= 0) {
            return ((Integer) obj).intValue();
        } else {
            throw hvi.b(1, i2);
        }
    }

    public void a(int i) {
        this.a.add(Integer.valueOf(i));
    }

    public void a(hwi hwi, String str) {
        int i = 0;
        int a = hwi.a(str);
        if (a != 0) {
            if (a == 1) {
                this.a.add(Integer.valueOf(hwi.b(str, 0)));
                return;
            }
            ArrayList arrayList = new ArrayList(a);
            while (i < a) {
                arrayList.add(Integer.valueOf(hwi.b(str, i)));
                i++;
            }
            this.a.add(arrayList);
        }
    }

    public int b(int i) {
        Object obj = this.a.get(i);
        return obj == null ? 0 : obj instanceof Integer ? 1 : ((ArrayList) obj).size();
    }

    public void b() {
        this.a.add(null);
    }

    public String toString() {
        StringBuilder a = hvx.a();
        for (int i = 0; i < a(); i++) {
            if (i > 0) {
                a.append(",");
            }
            a.append("[");
            int b = b(i);
            for (int i2 = 0; i2 < b; i2++) {
                if (i2 > 0) {
                    a.append(",");
                }
                a.append(a(i, i2));
            }
            a.append("]");
        }
        return a.toString();
    }
}
