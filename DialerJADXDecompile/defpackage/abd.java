package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.widget.ImageView;
import junit.framework.Assert;

/* compiled from: PG */
/* renamed from: abd */
final class abd extends abb {
    abd() {
    }

    public static Drawable a(Resources resources, abc abc) {
        Drawable ade = new ade(resources);
        if (abc != null) {
            if (TextUtils.isEmpty(abc.f)) {
                ade.a(null, abc.e);
            } else {
                ade.a(abc.e, abc.f);
            }
            ade.a = abc.g;
            ade.b = abc.h;
            float f = abc.i;
            boolean z = f >= -0.5f && f <= 0.5f;
            Assert.assertTrue(z);
            ade.c = f;
            ade.d = abc.j;
        }
        return ade;
    }

    public final void a(ImageView imageView, abc abc) {
        imageView.setImageDrawable(abd.a(imageView.getResources(), abc));
    }
}
