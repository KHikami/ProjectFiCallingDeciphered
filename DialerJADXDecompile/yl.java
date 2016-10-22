import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
public class yl {
    ii a;
    final ArrayList b;
    final ArrayList c;
    final va d;
    final boolean e;
    final yk f;
    int g;

    public vb a(int i, int i2, int i3, Object obj) {
        vb vbVar = (vb) this.a.a();
        if (vbVar == null) {
            return new vb(i, i2, i3, obj);
        }
        vbVar.a = i;
        vbVar.b = i2;
        vbVar.d = i3;
        vbVar.c = obj;
        return vbVar;
    }

    public void a(vb vbVar) {
        if (!this.e) {
            vbVar.c = null;
            this.a.a(vbVar);
        }
    }

    public yl(va vaVar) {
        this(vaVar, false);
    }

    yl(va vaVar, boolean z) {
        this.a = new ii(30);
        this.b = new ArrayList();
        this.c = new ArrayList();
        this.g = 0;
        this.d = vaVar;
        this.e = false;
        this.f = new yk(this);
    }

    public void a() {
        a(this.b);
        a(this.c);
        this.g = 0;
    }

    public void b() {
        yk ykVar = this.f;
        List list = this.b;
        while (true) {
            int i;
            int i2;
            vb vbVar;
            vb vbVar2;
            vb vbVar3;
            Object obj;
            Object obj2;
            int i3;
            Object obj3 = null;
            int size = list.size() - 1;
            while (size >= 0) {
                Object obj4;
                if (((vb) list.get(size)).a != 8) {
                    obj4 = 1;
                } else if (obj3 != null) {
                    i = size;
                    if (i != -1) {
                        i2 = i + 1;
                        vbVar = (vb) list.get(i);
                        vbVar2 = (vb) list.get(i2);
                        switch (vbVar2.a) {
                            case rq.b /*1*/:
                                size = 0;
                                if (vbVar.d < vbVar2.b) {
                                    size = -1;
                                }
                                if (vbVar.b < vbVar2.b) {
                                    size++;
                                }
                                if (vbVar2.b <= vbVar.b) {
                                    vbVar.b += vbVar2.d;
                                }
                                if (vbVar2.b <= vbVar.d) {
                                    vbVar.d += vbVar2.d;
                                }
                                vbVar2.b = size + vbVar2.b;
                                list.set(i, vbVar2);
                                list.set(i2, vbVar);
                                break;
                            case rq.c /*2*/:
                                vbVar3 = null;
                                obj = null;
                                if (vbVar.b < vbVar.d) {
                                    obj2 = null;
                                    if (vbVar2.b == vbVar.b && vbVar2.d == vbVar.d - vbVar.b) {
                                        obj = 1;
                                    }
                                } else {
                                    obj2 = 1;
                                    if (vbVar2.b == vbVar.d + 1 && vbVar2.d == vbVar.b - vbVar.d) {
                                        obj = 1;
                                    }
                                }
                                if (vbVar.d < vbVar2.b) {
                                    if (vbVar.d < vbVar2.b + vbVar2.d) {
                                        vbVar2.d--;
                                        vbVar.a = 2;
                                        vbVar.d = 1;
                                        if (vbVar2.d != 0) {
                                            break;
                                        }
                                        list.remove(i2);
                                        ykVar.a.a(vbVar2);
                                        break;
                                    }
                                }
                                vbVar2.b--;
                                if (vbVar.b <= vbVar2.b) {
                                    vbVar2.b++;
                                } else if (vbVar.b < vbVar2.b + vbVar2.d) {
                                    vbVar3 = ykVar.a.a(2, vbVar.b + 1, (vbVar2.b + vbVar2.d) - vbVar.b, null);
                                    vbVar2.d = vbVar.b - vbVar2.b;
                                }
                                if (obj == null) {
                                    if (obj2 == null) {
                                        if (vbVar3 != null) {
                                            if (vbVar.b > vbVar3.b) {
                                                vbVar.b -= vbVar3.d;
                                            }
                                            if (vbVar.d > vbVar3.b) {
                                                vbVar.d -= vbVar3.d;
                                            }
                                        }
                                        if (vbVar.b > vbVar2.b) {
                                            vbVar.b -= vbVar2.d;
                                        }
                                        if (vbVar.d > vbVar2.b) {
                                            vbVar.d -= vbVar2.d;
                                        }
                                    } else {
                                        if (vbVar3 != null) {
                                            if (vbVar.b >= vbVar3.b) {
                                                vbVar.b -= vbVar3.d;
                                            }
                                            if (vbVar.d >= vbVar3.b) {
                                                vbVar.d -= vbVar3.d;
                                            }
                                        }
                                        if (vbVar.b >= vbVar2.b) {
                                            vbVar.b -= vbVar2.d;
                                        }
                                        if (vbVar.d >= vbVar2.b) {
                                            vbVar.d -= vbVar2.d;
                                        }
                                    }
                                    list.set(i, vbVar2);
                                    if (vbVar.b == vbVar.d) {
                                        list.set(i2, vbVar);
                                    } else {
                                        list.remove(i2);
                                    }
                                    if (vbVar3 == null) {
                                        break;
                                    }
                                    list.add(i, vbVar3);
                                    break;
                                }
                                list.set(i, vbVar2);
                                list.remove(i2);
                                ykVar.a.a(vbVar);
                                break;
                            case rl.f /*4*/:
                                obj2 = null;
                                obj = null;
                                if (vbVar.d < vbVar2.b) {
                                    vbVar2.b--;
                                } else if (vbVar.d < vbVar2.b + vbVar2.d) {
                                    vbVar2.d--;
                                    obj2 = ykVar.a.a(4, vbVar.b, 1, vbVar2.c);
                                }
                                if (vbVar.b <= vbVar2.b) {
                                    vbVar2.b++;
                                } else if (vbVar.b < vbVar2.b + vbVar2.d) {
                                    int i4 = (vbVar2.b + vbVar2.d) - vbVar.b;
                                    obj = ykVar.a.a(4, vbVar.b + 1, i4, vbVar2.c);
                                    vbVar2.d -= i4;
                                }
                                list.set(i2, vbVar);
                                if (vbVar2.d <= 0) {
                                    list.set(i, vbVar2);
                                } else {
                                    list.remove(i);
                                    ykVar.a.a(vbVar2);
                                }
                                if (obj2 != null) {
                                    list.add(i, obj2);
                                }
                                if (obj == null) {
                                    break;
                                }
                                list.add(i, obj);
                                break;
                            default:
                                break;
                        }
                    }
                    size = this.b.size();
                    for (i3 = 0; i3 < size; i3++) {
                        vbVar = (vb) this.b.get(i3);
                        switch (vbVar.a) {
                            case rq.b /*1*/:
                                f(vbVar);
                                break;
                            case rq.c /*2*/:
                                c(vbVar);
                                break;
                            case rl.f /*4*/:
                                d(vbVar);
                                break;
                            case rl.j /*8*/:
                                b(vbVar);
                                break;
                            default:
                                break;
                        }
                    }
                    this.b.clear();
                    return;
                } else {
                    obj4 = obj3;
                }
                size--;
                obj3 = obj4;
            }
            i = -1;
            if (i != -1) {
                i2 = i + 1;
                vbVar = (vb) list.get(i);
                vbVar2 = (vb) list.get(i2);
                switch (vbVar2.a) {
                    case rq.b /*1*/:
                        size = 0;
                        if (vbVar.d < vbVar2.b) {
                            size = -1;
                        }
                        if (vbVar.b < vbVar2.b) {
                            size++;
                        }
                        if (vbVar2.b <= vbVar.b) {
                            vbVar.b += vbVar2.d;
                        }
                        if (vbVar2.b <= vbVar.d) {
                            vbVar.d += vbVar2.d;
                        }
                        vbVar2.b = size + vbVar2.b;
                        list.set(i, vbVar2);
                        list.set(i2, vbVar);
                        break;
                    case rq.c /*2*/:
                        vbVar3 = null;
                        obj = null;
                        if (vbVar.b < vbVar.d) {
                            obj2 = null;
                            obj = 1;
                            break;
                        }
                        obj2 = 1;
                        obj = 1;
                        break;
                        if (vbVar.d < vbVar2.b) {
                            if (vbVar.d < vbVar2.b + vbVar2.d) {
                                vbVar2.d--;
                                vbVar.a = 2;
                                vbVar.d = 1;
                                if (vbVar2.d != 0) {
                                    list.remove(i2);
                                    ykVar.a.a(vbVar2);
                                    break;
                                }
                                break;
                            }
                        }
                        vbVar2.b--;
                        if (vbVar.b <= vbVar2.b) {
                            vbVar2.b++;
                        } else if (vbVar.b < vbVar2.b + vbVar2.d) {
                            vbVar3 = ykVar.a.a(2, vbVar.b + 1, (vbVar2.b + vbVar2.d) - vbVar.b, null);
                            vbVar2.d = vbVar.b - vbVar2.b;
                        }
                        if (obj == null) {
                            list.set(i, vbVar2);
                            list.remove(i2);
                            ykVar.a.a(vbVar);
                            break;
                        }
                        if (obj2 == null) {
                            if (vbVar3 != null) {
                                if (vbVar.b >= vbVar3.b) {
                                    vbVar.b -= vbVar3.d;
                                }
                                if (vbVar.d >= vbVar3.b) {
                                    vbVar.d -= vbVar3.d;
                                }
                            }
                            if (vbVar.b >= vbVar2.b) {
                                vbVar.b -= vbVar2.d;
                            }
                            if (vbVar.d >= vbVar2.b) {
                                vbVar.d -= vbVar2.d;
                            }
                        } else {
                            if (vbVar3 != null) {
                                if (vbVar.b > vbVar3.b) {
                                    vbVar.b -= vbVar3.d;
                                }
                                if (vbVar.d > vbVar3.b) {
                                    vbVar.d -= vbVar3.d;
                                }
                            }
                            if (vbVar.b > vbVar2.b) {
                                vbVar.b -= vbVar2.d;
                            }
                            if (vbVar.d > vbVar2.b) {
                                vbVar.d -= vbVar2.d;
                            }
                        }
                        list.set(i, vbVar2);
                        if (vbVar.b == vbVar.d) {
                            list.remove(i2);
                        } else {
                            list.set(i2, vbVar);
                        }
                        if (vbVar3 == null) {
                            list.add(i, vbVar3);
                            break;
                        }
                        break;
                    case rl.f /*4*/:
                        obj2 = null;
                        obj = null;
                        if (vbVar.d < vbVar2.b) {
                            vbVar2.b--;
                        } else if (vbVar.d < vbVar2.b + vbVar2.d) {
                            vbVar2.d--;
                            obj2 = ykVar.a.a(4, vbVar.b, 1, vbVar2.c);
                        }
                        if (vbVar.b <= vbVar2.b) {
                            vbVar2.b++;
                        } else if (vbVar.b < vbVar2.b + vbVar2.d) {
                            int i42 = (vbVar2.b + vbVar2.d) - vbVar.b;
                            obj = ykVar.a.a(4, vbVar.b + 1, i42, vbVar2.c);
                            vbVar2.d -= i42;
                        }
                        list.set(i2, vbVar);
                        if (vbVar2.d <= 0) {
                            list.remove(i);
                            ykVar.a.a(vbVar2);
                        } else {
                            list.set(i, vbVar2);
                        }
                        if (obj2 != null) {
                            list.add(i, obj2);
                        }
                        if (obj == null) {
                            list.add(i, obj);
                            break;
                        }
                        break;
                    default:
                        break;
                }
            }
            size = this.b.size();
            for (i3 = 0; i3 < size; i3++) {
                vbVar = (vb) this.b.get(i3);
                switch (vbVar.a) {
                    case rq.b /*1*/:
                        f(vbVar);
                        break;
                    case rq.c /*2*/:
                        c(vbVar);
                        break;
                    case rl.f /*4*/:
                        d(vbVar);
                        break;
                    case rl.j /*8*/:
                        b(vbVar);
                        break;
                    default:
                        break;
                }
            }
            this.b.clear();
            return;
        }
    }

