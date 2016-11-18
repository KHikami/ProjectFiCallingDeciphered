package p000;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class nyy<M extends nyx<M>, T> {
    public final int f31293a;
    public final Class<T> f31294b;
    public final int f31295c;
    public final boolean f31296d;

    public static <M extends nyx<M>, T extends nzf> nyy<M, T> m37203a(int i, Class<T> cls, long j) {
        return new nyy(11, cls, (int) j, false);
    }

    public static <M extends nyx<M>, T> nyy<M, T> m37204b(int i, Class<T> cls, long j) {
        return new nyz(i, cls, (int) j, false, 0, 0);
    }

    nyy(int i, Class<T> cls, int i2, boolean z) {
        this.f31293a = i;
        this.f31294b = cls;
        this.f31295c = i2;
        this.f31296d = z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nyy)) {
            return false;
        }
        nyy nyy = (nyy) obj;
        if (this.f31293a == nyy.f31293a && this.f31294b == nyy.f31294b && this.f31295c == nyy.f31295c && this.f31296d == nyy.f31296d) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.f31296d ? 1 : 0) + ((((((this.f31293a + 1147) * 31) + this.f31294b.hashCode()) * 31) + this.f31295c) * 31);
    }

    final T m37206a(List<nzj> list) {
        int i = 0;
        if (list == null) {
            return null;
        }
        T t;
        nzj nzj;
        if (this.f31296d) {
            List arrayList = new ArrayList();
            for (int i2 = 0; i2 < list.size(); i2++) {
                nzj = (nzj) list.get(i2);
                if (nzj.f31319b.length != 0) {
                    mo4078a(nzj, arrayList);
                }
            }
            int size = arrayList.size();
            if (size == 0) {
                t = null;
            } else {
                T cast = this.f31294b.cast(Array.newInstance(this.f31294b.getComponentType(), size));
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
            Class cls = this.f31294b;
            byte[] bArr = nzj.f31319b;
            t = cls.cast(mo4077a(nyt.m37092a(bArr, 0, bArr.length)));
        }
        return t;
    }

    protected Object mo4077a(nyt nyt) {
        String valueOf;
        Class componentType = this.f31296d ? this.f31294b.getComponentType() : this.f31294b;
        try {
            nzf nzf;
            switch (this.f31293a) {
                case 10:
                    nzf = (nzf) componentType.newInstance();
                    nyt.m37102a(nzf, this.f31295c >>> 3);
                    return nzf;
                case 11:
                    nzf = (nzf) componentType.newInstance();
                    nyt.m37101a(nzf);
                    return nzf;
                default:
                    throw new IllegalArgumentException("Unknown type " + this.f31293a);
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

    protected void mo4078a(nzj nzj, List<Object> list) {
        byte[] bArr = nzj.f31319b;
        list.add(mo4077a(nyt.m37092a(bArr, 0, bArr.length)));
    }

    void m37208a(Object obj, nyu nyu) {
        if (this.f31296d) {
            mo4082c(obj, nyu);
        } else {
            mo4080b(obj, nyu);
        }
    }

    protected void mo4080b(Object obj, nyu nyu) {
        try {
            nyu.m37198i(this.f31295c);
            switch (this.f31293a) {
                case 10:
                    int i = this.f31295c >>> 3;
                    nyu.m37176a((nzf) obj);
                    nyu.m37199i(i, 4);
                    return;
                case 11:
                    nyu.m37184b((nzf) obj);
                    return;
                default:
                    throw new IllegalArgumentException("Unknown type " + this.f31293a);
            }
        } catch (Throwable e) {
            throw new IllegalStateException(e);
        }
        throw new IllegalStateException(e);
    }

    protected void mo4082c(Object obj, nyu nyu) {
        int length = Array.getLength(obj);
        for (int i = 0; i < length; i++) {
            Object obj2 = Array.get(obj, i);
            if (obj2 != null) {
                mo4080b(obj2, nyu);
            }
        }
    }

    int m37205a(Object obj) {
        if (this.f31296d) {
            return mo4079b(obj);
        }
        return mo4081c(obj);
    }

    protected int mo4079b(Object obj) {
        int i = 0;
        int length = Array.getLength(obj);
        for (int i2 = 0; i2 < length; i2++) {
            if (Array.get(obj, i2) != null) {
                i += mo4081c(Array.get(obj, i2));
            }
        }
        return i;
    }

    protected int mo4081c(Object obj) {
        int i = this.f31295c >>> 3;
        switch (this.f31293a) {
            case 10:
                return nyu.m37144c(i, (nzf) obj);
            case 11:
                return nyu.m37145d(i, (nzf) obj);
            default:
                throw new IllegalArgumentException("Unknown type " + this.f31293a);
        }
    }
}
