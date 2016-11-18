package p000;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.media.CamcorderProfile;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Environment;
import android.provider.MediaStore.Images;
import android.provider.MediaStore.Video.Media;
import com.google.android.apps.hangouts.content.EsProvider;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Random;

public final class ccy {
    private static final boolean f5027a = false;
    private static CamcorderProfile f5028b;

    static {
        kae kae = glk.f15570q;
        try {
            f5028b = CamcorderProfile.get(1);
        } catch (RuntimeException e) {
            f5028b = null;
        }
    }

    public static String m7225a(int i) {
        switch (i) {
            case 1:
                return "camera-p.jpg";
            case 2:
                if (f5028b == null) {
                    return "";
                }
                int i2 = f5028b.fileFormat;
                if (i2 == 2) {
                    return "camera-p.mp4";
                }
                if (i2 == 1) {
                    return "camera-p.3gp";
                }
                glk.m17981d("Babel", "Saved video file is not mp4 or 3gpp", new Object[0]);
                return "camera-p.3gp";
            default:
                return "";
        }
    }

    public static boolean m7229a(Uri uri) {
        if (uri.getLastPathSegment().equals(ccy.m7225a(1)) || uri.getLastPathSegment().equals(ccy.m7225a(2))) {
            return true;
        }
        return false;
    }

