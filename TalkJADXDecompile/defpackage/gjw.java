package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory.Options;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.AsyncTask;
import android.widget.ImageView;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: gjw */
public final class gjw extends AsyncTask<Void, Integer, Void> {
    final /* synthetic */ gjs a;
    private final Map<Integer, WeakReference<ImageView>> b;
    private final int[] c;
    private final Map<Integer, Bitmap> d;
    private final Options e;
    private final StringBuilder f;
    private final Canvas g;
    private final Context h;

    protected /* synthetic */ Object doInBackground(Object[] objArr) {
        return b();
    }

    protected /* synthetic */ void onCancelled(Object obj) {
        a();
    }

    protected /* synthetic */ void onProgressUpdate(Object[] objArr) {
        a((Integer[]) objArr);
    }

    public gjw(gjs gjs, Context context, int[] iArr) {
        this.a = gjs;
        this.h = context.getApplicationContext();
        this.c = iArr;
        this.e = gjs.a();
        int length = iArr.length;
        this.b = Collections.synchronizedMap(new HashMap(length));
        this.d = Collections.synchronizedMap(new HashMap(length));
        if (gjs.f) {
            this.f = new StringBuilder();
            this.g = new Canvas();
            return;
        }
        this.f = null;
        this.g = null;
    }

    public void a(int i, ImageView imageView) {
        this.b.put(Integer.valueOf(i), new WeakReference(imageView));
        a(Integer.valueOf(i));
    }

    private void a() {
        for (int i : this.c) {
            this.a.e.b(Integer.valueOf(i));
            Bitmap bitmap = (Bitmap) this.d.remove(Integer.valueOf(i));
            if (bitmap != null) {
                gjs.b.a(bitmap);
            }
        }
    }

    private Void b() {
        for (int i : this.c) {
            if (isCancelled()) {
                break;
            }
            Object obj = (Bitmap) this.a.e.a(Integer.valueOf(i));
            if (obj == null && !isCancelled()) {
                if (this.a.f) {
                    obj = gjs.b.a(this.a.c, this.a.c, null);
                    obj.eraseColor(0);
                    this.g.setBitmap(obj);
                    this.f.delete(0, this.f.length());
                    this.f.appendCodePoint(i);
                    String stringBuilder = this.f.toString();
                    float width = (float) (obj.getWidth() / 2);
                    float height = (float) (obj.getHeight() / 2);
                    Rect rect = new Rect();
                    this.a.d.getTextBounds(stringBuilder, 0, stringBuilder.length(), rect);
                    this.g.drawText(stringBuilder, width - rect.exactCenterX(), height - rect.exactCenterY(), this.a.d);
                    this.a.e.a(Integer.valueOf(i), obj);
                } else {
                    long b;
                    if (gjs.a) {
                        b = glj.b();
                    } else {
                        b = 0;
                    }
                    int a = gob.a(this.h).a(i);
                    if (a == -1) {
                        glk.d("Babel", "Invalid resourceId for codePoint: " + i, new Object[0]);
                        obj = null;
                    } else {
                        obj = gjs.b.a(a, this.e, this.e.inTargetDensity, this.e.inTargetDensity, null);
                        if (obj != null) {
                            this.a.e.a(Integer.valueOf(i), obj);
                        }
                        if (gjs.a) {
                            new StringBuilder(45).append("Emoji Bitmap decodingTim=").append(glj.b() - b);
                        }
                    }
                }
            }
            if (!(obj == null || isCancelled())) {
                this.d.put(Integer.valueOf(i), obj);
                publishProgress(new Integer[]{Integer.valueOf(i)});
            }
        }
        return null;
    }

    private void a(Integer... numArr) {
        int i = 0;
        int a = gwb.a(numArr[0]);
        synchronized (this.b) {
            WeakReference weakReference = (WeakReference) this.b.get(Integer.valueOf(a));
            if (weakReference != null) {
                if (isCancelled() || weakReference.get() == null) {
                    i = 1;
                }
                if (i == 0) {
                    Bitmap bitmap = (Bitmap) this.d.get(Integer.valueOf(a));
                    ImageView imageView = (ImageView) weakReference.get();
                    if (!(bitmap == null || imageView == null)) {
                        gjs gjs = this.a;
                        if (gjs.a(imageView) == this) {
                            imageView.setImageBitmap(bitmap);
                        }
                    }
                }
            }
        }
    }
}
