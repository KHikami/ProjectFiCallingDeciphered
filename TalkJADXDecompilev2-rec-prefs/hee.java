package p000;

import com.google.android.gms.common.api.GoogleApiActivity;

final class hee implements Runnable {
    final /* synthetic */ hed f16730a;

    hee(hed hed) {
        this.f16730a = hed;
    }

    public void run() {
        if (!this.f16730a.f16712a) {
            return;
        }
        if (this.f16730a.f16714c.m9652a()) {
            this.f16730a.f.startActivityForResult(GoogleApiActivity.m9657a(this.f16730a.m19453e(), this.f16730a.f16714c.m9655d(), this.f16730a.f16715d, false), 1);
        } else if (this.f16730a.f16716e.mo2338a(this.f16730a.f16714c.m9654c())) {
            this.f16730a.f16716e.m18563a(this.f16730a.m19453e(), this.f16730a.f, this.f16730a.f16714c.m9654c(), 2, this.f16730a);
        } else if (this.f16730a.f16714c.m9654c() == 18) {
            this.f16730a.f16716e.m18560a(this.f16730a.m19453e().getApplicationContext(), new hef(this, gtp.m18553a(this.f16730a.m19453e(), this.f16730a)));
        } else {
            this.f16730a.mo2475a(this.f16730a.f16714c, this.f16730a.f16715d);
        }
    }
}
