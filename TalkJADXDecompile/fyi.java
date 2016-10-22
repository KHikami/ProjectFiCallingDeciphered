import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetFileDescriptor;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
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
    public static String a;
    static final Uri b;
    public static final Uri c;
    private static final boolean d;
    private static String[] e;
    private static final Uri f;
    private static final Uri g;
    private static final Uri h;
    private static final Uri i;
    private static final Uri j;
    private static final Uri k;
    private static final Uri l;
    private static final String[] m;
    private static final Uri n;
    private static final String[] o;
    private static Boolean p;
    private static final String[] q;
    private static Boolean r;

    static {
        Uri uri;
        kae kae = glk.r;
        d = false;
        a = Character.toString('|');
        if (VERSION.SDK_INT >= 19) {
            uri = Mms.CONTENT_URI;
        } else {
            uri = Uri.parse("content://mms");
        }
        f = uri;
        if (VERSION.SDK_INT >= 19) {
            uri = Inbox.CONTENT_URI;
        } else {
            uri = Uri.parse("content://mms/inbox");
        }
        g = uri;
        if (VERSION.SDK_INT >= 19) {
            uri = Sent.CONTENT_URI;
        } else {
            uri = Uri.parse("content://mms/sent");
        }
        h = uri;
        if (VERSION.SDK_INT >= 19) {
            uri = Sms.CONTENT_URI;
        } else {
            uri = Uri.parse("content://sms");
        }
        i = uri;
        if (VERSION.SDK_INT >= 19) {
            uri = Sms.Sent.CONTENT_URI;
        } else {
            uri = Uri.parse("content://sms/sent");
        }
        j = uri;
        if (VERSION.SDK_INT >= 19) {
            uri = Carriers.CONTENT_URI;
        } else {
            uri = Uri.parse("content://telephony/carriers");
        }
        b = uri;
        if (VERSION.SDK_INT >= 19) {
            uri = Threads.CONTENT_URI;
        } else {
            uri = Uri.parse("content://mms-sms/conversations");
        }
        k = uri;
        l = uri.buildUpon().appendQueryParameter("simple", "true").build();
        m = new String[]{"_id", "recipient_ids"};
        n = Uri.parse("content://mms-sms/canonical-address");
        o = new String[]{"date_sent"};
        p = null;
        q = new String[]{"mmsc"};
        c = Uri.parse("content://mms/part");
    }

    public static boolean a() {
        return VERSION.SDK_INT >= 23;
    }

    public static fyl a(Context context, String str, String str2, String str3, int i, int i2, int i3) {
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
            aio.a(106);
            aio.e("text/plain".getBytes());
            aio.c("text_0.txt".getBytes());
            lastIndexOf = "text_0.txt".lastIndexOf(".");
            if (lastIndexOf == -1) {
                str4 = "text_0.txt";
            } else {
                str4 = "text_0.txt".substring(0, lastIndexOf);
            }
            aio.b(str4.getBytes());
            aio.a(str.getBytes());
            aig.a(aio);
            if (obj2 != null) {
                a(aig, String.format(Locale.getDefault(), "<smil><head><layout><root-layout/><region height=\"100%%\" id=\"Text\" left=\"0%%\" top=\"0%%\" width=\"100%%\"/></layout></head><body><par dur=\"8000ms\"><text src=\"%s\" region=\"Text\"/></par></body></smil>", new Object[]{"text_0.txt"}));
            }
            i4 = aio.a().length + 0;
            charSequence = "text_0.txt";
        }
        if (obj != null) {
            String str5;
            String str6;
            if (ba.b(str3)) {
                int i5;
                if (TextUtils.isEmpty(str3)) {
                    str3 = "image/jpeg";
                }
                if (ba.b(str3)) {
                    Uri parse = Uri.parse(str2);
                    int a = a(context, parse);
                    if (a <= 0) {
                        glk.d("Babel_SMS", "Can't get image", new Exception());
                        i5 = 0;
                    } else {
                        aio aio2;
                        int e = ajf.a().e() - 1024;
                        lastIndexOf = ajf.a().m();
                        l = ajf.a().l();
                        if (i2 > i) {
                            i5 = l;
                        } else {
                            i5 = lastIndexOf;
                            lastIndexOf = l;
                        }
                        if (d) {
                            new StringBuilder(120).append("addPicturePart size: ").append(a).append(" width: ").append(i).append(" widthLimit: ").append(i5).append(" height: ").append(i2).append(" heightLimit: ").append(lastIndexOf);
                        }
                        if (a > e || i > i5 || i2 > lastIndexOf || i3 != 0) {
                            aio aio3 = new aio();
                            byte[] a2 = a(i3, i5, lastIndexOf, e, parse, context);
                            if (a2 == null) {
                                aio2 = null;
                            } else {
                                aio3.a(a2);
                                aio3.e("image/jpeg".getBytes());
                                aio2 = aio3;
                            }
                            if (aio2 == null) {
                                glk.d("Babel_SMS", "Can't resize image: not enough memory?", new Exception());
                                i5 = 0;
                            } else {
                                i5 = aio2.a().length;
                            }
                        } else {
                            aio2 = new aio();
                            aio2.a(parse);
                            aio2.e(str3.getBytes());
                            i5 = a;
                        }
                        String str7 = "image.jpg";
                        aio2.c(str7.getBytes());
                        lastIndexOf = str7.lastIndexOf(".");
                        if (lastIndexOf == -1) {
                            str4 = str7;
                        } else {
                            str4 = str7.substring(0, lastIndexOf);
                        }
                        aio2.b(str4.getBytes());
                        aig.a(aio2);
                        if (d) {
                            new StringBuilder(32).append("addPicturePart size: ").append(i5);
                        }
                        if (TextUtils.isEmpty(charSequence)) {
                            str5 = "";
                        } else {
                            str5 = String.format(Locale.getDefault(), "<text src=\"%s\" region=\"Text\"/>", new Object[]{charSequence});
                        }
                        a(aig, String.format(Locale.US, "<smil><head><layout><root-layout width=\"%dpx\" height=\"%dpx\" /><region id=\"Image\" left=\"0\" top=\"0\" width=\"%dpx\" height=\"%dpx\" fit=\"meet\" /></layout></head><body><par dur=\"5000ms\"><img src=\"%s\" region=\"Image\" />%s</par></body></smil>", new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i), Integer.valueOf(i2), str7, str5}));
                    }
                } else {
                    str6 = "Babel_SMS";
                    str4 = "Unsupported image contentType: ";
                    str5 = String.valueOf(str3);
                    glk.d(str6, str5.length() != 0 ? str4.concat(str5) : new String(str4), new Exception());
                    i5 = 0;
                }
                l = i4 + i5;
            } else if (ba.e(str3)) {
                Uri parse2 = Uri.parse(str2);
                lastIndexOf = a(context, parse2);
                if (lastIndexOf <= 0) {
                    glk.d("Babel_SMS", "Can't get vcard", new Exception());
                    l = 0;
                } else {
                    aio = new aio();
                    aio.a(parse2);
                    aio.e(str3.getBytes());
                    str6 = "contact.vcf";
                    aio.c(str6.getBytes());
                    l = str6.lastIndexOf(".");
                    if (l == -1) {
                        str5 = str6;
                    } else {
                        str5 = str6.substring(0, l);
                    }
                    aio.b(str5.getBytes());
                    aig.a(aio);
                    if (d) {
                        new StringBuilder(30).append("addVCardPart size: ").append(lastIndexOf);
                    }
                    if (TextUtils.isEmpty(charSequence)) {
                        str5 = "";
                    } else {
                        str5 = String.format(Locale.getDefault(), "<text src=\"%s\" region=\"Text\"/>", new Object[]{charSequence});
                    }
                    a(aig, String.format(Locale.US, "<smil><head><layout><root-layout width=\"%dpx\" height=\"%dpx\" /></layout></head><body><par dur=\"5000ms\"><ref src=\"%s\" />%s</par></body></smil>", new Object[]{Integer.valueOf(HttpStatusCodes.STATUS_CODE_MULTIPLE_CHOICES), Integer.valueOf(HttpStatusCodes.STATUS_CODE_MULTIPLE_CHOICES), str6, str5}));
                    l = lastIndexOf;
                }
                l += i4;
            } else if (ba.d(str3)) {
                if (i == 0) {
                    i = 320;
                }
                if (i2 == 0) {
                    i2 = 160;
                }
                if (d) {
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
                aio4.a(parse3);
                aio4.e(str3.getBytes());
                str6 = "video.3gp";
                aio4.c(str6.getBytes());
                l = str6.lastIndexOf(".");
                if (l == -1) {
                    str5 = str6;
                } else {
                    str5 = str6.substring(0, l);
                }
                aio4.b(str5.getBytes());
                aig.a(aio4);
                if (TextUtils.isEmpty(charSequence)) {
                    str5 = "";
                } else {
                    str5 = String.format(Locale.getDefault(), "<text src=\"%s\" region=\"Text\"/>", new Object[]{charSequence});
                }
                a(aig, String.format(Locale.US, "<smil><head><layout><root-layout width=\"%d\" height=\"%d\" /><region id=\"Image\" left=\"0\" top=\"0\" width=\"%dpx\" height=\"%dpx\" fit=\"meet\" /></layout></head><body><par dur=\"8000ms\"><video src=\"%s\" region=\"Image\" />%s</par></body></smil>", new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i), Integer.valueOf(i2), str6, str5}));
                l = ((int) a(parse3)) + i4;
            }
            fyl = new fyl();
            fyl.b = aig;
            fyl.a = l;
            return fyl;
        }
        l = i4;
        fyl = new fyl();
        fyl.b = aig;
        fyl.a = l;
        return fyl;
    }

    public static fyl a(Context context, String str) {
        aid a = aip.a(context).a(Uri.parse(str));
        if (a instanceof aie) {
            aie aie = (aie) a;
            fyl fyl = new fyl();
            fyl.b = aie.d();
            fyl.a = (int) aie.f();
            return fyl;
        }
        throw new ahz("Invalid PDU type to load");
    }

    private static void a(aig aig, String str) {
        aio aio = new aio();
        aio.b("smil".getBytes());
        aio.c("smil.xml".getBytes());
        aio.e("application/smil".getBytes());
        aio.a(str.getBytes());
        aig.a(0, aio);
    }

    private static int a(Context context, Uri uri) {
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
                    glk.d("Babel_SMS", new StringBuilder(String.valueOf(valueOf).length() + 31).append("getDataLength couldn't stream: ").append(valueOf).toString(), e);
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (Throwable e2) {
                            valueOf2 = String.valueOf(uri);
                            glk.d("Babel_SMS", new StringBuilder(String.valueOf(valueOf2).length() + 30).append("getDataLength couldn't close: ").append(valueOf2).toString(), e2);
                        }
                    }
                }
            }
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Throwable e22) {
                    valueOf2 = String.valueOf(uri);
                    glk.d("Babel_SMS", new StringBuilder(String.valueOf(valueOf2).length() + 30).append("getDataLength couldn't close: ").append(valueOf2).toString(), e22);
                }
            }
        } catch (Throwable e222) {
            valueOf = String.valueOf(uri);
            glk.d("Babel_SMS", new StringBuilder(String.valueOf(valueOf).length() + 29).append("getDataLength couldn't open: ").append(valueOf).toString(), e222);
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Throwable e2222) {
                    valueOf2 = String.valueOf(uri);
                    glk.d("Babel_SMS", new StringBuilder(String.valueOf(valueOf2).length() + 30).append("getDataLength couldn't close: ").append(valueOf2).toString(), e2222);
                }
            }
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Throwable e22222) {
                    valueOf2 = String.valueOf(uri);
                    glk.d("Babel_SMS", new StringBuilder(String.valueOf(valueOf2).length() + 30).append("getDataLength couldn't close: ").append(valueOf2).toString(), e22222);
                }
            }
        }
        return i;
    }

    public static boolean a(int i, int i2) {
        return (gwb.h(i2) && b()) || (gwb.l(i2) && c() && fdq.A.b(i));
    }

    public static boolean b() {
        return ajf.a().t() && ((fzw) jyn.a(gwb.H(), fzw.class)).r() && glq.e(gwb.H());
    }

    public static boolean c() {
        return ((fzw) jyn.a(gwb.H(), fzw.class)).s();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static byte[] a(int r17, int r18, int r19, int r20, android.net.Uri r21, android.content.Context r22) {
        /*
        r3 = 0;
        r2 = r22.getContentResolver();	 Catch:{ FileNotFoundException -> 0x0014 }
        r0 = r21;
        r2 = r2.openInputStream(r0);	 Catch:{ FileNotFoundException -> 0x0014 }
        r2 = gkd.a(r2);	 Catch:{ FileNotFoundException -> 0x0014 }
        r11 = r2;
    L_0x0010:
        if (r11 != 0) goto L_0x003d;
    L_0x0012:
        r2 = 0;
    L_0x0013:
        return r2;
    L_0x0014:
        r2 = move-exception;
        r4 = "Babel_SMS";
        r5 = java.lang.String.valueOf(r21);
        r6 = new java.lang.StringBuilder;
        r7 = java.lang.String.valueOf(r5);
        r7 = r7.length();
        r7 = r7 + 41;
        r6.<init>(r7);
        r7 = "Could not open file corresponding to uri ";
        r6 = r6.append(r7);
        r5 = r6.append(r5);
        r5 = r5.toString();
        glk.d(r4, r5, r2);
        r11 = r3;
        goto L_0x0010;
    L_0x003d:
        r12 = gkd.a();
        r2 = 0;
        r8 = r2;
        r9 = r19;
        r10 = r18;
    L_0x0047:
        r2 = 4;
        if (r8 >= r2) goto L_0x01c1;
    L_0x004a:
        r4 = 0;
        r2 = 0;
        r3 = d;	 Catch:{ OutOfMemoryError -> 0x0196, all -> 0x01ae }
        if (r3 == 0) goto L_0x006a;
    L_0x0050:
        r3 = new java.lang.StringBuilder;	 Catch:{ OutOfMemoryError -> 0x0196, all -> 0x01ae }
        r5 = 61;
        r3.<init>(r5);	 Catch:{ OutOfMemoryError -> 0x0196, all -> 0x01ae }
        r5 = "getResizedImageData: decode limit w=";
        r3 = r3.append(r5);	 Catch:{ OutOfMemoryError -> 0x0196, all -> 0x01ae }
        r3 = r3.append(r10);	 Catch:{ OutOfMemoryError -> 0x0196, all -> 0x01ae }
        r5 = " h=";
        r3 = r3.append(r5);	 Catch:{ OutOfMemoryError -> 0x0196, all -> 0x01ae }
        r3.append(r9);	 Catch:{ OutOfMemoryError -> 0x0196, all -> 0x01ae }
    L_0x006a:
        r0 = r17;
        r4 = r12.b(r11, r10, r9, r0);	 Catch:{ OutOfMemoryError -> 0x0196, all -> 0x01ae }
        if (r4 != 0) goto L_0x0079;
    L_0x0072:
        if (r4 == 0) goto L_0x0077;
    L_0x0074:
        r12.a(r4);
    L_0x0077:
        r2 = 0;
        goto L_0x0013;
    L_0x0079:
        r3 = d;	 Catch:{ OutOfMemoryError -> 0x0196, all -> 0x01ae }
        if (r3 == 0) goto L_0x009f;
    L_0x007d:
        r3 = r4.getWidth();	 Catch:{ OutOfMemoryError -> 0x0196, all -> 0x01ae }
        r5 = r4.getHeight();	 Catch:{ OutOfMemoryError -> 0x0196, all -> 0x01ae }
        r6 = new java.lang.StringBuilder;	 Catch:{ OutOfMemoryError -> 0x0196, all -> 0x01ae }
        r7 = 56;
        r6.<init>(r7);	 Catch:{ OutOfMemoryError -> 0x0196, all -> 0x01ae }
        r7 = "getResizedImageData: decoded w,h=";
        r6 = r6.append(r7);	 Catch:{ OutOfMemoryError -> 0x0196, all -> 0x01ae }
        r3 = r6.append(r3);	 Catch:{ OutOfMemoryError -> 0x0196, all -> 0x01ae }
        r6 = ",";
        r3 = r3.append(r6);	 Catch:{ OutOfMemoryError -> 0x0196, all -> 0x01ae }
        r3.append(r5);	 Catch:{ OutOfMemoryError -> 0x0196, all -> 0x01ae }
    L_0x009f:
        r5 = r4.getWidth();	 Catch:{ OutOfMemoryError -> 0x01d0, all -> 0x01c4 }
        r13 = r4.getHeight();	 Catch:{ OutOfMemoryError -> 0x01d0, all -> 0x01c4 }
        r0 = r18;
        if (r5 > r0) goto L_0x00af;
    L_0x00ab:
        r0 = r19;
        if (r13 <= r0) goto L_0x01d9;
    L_0x00af:
        if (r18 != 0) goto L_0x00d9;
    L_0x00b1:
        r2 = 4607182418800017408; // 0x3ff0000000000000 float:0.0 double:1.0;
        r6 = r2;
    L_0x00b4:
        if (r19 != 0) goto L_0x00e0;
    L_0x00b6:
        r2 = 4607182418800017408; // 0x3ff0000000000000 float:0.0 double:1.0;
    L_0x00b8:
        r2 = java.lang.Math.max(r6, r2);	 Catch:{ OutOfMemoryError -> 0x01d0, all -> 0x01c4 }
        r6 = (double) r5;	 Catch:{ OutOfMemoryError -> 0x01d0, all -> 0x01c4 }
        r6 = r6 / r2;
        r5 = (int) r6;	 Catch:{ OutOfMemoryError -> 0x01d0, all -> 0x01c4 }
        r6 = (double) r13;	 Catch:{ OutOfMemoryError -> 0x01d0, all -> 0x01c4 }
        r2 = r6 / r2;
        r2 = (int) r2;	 Catch:{ OutOfMemoryError -> 0x01d0, all -> 0x01c4 }
        r3 = 0;
        r3 = android.graphics.Bitmap.createScaledBitmap(r4, r5, r2, r3);	 Catch:{ OutOfMemoryError -> 0x01d0, all -> 0x01c4 }
    L_0x00c8:
        if (r3 != 0) goto L_0x00e6;
    L_0x00ca:
        if (r4 == 0) goto L_0x00cf;
    L_0x00cc:
        r12.a(r4);
    L_0x00cf:
        if (r3 == 0) goto L_0x00d6;
    L_0x00d1:
        if (r3 == r4) goto L_0x00d6;
    L_0x00d3:
        r12.a(r3);
    L_0x00d6:
        r2 = 0;
        goto L_0x0013;
    L_0x00d9:
        r2 = (double) r5;
        r0 = r18;
        r6 = (double) r0;
        r2 = r2 / r6;
        r6 = r2;
        goto L_0x00b4;
    L_0x00e0:
        r2 = (double) r13;
        r0 = r19;
        r14 = (double) r0;
        r2 = r2 / r14;
        goto L_0x00b8;
    L_0x00e6:
        r2 = d;	 Catch:{ OutOfMemoryError -> 0x01d3, all -> 0x01c7 }
        if (r2 == 0) goto L_0x010c;
    L_0x00ea:
        r2 = r3.getWidth();	 Catch:{ OutOfMemoryError -> 0x01d3, all -> 0x01c7 }
        r5 = r3.getHeight();	 Catch:{ OutOfMemoryError -> 0x01d3, all -> 0x01c7 }
        r6 = new java.lang.StringBuilder;	 Catch:{ OutOfMemoryError -> 0x01d3, all -> 0x01c7 }
        r7 = 55;
        r6.<init>(r7);	 Catch:{ OutOfMemoryError -> 0x01d3, all -> 0x01c7 }
        r7 = "getResizedImageData: scaled w,h=";
        r6 = r6.append(r7);	 Catch:{ OutOfMemoryError -> 0x01d3, all -> 0x01c7 }
        r2 = r6.append(r2);	 Catch:{ OutOfMemoryError -> 0x01d3, all -> 0x01c7 }
        r6 = ",";
        r2 = r2.append(r6);	 Catch:{ OutOfMemoryError -> 0x01d3, all -> 0x01c7 }
        r2.append(r5);	 Catch:{ OutOfMemoryError -> 0x01d3, all -> 0x01c7 }
    L_0x010c:
        r2 = 95;
        r2 = gkd.a(r3, r2);	 Catch:{ OutOfMemoryError -> 0x01d3, all -> 0x01c7 }
        if (r2 == 0) goto L_0x0119;
    L_0x0114:
        r5 = r2.length;	 Catch:{ OutOfMemoryError -> 0x01d3, all -> 0x01c7 }
        r0 = r20;
        if (r5 <= r0) goto L_0x015e;
    L_0x0119:
        r5 = r20 * 95;
        r2 = r2.length;	 Catch:{ OutOfMemoryError -> 0x01d3, all -> 0x01c7 }
        r2 = r5 / r2;
        r5 = 50;
        if (r2 >= r5) goto L_0x01d6;
    L_0x0122:
        r2 = 50;
        r5 = r2;
    L_0x0125:
        r2 = d;	 Catch:{ OutOfMemoryError -> 0x01d3, all -> 0x01c7 }
        if (r2 == 0) goto L_0x0139;
    L_0x0129:
        r2 = new java.lang.StringBuilder;	 Catch:{ OutOfMemoryError -> 0x01d3, all -> 0x01c7 }
        r6 = 55;
        r2.<init>(r6);	 Catch:{ OutOfMemoryError -> 0x01d3, all -> 0x01c7 }
        r6 = "getResizedImageData: compress(2) w/ quality=";
        r2 = r2.append(r6);	 Catch:{ OutOfMemoryError -> 0x01d3, all -> 0x01c7 }
        r2.append(r5);	 Catch:{ OutOfMemoryError -> 0x01d3, all -> 0x01c7 }
    L_0x0139:
        r2 = gkd.a(r3, r5);	 Catch:{ OutOfMemoryError -> 0x01d3, all -> 0x01c7 }
        r6 = 50;
        if (r5 <= r6) goto L_0x015e;
    L_0x0141:
        if (r2 == 0) goto L_0x0148;
    L_0x0143:
        r5 = r2.length;	 Catch:{ OutOfMemoryError -> 0x01d3, all -> 0x01c7 }
        r0 = r20;
        if (r5 <= r0) goto L_0x015e;
    L_0x0148:
        r2 = d;	 Catch:{ OutOfMemoryError -> 0x01d3, all -> 0x01c7 }
        if (r2 == 0) goto L_0x0158;
    L_0x014c:
        r2 = new java.lang.StringBuilder;	 Catch:{ OutOfMemoryError -> 0x01d3, all -> 0x01c7 }
        r5 = 55;
        r2.<init>(r5);	 Catch:{ OutOfMemoryError -> 0x01d3, all -> 0x01c7 }
        r5 = "getResizedImageData: compress(2) w/ quality=50";
        r2.append(r5);	 Catch:{ OutOfMemoryError -> 0x01d3, all -> 0x01c7 }
    L_0x0158:
        r2 = 50;
        r2 = gkd.a(r3, r2);	 Catch:{ OutOfMemoryError -> 0x01d3, all -> 0x01c7 }
    L_0x015e:
        if (r2 == 0) goto L_0x0173;
    L_0x0160:
        r5 = r2.length;	 Catch:{ OutOfMemoryError -> 0x01d3, all -> 0x01c7 }
        r0 = r20;
        if (r5 > r0) goto L_0x0173;
    L_0x0165:
        if (r4 == 0) goto L_0x016a;
    L_0x0167:
        r12.a(r4);
    L_0x016a:
        if (r3 == 0) goto L_0x0013;
    L_0x016c:
        if (r3 == r4) goto L_0x0013;
    L_0x016e:
        r12.a(r3);
        goto L_0x0013;
    L_0x0173:
        if (r4 == 0) goto L_0x0178;
    L_0x0175:
        r12.a(r4);
    L_0x0178:
        if (r3 == 0) goto L_0x017f;
    L_0x017a:
        if (r3 == r4) goto L_0x017f;
    L_0x017c:
        r12.a(r3);
    L_0x017f:
        r2 = (double) r10;
        r4 = 4603579539312869376; // 0x3fe3333340000000 float:2.0 double:0.6000000238418579;
        r2 = r2 * r4;
        r4 = (int) r2;
        r2 = (double) r9;
        r6 = 4603579539312869376; // 0x3fe3333340000000 float:2.0 double:0.6000000238418579;
        r2 = r2 * r6;
        r3 = (int) r2;
        r2 = r8 + 1;
        r8 = r2;
        r9 = r3;
        r10 = r4;
        goto L_0x0047;
    L_0x0196:
        r3 = move-exception;
    L_0x0197:
        r3 = "Babel_SMS";
        r5 = "getResizedImageData - image too big (OutOfMemoryError), will try  with smaller scale factor";
        r6 = 0;
        r6 = new java.lang.Object[r6];	 Catch:{ all -> 0x01c9 }
        glk.d(r3, r5, r6);	 Catch:{ all -> 0x01c9 }
        if (r4 == 0) goto L_0x01a6;
    L_0x01a3:
        r12.a(r4);
    L_0x01a6:
        if (r2 == 0) goto L_0x017f;
    L_0x01a8:
        if (r2 == r4) goto L_0x017f;
    L_0x01aa:
        r12.a(r2);
        goto L_0x017f;
    L_0x01ae:
        r3 = move-exception;
        r16 = r3;
        r3 = r2;
        r2 = r16;
    L_0x01b4:
        if (r4 == 0) goto L_0x01b9;
    L_0x01b6:
        r12.a(r4);
    L_0x01b9:
        if (r3 == 0) goto L_0x01c0;
    L_0x01bb:
        if (r3 == r4) goto L_0x01c0;
    L_0x01bd:
        r12.a(r3);
    L_0x01c0:
        throw r2;
    L_0x01c1:
        r2 = 0;
        goto L_0x0013;
    L_0x01c4:
        r2 = move-exception;
        r3 = r4;
        goto L_0x01b4;
    L_0x01c7:
        r2 = move-exception;
        goto L_0x01b4;
    L_0x01c9:
        r3 = move-exception;
        r16 = r3;
        r3 = r2;
        r2 = r16;
        goto L_0x01b4;
    L_0x01d0:
        r2 = move-exception;
        r2 = r4;
        goto L_0x0197;
    L_0x01d3:
        r2 = move-exception;
        r2 = r3;
        goto L_0x0197;
    L_0x01d6:
        r5 = r2;
        goto L_0x0125;
    L_0x01d9:
        r3 = r4;
        goto L_0x00c8;
        */
        throw new UnsupportedOperationException("Method not decompiled: fyi.a(int, int, int, int, android.net.Uri, android.content.Context):byte[]");
    }

    public static long a(Uri uri) {
        Throwable e;
        String valueOf;
        String valueOf2;
        AssetFileDescriptor assetFileDescriptor = null;
        try {
            AssetFileDescriptor openAssetFileDescriptor = gwb.H().getContentResolver().openAssetFileDescriptor(uri, "r");
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
                        glk.d("Babel_SMS", new StringBuilder(String.valueOf(valueOf3).length() + 43).append("MmsUtils.getMediaFileSize: failed to close ").append(valueOf3).toString(), e2);
                        return statSize;
                    }
                } catch (FileNotFoundException e3) {
                    e = e3;
                    assetFileDescriptor = openAssetFileDescriptor;
                    try {
                        valueOf = String.valueOf(e);
                        glk.d("Babel_SMS", new StringBuilder(String.valueOf(valueOf).length() + 54).append("MmsUtils.getMediaFileSize: cound not find media file: ").append(valueOf).toString(), e);
                        if (assetFileDescriptor != null) {
                            try {
                                assetFileDescriptor.close();
                            } catch (Throwable e4) {
                                valueOf2 = String.valueOf(e4);
                                glk.d("Babel_SMS", new StringBuilder(String.valueOf(valueOf2).length() + 43).append("MmsUtils.getMediaFileSize: failed to close ").append(valueOf2).toString(), e4);
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
                                glk.d("Babel_SMS", new StringBuilder(String.valueOf(valueOf).length() + 43).append("MmsUtils.getMediaFileSize: failed to close ").append(valueOf).toString(), e5);
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
                    glk.d("Babel_SMS", new StringBuilder(String.valueOf(valueOf2).length() + 43).append("MmsUtils.getMediaFileSize: failed to close ").append(valueOf2).toString(), e42);
                }
            }
            return 0;
        } catch (FileNotFoundException e6) {
            e42 = e6;
            valueOf = String.valueOf(e42);
            glk.d("Babel_SMS", new StringBuilder(String.valueOf(valueOf).length() + 54).append("MmsUtils.getMediaFileSize: cound not find media file: ").append(valueOf).toString(), e42);
            if (assetFileDescriptor != null) {
                assetFileDescriptor.close();
            }
            return 0;
        }
    }

    public static List<String> a(long j) {
        List<String> list = null;
        if (j > 0) {
            Context H = gwb.H();
            Cursor query = H.getContentResolver().query(l, m, "_id=?", new String[]{String.valueOf(j)}, null);
            if (query != null) {
                try {
                    if (query.moveToFirst()) {
                        Object string = query.getString(1);
                        if (!TextUtils.isEmpty(string)) {
                            list = c(H, string);
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

    private static List<String> c(Context context, String str) {
        List<String> arrayList = new ArrayList();
        for (String parseLong : str.split(" ")) {
            try {
                long parseLong2 = Long.parseLong(parseLong);
                if (parseLong2 < 0) {
                    glk.e("Babel_SMS", "MmsUtils.getAddresses: invalid id " + parseLong2, new Object[0]);
                } else {
                    Cursor query;
                    try {
                        query = context.getContentResolver().query(ContentUris.withAppendedId(n, parseLong2), null, null, null, null);
                    } catch (Throwable e) {
                        glk.d("Babel_SMS", "MmsUtils.getAddresses: query failed for id " + parseLong2, e);
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
                glk.d("Babel_SMS", new StringBuilder(String.valueOf(valueOf).length() + 35).append("MmsUtils.getAddresses: invalid id. ").append(valueOf).toString(), e2);
            }
        }
        return arrayList;
    }

    public static long a(Context context, List<String> list) {
        long j = -1;
        if (!(list == null || list.size() == 0)) {
            try {
                j = ajc.a(context, new HashSet(list));
            } catch (IllegalArgumentException e) {
                String valueOf = String.valueOf(e);
                glk.e("Babel_SMS", new StringBuilder(String.valueOf(valueOf).length() + 36).append("MmsUtils: getting thread id failed: ").append(valueOf).toString(), new Object[0]);
            }
        }
        return j;
    }

    private static Uri a(ContentResolver contentResolver, Uri uri, String str, String str2, String str3, Long l, boolean z, boolean z2, long j) {
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
            glk.d("Babel_SMS", new StringBuilder(String.valueOf(valueOf).length() + 38).append("MmsUtils: persist sms message failure ").append(valueOf).toString(), e);
            return null;
        } catch (IllegalArgumentException e3) {
            e = e3;
            valueOf = String.valueOf(e);
            glk.d("Babel_SMS", new StringBuilder(String.valueOf(valueOf).length() + 38).append("MmsUtils: persist sms message failure ").append(valueOf).toString(), e);
            return null;
        }
    }

    public static Uri a(Context context, String str, String str2, long j, long j2, boolean z) {
        return a(context.getContentResolver(), j, str, str2, null, Long.valueOf(j), true, false, j2);
    }

    public static Uri a(Context context, aiv aiv, aiu aiu, aiq aiq) {
        Uri a;
        Throwable e;
        String valueOf;
        try {
            a = aip.a(context).a(aiv, h, true, b(), null, aiq);
            try {
                if (aiu.d() == null) {
                    glk.e("Babel_SMS", "MmsUtils: null MessageId:" + aiu.e(), new Object[0]);
                } else {
                    ContentValues contentValues = new ContentValues(2);
                    contentValues.put("resp_st", Integer.valueOf(aiu.e()));
                    contentValues.put("m_id", aip.a(aiu.d()));
                    gwb.a(context.getContentResolver(), a, contentValues, null, null);
                }
            } catch (ahz e2) {
                e = e2;
                valueOf = String.valueOf(e);
                glk.d("Babel_SMS", new StringBuilder(String.valueOf(valueOf).length() + 43).append("MmsUtils: persist mms sent message failure ").append(valueOf).toString(), e);
                return a;
            } catch (SQLiteException e3) {
                e = e3;
                valueOf = String.valueOf(e);
                glk.d("Babel_SMS", new StringBuilder(String.valueOf(valueOf).length() + 42).append("MmsUtils: update mms sent message failure ").append(valueOf).toString(), e);
                return a;
            }
        } catch (Throwable e4) {
            e = e4;
            a = null;
            valueOf = String.valueOf(e);
            glk.d("Babel_SMS", new StringBuilder(String.valueOf(valueOf).length() + 43).append("MmsUtils: persist mms sent message failure ").append(valueOf).toString(), e);
            return a;
        } catch (Throwable e42) {
            e = e42;
            a = null;
            valueOf = String.valueOf(e);
            glk.d("Babel_SMS", new StringBuilder(String.valueOf(valueOf).length() + 42).append("MmsUtils: update mms sent message failure ").append(valueOf).toString(), e);
            return a;
        }
        return a;
    }

    public static Uri a(Context context, ait ait) {
        Uri a;
        Throwable e;
        String valueOf;
        try {
            a = aip.a(context).a(ait, g, true, b(), null);
            try {
                ContentValues contentValues = new ContentValues(1);
                contentValues.put("date", Long.valueOf(glj.a() / 1000));
                contentValues.put("seen", Integer.valueOf(1));
                gwb.a(context.getContentResolver(), a, contentValues, null, null);
            } catch (ahz e2) {
                e = e2;
                valueOf = String.valueOf(e);
                glk.d("Babel_SMS", new StringBuilder(String.valueOf(valueOf).length() + 47).append("MmsUtils: persist mms received message failure ").append(valueOf).toString(), e);
                return a;
            } catch (SQLiteException e3) {
                e = e3;
                valueOf = String.valueOf(e);
                glk.d("Babel_SMS", new StringBuilder(String.valueOf(valueOf).length() + 46).append("MmsUtils: update mms received message failure ").append(valueOf).toString(), e);
                return a;
            }
        } catch (Throwable e4) {
            e = e4;
            a = null;
            valueOf = String.valueOf(e);
            glk.d("Babel_SMS", new StringBuilder(String.valueOf(valueOf).length() + 47).append("MmsUtils: persist mms received message failure ").append(valueOf).toString(), e);
            return a;
        } catch (Throwable e42) {
            e = e42;
            a = null;
            valueOf = String.valueOf(e);
            glk.d("Babel_SMS", new StringBuilder(String.valueOf(valueOf).length() + 46).append("MmsUtils: update mms received message failure ").append(valueOf).toString(), e);
            return a;
        }
        return a;
    }

    public static ContentValues a(Context context, SmsMessage[] smsMessageArr, int i) {
        int i2 = 1;
        SmsMessage smsMessage = smsMessageArr[0];
        ContentValues contentValues = new ContentValues();
        contentValues.put("address", smsMessage.getDisplayOriginatingAddress());
        contentValues.put("body", a(smsMessageArr));
        if (f()) {
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
        } else if (ajb.a != null) {
            displayOriginatingAddress = ajb.a.c();
        }
        contentValues.put("thread_id", Long.valueOf(ajc.a(context, displayOriginatingAddress)));
        return contentValues;
    }

    private static String c(String str) {
        return str == null ? "" : str.replace('\f', '\n');
    }

    private static String a(SmsMessage[] smsMessageArr) {
        int i = 0;
        if (smsMessageArr.length == 1) {
            return c(smsMessageArr[0].getDisplayMessageBody());
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
        return c(stringBuilder.toString());
    }

    public static Long a(SmsMessage smsMessage, long j) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar(2011, 8, 18);
        Calendar gregorianCalendar2 = new GregorianCalendar();
        gregorianCalendar2.setTimeInMillis(j);
        if (gregorianCalendar2.before(gregorianCalendar)) {
            j = smsMessage.getTimestampMillis();
        }
        return Long.valueOf(j);
    }

    public static CharSequence a(String str, CharSequence charSequence) {
        CharSequence charSequence2;
        Context H = gwb.H();
        String b = b(H, str);
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

    public static String b(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (e == null) {
            e = context.getResources().getStringArray(gwb.dq);
        }
        for (String equalsIgnoreCase : e) {
            if (str.equalsIgnoreCase(equalsIgnoreCase)) {
                return null;
            }
        }
        return str;
    }

    public static String b(Uri uri) {
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

    public static String a(blo blo, edo edo, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return a(blo, edo, Arrays.asList(str.split(";")));
    }

    public static String a(blo blo, edo edo, List<String> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        List arrayList = new ArrayList();
        for (String a : list) {
            edk a2 = gwb.a(gwb.H(), a, null, null);
            if (edo != null && edo.a(a2.b)) {
                a2.i = Boolean.TRUE;
            }
            arrayList.add(a2);
        }
        return a(blo, edo != null, arrayList);
    }

    public static String a(blo blo, boolean z, List<edk> list) {
        int i = 1;
        if (list == null || list.isEmpty()) {
            return null;
        }
        fhc fhc = new fhc();
        fhc.a(-1);
        boy boy = boy.LOCAL_ONLY;
        if (list.size() > 1) {
            i = 2;
        }
        return blf.a(blo, z, null, list, null, null, boy, i, 3, false, fhc, null);
    }

    public static void a(int i, byte[] bArr) {
        aid aid = null;
        try {
            aid = new ain(bArr).a();
        } catch (Throwable e) {
            glk.d("Babel_SMS", "Invalid MMS WAP push", e);
        }
        if (aid == null) {
            glk.e("Babel_SMS", "Invalid WAP push data", new Object[0]);
            return;
        }
        switch (aid.b()) {
            case 130:
                aif aif = (aif) aid;
                if (ajf.a().f()) {
                    Object d = aif.d();
                    if (61 == d[d.length - 1]) {
                        Object g = aif.g();
                        Object obj = new byte[(d.length + g.length)];
                        System.arraycopy(d, 0, obj, 0, d.length);
                        System.arraycopy(g, 0, obj, d.length, g.length);
                        aif.b(obj);
                    }
                }
                blf.a(i, aif);
            default:
        }
    }

    public static boolean a(Context context) {
        if (VERSION.SDK_INT > 22 && d(context)) {
            glk.d("Babel", "MmsUtils: Possible bad MMS Proxy port detected.", new Object[0]);
        }
        if (VERSION.SDK_INT > 22) {
            return true;
        }
        return false;
    }

    private static boolean d(Context context) {
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
                        glk.c("Babel", new StringBuilder(String.valueOf(string).length() + 56).append("MmsUtils: incompatible APN MMS proxy found: ").append(string).append(":").append(i).toString(), new Object[0]);
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
            glk.c("Babel", "MmsUtils: No incompatible APN MMS proxy configurations found.", new Object[0]);
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

    public static boolean d() {
        fzw fzw = (fzw) jyn.a(gwb.H(), fzw.class);
        if (!fzw.k() || (!fzw.l() && ((TelephonyManager) gwb.H().getSystemService("phone")).isNetworkRoaming())) {
            return false;
        }
        return true;
    }

    public static long b(long j) {
        return ((j + 1000) - 1) / 1000;
    }

    public static long c(Uri uri) {
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

    public static String a(List<String> list, String str) {
        if (list != null && list.size() > 0) {
            StringBuilder stringBuilder = new StringBuilder();
            if (str != null) {
                str = glq.e(gwb.H(), str);
            }
            for (String str2 : list) {
                if (str == null || !TextUtils.equals(str, glq.e(gwb.H(), str2))) {
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

    public static SmsMessage a(Intent intent) {
        return SmsMessage.createFromPdu(intent.getByteArrayExtra("pdu"));
    }

    public static void a(String str, int i, long j) {
        if (str != null) {
            Uri parse = Uri.parse(str);
            ContentValues contentValues = new ContentValues();
            contentValues.put("status", Integer.valueOf(i));
            if (f()) {
                contentValues.put("date_sent", Long.valueOf(j));
            }
            gwb.H().getContentResolver().update(parse, contentValues, null, null);
        }
    }

    public static String a(String str) {
        return String.format(Locale.US, "((%s LIKE '%s') OR (%s LIKE '%s') OR (%s LIKE '%s') OR (%s='%s'))", new Object[]{str, "image/%", str, "video/%", str, "audio/%", str, "application/ogg"});
    }

    public static int e() {
        String format = String.format(Locale.US, "%s AND (%s IN (SELECT %s FROM part WHERE %s))", new Object[]{fzb.c, "_id", "mid", a("ct")});
        ContentResolver contentResolver = gwb.H().getContentResolver();
        Cursor query = contentResolver.query(f, new String[]{"_id"}, format, null, null);
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
                    String format2 = String.format(Locale.US, "%s IN %s", new Object[]{"_id", a(min)});
                    if (min <= 0) {
                        strArr = null;
                    } else {
                        strArr = new String[min];
                        for (i = 0; i < min; i++) {
                            strArr[i] = Long.toString(jArr[i3 + i]);
                        }
                    }
                    i = contentResolver.delete(f, format2, strArr);
                    if (glk.a("Babel_SMS", 3)) {
                        String valueOf = String.valueOf(TextUtils.join(",", strArr));
                        glk.b("Babel_SMS", new StringBuilder(String.valueOf(valueOf).length() + 59).append("deleteMediaMessages: deleting IDs = ").append(valueOf).append(", deleted = ").append(i).toString(), new Object[0]);
                    }
                    i2 += i;
                }
                return i2;
            }
        }
        return 0;
    }

    public static String a(int i) {
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

    public static int c(long j) {
        ContentResolver contentResolver = gwb.H().getContentResolver();
        return contentResolver.delete(f, String.format(Locale.US, "%s AND (%s<=%d)", new Object[]{fzb.c, "date", Long.valueOf(j / 1000)}), null) + (contentResolver.delete(i, String.format(Locale.US, "%s AND (%s<=%d)", new Object[]{fzb.b, "date", Long.valueOf(j)}), null) + 0);
    }

    public static void a(long j, long j2) {
        ContentResolver contentResolver = gwb.H().getContentResolver();
        ContentValues contentValues = new ContentValues();
        contentValues.put("read", Integer.valueOf(1));
        contentResolver.update(i, contentValues, String.format(Locale.US, "%s=%d AND %s<=%d AND %s=0", new Object[]{"thread_id", Long.valueOf(j), "date", Long.valueOf(j2), "read"}), null);
        contentResolver.update(f, contentValues, String.format(Locale.US, "%s=%d AND %s<=%d AND %s=0", new Object[]{"thread_id", Long.valueOf(j), "date", Long.valueOf(j2 / 1000), "read"}), null);
    }

    public static void a(Uri uri, boolean z) {
        ContentResolver contentResolver = gwb.H().getContentResolver();
        ContentValues contentValues = new ContentValues();
        contentValues.put("read", Integer.valueOf(z ? 1 : 0));
        contentResolver.update(uri, contentValues, null, null);
    }

    public static void d(Uri uri) {
        ContentResolver contentResolver = gwb.H().getContentResolver();
        ContentValues contentValues = new ContentValues();
        contentValues.put("seen", Integer.valueOf(1));
        contentResolver.update(uri, contentValues, "seen != 1", null);
    }

    public static ArrayList<fyj> b(String str) {
        Iterable<String> m = gwb.m(str);
        ArrayList<fyj> arrayList = new ArrayList();
        fyj fyj = null;
        int i = 0;
        for (String str2 : m) {
            fyj fyj2;
            int i2;
            switch (i) {
                case wi.w /*0*/:
                    fyj = new fyj();
                    fyj.a = str2;
                    fyj2 = fyj;
                    i2 = i;
                    break;
                case wi.j /*1*/:
                    fyj.b = str2;
                    fyj2 = fyj;
                    i2 = i;
                    break;
                case wi.l /*2*/:
                    try {
                        fyj.c = Integer.parseInt(str2);
                        fyj2 = fyj;
                        i2 = i;
                        break;
                    } catch (Exception e) {
                        fyj.c = 0;
                        fyj2 = fyj;
                        i2 = i;
                        break;
                    }
                case wi.z /*3*/:
                    try {
                        fyj.d = Integer.parseInt(str2);
                    } catch (Exception e2) {
                        fyj.d = 0;
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

    public static String a(byte[] bArr, String str) {
        if (bArr == null) {
            return null;
        }
        try {
            return new String(bArr, str);
        } catch (Throwable e) {
            String valueOf = String.valueOf(e);
            glk.d("Babel_SMS", new StringBuilder(String.valueOf(valueOf).length() + 24).append("MmsUtils.bytesToString: ").append(valueOf).toString(), e);
            return new String(bArr);
        }
    }

    public static byte[] a(String str, String str2) {
        if (str == null) {
            return null;
        }
        try {
            return str.getBytes(str2);
        } catch (Throwable e) {
            String valueOf = String.valueOf(e);
            glk.d("Babel_SMS", new StringBuilder(String.valueOf(valueOf).length() + 24).append("MmsUtils.stringToBytes: ").append(valueOf).toString(), e);
            return str.getBytes();
        }
    }

    public static boolean f() {
        Cursor a;
        Throwable e;
        if (p == null) {
            try {
                a = gwb.a(gwb.H().getContentResolver(), i, o, null, null, "date_sent ASC LIMIT 1");
                try {
                    p = Boolean.valueOf(true);
                    if (a != null) {
                        a.close();
                    }
                } catch (SQLiteException e2) {
                    e = e2;
                    try {
                        glk.c("Babel_SMS", "date_sent in sms table does not exist", e);
                        p = Boolean.valueOf(false);
                        if (a != null) {
                            a.close();
                        }
                        return gwb.b(p);
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
                glk.c("Babel_SMS", "date_sent in sms table does not exist", e);
                p = Boolean.valueOf(false);
                if (a != null) {
                    a.close();
                }
                return gwb.b(p);
            } catch (Throwable th2) {
                e = th2;
                a = null;
                if (a != null) {
                    a.close();
                }
                throw e;
            }
        }
        return gwb.b(p);
    }

    public static boolean b(Context context) {
        if (r == null) {
            boolean c = c(context);
            if (c && gld.a()) {
                c = !((fzw) jyn.a(context, fzw.class)).b("use_local_apn_pref_key");
            }
            r = Boolean.valueOf(c);
        }
        return gwb.b(r);
    }

    public static boolean c(Context context) {
        try {
            Cursor a = gwb.a(context.getContentResolver(), b, q, null, null, null);
            if (a != null) {
                a.close();
            }
            return true;
        } catch (Throwable e) {
            glk.c("Babel_SMS", "Can't access system APN, using internal table", e);
            return false;
        }
    }

    public static void a(Context context, boolean z) {
        r = Boolean.valueOf(z);
        if (!z && VERSION.SDK_INT != 17) {
            SQLiteDatabase a = bjs.a(context);
            try {
                Cursor query = a.query("apn", bjs.a, null, null, null, null, null, null);
                if (query != null) {
                    query.close();
                }
            } catch (Exception e) {
                bjs.b(a);
            }
        }
    }

    public static boolean g() {
        return gld.a() && ((fzw) jyn.a(gwb.H(), fzw.class)).m();
    }

    public static boolean h() {
        return gld.a() && ((fzw) jyn.a(gwb.H(), fzw.class)).n();
    }

    public static fxp e(Uri uri) {
        Cursor a;
        fxp a2;
        String format;
        Throwable e;
        Throwable e2;
        String valueOf;
        Object obj;
        Cursor cursor = null;
        ContentResolver contentResolver = gwb.H().getContentResolver();
        try {
            a = gwb.a(contentResolver, uri, fxp.a, null, null, null);
            if (a != null) {
                try {
                    if (a.moveToFirst()) {
                        a2 = fxp.a(a);
                        if (a != null) {
                            a.close();
                        }
                        if (a2 != null) {
                            return cursor;
                        }
                        format = String.format(Locale.US, "%s != '%s' AND %s = ?", new Object[]{"ct", "application/smil", "mid"});
                        try {
                            cursor = gwb.a(contentResolver, c, fxq.a, format, new String[]{Long.toString(a2.m)}, null);
                            if (cursor != null) {
                                while (cursor.moveToNext()) {
                                    a2.a(fxq.a(cursor, true));
                                }
                            }
                            if (cursor != null) {
                                cursor.close();
                            }
                        } catch (Throwable e3) {
                            String valueOf2 = String.valueOf(e3);
                            glk.d("Babel_SMS", new StringBuilder(String.valueOf(valueOf2).length() + 32).append("MmsLoader: query parts failure: ").append(valueOf2).toString(), e3);
                            return a2;
                        } finally {
                            if (cursor != null) {
                                cursor.close();
                            }
                        }
                        return a2;
                    }
                } catch (SQLiteException e4) {
                    e2 = e4;
                    try {
                        valueOf = String.valueOf(e2);
                        glk.d("Babel_SMS", new StringBuilder(String.valueOf(valueOf).length() + 30).append("MmsLoader: query pdu failure: ").append(valueOf).toString(), e2);
                        if (a == null) {
                            obj = cursor;
                        } else {
                            a.close();
                            obj = cursor;
                        }
                        if (a2 != null) {
                            return cursor;
                        }
                        format = String.format(Locale.US, "%s != '%s' AND %s = ?", new Object[]{"ct", "application/smil", "mid"});
                        cursor = gwb.a(contentResolver, c, fxq.a, format, new String[]{Long.toString(a2.m)}, null);
                        if (cursor != null) {
                            while (cursor.moveToNext()) {
                                a2.a(fxq.a(cursor, true));
                            }
                        }
                        if (cursor != null) {
                            cursor.close();
                        }
                        return a2;
                    } catch (Throwable th) {
                        e3 = th;
                        if (a != null) {
                            a.close();
                        }
                        throw e3;
                    }
                }
            }
            obj = cursor;
            if (a != null) {
                a.close();
            }
        } catch (SQLiteException e5) {
            e2 = e5;
            a = cursor;
            valueOf = String.valueOf(e2);
            glk.d("Babel_SMS", new StringBuilder(String.valueOf(valueOf).length() + 30).append("MmsLoader: query pdu failure: ").append(valueOf).toString(), e2);
            if (a == null) {
                a.close();
                obj = cursor;
            } else {
                obj = cursor;
            }
            if (a2 != null) {
                return cursor;
            }
            format = String.format(Locale.US, "%s != '%s' AND %s = ?", new Object[]{"ct", "application/smil", "mid"});
            cursor = gwb.a(contentResolver, c, fxq.a, format, new String[]{Long.toString(a2.m)}, null);
            if (cursor != null) {
                while (cursor.moveToNext()) {
                    a2.a(fxq.a(cursor, true));
                }
            }
            if (cursor != null) {
                cursor.close();
            }
            return a2;
        } catch (Throwable th2) {
            e3 = th2;
            a = cursor;
            if (a != null) {
                a.close();
            }
            throw e3;
        }
        if (a2 != null) {
            return cursor;
        }
        format = String.format(Locale.US, "%s != '%s' AND %s = ?", new Object[]{"ct", "application/smil", "mid"});
        cursor = gwb.a(contentResolver, c, fxq.a, format, new String[]{Long.toString(a2.m)}, null);
        if (cursor != null) {
            while (cursor.moveToNext()) {
                a2.a(fxq.a(cursor, true));
            }
        }
        if (cursor != null) {
            cursor.close();
        }
        return a2;
    }

    public static String a(List<String> list, long j) {
        Context H = gwb.H();
        if (list != null && list.size() == 1) {
            return (String) list.get(0);
        }
        Cursor a = gwb.a(H.getContentResolver(), Uri.parse("content://mms/" + j + "/addr"), new String[]{"address", "charset"}, "type=137", null, null);
        if (a != null) {
            try {
                if (a.moveToFirst()) {
                    String a2 = fxo.a(a);
                    return a2;
                }
                a.close();
            } finally {
                a.close();
            }
        }
        return null;
    }

    public static void a(byte[] bArr, aid aid, Context context) {
        if (!(aid instanceof ait)) {
            glk.e("Babel", "dumpPdu: not RetrieveConf", new Object[0]);
        } else if (((ehz) jyn.a(context, ehz.class)).a("android.permission.WRITE_EXTERNAL_STORAGE")) {
            Object obj;
            byte[] h = ((ait) aid).h();
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
            BufferedOutputStream bufferedOutputStream;
            try {
                bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file));
                bufferedOutputStream.write(bArr);
                bufferedOutputStream.flush();
                bufferedOutputStream.close();
            } catch (Throwable e) {
                glk.d("Babel", "MmsUtils: I/O error dumping pdu", e);
            } catch (Throwable th) {
                bufferedOutputStream.close();
            }
        } else {
            Toast.makeText(context, "You enabled SMS/MMS dump, but no storage permission. Please go to Settings to turn on storage permission", 0).show();
        }
    }
}
