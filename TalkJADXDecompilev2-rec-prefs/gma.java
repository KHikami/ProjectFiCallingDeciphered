package p000;

import java.util.Iterator;
import java.util.LinkedList;

public final class gma {
    private static final boolean f15634b = false;
    String f15635a;
    private LinkedList<gmb> f15636c = new LinkedList();

    static {
        kae kae = glk.f15573t;
    }

    gma(String str) {
        this.f15635a = str;
    }

    public static gma m18073a(String str) {
        return glv.m18052a(str);
    }

    private gmb m18074e(String str) {
        gmb gmb;
        if (this.f15636c.size() > 100) {
            gmb = (gmb) this.f15636c.remove(0);
        } else {
            gmb = new gmb();
        }
        this.f15636c.add(gmb);
        gmb.f15637a = str;
        gmb.f15638b = glj.m17963b();
        gmb.f15639c = -1;
        return gmb;
    }

    private String m18075f(String str) {
        String str2 = this.f15635a;
        return new StringBuilder((String.valueOf(str2).length() + 1) + String.valueOf(str).length()).append(str2).append("_").append(str).toString();
    }

    public synchronized String m18078b(String str) {
        if (f15634b) {
            m18074e(str);
            glv.f15614b.mo2293a(m18075f(str));
        }
        return str;
    }

    public synchronized void m18079c(String str) {
        if (f15634b) {
            gmb gmb;
            Iterator descendingIterator = this.f15636c.descendingIterator();
            while (descendingIterator.hasNext()) {
                gmb = (gmb) descendingIterator.next();
                if (gmb.f15637a.equals(str)) {
                    gmb.f15639c = glj.m17963b();
                    break;
                }
            }
            gmb = null;
            if (!glv.f15613a) {
                synchronized (glv.f15615c) {
                    if (glv.f15616d == null) {
                        glv.f15616d = new glw();
                        gwb.m1864a(glv.f15616d, 5000);
                    }
                }
            }
            if (gmb != null) {
                glv.f15614b.mo2294b(m18075f(str));
            }
        }
    }

    public synchronized void m18080d(String str) {
        if (f15634b) {
            gmb e = m18074e(str);
            e.f15639c = e.f15638b;
            glv.f15614b.mo2295c(m18075f(str));
        }
    }

    public synchronized boolean m18076a() {
        boolean z;
        z = f15634b && !this.f15636c.isEmpty();
        return z;
    }

    gmc m18077b() {
        if (!f15634b) {
            return null;
        }
        long j;
        long j2;
        long j3;
        StringBuilder stringBuilder = new StringBuilder();
        synchronized (this) {
            LinkedList linkedList = this.f15636c;
            this.f15636c = new LinkedList();
            Iterator it = linkedList.iterator();
            stringBuilder.append(" ** ").append(this.f15635a).append(" **: ");
            j = 0;
            j2 = -1;
            j3 = Long.MAX_VALUE;
            int i = 0;
            while (it.hasNext()) {
                gmb gmb = (gmb) it.next();
                if (gmb.f15639c >= 0) {
                    long j4 = gmb.f15639c - gmb.f15638b;
                    j += j4;
                    j2 = Math.max(j4, j2);
                    j3 = Math.min(j4, j3);
                    int i2 = i + 1;
                    stringBuilder.append(" [").append(gmb.f15637a).append(" (").append(j4).append("ms)]");
                    i = i2;
                } else {
                    if (glj.m17963b() - gmb.f15638b < 10000) {
                        this.f15636c.add(gmb);
                    }
                    stringBuilder.append(" [? ").append(gmb.f15637a).append(" ?]");
                }
            }
        }
        double d = 0.0d;
        if (i > 0) {
            d = ((double) j) / ((double) i);
        }
        stringBuilder.append(";       max (ms): ").append(j2).append("; min (ms): ").append(j3).append("; avg (ms): ").append(d);
        return new gmc(this, this.f15635a, j);
    }
}
