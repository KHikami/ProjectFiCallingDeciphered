package defpackage;

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
    final String a;
    final /* synthetic */ ior b;
    private final long c;
    private final byte[] d;
    private final int e;
    private final ioq f;
    private final int g;
    private UrlRequest h;
    private boolean i;
    private LinkedList<ByteBuffer> j;

    iou(ior ior, long j, String str, byte[] bArr, int i, ioq ioq) {
        this.b = ior;
        this.c = j;
        this.a = str;
        this.d = bArr;
        this.e = i;
        this.f = ioq;
        this.g = (ior.a << 10) / 512;
    }

    public void a() {
        this.h = this.b.b.a(this.a, this.d, this);
        this.f.a(this.c, this.a);
        this.i = false;
        this.j = new LinkedList();
        itx.a(3, "vclib", "Request starting: %s", this.a);
        this.h.a();
        gwb.a(new iov(this), (long) this.e);
    }

    public void b() {
        if (this.h != null && !this.i) {
            this.h.e();
        }
    }

    public void a(UrlRequest urlRequest, String str) {
        itx.a(3, "vclib", "Handling redirect to %s (%s)", str, this.a);
        urlRequest.b();
    }

    public void a(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        itx.a(3, "vclib", "Response started (%s)", this.a);
        this.j.addLast(ByteBuffer.allocateDirect(512));
        urlRequest.a((ByteBuffer) this.j.getLast());
    }

    public void a(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, ByteBuffer byteBuffer) {
        Object[] objArr = new Object[]{Boolean.valueOf(((ByteBuffer) this.j.getLast()).hasRemaining()), this.a};
        if (!((ByteBuffer) this.j.getLast()).hasRemaining()) {
            if (this.j.size() == this.g) {
                throw new IllegalStateException("Response exceeds max size limit!");
            }
            this.j.addLast(ByteBuffer.allocateDirect(512));
        }
        urlRequest.a((ByteBuffer) this.j.getLast());
    }

    public void b(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        boolean z = true;
        new Object[1][0] = this.a;
        this.i = true;
        if (urlResponseInfo.b() != HttpStatusCodes.STATUS_CODE_OK) {
            String a = iou.a(urlResponseInfo, "Content-Type");
            itx.c("vclib", "Request failed! path: %s, status: %d, content-type: %s", this.a, Integer.valueOf(urlResponseInfo.b()), a);
            int i = 0;
        } else {
            boolean z2 = true;
        }
        if (i != 0) {
            byte[] decode;
            String a2 = iou.a(urlResponseInfo, "X-Goog-Safety-Encoding");
            ioq ioq = this.f;
            long j = this.c;
            if (this.j.isEmpty()) {
                z = false;
            }
            iil.a("Expected condition to be true", z);
            byte[] bArr = new byte[(((ByteBuffer) this.j.getLast()).position() + ((this.j.size() - 1) << 9))];
            Iterator it = this.j.iterator();
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
            ioq.a(j, decode);
        } else {
            this.f.a(this.c);
        }
        this.b.c.remove(this);
    }

    private static String a(UrlResponseInfo urlResponseInfo, String str) {
        List list = (List) urlResponseInfo.e().get(str);
        return (list == null || list.isEmpty()) ? null : (String) list.get(0);
    }

    public void a(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, UrlRequestException urlRequestException) {
        this.i = true;
        String str = "vclib";
        String str2 = "Request failed: ";
        String valueOf = String.valueOf(this.a);
        if (valueOf.length() != 0) {
            valueOf = str2.concat(valueOf);
        } else {
            valueOf = new String(str2);
        }
        itx.a(5, str, valueOf, (Throwable) urlRequestException);
        this.f.a(this.c);
        this.b.c.remove(this);
    }

    public void a(UrlResponseInfo urlResponseInfo) {
        this.i = true;
        itx.a(3, "vclib", "Apiary request cancelled (%s)", this.a);
        if (!this.b.d) {
            this.f.a(this.c);
            this.b.c.remove(this);
        }
    }
}
