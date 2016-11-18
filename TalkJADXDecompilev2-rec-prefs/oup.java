package p000;

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
    final ovg f34318a;
    final Executor f34319b;
    final String f34320c;
    final Map<String, String> f34321d = new TreeMap(String.CASE_INSENSITIVE_ORDER);
    final List<String> f34322e = new ArrayList();
    final AtomicReference<ovw> f34323f = new AtomicReference(ovw.NOT_STARTED);
    final int f34324g;
    String f34325h;
    UploadDataProvider f34326i;
    Executor f34327j;
    volatile int f34328k = -1;
    String f34329l;
    ReadableByteChannel f34330m;
    UrlResponseInfo f34331n;
    String f34332o;
    final AtomicReference<HttpURLConnection> f34333p = new AtomicReference();
    private AtomicBoolean f34334q = new AtomicBoolean(false);

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
            this.f34318a = new ovg(this, callback, executor2);
            this.f34324g = TrafficStats.getThreadStatsTag();
            this.f34319b = new ouq(this, executor);
            this.f34329l = str;
            this.f34320c = str2;
        }
    }

    public void mo4229a(String str) {
        m39739f();
        if (str == null) {
            throw new NullPointerException("Method is required.");
        } else if (HttpMethods.OPTIONS.equalsIgnoreCase(str) || HttpMethods.GET.equalsIgnoreCase(str) || HttpMethods.HEAD.equalsIgnoreCase(str) || HttpMethods.POST.equalsIgnoreCase(str) || HttpMethods.PUT.equalsIgnoreCase(str) || HttpMethods.DELETE.equalsIgnoreCase(str) || HttpMethods.TRACE.equalsIgnoreCase(str) || HttpMethods.PATCH.equalsIgnoreCase(str)) {
            this.f34325h = str;
        } else {
            throw new IllegalArgumentException("Invalid http method " + str);
        }
    }

    private void m39739f() {
        ovw ovw = (ovw) this.f34323f.get();
        if (ovw != ovw.NOT_STARTED) {
            throw new IllegalStateException("Request is already started. State is: " + ovw);
        }
    }

    public void mo4230a(String str, String str2) {
        Object obj = null;
        m39739f();
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
            if (this.f34321d.containsKey(str)) {
                this.f34321d.remove(str);
            }
            this.f34321d.put(str, str2);
            return;
        }
        obj = 1;
        if (obj != null) {
        }
        throw new IllegalArgumentException("Invalid header " + str + "=" + str2);
    }

    public void mo4232a(UploadDataProvider uploadDataProvider, Executor executor) {
        if (uploadDataProvider == null) {
            throw new NullPointerException("Invalid UploadDataProvider.");
        } else if (this.f34321d.containsKey("Content-Type")) {
            m39739f();
            if (this.f34325h == null) {
                this.f34325h = HttpMethods.POST;
            }
            this.f34326i = uploadDataProvider;
            this.f34327j = executor;
        } else {
            throw new IllegalArgumentException("Requests with upload data must have a Content-Type.");
        }
    }

    public void mo4228a() {
        this.f34328k = 10;
        m39749a(ovw.NOT_STARTED, ovw.STARTED, new oux(this));
    }

    private void m39738a(ovw ovw, UrlRequestException urlRequestException) {
        if (this.f34323f.compareAndSet(ovw, ovw.ERROR)) {
            m39753d();
            m39752c();
            this.f34318a.m39765a(this.f34331n, urlRequestException);
        }
    }

    void m39748a(ovw ovw, Throwable th) {
        m39738a(ovw, new UrlRequestException("Exception received from UrlRequest.Callback", th));
    }

    void m39745a(Throwable th) {
        m39738a(ovw.STARTED, new UrlRequestException("Exception received from UploadDataProvider", th));
    }

    void m39751b(ovw ovw, Throwable th) {
        m39738a(ovw, new UrlRequestException("System error", th));
    }

    void m39749a(ovw ovw, ovw ovw2, Runnable runnable) {
        if (this.f34323f.compareAndSet(ovw, ovw2)) {
            runnable.run();
            return;
        }
        ovw ovw3 = (ovw) this.f34323f.get();
        if (ovw3 != ovw.CANCELLED && ovw3 != ovw.ERROR) {
            throw new IllegalStateException("Invalid state transition - expected " + ovw + " but was " + ovw3);
        }
    }

    public void mo4233b() {
        m39749a(ovw.AWAITING_FOLLOW_REDIRECT, ovw.STARTED, new ouy(this));
    }

    void m39752c() {
        if (this.f34326i != null && this.f34334q.compareAndSet(false, true)) {
            try {
                this.f34327j.execute(m39740a(new ova(this)));
            } catch (Throwable e) {
                Log.e("JavaUrlConnection", "Exception when closing uploadDataProvider", e);
            }
        }
    }

    Runnable m39741a(ovw ovw, ovn ovn) {
        return new ove(this, ovn, ovw);
    }

    Runnable m39740a(ovn ovn) {
        return new ous(this, ovn);
    }

    public void mo4231a(ByteBuffer byteBuffer) {
        Preconditions.m39356a(byteBuffer);
        Preconditions.m39357b(byteBuffer);
        m39749a(ovw.AWAITING_READ, ovw.READING, new out(this, byteBuffer));
    }

    void m39753d() {
        HttpURLConnection httpURLConnection = (HttpURLConnection) this.f34333p.getAndSet(null);
        if (httpURLConnection != null) {
            this.f34319b.execute(new ouv(this, httpURLConnection));
        }
    }

    public void mo4234e() {
        switch (ouw.f34346a[((ovw) this.f34323f.getAndSet(ovw.CANCELLED)).ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                m39753d();
                m39752c();
                this.f34318a.m39762a(this.f34331n);
                return;
            default:
                return;
        }
    }

    static void m39737a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
