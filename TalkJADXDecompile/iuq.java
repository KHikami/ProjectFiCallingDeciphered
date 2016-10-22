import com.google.api.client.http.ExponentialBackOffPolicy;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public final class iuq {
    private double a;
    private double b;
    private final CopyOnWriteArrayList<iur> c;
    private double d;
    private double e;
    private double f;
    private double g;
    private double h;
    private double i;
    private double j;
    private boolean k;
    private double l;
    private double m;
    private boolean n;
    private double o;

    public iuq(double d, double d2) {
        this.k = true;
        this.l = 0.005d;
        this.m = 0.005d;
        this.n = false;
        this.o = 0.0d;
        this.a = 100.0d;
        this.b = 18.0d;
        this.c = new CopyOnWriteArrayList();
    }

    public iuq a(iur iur) {
        this.c.add(iur);
        return this;
    }

    public iuq a(boolean z) {
        this.n = true;
        return this;
    }

    public iuq a(double d) {
        if (d != this.f) {
            this.f = d;
            this.i = this.f;
            Iterator it = this.c.iterator();
            while (it.hasNext()) {
                iur iur = (iur) it.next();
                iur.a(this);
                iur.a(d);
            }
        }
        return this;
    }

    public iuq b(double d) {
        if (d != this.j) {
            this.j = d;
            this.i = this.f;
            Iterator it = this.c.iterator();
            while (it.hasNext()) {
                ((iur) it.next()).a(this);
            }
        }
        return this;
    }

    private boolean a() {
        return Math.abs(this.g) <= this.l && (Math.abs(this.j - this.f) <= this.m || this.a == 0.0d);
    }

    private static boolean a(double d, double d2, double d3, double d4) {
        return d2 > 0.0d && (d3 >= d4 ? d < d4 : d > d4);
    }

    public boolean c(double d) {
        boolean a = a();
        if (a && this.k) {
            return false;
        }
        boolean z;
        this.o += d;
        double d2 = this.f;
        double d3 = this.g;
        double d4 = this.h;
        double d5 = this.d;
        double d6 = this.e;
        while (this.o >= 0.001d) {
            this.o -= 0.001d;
            d6 = (this.a * (this.j - d2)) - (this.b * d3);
            d4 = ((0.001d * d6) * ExponentialBackOffPolicy.DEFAULT_RANDOMIZATION_FACTOR) + d3;
            d5 = ((this.j - (((0.001d * d3) * ExponentialBackOffPolicy.DEFAULT_RANDOMIZATION_FACTOR) + d2)) * this.a) - (this.b * d4);
            double d7 = d3 + ((0.001d * d5) * ExponentialBackOffPolicy.DEFAULT_RANDOMIZATION_FACTOR);
            double d8 = ((this.j - (((0.001d * d4) * ExponentialBackOffPolicy.DEFAULT_RANDOMIZATION_FACTOR) + d2)) * this.a) - (this.b * d7);
            double d9 = (0.001d * d7) + d2;
            double d10 = (0.001d * d8) + d3;
            d5 = ((d6 + ((d5 + d8) * 2.0d)) + ((this.a * (this.j - d9)) - (this.b * d10))) / 6.0d;
            d6 = (0.001d * (((((d4 + d7) * 2.0d) + d3) + d10) / 6.0d)) + d2;
            d7 = d3 + (d5 * 0.001d);
            if (this.n && a(d6, this.a, this.i, this.j)) {
                this.o = 0.0d;
                d5 = d2;
                d4 = d9;
                d2 = d6;
                d6 = d3;
                d3 = d7;
            } else {
                d5 = d2;
                d4 = d9;
                d2 = d6;
                d6 = d3;
                d3 = d7;
            }
        }
        this.h = d4;
        this.f = d2;
        this.g = d3;
        this.d = d5;
        this.e = d6;
        if (this.o > 0.0d) {
            d6 = this.o / 0.001d;
            this.f = (this.f * d6) + (this.d * (1.0d - d6));
            this.g = ((1.0d - d6) * this.e) + (this.g * d6);
        }
        Object obj = (this.n && a(this.f, this.a, this.i, this.j)) ? 1 : null;
        if (obj != null || a()) {
            if (this.a > 0.0d) {
                this.i = this.j;
                this.f = this.j;
            } else {
                this.j = this.f;
                this.i = this.j;
            }
            this.g = 0.0d;
            this.o = 0.0d;
            z = true;
        } else {
            z = a;
        }
        this.k = z;
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            ((iur) it.next()).a(this.f);
        }
        return !z;
    }
}
