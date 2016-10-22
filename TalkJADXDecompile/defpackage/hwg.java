package defpackage;

import java.util.ArrayList;

/* renamed from: hwg */
public class hwg {
    private final String a;
    private final ArrayList<Long> b;
    private final ArrayList<String> c;

    public hwg(String str) {
        this.b = new ArrayList();
        this.c = new ArrayList();
        this.a = str;
        a("");
    }

    public synchronized void a(String str) {
        this.b.add(Long.valueOf(System.currentTimeMillis()));
        this.c.add(str);
    }

    public synchronized void a(String str, int i) {
        a("");
        long longValue = ((Long) this.b.get(0)).longValue();
        long longValue2 = ((Long) this.b.get(this.b.size() - 1)).longValue() - longValue;
        if (longValue2 >= 0) {
            StringBuilder a = hvx.a();
            a.append(this.a);
            a.append(",");
            a.append(longValue2);
            a.append("ms: ");
            int i2 = 1;
            while (i2 < this.b.size()) {
                long longValue3 = ((Long) this.b.get(i2)).longValue();
                a.append((String) this.c.get(i2));
                a.append(",");
                a.append(longValue3 - longValue);
                a.append("ms ");
                i2++;
                longValue = longValue3;
            }
            gwb.j(str, a.toString());
        }
    }
}
