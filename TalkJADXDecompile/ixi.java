import android.app.Activity;
import android.app.Application;
import java.util.concurrent.Future;

final class ixi implements iwh, iyk {
    final Application a;
    final ixb b;
    private final iwj c;

    ixi(Application application, izw izw) {
        this.a = application;
        this.c = iwj.a(application);
        this.b = new ixb(izw, ixe.b(application), ixd.a, Integer.MAX_VALUE);
    }

    public void c() {
        this.c.a((ivz) this);
    }

    public void d() {
    }

    public void a(Activity activity) {
        this.c.b(this);
        a();
    }

    private Future<?> a() {
        ixx ixx = ixx.c;
        return ixx.b().submit(new ixj(this));
    }
}
