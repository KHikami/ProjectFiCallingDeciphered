package p000;

import android.util.Base64;
import com.google.api.client.http.HttpStatusCodes;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.chromium.net.UrlRequest;
import org.chromium.net.UrlRequest.Callback;
import org.chromium.net.UrlRequestException;
import org.chromium.net.UrlResponseInfo;

final class iou extends Callback {
    final String f18599a;
    final /* synthetic */ ior f18600b;
    private final long f18601c;
    private final byte[] f18602d;
    private final int f18603e;
    private final ioq f18604f;
    private final int f18605g;
    private UrlRequest f18606h;
    private boolean f18607i;
    private LinkedList<ByteBuffer> f18608j;

    iou(ior ior, long j, String str, byte[] bArr, int i, ioq ioq) {
        this.f18600b = ior;
        this.f18601c = j;
        this.f18599a = str;
        this.f18602d = bArr;
        this.f18603e = i;
        this.f18604f = ioq;
        this.f18605g = (ior.f18593a << 10) / 512;
    }

    public void m22792a() {
        this.f18606h = this.f18600b.f18594b.m22800a(this.f18599a, this.f18602d, this);
        this.f18604f.mo3258a(this.f18601c, this.f18599a);
        this.f18607i = false;
        this.f18608j = new LinkedList();
        itx.m23279a(3, "vclib", "Request starting: %s", this.f18599a);
        this.f18606h.a();
        gwb.m1864a(new iov(this), (long) this.f18603e);
    }

    public void m22798b() {
        if (this.f18606h != null && !this.f18607i) {
            this.f18606h.e();
        }
    }

    public void m22793a(UrlRequest urlRequest, String str) {
        itx.m23279a(3, "vclib", "Handling redirect to %s (%s)", str, this.f18599a);
        urlRequest.b();
    }

    public void m22794a(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        itx.m23279a(3, "vclib", "Response started (%s)", this.f18599a);
        this.f18608j.addLast(ByteBuffer.allocateDirect(512));
        urlRequest.a((ByteBuffer) this.f18608j.getLast());
    }

    public void m22795a(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, ByteBuffer byteBuffer) {
        Object[] objArr = new Object[]{Boolean.valueOf(((ByteBuffer) this.f18608j.getLast()).hasRemaining()), this.f18599a};
        if (!((ByteBuffer) this.f18608j.getLast()).hasRemaining()) {
            if (this.f18608j.size() == this.f18605g) {
                throw new IllegalStateException("Response exceeds max size limit!");
            }
            this.f18608j.addLast(ByteBuffer.allocateDirect(512));
        }
        urlRequest.a((ByteBuffer) this.f18608j.getLast());
    }

    public void m22799b(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        boolean z = true;
        new Object[1][0] = this.f18599a;
        this.f18607i = true;
        if (urlResponseInfo.b() != HttpStatusCodes.STATUS_CODE_OK) {
            String a = iou.m22791a(urlResponseInfo, "Content-Type");
            itx.m23288c("vclib", "Request failed! path: %s, status: %d, content-type: %s", this.f18599a, Integer.valueOf(urlResponseInfo.b()), a);
            int i = 0;
        } else {
            boolean z2 = true;
        }
        if (i != 0) {
            byte[] decode;
            String a2 = iou.m22791a(urlResponseInfo, "X-Goog-Safety-Encoding");
            ioq ioq = this.f18604f;
            long j = this.f18601c;
            if (this.f18608j.isEmpty()) {
                z = false;
            }
            iil.m21874a("Expected condition to be true", z);
            byte[] bArr = new byte[(((ByteBuffer) this.f18608j.getLast()).position() + ((this.f18608j.size() - 1) << 9))];
            Iterator it = this.f18608j.iterator();
            i = 0;
            while (it.hasNext()) {
                ByteBuffer byteBuffer = (ByteBuffer) it.next();
                byteBuffer.flip();
                byteBuffer.get(bArr, i, byteBuffer.limit());
                i = byteBuffer.limit() + i;
            }
            if ("base64".equals(a2)) {
                decode = Base64.decode(bArr, 0);
            } else {
                decode = bArr;
            }
            ioq.mo3259a(j, decode);
        } else {
            this.f18604f.mo3257a(this.f18601c);
        }
        this.f18600b.f18595c.remove(this);
    }

    private static String m22791a(UrlResponseInfo urlResponseInfo, String str) {
        List list = (List) urlResponseInfo.e().get(str);
        return (list == null || list.isEmpty()) ? null : (String) list.get(0);
    }

    public void m22796a(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, UrlRequestException urlRequestException) {
        this.f18607i = true;
        String str = "vclib";
        String str2 = "Request failed: ";
        String valueOf = String.valueOf(this.f18599a);
        if (valueOf.length() != 0) {
            valueOf = str2.concat(valueOf);
        } else {
            valueOf = new String(str2);
        }
        itx.m23278a(5, str, valueOf, (Throwable) urlRequestException);
        this.f18604f.mo3257a(this.f18601c);
        this.f18600b.f18595c.remove(this);
    }

    public void m22797a(UrlResponseInfo urlResponseInfo) {
        this.f18607i = true;
        itx.m23279a(3, "vclib", "Apiary request cancelled (%s)", this.f18599a);
        if (!this.f18600b.f18596d) {
            this.f18604f.mo3257a(this.f18601c);
            this.f18600b.f18595c.remove(this);
        }
    }
}
