package p000;

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
    static final Pattern f806a = Pattern.compile("^(?:.*;)?base64,.*");
    public static final int f807b;

    static {
        if (VERSION.SDK_INT >= 11) {
            f807b = ahp.f813c;
        } else if (((long) agp.f644a) >= 32) {
            f807b = ahp.f813c;
        } else if (((long) agp.f644a) >= 24) {
            f807b = ahp.f812b;
        } else {
            f807b = ahp.f811a;
        }
    }

    public static ahk m1340a(ContentResolver contentResolver, Uri uri, int i) {
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
            ahn.m1341a(aho, null, options);
            Point point = new Point(options.outWidth, options.outHeight);
            options = new Options();
            options.inSampleSize = Math.max(point.x / i, point.y / i);
            ahk.f792b = ahn.m1341a(aho, null, options);
            ahk.f793c = 0;
            return ahk;
        } catch (FileNotFoundException e) {
            return ahk;
        } catch (IOException e2) {
            ahk.f793c = 1;
            return ahk;
        } catch (IllegalArgumentException e3) {
            return ahk;
        } catch (SecurityException e4) {
            ahk.f793c = 1;
            return ahk;
        }
    }

    private static Bitmap m1341a(ahq ahq, Rect rect, Options options) {
        InputStream a;
        Throwable e;
        InputStream a2;
        try {
            int a3;
            a2 = ahq.mo219a();
            try {
                a3 = gwb.m1505a(a2, -1);
                if (a2 != null) {
                    a2.close();
                }
                a = ahq.mo219a();
            } catch (OutOfMemoryError e2) {
                e = e2;
                try {
                    Log.e("ImageUtils", "ImageUtils#decodeStream(InputStream, Rect, Options) threw an OOME", e);
                    if (a2 != null) {
                        try {
                            a2.close();
                        } catch (IOException e3) {
                        }
                    }
                    return null;
                } catch (Throwable th) {
                    e = th;
                    a = a2;
                    if (a != null) {
                        try {
                            a.close();
                        } catch (IOException e4) {
                        }
                    }
                    throw e;
                }
            } catch (IOException e5) {
                e = e5;
                a = a2;
                try {
                    Log.e("ImageUtils", "ImageUtils#decodeStream(InputStream, Rect, Options) threw an IOE", e);
                    if (a != null) {
                        try {
                            a.close();
                        } catch (IOException e6) {
                        }
                    }
                    return null;
                } catch (Throwable th2) {
                    e = th2;
                    if (a != null) {
                        a.close();
                    }
                    throw e;
                }
            }
            try {
                Bitmap decodeStream = BitmapFactory.decodeStream(a, null, options);
                if (a != null && decodeStream == null && !options.inJustDecodeBounds) {
                    throw new UnsupportedOperationException("Image bytes cannot be decoded into a Bitmap.");
                } else if (decodeStream != null && a3 != 0) {
                    Matrix matrix = new Matrix();
                    matrix.postRotate((float) a3);
                    decodeStream = Bitmap.createBitmap(decodeStream, 0, 0, decodeStream.getWidth(), decodeStream.getHeight(), matrix, true);
                    if (a == null) {
                        return decodeStream;
                    }
                    try {
                        a.close();
                        return decodeStream;
                    } catch (IOException e7) {
                        return decodeStream;
                    }
                } else if (a == null) {
                    return decodeStream;
                } else {
                    try {
                        a.close();
                        return decodeStream;
                    } catch (IOException e8) {
                        return decodeStream;
                    }
                }
            } catch (OutOfMemoryError e9) {
                e = e9;
                a2 = a;
                Log.e("ImageUtils", "ImageUtils#decodeStream(InputStream, Rect, Options) threw an OOME", e);
                if (a2 != null) {
                    a2.close();
                }
                return null;
            } catch (IOException e10) {
                e = e10;
                Log.e("ImageUtils", "ImageUtils#decodeStream(InputStream, Rect, Options) threw an IOE", e);
                if (a != null) {
                    a.close();
                }
                return null;
            }
        } catch (OutOfMemoryError e11) {
            e = e11;
            a2 = null;
            Log.e("ImageUtils", "ImageUtils#decodeStream(InputStream, Rect, Options) threw an OOME", e);
            if (a2 != null) {
                a2.close();
            }
            return null;
        } catch (IOException e12) {
            e = e12;
            a = null;
            Log.e("ImageUtils", "ImageUtils#decodeStream(InputStream, Rect, Options) threw an IOE", e);
            if (a != null) {
                a.close();
            }
            return null;
        } catch (Throwable th3) {
            e = th3;
            a = null;
            if (a != null) {
                a.close();
            }
            throw e;
        }
    }
}
