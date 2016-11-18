package p000;

import android.os.Bundle;
import com.google.android.gms.common.data.DataHolder;
import java.util.Iterator;

public abstract class gux<T> implements guo, Iterable<T> {
    public final DataHolder f13937a;

    public abstract T mo2075a(int i);

    public int mo2074a() {
        return this.f13937a == null ? 0 : this.f13937a.m9684g();
    }

    public gux(DataHolder dataHolder) {
        this.f13937a = dataHolder;
        if (this.f13937a != null) {
            this.f13937a.m9676a((Object) this);
        }
    }

    @Deprecated
    public void m16153d() {
        mo2073b();
    }

    @Deprecated
    public boolean mo2076c() {
        return this.f13937a == null || this.f13937a.m9685h();
    }

    public Bundle m16154e() {
        return this.f13937a.m9683f();
    }

    public Iterator<T> iterator() {
        return new gvd(this);
    }

    public void mo2073b() {
        if (this.f13937a != null) {
            this.f13937a.close();
        }
    }

    public gux(DataHolder dataHolder, byte b) {
        this(dataHolder);
    }
}
