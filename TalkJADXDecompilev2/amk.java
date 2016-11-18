package defpackage;

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
    private final Handler a = new Handler(Looper.getMainLooper());
    private final amr b;
    private final azu c;
    private final azl d;
    private final apw e;
    private final ComponentCallbacks2 f;
    private final int g;

    public amk(Context context, amr amr, azu azu, azl azl, apw apw, ComponentCallbacks2 componentCallbacks2, int i) {
        super(context.getApplicationContext());
        this.b = amr;
        this.c = azu;
        this.d = azl;
        this.e = apw;
        this.f = componentCallbacks2;
        this.g = i;
    }

    public azl a() {
        return this.d;
    }

    public apw b() {
        return this.e;
    }

    public amr c() {
        return this.b;
    }

    public int d() {
        return this.g;
    }

    public void onTrimMemory(int i) {
        this.f.onTrimMemory(i);
    }

    public void onConfigurationChanged(Configuration configuration) {
        this.f.onConfigurationChanged(configuration);
    }

    public void onLowMemory() {
        this.f.onLowMemory();
    }

    public <X> azx<X> a(ImageView imageView, Class<X> cls) {
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
