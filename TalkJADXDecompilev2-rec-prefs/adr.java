package p000;

import java.util.ArrayList;
import java.util.List;

public class adr {
    ll<aaa> f349a;
    final ArrayList<aaa> f350b;
    final ArrayList<aaa> f351c;
    final zz f352d;
    Runnable f353e;
    final boolean f354f;
    final adq f355g;
    int f356h;

    public aaa m666a(int i, int i2, int i3, Object obj) {
        aaa aaa = (aaa) this.f349a.mo436a();
        if (aaa == null) {
            return new aaa(i, i2, i3, obj);
        }
        aaa.f3a = i;
        aaa.f4b = i2;
        aaa.f6d = i3;
        aaa.f5c = obj;
        return aaa;
    }

    public void m668a(aaa aaa) {
        if (!this.f354f) {
            aaa.f5c = null;
            this.f349a.mo437a(aaa);
        }
    }

    public adr(zz zzVar) {
        this(zzVar, false);
    }

    adr(zz zzVar, boolean z) {
        this.f349a = new lm(30);
        this.f350b = new ArrayList();
        this.f351c = new ArrayList();
        this.f356h = 0;
        this.f352d = zzVar;
        this.f354f = false;
        this.f355g = new adq(this);
    }

    public void m667a() {
        m670a(this.f350b);
        m670a(this.f351c);
        this.f356h = 0;
    }

    public void m675b() {
        this.f355g.m664a(this.f350b);
        int size = this.f350b.size();
        for (int i = 0; i < size; i++) {
            aaa aaa = (aaa) this.f350b.get(i);
            switch (aaa.f3a) {
                case 1:
                    m688f(aaa);
                    break;
                case 2:
                    m680c(aaa);
                    break;
                case 4:
                    m683d(aaa);
                    break;
                case 8:
                    m676b(aaa);
                    break;
            }
            if (this.f353e != null) {
                this.f353e.run();
            }
        }
        this.f350b.clear();
    }

    public void m679c() {
        int size = this.f351c.size();
        for (int i = 0; i < size; i++) {
            this.f352d.b((aaa) this.f351c.get(i));
        }
        m670a(this.f351c);
        this.f356h = 0;
    }

    void m676b(aaa aaa) {
        m690g(aaa);
    }

