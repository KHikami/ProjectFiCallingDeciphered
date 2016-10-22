package defpackage;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Paint.Align;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;

/* compiled from: PG */
/* renamed from: ade */
public class ade extends Drawable {
    private static final Paint g;
    private static final Rect h;
    private static final char[] i;
    private static TypedArray j;
    private static int k;
    private static int l;
    private static float m;
    private static Bitmap n;
    private static Bitmap o;
    private static Bitmap p;
    public int a;
    public float b;
    public float c;
    public boolean d;
    public int e;
    public Character f;
    private final Paint q;

    static {
        g = new Paint();
        h = new Rect();
        i = new char[1];
    }

    public ade(Resources resources) {
        ade.class.getSimpleName();
        this.a = 1;
        this.b = 1.0f;
        this.c = 0.0f;
        this.d = false;
        this.f = null;
        if (j == null) {
            j = resources.obtainTypedArray(buf.co);
            k = resources.getColor(buf.cF);
            l = resources.getColor(buf.cG);
            m = resources.getFraction(buf.cV, 1, 1);
            n = BitmapFactory.decodeResource(resources, buf.dd);
            o = BitmapFactory.decodeResource(resources, buf.da);
            p = BitmapFactory.decodeResource(resources, buf.df);
            g.setTypeface(Typeface.create(resources.getString(buf.fx), 0));
            g.setTextAlign(Align.CENTER);
            g.setAntiAlias(true);
        }
        this.q = new Paint();
        this.q.setFilterBitmap(true);
        this.q.setDither(true);
        this.e = k;
    }

    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        if (isVisible() && !bounds.isEmpty()) {
            g.setColor(this.e);
            g.setAlpha(this.q.getAlpha());
            bounds = getBounds();
            int min = Math.min(bounds.width(), bounds.height());
            if (this.d) {
                canvas.drawCircle((float) bounds.centerX(), (float) bounds.centerY(), (float) (min / 2), g);
            } else {
                canvas.drawRect(bounds, g);
            }
            if (this.f != null) {
                i[0] = this.f.charValue();
                g.setTextSize(((float) min) * (this.b * m));
                g.getTextBounds(i, 0, 1, h);
                g.setColor(l);
                Canvas canvas2 = canvas;
                canvas2.drawText(i, 0, 1, (float) bounds.centerX(), ((((float) bounds.height()) * this.c) + ((float) bounds.centerY())) - h.exactCenterY(), g);
                return;
            }
            Bitmap bitmap;
            switch (this.a) {
                case rq.b /*1*/:
                    bitmap = n;
                    break;
                case rq.c /*2*/:
                    bitmap = o;
                    break;
                case rl.e /*3*/:
                    bitmap = p;
                    break;
                default:
                    bitmap = n;
                    break;
            }
            min = bitmap.getWidth();
            int height = bitmap.getHeight();
            Rect copyBounds = copyBounds();
            int min2 = (int) ((this.b * ((float) Math.min(copyBounds.width(), copyBounds.height()))) / 2.0f);
            copyBounds.set(copyBounds.centerX() - min2, (int) (((float) (copyBounds.centerY() - min2)) + (this.c * ((float) copyBounds.height()))), copyBounds.centerX() + min2, (int) (((float) (min2 + copyBounds.centerY())) + (this.c * ((float) copyBounds.height()))));
            h.set(0, 0, min, height);
            canvas.drawBitmap(bitmap, h, copyBounds, this.q);
        }
    }

    public void setAlpha(int i) {
        this.q.setAlpha(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.q.setColorFilter(colorFilter);
    }

    public int getOpacity() {
        return -1;
    }

    public final ade a(String str, String str2) {
        int i;
        if (str != null && str.length() > 0) {
            char charAt = str.charAt(0);
            if (('A' > charAt || charAt > 'Z') && ('a' > charAt || charAt > 'z')) {
                i = 0;
            } else {
                i = 1;
            }
            if (i != 0) {
                this.f = Character.valueOf(Character.toUpperCase(str.charAt(0)));
                if (!TextUtils.isEmpty(str2) || this.a == 3) {
                    i = k;
                } else {
                    i = j.getColor(Math.abs(str2.hashCode()) % j.length(), k);
                }
                this.e = i;
                return this;
            }
        }
        this.f = null;
        if (TextUtils.isEmpty(str2)) {
        }
        i = k;
        this.e = i;
        return this;
    }
}
