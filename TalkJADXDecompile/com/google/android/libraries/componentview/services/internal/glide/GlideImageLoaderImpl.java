package com.google.android.libraries.componentview.services.internal.glide;

import ami;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.drawable.Drawable;
import anq;
import anv;
import aqm;
import azk;
import azx;
import com.google.android.libraries.componentview.api.external.ComponentViewErrorCode.Error;
import com.google.android.libraries.componentview.api.external.Readyable.ReadyInfo;
import com.google.android.libraries.componentview.inject.annotations.ExecutorType.BACKGROUND;
import com.google.android.libraries.componentview.internal.L;
import com.google.android.libraries.componentview.services.application.Fetcher;
import com.google.android.libraries.componentview.services.application.Logger;
import com.google.android.libraries.componentview.services.internal.ImageLoader;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.util.concurrent.ExecutorService;
import mtt;

public class GlideImageLoaderImpl implements ImageLoader {
    private final Fetcher a;
    private final ExecutorService b;
    private final Context c;
    private final Logger d;

    public class ImageListener implements azk<Drawable> {
        private final String a;
        private final mtt<ReadyInfo> b;
        private final Logger c;

        public /* bridge */ /* synthetic */ boolean a(Object obj, Object obj2, azx azx, anq anq, boolean z) {
            return a();
        }

        public boolean a(aqm aqm) {
            if (aqm != null) {
                String str = "GlideImageLoader";
                String str2 = "Glide load failed for ";
                String valueOf = String.valueOf(this.a);
                L.a(str, aqm, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2), Error.IMAGE_LOADING_ERROR, this.c, null);
                aqm.a("GlideImageLoader");
            }
            this.b.a(new RuntimeException("Glide load failed "));
            return true;
        }

        public boolean a() {
            this.b.b(new ReadyInfo());
            return false;
        }
    }

    class IncrementalKey implements anv {
        private static final Charset b;
        private static final byte[] c;
        private static int d;
        private final int e;

        static {
            b = Charset.forName("UTF-8");
            c = "ComponentView".getBytes(b);
            d = 0;
        }

        private IncrementalKey() {
            this.e = d;
            d++;
        }

        public int hashCode() {
            return this.e;
        }

        public void a(MessageDigest messageDigest) {
            messageDigest.update(c);
            messageDigest.update(new byte[]{(byte) this.e, (byte) (this.e >> 8), (byte) (this.e >> 16), this.e >> 24});
        }
    }

    public GlideImageLoaderImpl(Fetcher fetcher, @BACKGROUND ExecutorService executorService, Context context, Logger logger) {
        this.a = fetcher;
        this.b = executorService;
        this.d = logger;
        this.c = context.getApplicationContext();
        Context a = a(context);
        synchronized (ImageGlideModule.b) {
            if (ImageGlideModule.a) {
                return;
            }
            ami a2 = ami.a(a);
            if (a2 == null) {
                return;
            }
            new ImageGlideModule().a(a2.g());
        }
    }

    private static Context a(Context context) {
        Context context2 = context;
        while (context2 instanceof ContextWrapper) {
            context2 = ((ContextWrapper) context2).getBaseContext();
        }
        return context2.getApplicationContext();
    }
}
