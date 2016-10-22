import android.os.Bundle;
import com.google.android.gms.common.data.DataHolder;
import java.util.Iterator;

public abstract class gux<T> implements guo, Iterable<T> {
    public final DataHolder a;

    public abstract T a(int i);

    public int a() {
        return this.a == null ? 0 : this.a.g();
    }

    public gux(DataHolder dataHolder) {
        this.a = dataHolder;
        if (this.a != null) {
            this.a.a((Object) this);
        }
    }

    @Deprecated
    public void d() {
        b();
    }

    @Deprecated
    public boolean c() {
        return this.a == null || this.a.h();
    }

    public Bundle e() {
        return this.a.f();
    }

    public Iterator<T> iterator() {
        return new gvd(this);
    }

    public void b() {
        if (this.a != null) {
            this.a.close();
        }
    }

    public gux(DataHolder dataHolder, byte b) {
        this(dataHolder);
    }
}
