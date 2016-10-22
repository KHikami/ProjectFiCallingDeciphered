import android.app.ActivityManager;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.FontMetricsInt;
import android.graphics.Paint.Style;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.provider.ContactsContract.CommonDataKinds.Phone;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;

/* compiled from: PG */
public final class aes {
    static final String[] a;
    static final String[] b;
    final aeu c;
    final Context d;
    private final int e;
    private final int f;
    private final Resources g;
    private int h;

    static {
        String[] strArr = new String[]{"display_name", "photo_id", "lookup"};
        a = new String[]{"display_name", "photo_id", "data1", "data2", "data3", "lookup"};
        b = new String[]{"data15"};
    }

    public aes(Context context, aeu aeu) {
        this.d = context;
        this.c = aeu;
        this.g = context.getResources();
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        this.h = this.g.getDimensionPixelSize(buf.cW);
        if (this.h == 0) {
            this.h = activityManager.getLauncherLargeIconSize();
        }
        this.e = activityManager.getLauncherLargeIconDensity();
        this.f = this.g.getColor(buf.cI);
    }

    final Bitmap a(Drawable drawable, int i, String str, int i2) {
        Resources resources = this.d.getResources();
        float f = resources.getDisplayMetrics().density;
        Bitmap bitmap = ((BitmapDrawable) resources.getDrawableForDensity(i2, this.e)).getBitmap();
        Bitmap createBitmap = Bitmap.createBitmap(this.h, this.h, Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Rect rect = new Rect(0, 0, this.h, this.h);
        drawable.setBounds(rect);
        drawable.draw(canvas);
        hl a = buf.a(this.g, createBitmap);
        a.a(true);
        a.a((float) (this.h / 2));
        Bitmap createBitmap2 = Bitmap.createBitmap(this.h, this.h, Config.ARGB_8888);
        canvas.setBitmap(createBitmap2);
        a.setBounds(rect);
        a.draw(canvas);
        canvas.setBitmap(null);
        Canvas canvas2 = new Canvas(createBitmap2);
        Paint paint = new Paint();
        paint.setDither(true);
        paint.setFilterBitmap(true);
        Rect rect2 = new Rect(0, 0, this.h, this.h);
        CharSequence typeLabel = Phone.getTypeLabel(resources, i, str);
        if (typeLabel != null) {
            Paint textPaint = new TextPaint(257);
            textPaint.setTextSize(resources.getDimension(buf.cY));
            textPaint.setColor(resources.getColor(buf.cK));
            textPaint.setShadowLayer(4.0f, 0.0f, 2.0f, resources.getColor(buf.cL));
            FontMetricsInt fontMetricsInt = textPaint.getFontMetricsInt();
            Paint paint2 = new Paint();
            paint2.setColor(this.f);
            paint2.setStyle(Style.FILL);
            int dimensionPixelOffset = resources.getDimensionPixelOffset(buf.cX);
            int i3 = (fontMetricsInt.descent - fontMetricsInt.ascent) + (dimensionPixelOffset << 1);
            rect2.set(0, this.h - i3, this.h, this.h);
            canvas2.drawRect(rect2, paint2);
            CharSequence ellipsize = TextUtils.ellipsize(typeLabel, textPaint, (float) this.h, TruncateAt.END);
            canvas2.drawText(ellipsize, 0, ellipsize.length(), (((float) this.h) - textPaint.measureText(ellipsize, 0, ellipsize.length())) / 2.0f, (float) ((this.h - fontMetricsInt.descent) - dimensionPixelOffset), textPaint);
        }
        Rect rect3 = new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
        int width = createBitmap2.getWidth();
        rect2.set(width - ((int) (20.0f * f)), -1, width, (int) (19.0f * f));
        canvas2.drawBitmap(bitmap, rect3, rect2, paint);
        canvas2.setBitmap(null);
        return createBitmap2;
    }
}
