import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.io.InputStream;

/* compiled from: PG */
final class bbl extends Handler {
    private /* synthetic */ bbh a;

    public bbl(bbh bbh, Looper looper) {
        this.a = bbh;
        super(looper);
    }

    public final void handleMessage(Message message) {
        Throwable th;
        InputStream inputStream;
        Bitmap bitmap = null;
        bbk bbk = (bbk) message.obj;
        switch (message.arg1) {
            case rq.b /*1*/:
                InputStream openInputStream;
                try {
                    openInputStream = bbk.a.getContentResolver().openInputStream(bbk.b);
                } catch (Exception e) {
                    bdf.a((Object) this, "Error opening photo input stream", e);
                    openInputStream = null;
                } catch (Throwable th2) {
                    th = th2;
                    inputStream = null;
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (Exception e2) {
                            bdf.a((Object) this, "Unable to close input stream.", e2);
                        }
                    }
                    throw th;
                }
                int i;
                Object obj;
                int i2;
                String valueOf;
                if (openInputStream != null) {
                    try {
                        bbk.c = Drawable.createFromStream(openInputStream, bbk.b.toString());
                        Context context = bbk.a;
                        Drawable drawable = bbk.c;
                        if (drawable instanceof BitmapDrawable) {
                            int dimensionPixelSize = context.getResources().getDimensionPixelSize(buf.ke);
                            Bitmap bitmap2 = ((BitmapDrawable) drawable).getBitmap();
                            int width = bitmap2.getWidth();
                            int height = bitmap2.getHeight();
                            i = width > height ? width : height;
                            if (i > dimensionPixelSize) {
                                float f = ((float) i) / ((float) dimensionPixelSize);
                                width = (int) (((float) width) / f);
                                i = (int) (((float) height) / f);
                                if (width <= 0 || i <= 0) {
                                    bdf.e(this, "Photo icon's width or height become 0.");
                                } else {
                                    bitmap = Bitmap.createScaledBitmap(bitmap2, width, i, true);
                                }
                            } else {
                                bitmap = bitmap2;
                            }
                        }
                        bbk.d = bitmap;
                        obj = this.a;
                        i2 = message.arg1;
                        i = message.what;
                        valueOf = String.valueOf(bbk.b);
                        bdf.a(obj, new StringBuilder(String.valueOf(valueOf).length() + 57).append("Loading image: ").append(i2).append(" token: ").append(i).append(" image URI: ").append(valueOf).toString());
                    } catch (Throwable th3) {
                        th = th3;
                        inputStream = openInputStream;
                        if (inputStream != null) {
                            inputStream.close();
                        }
                        throw th;
                    }
                }
                bbk.c = null;
                bbk.d = null;
                obj = this.a;
                i2 = message.arg1;
                i = message.what;
                valueOf = String.valueOf(bbk.b);
                bdf.a(obj, new StringBuilder(String.valueOf(valueOf).length() + 84).append("Problem with image: ").append(i2).append(" token: ").append(i).append(" image URI: ").append(valueOf).append(", using default image.").toString());
                if (openInputStream != null) {
                    try {
                        openInputStream.close();
                        break;
                    } catch (Exception e3) {
                        bdf.a((Object) this, "Unable to close input stream.", e3);
                        break;
                    }
                }
                break;
        }
        Message obtainMessage = this.a.a.obtainMessage(message.what);
        obtainMessage.arg1 = message.arg1;
        obtainMessage.obj = message.obj;
        obtainMessage.sendToTarget();
    }
}
