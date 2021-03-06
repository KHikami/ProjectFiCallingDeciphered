package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.util.AttributeSet;
import android.widget.ProgressBar;

/* compiled from: PG */
/* renamed from: vu */
class vu {
    private static final int[] b;
    Bitmap a;
    private final ProgressBar c;

    static {
        b = new int[]{16843067, 16843068};
    }

    vu(ProgressBar progressBar, vi viVar) {
        this.c = progressBar;
    }

    void a(AttributeSet attributeSet, int i) {
        aah a = aah.a(this.c.getContext(), attributeSet, b, i, 0);
        Drawable b = a.b(0);
        if (b != null) {
            ProgressBar progressBar = this.c;
            if (b instanceof AnimationDrawable) {
                AnimationDrawable animationDrawable = (AnimationDrawable) b;
                int numberOfFrames = animationDrawable.getNumberOfFrames();
                Drawable animationDrawable2 = new AnimationDrawable();
                animationDrawable2.setOneShot(animationDrawable.isOneShot());
                for (int i2 = 0; i2 < numberOfFrames; i2++) {
                    Drawable a2 = a(animationDrawable.getFrame(i2), true);
                    a2.setLevel(10000);
                    animationDrawable2.addFrame(a2, animationDrawable.getDuration(i2));
                }
                animationDrawable2.setLevel(10000);
                b = animationDrawable2;
            }
            progressBar.setIndeterminateDrawable(b);
        }
        b = a.b(1);
        if (b != null) {
            this.c.setProgressDrawable(a(b, false));
        }
        a.a.recycle();
    }

    private final Drawable a(Drawable drawable, boolean z) {
        int i = 0;
        Drawable a;
        if (drawable instanceof gz) {
            a = ((gz) drawable).a();
            if (a == null) {
                return drawable;
            }
            ((gz) drawable).a(a(a, z));
            return drawable;
        } else if (drawable instanceof LayerDrawable) {
            LayerDrawable layerDrawable = (LayerDrawable) drawable;
            int numberOfLayers = layerDrawable.getNumberOfLayers();
            Drawable[] drawableArr = new Drawable[numberOfLayers];
            for (int i2 = 0; i2 < numberOfLayers; i2++) {
                boolean z2;
                int id = layerDrawable.getId(i2);
                Drawable drawable2 = layerDrawable.getDrawable(i2);
                if (id == 16908301 || id == 16908303) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                drawableArr[i2] = a(drawable2, z2);
            }
            a = new LayerDrawable(drawableArr);
            while (i < numberOfLayers) {
                a.setId(i, layerDrawable.getId(i));
                i++;
            }
            return a;
        } else if (!(drawable instanceof BitmapDrawable)) {
            return drawable;
        } else {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            Bitmap bitmap = bitmapDrawable.getBitmap();
            if (this.a == null) {
                this.a = bitmap;
            }
            a = new ShapeDrawable(new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null));
            a.getPaint().setShader(new BitmapShader(bitmap, TileMode.REPEAT, TileMode.CLAMP));
            a.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
            return z ? new ClipDrawable(a, 3, 1) : a;
        }
    }
}
