import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import java.lang.ref.WeakReference;

final class gjv extends BitmapDrawable {
    final /* synthetic */ gjs a;
    private final WeakReference<gjw> b;

    public gjv(gjs gjs, Resources resources, Bitmap bitmap, gjw gjw) {
        this.a = gjs;
        super(resources, null);
        this.b = new WeakReference(gjw);
    }

    public gjw a() {
        return (gjw) this.b.get();
    }
}
