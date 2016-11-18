package p000;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import java.lang.ref.WeakReference;

final class gjv extends BitmapDrawable {
    final /* synthetic */ gjs f15459a;
    private final WeakReference<gjw> f15460b;

    public gjv(gjs gjs, Resources resources, Bitmap bitmap, gjw gjw) {
        this.f15459a = gjs;
        super(resources, null);
        this.f15460b = new WeakReference(gjw);
    }

    public gjw m17859a() {
        return (gjw) this.f15460b.get();
    }
}
