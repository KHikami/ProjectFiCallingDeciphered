package p000;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;

public final class wt<T> {
    T[] f35609a;
    private T[] f35610b;
    private int f35611c;
    private int f35612d;
    private int f35613e;
    private wv f35614f;
    private wu f35615g;
    private int f35616h;
    private final Class<T> f35617i;

    public wt(Class<T> cls, wv<T> wvVar) {
        this(cls, wvVar, 10);
    }

    private wt(Class<T> cls, wv<T> wvVar, int i) {
        this.f35617i = cls;
        this.f35609a = (Object[]) Array.newInstance(cls, 10);
        this.f35614f = wvVar;
        this.f35616h = 0;
    }

    public int m41223a() {
        return this.f35616h;
    }

    public int m41224a(T t) {
        m41222d();
        return m41216a((Object) t, true);
    }

    private void m41221a(T[] tArr, boolean z) {
        int i = 1;
        m41222d();
        if (tArr.length != 0) {
            int i2 = !(this.f35614f instanceof wu) ? 1 : 0;
            if (i2 != 0) {
                m41228b();
            }
            this.f35610b = this.f35609a;
            this.f35611c = 0;
            this.f35612d = this.f35616h;
            Arrays.sort(tArr, this.f35614f);
            if (tArr.length == 0) {
                throw new IllegalArgumentException("Input array must be non-empty");
            }
            int i3 = 1;
            int i4 = 0;
            while (i < tArr.length) {
                Object obj = tArr[i];
                int compare = this.f35614f.compare(tArr[i4], obj);
                if (compare > 0) {
                    throw new IllegalArgumentException("Input must be sorted in ascending order.");
                }
                if (compare == 0) {
                    compare = m41217a(obj, tArr, i4, i3);
                    if (compare != -1) {
                        tArr[compare] = obj;
                    } else {
                        if (i3 != i) {
                            tArr[i3] = obj;
                        }
                        i3++;
                    }
                } else {
                    if (i3 != i) {
                        tArr[i3] = obj;
                    }
                    i4 = i3;
                    i3++;
                }
                i++;
            }
            if (this.f35616h == 0) {
                this.f35609a = tArr;
                this.f35616h = i3;
                this.f35613e = i3;
                this.f35614f.mo4501a(0, i3);
            } else {
                m41220a((Object[]) tArr, i3);
            }
            this.f35610b = null;
            if (i2 != 0) {
                m41231c();
            }
        }
    }

    public void m41227a(Collection<T> collection) {
        m41221a(collection.toArray((Object[]) Array.newInstance(this.f35617i, collection.size())), true);
    }

    private int m41217a(T t, T[] tArr, int i, int i2) {
        for (int i3 = i; i3 < i2; i3++) {
            if (this.f35614f.mo4506b(tArr[i3], t)) {
                return i3;
            }
        }
        return -1;
    }

    private void m41220a(T[] tArr, int i) {
        this.f35609a = (Object[]) Array.newInstance(this.f35617i, (this.f35616h + i) + 10);
        this.f35613e = 0;
        int i2 = 0;
        while (true) {
            if (this.f35611c >= this.f35612d && i2 >= i) {
                return;
            }
            if (this.f35611c == this.f35612d) {
                int i3 = i - i2;
                System.arraycopy(tArr, i2, this.f35609a, this.f35613e, i3);
                this.f35613e += i3;
                this.f35616h += i3;
                this.f35614f.mo4501a(this.f35613e - i3, i3);
                return;
            } else if (i2 == i) {
                i2 = this.f35612d - this.f35611c;
                System.arraycopy(this.f35610b, this.f35611c, this.f35609a, this.f35613e, i2);
                this.f35613e = i2 + this.f35613e;
                return;
            } else {
                Object obj = this.f35610b[this.f35611c];
                Object obj2 = tArr[i2];
                int compare = this.f35614f.compare(obj, obj2);
                if (compare > 0) {
                    Object[] objArr = this.f35609a;
                    compare = this.f35613e;
                    this.f35613e = compare + 1;
                    objArr[compare] = obj2;
                    this.f35616h++;
                    i2++;
                    this.f35614f.mo4501a(this.f35613e - 1, 1);
                } else if (compare == 0 && this.f35614f.mo4506b(obj, obj2)) {
                    Object[] objArr2 = this.f35609a;
                    int i4 = this.f35613e;
                    this.f35613e = i4 + 1;
                    objArr2[i4] = obj2;
                    i2++;
                    this.f35611c++;
                    if (!this.f35614f.mo4505a(obj, obj2)) {
                        this.f35614f.mo4508d(this.f35613e - 1, 1);
                    }
                } else {
                    Object[] objArr3 = this.f35609a;
                    compare = this.f35613e;
                    this.f35613e = compare + 1;
                    objArr3[compare] = obj;
                    this.f35611c++;
                }
            }
        }
    }

    private void m41222d() {
        if (this.f35610b != null) {
            throw new IllegalStateException("Cannot call this method from within addAll");
        }
    }

    public void m41228b() {
        m41222d();
        if (!(this.f35614f instanceof wu)) {
            if (this.f35615g == null) {
                this.f35615g = new wu(this.f35614f);
            }
            this.f35614f = this.f35615g;
        }
    }

