import android.content.ContentResolver;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build.VERSION;
import android.util.Log;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.regex.Pattern;

public final class ahn {
    static final Pattern a;
    public static final int b;

    static {
        a = Pattern.compile("^(?:.*;)?base64,.*");
        if (VERSION.SDK_INT >= 11) {
            b = ahp.c;
        } else if (((long) agp.a) >= 32) {
            b = ahp.c;
        } else if (((long) agp.a) >= 24) {
            b = ahp.b;
        } else {
            b = ahp.a;
        }
    }

    public static ahk a(ContentResolver contentResolver, Uri uri, int i) {
        ahq aho;
        ahk ahk = new ahk();
        if ("data".equals(uri.getScheme())) {
            aho = new aho(contentResolver, uri);
        } else {
            aho = new ahq(contentResolver, uri);
        }
        try {
            Options options = new Options();
            options.inJustDecodeBounds = true;
            a(aho, null, options);
            Point point = new Point(options.outWidth, options.outHeight);
            options = new Options();
            options.inSampleSize = Math.max(point.x / i, point.y / i);
            ahk.b = a(aho, null, options);
            ahk.c = 0;
            return ahk;
        } catch (FileNotFoundException e) {
            return ahk;
        } catch (IOException e2) {
            ahk.c = 1;
            return ahk;
        } catch (IllegalArgumentException e3) {
            return ahk;
        } catch (SecurityException e4) {
            ahk.c = 1;
            return ahk;
        }
    }

    private static Bitmap a(ahq ahq, Rect rect, Options options) {
        InputStream a;
        Throwable e;
        InputStream a2;
        try {
            int a3;
            a = ahq.a();
            try {
                a3 = gwb.a(a, -1);
                if (a != null) {
                    a.close();
                }
                a2 = ahq.a();
            } catch (OutOfMemoryError e2) {
                e = e2;
                try {
                    Log.e("ImageUtils", "ImageUtils#decodeStream(InputStream, Rect, Options) threw an OOME", e);
                    if (a != null) {
                        try {
                            a.close();
                        } catch (IOException e3) {
                        }
                    }
                    return null;
                } catch (Throwable th) {
                    e = th;
                    a2 = a;
                    if (a2 != null) {
                        try {
                            a2.close();
                        } catch (IOException e4) {
                        }
                    }
                    throw e;
                }
            } catch (IOException e5) {
                e = e5;
                a2 = a;
                try {
                    Log.e("ImageUtils", "ImageUtils#decodeStream(InputStream, Rect, Options) threw an IOE", e);
                    if (a2 != null) {
                        try {
                            a2.close();
                        } catch (IOException e6) {
                        }
                    }
                    return null;
                } catch (Throwable th2) {
                    e = th2;
                    if (a2 != null) {
                        a2.close();
                    }
                    throw e;
                }
            }
            try {
                Bitmap decodeStream = BitmapFactory.decodeStream(a2, null, options);
                if (a2 != null && decodeStream == null && !options.inJustDecodeBounds) {
                    throw new UnsupportedOperationException("Image bytes cannot be decoded into a Bitmap.");
                } else if (decodeStream != null && a3 != 0) {
                    Matrix matrix = new Matrix();
                    matrix.postRotate((float) a3);
                    decodeStream = Bitmap.createBitmap(decodeStream, 0, 0, decodeStream.getWidth(), decodeStream.getHeight(), matrix, true);
                    if (a2 == null) {
                        return decodeStream;
                    }
                    try {
                        a2.close();
                        return decodeStream;
                    } catch (IOException e7) {
                        return decodeStream;
                    }
                } else if (a2 == null) {
                    return decodeStream;
                } else {
                    try {
                        a2.close();
                        return decodeStream;
                    } catch (IOException e8) {
                        return decodeStream;
                    }
                }
            } catch (OutOfMemoryError e9) {
                e = e9;
                a = a2;
                Log.e("ImageUtils", "ImageUtils#decodeStream(InputStream, Rect, Options) threw an OOME", e);
                if (a != null) {
                    a.close();
                }
                return null;
            } catch (IOException e10) {
                e = e10;
                Log.e("ImageUtils", "ImageUtils#decodeStream(InputStream, Rect, Options) threw an IOE", e);
                if (a2 != null) {
                    a2.close();
                }
                return null;
            }
        } catch (OutOfMemoryError e11) {
            e = e11;
            a = null;
            Log.e("ImageUtils", "ImageUtils#decodeStream(InputStream, Rect, Options) threw an OOME", e);
            if (a != null) {
                a.close();
            }
            return null;
        } catch (IOException e12) {
            e = e12;
            a2 = null;
            Log.e("ImageUtils", "ImageUtils#decodeStream(InputStream, Rect, Options) threw an IOE", e);
            if (a2 != null) {
                a2.close();
            }
            return null;
        } catch (Throwable th3) {
            e = th3;
            a2 = null;
            if (a2 != null) {
                a2.close();
            }
            throw e;
        }
    }
}
