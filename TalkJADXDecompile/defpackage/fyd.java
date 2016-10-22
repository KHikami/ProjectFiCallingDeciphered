package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.telephony.SmsManager;
import com.google.android.apps.hangouts.sms.MmsFileProvider;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: fyd */
public class fyd {
    private static final boolean a;
    private static final AtomicLong b;
    private static final Uri c;
    private final SmsManager d;
    private ConcurrentHashMap<Long, fye> e;

    static {
        kae kae = glk.r;
        a = false;
        b = new AtomicLong(1);
        c = Uri.parse("content://hangoutsmmssend");
    }

    public fyd(SmsManager smsManager) {
        this.e = new ConcurrentHashMap();
        this.d = smsManager;
    }

    public void a(long j, int i, int i2, byte[] bArr) {
        if (i != -1) {
            glk.e("Babel_SMS", "MmsSender: failure in sending mms.  requestId=" + j + " resultCode=" + i + " httpStatusCode=" + i2, new Object[0]);
        } else if (a) {
            new StringBuilder(109).append("MmsSender: received result.  requestId=").append(j).append(" resultCode=").append(i).append(" httpStatusCode=").append(i2);
        }
        if (j >= 0) {
            fye fye = (fye) this.e.get(Long.valueOf(j));
            if (fye != null) {
                synchronized (fye) {
                    fye.a(i, i2, bArr);
                    fye.notifyAll();
                }
            }
        }
    }

    public aiu a(Context context, aiv aiv) {
        return a(context, null, (aid) aiv, true);
    }