    private static File m7223a() {
        File file = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES), "Hangouts");
        if (file.exists() || file.mkdirs()) {
            return file;
        }
        String str = "Babel_TempMediaFileUtil";
        String str2 = "Create Directory failed: ";
        String valueOf = String.valueOf(file.getPath());
        glk.m17981d(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2), new Object[0]);
        return null;
    }

    public static String m7231b(Uri uri) {
        File a = ccy.m7223a();
        if (a == null) {
            return null;
        }
        String a2 = ccy.m7226a("yyyyMMdd_HHmmss");
        String str = ".jpg";
        String lastPathSegment = uri.getLastPathSegment();
        int lastIndexOf = lastPathSegment.lastIndexOf(46);
        if (lastIndexOf >= 0) {
            str = lastPathSegment.substring(lastIndexOf);
        }
        String valueOf = String.valueOf("image-");
        File file = new File(a, new StringBuilder(((String.valueOf(valueOf).length() + 0) + String.valueOf(a2).length()) + String.valueOf(str).length()).append(valueOf).append(a2).append(str).toString());
        try {
            mrg.m32753a(new File(uri.getPath()), file);
            return file.getPath();
        } catch (Throwable e) {
            glk.m17978c("Babel_TempMediaFileUtil", "Failed to copy an image file.", e);
            return null;
        }
    }

    public static File m7224a(bxo bxo) {
        String str;
        String a = ccy.m7226a("yyyyMMdd_HHmmss");
        int i = bxo == bxo.VIDEO ? 1 : 0;
        String str2 = i != 0 ? "video-" : "image-";
        if (i == 0) {
            str = ".jpg";
        } else if (f5028b != null) {
            int i2 = f5028b.fileFormat;
            if (i2 == 2) {
                str = ".mp4";
            } else if (i2 == 1) {
                str = ".3gp";
            } else {
                glk.m17981d("Babel", "Saved video file is not mp4 or 3gp", new Object[0]);
                str = ".3gp";
            }
        } else {
            str = ".3gp";
        }
        return new File(ccy.m7223a(), new StringBuilder(((String.valueOf(str2).length() + 0) + String.valueOf(a).length()) + String.valueOf(str).length()).append(str2).append(a).append(str).toString());
    }

    private static String m7226a(String str) {
        return new SimpleDateFormat(str, Locale.getDefault()).format(new Date());
    }

    public static bxy m7222a(Context context, int i, bxo bxo, File file, String str, String str2) {
        gwb.aK();
        File file2 = new File(null, str);
        if (!file2.exists()) {
            return null;
        }
        return ccy.m7221a(context, i, bxo, Uri.fromFile(file2), file2.getName(), str2);
    }

    public static bxy m7221a(Context context, int i, bxo bxo, Uri uri, String str, String str2) {
        gwb.aK();
        bxy bxy = new bxy();
        bxy.b = str;
        if (!ccy.m7230a(uri, context, i, bxy)) {
            return null;
        }
        ContentResolver contentResolver = context.getContentResolver();
        if (str2 != null) {
            bxy.d = str2;
        } else {
            String str3;
            if (bxo == bxo.VIDEO) {
                str3 = "video/*";
            } else {
                str3 = "image/*";
            }
            bxy.d = gkd.m17874a(contentResolver, uri, str3);
        }
        if (bxo != bxo.NONE) {
            bxy.c = bxo;
        } else if (ba.m4630d(bxy.d)) {
            bxy.c = bxo.VIDEO;
        } else {
            bxy.c = bxo.PHOTO;
        }
        if (bxy.c == bxo.VIDEO) {
            ccy.m7227a(uri, contentResolver, context, bxy);
        } else if (bxy.c == bxo.PHOTO) {
            ccy.m7228a(uri, contentResolver, bxy);
        }
        return bxy;
    }

    private static boolean m7230a(Uri uri, Context context, int i, bxy bxy) {
        Throwable e;
        Throwable e2;
        String str;
        String str2;
        String valueOf;
        OutputStream outputStream = null;
        gwb.aK();
        ContentResolver contentResolver = context.getContentResolver();
        InputStream openInputStream;
        try {
            openInputStream = contentResolver.openInputStream(uri);
            try {
                Uri a = EsProvider.m8248a(i, Math.abs(new Random().nextLong()));
                outputStream = contentResolver.openOutputStream(a);
                long j = 0;
                byte[] bArr = new byte[1024];
                while (true) {
                    int read = openInputStream.read(bArr, 0, 1024);
                    if (read == -1) {
                        break;
                    }
                    outputStream.write(bArr, 0, read);
                    j += (long) read;
                }
                bxy.f4761j = j;
                bxy.a = a.toString();
                if (outputStream != null) {
                    try {
                        outputStream.close();
                    } catch (Throwable e3) {
                        glk.m17978c("Babel_TempMediaFileUtil", "Exception closing", e3);
                    }
                }
                if (openInputStream != null) {
                    try {
                        openInputStream.close();
                    } catch (Throwable e32) {
                        glk.m17978c("Babel_TempMediaFileUtil", "Exception closing", e32);
                    }
                }
                return true;
            } catch (MalformedURLException e4) {
                e2 = e4;
                try {
                    str = "Babel_TempMediaFileUtil";
                    str2 = "Gallery picker: bad url ";
                    valueOf = String.valueOf(uri.toString());
                    glk.m17980d(str, valueOf.length() == 0 ? str2.concat(valueOf) : new String(str2), e2);
                    if (outputStream != null) {
                        try {
                            outputStream.close();
                        } catch (Throwable e22) {
                            glk.m17978c("Babel_TempMediaFileUtil", "Exception closing", e22);
                        }
                    }
                    if (openInputStream != null) {
                        return false;
                    }
                    try {
                        openInputStream.close();
                        return false;
                    } catch (Throwable e222) {
                        glk.m17978c("Babel_TempMediaFileUtil", "Exception closing", e222);
                        return false;
                    }
                } catch (Throwable th) {
                    e32 = th;
                    if (outputStream != null) {
                        try {
                            outputStream.close();
                        } catch (Throwable e2222) {
                            glk.m17978c("Babel_TempMediaFileUtil", "Exception closing", e2222);
                        }
                    }
                    if (openInputStream != null) {
                        try {
                            openInputStream.close();
                        } catch (Throwable e22222) {
                            glk.m17978c("Babel_TempMediaFileUtil", "Exception closing", e22222);
                        }
                    }
                    throw e32;
                }
            } catch (IOException e5) {
                e22222 = e5;
                glk.m17980d("Babel_TempMediaFileUtil", "Gallery picker: IOEx loading image", e22222);
                if (outputStream != null) {
                    try {
                        outputStream.close();
                    } catch (Throwable e222222) {
                        glk.m17978c("Babel_TempMediaFileUtil", "Exception closing", e222222);
                    }
                }
                if (openInputStream != null) {
                    return false;
                }
                try {
                    openInputStream.close();
                    return false;
                } catch (Throwable e2222222) {
                    glk.m17978c("Babel_TempMediaFileUtil", "Exception closing", e2222222);
                    return false;
                }
            }
        } catch (MalformedURLException e6) {
            e2222222 = e6;
            openInputStream = outputStream;
            str = "Babel_TempMediaFileUtil";
            str2 = "Gallery picker: bad url ";
            valueOf = String.valueOf(uri.toString());
            if (valueOf.length() == 0) {
            }
            glk.m17980d(str, valueOf.length() == 0 ? str2.concat(valueOf) : new String(str2), e2222222);
            if (outputStream != null) {
                outputStream.close();
            }
            if (openInputStream != null) {
                return false;
            }
            openInputStream.close();
            return false;
        } catch (IOException e7) {
            e2222222 = e7;
            openInputStream = outputStream;
            glk.m17980d("Babel_TempMediaFileUtil", "Gallery picker: IOEx loading image", e2222222);
            if (outputStream != null) {
                outputStream.close();
            }
            if (openInputStream != null) {
                return false;
            }
            openInputStream.close();
            return false;
        } catch (Throwable th2) {
            e32 = th2;
            Object obj = outputStream;
            if (outputStream != null) {
                outputStream.close();
            }
            if (openInputStream != null) {
                openInputStream.close();
            }
            throw e32;
        }
    }

    public static void m7227a(Uri uri, ContentResolver contentResolver, Context context, bxy bxy) {
        gwb.aK();
        ba.m4577a(bxy.c == bxo.VIDEO);
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        mediaMetadataRetriever.setDataSource(context, uri);
        String extractMetadata = mediaMetadataRetriever.extractMetadata(18);
        String extractMetadata2 = mediaMetadataRetriever.extractMetadata(19);
        String extractMetadata3 = mediaMetadataRetriever.extractMetadata(9);
        String str = null;
        if (VERSION.SDK_INT >= 17) {
            str = mediaMetadataRetriever.extractMetadata(24);
        }
        try {
            int a;
            bxy.f4757f = Integer.parseInt(extractMetadata2);
            bxy.f4758g = Integer.parseInt(extractMetadata);
            bxy.f4760i = Integer.parseInt(extractMetadata3);
            if (str == null) {
                a = gkd.m17869a(contentResolver, uri);
            } else {
                a = Integer.parseInt(str);
            }
            bxy.f4759h = a;
        } catch (NumberFormatException e) {
            bxy.f4757f = 0;
            bxy.f4758g = 0;
            bxy.f4760i = 0;
            bxy.f4759h = 0;
            glk.m17981d("Babel", "Failed to parse video column strings", new Object[0]);
        }
    }

    private static int m7219a(Uri uri, ContentResolver contentResolver) {
        InputStream inputStream = null;
        try {
            inputStream = contentResolver.openInputStream(uri);
            int a = gwb.m1505a(inputStream, -1);
            if (inputStream == null) {
                return a;
            }
            try {
                inputStream.close();
                return a;
            } catch (Throwable e) {
                glk.m17978c("Babel_TempMediaFileUtil", "Exception closing", e);
                return a;
            }
        } catch (Throwable e2) {
            String valueOf = String.valueOf(uri);
            glk.m17980d("Babel_TempMediaFileUtil", new StringBuilder(String.valueOf(valueOf).length() + 35).append("Error figuring out orientation for ").append(valueOf).toString(), e2);
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Throwable e22) {
                    glk.m17978c("Babel_TempMediaFileUtil", "Exception closing", e22);
                }
            }
            return 0;
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Throwable e3) {
                    glk.m17978c("Babel_TempMediaFileUtil", "Exception closing", e3);
                }
            }
        }
    }

    public static void m7228a(Uri uri, ContentResolver contentResolver, bxy bxy) {
        InputStream openInputStream;
        Throwable e;
        gwb.aK();
        ba.m4577a(bxy.c == bxo.PHOTO);
        bxy.f4759h = ccy.m7219a(uri, contentResolver);
        Options options = new Options();
        options.inJustDecodeBounds = true;
        try {
            openInputStream = contentResolver.openInputStream(uri);
            try {
                BitmapFactory.decodeStream(openInputStream, null, options);
                bxy.f4757f = options.outHeight;
                bxy.f4758g = options.outWidth;
                if (openInputStream != null) {
                    try {
                        openInputStream.close();
                    } catch (Throwable e2) {
                        glk.m17978c("Babel_TempMediaFileUtil", "Exception closing", e2);
                    }
                }
            } catch (IOException e3) {
                e2 = e3;
                try {
                    glk.m17980d("Babel_TempMediaFileUtil", "TempMediaFileUtil: IOEx loading image", e2);
                    if (openInputStream != null) {
                        try {
                            openInputStream.close();
                        } catch (Throwable e22) {
                            glk.m17978c("Babel_TempMediaFileUtil", "Exception closing", e22);
                        }
                    }
                } catch (Throwable th) {
                    e22 = th;
                    if (openInputStream != null) {
                        try {
                            openInputStream.close();
                        } catch (Throwable e4) {
                            glk.m17978c("Babel_TempMediaFileUtil", "Exception closing", e4);
                        }
                    }
                    throw e22;
                }
            }
        } catch (IOException e5) {
            e22 = e5;
            openInputStream = null;
            glk.m17980d("Babel_TempMediaFileUtil", "TempMediaFileUtil: IOEx loading image", e22);
            if (openInputStream != null) {
                openInputStream.close();
            }
        } catch (Throwable th2) {
            e22 = th2;
            openInputStream = null;
            if (openInputStream != null) {
                openInputStream.close();
            }
            throw e22;
        }
    }

    public static Uri m7220a(ContentResolver contentResolver, String str, bxo bxo) {
        int i = bxo == bxo.VIDEO ? 1 : 0;
        Uri uri = i != 0 ? Media.EXTERNAL_CONTENT_URI : Images.Media.EXTERNAL_CONTENT_URI;
        Cursor query = contentResolver.query(uri, new String[]{"_id"}, "_data = ?", new String[]{str}, null);
        if (query != null && query.moveToFirst()) {
            return Uri.withAppendedPath(uri, query.getString(0));
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("_data", str);
        Uri insert = contentResolver.insert(uri, contentValues);
        if (insert != null) {
            return insert;
        }
        glk.m17981d("Babel_TempMediaFileUtil", "Insert to media store failed!", new Object[0]);
        if (i != 0) {
            insert = Media.getContentUri("phoneStorage");
        } else {
            insert = Images.Media.getContentUri("phoneStorage");
        }
        return contentResolver.insert(insert, contentValues);
    }
}
