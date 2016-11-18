package p000;

import android.app.ActivityManager;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.graphics.Matrix;
import android.os.AsyncTask;
import android.os.Build.VERSION;
import android.os.ParcelFileDescriptor;
import android.widget.ImageView;
import com.google.android.gms.common.api.Status;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.LinkedList;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

public class hsz {
    public static volatile Executor f17205a;
    private static boolean f17206k;
    public final Context f17207b;
    public final gui f17208c;
    final ConcurrentHashMap<String, Bitmap> f17209d = new ConcurrentHashMap();
    boolean f17210e;
    float f17211f;
    float f17212g;
    private boolean f17213h;
    private hta f17214i;
    private final LinkedList<hta> f17215j = new LinkedList();

    static {
        f17205a = null;
        if (VERSION.SDK_INT >= 11) {
            f17205a = AsyncTask.THREAD_POOL_EXECUTOR;
        }
    }

    public hsz(Context context, gui gui, boolean z) {
        this.f17207b = context;
        this.f17208c = gui;
        this.f17210e = z;
        Resources resources = context.getResources();
        this.f17212g = (float) resources.getInteger(gwb.xH);
        this.f17211f = (float) resources.getInteger(gwb.xG);
        f17206k = gwb.m1895a((ActivityManager) context.getSystemService("activity"));
    }

    public void m20795a(hta hta) {
        if (this.f17209d.containsKey(hta.f17218g)) {
            hta.f17217f.setImageBitmap((Bitmap) this.f17209d.get(hta.f17218g));
            m20792a(hta.f17217f);
            return;
        }
        ImageView imageView = hta.f17217f;
        m20792a(imageView);
        if (this.f17208c.mo2524e()) {
            imageView.setTag(hta);
            this.f17215j.add(hta);
            m20790a();
        }
    }

    public void m20792a(ImageView imageView) {
        imageView.setTag(null);
        int i = 0;
        while (i < this.f17215j.size()) {
            if (((hta) this.f17215j.get(i)).f17217f == imageView) {
                this.f17215j.remove(i);
            } else {
                i++;
            }
        }
        if (this.f17214i != null && this.f17214i.f17217f == imageView) {
            this.f17214i.f17216e = true;
            m20790a();
        }
    }

    private void m20790a() {
        if (!this.f17215j.isEmpty()) {
            if (this.f17214i == null || this.f17214i.f17216e) {
                this.f17214i = (hta) this.f17215j.remove();
                this.f17214i.mo2945a();
            }
        }
    }

    public void m20794a(Status status, ParcelFileDescriptor parcelFileDescriptor, hta hta, int i) {
        m20793a(status, parcelFileDescriptor, -1, -1, i, hta);
    }

    public void m20793a(Status status, ParcelFileDescriptor parcelFileDescriptor, int i, int i2, int i3, hta hta) {
        try {
            if (this.f17214i != hta) {
                if (!this.f17213h) {
                    m20790a();
                }
                if (parcelFileDescriptor != null) {
                    try {
                        parcelFileDescriptor.close();
                        return;
                    } catch (IOException e) {
                        return;
                    }
                }
                return;
            }
            this.f17214i = null;
            if (this.f17213h) {
                if (!this.f17213h) {
                    m20790a();
                }
                if (parcelFileDescriptor != null) {
                    try {
                        parcelFileDescriptor.close();
                    } catch (IOException e2) {
                    }
                }
            } else if (hta.f17217f.getTag() != hta || hta.f17216e) {
                if (!this.f17213h) {
                    m20790a();
                }
                if (parcelFileDescriptor != null) {
                    try {
                        parcelFileDescriptor.close();
                    } catch (IOException e3) {
                    }
                }
            } else {
                if (!status.m9663d() || parcelFileDescriptor == null) {
                    String valueOf = String.valueOf(status);
                    String valueOf2 = String.valueOf(parcelFileDescriptor);
                    new StringBuilder((String.valueOf(valueOf).length() + 28) + String.valueOf(valueOf2).length()).append("Avatar loaded: status=").append(valueOf).append("  pfd=").append(valueOf2);
                }
                if (parcelFileDescriptor != null) {
                    htb htb = new htb(this, hta, parcelFileDescriptor, i, i2, i3);
                    if (VERSION.SDK_INT >= 11) {
                        htb.executeOnExecutor(f17205a, new Void[0]);
                    } else {
                        htb.execute(null);
                    }
                    parcelFileDescriptor = null;
                } else {
                    mo2944a(hta, null);
                }
                if (!this.f17213h) {
                    m20790a();
                }
                if (parcelFileDescriptor != null) {
                    try {
                        parcelFileDescriptor.close();
                    } catch (IOException e4) {
                    }
                }
            }
        } catch (Throwable th) {
            if (!this.f17213h) {
                m20790a();
            }
            if (parcelFileDescriptor != null) {
                try {
                    parcelFileDescriptor.close();
                } catch (IOException e5) {
                }
            }
        }
    }

    private static int m20787a(int i, int i2, int i3, int i4) {
        if (f17206k) {
            return 2;
        }
        int i5 = 1;
        if (i <= i4 && i2 <= i3) {
            return 1;
        }
        int i6 = i / 2;
        int i7 = i2 / 2;
        while (i6 / i5 >= i4 && i7 / i5 >= i3) {
            i5 <<= 1;
        }
        return i5;
    }

    public static Bitmap m20789a(ParcelFileDescriptor parcelFileDescriptor, int i, int i2, int i3, int i4) {
        Throwable th;
        Bitmap bitmap = null;
        if (parcelFileDescriptor != null) {
            Options options = new Options();
            options.inSampleSize = hsz.m20787a(i, i2, i3, i4);
            options.inJustDecodeBounds = false;
            options.outWidth = i;
            options.outHeight = i2;
            if (f17206k) {
                options.inPreferredConfig = Config.RGB_565;
            }
            InputStream fileInputStream;
            try {
                fileInputStream = new FileInputStream(parcelFileDescriptor.getFileDescriptor());
                try {
                    bitmap = BitmapFactory.decodeStream(fileInputStream, null, options);
                    hsz.m20791a(fileInputStream);
                } catch (Throwable th2) {
                    th = th2;
                    if (fileInputStream != null) {
                        hsz.m20791a(fileInputStream);
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                Throwable th4 = th3;
                fileInputStream = null;
                th = th4;
                if (fileInputStream != null) {
                    hsz.m20791a(fileInputStream);
                }
                throw th;
            }
        }
        return bitmap;
    }

    private static void m20791a(InputStream inputStream) {
        try {
            inputStream.close();
        } catch (IOException e) {
        }
    }

    public static Bitmap m20788a(Bitmap bitmap, int i, float f) {
        int i2 = (int) (((float) i) * f);
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (i == width && i2 == height) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        float max = Math.max(((float) i) / ((float) width), ((float) i2) / ((float) height));
        matrix.setScale(max, max);
        int round = Math.round(((float) i) / max);
        int round2 = Math.round(((float) i2) / max);
        int i3 = (int) ((((float) height) * 0.5f) - ((float) (round2 / 2)));
        return Bitmap.createBitmap(bitmap, Math.max(Math.min((int) ((((float) width) * 0.5f) - ((float) (round / 2))), width - round), 0), Math.max(Math.min(i3, height - round2), 0), round, round2, matrix, true);
    }

    protected void mo2944a(hta hta, Bitmap bitmap) {
        if (bitmap != null) {
            hta.f17217f.setImageBitmap(bitmap);
        }
    }
}
