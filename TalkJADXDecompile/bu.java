import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;

final class bu implements Callback {
    final /* synthetic */ bt a;

    bu(bt btVar) {
        this.a = btVar;
    }

    public void invalidateDrawable(Drawable drawable) {
        this.a.invalidateSelf();
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        this.a.scheduleSelf(runnable, j);
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        this.a.unscheduleSelf(runnable);
    }
}
