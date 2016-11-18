package p000;

import java.util.ArrayList;

public final class hvi {
    private final ArrayList<Object> f17353a = new ArrayList();

    private static IndexOutOfBoundsException m21051b(int i, int i2) {
        return new IndexOutOfBoundsException(String.format("Size=%d, requested=%d", new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}));
    }

    public int m21052a() {
        return this.f17353a.size();
    }

    public int m21053a(int i, int i2) {
        Object obj = this.f17353a.get(i);
        if (obj == null) {
            throw hvi.m21051b(0, i2);
        } else if (!(obj instanceof Integer)) {
            ArrayList arrayList = (ArrayList) obj;
            if (i2 <= arrayList.size()) {
                return ((Integer) arrayList.get(i2)).intValue();
            }
            throw hvi.m21051b(arrayList.size(), i2);
        } else if (i2 <= 0) {
            return ((Integer) obj).intValue();
        } else {
            throw hvi.m21051b(1, i2);
        }
    }

    public void m21054a(int i) {
        this.f17353a.add(Integer.valueOf(i));
    }

    public void m21055a(hwi hwi, String str) {
        int i = 0;
        int a = hwi.m21142a(str);
        if (a != 0) {
            if (a == 1) {
                this.f17353a.add(Integer.valueOf(hwi.m21144b(str, 0)));
                return;
            }
            ArrayList arrayList = new ArrayList(a);
            while (i < a) {
                arrayList.add(Integer.valueOf(hwi.m21144b(str, i)));
                i++;
            }
            this.f17353a.add(arrayList);
        }
    }

    public int m21056b(int i) {
        Object obj = this.f17353a.get(i);
        return obj == null ? 0 : obj instanceof Integer ? 1 : ((ArrayList) obj).size();
    }

    public void m21057b() {
        this.f17353a.add(null);
    }

    public String toString() {
        StringBuilder a = hvx.m21118a();
        for (int i = 0; i < m21052a(); i++) {
            if (i > 0) {
                a.append(",");
            }
            a.append("[");
            int b = m21056b(i);
            for (int i2 = 0; i2 < b; i2++) {
                if (i2 > 0) {
                    a.append(",");
                }
                a.append(m21053a(i, i2));
            }
            a.append("]");
        }
        return a.toString();
    }
}
