package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.MimeTypeMap;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;

public final class fxq {
    public static final String[] a = new String[]{"_id", "mid", "chset", "ct", "text"};
    public static final int b = 0;
    public static final int c;
    public static final int d;
    public static final int e;
    public static final int f;
    private static int o;
    public long g;
    public long h;
    public String i;
    public String j;
    public int k;
    public int l;
    public int m;
    public long n;

    static {
        o = 0;
        o = 1;
        int i = o;
        o = i + 1;
        c = i;
        i = o;
        o = i + 1;
        d = i;
        i = o;
        o = i + 1;
        e = i;
        i = o;
        o = i + 1;
        f = i;
    }

    private void b(Cursor cursor, boolean z) {
        Throwable e;
        Bitmap frameAtTime;
        InputStream inputStream = null;
        int i = 1;
        this.g = cursor.getLong(b);
        this.h = cursor.getLong(c);
        this.i = cursor.getString(e);
        this.j = cursor.getString(f);
        this.k = cursor.getInt(d);
        this.l = 0;
        this.m = 0;
        this.n = 0;
        if (!b()) {
            e();
        } else if (z) {
            if (ba.b(this.i)) {
                ContentResolver contentResolver = gwb.H().getContentResolver();
                Uri d = d();
                try {
                    inputStream = contentResolver.openInputStream(d);
                    Options options = new Options();
                    options.inJustDecodeBounds = true;
                    BitmapFactory.decodeStream(inputStream, null, options);
                    this.i = options.outMimeType;
                    this.l = options.outWidth;
                    this.m = options.outHeight;
                    if (TextUtils.isEmpty(this.i)) {
                        String path = d.getPath();
                        MimeTypeMap singleton = MimeTypeMap.getSingleton();
                        String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(path);
                        if (TextUtils.isEmpty(fileExtensionFromUrl)) {
                            int lastIndexOf = path.lastIndexOf(46);
                            if (lastIndexOf >= 0) {
                                fileExtensionFromUrl = path.substring(lastIndexOf + 1);
                            }
                        }
                        this.i = singleton.getMimeTypeFromExtension(fileExtensionFromUrl);
                    }
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (Throwable e2) {
                            Log.e("Babel_SMS", "IOException caught while closing stream", e2);
                        }
                    }
                } catch (Throwable e22) {
                    glk.d("Babel_SMS", "DatabaseMessages.MmsPart.loadImage: file not found", e22);
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (Throwable e222) {
                            Log.e("Babel_SMS", "IOException caught while closing stream", e222);
                        }
                    }
                } catch (Throwable th) {
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (Throwable e3) {
                            Log.e("Babel_SMS", "IOException caught while closing stream", e3);
                        }
                    }
                }
            } else if (ba.d(this.i) && fyi.a()) {
                Context H = gwb.H();
                Uri d2 = d();
                MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                try {
                    mediaMetadataRetriever.setDataSource(H, d2);
                } catch (IllegalArgumentException e4) {
                    e222 = e4;
                    glk.d("Babel_SMS", "DatabaseMessages.MmsPart.loadVideo: failed to load video", e222);
                    i = 0;
                    if (i != 0) {
                        frameAtTime = mediaMetadataRetriever.getFrameAtTime(-1);
                        this.i = mediaMetadataRetriever.extractMetadata(12);
                        this.l = frameAtTime.getWidth();
                        this.m = frameAtTime.getHeight();
                        mediaMetadataRetriever.release();
                    }
                    this.n = fyi.a(d());
                } catch (SecurityException e5) {
                    e222 = e5;
                    glk.d("Babel_SMS", "DatabaseMessages.MmsPart.loadVideo: failed to load video", e222);
                    i = 0;
                    if (i != 0) {
                        frameAtTime = mediaMetadataRetriever.getFrameAtTime(-1);
                        this.i = mediaMetadataRetriever.extractMetadata(12);
                        this.l = frameAtTime.getWidth();
                        this.m = frameAtTime.getHeight();
                        mediaMetadataRetriever.release();
                    }
                    this.n = fyi.a(d());
                }
                if (i != 0) {
                    frameAtTime = mediaMetadataRetriever.getFrameAtTime(-1);
                    this.i = mediaMetadataRetriever.extractMetadata(12);
                    this.l = frameAtTime.getWidth();
                    this.m = frameAtTime.getHeight();
                    mediaMetadataRetriever.release();
                }
            }
            this.n = fyi.a(d());
        }
    }

    public static fxq a(Cursor cursor, boolean z) {
        fxq fxq = new fxq();
        fxq.b(cursor, z);
        return fxq;
    }

    public boolean a() {
        return "text/plain".equals(this.i) || "text/html".equals(this.i) || "application/vnd.wap.xhtml+xml".equals(this.i);
    }

    public boolean b() {
        return ba.b(this.i) || ba.d(this.i) || ba.c(this.i) || ba.e(this.i);
    }

    public boolean c() {
        return ba.b(this.i);
    }

    public Uri d() {
        return Uri.parse("content://mms/part/" + this.g);
    }

    private void e() {
        String valueOf;
        byte[] bArr = null;
        Object obj = null;
        if ("text/plain".equals(this.i) || "application/smil".equals(this.i) || "text/html".equals(this.i)) {
            obj = 1;
        }
        if (obj == null) {
            ContentResolver contentResolver = gwb.H().getContentResolver();
            Uri d = d();
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                InputStream openInputStream = contentResolver.openInputStream(d);
                byte[] bArr2 = new byte[256];
                for (int read = openInputStream.read(bArr2); read >= 0; read = openInputStream.read(bArr2)) {
                    byteArrayOutputStream.write(bArr2, 0, read);
                }
                if (openInputStream != null) {
                    try {
                        openInputStream.close();
                    } catch (Throwable e) {
                        valueOf = String.valueOf(e);
                        glk.d("Babel_SMS", new StringBuilder(String.valueOf(valueOf).length() + 45).append("DatabaseMessages.MmsPart: close file failed: ").append(valueOf).toString(), e);
                    }
                }
            } catch (Throwable e2) {
                String valueOf2 = String.valueOf(e2);
                glk.d("Babel_SMS", new StringBuilder(String.valueOf(valueOf2).length() + 57).append("DatabaseMessages.MmsPart: loading text from file failed: ").append(valueOf2).toString(), e2);
                if (bArr != null) {
                    try {
                        bArr.close();
                    } catch (Throwable e22) {
                        valueOf = String.valueOf(e22);
                        glk.d("Babel_SMS", new StringBuilder(String.valueOf(valueOf).length() + 45).append("DatabaseMessages.MmsPart: close file failed: ").append(valueOf).toString(), e22);
                    }
                }
            } catch (Throwable th) {
                if (bArr != null) {
                    try {
                        bArr.close();
                    } catch (Throwable e3) {
                        String valueOf3 = String.valueOf(e3);
                        glk.d("Babel_SMS", new StringBuilder(String.valueOf(valueOf3).length() + 45).append("DatabaseMessages.MmsPart: close file failed: ").append(valueOf3).toString(), e3);
                    }
                }
            }
            bArr = byteArrayOutputStream.toByteArray();
        } else if (!TextUtils.isEmpty(this.j)) {
            bArr = gwb.c(this.j, this.k);
        }
        if (bArr != null && bArr.length > 0) {
            this.n = (long) bArr.length;
            this.j = gwb.a(bArr, this.k);
        }
    }
}
