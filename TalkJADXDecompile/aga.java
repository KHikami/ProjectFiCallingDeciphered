import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import java.lang.ref.WeakReference;

public final class aga extends Resources {
    private final WeakReference<Context> a;

    public aga(Context context, Resources resources) {
        super(resources.getAssets(), resources.getDisplayMetrics(), resources.getConfiguration());
        this.a = new WeakReference(context);
    }

    public Drawable getDrawable(int i) {
        Context context = (Context) this.a.get();
        if (context != null) {
            return aai.a().a(context, this, i);
        }
        return super.getDrawable(i);
    }

    final Drawable a(int i) {
        return super.getDrawable(i);
    }

    public static boolean a() {
        return us.b && VERSION.SDK_INT <= 20;
    }
}
