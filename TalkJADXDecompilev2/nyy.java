package defpackage;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class nyy<M extends nyx<M>, T> {
    public final int a;
    public final Class<T> b;
    public final int c;
    public final boolean d;

    public static <M extends nyx<M>, T extends nzf> nyy<M, T> a(int i, Class<T> cls, long j) {
        return new nyy(11, cls, (int) j, false);
    }

    public static <M extends nyx<M>, T> nyy<M, T> b(int i, Class<T> cls, long j) {
        return new nyz(i, cls, (int) j, false, 0, 0);
    }

    nyy(int i, Class<T> cls, int i2, boolean z) {
        this.a = i;
        this.b = cls;
        this.c = i2;
        this.d = z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nyy)) {
            return false;
        }
        nyy nyy = (nyy) obj;
        if (this.a == nyy.a && this.b == nyy.b && this.c == nyy.c && this.d == nyy.d) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.d ? 1 : 0) + ((((((this.a + 1147) * 31) + this.b.hashCode()) * 31) + this.c) * 31);
    }

    final T a(List<nzj> list) {
        int i = 0;
        if (list == null) {
            return null;
        }
        T t;
        nzj nzj;
        if (this.d) {
            List arrayList = new ArrayList();
            for (int i2 = 0; i2 < list.size(); i2++) {
                nzj = (nzj) list.get(i2);
                if (nzj.b.length != 0) {
                    a(nzj, arrayList);
                }
            }
            int size = arrayList.size();
            if (size == 0) {
                t = null;
            } else {
                T cast = this.b.cast(Array.newInstance(this.b.getComponentType(), size));
                while (i < size) {
                    Array.set(cast, i, arrayList.get(i));
                    i++;
                }
                return cast;
            }
        } else if (list.isEmpty()) {
            return null;
        } else {
            nzj = (nzj) list.get(list.size() - 1);
            Class cls = this.b;
            byte[] bArr = nzj.b;
            t = cls.cast(a(nyt.a(bArr, 0, bArr.length)));
        }
        return t;
    }

    protected Object a(nyt nyt) {
        String valueOf;
        Class componentType = this.d ? this.b.getComponentType() : this.b;
        try {
            nzf nzf;
            switch (this.a) {
                case 10:
                    nzf = (nzf) componentType.newInstance();
                    nyt.a(nzf, this.c >>> 3);
                    return nzf;
                case 11:
                    nzf = (nzf) componentType.newInstance();
                    nyt.a(nzf);
                    return nzf;
                default:
                    throw new IllegalArgumentException("Unknown type " + this.a);
            }
        } catch (Throwable e) {
            valueOf = String.valueOf(componentType);
            throw new IllegalArgumentException(new StringBuilder(String.valueOf(valueOf).length() + 33).append("Error creating instance of class ").append(valueOf).toString(), e);
        } catch (Throwable e2) {
            valueOf = String.valueOf(componentType);
            throw new IllegalArgumentException(new StringBuilder(String.valueOf(valueOf).length() + 33).append("Error creating instance of class ").append(valueOf).toString(), e2);
        } catch (Throwable e22) {
            throw new IllegalArgumentException("Error reading extension field", e22);
        }
    }

    protected void a(nzj nzj, List<Object> list) {
        byte[] bArr = nzj.b;
        list.add(a(nyt.a(bArr, 0, bArr.length)));
    }

    void a(Object obj, nyu nyu) {
        if (this.d) {
            c(obj, nyu);
        } else {
            b(obj, nyu);
        }
    }

    protected void b(Object obj, nyu nyu) {
        try {
            nyu.i(this.c);
            switch (this.a) {
                case 10:
                    int i = this.c >>> 3;
                    nyu.a((nzf) obj);
                    nyu.i(i, 4);
                    return;
                case 11:
                    nyu.b((nzf) obj);
                    return;
                default:
                    throw new IllegalArgumentException("Unknown type " + this.a);
            }
        } catch (Throwable e) {
            throw new IllegalStateException(e);
        }
        throw new IllegalStateException(e);
    }

    protected void c(Object obj, nyu nyu) {
        int length = Array.getLength(obj);
        for (int i = 0; i < length; i++) {
            Object obj2 = Array.get(obj, i);
            if (obj2 != null) {
                b(obj2, nyu);
            }
        }
    }

    int a(Object obj) {
        if (this.d) {
            return b(obj);
        }
        return c(obj);
    }

    protected int b(Object obj) {
        int i = 0;
        int length = Array.getLength(obj);
        for (int i2 = 0; i2 < length; i2++) {
            if (Array.get(obj, i2) != null) {
                i += c(Array.get(obj, i2));
            }
        }
        return i;
    }

    protected int c(Object obj) {
        int i = this.c >>> 3;
        switch (this.a) {
            case 10:
                return nyu.c(i, (nzf) obj);
            case 11:
                return nyu.d(i, (nzf) obj);
            default:
                throw new IllegalArgumentException("Unknown type " + this.a);
        }
    }
}
