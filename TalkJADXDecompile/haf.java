import android.app.Activity;
import android.graphics.Bitmap;
import java.util.concurrent.Callable;

public final class haf implements Callable<Bitmap> {
    final /* synthetic */ Activity a;

    public haf(Activity activity) {
        this.a = activity;
    }

    private Bitmap a() {
        return gwb.f(this.a);
    }

    public /* synthetic */ Object call() {
        return a();
    }
}
