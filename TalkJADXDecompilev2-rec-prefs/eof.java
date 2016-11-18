package p000;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;

final class eof implements ComponentCallbacks2 {
    final /* synthetic */ eod f11921a;

    eof(eod eod) {
        this.f11921a = eod;
    }

    public void onTrimMemory(int i) {
        iio.f17742a.m21893a(i);
        if (this.f11921a.f11918b != null && this.f11921a.f11918b.mo1511c()) {
            ami.m2901b(this.f11921a.f11917a).m2972a(i);
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
    }

    public void onLowMemory() {
        iio.f17742a.m21892a();
        if (this.f11921a.f11918b != null && this.f11921a.f11918b.mo1511c()) {
            ami.m2901b(this.f11921a.f11917a).m2971a();
        }
    }
}
