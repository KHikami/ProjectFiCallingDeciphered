import java.util.ArrayList;
import java.util.List;

public class adr {
    ll<aaa> a;
    final ArrayList<aaa> b;
    final ArrayList<aaa> c;
    final zz d;
    Runnable e;
    final boolean f;
    final adq g;
    int h;

    public aaa a(int i, int i2, int i3, Object obj) {
        aaa aaa = (aaa) this.a.a();
        if (aaa == null) {
            return new aaa(i, i2, i3, obj);
        }
        aaa.a = i;
        aaa.b = i2;
        aaa.d = i3;
        aaa.c = obj;
        return aaa;
    }

    public void a(aaa aaa) {
        if (!this.f) {
            aaa.c = null;
            this.a.a(aaa);
        }
    }

    public adr(zz zzVar) {
        this(zzVar, false);
    }

    adr(zz zzVar, boolean z) {
        this.a = new lm(30);
        this.b = new ArrayList();
        this.c = new ArrayList();
        this.h = 0;
        this.d = zzVar;
        this.f = false;
        this.g = new adq(this);
    }

    public void a() {
        a(this.b);
        a(this.c);
        this.h = 0;
    }

    public void b() {
        this.g.a(this.b);
        int size = this.b.size();
        for (int i = 0; i < size; i++) {
            aaa aaa = (aaa) this.b.get(i);
            switch (aaa.a) {
                case wi.j /*1*/:
                    f(aaa);
                    break;
                case wi.l /*2*/:
                    c(aaa);
                    break;
                case wi.h /*4*/:
                    d(aaa);
                    break;
                case wi.m /*8*/:
                    b(aaa);
                    break;
            }
            if (this.e != null) {
                this.e.run();
            }
        }
        this.b.clear();
    }

    public void c() {
        int size = this.c.size();
        for (int i = 0; i < size; i++) {
            this.d.b((aaa) this.c.get(i));
        }
        a(this.c);
        this.h = 0;
    }

    void b(aaa aaa) {
        g(aaa);
    }

    void c(aaa aaa) {
        int i = aaa.b;
        int i2 = aaa.b + aaa.d;
        Object obj = -1;
        int i3 = aaa.b;
        int i4 = 0;
        while (i3 < i2) {
            Object obj2;
            int i5;
            if (this.d.a(i3) != null || a(i3)) {
                if (obj == null) {
                    e(a(2, i, i4, null));
                    obj2 = 1;
                } else {
                    obj2 = null;
                }
                obj = 1;
            } else {
                if (obj == 1) {
                    g(a(2, i, i4, null));
                    obj2 = 1;
                } else {
                    obj2 = null;
                }
                obj = null;
            }
            if (obj2 != null) {
                i5 = i3 - i4;
                i3 = i2 - i4;
                i2 = 1;
            } else {
                int i6 = i3;
                i3 = i2;
                i2 = i4 + 1;
                i5 = i6;
            }
            i4 = i2;
            i2 = i3;
            i3 = i5 + 1;
        }
        if (i4 != aaa.d) {
            a(aaa);
            aaa = a(2, i, i4, null);
        }
        if (obj == null) {
            e(aaa);
        } else {
            g(aaa);
        }
    }

    void d(aaa aaa) {
        int i = aaa.b;
        int i2 = aaa.b + aaa.d;
        int i3 = aaa.b;
        Object obj = -1;
        int i4 = 0;
        while (i3 < i2) {
            int i5;
            Object obj2;
            if (this.d.a(i3) != null || a(i3)) {
                if (obj == null) {
                    e(a(4, i, i4, aaa.c));
                    i4 = 0;
                    i = i3;
                }
                i5 = i;
                i = i4;
                obj2 = 1;
            } else {
                if (obj == 1) {
                    g(a(4, i, i4, aaa.c));
                    i4 = 0;
                    i = i3;
                }
                i5 = i;
                i = i4;
                obj2 = null;
            }
            i3++;
            Object obj3 = obj2;
            i4 = i + 1;
            i = i5;
            obj = obj3;
        }
        if (i4 != aaa.d) {
            Object obj4 = aaa.c;
            a(aaa);
            aaa = a(4, i, i4, obj4);
        }
        if (obj == null) {
            e(aaa);
        } else {
            g(aaa);
        }
    }

