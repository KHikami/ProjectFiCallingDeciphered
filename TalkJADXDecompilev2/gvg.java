package defpackage;

import com.google.android.gms.common.data.DataHolder;
import java.util.ArrayList;

public abstract class gvg<T> extends gux {
    private boolean b = false;
    private ArrayList<Integer> c;

    public gvg(DataHolder dataHolder) {
        super(dataHolder);
    }

    private void g() {
        synchronized (this) {
            if (!this.b) {
                int g = this.a.g();
                this.c = new ArrayList();
                if (g > 0) {
                    this.c.add(Integer.valueOf(0));
                    String f = f();
                    String b = this.a.b(f, 0, this.a.a(0));
                    int i = 1;
                    while (i < g) {
                        int a = this.a.a(i);
                        String b2 = this.a.b(f, i, a);
                        if (b2 == null) {
                            throw new NullPointerException(new StringBuilder(String.valueOf(f).length() + 78).append("Missing value for markerColumn: ").append(f).append(", at row: ").append(i).append(", for window: ").append(a).toString());
                        }
                        if (b2.equals(b)) {
                            b2 = b;
                        } else {
                            this.c.add(Integer.valueOf(i));
                        }
                        i++;
                        b = b2;
                    }
                }
                this.b = true;
            }
        }
    }

    public int a() {
        g();
        return this.c.size();
    }

    public final T a(int i) {
        g();
        return a(b(i), c(i));
    }

    public abstract T a(int i, int i2);

    int b(int i) {
        if (i >= 0 && i < this.c.size()) {
            return ((Integer) this.c.get(i)).intValue();
        }
        throw new IllegalArgumentException("Position " + i + " is out of bounds for this buffer");
    }

    protected int c(int i) {
        if (i < 0 || i == this.c.size()) {
            return 0;
        }
        int g = i == this.c.size() + -1 ? this.a.g() - ((Integer) this.c.get(i)).intValue() : ((Integer) this.c.get(i + 1)).intValue() - ((Integer) this.c.get(i)).intValue();
        if (g != 1) {
            return g;
        }
        this.a.a(b(i));
        return g;
    }

    public abstract String f();
}
