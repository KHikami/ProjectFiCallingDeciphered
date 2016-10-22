package com.google.android.libraries.componentview.services.internal;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.util.DisplayMetrics;
import android.util.Log;
import android.widget.ImageView;
import com.google.android.libraries.componentview.api.external.Readyable.ReadyInfo;
import com.google.android.libraries.componentview.inject.annotations.ExecutorType.UI;
import com.google.android.libraries.componentview.services.application.Fetcher;
import com.google.android.libraries.componentview.services.application.Fetcher.Response;
import java.util.concurrent.Executor;
import msx;
import mtt;
import oiu;

public class BasicImageLoader implements ImageLoader {
    final oiu<DisplayMetrics> a;
    private final Fetcher b;
    private final Executor c;
    private final Context d;

    class 1 implements msx<Response> {
        final /* synthetic */ String a;
        final /* synthetic */ mtt b;
        final /* synthetic */ ImageView c;
        final /* synthetic */ BasicImageLoader d;

        public void a(Response response) {
            if (response == null || !response.c) {
                String str = "BasicImageLoader";
                String str2 = "Fetch failed with no response for ";
                String valueOf = String.valueOf(this.a);
                Log.e(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
                this.b.a(new RuntimeException("Fetch failed with no response"));
                return;
            }
            BasicImageLoader basicImageLoader = this.d;
            byte[] bArr = response.b;
            ImageView imageView = this.c;
            float f = ((DisplayMetrics) basicImageLoader.a.a()).density;
            Options options = new Options();
            options.inDensity = 160;
            options.inTargetDensity = (int) (f * 160.0f);
            options.inScaled = true;
            imageView.setImageBitmap(BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options));
            imageView.requestLayout();
            this.b.b(new ReadyInfo());
        }

        public void a(Throwable th) {
            String str = "BasicImageLoader";
            String str2 = "Fetch failed for ";
            String valueOf = String.valueOf(this.a);
            Log.e(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2), th);
            this.b.a(new RuntimeException("Fetch failed"));
        }
    }

    public BasicImageLoader(Fetcher fetcher, @UI Executor executor, oiu<DisplayMetrics> oiu_android_util_DisplayMetrics, Context context) {
        this.b = fetcher;
        this.c = executor;
        this.a = oiu_android_util_DisplayMetrics;
        this.d = context;
    }
}