    void e(aaa aaa) {
        if (aaa.a == 1 || aaa.a == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int i;
        int a = a(aaa.b, aaa.a);
        int i2 = aaa.b;
        switch (aaa.a) {
            case wi.l /*2*/:
                i = 0;
                break;
            case wi.h /*4*/:
                i = 1;
                break;
            default:
                throw new IllegalArgumentException("op should be remove or update." + aaa);
        }
        int i3 = 1;
        int i4 = a;
        a = i2;
        for (i2 = 1; i2 < aaa.d; i2++) {
            Object obj;
            int a2 = a(aaa.b + (i * i2), aaa.a);
            int i5;
            switch (aaa.a) {
                case wi.l /*2*/:
                    if (a2 != i4) {
                        obj = null;
                        break;
                    } else {
                        i5 = 1;
                        break;
                    }
                case wi.h /*4*/:
                    if (a2 != i4 + 1) {
                        obj = null;
                        break;
                    } else {
                        i5 = 1;
                        break;
                    }
                default:
                    obj = null;
                    break;
            }
            if (obj != null) {
                i3++;
            } else {
                aaa a3 = a(aaa.a, i4, i3, aaa.c);
                a(a3, a);
                a(a3);
                if (aaa.a == 4) {
                    a += i3;
                }
                i3 = 1;
                i4 = a2;
            }
        }
        Object obj2 = aaa.c;
        a(aaa);
        if (i3 > 0) {
            aaa a4 = a(aaa.a, i4, i3, obj2);
            a(a4, a);
            a(a4);
        }
    }

    void a(aaa aaa, int i) {
        this.d.a(aaa);
        switch (aaa.a) {
            case wi.l /*2*/:
                this.d.a(i, aaa.d);
            case wi.h /*4*/:
                this.d.a(i, aaa.d, aaa.c);
            default:
                throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
        }
    }

    int a(int i, int i2) {
        int i3;
        int size = this.c.size() - 1;
        int i4 = i;
        while (size >= 0) {
            int i5;
            aaa aaa = (aaa) this.c.get(size);
            if (aaa.a == 8) {
                int i6;
                if (aaa.b < aaa.d) {
                    i6 = aaa.b;
                    i3 = aaa.d;
                } else {
                    i6 = aaa.d;
                    i3 = aaa.b;
                }
                if (i4 < i6 || i4 > r2) {
                    if (i4 < aaa.b) {
                        if (i2 == 1) {
                            aaa.b++;
                            aaa.d++;
                            i5 = i4;
                        } else if (i2 == 2) {
                            aaa.b--;
                            aaa.d--;
                        }
                    }
                    i5 = i4;
                } else if (i6 == aaa.b) {
                    if (i2 == 1) {
                        aaa.d++;
                    } else if (i2 == 2) {
                        aaa.d--;
                    }
                    i5 = i4 + 1;
                } else {
                    if (i2 == 1) {
                        aaa.b++;
                    } else if (i2 == 2) {
                        aaa.b--;
                    }
                    i5 = i4 - 1;
                }
            } else {
                if (aaa.b <= i4) {
                    if (aaa.a == 1) {
                        i5 = i4 - aaa.d;
                    } else if (aaa.a == 2) {
                        i5 = aaa.d + i4;
                    }
                } else if (i2 == 1) {
                    aaa.b++;
                    i5 = i4;
                } else if (i2 == 2) {
                    aaa.b--;
                }
                i5 = i4;
            }
            size--;
            i4 = i5;
        }
        for (i3 = this.c.size() - 1; i3 >= 0; i3--) {
            aaa = (aaa) this.c.get(i3);
            if (aaa.a == 8) {
                if (aaa.d == aaa.b || aaa.d < 0) {
                    this.c.remove(i3);
                    a(aaa);
                }
            } else if (aaa.d <= 0) {
                this.c.remove(i3);
                a(aaa);
            }
        }
        return i4;
    }

    boolean a(int i) {
        int size = this.c.size();
        for (int i2 = 0; i2 < size; i2++) {
            aaa aaa = (aaa) this.c.get(i2);
            if (aaa.a == 8) {
                if (b(aaa.d, i2 + 1) == i) {
                    return true;
                }
            } else if (aaa.a == 1) {
                int i3 = aaa.b + aaa.d;
                for (int i4 = aaa.b; i4 < i3; i4++) {
                    if (b(i4, i2 + 1) == i) {
                        return true;
                    }
                }
                continue;
            } else {
                continue;
            }
        }
        return false;
    }

    void f(aaa aaa) {
        g(aaa);
    }

    void g(aaa aaa) {
        this.c.add(aaa);
        switch (aaa.a) {
            case wi.j /*1*/:
                this.d.c(aaa.b, aaa.d);
            case wi.l /*2*/:
                this.d.b(aaa.b, aaa.d);
            case wi.h /*4*/:
                this.d.a(aaa.b, aaa.d, aaa.c);
            case wi.m /*8*/:
                this.d.d(aaa.b, aaa.d);
            default:
                throw new IllegalArgumentException("Unknown update op type for " + aaa);
        }
    }

    public boolean d() {
        return this.b.size() > 0;
    }

    public boolean b(int i) {
        return (this.h & i) != 0;
    }

    int c(int i) {
        return b(i, 0);
    }

    int b(int i, int i2) {
        int size = this.c.size();
        int i3 = i;
        while (i2 < size) {
            aaa aaa = (aaa) this.c.get(i2);
            if (aaa.a == 8) {
                if (aaa.b == i3) {
                    i3 = aaa.d;
                } else {
                    if (aaa.b < i3) {
                        i3--;
                    }
                    if (aaa.d <= i3) {
                        i3++;
                    }
                }
            } else if (aaa.b > i3) {
                continue;
            } else if (aaa.a == 2) {
                if (i3 < aaa.b + aaa.d) {
                    return -1;
                }
                i3 -= aaa.d;
            } else if (aaa.a == 1) {
                i3 += aaa.d;
            }
            i2++;
        }
        return i3;
    }

    boolean a(int i, int i2, Object obj) {
        if (i2 <= 0) {
            return false;
        }
        this.b.add(a(4, i, i2, obj));
        this.h |= 4;
        if (this.b.size() == 1) {
            return true;
        }
        return false;
    }

    boolean c(int i, int i2) {
        if (i2 <= 0) {
            return false;
        }
        this.b.add(a(1, i, i2, null));
        this.h |= 1;
        if (this.b.size() == 1) {
            return true;
        }
        return false;
    }

    boolean d(int i, int i2) {
        if (i2 <= 0) {
            return false;
        }
        this.b.add(a(2, i, i2, null));
        this.h |= 2;
        if (this.b.size() == 1) {
            return true;
        }
        return false;
    }

    boolean a(int i, int i2, int i3) {
        if (i == i2) {
            return false;
        }
        if (i3 != 1) {
            throw new IllegalArgumentException("Moving more than 1 item is not supported yet");
        }
        this.b.add(a(8, i, i2, null));
        this.h |= 8;
        if (this.b.size() == 1) {
            return true;
        }
        return false;
    }

    public void e() {
        c();
        int size = this.b.size();
        for (int i = 0; i < size; i++) {
            aaa aaa = (aaa) this.b.get(i);
            switch (aaa.a) {
                case wi.j /*1*/:
                    this.d.b(aaa);
                    this.d.c(aaa.b, aaa.d);
                    break;
                case wi.l /*2*/:
                    this.d.b(aaa);
                    this.d.a(aaa.b, aaa.d);
                    break;
                case wi.h /*4*/:
                    this.d.b(aaa);
                    this.d.a(aaa.b, aaa.d, aaa.c);
                    break;
                case wi.m /*8*/:
                    this.d.b(aaa);
                    this.d.d(aaa.b, aaa.d);
                    break;
            }
            if (this.e != null) {
                this.e.run();
            }
        }
        a(this.b);
        this.h = 0;
    }

    public int d(int i) {
        int size = this.b.size();
        int i2 = i;
        for (int i3 = 0; i3 < size; i3++) {
            aaa aaa = (aaa) this.b.get(i3);
            switch (aaa.a) {
                case wi.j /*1*/:
                    if (aaa.b > i2) {
                        break;
                    }
                    i2 += aaa.d;
                    break;
                case wi.l /*2*/:
                    if (aaa.b <= i2) {
                        if (aaa.b + aaa.d <= i2) {
                            i2 -= aaa.d;
                            break;
                        }
                        return -1;
                    }
                    continue;
                case wi.m /*8*/:
                    if (aaa.b != i2) {
                        if (aaa.b < i2) {
                            i2--;
                        }
                        if (aaa.d > i2) {
                            break;
                        }
                        i2++;
                        break;
                    }
                    i2 = aaa.d;
                    break;
                default:
                    break;
            }
        }
        return i2;
    }

    public boolean f() {
        return (this.c.isEmpty() || this.b.isEmpty()) ? false : true;
    }

    void a(List<aaa> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            a((aaa) list.get(i));
        }
        list.clear();
    }
}
