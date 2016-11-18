package p000;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.widget.ImageView;

public final class amk extends ContextWrapper implements ComponentCallbacks2 {
    private final Handler f1305a = new Handler(Looper.getMainLooper());
    private final amr f1306b;
    private final azu f1307c;
    private final azl f1308d;
    private final apw f1309e;
    private final ComponentCallbacks2 f1310f;
    private final int f1311g;

    public amk(Context context, amr amr, azu azu, azl azl, apw apw, ComponentCallbacks2 componentCallbacks2, int i) {
        super(context.getApplicationContext());
        this.f1306b = amr;
        this.f1307c = azu;
        this.f1308d = azl;
        this.f1309e = apw;
        this.f1310f = componentCallbacks2;
        this.f1311g = i;
    }

    public azl m2914a() {
        return this.f1308d;
    }

    public apw m2916b() {
        return this.f1309e;
    }

    public amr m2917c() {
        return this.f1306b;
    }

    public int m2918d() {
        return this.f1311g;
    }

    public void onTrimMemory(int i) {
        this.f1310f.onTrimMemory(i);
    }

    public void onConfigurationChanged(Configuration configuration) {
        this.f1310f.onConfigurationChanged(configuration);
    }

    public void onLowMemory() {
        this.f1310f.onLowMemory();
    }

    public <X> azx<X> m2915a(ImageView imageView, Class<X> cls) {
        if (Bitmap.class.equals(cls)) {
            return new azr(imageView);
        }
        if (Drawable.class.isAssignableFrom(cls)) {
            return new azs(imageView);
        }
        String valueOf = String.valueOf(cls);
        throw new IllegalArgumentException(new StringBuilder(String.valueOf(valueOf).length() + 64).append("Unhandled class: ").append(valueOf).append(", try .as*(Class).transcode(ResourceTranscoder)").toString());
    }
}
