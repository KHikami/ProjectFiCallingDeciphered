package defpackage;

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

/* renamed from: gjs */
public final class gjs {
    static final boolean a;
    static giz b;
    private static final String g;
    private static int h;
    private static boolean i;
    private static int j;
    private static int k;
    private static final ThreadFactory m;
    private static final Executor n;
    final int c;
    final Paint d;
    final ld<Integer, Bitmap> e;
    final boolean f;
    private final Context l;

    static {
        kae kae = glk.t;
        a = false;
        g = 127344 + 128519 + 127882 + 127973;
        i = false;
        m = new gju();
        n = Executors.newFixedThreadPool(2, m);
    }

    public gjs(Context context, int i) {
        this.l = context.getApplicationContext();
        gjs.a(this.l);
        this.e = new ld(h);
        boolean z = VERSION.SDK_INT >= 19 && gwb.a(gwb.H(), "babel_prefer_emoji_system_font_rendering", true);
        this.f = z;
        if (this.f) {
            this.c = context.getResources().getDimensionPixelSize(gwb.eK);
            this.d = new Paint(1);
            this.d.setColor(i);
            a(this.c);
            return;
        }
        this.c = 0;
        this.d = null;
    }

    private void a(int i) {
        Rect rect = new Rect();
        int i2 = 0;
        int i3 = i;
        while (i2 < g.length()) {
            int charCount = Character.charCount(g.codePointAt(i2));
            int i4 = i + 1;
            while (true) {
                i4--;
                this.d.setTextSize((float) i4);
                this.d.getTextBounds(g, i2, i2 + charCount, rect);
                if (rect.height() <= this.c && rect.width() <= this.c) {
                    break;
                }
            }
            if (i4 < i3) {
                if (a || glk.a("Babel", 3)) {
                    glk.b("Babel", "Emoji font size min so far:" + i4 + " for i:" + i2, new Object[0]);
                }
                i3 = i4;
            }
            i2 += charCount;
        }
        this.d.setTextSize((float) i3);
    }

    public static giz a(Context context) {
        if (b == null) {
            int min;
            Options a = gjs.a();
            Resources resources = context.getResources();
            Bitmap decodeResource = BitmapFactory.decodeResource(resources, R$drawable.emoji_u00a9, a);
            int byteCount = decodeResource.getByteCount();
            int width = decodeResource.getWidth();
            int height = decodeResource.getHeight();
            int min2 = Math.min(Math.max(((ActivityManager) context.getSystemService("activity")).getMemoryClass() * 131072, 4194304), 16777216);
            int i = min2 / byteCount;
            if (((resources.getConfiguration().screenLayout & 15) >= 3 ? 1 : 0) != 0) {
                min = Math.min(i, gwb.a(gwb.H(), "babel_emoji_max_pool_size_large", 256));
            } else {
                min = Math.min(i, gwb.a(gwb.H(), "babel_emoji_max_pool_size", 128));
            }
            if (a || glk.a("Babel", 3)) {
                glk.b("Babel", "[BitmapPoolICS ctor] maxItems=" + min + ", poolMemSize=" + min2 + ", memTakenPerBitmap=" + byteCount, new Object[0]);
            }
            h = min;
            glk.d("Babel", "getBitmapPool size=" + h, new Object[0]);
            b = giz.a(context, h, 0, 0, 0, "Emoji");
            if (VERSION.SDK_INT < 19) {
                b.a(decodeResource);
                new gjt(width, height, 64, resources, a).execute(new Object[0]);
            }
        }
        return b;
    }

    public static Options a() {
        if (!i) {
            j = 128;
            k = 128;
            i = true;
        }
        return giz.a(j, k);
    }

    public void b() {
        this.e.a(-1);
    }

    public gjw a(int[] iArr) {
        gjw gjw = new gjw(this, this.l, iArr);
        gjw.executeOnExecutor(n, new Void[0]);
        return gjw;
    }

    public void a(Resources resources, int i, gjw gjw, ImageView imageView) {
        imageView.setImageDrawable(new gjv(this, resources, null, gjw));
        gjw.a(i, imageView);
    }

    static gjw a(ImageView imageView) {
        if (imageView != null) {
            Drawable drawable = imageView.getDrawable();
            if (drawable instanceof gjv) {
                return ((gjv) drawable).a();
            }
        }
        return null;
    }
}
