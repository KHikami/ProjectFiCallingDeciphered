import com.google.android.gms.common.api.GoogleApiActivity;

final class hee implements Runnable {
    final /* synthetic */ hed a;

    hee(hed hed) {
        this.a = hed;
    }

    public void run() {
        if (!this.a.a) {
            return;
        }
        if (this.a.c.a()) {
            this.a.f.startActivityForResult(GoogleApiActivity.a(this.a.e(), this.a.c.d(), this.a.d, false), 1);
        } else if (this.a.e.a(this.a.c.c())) {
            this.a.e.a(this.a.e(), this.a.f, this.a.c.c(), 2, this.a);
        } else if (this.a.c.c() == 18) {
            this.a.e.a(this.a.e().getApplicationContext(), new hef(this, gtp.a(this.a.e(), this.a)));
        } else {
            this.a.a(this.a.c, this.a.d);
        }
    }
}
