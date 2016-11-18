package p000;

import java.util.ArrayList;

public class hwg {
    private final String f17419a;
    private final ArrayList<Long> f17420b = new ArrayList();
    private final ArrayList<String> f17421c = new ArrayList();

    public hwg(String str) {
        this.f17419a = str;
        mo3029a("");
    }

    public synchronized void mo3029a(String str) {
        this.f17420b.add(Long.valueOf(System.currentTimeMillis()));
        this.f17421c.add(str);
    }

    public synchronized void mo3030a(String str, int i) {
        mo3029a("");
        long longValue = ((Long) this.f17420b.get(0)).longValue();
        long longValue2 = ((Long) this.f17420b.get(this.f17420b.size() - 1)).longValue() - longValue;
        if (longValue2 >= 0) {
            StringBuilder a = hvx.m21118a();
            a.append(this.f17419a);
            a.append(",");
            a.append(longValue2);
            a.append("ms: ");
            int i2 = 1;
            while (i2 < this.f17420b.size()) {
                long longValue3 = ((Long) this.f17420b.get(i2)).longValue();
                a.append((String) this.f17421c.get(i2));
                a.append(",");
                a.append(longValue3 - longValue);
                a.append("ms ");
                i2++;
                longValue = longValue3;
            }
            gwb.m2266j(str, a.toString());
        }
    }
}
