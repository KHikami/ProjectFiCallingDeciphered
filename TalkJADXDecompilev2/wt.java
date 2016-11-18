package defpackage;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;

public final class wt<T> {
    T[] a;
    private T[] b;
    private int c;
    private int d;
    private int e;
    private wv f;
    private wu g;
    private int h;
    private final Class<T> i;

    public wt(Class<T> cls, wv<T> wvVar) {
        this(cls, wvVar, 10);
    }

    private wt(Class<T> cls, wv<T> wvVar, int i) {
        this.i = cls;
        this.a = (Object[]) Array.newInstance(cls, 10);
        this.f = wvVar;
        this.h = 0;
    }

    public int a() {
        return this.h;
    }

    public int a(T t) {
        d();
        return a((Object) t, true);
    }

    private void a(T[] tArr, boolean z) {
        int i = 1;
        d();
        if (tArr.length != 0) {
            int i2 = !(this.f instanceof wu) ? 1 : 0;
            if (i2 != 0) {
                b();
            }
            this.b = this.a;
            this.c = 0;
            this.d = this.h;
            Arrays.sort(tArr, this.f);
            if (tArr.length == 0) {
                throw new IllegalArgumentException("Input array must be non-empty");
            }
            int i3 = 1;
            int i4 = 0;
            while (i < tArr.length) {
                Object obj = tArr[i];
                int compare = this.f.compare(tArr[i4], obj);
                if (compare > 0) {
                    throw new IllegalArgumentException("Input must be sorted in ascending order.");
                }
                if (compare == 0) {
                    compare = a(obj, tArr, i4, i3);
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
            if (this.h == 0) {
                this.a = tArr;
                this.h = i3;
                this.e = i3;
                this.f.a(0, i3);
            } else {
                a((Object[]) tArr, i3);
            }
            this.b = null;
            if (i2 != 0) {
                c();
            }
        }
    }

    public void a(Collection<T> collection) {
        a(collection.toArray((Object[]) Array.newInstance(this.i, collection.size())), true);
    }

    private int a(T t, T[] tArr, int i, int i2) {
        for (int i3 = i; i3 < i2; i3++) {
            if (this.f.b(tArr[i3], t)) {
                return i3;
            }
        }
        return -1;
    }

    private void a(T[] tArr, int i) {
        this.a = (Object[]) Array.newInstance(this.i, (this.h + i) + 10);
        this.e = 0;
        int i2 = 0;
        while (true) {
            if (this.c >= this.d && i2 >= i) {
                return;
            }
            if (this.c == this.d) {
                int i3 = i - i2;
                System.arraycopy(tArr, i2, this.a, this.e, i3);
                this.e += i3;
                this.h += i3;
                this.f.a(this.e - i3, i3);
                return;
            } else if (i2 == i) {
                i2 = this.d - this.c;
                System.arraycopy(this.b, this.c, this.a, this.e, i2);
                this.e = i2 + this.e;
                return;
            } else {
                Object obj = this.b[this.c];
                Object obj2 = tArr[i2];
                int compare = this.f.compare(obj, obj2);
                if (compare > 0) {
                    Object[] objArr = this.a;
                    compare = this.e;
                    this.e = compare + 1;
                    objArr[compare] = obj2;
                    this.h++;
                    i2++;
                    this.f.a(this.e - 1, 1);
                } else if (compare == 0 && this.f.b(obj, obj2)) {
                    Object[] objArr2 = this.a;
                    int i4 = this.e;
                    this.e = i4 + 1;
                    objArr2[i4] = obj2;
                    i2++;
                    this.c++;
                    if (!this.f.a(obj, obj2)) {
                        this.f.d(this.e - 1, 1);
                    }
                } else {
                    Object[] objArr3 = this.a;
                    compare = this.e;
                    this.e = compare + 1;
                    objArr3[compare] = obj;
                    this.c++;
                }
            }
        }
    }

    private void d() {
        if (this.b != null) {
            throw new IllegalStateException("Cannot call this method from within addAll");
        }
    }

    public void b() {
        d();
        if (!(this.f instanceof wu)) {
            if (this.g == null) {
                this.g = new wu(this.f);
            }
            this.f = this.g;
        }
    }

    public void c() {
        d();
        if (this.f instanceof wu) {
            ((wu) this.f).a();
        }
        if (this.f == this.g) {
            this.f = this.g.a;
        }
    }

    private int a(T t, boolean z) {
        int i;
        int a = a(t, this.a, 0, this.h, 1);
        if (a == -1) {
            i = 0;
        } else {
            if (a < this.h) {
                Object obj = this.a[a];
                if (this.f.b(obj, t)) {
                    if (this.f.a(obj, t)) {
                        this.a[a] = t;
                        return a;
                    }
                    this.a[a] = t;
                    this.f.d(a, 1);
                    return a;
                }
            }
            i = a;
        }
        if (i > this.h) {
            throw new IndexOutOfBoundsException("cannot add item to " + i + " because size is " + this.h);
        }
        if (this.h == this.a.length) {
            Object[] objArr = (Object[]) Array.newInstance(this.i, this.a.length + 10);
            System.arraycopy(this.a, 0, objArr, 0, i);
            objArr[i] = t;
            System.arraycopy(this.a, i, objArr, i + 1, this.h - i);
            this.a = objArr;
        } else {
            System.arraycopy(this.a, i, this.a, i + 1, this.h - i);
            this.a[i] = t;
        }
        this.h++;
        if (z) {
            this.f.a(i, 1);
        }
        return i;
    }

    public boolean b(T t) {
        d();
        int a = a(t, this.a, 0, this.h, 2);
        if (a == -1) {
            return false;
        }
        a(a, true);
        return true;
    }

    private void a(int i, boolean z) {
        System.arraycopy(this.a, i + 1, this.a, i, (this.h - i) - 1);
        this.h--;
        this.a[this.h] = null;
        if (z) {
            this.f.b(i, 1);
        }
    }

    public void a(int i, T t) {
        d();
        T a = a(i);
        boolean z = a == t || !this.f.a(a, t);
        if (a == t || this.f.compare(a, t) != 0) {
            if (z) {
                this.f.d(i, 1);
            }
            a(i, false);
            int a2 = a((Object) t, false);
            if (i != a2) {
                this.f.c(i, a2);
                return;
            }
            return;
        }
        this.a[i] = t;
        if (z) {
            this.f.d(i, 1);
        }
    }

    public T a(int i) {
        if (i >= this.h || i < 0) {
            throw new IndexOutOfBoundsException("Asked to get item at " + i + " but size is " + this.h);
        } else if (this.b == null || i < this.e) {
            return this.a[i];
        } else {
            return this.b[(i - this.e) + this.c];
        }
    }

    public int c(T t) {
        if (this.b != null) {
            int a = a(t, this.a, 0, this.e, 4);
            if (a != -1) {
                return a;
            }
            a = a(t, this.b, this.c, this.d, 4);
            return a != -1 ? (a - this.c) + this.e : -1;
        } else {
            return a(t, this.a, 0, this.h, 4);
        }
    }

    private int a(T t, T[] tArr, int i, int i2, int i3) {
        int i4 = i;
        while (i4 < i2) {
            int i5 = (i4 + i2) / 2;
            Object obj = tArr[i5];
            int compare = this.f.compare(obj, t);
            if (compare < 0) {
                i4 = i5 + 1;
            } else if (compare != 0) {
                i2 = i5;
            } else if (this.f.b(obj, t)) {
                return i5;
            } else {
                int i6 = i5 - 1;
                while (i6 >= i4) {
                    Object obj2 = this.a[i6];
                    if (this.f.compare(obj2, t) != 0) {
                        break;
                    } else if (this.f.b(obj2, t)) {
                        i4 = i6;
                        break;
                    } else {
                        i6--;
                    }
                }
                i4 = i5 + 1;
                while (i4 < i2) {
                    obj = this.a[i4];
                    if (this.f.compare(obj, t) == 0) {
                        if (this.f.b(obj, t)) {
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