    public void a(Context context, byte[] bArr, String str, int i) {
        if (!ajf.a().s()) {
            str = null;
        }
        if (a) {
            String str2 = "MmsSender: sending NotifyResp. locationUrl=";
            String valueOf = String.valueOf(str);
            if (valueOf.length() != 0) {
                str2.concat(valueOf);
            } else {
                valueOf = new String(str2);
            }
        }
        a(context, str, new aid(18, bArr, 129), false);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private defpackage.aiu a(android.content.Context r15, java.lang.String r16, defpackage.aid r17, boolean r18) {
        /*
        r14 = this;
        r0 = r17;
        r2 = r14.a(r15, r0);
        r6 = new fye;
        r0 = r18;
        r6.<init>(r2, r0);
        r3 = b;
        r8 = r3.getAndIncrement();
        r3 = a;
        if (r3 == 0) goto L_0x0048;
    L_0x0017:
        r3 = java.lang.String.valueOf(r2);
        r4 = new java.lang.StringBuilder;
        r5 = java.lang.String.valueOf(r16);
        r5 = r5.length();
        r5 = r5 + 51;
        r7 = java.lang.String.valueOf(r3);
        r7 = r7.length();
        r5 = r5 + r7;
        r4.<init>(r5);
        r5 = "MmsSender: sending MMS. locationUrl=";
        r4 = r4.append(r5);
        r0 = r16;
        r4 = r4.append(r0);
        r5 = " pduContentUri=";
        r4 = r4.append(r5);
        r4.append(r3);
    L_0x0048:
        monitor-enter(r6);
        r3 = r14.e;	 Catch:{ all -> 0x009d }
        r4 = java.lang.Long.valueOf(r8);	 Catch:{ all -> 0x009d }
        r3.put(r4, r6);	 Catch:{ all -> 0x009d }
        r3 = c;	 Catch:{ all -> 0x009d }
        r3 = android.content.ContentUris.withAppendedId(r3, r8);	 Catch:{ all -> 0x009d }
        r4 = new android.content.Intent;	 Catch:{ all -> 0x009d }
        r5 = "com.google.android.apps.hangouts.sms.SendStatusReceiver.MMS_SENT";
        r7 = com.google.android.apps.hangouts.sms.SendStatusReceiver.class;
        r4.<init>(r5, r3, r15, r7);	 Catch:{ all -> 0x009d }
        r0 = r16;
        r14.a(r15, r2, r0, r4);	 Catch:{ all -> 0x009d }
        r2 = defpackage.biw.class;
        r2 = defpackage.jyn.a(r15, r2);	 Catch:{ all -> 0x009d }
        r2 = (defpackage.biw) r2;	 Catch:{ all -> 0x009d }
        r3 = "babel_mms_network_acquire_timeout_in_millis";
        r4 = 180000; // 0x2bf20 float:2.52234E-40 double:8.8932E-319;
        r4 = r2.a(r3, r4);	 Catch:{ all -> 0x009d }
        r10 = defpackage.glj.b();	 Catch:{ all -> 0x009d }
        r2 = r4;
    L_0x007c:
        r12 = 0;
        r7 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1));
        if (r7 <= 0) goto L_0x00a0;
    L_0x0082:
        r6.wait(r2);	 Catch:{ InterruptedException -> 0x0091 }
    L_0x0085:
        r2 = r6.c;	 Catch:{ all -> 0x009d }
        if (r2 != 0) goto L_0x00a0;
    L_0x0089:
        r2 = defpackage.glj.b();	 Catch:{ all -> 0x009d }
        r2 = r2 - r10;
        r2 = r4 - r2;
        goto L_0x007c;
    L_0x0091:
        r2 = move-exception;
        r2 = "Babel_SMS";
        r3 = "MmsSender: sending wait interrupted";
        r7 = 0;
        r7 = new java.lang.Object[r7];	 Catch:{ all -> 0x009d }
        defpackage.glk.e(r2, r3, r7);	 Catch:{ all -> 0x009d }
        goto L_0x0085;
    L_0x009d:
        r2 = move-exception;
        monitor-exit(r6);	 Catch:{ all -> 0x009d }
        throw r2;
    L_0x00a0:
        r2 = r14.e;	 Catch:{ all -> 0x009d }
        r3 = java.lang.Long.valueOf(r8);	 Catch:{ all -> 0x009d }
        r2.remove(r3);	 Catch:{ all -> 0x009d }
        r2 = a;	 Catch:{ all -> 0x009d }
        if (r2 == 0) goto L_0x00bc;
    L_0x00ad:
        r2 = "MmsSender: send completed. locationUrl=";
        r3 = java.lang.String.valueOf(r16);	 Catch:{ all -> 0x009d }
        r4 = r3.length();	 Catch:{ all -> 0x009d }
        if (r4 == 0) goto L_0x00d3;
    L_0x00b9:
        r2.concat(r3);	 Catch:{ all -> 0x009d }
    L_0x00bc:
        monitor-exit(r6);	 Catch:{ all -> 0x009d }
        r2 = r6.c;
        if (r2 != 0) goto L_0x00d9;
    L_0x00c1:
        r2 = "Babel_SMS";
        r3 = "MmsSender: timed out waiting for MMS send";
        r4 = 0;
        r4 = new java.lang.Object[r4];
        defpackage.glk.d(r2, r3, r4);
        r2 = new fyf;
        r3 = "Timeout waiting for MMS send";
        r2.<init>(r3);
        throw r2;
    L_0x00d3:
        r3 = new java.lang.String;	 Catch:{ all -> 0x009d }
        r3.<init>(r2);	 Catch:{ all -> 0x009d }
        goto L_0x00bc;
    L_0x00d9:
        r2 = r6.a();
        switch(r2) {
            case 0: goto L_0x00e0;
            case 1: goto L_0x0130;
            case 2: goto L_0x0157;
            default: goto L_0x00e0;
        };
    L_0x00e0:
        r2 = r6.a;
        r2 = com.google.android.apps.hangouts.sms.MmsFileProvider.a(r2, r15);
        r3 = r2.exists();
        if (r3 == 0) goto L_0x0125;
    L_0x00ec:
        r2.delete();
        r3 = a;
        if (r3 == 0) goto L_0x0125;
    L_0x00f3:
        r3 = r6.a;
        r3 = java.lang.String.valueOf(r3);
        r4 = r2.length();
        r2 = new java.lang.StringBuilder;
        r7 = java.lang.String.valueOf(r3);
        r7 = r7.length();
        r7 = r7 + 91;
        r2.<init>(r7);
        r7 = "MmsSender: Deleted temp file with outgoing MMS [pduContentUri=";
        r2 = r2.append(r7);
        r2 = r2.append(r3);
        r3 = ", size=";
        r2 = r2.append(r3);
        r2 = r2.append(r4);
        r3 = "].";
        r2.append(r3);
    L_0x0125:
        r2 = r6.b;
        if (r2 == 0) goto L_0x017e;
    L_0x0129:
        r2 = r6.e;
        r2 = r14.a(r2);
    L_0x012f:
        return r2;
    L_0x0130:
        r2 = "Babel_SMS";
        r3 = r6.d;
        r4 = new java.lang.StringBuilder;
        r5 = 57;
        r4.<init>(r5);
        r5 = "MmsSender: temporary failure with status code ";
        r4 = r4.append(r5);
        r3 = r4.append(r3);
        r3 = r3.toString();
        r4 = 0;
        r4 = new java.lang.Object[r4];
        defpackage.glk.d(r2, r3, r4);
        r2 = new fyf;
        r3 = "Temporary failure sending MMS";
        r2.<init>(r3);
        throw r2;
    L_0x0157:
        r2 = "Babel_SMS";
        r3 = r6.d;
        r4 = new java.lang.StringBuilder;
        r5 = 57;
        r4.<init>(r5);
        r5 = "MmsSender: permanent failure with status code ";
        r4 = r4.append(r5);
        r3 = r4.append(r3);
        r3 = r3.toString();
        r4 = 0;
        r4 = new java.lang.Object[r4];
        defpackage.glk.e(r2, r3, r4);
        r2 = new fxy;
        r3 = 119; // 0x77 float:1.67E-43 double:5.9E-322;
        r2.<init>(r3);
        throw r2;
    L_0x017e:
        r2 = 0;
        goto L_0x012f;
        */
        throw new UnsupportedOperationException("Method not decompiled: fyd.a(android.content.Context, java.lang.String, aid, boolean):aiu");
    }

    void a(Context context, Uri uri, String str, Intent intent) {
        Context context2 = context;
        Uri uri2 = uri;
        String str2 = str;
        this.d.sendMultimediaMessage(context2, uri2, str2, fxt.b, PendingIntent.getBroadcast(context, 0, intent, 134217728));
    }

    Uri a(Context context, aid aid) {
        Throwable e;
        String str;
        String str2;
        String valueOf;
        Uri a = MmsFileProvider.a(context);
        File a2 = MmsFileProvider.a(a, context);
        FileOutputStream fileOutputStream;
        try {
            a2.getParentFile().mkdirs();
            fileOutputStream = new FileOutputStream(a2);
            try {
                byte[] a3 = new aih(context, aid).a();
                if (a3 == null) {
                    throw new IllegalArgumentException("Empty or zero length PDU data");
                }
                fileOutputStream.write(a3);
                try {
                    fileOutputStream.close();
                } catch (IOException e2) {
                }
                return a;
            } catch (IOException e3) {
                e = e3;
                if (a2 != null) {
                    a2.delete();
                }
                str = "Babel_SMS";
                str2 = "Cannot create temporary file ";
                valueOf = String.valueOf(a2.getAbsolutePath());
                glk.d(str, valueOf.length() == 0 ? str2.concat(valueOf) : new String(str2), e);
                throw new fyf("Cannot create raw mms file");
            } catch (OutOfMemoryError e4) {
                e = e4;
                if (a2 != null) {
                    a2.delete();
                }
                glk.d("Babel_SMS", "Out of memory in composing PDU", e);
                throw new fxy(119, e);
            }
        } catch (IOException e5) {
            e = e5;
            fileOutputStream = null;
            if (a2 != null) {
                a2.delete();
            }
            str = "Babel_SMS";
            str2 = "Cannot create temporary file ";
            valueOf = String.valueOf(a2.getAbsolutePath());
            if (valueOf.length() == 0) {
            }
            glk.d(str, valueOf.length() == 0 ? str2.concat(valueOf) : new String(str2), e);
            throw new fyf("Cannot create raw mms file");
        } catch (OutOfMemoryError e6) {
            e = e6;
            Object obj = null;
            if (a2 != null) {
                a2.delete();
            }
            glk.d("Babel_SMS", "Out of memory in composing PDU", e);
            throw new fxy(119, e);
        } catch (Throwable th) {
            e = th;
            if (fileOutputStream != null) {
                fileOutputStream.close();
            }
            throw e;
        }
    }

    aiu a(byte[] bArr) {
        if (bArr != null) {
            aid a = new ain(bArr).a();
            if (a == null) {
                glk.e("Babel_SMS", "MmsSender: send invalid response", new Object[0]);
            } else if (a instanceof aiu) {
                return (aiu) a;
            } else {
                glk.e("Babel_SMS", "MmsSender: send response not SendConf", new Object[0]);
            }
        }
        return null;
    }
}
