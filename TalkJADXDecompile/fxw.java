import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.telephony.SmsManager;
import com.google.android.apps.hangouts.sms.MmsFileProvider;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

public class fxw {
    private static final boolean a;
    private static final AtomicLong b;
    private static final Uri c;
    private static ConcurrentHashMap<Long, fxx> e;
    private final SmsManager d;

    static {
        kae kae = glk.r;
        a = false;
        b = new AtomicLong(1);
        c = Uri.parse("content://hangoutsmmsdownload");
        e = new ConcurrentHashMap();
    }

    public fxw(SmsManager smsManager) {
        this.d = smsManager;
    }

    public void a(long j, int i, int i2) {
        if (i != -1) {
            glk.e("Babel_SMS", "MmsDownloader: failure in downloading mms.  requestId=" + j + " resultCode=" + i + " httpStatusCode=" + i2, new Object[0]);
        } else if (a) {
            new StringBuilder(113).append("MmsDownloader: received result.  requestId=").append(j).append(" resultCode=").append(i).append(" httpStatusCode=").append(i2);
        }
        if (j >= 0) {
            fxx fxx = (fxx) e.get(Long.valueOf(j));
            if (fxx != null) {
                synchronized (fxx) {
                    fxx.a(i, i2);
                    fxx.notifyAll();
                }
            }
        }
    }

