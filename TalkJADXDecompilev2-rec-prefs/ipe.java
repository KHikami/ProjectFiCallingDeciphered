package p000;

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
    public final long f18615a;
    public final String f18616b;
    public final byte[] f18617c;
    public final int f18618d;
    public final String f18619e;
    public final ioq f18620f;
    public String f18621g;
    public String f18622h;
    private final HttpTransport f18623i;

    public /* synthetic */ Object mo3354c() {
        return mo3356a();
    }

    ipe(long j, String str, byte[] bArr, int i, HttpTransport httpTransport, String str2, ioq ioq) {
        this.f18615a = j;
        this.f18616b = str;
        this.f18617c = bArr;
        this.f18618d = i;
        this.f18623i = httpTransport;
        this.f18619e = str2;
        this.f18620f = ioq;
    }

    public void mo3352a(String str, long j) {
        this.f18621g = str;
        this.f18622h = j == 0 ? "none" : Long.toString(j);
    }

    public void mo3353b() {
        this.f18620f.mo3258a(this.f18615a, this.f18616b);
    }

    public byte[] mo3356a() {
        byte[] bArr = null;
        new keg().m25657c(this.f18621g);
        String str = this.f18621g;
        String str2 = this.f18622h;
        int i = this.f18618d;
        keg keg = new keg();
        keg.m25657c(str);
        try {
            try {
                bArr = ipe.m22808a(new ipc(this.f18623i.createRequestFactory(new ipf(str2, str, keg, i)).buildPostRequest(new GenericUrl(new URL(new URL(this.f18619e), this.f18616b)), new ipa(this.f18617c)).execute()));
            } catch (Throwable e) {
                itx.m23278a(5, "vclib", "Error making apiary request", e);
            }
        } catch (Throwable e2) {
            itx.m23278a(5, "vclib", "Error processing request url", e2);
        }
        return bArr;
    }

    private static byte[] m22808a(ipc ipc) {
        Throwable e;
        Throwable th;
        byte[] bArr = null;
        InputStream a;
        try {
            a = ipc.m22832a();
            try {
                BufferedInputStream bufferedInputStream = new BufferedInputStream(a);
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                for (int read = bufferedInputStream.read(); read != -1; read = bufferedInputStream.read()) {
                    byteArrayOutputStream.write((byte) read);
                }
                if (TextUtils.equals(ipc.m22833a("X-Goog-Safety-Encoding"), "base64")) {
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
                    itx.m23278a(5, "vclib", "Error processing apiary response", e);
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
            itx.m23278a(5, "vclib", "Error processing apiary response", e);
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

    public void mo3355a(byte[] bArr) {
        if (this.f18620f == null) {
            return;
        }
        if (bArr == null) {
            this.f18620f.mo3257a(this.f18615a);
        } else {
            this.f18620f.mo3259a(this.f18615a, bArr);
        }
    }
}
