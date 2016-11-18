package defpackage;

import android.net.TrafficStats;
import android.util.Log;
import com.google.api.client.http.HttpMethods;
import java.io.Closeable;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.chromium.net.Preconditions;
import org.chromium.net.UploadDataProvider;
import org.chromium.net.UrlRequest;
import org.chromium.net.UrlRequest.Callback;
import org.chromium.net.UrlRequestException;
import org.chromium.net.UrlResponseInfo;

final class oup implements UrlRequest {
    final ovg a;
    final Executor b;
    final String c;
    final Map<String, String> d = new TreeMap(String.CASE_INSENSITIVE_ORDER);
    final List<String> e = new ArrayList();
    final AtomicReference<ovw> f = new AtomicReference(ovw.NOT_STARTED);
    final int g;
    String h;
    UploadDataProvider i;
    Executor j;
    volatile int k = -1;
    String l;
    ReadableByteChannel m;
    UrlResponseInfo n;
    String o;
    final AtomicReference<HttpURLConnection> p = new AtomicReference();
    private AtomicBoolean q = new AtomicBoolean(false);

    oup(Callback callback, Executor executor, Executor executor2, String str, String str2) {
        if (str == null) {
            throw new NullPointerException("URL is required");
        } else if (callback == null) {
            throw new NullPointerException("Listener is required");
        } else if (executor == null) {
            throw new NullPointerException("Executor is required");
        } else if (executor2 == null) {
            throw new NullPointerException("userExecutor is required");
        } else {
            this.a = new ovg(this, callback, executor2);
            this.g = TrafficStats.getThreadStatsTag();
            this.b = new ouq(this, executor);
            this.l = str;
            this.c = str2;
        }
    }

    public void a(String str) {
        f();
        if (str == null) {
            throw new NullPointerException("Method is required.");
        } else if (HttpMethods.OPTIONS.equalsIgnoreCase(str) || HttpMethods.GET.equalsIgnoreCase(str) || HttpMethods.HEAD.equalsIgnoreCase(str) || HttpMethods.POST.equalsIgnoreCase(str) || HttpMethods.PUT.equalsIgnoreCase(str) || HttpMethods.DELETE.equalsIgnoreCase(str) || HttpMethods.TRACE.equalsIgnoreCase(str) || HttpMethods.PATCH.equalsIgnoreCase(str)) {
            this.h = str;
        } else {
            throw new IllegalArgumentException("Invalid http method " + str);
        }
    }

    private void f() {
        ovw ovw = (ovw) this.f.get();
        if (ovw != ovw.NOT_STARTED) {
            throw new IllegalStateException("Request is already started. State is: " + ovw);
        }
    }

    public void a(String str, String str2) {
        Object obj = null;
        f();
        int i = 0;
        while (i < str.length()) {
            char charAt = str.charAt(i);
            switch (charAt) {
                case '\'':
                case '(':
                case ')':
                case ',':
                case '/':
                case ':':
                case ';':
                case '<':
                case '=':
                case '>':
                case '?':
                case '@':
                case '[':
                case '\\':
                case ']':
                case '{':
                case '}':
                    break;
                default:
                    if (!(Character.isISOControl(charAt) || Character.isWhitespace(charAt))) {
                        i++;
                    }
            }
            if (obj != null || str2.contains("\r\n")) {
                throw new IllegalArgumentException("Invalid header " + str + "=" + str2);
            }
            if (this.d.containsKey(str)) {
                this.d.remove(str);
            }
            this.d.put(str, str2);
            return;
        }
        obj = 1;
        if (obj != null) {
        }
        throw new IllegalArgumentException("Invalid header " + str + "=" + str2);
    }

    public void a(UploadDataProvider uploadDataProvider, Executor executor) {
        if (uploadDataProvider == null) {
            throw new NullPointerException("Invalid UploadDataProvider.");
        } else if (this.d.containsKey("Content-Type")) {
            f();
            if (this.h == null) {
                this.h = HttpMethods.POST;
            }
            this.i = uploadDataProvider;
            this.j = executor;
        } else {
            throw new IllegalArgumentException("Requests with upload data must have a Content-Type.");
        }
    }

    public void a() {
        this.k = 10;
        a(ovw.NOT_STARTED, ovw.STARTED, new oux(this));
    }

    private void a(ovw ovw, UrlRequestException urlRequestException) {
        if (this.f.compareAndSet(ovw, ovw.ERROR)) {
            d();
            c();
            this.a.a(this.n, urlRequestException);
        }
    }

    void a(ovw ovw, Throwable th) {
        a(ovw, new UrlRequestException("Exception received from UrlRequest.Callback", th));
    }

    void a(Throwable th) {
        a(ovw.STARTED, new UrlRequestException("Exception received from UploadDataProvider", th));
    }

    void b(ovw ovw, Throwable th) {
        a(ovw, new UrlRequestException("System error", th));
    }

    void a(ovw ovw, ovw ovw2, Runnable runnable) {
        if (this.f.compareAndSet(ovw, ovw2)) {
            runnable.run();
            return;
        }
        ovw ovw3 = (ovw) this.f.get();
        if (ovw3 != ovw.CANCELLED && ovw3 != ovw.ERROR) {
            throw new IllegalStateException("Invalid state transition - expected " + ovw + " but was " + ovw3);
        }
    }

    public void b() {
        a(ovw.AWAITING_FOLLOW_REDIRECT, ovw.STARTED, new ouy(this));
    }

    void c() {
        if (this.i != null && this.q.compareAndSet(false, true)) {
            try {
                this.j.execute(a(new ova(this)));
            } catch (Throwable e) {
                Log.e("JavaUrlConnection", "Exception when closing uploadDataProvider", e);
            }
        }
    }

    Runnable a(ovw ovw, ovn ovn) {
        return new ove(this, ovn, ovw);
    }

    Runnable a(ovn ovn) {
        return new ous(this, ovn);
    }

    public void a(ByteBuffer byteBuffer) {
        Preconditions.a(byteBuffer);
        Preconditions.b(byteBuffer);
        a(ovw.AWAITING_READ, ovw.READING, new out(this, byteBuffer));
    }

    void d() {
        HttpURLConnection httpURLConnection = (HttpURLConnection) this.p.getAndSet(null);
        if (httpURLConnection != null) {
            this.b.execute(new ouv(this, httpURLConnection));
        }
    }

    public void e() {
        switch (ouw.a[((ovw) this.f.getAndSet(ovw.CANCELLED)).ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                d();
                c();
                this.a.a(this.n);
                return;
            default:
                return;
        }
    }

    static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
