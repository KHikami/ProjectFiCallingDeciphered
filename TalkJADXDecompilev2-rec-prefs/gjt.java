package p000;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.os.AsyncTask;
import com.google.android.apps.hangouts.R$drawable;

final class gjt extends AsyncTask<Object, Void, Boolean> {
    final /* synthetic */ int f15453a;
    final /* synthetic */ int f15454b;
    final /* synthetic */ int f15455c;
    final /* synthetic */ Resources f15456d;
    final /* synthetic */ Options f15457e;

    gjt(int i, int i2, int i3, Resources resources, Options options) {
        this.f15453a = i;
        this.f15454b = i2;
        this.f15455c = i3;
        this.f15456d = resources;
        this.f15457e = options;
    }

    protected /* synthetic */ Object doInBackground(Object[] objArr) {
        return m17858a();
    }

    private Boolean m17858a() {
        int i = 0;
        while (!gjs.f15440b.mo2289b(this.f15453a, this.f15454b) && i < this.f15455c) {
            if (gjs.f15439a) {
                new StringBuilder(55).append("emoji prefill count=").append(i).append(" prefillSize=").append(this.f15455c);
            }
            Bitmap decodeResource = BitmapFactory.decodeResource(this.f15456d, R$drawable.emoji_u00a9, this.f15457e);
            if (decodeResource != null) {
                gjs.f15440b.mo2288a(decodeResource);
            }
            i++;
        }
        return Boolean.valueOf(true);
    }
}
