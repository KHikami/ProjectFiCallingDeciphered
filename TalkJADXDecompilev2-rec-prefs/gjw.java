package p000;

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

public final class gjw extends AsyncTask<Void, Integer, Void> {
    final /* synthetic */ gjs f15461a;
    private final Map<Integer, WeakReference<ImageView>> f15462b;
    private final int[] f15463c;
    private final Map<Integer, Bitmap> f15464d;
    private final Options f15465e = gjs.m17851a();
    private final StringBuilder f15466f;
    private final Canvas f15467g;
    private final Context f15468h;

    protected /* synthetic */ Object doInBackground(Object[] objArr) {
        return m17862b();
    }

    protected /* synthetic */ void onCancelled(Object obj) {
        m17860a();
    }

    protected /* synthetic */ void onProgressUpdate(Object[] objArr) {
        m17861a((Integer[]) objArr);
    }

    public gjw(gjs gjs, Context context, int[] iArr) {
        this.f15461a = gjs;
        this.f15468h = context.getApplicationContext();
        this.f15463c = iArr;
        int length = iArr.length;
        this.f15462b = Collections.synchronizedMap(new HashMap(length));
        this.f15464d = Collections.synchronizedMap(new HashMap(length));
        if (gjs.f15451f) {
            this.f15466f = new StringBuilder();
            this.f15467g = new Canvas();
            return;
        }
        this.f15466f = null;
        this.f15467g = null;
    }

    public void m17863a(int i, ImageView imageView) {
        this.f15462b.put(Integer.valueOf(i), new WeakReference(imageView));
        m17861a(Integer.valueOf(i));
    }

    private void m17860a() {
        for (int i : this.f15463c) {
            this.f15461a.f15450e.m1206b(Integer.valueOf(i));
            Bitmap bitmap = (Bitmap) this.f15464d.remove(Integer.valueOf(i));
            if (bitmap != null) {
                gjs.f15440b.mo2288a(bitmap);
            }
        }
    }

    private Void m17862b() {
        for (int i : this.f15463c) {
            if (isCancelled()) {
                break;
            }
            Object obj = (Bitmap) this.f15461a.f15450e.m1200a(Integer.valueOf(i));
            if (obj == null && !isCancelled()) {
                if (this.f15461a.f15451f) {
                    obj = gjs.f15440b.mo2284a(this.f15461a.f15448c, this.f15461a.f15448c, null);
                    obj.eraseColor(0);
                    this.f15467g.setBitmap(obj);
                    this.f15466f.delete(0, this.f15466f.length());
                    this.f15466f.appendCodePoint(i);
                    String stringBuilder = this.f15466f.toString();
                    float width = (float) (obj.getWidth() / 2);
                    float height = (float) (obj.getHeight() / 2);
                    Rect rect = new Rect();
                    this.f15461a.f15449d.getTextBounds(stringBuilder, 0, stringBuilder.length(), rect);
                    this.f15467g.drawText(stringBuilder, width - rect.exactCenterX(), height - rect.exactCenterY(), this.f15461a.f15449d);
                    this.f15461a.f15450e.m1201a(Integer.valueOf(i), obj);
                } else {
                    long b;
                    if (gjs.f15439a) {
                        b = glj.m17963b();
                    } else {
                        b = 0;
                    }
                    int a = gob.m18199a(this.f15468h).mo2306a(i);
                    if (a == -1) {
                        glk.m17981d("Babel", "Invalid resourceId for codePoint: " + i, new Object[0]);
                        obj = null;
                    } else {
                        obj = gjs.f15440b.mo2285a(a, this.f15465e, this.f15465e.inTargetDensity, this.f15465e.inTargetDensity, null);
                        if (obj != null) {
                            this.f15461a.f15450e.m1201a(Integer.valueOf(i), obj);
                        }
                        if (gjs.f15439a) {
                            new StringBuilder(45).append("Emoji Bitmap decodingTim=").append(glj.m17963b() - b);
                        }
                    }
                }
            }
            if (!(obj == null || isCancelled())) {
                this.f15464d.put(Integer.valueOf(i), obj);
                publishProgress(new Integer[]{Integer.valueOf(i)});
            }
        }
        return null;
    }

    private void m17861a(Integer... numArr) {
        int i = 0;
        int a = gwb.m1507a(numArr[0]);
        synchronized (this.f15462b) {
            WeakReference weakReference = (WeakReference) this.f15462b.get(Integer.valueOf(a));
            if (weakReference != null) {
                if (isCancelled() || weakReference.get() == null) {
                    i = 1;
                }
                if (i == 0) {
                    Bitmap bitmap = (Bitmap) this.f15464d.get(Integer.valueOf(a));
                    ImageView imageView = (ImageView) weakReference.get();
                    if (!(bitmap == null || imageView == null)) {
                        gjs gjs = this.f15461a;
                        if (gjs.m17853a(imageView) == this) {
                            imageView.setImageBitmap(bitmap);
                        }
                    }
                }
            }
        }
    }
}
