import android.os.IBinder;
import android.os.IInterface;

public final class gvl<T extends IInterface> extends gwg<T> {
    private final a e;

    protected T a(IBinder iBinder) {
        return this.e.h();
    }

    protected String g() {
        return this.e.f();
    }

    protected String h() {
        return this.e.g();
    }

    public a i() {
        return this.e;
    }
}
