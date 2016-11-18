package p000;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetFileDescriptor;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Environment;
import android.provider.Telephony.Carriers;
import android.provider.Telephony.Mms;
import android.provider.Telephony.Mms.Inbox;
import android.provider.Telephony.Mms.Sent;
import android.provider.Telephony.Sms;
import android.provider.Telephony.Threads;
import android.telephony.SmsMessage;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.widget.Toast;
import com.google.api.client.http.HttpStatusCodes;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;

public final class fyi {
    public static String f14368a = Character.toString('|');
    static final Uri f14369b;
    public static final Uri f14370c = Uri.parse("content://mms/part");
    private static final boolean f14371d = false;
    private static String[] f14372e;
    private static final Uri f14373f;
    private static final Uri f14374g;
    private static final Uri f14375h;
    private static final Uri f14376i;
    private static final Uri f14377j;
    private static final Uri f14378k;
    private static final Uri f14379l;
    private static final String[] f14380m = new String[]{"_id", "recipient_ids"};
    private static final Uri f14381n = Uri.parse("content://mms-sms/canonical-address");
    private static final String[] f14382o = new String[]{"date_sent"};
    private static Boolean f14383p = null;
    private static final String[] f14384q = new String[]{"mmsc"};
    private static Boolean f14385r;

    static {
        Uri uri;
        kae kae = glk.f15571r;
        if (VERSION.SDK_INT >= 19) {
            uri = Mms.CONTENT_URI;
        } else {
            uri = Uri.parse("content://mms");
        }
        f14373f = uri;
        if (VERSION.SDK_INT >= 19) {
            uri = Inbox.CONTENT_URI;
        } else {
            uri = Uri.parse("content://mms/inbox");
        }
        f14374g = uri;
        if (VERSION.SDK_INT >= 19) {
            uri = Sent.CONTENT_URI;
        } else {
            uri = Uri.parse("content://mms/sent");
        }
        f14375h = uri;
        if (VERSION.SDK_INT >= 19) {
            uri = Sms.CONTENT_URI;
        } else {
            uri = Uri.parse("content://sms");
        }
        f14376i = uri;
        if (VERSION.SDK_INT >= 19) {
            uri = Sms.Sent.CONTENT_URI;
        } else {
            uri = Uri.parse("content://sms/sent");
        }
        f14377j = uri;
        if (VERSION.SDK_INT >= 19) {
            uri = Carriers.CONTENT_URI;
        } else {
            uri = Uri.parse("content://telephony/carriers");
        }
        f14369b = uri;
        if (VERSION.SDK_INT >= 19) {
            uri = Threads.CONTENT_URI;
        } else {
            uri = Uri.parse("content://mms-sms/conversations");
        }
        f14378k = uri;
        f14379l = uri.buildUpon().appendQueryParameter("simple", "true").build();
    }

    public static boolean m16612a() {
        return VERSION.SDK_INT >= 23;
    }

