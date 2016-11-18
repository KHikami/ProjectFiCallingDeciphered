package defpackage;

import java.io.Serializable;
import java.util.Arrays;

final class miu<F, T> extends mms<F> implements Serializable {
    private static final long serialVersionUID = 0;
    final met<F, ? extends T> a;
    final mms<T> b;

    miu(met<F, ? extends T> met_F___extends_T, mms<T> mms_T) {
        this.a = (met) bm.a((Object) met_F___extends_T);
        this.b = (mms) bm.a((Object) mms_T);
    }

    public int compare(F f, F f2) {
        return this.b.compare(this.a.a(f), this.a.a(f2));
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof miu)) {
            return false;
        }
        miu miu = (miu) obj;
        if (this.a.equals(miu.a) && this.b.equals(miu.b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public String toString() {
        String valueOf = String.valueOf(this.b);
        String valueOf2 = String.valueOf(this.a);
        return new StringBuilder((String.valueOf(valueOf).length() + 13) + String.valueOf(valueOf2).length()).append(valueOf).append(".onResultOf(").append(valueOf2).append(")").toString();
    }
}