    public void m41231c() {
        m41222d();
        if (this.f35614f instanceof wu) {
            ((wu) this.f35614f).m41236a();
        }
        if (this.f35614f == this.f35615g) {
            this.f35614f = this.f35615g.f35618a;
        }
    }

    private int m41216a(T t, boolean z) {
        int i;
        int a = m41218a(t, this.f35609a, 0, this.f35616h, 1);
        if (a == -1) {
            i = 0;
        } else {
            if (a < this.f35616h) {
                Object obj = this.f35609a[a];
                if (this.f35614f.mo4506b(obj, t)) {
                    if (this.f35614f.mo4505a(obj, t)) {
                        this.f35609a[a] = t;
                        return a;
                    }
                    this.f35609a[a] = t;
                    this.f35614f.mo4508d(a, 1);
                    return a;
                }
            }
            i = a;
        }
        if (i > this.f35616h) {
            throw new IndexOutOfBoundsException("cannot add item to " + i + " because size is " + this.f35616h);
        }
        if (this.f35616h == this.f35609a.length) {
            Object[] objArr = (Object[]) Array.newInstance(this.f35617i, this.f35609a.length + 10);
            System.arraycopy(this.f35609a, 0, objArr, 0, i);
            objArr[i] = t;
            System.arraycopy(this.f35609a, i, objArr, i + 1, this.f35616h - i);
            this.f35609a = objArr;
        } else {
            System.arraycopy(this.f35609a, i, this.f35609a, i + 1, this.f35616h - i);
            this.f35609a[i] = t;
        }
        this.f35616h++;
        if (z) {
            this.f35614f.mo4501a(i, 1);
        }
        return i;
    }

    public boolean m41229b(T t) {
        m41222d();
        int a = m41218a(t, this.f35609a, 0, this.f35616h, 2);
        if (a == -1) {
            return false;
        }
        m41219a(a, true);
        return true;
    }

    private void m41219a(int i, boolean z) {
        System.arraycopy(this.f35609a, i + 1, this.f35609a, i, (this.f35616h - i) - 1);
        this.f35616h--;
        this.f35609a[this.f35616h] = null;
        if (z) {
            this.f35614f.mo4503b(i, 1);
        }
    }

    public void m41226a(int i, T t) {
        m41222d();
        T a = m41225a(i);
        boolean z = a == t || !this.f35614f.mo4505a(a, t);
        if (a == t || this.f35614f.compare(a, t) != 0) {
            if (z) {
                this.f35614f.mo4508d(i, 1);
            }
            m41219a(i, false);
            int a2 = m41216a((Object) t, false);
            if (i != a2) {
                this.f35614f.mo4504c(i, a2);
                return;
            }
            return;
        }
        this.f35609a[i] = t;
        if (z) {
            this.f35614f.mo4508d(i, 1);
        }
    }

    public T m41225a(int i) {
        if (i >= this.f35616h || i < 0) {
            throw new IndexOutOfBoundsException("Asked to get item at " + i + " but size is " + this.f35616h);
        } else if (this.f35610b == null || i < this.f35613e) {
            return this.f35609a[i];
        } else {
            return this.f35610b[(i - this.f35613e) + this.f35611c];
        }
    }

    public int m41230c(T t) {
        if (this.f35610b != null) {
            int a = m41218a(t, this.f35609a, 0, this.f35613e, 4);
            if (a != -1) {
                return a;
            }
            a = m41218a(t, this.f35610b, this.f35611c, this.f35612d, 4);
            return a != -1 ? (a - this.f35611c) + this.f35613e : -1;
        } else {
            return m41218a(t, this.f35609a, 0, this.f35616h, 4);
        }
    }

    private int m41218a(T t, T[] tArr, int i, int i2, int i3) {
        int i4 = i;
        while (i4 < i2) {
            int i5 = (i4 + i2) / 2;
            Object obj = tArr[i5];
            int compare = this.f35614f.compare(obj, t);
            if (compare < 0) {
                i4 = i5 + 1;
            } else if (compare != 0) {
                i2 = i5;
            } else if (this.f35614f.mo4506b(obj, t)) {
                return i5;
            } else {
                int i6 = i5 - 1;
                while (i6 >= i4) {
                    Object obj2 = this.f35609a[i6];
                    if (this.f35614f.compare(obj2, t) != 0) {
                        break;
                    } else if (this.f35614f.mo4506b(obj2, t)) {
                        i4 = i6;
                        break;
                    } else {
                        i6--;
                    }
                }
                i4 = i5 + 1;
                while (i4 < i2) {
                    obj = this.f35609a[i4];
                    if (this.f35614f.compare(obj, t) == 0) {
                        if (this.f35614f.mo4506b(obj, t)) {
                            break;
                        }
                        i4++;
                    } else {
                        break;
                    }
                }
                i4 = -1;
                if (i3 != 1) {
                    return i4;
                }
                if (i4 != -1) {
                    return i4;
                }
                return i5;
            }
        }
        return i3 == 1 ? i4 : -1;
    }
}