    public static fyl m16592a(Context context, String str, String str2, String str3, int i, int i2, int i3) {
        CharSequence charSequence;
        int lastIndexOf;
        String str4;
        int l;
        fyl fyl;
        aig aig = new aig();
        int i4 = 0;
        Object obj = str2 != null ? 1 : null;
        if (TextUtils.isEmpty(str)) {
            charSequence = null;
        } else {
            Object obj2;
            if (obj == null) {
                obj2 = 1;
            } else {
                obj2 = null;
            }
            aio aio = new aio();
            aio.m2520a(106);
            aio.m2530e("text/plain".getBytes());
            aio.m2526c("text_0.txt".getBytes());
            lastIndexOf = "text_0.txt".lastIndexOf(".");
            if (lastIndexOf == -1) {
                str4 = "text_0.txt";
            } else {
                str4 = "text_0.txt".substring(0, lastIndexOf);
            }
            aio.m2525b(str4.getBytes());
            aio.m2522a(str.getBytes());
            aig.m2470a(aio);
            if (obj2 != null) {
                fyi.m16607a(aig, String.format(Locale.getDefault(), "<smil><head><layout><root-layout/><region height=\"100%%\" id=\"Text\" left=\"0%%\" top=\"0%%\" width=\"100%%\"/></layout></head><body><par dur=\"8000ms\"><text src=\"%s\" region=\"Text\"/></par></body></smil>", new Object[]{"text_0.txt"}));
            }
            i4 = aio.m2523a().length + 0;
            charSequence = "text_0.txt";
        }
        if (obj != null) {
            String str5;
            String str6;
            if (ba.m4613b(str3)) {
                int i5;
                if (TextUtils.isEmpty(str3)) {
                    str3 = "image/jpeg";
                }
                if (ba.m4613b(str3)) {
                    Uri parse = Uri.parse(str2);
                    int a = fyi.m16582a(context, parse);
                    if (a <= 0) {
                        glk.m17980d("Babel_SMS", "Can't get image", new Exception());
                        i5 = 0;
                    } else {
                        aio aio2;
                        int e = ajf.m2609a().mo2121e() - 1024;
                        lastIndexOf = ajf.m2609a().mo2129m();
                        l = ajf.m2609a().mo2128l();
                        if (i2 > i) {
                            i5 = l;
                        } else {
                            i5 = lastIndexOf;
                            lastIndexOf = l;
                        }
                        if (f14371d) {
                            new StringBuilder(120).append("addPicturePart size: ").append(a).append(" width: ").append(i).append(" widthLimit: ").append(i5).append(" height: ").append(i2).append(" heightLimit: ").append(lastIndexOf);
                        }
                        if (a > e || i > i5 || i2 > lastIndexOf || i3 != 0) {
                            aio aio3 = new aio();
                            byte[] a2 = fyi.m16615a(i3, i5, lastIndexOf, e, parse, context);
                            if (a2 == null) {
                                aio2 = null;
                            } else {
                                aio3.m2522a(a2);
                                aio3.m2530e("image/jpeg".getBytes());
                                aio2 = aio3;
                            }
                            if (aio2 == null) {
                                glk.m17980d("Babel_SMS", "Can't resize image: not enough memory?", new Exception());
                                i5 = 0;
                            } else {
                                i5 = aio2.m2523a().length;
                            }
                        } else {
                            aio2 = new aio();
                            aio2.m2521a(parse);
                            aio2.m2530e(str3.getBytes());
                            i5 = a;
                        }
                        String str7 = "image.jpg";
                        aio2.m2526c(str7.getBytes());
                        lastIndexOf = str7.lastIndexOf(".");
                        if (lastIndexOf == -1) {
                            str4 = str7;
                        } else {
                            str4 = str7.substring(0, lastIndexOf);
                        }
                        aio2.m2525b(str4.getBytes());
                        aig.m2470a(aio2);
                        if (f14371d) {
                            new StringBuilder(32).append("addPicturePart size: ").append(i5);
                        }
                        if (TextUtils.isEmpty(charSequence)) {
                            str5 = "";
                        } else {
                            str5 = String.format(Locale.getDefault(), "<text src=\"%s\" region=\"Text\"/>", new Object[]{charSequence});
                        }
                        fyi.m16607a(aig, String.format(Locale.US, "<smil><head><layout><root-layout width=\"%dpx\" height=\"%dpx\" /><region id=\"Image\" left=\"0\" top=\"0\" width=\"%dpx\" height=\"%dpx\" fit=\"meet\" /></layout></head><body><par dur=\"5000ms\"><img src=\"%s\" region=\"Image\" />%s</par></body></smil>", new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i), Integer.valueOf(i2), str7, str5}));
                    }
                } else {
                    str6 = "Babel_SMS";
                    str4 = "Unsupported image contentType: ";
                    str5 = String.valueOf(str3);
                    glk.m17980d(str6, str5.length() != 0 ? str4.concat(str5) : new String(str4), new Exception());
                    i5 = 0;
                }
                l = i4 + i5;
            } else if (ba.m4636e(str3)) {
                Uri parse2 = Uri.parse(str2);
                lastIndexOf = fyi.m16582a(context, parse2);
                if (lastIndexOf <= 0) {
                    glk.m17980d("Babel_SMS", "Can't get vcard", new Exception());
                    l = 0;
                } else {
                    aio = new aio();
                    aio.m2521a(parse2);
                    aio.m2530e(str3.getBytes());
                    str6 = "contact.vcf";
                    aio.m2526c(str6.getBytes());
                    l = str6.lastIndexOf(".");
                    if (l == -1) {
                        str5 = str6;
                    } else {
                        str5 = str6.substring(0, l);
                    }
                    aio.m2525b(str5.getBytes());
                    aig.m2470a(aio);
                    if (f14371d) {
                        new StringBuilder(30).append("addVCardPart size: ").append(lastIndexOf);
                    }
                    if (TextUtils.isEmpty(charSequence)) {
                        str5 = "";
                    } else {
                        str5 = String.format(Locale.getDefault(), "<text src=\"%s\" region=\"Text\"/>", new Object[]{charSequence});
                    }
                    fyi.m16607a(aig, String.format(Locale.US, "<smil><head><layout><root-layout width=\"%dpx\" height=\"%dpx\" /></layout></head><body><par dur=\"5000ms\"><ref src=\"%s\" />%s</par></body></smil>", new Object[]{Integer.valueOf(HttpStatusCodes.STATUS_CODE_MULTIPLE_CHOICES), Integer.valueOf(HttpStatusCodes.STATUS_CODE_MULTIPLE_CHOICES), str6, str5}));
                    l = lastIndexOf;
                }
                l += i4;
            } else if (ba.m4630d(str3)) {
                if (i == 0) {
                    i = 320;
                }
                if (i2 == 0) {
                    i2 = 160;
                }
                if (f14371d) {
                    str5 = "addVideoPart attachmentUrl: ";
                    str6 = String.valueOf(str2);
                    if (str6.length() != 0) {
                        str5.concat(str6);
                    } else {
                        str6 = new String(str5);
                    }
                }
                if (TextUtils.isEmpty(str3)) {
                    str3 = "video/3gpp2";
                }
                aio aio4 = new aio();
                Uri parse3 = Uri.parse(str2);
                aio4.m2521a(parse3);
                aio4.m2530e(str3.getBytes());
                str6 = "video.3gp";
                aio4.m2526c(str6.getBytes());
                l = str6.lastIndexOf(".");
                if (l == -1) {
                    str5 = str6;
                } else {
                    str5 = str6.substring(0, l);
                }
                aio4.m2525b(str5.getBytes());
                aig.m2470a(aio4);
                if (TextUtils.isEmpty(charSequence)) {
                    str5 = "";
                } else {
                    str5 = String.format(Locale.getDefault(), "<text src=\"%s\" region=\"Text\"/>", new Object[]{charSequence});
                }
                fyi.m16607a(aig, String.format(Locale.US, "<smil><head><layout><root-layout width=\"%d\" height=\"%d\" /><region id=\"Image\" left=\"0\" top=\"0\" width=\"%dpx\" height=\"%dpx\" fit=\"meet\" /></layout></head><body><par dur=\"8000ms\"><video src=\"%s\" region=\"Image\" />%s</par></body></smil>", new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i), Integer.valueOf(i2), str6, str5}));
                l = ((int) fyi.m16584a(parse3)) + i4;
            }
            fyl = new fyl();
            fyl.f14391b = aig;
            fyl.f14390a = l;
            return fyl;
        }
        l = i4;
        fyl = new fyl();
        fyl.f14391b = aig;
        fyl.f14390a = l;
        return fyl;
    }

    public static fyl m16591a(Context context, String str) {
        aid a = aip.m2541a(context).m2553a(Uri.parse(str));
        if (a instanceof aie) {
            aie aie = (aie) a;
            fyl fyl = new fyl();
            fyl.f14391b = aie.m2456d();
            fyl.f14390a = (int) aie.mo225f();
            return fyl;
        }
        throw new ahz("Invalid PDU type to load");
    }

    private static void m16607a(aig aig, String str) {
        aio aio = new aio();
        aio.m2525b("smil".getBytes());
        aio.m2526c("smil.xml".getBytes());
        aio.m2530e("application/smil".getBytes());
        aio.m2522a(str.getBytes());
        aig.m2469a(0, aio);
    }

    private static int m16582a(Context context, Uri uri) {
        String valueOf;
        String valueOf2;
        int i = 0;
        InputStream inputStream = null;
        try {
            inputStream = context.getContentResolver().openInputStream(uri);
            if (inputStream != null) {
                try {
                    i = inputStream.available();
                } catch (Throwable e) {
                    valueOf = String.valueOf(uri);
                    glk.m17980d("Babel_SMS", new StringBuilder(String.valueOf(valueOf).length() + 31).append("getDataLength couldn't stream: ").append(valueOf).toString(), e);
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (Throwable e2) {
                            valueOf2 = String.valueOf(uri);
                            glk.m17980d("Babel_SMS", new StringBuilder(String.valueOf(valueOf2).length() + 30).append("getDataLength couldn't close: ").append(valueOf2).toString(), e2);
                        }
                    }
                }
            }
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Throwable e22) {
                    valueOf2 = String.valueOf(uri);
                    glk.m17980d("Babel_SMS", new StringBuilder(String.valueOf(valueOf2).length() + 30).append("getDataLength couldn't close: ").append(valueOf2).toString(), e22);
                }
            }
        } catch (Throwable e222) {
            valueOf = String.valueOf(uri);
            glk.m17980d("Babel_SMS", new StringBuilder(String.valueOf(valueOf).length() + 29).append("getDataLength couldn't open: ").append(valueOf).toString(), e222);
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Throwable e2222) {
                    valueOf2 = String.valueOf(uri);
                    glk.m17980d("Babel_SMS", new StringBuilder(String.valueOf(valueOf2).length() + 30).append("getDataLength couldn't close: ").append(valueOf2).toString(), e2222);
                }
            }
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Throwable e22222) {
                    valueOf2 = String.valueOf(uri);
                    glk.m17980d("Babel_SMS", new StringBuilder(String.valueOf(valueOf2).length() + 30).append("getDataLength couldn't close: ").append(valueOf2).toString(), e22222);
                }
            }
        }
        return i;
    }

    public static boolean m16613a(int i, int i2) {
        return (gwb.m2237h(i2) && fyi.m16621b()) || (gwb.m2291l(i2) && fyi.m16627c() && fdq.f12759A.m14370b(i));
    }

    public static boolean m16621b() {
        return ajf.m2609a().mo2136t() && ((fzw) jyn.m25426a(gwb.m1400H(), fzw.class)).mo2170r() && glq.m18023e(gwb.m1400H());
    }

    public static boolean m16627c() {
        return ((fzw) jyn.m25426a(gwb.m1400H(), fzw.class)).mo2171s();
    }

    private static byte[] m16615a(int i, int i2, int i3, int i4, Uri uri, Context context) {
        byte[] a;
        Bitmap createScaledBitmap;
        Throwable th;
        try {
            a = gkd.m17878a(context.getContentResolver().openInputStream(uri));
        } catch (Throwable e) {
            Throwable e2;
            String valueOf = String.valueOf(uri);
            glk.m17980d("Babel_SMS", new StringBuilder(String.valueOf(valueOf).length() + 41).append("Could not open file corresponding to uri ").append(valueOf).toString(), e2);
            a = null;
        }
        if (a == null) {
            return null;
        }
        gix a2 = gkd.m17873a();
        int i5 = 0;
        int i6 = i3;
        int i7 = i2;
        while (i5 < 4) {
            Bitmap bitmap = null;
            Bitmap bitmap2 = null;
            try {
                if (f14371d) {
                    new StringBuilder(61).append("getResizedImageData: decode limit w=").append(i7).append(" h=").append(i6);
                }
                bitmap = a2.m17773b(a, i7, i6, i);
                if (bitmap == null) {
                    if (bitmap != null) {
                        a2.m17771a(bitmap);
                    }
                    return null;
                }
                if (f14371d) {
                    new StringBuilder(56).append("getResizedImageData: decoded w,h=").append(bitmap.getWidth()).append(",").append(bitmap.getHeight());
                }
                try {
                    int width = bitmap.getWidth();
                    int height = bitmap.getHeight();
                    if (width > i2 || height > i3) {
                        double d;
                        double d2 = i2 == 0 ? 1.0d : ((double) width) / ((double) i2);
                        if (i3 == 0) {
                            d = 1.0d;
                        } else {
                            d = ((double) height) / ((double) i3);
                        }
                        d = Math.max(d2, d);
                        createScaledBitmap = Bitmap.createScaledBitmap(bitmap, (int) (((double) width) / d), (int) (((double) height) / d), false);
                    } else {
                        createScaledBitmap = bitmap;
                    }
                    if (createScaledBitmap == null) {
                        if (bitmap != null) {
                            a2.m17771a(bitmap);
                        }
                        if (!(createScaledBitmap == null || createScaledBitmap == bitmap)) {
                            a2.m17771a(createScaledBitmap);
                        }
                        return null;
                    }
                    try {
                        if (f14371d) {
                            new StringBuilder(55).append("getResizedImageData: scaled w,h=").append(createScaledBitmap.getWidth()).append(",").append(createScaledBitmap.getHeight());
                        }
                        byte[] a3 = gkd.m17877a(createScaledBitmap, 95);
                        if (a3 == null || a3.length > i4) {
                            int length = (i4 * 95) / a3.length;
                            if (length < 50) {
                                width = 50;
                            } else {
                                width = length;
                            }
                            if (f14371d) {
                                new StringBuilder(55).append("getResizedImageData: compress(2) w/ quality=").append(width);
                            }
                            a3 = gkd.m17877a(createScaledBitmap, width);
                            if (width > 50 && (a3 == null || a3.length > i4)) {
                                if (f14371d) {
                                    new StringBuilder(55).append("getResizedImageData: compress(2) w/ quality=50");
                                }
                                a3 = gkd.m17877a(createScaledBitmap, 50);
                            }
                        }
                        if (a3 == null || a3.length > i4) {
                            if (bitmap != null) {
                                a2.m17771a(bitmap);
                            }
                            if (!(createScaledBitmap == null || createScaledBitmap == bitmap)) {
                                a2.m17771a(createScaledBitmap);
                            }
                            i5++;
                            i6 = (int) (((double) i6) * 0.6000000238418579d);
                            i7 = (int) (((double) i7) * 0.6000000238418579d);
                        } else {
                            if (bitmap != null) {
                                a2.m17771a(bitmap);
                            }
                            if (createScaledBitmap == null || createScaledBitmap == bitmap) {
                                return a3;
                            }
                            a2.m17771a(createScaledBitmap);
                            return a3;
                        }
                    } catch (OutOfMemoryError e3) {
                        bitmap2 = createScaledBitmap;
                        try {
                            glk.m17981d("Babel_SMS", "getResizedImageData - image too big (OutOfMemoryError), will try  with smaller scale factor", new Object[0]);
                            if (bitmap != null) {
                                a2.m17771a(bitmap);
                            }
                            a2.m17771a(bitmap2);
                            i5++;
                            i6 = (int) (((double) i6) * 0.6000000238418579d);
                            i7 = (int) (((double) i7) * 0.6000000238418579d);
                        } catch (Throwable th2) {
                            th = th2;
                            createScaledBitmap = bitmap2;
                            e2 = th;
                        }
                    } catch (Throwable th3) {
                        e2 = th3;
                    }
                } catch (OutOfMemoryError e4) {
                    bitmap2 = bitmap;
                    glk.m17981d("Babel_SMS", "getResizedImageData - image too big (OutOfMemoryError), will try  with smaller scale factor", new Object[0]);
                    if (bitmap != null) {
                        a2.m17771a(bitmap);
                    }
                    a2.m17771a(bitmap2);
                    i5++;
                    i6 = (int) (((double) i6) * 0.6000000238418579d);
                    i7 = (int) (((double) i7) * 0.6000000238418579d);
                } catch (Throwable th4) {
                    e2 = th4;
                    createScaledBitmap = bitmap;
                }
            } catch (OutOfMemoryError e5) {
                glk.m17981d("Babel_SMS", "getResizedImageData - image too big (OutOfMemoryError), will try  with smaller scale factor", new Object[0]);
                if (bitmap != null) {
                    a2.m17771a(bitmap);
                }
                if (!(bitmap2 == null || bitmap2 == bitmap)) {
                    a2.m17771a(bitmap2);
                }
                i5++;
                i6 = (int) (((double) i6) * 0.6000000238418579d);
                i7 = (int) (((double) i7) * 0.6000000238418579d);
            } catch (Throwable th22) {
                th = th22;
                createScaledBitmap = null;
                e2 = th;
            }
        }
        return null;
        if (bitmap != null) {
            a2.m17771a(bitmap);
        }
        if (!(createScaledBitmap == null || createScaledBitmap == bitmap)) {
            a2.m17771a(createScaledBitmap);
        }
        throw e2;
    }

    public static long m16584a(Uri uri) {
        Throwable e;
        String valueOf;
        String valueOf2;
        AssetFileDescriptor assetFileDescriptor = null;
        try {
            AssetFileDescriptor openAssetFileDescriptor = gwb.m1400H().getContentResolver().openAssetFileDescriptor(uri, "r");
            if (openAssetFileDescriptor != null) {
                try {
                    long statSize = openAssetFileDescriptor.getParcelFileDescriptor().getStatSize();
                    if (openAssetFileDescriptor == null) {
                        return statSize;
                    }
                    try {
                        openAssetFileDescriptor.close();
                        return statSize;
                    } catch (Throwable e2) {
                        String valueOf3 = String.valueOf(e2);
                        glk.m17980d("Babel_SMS", new StringBuilder(String.valueOf(valueOf3).length() + 43).append("MmsUtils.getMediaFileSize: failed to close ").append(valueOf3).toString(), e2);
                        return statSize;
                    }
                } catch (FileNotFoundException e3) {
                    e = e3;
                    assetFileDescriptor = openAssetFileDescriptor;
                    try {
                        valueOf = String.valueOf(e);
                        glk.m17980d("Babel_SMS", new StringBuilder(String.valueOf(valueOf).length() + 54).append("MmsUtils.getMediaFileSize: cound not find media file: ").append(valueOf).toString(), e);
                        if (assetFileDescriptor != null) {
                            try {
                                assetFileDescriptor.close();
                            } catch (Throwable e4) {
                                valueOf2 = String.valueOf(e4);
                                glk.m17980d("Babel_SMS", new StringBuilder(String.valueOf(valueOf2).length() + 43).append("MmsUtils.getMediaFileSize: failed to close ").append(valueOf2).toString(), e4);
                            }
                        }
                        return 0;
                    } catch (Throwable th) {
                        e4 = th;
                        if (assetFileDescriptor != null) {
                            try {
                                assetFileDescriptor.close();
                            } catch (Throwable e5) {
                                valueOf = String.valueOf(e5);
                                glk.m17980d("Babel_SMS", new StringBuilder(String.valueOf(valueOf).length() + 43).append("MmsUtils.getMediaFileSize: failed to close ").append(valueOf).toString(), e5);
                            }
                        }
                        throw e4;
                    }
                } catch (Throwable th2) {
                    e4 = th2;
                    assetFileDescriptor = openAssetFileDescriptor;
                    if (assetFileDescriptor != null) {
                        assetFileDescriptor.close();
                    }
                    throw e4;
                }
            }
            if (openAssetFileDescriptor != null) {
                try {
                    openAssetFileDescriptor.close();
                } catch (Throwable e42) {
                    valueOf2 = String.valueOf(e42);
                    glk.m17980d("Babel_SMS", new StringBuilder(String.valueOf(valueOf2).length() + 43).append("MmsUtils.getMediaFileSize: failed to close ").append(valueOf2).toString(), e42);
                }
            }
            return 0;
        } catch (FileNotFoundException e6) {
            e42 = e6;
            valueOf = String.valueOf(e42);
            glk.m17980d("Babel_SMS", new StringBuilder(String.valueOf(valueOf).length() + 54).append("MmsUtils.getMediaFileSize: cound not find media file: ").append(valueOf).toString(), e42);
            if (assetFileDescriptor != null) {
                assetFileDescriptor.close();
            }
            return 0;
        }
    }

    public static List<String> m16604a(long j) {
        List<String> list = null;
        if (j > 0) {
            Context H = gwb.m1400H();
            Cursor query = H.getContentResolver().query(f14379l, f14380m, "_id=?", new String[]{String.valueOf(j)}, null);
            if (query != null) {
                try {
                    if (query.moveToFirst()) {
                        Object string = query.getString(1);
                        if (!TextUtils.isEmpty(string)) {
                            list = fyi.m16626c(H, string);
                        }
                    }
                    query.close();
                } finally {
                    query.close();
                }
            }
        }
        return list;
    }

    private static List<String> m16626c(Context context, String str) {
        List<String> arrayList = new ArrayList();
        for (String parseLong : str.split(" ")) {
            try {
                long parseLong2 = Long.parseLong(parseLong);
                if (parseLong2 < 0) {
                    glk.m17982e("Babel_SMS", "MmsUtils.getAddresses: invalid id " + parseLong2, new Object[0]);
                } else {
                    Cursor query;
                    try {
                        query = context.getContentResolver().query(ContentUris.withAppendedId(f14381n, parseLong2), null, null, null, null);
                    } catch (Throwable e) {
                        glk.m17980d("Babel_SMS", "MmsUtils.getAddresses: query failed for id " + parseLong2, e);
                        query = null;
                    }
                    if (query != null) {
                        try {
                            if (query.moveToFirst()) {
                                CharSequence string = query.getString(0);
                                if (!TextUtils.isEmpty(string)) {
                                    arrayList.add(string);
                                }
                            }
                            query.close();
                        } catch (Throwable th) {
                            query.close();
                        }
                    } else {
                        continue;
                    }
                }
            } catch (Throwable e2) {
                String valueOf = String.valueOf(e2);
                glk.m17980d("Babel_SMS", new StringBuilder(String.valueOf(valueOf).length() + 35).append("MmsUtils.getAddresses: invalid id. ").append(valueOf).toString(), e2);
            }
        }
        return arrayList;
    }

    public static long m16583a(Context context, List<String> list) {
        long j = -1;
        if (!(list == null || list.size() == 0)) {
            try {
                j = ajc.m2604a(context, new HashSet(list));
            } catch (IllegalArgumentException e) {
                String valueOf = String.valueOf(e);
                glk.m17982e("Babel_SMS", new StringBuilder(String.valueOf(valueOf).length() + 36).append("MmsUtils: getting thread id failed: ").append(valueOf).toString(), new Object[0]);
            }
        }
        return j;
    }

    private static Uri m16586a(ContentResolver contentResolver, Uri uri, String str, String str2, String str3, Long l, boolean z, boolean z2, long j) {
        Throwable e;
        String valueOf;
        ContentValues contentValues = new ContentValues(7);
        contentValues.put("address", str);
        if (l != null) {
            contentValues.put("date", l);
        }
        contentValues.put("read", Integer.valueOf(1));
        contentValues.put("subject", null);
        contentValues.put("body", str2);
        if (z2) {
            contentValues.put("status", Integer.valueOf(32));
        }
        if (j != -1) {
            contentValues.put("thread_id", Long.valueOf(j));
        }
        try {
            return contentResolver.insert(uri, contentValues);
        } catch (SQLiteException e2) {
            e = e2;
            valueOf = String.valueOf(e);
            glk.m17980d("Babel_SMS", new StringBuilder(String.valueOf(valueOf).length() + 38).append("MmsUtils: persist sms message failure ").append(valueOf).toString(), e);
            return null;
        } catch (IllegalArgumentException e3) {
            e = e3;
            valueOf = String.valueOf(e);
            glk.m17980d("Babel_SMS", new StringBuilder(String.valueOf(valueOf).length() + 38).append("MmsUtils: persist sms message failure ").append(valueOf).toString(), e);
            return null;
        }
    }

    public static Uri m16589a(Context context, String str, String str2, long j, long j2, boolean z) {
        return fyi.m16586a(context.getContentResolver(), f14377j, str, str2, null, Long.valueOf(j), true, false, j2);
    }

    public static Uri m16588a(Context context, aiv aiv, aiu aiu, aiq aiq) {
        Uri a;
        Throwable e;
        String valueOf;
        try {
            a = aip.m2541a(context).m2556a(aiv, f14375h, true, fyi.m16621b(), null, aiq);
            try {
                if (aiu.m2567d() == null) {
                    glk.m17982e("Babel_SMS", "MmsUtils: null MessageId:" + aiu.m2568e(), new Object[0]);
                } else {
                    ContentValues contentValues = new ContentValues(2);
                    contentValues.put("resp_st", Integer.valueOf(aiu.m2568e()));
                    contentValues.put("m_id", aip.m2544a(aiu.m2567d()));
                    gwb.m1491a(context.getContentResolver(), a, contentValues, null, null);
                }
            } catch (ahz e2) {
                e = e2;
                valueOf = String.valueOf(e);
                glk.m17980d("Babel_SMS", new StringBuilder(String.valueOf(valueOf).length() + 43).append("MmsUtils: persist mms sent message failure ").append(valueOf).toString(), e);
                return a;
            } catch (SQLiteException e3) {
                e = e3;
                valueOf = String.valueOf(e);
                glk.m17980d("Babel_SMS", new StringBuilder(String.valueOf(valueOf).length() + 42).append("MmsUtils: update mms sent message failure ").append(valueOf).toString(), e);
                return a;
            }
        } catch (Throwable e4) {
            e = e4;
            a = null;
            valueOf = String.valueOf(e);
            glk.m17980d("Babel_SMS", new StringBuilder(String.valueOf(valueOf).length() + 43).append("MmsUtils: persist mms sent message failure ").append(valueOf).toString(), e);
            return a;
        } catch (Throwable e42) {
            e = e42;
            a = null;
            valueOf = String.valueOf(e);
            glk.m17980d("Babel_SMS", new StringBuilder(String.valueOf(valueOf).length() + 42).append("MmsUtils: update mms sent message failure ").append(valueOf).toString(), e);
            return a;
        }
        return a;
    }

    public static Uri m16587a(Context context, ait ait) {
        Uri a;
        Throwable e;
        String valueOf;
        try {
            a = aip.m2541a(context).m2555a(ait, f14374g, true, fyi.m16621b(), null);
            try {
                ContentValues contentValues = new ContentValues(1);
                contentValues.put("date", Long.valueOf(glj.m17956a() / 1000));
                contentValues.put("seen", Integer.valueOf(1));
                gwb.m1491a(context.getContentResolver(), a, contentValues, null, null);
            } catch (ahz e2) {
                e = e2;
                valueOf = String.valueOf(e);
                glk.m17980d("Babel_SMS", new StringBuilder(String.valueOf(valueOf).length() + 47).append("MmsUtils: persist mms received message failure ").append(valueOf).toString(), e);
                return a;
            } catch (SQLiteException e3) {
                e = e3;
                valueOf = String.valueOf(e);
                glk.m17980d("Babel_SMS", new StringBuilder(String.valueOf(valueOf).length() + 46).append("MmsUtils: update mms received message failure ").append(valueOf).toString(), e);
                return a;
            }
        } catch (Throwable e4) {
            e = e4;
            a = null;
            valueOf = String.valueOf(e);
            glk.m17980d("Babel_SMS", new StringBuilder(String.valueOf(valueOf).length() + 47).append("MmsUtils: persist mms received message failure ").append(valueOf).toString(), e);
            return a;
        } catch (Throwable e42) {
            e = e42;
            a = null;
            valueOf = String.valueOf(e);
            glk.m17980d("Babel_SMS", new StringBuilder(String.valueOf(valueOf).length() + 46).append("MmsUtils: update mms received message failure ").append(valueOf).toString(), e);
            return a;
        }
        return a;
    }

    public static ContentValues m16585a(Context context, SmsMessage[] smsMessageArr, int i) {
        int i2 = 1;
        SmsMessage smsMessage = smsMessageArr[0];
        ContentValues contentValues = new ContentValues();
        contentValues.put("address", smsMessage.getDisplayOriginatingAddress());
        contentValues.put("body", fyi.m16603a(smsMessageArr));
        if (fyi.m16634f()) {
            contentValues.put("date_sent", Long.valueOf(smsMessage.getTimestampMillis()));
        }
        contentValues.put("protocol", Integer.valueOf(smsMessage.getProtocolIdentifier()));
        contentValues.put("seen", Integer.valueOf(1));
        if (smsMessage.getPseudoSubject().length() > 0) {
            contentValues.put("subject", smsMessage.getPseudoSubject());
        }
        String str = "reply_path_present";
        if (!smsMessage.isReplyPathPresent()) {
            i2 = 0;
        }
        contentValues.put(str, Integer.valueOf(i2));
        contentValues.put("service_center", smsMessage.getServiceCenterAddress());
        contentValues.put("error_code", Integer.valueOf(i));
        String displayOriginatingAddress = smsMessage.getDisplayOriginatingAddress();
        if (TextUtils.isEmpty(displayOriginatingAddress)) {
            displayOriginatingAddress = context.getResources().getString(bc.ty);
            contentValues.put("address", displayOriginatingAddress);
        } else if (ajb.f988a != null) {
            displayOriginatingAddress = ajb.f988a.m6c();
        }
        contentValues.put("thread_id", Long.valueOf(ajc.m2603a(context, displayOriginatingAddress)));
        return contentValues;
    }

    private static String m16625c(String str) {
        return str == null ? "" : str.replace('\f', '\n');
    }

    private static String m16603a(SmsMessage[] smsMessageArr) {
        int i = 0;
        if (smsMessageArr.length == 1) {
            return fyi.m16625c(smsMessageArr[0].getDisplayMessageBody());
        }
        StringBuilder stringBuilder = new StringBuilder();
        int length = smsMessageArr.length;
        while (i < length) {
            try {
                stringBuilder.append(smsMessageArr[i].getDisplayMessageBody());
            } catch (NullPointerException e) {
            }
            i++;
        }
        return fyi.m16625c(stringBuilder.toString());
    }

    public static Long m16594a(SmsMessage smsMessage, long j) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar(2011, 8, 18);
        Calendar gregorianCalendar2 = new GregorianCalendar();
        gregorianCalendar2.setTimeInMillis(j);
        if (gregorianCalendar2.before(gregorianCalendar)) {
            j = smsMessage.getTimestampMillis();
        }
        return Long.valueOf(j);
    }

    public static CharSequence m16593a(String str, CharSequence charSequence) {
        CharSequence charSequence2;
        Context H = gwb.m1400H();
        String b = fyi.m16618b(H, str);
        if (charSequence == null) {
            charSequence2 = "";
        } else {
            charSequence2 = charSequence;
        }
        if (b == null) {
            return charSequence2;
        }
        return H.getString(bc.fy, new Object[]{b, charSequence2});
    }

    public static String m16618b(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (f14372e == null) {
            f14372e = context.getResources().getStringArray(gwb.dq);
        }
        for (String equalsIgnoreCase : f14372e) {
            if (str.equalsIgnoreCase(equalsIgnoreCase)) {
                return null;
            }
        }
        return str;
    }

    public static String m16619b(Uri uri) {
        String schemeSpecificPart = uri.getSchemeSpecificPart();
        int indexOf = schemeSpecificPart.indexOf(63);
        if (indexOf != -1) {
            schemeSpecificPart = schemeSpecificPart.substring(0, indexOf);
        }
        StringBuilder stringBuilder = new StringBuilder(schemeSpecificPart.length());
        for (char c : schemeSpecificPart.toCharArray()) {
            int digit = Character.digit(c, 10);
            if (digit != -1) {
                stringBuilder.append(digit);
            } else {
                stringBuilder.append(c);
            }
        }
        return stringBuilder.toString().replace(',', ';').replace("/", "");
    }

    public static String m16596a(blo blo, edo edo, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return fyi.m16597a(blo, edo, Arrays.asList(str.split(";")));
    }

    public static String m16597a(blo blo, edo edo, List<String> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        List arrayList = new ArrayList();
        for (String a : list) {
            edk a2 = gwb.m1597a(gwb.m1400H(), a, null, null);
            if (edo != null && edo.m13608a(a2.f11213b)) {
                a2.f11220i = Boolean.TRUE;
            }
            arrayList.add(a2);
        }
        return fyi.m16598a(blo, edo != null, arrayList);
    }

    public static String m16598a(blo blo, boolean z, List<edk> list) {
        int i = 1;
        if (list == null || list.isEmpty()) {
            return null;
        }
        fhc fhc = new fhc();
        fhc.m15305a(-1);
        boy boy = boy.LOCAL_ONLY;
        if (list.size() > 1) {
            i = 2;
        }
        return blf.m5754a(blo, z, null, list, null, null, boy, i, 3, false, fhc, null);
    }

    public static void m16605a(int i, byte[] bArr) {
        aid aid = null;
        try {
            aid = new ain(bArr).m2518a();
        } catch (Throwable e) {
            glk.m17980d("Babel_SMS", "Invalid MMS WAP push", e);
        }
        if (aid == null) {
            glk.m17982e("Babel_SMS", "Invalid WAP push data", new Object[0]);
            return;
        }
        switch (aid.m2449b()) {
            case 130:
                aif aif = (aif) aid;
                if (ajf.m2609a().mo2122f()) {
                    Object d = aif.m2463d();
                    if ((byte) 61 == d[d.length - 1]) {
                        Object g = aif.m2466g();
                        Object obj = new byte[(d.length + g.length)];
                        System.arraycopy(d, 0, obj, 0, d.length);
                        System.arraycopy(g, 0, obj, d.length, g.length);
                        aif.m2461b(obj);
                    }
                }
                blf.m5758a(i, aif);
                return;
            default:
                return;
        }
    }

    public static boolean m16614a(Context context) {
        if (VERSION.SDK_INT > 22 && fyi.m16631d(context)) {
            glk.m17981d("Babel", "MmsUtils: Possible bad MMS Proxy port detected.", new Object[0]);
        }
        if (VERSION.SDK_INT > 22) {
            return true;
        }
        return false;
    }

    private static boolean m16631d(Context context) {
        Throwable th;
        String[] strArr = new String[]{"mmsproxy", "mmsport"};
        Cursor query;
        try {
            query = context.getContentResolver().query(Uri.withAppendedPath(Carriers.CONTENT_URI, "current"), strArr, null, null, null);
            while (query != null) {
                try {
                    if (!query.moveToNext()) {
                        break;
                    }
                    Object string = query.getString(query.getColumnIndex("mmsproxy"));
                    int i = query.getInt(query.getColumnIndex("mmsport"));
                    if (!TextUtils.isEmpty(string) && i <= 0) {
                        glk.m17979c("Babel", new StringBuilder(String.valueOf(string).length() + 56).append("MmsUtils: incompatible APN MMS proxy found: ").append(string).append(":").append(i).toString(), new Object[0]);
                        if (query != null) {
                            query.close();
                        }
                        return true;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }
            if (query != null) {
                query.close();
            }
            glk.m17979c("Babel", "MmsUtils: No incompatible APN MMS proxy configurations found.", new Object[0]);
            return false;
        } catch (Throwable th3) {
            th = th3;
            query = null;
            if (query != null) {
                query.close();
            }
            throw th;
        }
    }

    public static boolean m16630d() {
        fzw fzw = (fzw) jyn.m25426a(gwb.m1400H(), fzw.class);
        if (!fzw.mo2163k() || (!fzw.mo2164l() && ((TelephonyManager) gwb.m1400H().getSystemService("phone")).isNetworkRoaming())) {
            return false;
        }
        return true;
    }

    public static long m16617b(long j) {
        return ((j + 1000) - 1) / 1000;
    }

    public static long m16624c(Uri uri) {
        long j = -1;
        if (uri != null) {
            try {
                j = ContentUris.parseId(uri);
            } catch (UnsupportedOperationException e) {
            } catch (NumberFormatException e2) {
            }
        }
        return j;
    }

    public static String m16601a(List<String> list, String str) {
        if (list != null && list.size() > 0) {
            StringBuilder stringBuilder = new StringBuilder();
            if (str != null) {
                str = glq.m18021e(gwb.m1400H(), str);
            }
            for (String str2 : list) {
                if (str == null || !TextUtils.equals(str, glq.m18021e(gwb.m1400H(), str2))) {
                    if (stringBuilder.length() > 0) {
                        stringBuilder.append(",");
                    }
                    stringBuilder.append(str2);
                }
            }
            if (stringBuilder.length() > 0) {
                return stringBuilder.toString();
            }
        }
        return null;
    }

    public static SmsMessage m16590a(Intent intent) {
        return SmsMessage.createFromPdu(intent.getByteArrayExtra("pdu"));
    }

    public static void m16610a(String str, int i, long j) {
        if (str != null) {
            Uri parse = Uri.parse(str);
            ContentValues contentValues = new ContentValues();
            contentValues.put("status", Integer.valueOf(i));
            if (fyi.m16634f()) {
                contentValues.put("date_sent", Long.valueOf(j));
            }
            gwb.m1400H().getContentResolver().update(parse, contentValues, null, null);
        }
    }

    public static String m16599a(String str) {
        return String.format(Locale.US, "((%s LIKE '%s') OR (%s LIKE '%s') OR (%s LIKE '%s') OR (%s='%s'))", new Object[]{str, "image/%", str, "video/%", str, "audio/%", str, "application/ogg"});
    }

    public static int m16632e() {
        String format = String.format(Locale.US, "%s AND (%s IN (SELECT %s FROM part WHERE %s))", new Object[]{fzb.f14420c, "_id", "mid", fyi.m16599a("ct")});
        ContentResolver contentResolver = gwb.m1400H().getContentResolver();
        Cursor query = contentResolver.query(f14373f, new String[]{"_id"}, format, null, null);
        if (query != null) {
            int i;
            long[] jArr = new long[query.getCount()];
            int i2 = 0;
            while (query.moveToNext()) {
                try {
                    i = i2 + 1;
                    jArr[i2] = query.getLong(0);
                    i2 = i;
                } finally {
                    query.close();
                }
            }
            int length = jArr.length;
            if (length > 0) {
                i2 = 0;
                for (int i3 = 0; i3 < length; i3 += 128) {
                    String[] strArr;
                    int min = Math.min(i3 + 128, length) - i3;
                    String format2 = String.format(Locale.US, "%s IN %s", new Object[]{"_id", fyi.m16595a(min)});
                    if (min <= 0) {
                        strArr = null;
                    } else {
                        strArr = new String[min];
                        for (i = 0; i < min; i++) {
                            strArr[i] = Long.toString(jArr[i3 + i]);
                        }
                    }
                    i = contentResolver.delete(f14373f, format2, strArr);
                    if (glk.m17973a("Babel_SMS", 3)) {
                        String valueOf = String.valueOf(TextUtils.join(",", strArr));
                        glk.m17976b("Babel_SMS", new StringBuilder(String.valueOf(valueOf).length() + 59).append("deleteMediaMessages: deleting IDs = ").append(valueOf).append(", deleted = ").append(i).toString(), new Object[0]);
                    }
                    i2 += i;
                }
                return i2;
            }
        }
        return 0;
    }

    public static String m16595a(int i) {
        if (i <= 0) {
            return null;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("(?");
        for (int i2 = 0; i2 < i - 1; i2++) {
            stringBuilder.append(",?");
        }
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public static int m16623c(long j) {
        ContentResolver contentResolver = gwb.m1400H().getContentResolver();
        return contentResolver.delete(f14373f, String.format(Locale.US, "%s AND (%s<=%d)", new Object[]{fzb.f14420c, "date", Long.valueOf(j / 1000)}), null) + (contentResolver.delete(f14376i, String.format(Locale.US, "%s AND (%s<=%d)", new Object[]{fzb.f14419b, "date", Long.valueOf(j)}), null) + 0);
    }

    public static void m16606a(long j, long j2) {
        ContentResolver contentResolver = gwb.m1400H().getContentResolver();
        ContentValues contentValues = new ContentValues();
        contentValues.put("read", Integer.valueOf(1));
        contentResolver.update(f14376i, contentValues, String.format(Locale.US, "%s=%d AND %s<=%d AND %s=0", new Object[]{"thread_id", Long.valueOf(j), "date", Long.valueOf(j2), "read"}), null);
        contentResolver.update(f14373f, contentValues, String.format(Locale.US, "%s=%d AND %s<=%d AND %s=0", new Object[]{"thread_id", Long.valueOf(j), "date", Long.valueOf(j2 / 1000), "read"}), null);
    }

    public static void m16609a(Uri uri, boolean z) {
        ContentResolver contentResolver = gwb.m1400H().getContentResolver();
        ContentValues contentValues = new ContentValues();
        contentValues.put("read", Integer.valueOf(z ? 1 : 0));
        contentResolver.update(uri, contentValues, null, null);
    }

    public static void m16629d(Uri uri) {
        ContentResolver contentResolver = gwb.m1400H().getContentResolver();
        ContentValues contentValues = new ContentValues();
        contentValues.put("seen", Integer.valueOf(1));
        contentResolver.update(uri, contentValues, "seen != 1", null);
    }

    public static ArrayList<fyj> m16620b(String str) {
        Iterable<String> m = gwb.m2298m(str);
        ArrayList<fyj> arrayList = new ArrayList();
        fyj fyj = null;
        int i = 0;
        for (String str2 : m) {
            fyj fyj2;
            int i2;
            switch (i) {
                case 0:
                    fyj = new fyj();
                    fyj.f14386a = str2;
                    fyj2 = fyj;
                    i2 = i;
                    break;
                case 1:
                    fyj.f14387b = str2;
                    fyj2 = fyj;
                    i2 = i;
                    break;
                case 2:
                    try {
                        fyj.f14388c = Integer.parseInt(str2);
                        fyj2 = fyj;
                        i2 = i;
                        break;
                    } catch (Exception e) {
                        fyj.f14388c = 0;
                        fyj2 = fyj;
                        i2 = i;
                        break;
                    }
                case 3:
                    try {
                        fyj.f14389d = Integer.parseInt(str2);
                    } catch (Exception e2) {
                        fyj.f14389d = 0;
                    }
                    arrayList.add(fyj);
                    fyj fyj3 = fyj;
                    i2 = -1;
                    fyj2 = fyj3;
                    break;
                default:
                    fyj2 = fyj;
                    i2 = i;
                    break;
            }
            i = i2 + 1;
            fyj = fyj2;
        }
        return arrayList;
    }

    public static String m16602a(byte[] bArr, String str) {
        if (bArr == null) {
            return null;
        }
        try {
            return new String(bArr, str);
        } catch (Throwable e) {
            String valueOf = String.valueOf(e);
            glk.m17980d("Babel_SMS", new StringBuilder(String.valueOf(valueOf).length() + 24).append("MmsUtils.bytesToString: ").append(valueOf).toString(), e);
            return new String(bArr);
        }
    }

    public static byte[] m16616a(String str, String str2) {
        if (str == null) {
            return null;
        }
        try {
            return str.getBytes(str2);
        } catch (Throwable e) {
            String valueOf = String.valueOf(e);
            glk.m17980d("Babel_SMS", new StringBuilder(String.valueOf(valueOf).length() + 24).append("MmsUtils.stringToBytes: ").append(valueOf).toString(), e);
            return str.getBytes();
        }
    }

    public static boolean m16634f() {
        Cursor a;
        Throwable e;
        if (f14383p == null) {
            try {
                a = gwb.m1558a(gwb.m1400H().getContentResolver(), f14376i, f14382o, null, null, "date_sent ASC LIMIT 1");
                try {
                    f14383p = Boolean.valueOf(true);
                    if (a != null) {
                        a.close();
                    }
                } catch (SQLiteException e2) {
                    e = e2;
                    try {
                        glk.m17978c("Babel_SMS", "date_sent in sms table does not exist", e);
                        f14383p = Boolean.valueOf(false);
                        if (a != null) {
                            a.close();
                        }
                        return gwb.m2061b(f14383p);
                    } catch (Throwable th) {
                        e = th;
                        if (a != null) {
                            a.close();
                        }
                        throw e;
                    }
                }
            } catch (SQLiteException e3) {
                e = e3;
                a = null;
                glk.m17978c("Babel_SMS", "date_sent in sms table does not exist", e);
                f14383p = Boolean.valueOf(false);
                if (a != null) {
                    a.close();
                }
                return gwb.m2061b(f14383p);
            } catch (Throwable th2) {
                e = th2;
                a = null;
                if (a != null) {
                    a.close();
                }
                throw e;
            }
        }
        return gwb.m2061b(f14383p);
    }

    public static boolean m16622b(Context context) {
        if (f14385r == null) {
            boolean c = fyi.m16628c(context);
            if (c && gld.m17936a()) {
                c = !((fzw) jyn.m25426a(context, fzw.class)).mo2149b("use_local_apn_pref_key");
            }
            f14385r = Boolean.valueOf(c);
        }
        return gwb.m2061b(f14385r);
    }

    public static boolean m16628c(Context context) {
        try {
            Cursor a = gwb.m1558a(context.getContentResolver(), f14369b, f14384q, null, null, null);
            if (a != null) {
                a.close();
            }
            return true;
        } catch (Throwable e) {
            glk.m17978c("Babel_SMS", "Can't access system APN, using internal table", e);
            return false;
        }
    }

    public static void m16608a(Context context, boolean z) {
        f14385r = Boolean.valueOf(z);
        if (!z && VERSION.SDK_INT != 17) {
            SQLiteDatabase a = bjs.m5482a(context);
            try {
                Cursor query = a.query("apn", bjs.f3544a, null, null, null, null, null, null);
                if (query != null) {
                    query.close();
                }
            } catch (Exception e) {
                bjs.m5485b(a);
            }
        }
    }

    public static boolean m16635g() {
        return gld.m17936a() && ((fzw) jyn.m25426a(gwb.m1400H(), fzw.class)).mo2165m();
    }

    public static boolean m16636h() {
        return gld.m17936a() && ((fzw) jyn.m25426a(gwb.m1400H(), fzw.class)).mo2166n();
    }

    public static fxp m16633e(Uri uri) {
        fxp a;
        String format;
        Throwable e;
        Throwable e2;
        String valueOf;
        Object obj;
        Cursor cursor = null;
        ContentResolver contentResolver = gwb.m1400H().getContentResolver();
        Cursor a2;
        try {
            a2 = gwb.m1558a(contentResolver, uri, fxp.f14258a, null, null, null);
            if (a2 != null) {
                try {
                    if (a2.moveToFirst()) {
                        a = fxp.m16483a(a2);
                        if (a2 != null) {
                            a2.close();
                        }
                        if (a != null) {
                            return cursor;
                        }
                        format = String.format(Locale.US, "%s != '%s' AND %s = ?", new Object[]{"ct", "application/smil", "mid"});
                        try {
                            cursor = gwb.m1558a(contentResolver, f14370c, fxq.f14290a, format, new String[]{Long.toString(a.f14277m)}, null);
                            if (cursor != null) {
                                while (cursor.moveToNext()) {
                                    a.m16487a(fxq.m16499a(cursor, true));
                                }
                            }
                            if (cursor != null) {
                                cursor.close();
                            }
                        } catch (Throwable e3) {
                            String valueOf2 = String.valueOf(e3);
                            glk.m17980d("Babel_SMS", new StringBuilder(String.valueOf(valueOf2).length() + 32).append("MmsLoader: query parts failure: ").append(valueOf2).toString(), e3);
                            return a;
                        } finally {
                            if (cursor != null) {
                                cursor.close();
                            }
                        }
                        return a;
                    }
                } catch (SQLiteException e4) {
                    e2 = e4;
                    try {
                        valueOf = String.valueOf(e2);
                        glk.m17980d("Babel_SMS", new StringBuilder(String.valueOf(valueOf).length() + 30).append("MmsLoader: query pdu failure: ").append(valueOf).toString(), e2);
                        if (a2 == null) {
                            obj = cursor;
                        } else {
                            a2.close();
                            obj = cursor;
                        }
                        if (a != null) {
                            return cursor;
                        }
                        format = String.format(Locale.US, "%s != '%s' AND %s = ?", new Object[]{"ct", "application/smil", "mid"});
                        cursor = gwb.m1558a(contentResolver, f14370c, fxq.f14290a, format, new String[]{Long.toString(a.f14277m)}, null);
                        if (cursor != null) {
                            while (cursor.moveToNext()) {
                                a.m16487a(fxq.m16499a(cursor, true));
                            }
                        }
                        if (cursor != null) {
                            cursor.close();
                        }
                        return a;
                    } catch (Throwable th) {
                        e3 = th;
                        if (a2 != null) {
                            a2.close();
                        }
                        throw e3;
                    }
                }
            }
            obj = cursor;
            if (a2 != null) {
                a2.close();
            }
        } catch (SQLiteException e5) {
            e2 = e5;
            a2 = cursor;
            valueOf = String.valueOf(e2);
            glk.m17980d("Babel_SMS", new StringBuilder(String.valueOf(valueOf).length() + 30).append("MmsLoader: query pdu failure: ").append(valueOf).toString(), e2);
            if (a2 == null) {
                a2.close();
                obj = cursor;
            } else {
                obj = cursor;
            }
            if (a != null) {
                return cursor;
            }
            format = String.format(Locale.US, "%s != '%s' AND %s = ?", new Object[]{"ct", "application/smil", "mid"});
            cursor = gwb.m1558a(contentResolver, f14370c, fxq.f14290a, format, new String[]{Long.toString(a.f14277m)}, null);
            if (cursor != null) {
                while (cursor.moveToNext()) {
                    a.m16487a(fxq.m16499a(cursor, true));
                }
            }
            if (cursor != null) {
                cursor.close();
            }
            return a;
        } catch (Throwable th2) {
            e3 = th2;
            a2 = cursor;
            if (a2 != null) {
                a2.close();
            }
            throw e3;
        }
        if (a != null) {
            return cursor;
        }
        format = String.format(Locale.US, "%s != '%s' AND %s = ?", new Object[]{"ct", "application/smil", "mid"});
        cursor = gwb.m1558a(contentResolver, f14370c, fxq.f14290a, format, new String[]{Long.toString(a.f14277m)}, null);
        if (cursor != null) {
            while (cursor.moveToNext()) {
                a.m16487a(fxq.m16499a(cursor, true));
            }
        }
        if (cursor != null) {
            cursor.close();
        }
        return a;
    }

    public static String m16600a(List<String> list, long j) {
        Context H = gwb.m1400H();
        if (list != null && list.size() == 1) {
            return (String) list.get(0);
        }
        Cursor a = gwb.m1558a(H.getContentResolver(), Uri.parse("content://mms/" + j + "/addr"), new String[]{"address", "charset"}, "type=137", null, null);
        if (a != null) {
            try {
                if (a.moveToFirst()) {
                    String a2 = fxo.m16482a(a);
                    return a2;
                }
                a.close();
            } finally {
                a.close();
            }
        }
        return null;
    }

    public static void m16611a(byte[] bArr, aid aid, Context context) {
        BufferedOutputStream bufferedOutputStream;
        if (!(aid instanceof ait)) {
            glk.m17982e("Babel", "dumpPdu: not RetrieveConf", new Object[0]);
        } else if (((ehz) jyn.m25426a(context, ehz.class)).mo1882a("android.permission.WRITE_EXTERNAL_STORAGE")) {
            Object obj;
            byte[] h = ((ait) aid).m2566h();
            String valueOf = String.valueOf("mmsdump-");
            if (h == null) {
                obj = "null";
            } else {
                obj = new String(h);
            }
            String valueOf2 = String.valueOf(obj);
            if (valueOf2.length() != 0) {
                valueOf2 = valueOf.concat(valueOf2);
            } else {
                valueOf2 = new String(valueOf);
            }
            File file = new File(Environment.getExternalStorageDirectory(), valueOf2);
            if (file.exists()) {
                file.delete();
            }
            try {
                bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file));
                bufferedOutputStream.write(bArr);
                bufferedOutputStream.flush();
                bufferedOutputStream.close();
            } catch (Throwable e) {
                glk.m17980d("Babel", "MmsUtils: I/O error dumping pdu", e);
            } catch (Throwable th) {
                bufferedOutputStream.close();
            }
        } else {
            Toast.makeText(context, "You enabled SMS/MMS dump, but no storage permission. Please go to Settings to turn on storage permission", 0).show();
        }
    }
}