    public void c() {
        int size = this.c.size();
        for (int i = 0; i < size; i++) {
            this.d.b((vb) this.c.get(i));
        }
        a(this.c);
        this.g = 0;
    }

    void b(vb vbVar) {
        g(vbVar);
    }

    void c(vb vbVar) {
        int i = vbVar.b;
        int i2 = vbVar.b + vbVar.d;
        Object obj = -1;
        int i3 = vbVar.b;
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
        if (i4 != vbVar.d) {
            a(vbVar);
            vbVar = a(2, i, i4, null);
        }
        if (obj == null) {
            e(vbVar);
        } else {
            g(vbVar);
        }
    }

    void d(vb vbVar) {
        int i = vbVar.b;
        int i2 = vbVar.b + vbVar.d;
        int i3 = vbVar.b;
        Object obj = -1;
        int i4 = 0;
        while (i3 < i2) {
            int i5;
            Object obj2;
            if (this.d.a(i3) != null || a(i3)) {
                if (obj == null) {
                    e(a(4, i, i4, vbVar.c));
                    i4 = 0;
                    i = i3;
                }
                i5 = i;
                i = i4;
                obj2 = 1;
            } else {
                if (obj == 1) {
                    g(a(4, i, i4, vbVar.c));
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
        if (i4 != vbVar.d) {
            Object obj4 = vbVar.c;
            a(vbVar);
            vbVar = a(4, i, i4, obj4);
        }
        if (obj == null) {
            e(vbVar);
        } else {
            g(vbVar);
        }
    }

    void e(vb vbVar) {
        if (vbVar.a == 1 || vbVar.a == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int i;
        int a = a(vbVar.b, vbVar.a);
        int i2 = vbVar.b;
        switch (vbVar.a) {
            case rq.c /*2*/:
                i = 0;
                break;
            case rl.f /*4*/:
                i = 1;
                break;
            default:
                throw new IllegalArgumentException("op should be remove or update." + vbVar);
        }
        int i3 = 1;
        int i4 = a;
        a = i2;
        for (i2 = 1; i2 < vbVar.d; i2++) {
            Object obj;
            int a2 = a(vbVar.b + (i * i2), vbVar.a);
            int i5;
            switch (vbVar.a) {
                case rq.c /*2*/:
                    if (a2 != i4) {
                        obj = null;
                        break;
                    } else {
                        i5 = 1;
                        break;
                    }
                case rl.f /*4*/:
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
                vb a3 = a(vbVar.a, i4, i3, vbVar.c);
                a(a3, a);
                a(a3);
                if (vbVar.a == 4) {
                    a += i3;
                }
                i3 = 1;
                i4 = a2;
            }
        }
        Object obj2 = vbVar.c;
        a(vbVar);
        if (i3 > 0) {
            vb a4 = a(vbVar.a, i4, i3, obj2);
            a(a4, a);
            a(a4);
        }
    }

    void a(vb vbVar, int i) {
        this.d.a(vbVar);
        switch (vbVar.a) {
            case rq.c /*2*/:
                this.d.a(i, vbVar.d);
            case rl.f /*4*/:
                this.d.a(i, vbVar.d, vbVar.c);
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
            vb vbVar = (vb) this.c.get(size);
            if (vbVar.a == 8) {
                int i6;
                if (vbVar.b < vbVar.d) {
                    i6 = vbVar.b;
                    i3 = vbVar.d;
                } else {
                    i6 = vbVar.d;
                    i3 = vbVar.b;
                }
                if (i4 < i6 || i4 > r2) {
                    if (i4 < vbVar.b) {
                        if (i2 == 1) {
                            vbVar.b++;
                            vbVar.d++;
                            i5 = i4;
                        } else if (i2 == 2) {
                            vbVar.b--;
                            vbVar.d--;
                        }
                    }
                    i5 = i4;
                } else if (i6 == vbVar.b) {
                    if (i2 == 1) {
                        vbVar.d++;
                    } else if (i2 == 2) {
                        vbVar.d--;
                    }
                    i5 = i4 + 1;
                } else {
                    if (i2 == 1) {
                        vbVar.b++;
                    } else if (i2 == 2) {
                        vbVar.b--;
                    }
                    i5 = i4 - 1;
                }
            } else {
                if (vbVar.b <= i4) {
                    if (vbVar.a == 1) {
                        i5 = i4 - vbVar.d;
                    } else if (vbVar.a == 2) {
                        i5 = vbVar.d + i4;
                    }
                } else if (i2 == 1) {
                    vbVar.b++;
                    i5 = i4;
                } else if (i2 == 2) {
                    vbVar.b--;
                }
                i5 = i4;
            }
            size--;
            i4 = i5;
        }
        for (i3 = this.c.size() - 1; i3 >= 0; i3--) {
            vbVar = (vb) this.c.get(i3);
            if (vbVar.a == 8) {
                if (vbVar.d == vbVar.b || vbVar.d < 0) {
                    this.c.remove(i3);
                    a(vbVar);
                }
            } else if (vbVar.d <= 0) {
                this.c.remove(i3);
                a(vbVar);
            }
        }
        return i4;
    }

    boolean a(int i) {
        int size = this.c.size();
        for (int i2 = 0; i2 < size; i2++) {
            vb vbVar = (vb) this.c.get(i2);
            if (vbVar.a == 8) {
                if (b(vbVar.d, i2 + 1) == i) {
                    return true;
                }
            } else if (vbVar.a == 1) {
                int i3 = vbVar.b + vbVar.d;
                for (int i4 = vbVar.b; i4 < i3; i4++) {
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

    void f(vb vbVar) {
        g(vbVar);
    }

    void g(vb vbVar) {
        this.c.add(vbVar);
        switch (vbVar.a) {
            case rq.b /*1*/:
                this.d.c(vbVar.b, vbVar.d);
            case rq.c /*2*/:
                this.d.b(vbVar.b, vbVar.d);
            case rl.f /*4*/:
                this.d.a(vbVar.b, vbVar.d, vbVar.c);
            case rl.j /*8*/:
                this.d.d(vbVar.b, vbVar.d);
            default:
                throw new IllegalArgumentException("Unknown update op type for " + vbVar);
        }
    }

    public boolean d() {
        return this.b.size() > 0;
    }

    public boolean b(int i) {
        return (this.g & i) != 0;
    }

    int c(int i) {
        return b(i, 0);
    }

    int b(int i, int i2) {
        int size = this.c.size();
        int i3 = i;
        while (i2 < size) {
            vb vbVar = (vb) this.c.get(i2);
            if (vbVar.a == 8) {
                if (vbVar.b == i3) {
                    i3 = vbVar.d;
                } else {
                    if (vbVar.b < i3) {
                        i3--;
                    }
                    if (vbVar.d <= i3) {
                        i3++;
                    }
                }
            } else if (vbVar.b > i3) {
                continue;
            } else if (vbVar.a == 2) {
                if (i3 < vbVar.b + vbVar.d) {
                    return -1;
                }
                i3 -= vbVar.d;
            } else if (vbVar.a == 1) {
                i3 += vbVar.d;
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
        this.g |= 4;
        if (this.b.size() == 1) {
            return true;
        }
        return false;
    }

    boolean c(int i, int i2) {
        if (i2 <= 0) {
            return false;
        }
        this.b.add(a(2, i, i2, null));
        this.g |= 2;
        if (this.b.size() == 1) {
            return true;
        }
        return false;
    }

    public void e() {
        c();
        int size = this.b.size();
        for (int i = 0; i < size; i++) {
            vb vbVar = (vb) this.b.get(i);
            switch (vbVar.a) {
                case rq.b /*1*/:
                    this.d.b(vbVar);
                    this.d.c(vbVar.b, vbVar.d);
                    break;
                case rq.c /*2*/:
                    this.d.b(vbVar);
                    this.d.a(vbVar.b, vbVar.d);
                    break;
                case rl.f /*4*/:
                    this.d.b(vbVar);
                    this.d.a(vbVar.b, vbVar.d, vbVar.c);
                    break;
                case rl.j /*8*/:
                    this.d.b(vbVar);
                    this.d.d(vbVar.b, vbVar.d);
                    break;
                default:
                    break;
            }
        }
        a(this.b);
        this.g = 0;
    }

    public int d(int i) {
        int size = this.b.size();
        int i2 = i;
        for (int i3 = 0; i3 < size; i3++) {
            vb vbVar = (vb) this.b.get(i3);
            switch (vbVar.a) {
                case rq.b /*1*/:
                    if (vbVar.b > i2) {
                        break;
                    }
                    i2 += vbVar.d;
                    break;
                case rq.c /*2*/:
                    if (vbVar.b <= i2) {
                        if (vbVar.b + vbVar.d <= i2) {
                            i2 -= vbVar.d;
                            break;
                        }
                        return -1;
                    }
                    continue;
                case rl.j /*8*/:
                    if (vbVar.b != i2) {
                        if (vbVar.b < i2) {
                            i2--;
                        }
                        if (vbVar.d > i2) {
                            break;
                        }
                        i2++;
                        break;
                    }
                    i2 = vbVar.d;
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

    void a(List list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            a((vb) list.get(i));
        }
        list.clear();
    }
}
