package p000;

import android.app.ActivityManager;
import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Shader.TileMode;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public final class gkd {
    public static volatile gix f15478a;
    private static final iio f15479b = iio.f17742a;
    private static MediaMetadataRetriever f15480c;
    private static Boolean f15481d;
    private static final Object f15482e = new Object();

    private static boolean m17881b(Uri uri) {
        CharSequence authority = uri.getAuthority();
        return TextUtils.equals("content", uri.getScheme()) && (TextUtils.equals("media", authority) || TextUtils.equals("com.android.providers.media.documents", authority));
    }

    public static byte[] m17878a(InputStream inputStream) {
        byte[] bArr = null;
        int i = 0;
        if (inputStream != null) {
            byte[] bArr2 = new byte[128];
            int i2 = 0;
            while (i2 == 0) {
                try {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    while (true) {
                        int read = inputStream.read(bArr2, 0, 128);
                        if (read == -1) {
                            break;
                        }
                        byteArrayOutputStream.write(bArr2, 0, read);
                    }
                    byte[] toByteArray = byteArrayOutputStream.toByteArray();
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                            bArr = toByteArray;
                            i2 = 1;
                        } catch (Throwable e) {
                            glk.m17980d("Babel", "Error trying to close input stream", e);
                            bArr = toByteArray;
                            i2 = 1;
                        }
                    } else {
                        bArr = toByteArray;
                        i2 = 1;
                    }
                } catch (OutOfMemoryError e2) {
                    glk.m17981d("Babel", "OutOfMemory trying to create inputStream to bytes in ImageUtils.", new Object[0]);
                    i++;
                    if (i <= 1) {
                        f15479b.m21892a();
                    } else {
                        glk.m17981d("Babel", "Getting bitmap from uri failed in ImageUtils. Out of Memory.", new Object[0]);
                        i2 = 1;
                    }
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (Throwable e3) {
                            glk.m17980d("Babel", "Error trying to close input stream", e3);
                        }
                    }
                } catch (Throwable e4) {
                    glk.m17980d("Babel", "Error trying to convert input stream into bytes in ImageUtils: ", e4);
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                            i2 = 1;
                        } catch (Throwable e42) {
                            glk.m17980d("Babel", "Error trying to close input stream", e42);
                            i2 = 1;
                        }
                    } else {
                        i2 = 1;
                    }
                } catch (Throwable th) {
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (Throwable e422) {
                            glk.m17980d("Babel", "Error trying to close input stream", e422);
                        }
                    }
                }
            }
        }
        return bArr;
    }

    public static byte[] m17877a(Bitmap bitmap, int i) {
        byte[] bArr = null;
        int i2 = 0;
        int i3 = 0;
        while (i3 == 0) {
            try {
                OutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                bitmap.compress(CompressFormat.JPEG, i, byteArrayOutputStream);
                bArr = byteArrayOutputStream.toByteArray();
                i3 = 1;
            } catch (OutOfMemoryError e) {
                glk.m17981d("Babel", "OutOfMemory converting bitmap to bytes.", new Object[0]);
                i2++;
                if (i2 <= 1) {
                    f15479b.m21892a();
                } else {
                    glk.m17981d("Babel", "Failed to convert bitmap to bytes. Out of Memory.", new Object[0]);
                    i3 = 1;
                }
            }
        }
        return bArr;
    }

    public static Bitmap m17872a(Uri uri) {
        if (f15480c == null) {
            f15480c = new MediaMetadataRetriever();
        }
        try {
            f15480c.setDataSource(gwb.m1400H(), uri);
            return f15480c.getFrameAtTime(-1);
        } catch (Exception e) {
            return null;
        }
    }

    private static String m17879b(File file, String str, String str2) {
        String valueOf;
        Object concat;
        String valueOf2 = String.valueOf(str);
        if (str2 != null) {
            String str3 = ".";
            valueOf = String.valueOf(str2);
            concat = valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3);
        } else {
            concat = "";
        }
        valueOf = String.valueOf(concat);
        valueOf = valueOf.length() != 0 ? valueOf2.concat(valueOf) : new String(valueOf2);
        if (!new File(file, valueOf).exists()) {
            return valueOf;
        }
        if (str2 != null) {
            valueOf2 = ".";
            valueOf = String.valueOf(str2);
            valueOf = valueOf.length() != 0 ? valueOf2.concat(valueOf) : new String(valueOf2);
        } else {
            valueOf = "";
        }
        str3 = new StringBuilder((String.valueOf(str).length() + 5) + String.valueOf(valueOf).length()).append(str).append(" (%d)").append(valueOf).toString();
        for (int i = 1; i <= 99; i++) {
            valueOf = String.format(Locale.US, str3, new Object[]{Integer.valueOf(i)});
            if (!new File(file, valueOf).exists()) {
                return valueOf;
            }
        }
        glk.m17982e("Babel", "Too many duplicate final names. Aborted trying to create new file name", new Object[0]);
        return null;
    }

    public static String m17875a(File file, String str, String str2) {
        String extensionFromMimeType = MimeTypeMap.getSingleton().getExtensionFromMimeType(str);
        if (!TextUtils.isEmpty(str2)) {
            return new StringBuilder((String.valueOf(str2).length() + 1) + String.valueOf(extensionFromMimeType).length()).append(str2).append(".").append(extensionFromMimeType).toString();
        }
        return gkd.m17879b(file, new SimpleDateFormat(gwb.m1400H().getString(bc.bw), Locale.US).format(new Date(glj.m17956a())), extensionFromMimeType);
    }

    public static int m17869a(ContentResolver contentResolver, Uri uri) {
        Cursor query;
        Throwable th;
        if (!gkd.m17881b(uri)) {
            return 0;
        }
        try {
            int i;
            query = contentResolver.query(uri, new String[]{"orientation"}, null, null, null);
            if (query != null) {
                try {
                    if (query.moveToFirst()) {
                        i = query.getInt(0);
                        if (query != null) {
                            return i;
                        }
                        query.close();
                        return i;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (query != null) {
                        query.close();
                    }
                    throw th;
                }
            }
            i = 0;
            if (query != null) {
                return i;
            }
            query.close();
            return i;
        } catch (Throwable th3) {
            th = th3;
            query = null;
            if (query != null) {
                query.close();
            }
            throw th;
        }
    }

    public static String m17874a(ContentResolver contentResolver, Uri uri, String str) {
        String string;
        Throwable th;
        if (gkd.m17881b(uri)) {
            Cursor query;
            try {
                query = contentResolver.query(uri, new String[]{"mime_type"}, null, null, null);
                if (query != null) {
                    try {
                        if (query.moveToFirst()) {
                            string = query.getString(0);
                            if (query != null) {
                                query.close();
                            }
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        if (query != null) {
                            query.close();
                        }
                        throw th;
                    }
                }
                string = null;
                if (query != null) {
                    query.close();
                }
            } catch (Throwable th3) {
                th = th3;
                query = null;
                if (query != null) {
                    query.close();
                }
                throw th;
            }
        } else if (uri.toString().endsWith(".gif")) {
            string = "image/gif";
        } else {
            string = null;
        }
        if (string == null) {
            return ba.m4539a(uri.toString(), str);
        }
        return string;
    }

    public static gix m17873a() {
        if (f15478a == null) {
            synchronized (f15482e) {
                if (f15478a == null) {
                    Context H = gwb.m1400H();
                    f15478a = new gix(H, ((boz) jyn.m25426a(H, boz.class)).mo636a());
                    f15479b.m21894a(f15478a);
                }
            }
        }
        return f15478a;
    }

    public static Bitmap m17870a(int i) {
        Bitmap decodeResource = BitmapFactory.decodeResource(gwb.m1400H().getResources(), i);
        Bitmap a = gkd.m17871a(decodeResource);
        gkd.m17880b(decodeResource);
        decodeResource = a.copy(a.getConfig(), false);
        gkd.m17880b(a);
        return decodeResource;
    }

    public static Bitmap m17871a(Bitmap bitmap) {
        int min;
        Bitmap bitmap2 = null;
        if (bitmap.getWidth() != bitmap.getHeight()) {
            min = Math.min(bitmap.getWidth(), bitmap.getHeight());
            bitmap2 = gkd.m17873a().m17772b(min, min);
            new Canvas(bitmap2).drawBitmap(bitmap, new Rect((bitmap.getWidth() - min) / 2, (bitmap.getHeight() - min) / 2, (bitmap.getWidth() + min) / 2, (bitmap.getHeight() + min) / 2), new Rect(0, 0, min, min), new Paint());
            bitmap = bitmap2;
        }
        min = bitmap.getWidth();
        Bitmap b = gkd.m17873a().m17772b(min, min);
        Canvas canvas = new Canvas(b);
        Shader bitmapShader = new BitmapShader(bitmap, TileMode.CLAMP, TileMode.CLAMP);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setShader(bitmapShader);
        canvas.drawRoundRect(new RectF(0.0f, 0.0f, (float) min, (float) min), (float) min, (float) min, paint);
        if (bitmap2 != null) {
            gkd.m17873a().m17771a(bitmap2);
        }
        return b;
    }

    private static void m17880b(Bitmap bitmap) {
        if (bitmap != null) {
            gkd.m17873a().m17771a(bitmap);
        }
    }

    public static boolean m17876a(Context context) {
        if (f15481d != null) {
            return gwb.m2061b(f15481d);
        }
        boolean isLowRamDevice;
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        int memoryClass = activityManager.getMemoryClass();
        if (VERSION.SDK_INT >= 19) {
            isLowRamDevice = activityManager.isLowRamDevice();
        } else {
            isLowRamDevice = false;
        }
        if (memoryClass < 24 || r0) {
            isLowRamDevice = false;
        } else {
            isLowRamDevice = true;
        }
        Boolean valueOf = Boolean.valueOf(isLowRamDevice);
        f15481d = valueOf;
        return gwb.m2061b(valueOf);
    }
}