    public ait a(Context context, byte[] bArr, String str) {
        String valueOf;
        if (a) {
            String str2 = "MmsDownloader.retrieveMmsPdu: ";
            valueOf = String.valueOf(str);
            if (valueOf.length() != 0) {
                str2.concat(valueOf);
            } else {
                valueOf = new String(str2);
            }
        }
        gwb.aK();
        fxx a = a(context, str);
        if (a) {
            valueOf = String.valueOf(a);
            new StringBuilder(String.valueOf(valueOf).length() + 35).append("MmsDownloader: downloadMms result: ").append(valueOf);
        }
        if (a.b) {
            switch (a.a()) {
                case wi.j /*1*/:
                    glk.d("Babel_SMS", "MmsDownloader: temporary failure with status code " + a.c, new Object[0]);
                    throw new fyf("Temporary failure downloading MMS");
                case wi.l /*2*/:
                    glk.e("Babel_SMS", "MmsDownloader: permanent failure with status code " + a.c, new Object[0]);
                    throw new fxy(119);
                default:
                    ait a2 = a(a.a, str, context);
                    if (a2 == null) {
                        glk.e("Babel_SMS", "MmsDownloader: empty bytes received", new Object[0]);
                        throw new fxy(137, "MmsDownloader got empty or invalid response");
                    }
                    ((fyd) jyn.a(context, fyd.class)).a(context, bArr, str, 129);
                    return a2;
            }
        }
        glk.d("Babel_SMS", "MmsDownloader: timed out waiting for MMS download", new Object[0]);
        throw new fyf("Timeout waiting for MMS download");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private fxx a(android.content.Context r13, java.lang.String r14) {
        /*
        r12 = this;
        r0 = a;
        if (r0 == 0) goto L_0x0013;
    L_0x0004:
        r0 = "MmsDownloader.downloadMessage: ";
        r1 = java.lang.String.valueOf(r14);
        r2 = r1.length();
        if (r2 == 0) goto L_0x00a6;
    L_0x0010:
        r0.concat(r1);
    L_0x0013:
        r0 = com.google.android.apps.hangouts.sms.MmsFileProvider.a(r13);
        r4 = new fxx;
        r4.<init>(r0);
        r1 = b;
        r6 = r1.getAndIncrement();
        r1 = a;
        if (r1 == 0) goto L_0x005f;
    L_0x0026:
        r1 = java.lang.String.valueOf(r0);
        r2 = new java.lang.StringBuilder;
        r3 = java.lang.String.valueOf(r14);
        r3 = r3.length();
        r3 = r3 + 95;
        r5 = java.lang.String.valueOf(r1);
        r5 = r5.length();
        r3 = r3 + r5;
        r2.<init>(r3);
        r3 = "MmsDownloader: downloading MMS. contentLocation=";
        r2 = r2.append(r3);
        r2 = r2.append(r14);
        r3 = " destinationUri=";
        r2 = r2.append(r3);
        r1 = r2.append(r1);
        r2 = " requestId=";
        r1 = r1.append(r2);
        r1.append(r6);
    L_0x005f:
        monitor-enter(r4);
        r1 = e;	 Catch:{ all -> 0x00b9 }
        r2 = java.lang.Long.valueOf(r6);	 Catch:{ all -> 0x00b9 }
        r1.put(r2, r4);	 Catch:{ all -> 0x00b9 }
        r1 = c;	 Catch:{ all -> 0x00b9 }
        r1 = android.content.ContentUris.withAppendedId(r1, r6);	 Catch:{ all -> 0x00b9 }
        r2 = new android.content.Intent;	 Catch:{ all -> 0x00b9 }
        r3 = "com.google.android.apps.hangouts.sms.SendStatusReceiver.MMS_DOWNLOADED";
        r5 = com.google.android.apps.hangouts.sms.SendStatusReceiver.class;
        r2.<init>(r3, r1, r13, r5);	 Catch:{ all -> 0x00b9 }
        r12.a(r13, r14, r0, r2);	 Catch:{ all -> 0x00b9 }
        r0 = biw.class;
        r0 = jyn.a(r13, r0);	 Catch:{ all -> 0x00b9 }
        r0 = (biw) r0;	 Catch:{ all -> 0x00b9 }
        r1 = "babel_mms_network_acquire_timeout_in_millis";
        r2 = 180000; // 0x2bf20 float:2.52234E-40 double:8.8932E-319;
        r2 = r0.a(r1, r2);	 Catch:{ all -> 0x00b9 }
        r8 = glj.b();	 Catch:{ all -> 0x00b9 }
        r0 = r2;
    L_0x0091:
        r10 = 0;
        r5 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1));
        if (r5 <= 0) goto L_0x00bc;
    L_0x0097:
        r4.wait(r0);	 Catch:{ InterruptedException -> 0x00ad }
    L_0x009a:
        r0 = r4.b;	 Catch:{ all -> 0x00b9 }
        if (r0 != 0) goto L_0x00bc;
    L_0x009e:
        r0 = glj.b();	 Catch:{ all -> 0x00b9 }
        r0 = r0 - r8;
        r0 = r2 - r0;
        goto L_0x0091;
    L_0x00a6:
        r1 = new java.lang.String;
        r1.<init>(r0);
        goto L_0x0013;
    L_0x00ad:
        r0 = move-exception;
        r0 = "Babel_SMS";
        r1 = "MmsDownloader: sending wait interrupted";
        r5 = 0;
        r5 = new java.lang.Object[r5];	 Catch:{ all -> 0x00b9 }
        glk.e(r0, r1, r5);	 Catch:{ all -> 0x00b9 }
        goto L_0x009a;
    L_0x00b9:
        r0 = move-exception;
        monitor-exit(r4);	 Catch:{ all -> 0x00b9 }
        throw r0;
    L_0x00bc:
        r0 = e;	 Catch:{ all -> 0x00b9 }
        r1 = java.lang.Long.valueOf(r6);	 Catch:{ all -> 0x00b9 }
        r0.remove(r1);	 Catch:{ all -> 0x00b9 }
        r0 = a;	 Catch:{ all -> 0x00b9 }
        if (r0 == 0) goto L_0x00f8;
    L_0x00c9:
        r0 = java.lang.String.valueOf(r4);	 Catch:{ all -> 0x00b9 }
        r1 = new java.lang.StringBuilder;	 Catch:{ all -> 0x00b9 }
        r2 = java.lang.String.valueOf(r14);	 Catch:{ all -> 0x00b9 }
        r2 = r2.length();	 Catch:{ all -> 0x00b9 }
        r2 = r2 + 59;
        r3 = java.lang.String.valueOf(r0);	 Catch:{ all -> 0x00b9 }
        r3 = r3.length();	 Catch:{ all -> 0x00b9 }
        r2 = r2 + r3;
        r1.<init>(r2);	 Catch:{ all -> 0x00b9 }
        r2 = "MmsDownloader: download completed. contentLocation=";
        r1 = r1.append(r2);	 Catch:{ all -> 0x00b9 }
        r1 = r1.append(r14);	 Catch:{ all -> 0x00b9 }
        r2 = " result=";
        r1 = r1.append(r2);	 Catch:{ all -> 0x00b9 }
        r1.append(r0);	 Catch:{ all -> 0x00b9 }
    L_0x00f8:
        monitor-exit(r4);	 Catch:{ all -> 0x00b9 }
        return r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: fxw.a(android.content.Context, java.lang.String):fxx");
    }

    void a(Context context, String str, Uri uri, Intent intent) {
        Context context2 = context;
        String str2 = str;
        Uri uri2 = uri;
        this.d.downloadMultimediaMessage(context2, str2, uri2, fxt.b, PendingIntent.getBroadcast(context, 0, intent, 134217728));
    }

    ait a(Uri uri, String str, Context context) {
        byte[] a;
        File a2 = MmsFileProvider.a(uri, context);
        String absolutePath = a2.getAbsolutePath();
        try {
            a = gwb.a(gwb.a(new File(absolutePath), false));
        } catch (IOException e) {
            String str2 = "Babel_SMS";
            String str3 = "MmsDownloader: error reading bytes from file ";
            String valueOf = String.valueOf(absolutePath);
            glk.e(str2, valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3), new Object[0]);
            a = null;
        }
        if (a2.exists()) {
            a2.delete();
            if (a) {
                str2 = "MmsDownloader: Deleted temp file with downloaded MMS pdu: ";
                str3 = String.valueOf(absolutePath);
                if (str3.length() != 0) {
                    str2.concat(str3);
                } else {
                    str3 = new String(str2);
                }
            }
        }
        if (a == null || a.length <= 0) {
            absolutePath = "Babel_SMS";
            String valueOf2 = String.valueOf(a2.getPath());
            valueOf = String.valueOf(a == null ? "null" : Integer.valueOf(a.length));
            glk.d(absolutePath, new StringBuilder(((String.valueOf(str).length() + 91) + String.valueOf(valueOf2).length()) + String.valueOf(valueOf).length()).append("MmsDownloader: Read 0 bytes from MMS destination file. contentLocation=").append(str).append(" fileName=").append(valueOf2).append(" numBytes=").append(valueOf).toString(), new Object[0]);
            return null;
        }
        if (a) {
            new StringBuilder((String.valueOf(str).length() + 92) + String.valueOf(absolutePath).length()).append("MmsDownloader: retrieved MMS data from file. contentLocation=").append(str).append(" filePath=").append(absolutePath).append(" numBytes=").append(a.length);
        }
        return a(a, context);
    }

    private static ait a(byte[] bArr, Context context) {
        aid aid = null;
        try {
            aid = new ain(bArr).a();
        } catch (Throwable e) {
            glk.d("Babel_SMS", "MmsDownloader: Parsing retrieved PDU failure", e);
        }
        if (fyi.h() && aid != null) {
            fyi.a(bArr, aid, context);
        }
        return (ait) aid;
    }
}
