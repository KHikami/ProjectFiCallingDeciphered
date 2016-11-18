package p000;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public final class gzh {
    public static int f16427a = 5000000;
    public static int f16428b = 6500000;
    public static int f16429c = 7000000;
    static gzh f16430d;
    private static final AtomicInteger f16431i = new AtomicInteger(1);
    final Messenger f16432e = new Messenger(new gzi(this, Looper.getMainLooper()));
    private Context f16433f;
    private PendingIntent f16434g;
    private Map<String, Handler> f16435h = Collections.synchronizedMap(new HashMap());
    private final BlockingQueue<Intent> f16436j = new LinkedBlockingQueue();

    @Deprecated
    private Intent m19022a(Bundle bundle) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            throw new IOException("MAIN_THREAD");
        } else if (gzh.m19029c(this.f16433f) < 0) {
            throw new IOException("Google Play Services missing");
        } else {
            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage(hbr.m19157a(this.f16433f));
            m19025a(intent);
            String valueOf = String.valueOf("google.rpc");
            String valueOf2 = String.valueOf(String.valueOf(f16431i.getAndIncrement()));
            intent.putExtra("google.message_id", valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf));
            intent.putExtras(bundle);
            intent.putExtra("google.messenger", this.f16432e);
            this.f16433f.startService(intent);
            try {
                return (Intent) this.f16436j.poll(30000, TimeUnit.MILLISECONDS);
            } catch (InterruptedException e) {
                throw new IOException(e.getMessage());
            }
        }
    }

    public static synchronized gzh m19023a(Context context) {
        gzh gzh;
        synchronized (gzh.class) {
            if (f16430d == null) {
                gzh = new gzh();
                f16430d = gzh;
                gzh.f16433f = context.getApplicationContext();
            }
            gzh = f16430d;
        }
        return gzh;
    }

    private synchronized void m19025a(Intent intent) {
        if (this.f16434g == null) {
            Intent intent2 = new Intent();
            intent2.setPackage("com.google.example.invalidpackage");
            this.f16434g = PendingIntent.getBroadcast(this.f16433f, 0, intent2, 0);
        }
        intent.putExtra("app", this.f16434g);
    }

    public static String m19028b(Context context) {
        return hbr.m19157a(context);
    }

    public static int m19029c(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(hbr.m19157a(context), 0).versionCode;
        } catch (NameNotFoundException e) {
            return -1;
        }
    }

    @Deprecated
    public synchronized String m19030a(String... strArr) {
        String stringBuilder;
        if (strArr != null) {
            if (strArr.length != 0) {
                StringBuilder stringBuilder2 = new StringBuilder(strArr[0]);
                for (int i = 1; i < strArr.length; i++) {
                    stringBuilder2.append(',').append(strArr[i]);
                }
                stringBuilder = stringBuilder2.toString();
                Bundle bundle = new Bundle();
                if (hbr.m19157a(this.f16433f).contains(".gsf")) {
                    bundle.putString("legacy.sender", stringBuilder);
                    stringBuilder = hbo.m19149c(this.f16433f).m19150a(stringBuilder, "GCM", bundle);
                } else {
                    bundle.putString("sender", stringBuilder);
                    Intent a = m19022a(bundle);
                    stringBuilder = "registration_id";
                    if (a == null) {
                        throw new IOException("SERVICE_NOT_AVAILABLE");
                    }
                    stringBuilder = a.getStringExtra(stringBuilder);
                    if (stringBuilder == null) {
                        stringBuilder = a.getStringExtra("error");
                        if (stringBuilder != null) {
                            throw new IOException(stringBuilder);
                        }
                        throw new IOException("SERVICE_NOT_AVAILABLE");
                    }
                }
            }
        }
        throw new IllegalArgumentException("No senderIds");
        return stringBuilder;
    }

    public void m19031a(String str, String str2, long j, Bundle bundle) {
        if (str == null) {
            throw new IllegalArgumentException("Missing 'to'");
        }
        String substring;
        Intent intent = new Intent("com.google.android.gcm.intent.SEND");
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        m19025a(intent);
        intent.setPackage(hbr.m19157a(this.f16433f));
        intent.putExtra("google.to", str);
        intent.putExtra("google.message_id", str2);
        intent.putExtra("google.ttl", Long.toString(0));
        intent.putExtra("google.delay", Integer.toString(-1));
        String str3 = "google.from";
        int indexOf = str.indexOf(64);
        if (indexOf > 0) {
            substring = str.substring(0, indexOf);
        } else {
            substring = str;
        }
        hbo.m19149c(this.f16433f);
        intent.putExtra(str3, hbo.f16521c.m19181a("", substring, "GCM"));
        if (hbr.m19157a(this.f16433f).contains(".gsf")) {
            Bundle bundle2 = new Bundle();
            for (String substring2 : bundle.keySet()) {
                Object obj = bundle.get(substring2);
                if (obj instanceof String) {
                    String str4 = "gcm.";
                    substring2 = String.valueOf(substring2);
                    if (substring2.length() != 0) {
                        str4 = str4.concat(substring2);
                    } else {
                        str4 = new String(str4);
                    }
                    bundle2.putString(str4, (String) obj);
                }
            }
            bundle2.putString("google.to", str);
            bundle2.putString("google.message_id", str2);
            hbo.m19149c(this.f16433f).m19152b("GCM", "upstream", bundle2);
            return;
        }
        this.f16433f.sendOrderedBroadcast(intent, "com.google.android.gtalkservice.permission.GTALK_SERVICE");
    }

    static /* synthetic */ boolean m19026a(gzh gzh, Intent intent) {
        Object stringExtra = intent.getStringExtra("In-Reply-To");
        if (stringExtra == null && intent.hasExtra("error")) {
            stringExtra = intent.getStringExtra("google.message_id");
        }
        if (stringExtra != null) {
            Handler handler = (Handler) gzh.f16435h.remove(stringExtra);
            if (handler != null) {
                Message obtain = Message.obtain();
                obtain.obj = intent;
                return handler.sendMessage(obtain);
            }
        }
        return false;
    }
}
