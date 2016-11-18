package p000;

import com.google.api.client.http.ExponentialBackOffPolicy;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public final class iuq {
    private double f19053a = 100.0d;
    private double f19054b = 18.0d;
    private final CopyOnWriteArrayList<iur> f19055c = new CopyOnWriteArrayList();
    private double f19056d;
    private double f19057e;
    private double f19058f;
    private double f19059g;
    private double f19060h;
    private double f19061i;
    private double f19062j;
    private boolean f19063k = true;
    private double f19064l = 0.005d;
    private double f19065m = 0.005d;
    private boolean f19066n = false;
    private double f19067o = 0.0d;

    public iuq(double d, double d2) {
    }

    public iuq m23321a(iur iur) {
        this.f19055c.add(iur);
        return this;
    }

    public iuq m23322a(boolean z) {
        this.f19066n = true;
        return this;
    }

    public iuq m23320a(double d) {
        if (d != this.f19058f) {
            this.f19058f = d;
            this.f19061i = this.f19058f;
            Iterator it = this.f19055c.iterator();
            while (it.hasNext()) {
                iur iur = (iur) it.next();
                iur.mo3402a(this);
                iur.mo3407a(d);
            }
        }
        return this;
    }

    public iuq m23323b(double d) {
        if (d != this.f19062j) {
            this.f19062j = d;
            this.f19061i = this.f19058f;
            Iterator it = this.f19055c.iterator();
            while (it.hasNext()) {
                ((iur) it.next()).mo3402a(this);
            }
        }
        return this;
    }

    private boolean m23318a() {
        return Math.abs(this.f19059g) <= this.f19064l && (Math.abs(this.f19062j - this.f19058f) <= this.f19065m || this.f19053a == 0.0d);
    }

    private static boolean m23319a(double d, double d2, double d3, double d4) {
        return d2 > 0.0d && (d3 >= d4 ? d < d4 : d > d4);
    }

    public boolean m23324c(double d) {
        boolean a = m23318a();
        if (a && this.f19063k) {
            return false;
        }
        boolean z;
        this.f19067o += d;
        double d2 = this.f19058f;
        double d3 = this.f19059g;
        double d4 = this.f19060h;
        double d5 = this.f19056d;
        double d6 = this.f19057e;
        while (this.f19067o >= 0.001d) {
            this.f19067o -= 0.001d;
            d6 = (this.f19053a * (this.f19062j - d2)) - (this.f19054b * d3);
            d4 = ((0.001d * d6) * ExponentialBackOffPolicy.DEFAULT_RANDOMIZATION_FACTOR) + d3;
            d5 = ((this.f19062j - (((0.001d * d3) * ExponentialBackOffPolicy.DEFAULT_RANDOMIZATION_FACTOR) + d2)) * this.f19053a) - (this.f19054b * d4);
            double d7 = d3 + ((0.001d * d5) * ExponentialBackOffPolicy.DEFAULT_RANDOMIZATION_FACTOR);
            double d8 = ((this.f19062j - (((0.001d * d4) * ExponentialBackOffPolicy.DEFAULT_RANDOMIZATION_FACTOR) + d2)) * this.f19053a) - (this.f19054b * d7);
            double d9 = (0.001d * d7) + d2;
            double d10 = (0.001d * d8) + d3;
            d5 = ((d6 + ((d5 + d8) * 2.0d)) + ((this.f19053a * (this.f19062j - d9)) - (this.f19054b * d10))) / 6.0d;
            d6 = (0.001d * (((((d4 + d7) * 2.0d) + d3) + d10) / 6.0d)) + d2;
            d7 = d3 + (d5 * 0.001d);
            if (this.f19066n && iuq.m23319a(d6, this.f19053a, this.f19061i, this.f19062j)) {
                this.f19067o = 0.0d;
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
        this.f19060h = d4;
        this.f19058f = d2;
        this.f19059g = d3;
        this.f19056d = d5;
        this.f19057e = d6;
        if (this.f19067o > 0.0d) {
            d6 = this.f19067o / 0.001d;
            this.f19058f = (this.f19058f * d6) + (this.f19056d * (1.0d - d6));
            this.f19059g = ((1.0d - d6) * this.f19057e) + (this.f19059g * d6);
        }
        Object obj = (this.f19066n && iuq.m23319a(this.f19058f, this.f19053a, this.f19061i, this.f19062j)) ? 1 : null;
        if (obj != null || m23318a()) {
            if (this.f19053a > 0.0d) {
                this.f19061i = this.f19062j;
                this.f19058f = this.f19062j;
            } else {
                this.f19062j = this.f19058f;
                this.f19061i = this.f19062j;
            }
            this.f19059g = 0.0d;
            this.f19067o = 0.0d;
            z = true;
        } else {
            z = a;
        }
        this.f19063k = z;
        Iterator it = this.f19055c.iterator();
        while (it.hasNext()) {
            ((iur) it.next()).mo3407a(this.f19058f);
        }
        return !z;
    }
}
