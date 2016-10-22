package defpackage;

import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

/* renamed from: lgs */
final class lgs<T> extends msv<T> implements mtk<T> {
    volatile mtk<?> a;

    public /* synthetic */ int compareTo(Object obj) {
        return a((Delayed) obj);
    }

    lgs(mti<T> mti_T, mtk<?> mtk_) {
        super(mti_T);
        this.a = mtk_;
        mti_T.a(new lgt(this), gwb.aT());
    }

    public long getDelay(TimeUnit timeUnit) {
        return this.a.getDelay(timeUnit);
    }

    private int a(Delayed delayed) {
        return this.a.compareTo(delayed);
    }

    void a(mtk<?> mtk_) {
        this.a = mtk_;
        if (isDone()) {
            mtk_.cancel(false);
        }
    }
}
