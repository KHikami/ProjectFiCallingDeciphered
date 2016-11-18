package defpackage;

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
    public static int a = 5000000;
    public static int b = 6500000;
    public static int c = 7000000;
    static gzh d;
    private static final AtomicInteger i = new AtomicInteger(1);
    final Messenger e = new Messenger(new gzi(this, Looper.getMainLooper()));
    private Context f;
    private PendingIntent g;
    private Map<String, Handler> h = Collections.synchronizedMap(new HashMap());
    private final BlockingQueue<Intent> j = new LinkedBlockingQueue();

    @Deprecated
    private Intent a(Bundle bundle) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            throw new IOException("MAIN_THREAD");
        } else if (gzh.c(this.f) < 0) {
            throw new IOException("Google Play Services missing");
        } else {
            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage(hbr.a(this.f));
            a(intent);
            String valueOf = String.valueOf("google.rpc");
            String valueOf2 = String.valueOf(String.valueOf(i.getAndIncrement()));
            intent.putExtra("google.message_id", valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf));
            intent.putExtras(bundle);
            intent.putExtra("google.messenger", this.e);
            this.f.startService(intent);
            try {
                return (Intent) this.j.poll(30000, TimeUnit.MILLISECONDS);
            } catch (InterruptedException e) {
                throw new IOException(e.getMessage());
            }
        }
    }

    public static synchronized gzh a(Context context) {
        gzh gzh;
        synchronized (gzh.class) {
            if (d == null) {
                gzh = new gzh();
                d = gzh;
                gzh.f = context.getApplicationContext();
            }
            gzh = d;
        }
        return gzh;
    }

    private synchronized void a(Intent intent) {
        if (this.g == null) {
            Intent intent2 = new Intent();
            intent2.setPackage("com.google.example.invalidpackage");
            this.g = PendingIntent.getBroadcast(this.f, 0, intent2, 0);
        }
        intent.putExtra("app", this.g);
    }

    public static String b(Context context) {
        return hbr.a(context);
    }

    public static int c(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(hbr.a(context), 0).versionCode;
        } catch (NameNotFoundException e) {
            return -1;
        }
    }

    @Deprecated
    public synchronized String a(String... strArr) {
        String stringBuilder;
        if (strArr != null) {
            if (strArr.length != 0) {
                StringBuilder stringBuilder2 = new StringBuilder(strArr[0]);
                for (int i = 1; i < strArr.length; i++) {
                    stringBuilder2.append(',').append(strArr[i]);
                }
                stringBuilder = stringBuilder2.toString();
                Bundle bundle = new Bundle();
                if (hbr.a(this.f).contains(".gsf")) {
                    bundle.putString("legacy.sender", stringBuilder);
                    stringBuilder = hbo.c(this.f).a(stringBuilder, "GCM", bundle);
                } else {
                    bundle.putString("sender", stringBuilder);
                    Intent a = a(bundle);
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

    public void a(String str, String str2, long j, Bundle bundle) {
        if (str == null) {
            throw new IllegalArgumentException("Missing 'to'");
        }
        String substring;
        Intent intent = new Intent("com.google.android.gcm.intent.SEND");
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        a(intent);
        intent.setPackage(hbr.a(this.f));
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
        hbo.c(this.f);
        intent.putExtra(str3, hbo.c.a("", substring, "GCM"));
        if (hbr.a(this.f).contains(".gsf")) {
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
            hbo.c(this.f).b("GCM", "upstream", bundle2);
            return;
        }
        this.f.sendOrderedBroadcast(intent, "com.google.android.gtalkservice.permission.GTALK_SERVICE");
    }

    static /* synthetic */ boolean a(gzh gzh, Intent intent) {
        Object stringExtra = intent.getStringExtra("In-Reply-To");
        if (stringExtra == null && intent.hasExtra("error")) {
            stringExtra = intent.getStringExtra("google.message_id");
        }
        if (stringExtra != null) {
            Handler handler = (Handler) gzh.h.remove(stringExtra);
            if (handler != null) {
                Message obtain = Message.obtain();
                obtain.obj = intent;
                return handler.sendMessage(obtain);
            }
        }
        return false;
    }
}
