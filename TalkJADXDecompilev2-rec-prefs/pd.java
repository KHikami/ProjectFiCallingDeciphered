package p000;

import android.view.View;
import com.android.ex.photo.PhotoViewPager;

public class pd {
    public final /* synthetic */ PhotoViewPager f34984a;

    public void m40251a(View view, float f) {
        if (f < 0.0f || f >= 1.0f) {
            view.setTranslationX(0.0f);
            view.setAlpha(1.0f);
            view.setScaleX(1.0f);
            view.setScaleY(1.0f);
            return;
        }
        view.setTranslationX((-f) * ((float) view.getWidth()));
        view.setAlpha(Math.max(0.0f, 1.0f - f));
        float max = Math.max(0.0f, 1.0f - (0.3f * f));
        view.setScaleX(max);
        view.setScaleY(max);
    }

    public pd(PhotoViewPager photoViewPager) {
        this.f34984a = photoViewPager;
    }
}
