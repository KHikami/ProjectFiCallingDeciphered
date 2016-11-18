package p000;

import android.app.Activity;
import android.graphics.Bitmap;
import java.util.concurrent.Callable;

public final class haf implements Callable<Bitmap> {
    final /* synthetic */ Activity f16468a;

    public haf(Activity activity) {
        this.f16468a = activity;
    }

    private Bitmap m19090a() {
        return gwb.m2192f(this.f16468a);
    }

    public /* synthetic */ Object call() {
        return m19090a();
    }
}
