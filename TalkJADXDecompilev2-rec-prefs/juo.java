package p000;

import android.content.Context;
import android.util.Log;
import com.google.api.client.http.HttpStatusCodes;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.SocketException;
import java.net.URL;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.atomic.AtomicInteger;
import javax.net.ssl.SSLException;
import org.chromium.net.CronetEngine;
import org.chromium.net.UrlRequest;
import org.chromium.net.UrlRequest.Builder;
import org.chromium.net.UrlRequest.Callback;

public class juo {
    private static final kad f5752a = new kad("debug.rpc.metrics");
    private static final AtomicInteger f5753b = new AtomicInteger(1);
    private static final kad f5754c = new kad("debug.rpc.use_obscura_nonce", false);
    private static volatile String f5755d = null;
    public static final kad f5756f = new kad("debug.rpc.dogfood");
    private jvs f5757A;
    private CronetEngine f5758B;
    private final String f5759e;
    public final Context f5760g;
    public final jvc f5761h;
    public final int f5762i;
    juv f5763j;
    public int f5764k;
    public String f5765l;
    public Exception f5766m;
    int f5767n;
    boolean f5768o;
    public final juz f5769p;
    String f5770q;
    boolean f5771r;
    private final String f5772s;
    private final juy f5773t;
    private final List<jun> f5774u;
    private final String f5775v;
    private String f5776w;
    private UrlRequest f5777x;
    private WritableByteChannel f5778y;
    private int f5779z;

    public juo(Context context, jvc jvc, String str, juy juy) {
        this(context, jvc, str, juy, null, null);
    }

    private juo(Context context, jvc jvc, String str, juy juy, String str2, String str3) {
        this.f5762i = f5753b.getAndIncrement();
        this.f5764k = -1;
        this.f5767n = 3;
        this.f5771r = false;
        this.f5760g = context;
        this.f5761h = jvc;
        this.f5772s = str;
        this.f5773t = juy;
        this.f5759e = null;
        this.f5775v = null;
        this.f5774u = jyn.m25438c(this.f5760g, jun.class);
        this.f5757A = (jvs) jyn.m25433b(this.f5760g, jvs.class);
        this.f5769p = new juz();
    }

    public final void m8069g() {
        ((jum) jyn.m25426a(this.f5760g, jum.class)).mo3608a(this);
    }

    public void m8070h() {
        synchronized (this) {
            this.f5768o = true;
            UrlRequest urlRequest = this.f5777x;
            if (urlRequest != null) {
                urlRequest.e();
            }
        }
    }

    public void mo1040a() {
    }

    public void mo1033a(ByteBuffer byteBuffer) {
        m8065b(byteBuffer, null);
    }

    public void mo1034a(ByteBuffer byteBuffer, String str) {
        m8065b(byteBuffer, null);
    }

    public void mo1046a(int i, String str, Exception exception) {
    }

    public boolean m8071i() {
        return this.f5768o;
    }

    public String mo1036j() {
        return getClass().getSimpleName();
    }

    public String mo1037k() {
        return this.f5759e;
    }

    private String mo1043d() {
        try {
            return new URL(mo1037k()).getHost();
        } catch (MalformedURLException e) {
            return null;
        }
    }

    public String[] m8074l() {
        return new String[]{mo1036j()};
    }

    public byte[] mo1038c() {
        return null;
    }

    public String mo1039m() {
        return null;
    }

    public String mo1035b() {
        return this.f5775v;
    }

