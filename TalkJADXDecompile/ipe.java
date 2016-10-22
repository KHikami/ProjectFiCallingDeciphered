import android.text.TextUtils;
import android.util.Base64;
import com.google.api.client.http.GenericUrl;
import com.google.api.client.http.HttpTransport;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

class ipe implements ipb<byte[]> {
    public final long a;
    public final String b;
    public final byte[] c;
    public final int d;
    public final String e;
    public final ioq f;
    public String g;
    public String h;
    private final HttpTransport i;

    public /* synthetic */ Object c() {
        return a();
    }

    ipe(long j, String str, byte[] bArr, int i, HttpTransport httpTransport, String str2, ioq ioq) {
        this.a = j;
        this.b = str;
        this.c = bArr;
        this.d = i;
        this.i = httpTransport;
        this.e = str2;
        this.f = ioq;
    }

    public void a(String str, long j) {
        this.g = str;
        this.h = j == 0 ? "none" : Long.toString(j);
    }

    public void b() {
        this.f.a(this.a, this.b);
    }

    public byte[] a() {
        byte[] bArr = null;
        new keg().c(this.g);
        String str = this.g;
        String str2 = this.h;
        int i = this.d;
        keg keg = new keg();
        keg.c(str);
        try {
            try {
                bArr = a(new ipc(this.i.createRequestFactory(new ipf(str2, str, keg, i)).buildPostRequest(new GenericUrl(new URL(new URL(this.e), this.b)), new ipa(this.c)).execute()));
            } catch (Throwable e) {
                itx.a(5, "vclib", "Error making apiary request", e);
            }
        } catch (Throwable e2) {
            itx.a(5, "vclib", "Error processing request url", e2);
        }
        return bArr;
    }

    private static byte[] a(ipc ipc) {
        InputStream a;
        Throwable e;
        Throwable th;
        byte[] bArr = null;
        try {
            a = ipc.a();
            try {
                BufferedInputStream bufferedInputStream = new BufferedInputStream(a);
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                for (int read = bufferedInputStream.read(); read != -1; read = bufferedInputStream.read()) {
                    byteArrayOutputStream.write((byte) read);
                }
                if (TextUtils.equals(ipc.a("X-Goog-Safety-Encoding"), "base64")) {
                    bArr = Base64.decode(byteArrayOutputStream.toByteArray(), 0);
                    if (a != null) {
                        try {
                            a.close();
                        } catch (IOException e2) {
                        }
                    }
                } else {
                    bArr = byteArrayOutputStream.toByteArray();
                    if (a != null) {
                        try {
                            a.close();
                        } catch (IOException e3) {
                        }
                    }
                }
            } catch (IOException e4) {
                e = e4;
                try {
                    itx.a(5, "vclib", "Error processing apiary response", e);
                    if (a != null) {
                        try {
                            a.close();
                        } catch (IOException e5) {
                        }
                    }
                    return bArr;
                } catch (Throwable th2) {
                    th = th2;
                    if (a != null) {
                        try {
                            a.close();
                        } catch (IOException e6) {
                        }
                    }
                    throw th;
                }
            }
        } catch (IOException e7) {
            e = e7;
            a = bArr;
            itx.a(5, "vclib", "Error processing apiary response", e);
            if (a != null) {
                a.close();
            }
            return bArr;
        } catch (Throwable e8) {
            a = bArr;
            th = e8;
            if (a != null) {
                a.close();
            }
            throw th;
        }
        return bArr;
    }

    public void a(byte[] bArr) {
        if (this.f == null) {
            return;
        }
        if (bArr == null) {
            this.f.a(this.a);
        } else {
            this.f.a(this.a, bArr);
        }
    }
}
