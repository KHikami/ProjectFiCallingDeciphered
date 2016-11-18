package p000;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;

final class bu implements Callback {
    final /* synthetic */ bt f4462a;

    bu(bt btVar) {
        this.f4462a = btVar;
    }

    public void invalidateDrawable(Drawable drawable) {
        this.f4462a.invalidateSelf();
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        this.f4462a.scheduleSelf(runnable, j);
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        this.f4462a.unscheduleSelf(runnable);
    }
}
