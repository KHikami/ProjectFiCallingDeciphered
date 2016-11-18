package p000;

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
    public static final String[] f14290a = new String[]{"_id", "mid", "chset", "ct", "text"};
    public static final int f14291b = 0;
    public static final int f14292c;
    public static final int f14293d;
    public static final int f14294e;
    public static final int f14295f;
    private static int f14296o;
    public long f14297g;
    public long f14298h;
    public String f14299i;
    public String f14300j;
    public int f14301k;
    public int f14302l;
    public int f14303m;
    public long f14304n;

    static {
        f14296o = 0;
        f14296o = 1;
        int i = f14296o;
        f14296o = i + 1;
        f14292c = i;
        i = f14296o;
        f14296o = i + 1;
        f14293d = i;
        i = f14296o;
        f14296o = i + 1;
        f14294e = i;
        i = f14296o;
        f14296o = i + 1;
        f14295f = i;
    }

    private void m16500b(Cursor cursor, boolean z) {
        Throwable e;
        Bitmap frameAtTime;
        InputStream inputStream = null;
        int i = 1;
        this.f14297g = cursor.getLong(f14291b);
        this.f14298h = cursor.getLong(f14292c);
        this.f14299i = cursor.getString(f14294e);
        this.f14300j = cursor.getString(f14295f);
        this.f14301k = cursor.getInt(f14293d);
        this.f14302l = 0;
        this.f14303m = 0;
        this.f14304n = 0;
        if (!m16503b()) {
            m16501e();
        } else if (z) {
            if (ba.m4613b(this.f14299i)) {
                ContentResolver contentResolver = gwb.m1400H().getContentResolver();
                Uri d = m16505d();
                try {
                    inputStream = contentResolver.openInputStream(d);
                    Options options = new Options();
                    options.inJustDecodeBounds = true;
                    BitmapFactory.decodeStream(inputStream, null, options);
                    this.f14299i = options.outMimeType;
                    this.f14302l = options.outWidth;
                    this.f14303m = options.outHeight;
                    if (TextUtils.isEmpty(this.f14299i)) {
                        String path = d.getPath();
                        MimeTypeMap singleton = MimeTypeMap.getSingleton();
                        String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(path);
                        if (TextUtils.isEmpty(fileExtensionFromUrl)) {
                            int lastIndexOf = path.lastIndexOf(46);
                            if (lastIndexOf >= 0) {
                                fileExtensionFromUrl = path.substring(lastIndexOf + 1);
                            }
                        }
                        this.f14299i = singleton.getMimeTypeFromExtension(fileExtensionFromUrl);
                    }
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (Throwable e2) {
                            Log.e("Babel_SMS", "IOException caught while closing stream", e2);
                        }
                    }
                } catch (Throwable e22) {
                    glk.m17980d("Babel_SMS", "DatabaseMessages.MmsPart.loadImage: file not found", e22);
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
            } else if (ba.m4630d(this.f14299i) && fyi.m16612a()) {
                Context H = gwb.m1400H();
                Uri d2 = m16505d();
                MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                try {
                    mediaMetadataRetriever.setDataSource(H, d2);
                } catch (IllegalArgumentException e4) {
                    e222 = e4;
                    glk.m17980d("Babel_SMS", "DatabaseMessages.MmsPart.loadVideo: failed to load video", e222);
                    i = 0;
                    if (i != 0) {
                        frameAtTime = mediaMetadataRetriever.getFrameAtTime(-1);
                        this.f14299i = mediaMetadataRetriever.extractMetadata(12);
                        this.f14302l = frameAtTime.getWidth();
                        this.f14303m = frameAtTime.getHeight();
                        mediaMetadataRetriever.release();
                    }
                    this.f14304n = fyi.m16584a(m16505d());
                } catch (SecurityException e5) {
                    e222 = e5;
                    glk.m17980d("Babel_SMS", "DatabaseMessages.MmsPart.loadVideo: failed to load video", e222);
                    i = 0;
                    if (i != 0) {
                        frameAtTime = mediaMetadataRetriever.getFrameAtTime(-1);
                        this.f14299i = mediaMetadataRetriever.extractMetadata(12);
                        this.f14302l = frameAtTime.getWidth();
                        this.f14303m = frameAtTime.getHeight();
                        mediaMetadataRetriever.release();
                    }
                    this.f14304n = fyi.m16584a(m16505d());
                }
                if (i != 0) {
                    frameAtTime = mediaMetadataRetriever.getFrameAtTime(-1);
                    this.f14299i = mediaMetadataRetriever.extractMetadata(12);
                    this.f14302l = frameAtTime.getWidth();
                    this.f14303m = frameAtTime.getHeight();
                    mediaMetadataRetriever.release();
                }
            }
            this.f14304n = fyi.m16584a(m16505d());
        }
    }

    public static fxq m16499a(Cursor cursor, boolean z) {
        fxq fxq = new fxq();
        fxq.m16500b(cursor, z);
        return fxq;
    }

    public boolean m16502a() {
        return "text/plain".equals(this.f14299i) || "text/html".equals(this.f14299i) || "application/vnd.wap.xhtml+xml".equals(this.f14299i);
    }

    public boolean m16503b() {
        return ba.m4613b(this.f14299i) || ba.m4630d(this.f14299i) || ba.m4623c(this.f14299i) || ba.m4636e(this.f14299i);
    }

    public boolean m16504c() {
        return ba.m4613b(this.f14299i);
    }

    public Uri m16505d() {
        return Uri.parse("content://mms/part/" + this.f14297g);
    }

    private void m16501e() {
        String valueOf;
        byte[] bArr = null;
        Object obj = null;
        if ("text/plain".equals(this.f14299i) || "application/smil".equals(this.f14299i) || "text/html".equals(this.f14299i)) {
            obj = 1;
        }
        if (obj == null) {
            ContentResolver contentResolver = gwb.m1400H().getContentResolver();
            Uri d = m16505d();
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
                        glk.m17980d("Babel_SMS", new StringBuilder(String.valueOf(valueOf).length() + 45).append("DatabaseMessages.MmsPart: close file failed: ").append(valueOf).toString(), e);
                    }
                }
            } catch (Throwable e2) {
                String valueOf2 = String.valueOf(e2);
                glk.m17980d("Babel_SMS", new StringBuilder(String.valueOf(valueOf2).length() + 57).append("DatabaseMessages.MmsPart: loading text from file failed: ").append(valueOf2).toString(), e2);
                if (bArr != null) {
                    try {
                        bArr.close();
                    } catch (Throwable e22) {
                        valueOf = String.valueOf(e22);
                        glk.m17980d("Babel_SMS", new StringBuilder(String.valueOf(valueOf).length() + 45).append("DatabaseMessages.MmsPart: close file failed: ").append(valueOf).toString(), e22);
                    }
                }
            } catch (Throwable th) {
                if (bArr != null) {
                    try {
                        bArr.close();
                    } catch (Throwable e3) {
                        String valueOf3 = String.valueOf(e3);
                        glk.m17980d("Babel_SMS", new StringBuilder(String.valueOf(valueOf3).length() + 45).append("DatabaseMessages.MmsPart: close file failed: ").append(valueOf3).toString(), e3);
                    }
                }
            }
            bArr = byteArrayOutputStream.toByteArray();
        } else if (!TextUtils.isEmpty(this.f14300j)) {
            bArr = gwb.m2118c(this.f14300j, this.f14301k);
        }
        if (bArr != null && bArr.length > 0) {
            this.f14304n = (long) bArr.length;
            this.f14300j = gwb.m1676a(bArr, this.f14301k);
        }
    }
}