    public boolean m8076n() {
        return (this.f5764k == HttpStatusCodes.STATUS_CODE_OK && this.f5766m == null) ? false : true;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    void m8077o() {
        Callback juq;
        mo1040a();
        this.f5769p.m25286i();
        Map a = this.f5773t.mo3615a(mo1037k());
        String str = f5755d;
        if (Log.isLoggable("HttpOperation", 3)) {
            StringBuilder stringBuilder = new StringBuilder("HTTP headers:\n");
            for (Entry entry : a.entrySet()) {
                if ("Authorization".equals(entry.getKey())) {
                    stringBuilder.append("Authorization: <removed>");
                } else {
                    try {
                        stringBuilder.append((String) entry.getKey()).append(": ").append((String) entry.getValue());
                    } catch (IOException e) {
                        m8059a(0, null, e);
                        m8079q();
                        this.f5777x = null;
                        return;
                    } catch (Throwable th) {
                        this.f5777x = null;
                    }
                }
                stringBuilder.append('\n');
            }
        }
        Object juu = new juu();
        jur jur;
        if (this.f5778y == null) {
            jur jur2 = new jur();
            juq = new juq(this, jur2);
            jur = jur2;
        } else {
            juq = new jut(this, this.f5778y);
            jur = null;
        }
        synchronized (this) {
            if (m8071i()) {
                this.f5777x = null;
                return;
            }
            if (this.f5758B == null) {
                this.f5758B = (CronetEngine) jyn.m25426a(this.f5760g, CronetEngine.class);
            }
            Builder a2 = new Builder(mo1037k(), juq, juu, this.f5758B).a(this.f5767n).a(this.f5772s);
            for (Entry entry2 : a.entrySet()) {
                a2.a((String) entry2.getKey(), (String) entry2.getValue());
            }
            this.f5771r = false;
        }
    }

    void m8078p() {
        this.f5779z++;
        if (m8066b(this.f5766m) && this.f5779z < 2) {
            try {
                if (m8067c(this.f5766m)) {
                    this.f5773t.mo3616a();
                }
                m8077o();
                m8078p();
                return;
            } catch (IOException e) {
                m8059a(0, null, e);
            }
        }
        mo1046a(this.f5764k, this.f5765l, this.f5766m);
    }

    public void m8059a(int i, String str, IOException iOException) {
        if (i == HttpStatusCodes.STATUS_CODE_OK && iOException != null) {
            i = 0;
        } else if (!(i == HttpStatusCodes.STATUS_CODE_OK || i == 0 || iOException != null)) {
            iOException = new jul(i, null);
        }
        this.f5764k = i;
        this.f5765l = null;
        this.f5766m = iOException;
        if (this.f5757A != null && i == 0) {
            mo1037k();
            mo1036j();
        }
    }

    protected boolean m8066b(Exception exception) {
        return m8067c(exception);
    }

    public boolean m8067c(Exception exception) {
        if (exception instanceof jul) {
            switch (((jul) exception).m25240a()) {
                case HttpStatusCodes.STATUS_CODE_UNAUTHORIZED /*401*/:
                    return true;
            }
        }
        return false;
    }

    protected void m8079q() {
        Object obj;
        Exception exception = this.f5766m;
        if (exception == null) {
            obj = 1;
        } else if (exception instanceof SocketException) {
            r0 = 1;
        } else if (exception instanceof UnknownHostException) {
            r0 = 1;
        } else if (exception instanceof SSLException) {
            r0 = 1;
        } else if ((exception instanceof jul) && ((jul) exception).m25240a() == HttpStatusCodes.STATUS_CODE_UNAUTHORIZED) {
            r0 = 1;
        } else {
            obj = null;
        }
        if (obj == null) {
            String valueOf = String.valueOf(mo1036j());
            Log.e("HttpOperation", new StringBuilder(String.valueOf(valueOf).length() + 23).append("[").append(valueOf).append("] Unexpected exception").toString(), this.f5766m);
        }
    }

    void m8080r() {
        int size = this.f5774u.size();
        for (int i = 0; i < size; i++) {
            try {
                jun jun = (jun) this.f5774u.get(i);
                String b = this.f5761h.m25293b();
                mo1036j();
                jun.mo3609a(b, this.f5763j, this.f5764k, this.f5770q);
            } catch (Throwable th) {
                Log.e("HttpOperation", "Couldn't save network data", th);
            }
        }
    }

    public void m8063a(byte[] bArr, String str) {
        int size = this.f5774u.size();
        for (int i = 0; i < size; i++) {
            try {
                jun jun = (jun) this.f5774u.get(i);
                if (jun.mo3610a(mo1036j())) {
                    mo1036j();
                    jun.mo3612c(str);
                }
            } catch (Throwable th) {
                Log.e("HttpOperation", "Couldn't log request", th);
            }
        }
    }

    public void m8065b(ByteBuffer byteBuffer, String str) {
        int size = this.f5774u.size();
        for (int i = 0; i < size; i++) {
            try {
                jun jun = (jun) this.f5774u.get(i);
                if (jun.mo3611b(mo1036j())) {
                    mo1036j();
                    byteBuffer.duplicate();
                    jun.mo3613d(str);
                }
            } catch (Throwable th) {
                Log.e("HttpOperation", "Couldn't log response", th);
            }
        }
    }

    protected boolean m8081s() {
        int size = this.f5774u.size();
        for (int i = 0; i < size; i++) {
            if (((jun) this.f5774u.get(i)).mo3610a(mo1036j())) {
                return true;
            }
        }
        return false;
    }

    public boolean m8082t() {
        int size = this.f5774u.size();
        for (int i = 0; i < size; i++) {
            if (((jun) this.f5774u.get(i)).mo3611b(mo1036j())) {
                return true;
            }
        }
        return false;
    }
}
