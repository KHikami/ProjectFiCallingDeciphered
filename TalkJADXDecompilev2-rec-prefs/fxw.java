package p000;

import android.app.PendingIntent;
import android.content.ContentUris;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.telephony.SmsManager;
import com.google.android.apps.hangouts.sms.MmsFileProvider;
import com.google.android.apps.hangouts.sms.SendStatusReceiver;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

public class fxw {
    private static final boolean f14335a = false;
    private static final AtomicLong f14336b = new AtomicLong(1);
    private static final Uri f14337c = Uri.parse("content://hangoutsmmsdownload");
    private static ConcurrentHashMap<Long, fxx> f14338e = new ConcurrentHashMap();
    private final SmsManager f14339d;

    static {
        kae kae = glk.f15571r;
    }

    public fxw(SmsManager smsManager) {
        this.f14339d = smsManager;
    }

    public void m16547a(long j, int i, int i2) {
        if (i != -1) {
            glk.m17982e("Babel_SMS", "MmsDownloader: failure in downloading mms.  requestId=" + j + " resultCode=" + i + " httpStatusCode=" + i2, new Object[0]);
        } else if (f14335a) {
            new StringBuilder(113).append("MmsDownloader: received result.  requestId=").append(j).append(" resultCode=").append(i).append(" httpStatusCode=").append(i2);
        }
        if (j >= 0) {
            fxx fxx = (fxx) f14338e.get(Long.valueOf(j));
            if (fxx != null) {
                synchronized (fxx) {
                    fxx.m16550a(i, i2);
                    fxx.notifyAll();
                }
            }
        }
    }

    public ait m16545a(Context context, byte[] bArr, String str) {
        String valueOf;
        if (f14335a) {
            String str2 = "MmsDownloader.retrieveMmsPdu: ";
            valueOf = String.valueOf(str);
            if (valueOf.length() != 0) {
                str2.concat(valueOf);
            } else {
                valueOf = new String(str2);
            }
        }
        gwb.aK();
        fxx a = m16544a(context, str);
        if (f14335a) {
            valueOf = String.valueOf(a);
            new StringBuilder(String.valueOf(valueOf).length() + 35).append("MmsDownloader: downloadMms result: ").append(valueOf);
        }
        if (a.f14341b) {
            switch (a.m16549a()) {
                case 1:
                    glk.m17981d("Babel_SMS", "MmsDownloader: temporary failure with status code " + a.f14342c, new Object[0]);
                    throw new fyf("Temporary failure downloading MMS");
                case 2:
                    glk.m17982e("Babel_SMS", "MmsDownloader: permanent failure with status code " + a.f14342c, new Object[0]);
                    throw new fxy(119);
                default:
                    ait a2 = m16546a(a.f14340a, str, context);
                    if (a2 == null) {
                        glk.m17982e("Babel_SMS", "MmsDownloader: empty bytes received", new Object[0]);
                        throw new fxy(137, "MmsDownloader got empty or invalid response");
                    }
                    ((fyd) jyn.m25426a(context, fyd.class)).m16573a(context, bArr, str, 129);
                    return a2;
            }
        }
        glk.m17981d("Babel_SMS", "MmsDownloader: timed out waiting for MMS download", new Object[0]);
        throw new fyf("Timeout waiting for MMS download");
    }

    private fxx m16544a(Context context, String str) {
        String str2;
        String valueOf;
        if (f14335a) {
            str2 = "MmsDownloader.downloadMessage: ";
            valueOf = String.valueOf(str);
            if (valueOf.length() != 0) {
                str2.concat(valueOf);
            } else {
                valueOf = new String(str2);
            }
        }
        Uri a = MmsFileProvider.m9180a(context);
        fxx fxx = new fxx(a);
        long andIncrement = f14336b.getAndIncrement();
        if (f14335a) {
            valueOf = String.valueOf(a);
            new StringBuilder((String.valueOf(str).length() + 95) + String.valueOf(valueOf).length()).append("MmsDownloader: downloading MMS. contentLocation=").append(str).append(" destinationUri=").append(valueOf).append(" requestId=").append(andIncrement);
        }
        synchronized (fxx) {
            f14338e.put(Long.valueOf(andIncrement), fxx);
            m16548a(context, str, a, new Intent("com.google.android.apps.hangouts.sms.SendStatusReceiver.MMS_DOWNLOADED", ContentUris.withAppendedId(f14337c, andIncrement), context, SendStatusReceiver.class));
            long a2 = ((biw) jyn.m25426a(context, biw.class)).mo561a("babel_mms_network_acquire_timeout_in_millis", 180000);
            long b = glj.m17963b();
            long j = a2;
            while (j > 0) {
                try {
                    fxx.wait(j);
                } catch (InterruptedException e) {
                    glk.m17982e("Babel_SMS", "MmsDownloader: sending wait interrupted", new Object[0]);
                }
                if (!fxx.f14341b) {
                    j = a2 - (glj.m17963b() - b);
                }
            }
            f14338e.remove(Long.valueOf(andIncrement));
            if (f14335a) {
                str2 = String.valueOf(fxx);
                new StringBuilder((String.valueOf(str).length() + 59) + String.valueOf(str2).length()).append("MmsDownloader: download completed. contentLocation=").append(str).append(" result=").append(str2);
            }
        }
        return fxx;
    }

    void m16548a(Context context, String str, Uri uri, Intent intent) {
        Context context2 = context;
        String str2 = str;
        Uri uri2 = uri;
        this.f14339d.downloadMultimediaMessage(context2, str2, uri2, fxt.f14328b, PendingIntent.getBroadcast(context, 0, intent, 134217728));
    }

    ait m16546a(Uri uri, String str, Context context) {
        byte[] a;
        File a2 = MmsFileProvider.m9181a(uri, context);
        String absolutePath = a2.getAbsolutePath();
        try {
            a = gwb.m1950a(gwb.m1683a(new File(absolutePath), false));
        } catch (IOException e) {
            String str2 = "Babel_SMS";
            String str3 = "MmsDownloader: error reading bytes from file ";
            String valueOf = String.valueOf(absolutePath);
            glk.m17982e(str2, valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3), new Object[0]);
            a = null;
        }
        if (a2.exists()) {
            a2.delete();
            if (f14335a) {
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
            glk.m17981d(absolutePath, new StringBuilder(((String.valueOf(str).length() + 91) + String.valueOf(valueOf2).length()) + String.valueOf(valueOf).length()).append("MmsDownloader: Read 0 bytes from MMS destination file. contentLocation=").append(str).append(" fileName=").append(valueOf2).append(" numBytes=").append(valueOf).toString(), new Object[0]);
            return null;
        }
        if (f14335a) {
            new StringBuilder((String.valueOf(str).length() + 92) + String.valueOf(absolutePath).length()).append("MmsDownloader: retrieved MMS data from file. contentLocation=").append(str).append(" filePath=").append(absolutePath).append(" numBytes=").append(a.length);
        }
        return fxw.m16543a(a, context);
    }

    private static ait m16543a(byte[] bArr, Context context) {
        aid aid = null;
        try {
            aid = new ain(bArr).m2518a();
        } catch (Throwable e) {
            glk.m17980d("Babel_SMS", "MmsDownloader: Parsing retrieved PDU failure", e);
        }
        if (fyi.m16636h() && aid != null) {
            fyi.m16611a(bArr, aid, context);
        }
        return (ait) aid;
    }
}
