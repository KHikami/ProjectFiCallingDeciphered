package p000;

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

class aat {
    private static final int[] f63a = new int[]{16843067, 16843068};
    private final ProgressBar f64b;
    private Bitmap f65c;

    aat(ProgressBar progressBar) {
        this.f64b = progressBar;
    }

    void mo9a(AttributeSet attributeSet, int i) {
        afp a = afp.m927a(this.f64b.getContext(), attributeSet, f63a, i, 0);
        Drawable b = a.m934b(0);
        if (b != null) {
            ProgressBar progressBar = this.f64b;
            if (b instanceof AnimationDrawable) {
                AnimationDrawable animationDrawable = (AnimationDrawable) b;
                int numberOfFrames = animationDrawable.getNumberOfFrames();
                Drawable animationDrawable2 = new AnimationDrawable();
                animationDrawable2.setOneShot(animationDrawable.isOneShot());
                for (int i2 = 0; i2 < numberOfFrames; i2++) {
                    Drawable a2 = m108a(animationDrawable.getFrame(i2), true);
                    a2.setLevel(10000);
                    animationDrawable2.addFrame(a2, animationDrawable.getDuration(i2));
                }
                animationDrawable2.setLevel(10000);
                b = animationDrawable2;
            }
            progressBar.setIndeterminateDrawable(b);
        }
        b = a.m934b(1);
        if (b != null) {
            this.f64b.setProgressDrawable(m108a(b, false));
        }
        a.m931a();
    }

    private Drawable m108a(Drawable drawable, boolean z) {
        int i = 0;
        Drawable a;
        if (drawable instanceof ji) {
            a = ((ji) drawable).mo3525a();
            if (a == null) {
                return drawable;
            }
            ((ji) drawable).mo3526a(m108a(a, z));
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
                drawableArr[i2] = m108a(drawable2, z2);
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
            if (this.f65c == null) {
                this.f65c = bitmap;
            }
            a = new ShapeDrawable(new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null));
            a.getPaint().setShader(new BitmapShader(bitmap, TileMode.REPEAT, TileMode.CLAMP));
            a.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
            return z ? new ClipDrawable(a, 3, 1) : a;
        }
    }

    Bitmap m109a() {
        return this.f65c;
    }
}
