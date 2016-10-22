import android.util.Base64;

final class dgr implements Runnable {
    final /* synthetic */ String a;
    final /* synthetic */ dgg b;

    dgr(dgg dgg, String str) {
        this.b = dgg;
        this.a = str;
    }

    public void run() {
        inx.a().a(Base64.decode(this.a, 0));
    }
}
