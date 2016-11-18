package p000;

import android.app.ActivityManager;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.widget.ImageView;
import com.google.android.apps.hangouts.R$drawable;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

public final class gjs {
    static final boolean f15439a = false;
    static giz f15440b;
    private static final String f15441g = (127344 + 128519 + 127882 + 127973);
    private static int f15442h;
    private static boolean f15443i = false;
    private static int f15444j;
    private static int f15445k;
    private static final ThreadFactory f15446m = new gju();
    private static final Executor f15447n = Executors.newFixedThreadPool(2, f15446m);
    final int f15448c;
    final Paint f15449d;
    final ld<Integer, Bitmap> f15450e = new ld(f15442h);
    final boolean f15451f;
    private final Context f15452l;

    static {
        kae kae = glk.f15573t;
    }

    public gjs(Context context, int i) {
        this.f15452l = context.getApplicationContext();
        gjs.m17852a(this.f15452l);
        boolean z = VERSION.SDK_INT >= 19 && gwb.m1906a(gwb.m1400H(), "babel_prefer_emoji_system_font_rendering", true);
        this.f15451f = z;
        if (this.f15451f) {
            this.f15448c = context.getResources().getDimensionPixelSize(gwb.eK);
            this.f15449d = new Paint(1);
            this.f15449d.setColor(i);
            m17854a(this.f15448c);
            return;
        }
        this.f15448c = 0;
        this.f15449d = null;
    }

    private void m17854a(int i) {
        Rect rect = new Rect();
        int i2 = 0;
        int i3 = i;
        while (i2 < f15441g.length()) {
            int charCount = Character.charCount(f15441g.codePointAt(i2));
            int i4 = i + 1;
            while (true) {
                i4--;
                this.f15449d.setTextSize((float) i4);
                this.f15449d.getTextBounds(f15441g, i2, i2 + charCount, rect);
                if (rect.height() <= this.f15448c && rect.width() <= this.f15448c) {
                    break;
                }
            }
            if (i4 < i3) {
                if (f15439a || glk.m17973a("Babel", 3)) {
                    glk.m17976b("Babel", "Emoji font size min so far:" + i4 + " for i:" + i2, new Object[0]);
                }
                i3 = i4;
            }
            i2 += charCount;
        }
        this.f15449d.setTextSize((float) i3);
    }

    public static giz m17852a(Context context) {
        if (f15440b == null) {
            int min;
            Options a = gjs.m17851a();
            Resources resources = context.getResources();
            Bitmap decodeResource = BitmapFactory.decodeResource(resources, R$drawable.emoji_u00a9, a);
            int byteCount = decodeResource.getByteCount();
            int width = decodeResource.getWidth();
            int height = decodeResource.getHeight();
            int min2 = Math.min(Math.max(((ActivityManager) context.getSystemService("activity")).getMemoryClass() * 131072, 4194304), 16777216);
            int i = min2 / byteCount;
            if (((resources.getConfiguration().screenLayout & 15) >= 3 ? 1 : 0) != 0) {
                min = Math.min(i, gwb.m1492a(gwb.m1400H(), "babel_emoji_max_pool_size_large", 256));
            } else {
                min = Math.min(i, gwb.m1492a(gwb.m1400H(), "babel_emoji_max_pool_size", 128));
            }
            if (f15439a || glk.m17973a("Babel", 3)) {
                glk.m17976b("Babel", "[BitmapPoolICS ctor] maxItems=" + min + ", poolMemSize=" + min2 + ", memTakenPerBitmap=" + byteCount, new Object[0]);
            }
            f15442h = min;
            glk.m17981d("Babel", "getBitmapPool size=" + f15442h, new Object[0]);
            f15440b = giz.m17779a(context, f15442h, 0, 0, 0, "Emoji");
            if (VERSION.SDK_INT < 19) {
                f15440b.mo2288a(decodeResource);
                new gjt(width, height, 64, resources, a).execute(new Object[0]);
            }
        }
        return f15440b;
    }

    public static Options m17851a() {
        if (!f15443i) {
            f15444j = 128;
            f15445k = 128;
            f15443i = true;
        }
        return giz.m17778a(f15444j, f15445k);
    }

    public void m17857b() {
        this.f15450e.m1202a(-1);
    }

    public gjw m17855a(int[] iArr) {
        gjw gjw = new gjw(this, this.f15452l, iArr);
        gjw.executeOnExecutor(f15447n, new Void[0]);
        return gjw;
    }

    public void m17856a(Resources resources, int i, gjw gjw, ImageView imageView) {
        imageView.setImageDrawable(new gjv(this, resources, null, gjw));
        gjw.m17863a(i, imageView);
    }

    static gjw m17853a(ImageView imageView) {
        if (imageView != null) {
            Drawable drawable = imageView.getDrawable();
            if (drawable instanceof gjv) {
                return ((gjv) drawable).m17859a();
            }
        }
        return null;
    }
}
