package p000;

import java.util.ArrayList;
import java.util.List;

public abstract class aeb {
    private aec f176a = null;
    private ArrayList<C0000a> f177b = new ArrayList();
    private long f178c = 120;
    private long f179d = 120;
    private long f180e = 250;
    private long f181f = 250;

    public abstract void mo28a();

    public abstract boolean mo23a(aer aer, aed aed, aed aed2);

    public abstract boolean mo24a(aer aer, aer aer2, aed aed, aed aed2);

    public abstract boolean mo33b();

    public abstract boolean mo25b(aer aer, aed aed, aed aed2);

    public abstract void mo35c(aer aer);

    public abstract boolean mo26c(aer aer, aed aed, aed aed2);

    public abstract void mo36d();

    public long m325e() {
        return this.f180e;
    }

    public void m312a(long j) {
        this.f180e = j;
    }

    public long m326f() {
        return this.f178c;
    }

    public void m318b(long j) {
        this.f178c = j;
    }

    public long m328g() {
        return this.f179d;
    }

    public long m330h() {
        return this.f181f;
    }

    public void m313a(aec aec) {
        this.f176a = aec;
    }

    public aed mo743b(aer aer, List<Object> list) {
        return m332j().mo745a(aer);
    }

    public aed mo744d(aer aer) {
        return m332j().mo745a(aer);
    }

    public final void m327f(aer aer) {
        if (this.f176a != null) {
            this.f176a.m779a(aer);
        }
    }

    public boolean mo27g(aer aer) {
        return true;
    }

    public boolean mo32a(aer aer, List<Object> list) {
        return mo27g(aer);
    }

    public final void m331i() {
        int size = this.f177b.size();
        for (int i = 0; i < size; i++) {
            this.f177b.get(i);
        }
        this.f177b.clear();
    }

    public aed m332j() {
        return new aed();
    }

    public static int m310e(aer aer) {
        int i = aer.f446i & 14;
        if (aer.m871k()) {
            return 4;
        }
        if ((i & 4) != 0) {
            return i;
        }
        int i2 = aer.f440c;
        int e = aer.m865e();
        if (i2 == -1 || e == -1 || i2 == e) {
            return i;
        }
        return i | 2048;
    }
}
