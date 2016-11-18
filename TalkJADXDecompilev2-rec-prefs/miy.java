package p000;

import java.util.Comparator;

final class miy extends mix {
    miy() {
        super();
    }

    public <T> mix mo3803a(T t, T t2, Comparator<T> comparator) {
        return miy.m32237a(comparator.compare(t, t2));
    }

    public mix mo3802a(long j, long j2) {
        return miy.m32237a(mrw.m32811a(j, j2));
    }

    public mix mo3801a(float f, float f2) {
        return miy.m32237a(Float.compare(f, f2));
    }

    public mix mo3804a(boolean z, boolean z2) {
        return miy.m32237a(gwb.m1515a(z2, z));
    }

    public mix mo3805b(boolean z, boolean z2) {
        return miy.m32237a(gwb.m1515a(z, z2));
    }

    private static mix m32237a(int i) {
        if (i < 0) {
            return mix.f27805b;
        }
        if (i > 0) {
            return mix.f27806c;
        }
        return mix.f27804a;
    }

    public int mo3800a() {
        return 0;
    }
}
