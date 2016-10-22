package defpackage;

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

/* renamed from: hsz */
public class hsz {
    public static volatile Executor a;
    private static boolean k;
    public final Context b;
    public final gui c;
    final ConcurrentHashMap<String, Bitmap> d;
    boolean e;
    float f;
    float g;
    private boolean h;
    private hta i;
    private final LinkedList<hta> j;

    static {
        a = null;
        if (VERSION.SDK_INT >= 11) {
            a = AsyncTask.THREAD_POOL_EXECUTOR;
        }
    }

    public hsz(Context context, gui gui, boolean z) {
        this.d = new ConcurrentHashMap();
        this.j = new LinkedList();
        this.b = context;
        this.c = gui;
        this.e = z;
        Resources resources = context.getResources();
        this.g = (float) resources.getInteger(gwb.xH);
        this.f = (float) resources.getInteger(gwb.xG);
        k = gwb.a((ActivityManager) context.getSystemService("activity"));
    }

    public void a(hta hta) {
        if (this.d.containsKey(hta.g)) {
            hta.f.setImageBitmap((Bitmap) this.d.get(hta.g));
            a(hta.f);
            return;
        }
        ImageView imageView = hta.f;
        a(imageView);
        if (this.c.e()) {
            imageView.setTag(hta);
            this.j.add(hta);
            a();
        }
    }

    public void a(ImageView imageView) {
        imageView.setTag(null);
        int i = 0;
        while (i < this.j.size()) {
            if (((hta) this.j.get(i)).f == imageView) {
                this.j.remove(i);
            } else {
                i++;
            }
        }
        if (this.i != null && this.i.f == imageView) {
            this.i.e = true;
            a();
        }
    }

    private void a() {
        if (!this.j.isEmpty()) {
            if (this.i == null || this.i.e) {
                this.i = (hta) this.j.remove();
                this.i.a();
            }
        }
    }

    public void a(Status status, ParcelFileDescriptor parcelFileDescriptor, hta hta, int i) {
        a(status, parcelFileDescriptor, -1, -1, i, hta);
    }

    public void a(Status status, ParcelFileDescriptor parcelFileDescriptor, int i, int i2, int i3, hta hta) {
        try {
            if (this.i != hta) {
                if (!this.h) {
                    a();
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
            this.i = null;
            if (this.h) {
                if (!this.h) {
                    a();
                }
                if (parcelFileDescriptor != null) {
                    try {
                        parcelFileDescriptor.close();
                    } catch (IOException e2) {
                    }
                }
            } else if (hta.f.getTag() != hta || hta.e) {
                if (!this.h) {
                    a();
                }
                if (parcelFileDescriptor != null) {
                    try {
                        parcelFileDescriptor.close();
                    } catch (IOException e3) {
                    }
                }
            } else {
                if (!status.d() || parcelFileDescriptor == null) {
                    String valueOf = String.valueOf(status);
                    String valueOf2 = String.valueOf(parcelFileDescriptor);
                    new StringBuilder((String.valueOf(valueOf).length() + 28) + String.valueOf(valueOf2).length()).append("Avatar loaded: status=").append(valueOf).append("  pfd=").append(valueOf2);
                }
                if (parcelFileDescriptor != null) {
                    htb htb = new htb(this, hta, parcelFileDescriptor, i, i2, i3);
                    if (VERSION.SDK_INT >= 11) {
                        htb.executeOnExecutor(a, new Void[0]);
                    } else {
                        htb.execute(null);
                    }
                    parcelFileDescriptor = null;
                } else {
                    a(hta, null);
                }
                if (!this.h) {
                    a();
                }
                if (parcelFileDescriptor != null) {
                    try {
                        parcelFileDescriptor.close();
                    } catch (IOException e4) {
                    }
                }
            }
        } catch (Throwable th) {
            if (!this.h) {
                a();
            }
            if (parcelFileDescriptor != null) {
                try {
                    parcelFileDescriptor.close();
                } catch (IOException e5) {
                }
            }
        }
    }

    private static int a(int i, int i2, int i3, int i4) {
        if (k) {
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

    public static Bitmap a(ParcelFileDescriptor parcelFileDescriptor, int i, int i2, int i3, int i4) {
        Throwable th;
        Bitmap bitmap = null;
        if (parcelFileDescriptor != null) {
            Options options = new Options();
            options.inSampleSize = hsz.a(i, i2, i3, i4);
            options.inJustDecodeBounds = false;
            options.outWidth = i;
            options.outHeight = i2;
            if (k) {
                options.inPreferredConfig = Config.RGB_565;
            }
            InputStream fileInputStream;
            try {
                fileInputStream = new FileInputStream(parcelFileDescriptor.getFileDescriptor());
                try {
                    bitmap = BitmapFactory.decodeStream(fileInputStream, null, options);
                    hsz.a(fileInputStream);
                } catch (Throwable th2) {
                    th = th2;
                    if (fileInputStream != null) {
                        hsz.a(fileInputStream);
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                Throwable th4 = th3;
                fileInputStream = null;
                th = th4;
                if (fileInputStream != null) {
                    hsz.a(fileInputStream);
                }
                throw th;
            }
        }
        return bitmap;
    }

    private static void a(InputStream inputStream) {
        try {
            inputStream.close();
        } catch (IOException e) {
        }
    }

    public static Bitmap a(Bitmap bitmap, int i, float f) {
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

    protected void a(hta hta, Bitmap bitmap) {
        if (bitmap != null) {
            hta.f.setImageBitmap(bitmap);
        }
    }
}
