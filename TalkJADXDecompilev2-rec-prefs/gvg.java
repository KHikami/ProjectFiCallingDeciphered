package p000;

import com.google.android.gms.common.data.DataHolder;
import java.util.ArrayList;

public abstract class gvg<T> extends gux {
    private boolean f16209b = false;
    private ArrayList<Integer> f16210c;

    public gvg(DataHolder dataHolder) {
        super(dataHolder);
    }

    private void m18669g() {
        synchronized (this) {
            if (!this.f16209b) {
                int g = this.f13937a.m9684g();
                this.f16210c = new ArrayList();
                if (g > 0) {
                    this.f16210c.add(Integer.valueOf(0));
                    String f = mo3046f();
                    String b = this.f13937a.m9678b(f, 0, this.f13937a.m9673a(0));
                    int i = 1;
                    while (i < g) {
                        int a = this.f13937a.m9673a(i);
                        String b2 = this.f13937a.m9678b(f, i, a);
                        if (b2 == null) {
                            throw new NullPointerException(new StringBuilder(String.valueOf(f).length() + 78).append("Missing value for markerColumn: ").append(f).append(", at row: ").append(i).append(", for window: ").append(a).toString());
                        }
                        if (b2.equals(b)) {
                            b2 = b;
                        } else {
                            this.f16210c.add(Integer.valueOf(i));
                        }
                        i++;
                        b = b2;
                    }
                }
                this.f16209b = true;
            }
        }
    }

    public int mo2074a() {
        m18669g();
        return this.f16210c.size();
    }

    public final T mo2075a(int i) {
        m18669g();
        return mo3045a(m18673b(i), m18674c(i));
    }

    public abstract T mo3045a(int i, int i2);

    int m18673b(int i) {
        if (i >= 0 && i < this.f16210c.size()) {
            return ((Integer) this.f16210c.get(i)).intValue();
        }
        throw new IllegalArgumentException("Position " + i + " is out of bounds for this buffer");
    }

    protected int m18674c(int i) {
        if (i < 0 || i == this.f16210c.size()) {
            return 0;
        }
        int g = i == this.f16210c.size() + -1 ? this.f13937a.m9684g() - ((Integer) this.f16210c.get(i)).intValue() : ((Integer) this.f16210c.get(i + 1)).intValue() - ((Integer) this.f16210c.get(i)).intValue();
        if (g != 1) {
            return g;
        }
        this.f13937a.m9673a(m18673b(i));
        return g;
    }

    public abstract String mo3046f();
}
