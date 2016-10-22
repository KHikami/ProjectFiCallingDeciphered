import android.content.ComponentCallbacks2;
import android.content.res.Configuration;

final class eof implements ComponentCallbacks2 {
    final /* synthetic */ eod a;

    eof(eod eod) {
        this.a = eod;
    }

    public void onTrimMemory(int i) {
        iio.a.a(i);
        if (this.a.b != null && this.a.b.c()) {
            ami.b(this.a.a).a(i);
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
    }

    public void onLowMemory() {
        iio.a.a();
        if (this.a.b != null && this.a.b.c()) {
            ami.b(this.a.a).a();
        }
    }
}
