package defpackage;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.os.AsyncTask;
import com.google.android.apps.hangouts.R$drawable;

/* renamed from: gjt */
final class gjt extends AsyncTask<Object, Void, Boolean> {
    final /* synthetic */ int a;
    final /* synthetic */ int b;
    final /* synthetic */ int c;
    final /* synthetic */ Resources d;
    final /* synthetic */ Options e;

    gjt(int i, int i2, int i3, Resources resources, Options options) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = resources;
        this.e = options;
    }

    protected /* synthetic */ Object doInBackground(Object[] objArr) {
        return a();
    }

    private Boolean a() {
        int i = 0;
        while (!gjs.b.b(this.a, this.b) && i < this.c) {
            if (gjs.a) {
                new StringBuilder(55).append("emoji prefill count=").append(i).append(" prefillSize=").append(this.c);
            }
            Bitmap decodeResource = BitmapFactory.decodeResource(this.d, R$drawable.emoji_u00a9, this.e);
            if (decodeResource != null) {
                gjs.b.a(decodeResource);
            }
            i++;
        }
        return Boolean.valueOf(true);
    }
}
