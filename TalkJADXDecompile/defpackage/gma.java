package defpackage;

import java.util.Iterator;
import java.util.LinkedList;

/* renamed from: gma */
public final class gma {
    private static final boolean b;
    String a;
    private LinkedList<gmb> c;

    static {
        kae kae = glk.t;
        b = false;
    }

    gma(String str) {
        this.c = new LinkedList();
        this.a = str;
    }

    public static gma a(String str) {
        return glv.a(str);
    }

    private gmb e(String str) {
        gmb gmb;
        if (this.c.size() > 100) {
            gmb = (gmb) this.c.remove(0);
        } else {
            gmb = new gmb();
        }
        this.c.add(gmb);
        gmb.a = str;
        gmb.b = glj.b();
        gmb.c = -1;
        return gmb;
    }

    private String f(String str) {
        String str2 = this.a;
        return new StringBuilder((String.valueOf(str2).length() + 1) + String.valueOf(str).length()).append(str2).append("_").append(str).toString();
    }

    public synchronized String b(String str) {
        if (b) {
            e(str);
            glv.b.a(f(str));
        }
        return str;
    }

    public synchronized void c(String str) {
        if (b) {
            gmb gmb;
            Iterator descendingIterator = this.c.descendingIterator();
            while (descendingIterator.hasNext()) {
                gmb = (gmb) descendingIterator.next();
                if (gmb.a.equals(str)) {
                    gmb.c = glj.b();
                    break;
                }
            }
            gmb = null;
            if (!glv.a) {
                synchronized (glv.c) {
                    if (glv.d == null) {
                        glv.d = new glw();
                        gwb.a(glv.d, 5000);
                    }
                }
            }
            if (gmb != null) {
                glv.b.b(f(str));
            }
        }
    }

    public synchronized void d(String str) {
        if (b) {
            gmb e = e(str);
            e.c = e.b;
            glv.b.c(f(str));
        }
    }

    public synchronized boolean a() {
        boolean z;
        z = b && !this.c.isEmpty();
        return z;
    }

    gmc b() {
        if (!b) {
            return null;
        }
        long j;
        long j2;
        long j3;
        StringBuilder stringBuilder = new StringBuilder();
        synchronized (this) {
            LinkedList linkedList = this.c;
            this.c = new LinkedList();
            Iterator it = linkedList.iterator();
            stringBuilder.append(" ** ").append(this.a).append(" **: ");
            j = 0;
            j2 = -1;
            j3 = Long.MAX_VALUE;
            int i = 0;
            while (it.hasNext()) {
                gmb gmb = (gmb) it.next();
                if (gmb.c >= 0) {
                    long j4 = gmb.c - gmb.b;
                    j += j4;
                    j2 = Math.max(j4, j2);
                    j3 = Math.min(j4, j3);
                    int i2 = i + 1;
                    stringBuilder.append(" [").append(gmb.a).append(" (").append(j4).append("ms)]");
                    i = i2;
                } else {
                    if (glj.b() - gmb.b < 10000) {
                        this.c.add(gmb);
                    }
                    stringBuilder.append(" [? ").append(gmb.a).append(" ?]");
                }
            }
        }
        double d = 0.0d;
        if (i > 0) {
            d = ((double) j) / ((double) i);
        }
        stringBuilder.append(";       max (ms): ").append(j2).append("; min (ms): ").append(j3).append("; avg (ms): ").append(d);
        return new gmc(this, this.a, j);
    }
}
