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
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

public class fyd {
    private static final boolean f14354a = false;
    private static final AtomicLong f14355b = new AtomicLong(1);
    private static final Uri f14356c = Uri.parse("content://hangoutsmmssend");
    private final SmsManager f14357d;
    private ConcurrentHashMap<Long, fye> f14358e = new ConcurrentHashMap();

    static {
        kae kae = glk.f15571r;
    }

    public fyd(SmsManager smsManager) {
        this.f14357d = smsManager;
    }

    public void m16571a(long j, int i, int i2, byte[] bArr) {
        if (i != -1) {
            glk.m17982e("Babel_SMS", "MmsSender: failure in sending mms.  requestId=" + j + " resultCode=" + i + " httpStatusCode=" + i2, new Object[0]);
        } else if (f14354a) {
            new StringBuilder(109).append("MmsSender: received result.  requestId=").append(j).append(" resultCode=").append(i).append(" httpStatusCode=").append(i2);
        }
        if (j >= 0) {
            fye fye = (fye) this.f14358e.get(Long.valueOf(j));
            if (fye != null) {
                synchronized (fye) {
                    fye.m16575a(i, i2, bArr);
                    fye.notifyAll();
                }
            }
        }
    }

    public aiu m16568a(Context context, aiv aiv) {
        return m16567a(context, null, (aid) aiv, true);
    }

    public void m16573a(Context context, byte[] bArr, String str, int i) {
        if (!ajf.m2609a().mo2135s()) {
            str = null;
        }
        if (f14354a) {
            String str2 = "MmsSender: sending NotifyResp. locationUrl=";
            String valueOf = String.valueOf(str);
            if (valueOf.length() != 0) {
                str2.concat(valueOf);
            } else {
                valueOf = new String(str2);
            }
        }
        m16567a(context, str, new aid(18, bArr, 129), false);
    }

    private aiu m16567a(Context context, String str, aid aid, boolean z) {
        Uri a = m16570a(context, aid);
        fye fye = new fye(a, z);
        long andIncrement = f14355b.getAndIncrement();
        if (f14354a) {
            String valueOf = String.valueOf(a);
            new StringBuilder((String.valueOf(str).length() + 51) + String.valueOf(valueOf).length()).append("MmsSender: sending MMS. locationUrl=").append(str).append(" pduContentUri=").append(valueOf);
        }
        synchronized (fye) {
            this.f14358e.put(Long.valueOf(andIncrement), fye);
            String str2 = str;
            m16572a(context, a, str2, new Intent("com.google.android.apps.hangouts.sms.SendStatusReceiver.MMS_SENT", ContentUris.withAppendedId(f14356c, andIncrement), context, SendStatusReceiver.class));
            long a2 = ((biw) jyn.m25426a(context, biw.class)).mo561a("babel_mms_network_acquire_timeout_in_millis", 180000);
            long b = glj.m17963b();
            long j = a2;
            while (j > 0) {
                try {
                    fye.wait(j);
                } catch (InterruptedException e) {
                    glk.m17982e("Babel_SMS", "MmsSender: sending wait interrupted", new Object[0]);
                }
                if (!fye.f14361c) {
                    j = a2 - (glj.m17963b() - b);
                }
            }
            this.f14358e.remove(Long.valueOf(andIncrement));
            if (f14354a) {
                String str3 = "MmsSender: send completed. locationUrl=";
                valueOf = String.valueOf(str);
                if (valueOf.length() != 0) {
                    str3.concat(valueOf);
                } else {
                    valueOf = new String(str3);
                }
            }
        }
        if (fye.f14361c) {
            switch (fye.m16574a()) {
                case 1:
                    glk.m17981d("Babel_SMS", "MmsSender: temporary failure with status code " + fye.f14362d, new Object[0]);
                    throw new fyf("Temporary failure sending MMS");
                case 2:
                    glk.m17982e("Babel_SMS", "MmsSender: permanent failure with status code " + fye.f14362d, new Object[0]);
                    throw new fxy(119);
                default:
                    File a3 = MmsFileProvider.m9181a(fye.f14359a, context);
                    if (a3.exists()) {
                        a3.delete();
                        if (f14354a) {
                            valueOf = String.valueOf(fye.f14359a);
                            new StringBuilder(String.valueOf(valueOf).length() + 91).append("MmsSender: Deleted temp file with outgoing MMS [pduContentUri=").append(valueOf).append(", size=").append(a3.length()).append("].");
                        }
                    }
                    if (fye.f14360b) {
                        return m16569a(fye.f14363e);
                    }
                    return null;
            }
        }
        glk.m17981d("Babel_SMS", "MmsSender: timed out waiting for MMS send", new Object[0]);
        throw new fyf("Timeout waiting for MMS send");
    }

    void m16572a(Context context, Uri uri, String str, Intent intent) {
        Context context2 = context;
        Uri uri2 = uri;
        String str2 = str;
        this.f14357d.sendMultimediaMessage(context2, uri2, str2, fxt.f14328b, PendingIntent.getBroadcast(context, 0, intent, 134217728));
    }

    Uri m16570a(Context context, aid aid) {
        FileOutputStream fileOutputStream;
        Throwable e;
        String str;
        String str2;
        String valueOf;
        Uri a = MmsFileProvider.m9180a(context);
        File a2 = MmsFileProvider.m9181a(a, context);
        try {
            a2.getParentFile().mkdirs();
            fileOutputStream = new FileOutputStream(a2);
            try {
                byte[] a3 = new aih(context, aid).m2481a();
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
                glk.m17980d(str, valueOf.length() == 0 ? str2.concat(valueOf) : new String(str2), e);
                throw new fyf("Cannot create raw mms file");
            } catch (OutOfMemoryError e4) {
                e = e4;
                if (a2 != null) {
                    a2.delete();
                }
                glk.m17980d("Babel_SMS", "Out of memory in composing PDU", e);
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
            glk.m17980d(str, valueOf.length() == 0 ? str2.concat(valueOf) : new String(str2), e);
            throw new fyf("Cannot create raw mms file");
        } catch (OutOfMemoryError e6) {
            e = e6;
            Object obj = null;
            if (a2 != null) {
                a2.delete();
            }
            glk.m17980d("Babel_SMS", "Out of memory in composing PDU", e);
            throw new fxy(119, e);
        } catch (Throwable th) {
            e = th;
            if (fileOutputStream != null) {
                fileOutputStream.close();
            }
            throw e;
        }
    }

    aiu m16569a(byte[] bArr) {
        if (bArr != null) {
            aid a = new ain(bArr).m2518a();
            if (a == null) {
                glk.m17982e("Babel_SMS", "MmsSender: send invalid response", new Object[0]);
            } else if (a instanceof aiu) {
                return (aiu) a;
            } else {
                glk.m17982e("Babel_SMS", "MmsSender: send response not SendConf", new Object[0]);
            }
        }
        return null;
    }
}
