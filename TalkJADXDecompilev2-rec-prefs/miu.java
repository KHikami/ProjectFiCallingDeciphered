package p000;

import java.io.Serializable;
import java.util.Arrays;

final class miu<F, T> extends mms<F> implements Serializable {
    private static final long serialVersionUID = 0;
    final met<F, ? extends T> f27800a;
    final mms<T> f27801b;

    miu(met<F, ? extends T> met_F___extends_T, mms<T> mms_T) {
        this.f27800a = (met) bm.m6122a((Object) met_F___extends_T);
        this.f27801b = (mms) bm.m6122a((Object) mms_T);
    }

    public int compare(F f, F f2) {
        return this.f27801b.compare(this.f27800a.mo3772a(f), this.f27800a.mo3772a(f2));
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof miu)) {
            return false;
        }
        miu miu = (miu) obj;
        if (this.f27800a.equals(miu.f27800a) && this.f27801b.equals(miu.f27801b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f27800a, this.f27801b});
    }

    public String toString() {
        String valueOf = String.valueOf(this.f27801b);
        String valueOf2 = String.valueOf(this.f27800a);
        return new StringBuilder((String.valueOf(valueOf).length() + 13) + String.valueOf(valueOf2).length()).append(valueOf).append(".onResultOf(").append(valueOf2).append(")").toString();
    }
}
