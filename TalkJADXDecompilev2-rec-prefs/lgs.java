package p000;

import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

final class lgs<T> extends msv<T> implements mtk<T> {
    volatile mtk<?> f24980a;

    public /* synthetic */ int compareTo(Object obj) {
        return m29045a((Delayed) obj);
    }

    lgs(mti<T> mti_T, mtk<?> mtk_) {
        super(mti_T);
        this.f24980a = mtk_;
        mti_T.mo3706a(new lgt(this), gwb.aT());
    }

    public long getDelay(TimeUnit timeUnit) {
        return this.f24980a.getDelay(timeUnit);
    }

    private int m29045a(Delayed delayed) {
        return this.f24980a.compareTo(delayed);
    }

    void m29046a(mtk<?> mtk_) {
        this.f24980a = mtk_;
        if (isDone()) {
            mtk_.cancel(false);
        }
    }
}