    void m680c(aaa aaa) {
        int i = aaa.f4b;
        int i2 = aaa.f4b + aaa.f6d;
        Object obj = -1;
        int i3 = aaa.f4b;
        int i4 = 0;
        while (i3 < i2) {
            Object obj2;
            int i5;
            if (this.f352d.a(i3) != null || m671a(i3)) {
                if (obj == null) {
                    m687e(m666a(2, i, i4, null));
                    obj2 = 1;
                } else {
                    obj2 = null;
                }
                obj = 1;
            } else {
                if (obj == 1) {
                    m690g(m666a(2, i, i4, null));
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
        if (i4 != aaa.f6d) {
            m668a(aaa);
            aaa = m666a(2, i, i4, null);
        }
        if (obj == null) {
            m687e(aaa);
        } else {
            m690g(aaa);
        }
    }

    void m683d(aaa aaa) {
        int i = aaa.f4b;
        int i2 = aaa.f4b + aaa.f6d;
        int i3 = aaa.f4b;
        Object obj = -1;
        int i4 = 0;
        while (i3 < i2) {
            int i5;
            Object obj2;
            if (this.f352d.a(i3) != null || m671a(i3)) {
                if (obj == null) {
                    m687e(m666a(4, i, i4, aaa.f5c));
                    i4 = 0;
                    i = i3;
                }
                i5 = i;
                i = i4;
                obj2 = 1;
            } else {
                if (obj == 1) {
                    m690g(m666a(4, i, i4, aaa.f5c));
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
        if (i4 != aaa.f6d) {
            Object obj4 = aaa.f5c;
            m668a(aaa);
            aaa = m666a(4, i, i4, obj4);
        }
        if (obj == null) {
            m687e(aaa);
        } else {
            m690g(aaa);
        }
    }

    void m687e(aaa aaa) {
        if (aaa.f3a == 1 || aaa.f3a == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int i;
        int a = m665a(aaa.f4b, aaa.f3a);
        int i2 = aaa.f4b;
        switch (aaa.f3a) {
            case 2:
                i = 0;
                break;
            case 4:
                i = 1;
                break;
            default:
                throw new IllegalArgumentException("op should be remove or update." + aaa);
        }
        int i3 = 1;
        int i4 = a;
        a = i2;
        for (i2 = 1; i2 < aaa.f6d; i2++) {
            Object obj;
            int a2 = m665a(aaa.f4b + (i * i2), aaa.f3a);
            int i5;
            switch (aaa.f3a) {
                case 2:
                    if (a2 != i4) {
                        obj = null;
                        break;
                    } else {
                        i5 = 1;
                        break;
                    }
                case 4:
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
                aaa a3 = m666a(aaa.f3a, i4, i3, aaa.f5c);
                m669a(a3, a);
                m668a(a3);
                if (aaa.f3a == 4) {
                    a += i3;
                }
                i3 = 1;
                i4 = a2;
            }
        }
        Object obj2 = aaa.f5c;
        m668a(aaa);
        if (i3 > 0) {
            aaa a4 = m666a(aaa.f3a, i4, i3, obj2);
            m669a(a4, a);
            m668a(a4);
        }
    }

    void m669a(aaa aaa, int i) {
        this.f352d.a(aaa);
        switch (aaa.f3a) {
            case 2:
                this.f352d.a(i, aaa.f6d);
                return;
            case 4:
                this.f352d.a(i, aaa.f6d, aaa.f5c);
                return;
            default:
                throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
        }
    }

    int m665a(int i, int i2) {
        int i3;
        int size = this.f351c.size() - 1;
        int i4 = i;
        while (size >= 0) {
            int i5;
            aaa aaa = (aaa) this.f351c.get(size);
            if (aaa.f3a == 8) {
                int i6;
                if (aaa.f4b < aaa.f6d) {
                    i6 = aaa.f4b;
                    i3 = aaa.f6d;
                } else {
                    i6 = aaa.f6d;
                    i3 = aaa.f4b;
                }
                if (i4 < i6 || i4 > r2) {
                    if (i4 < aaa.f4b) {
                        if (i2 == 1) {
                            aaa.f4b++;
                            aaa.f6d++;
                            i5 = i4;
                        } else if (i2 == 2) {
                            aaa.f4b--;
                            aaa.f6d--;
                        }
                    }
                    i5 = i4;
                } else if (i6 == aaa.f4b) {
                    if (i2 == 1) {
                        aaa.f6d++;
                    } else if (i2 == 2) {
                        aaa.f6d--;
                    }
                    i5 = i4 + 1;
                } else {
                    if (i2 == 1) {
                        aaa.f4b++;
                    } else if (i2 == 2) {
                        aaa.f4b--;
                    }
                    i5 = i4 - 1;
                }
            } else {
                if (aaa.f4b <= i4) {
                    if (aaa.f3a == 1) {
                        i5 = i4 - aaa.f6d;
                    } else if (aaa.f3a == 2) {
                        i5 = aaa.f6d + i4;
                    }
                } else if (i2 == 1) {
                    aaa.f4b++;
                    i5 = i4;
                } else if (i2 == 2) {
                    aaa.f4b--;
                }
                i5 = i4;
            }
            size--;
            i4 = i5;
        }
        for (i3 = this.f351c.size() - 1; i3 >= 0; i3--) {
            aaa = (aaa) this.f351c.get(i3);
            if (aaa.f3a == 8) {
                if (aaa.f6d == aaa.f4b || aaa.f6d < 0) {
                    this.f351c.remove(i3);
                    m668a(aaa);
                }
            } else if (aaa.f6d <= 0) {
                this.f351c.remove(i3);
                m668a(aaa);
            }
        }
        return i4;
    }

    boolean m671a(int i) {
        int size = this.f351c.size();
        for (int i2 = 0; i2 < size; i2++) {
            aaa aaa = (aaa) this.f351c.get(i2);
            if (aaa.f3a == 8) {
                if (m674b(aaa.f6d, i2 + 1) == i) {
                    return true;
                }
            } else if (aaa.f3a == 1) {
                int i3 = aaa.f4b + aaa.f6d;
                for (int i4 = aaa.f4b; i4 < i3; i4++) {
                    if (m674b(i4, i2 + 1) == i) {
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

    void m688f(aaa aaa) {
        m690g(aaa);
    }

    void m690g(aaa aaa) {
        this.f351c.add(aaa);
        switch (aaa.f3a) {
            case 1:
                this.f352d.c(aaa.f4b, aaa.f6d);
                return;
            case 2:
                this.f352d.b(aaa.f4b, aaa.f6d);
                return;
            case 4:
                this.f352d.a(aaa.f4b, aaa.f6d, aaa.f5c);
                return;
            case 8:
                this.f352d.d(aaa.f4b, aaa.f6d);
                return;
            default:
                throw new IllegalArgumentException("Unknown update op type for " + aaa);
        }
    }

    public boolean m684d() {
        return this.f350b.size() > 0;
    }

    public boolean m677b(int i) {
        return (this.f356h & i) != 0;
    }

    int m678c(int i) {
        return m674b(i, 0);
    }

    int m674b(int i, int i2) {
        int size = this.f351c.size();
        int i3 = i;
        while (i2 < size) {
            aaa aaa = (aaa) this.f351c.get(i2);
            if (aaa.f3a == 8) {
                if (aaa.f4b == i3) {
                    i3 = aaa.f6d;
                } else {
                    if (aaa.f4b < i3) {
                        i3--;
                    }
                    if (aaa.f6d <= i3) {
                        i3++;
                    }
                }
            } else if (aaa.f4b > i3) {
                continue;
            } else if (aaa.f3a == 2) {
                if (i3 < aaa.f4b + aaa.f6d) {
                    return -1;
                }
                i3 -= aaa.f6d;
            } else if (aaa.f3a == 1) {
                i3 += aaa.f6d;
            }
            i2++;
        }
        return i3;
    }

    boolean m673a(int i, int i2, Object obj) {
        if (i2 <= 0) {
            return false;
        }
        this.f350b.add(m666a(4, i, i2, obj));
        this.f356h |= 4;
        if (this.f350b.size() == 1) {
            return true;
        }
        return false;
    }

    boolean m681c(int i, int i2) {
        if (i2 <= 0) {
            return false;
        }
        this.f350b.add(m666a(1, i, i2, null));
        this.f356h |= 1;
        if (this.f350b.size() == 1) {
            return true;
        }
        return false;
    }

    boolean m685d(int i, int i2) {
        if (i2 <= 0) {
            return false;
        }
        this.f350b.add(m666a(2, i, i2, null));
        this.f356h |= 2;
        if (this.f350b.size() == 1) {
            return true;
        }
        return false;
    }

    boolean m672a(int i, int i2, int i3) {
        if (i == i2) {
            return false;
        }
        if (i3 != 1) {
            throw new IllegalArgumentException("Moving more than 1 item is not supported yet");
        }
        this.f350b.add(m666a(8, i, i2, null));
        this.f356h |= 8;
        if (this.f350b.size() == 1) {
            return true;
        }
        return false;
    }

    public void m686e() {
        m679c();
        int size = this.f350b.size();
        for (int i = 0; i < size; i++) {
            aaa aaa = (aaa) this.f350b.get(i);
            switch (aaa.f3a) {
                case 1:
                    this.f352d.b(aaa);
                    this.f352d.c(aaa.f4b, aaa.f6d);
                    break;
                case 2:
                    this.f352d.b(aaa);
                    this.f352d.a(aaa.f4b, aaa.f6d);
                    break;
                case 4:
                    this.f352d.b(aaa);
                    this.f352d.a(aaa.f4b, aaa.f6d, aaa.f5c);
                    break;
                case 8:
                    this.f352d.b(aaa);
                    this.f352d.d(aaa.f4b, aaa.f6d);
                    break;
            }
            if (this.f353e != null) {
                this.f353e.run();
            }
        }
        m670a(this.f350b);
        this.f356h = 0;
    }

    public int m682d(int i) {
        int size = this.f350b.size();
        int i2 = i;
        for (int i3 = 0; i3 < size; i3++) {
            aaa aaa = (aaa) this.f350b.get(i3);
            switch (aaa.f3a) {
                case 1:
                    if (aaa.f4b > i2) {
                        break;
                    }
                    i2 += aaa.f6d;
                    break;
                case 2:
                    if (aaa.f4b <= i2) {
                        if (aaa.f4b + aaa.f6d <= i2) {
                            i2 -= aaa.f6d;
                            break;
                        }
                        return -1;
                    }
                    continue;
                case 8:
                    if (aaa.f4b != i2) {
                        if (aaa.f4b < i2) {
                            i2--;
                        }
                        if (aaa.f6d > i2) {
                            break;
                        }
                        i2++;
                        break;
                    }
                    i2 = aaa.f6d;
                    break;
                default:
                    break;
            }
        }
        return i2;
    }

    public boolean m689f() {
        return (this.f351c.isEmpty() || this.f350b.isEmpty()) ? false : true;
    }

    void m670a(List<aaa> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            m668a((aaa) list.get(i));
        }
        list.clear();
    }
}
