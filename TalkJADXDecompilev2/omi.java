package defpackage;

import android.util.Log;
import io.grpc.internal.bi;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map.Entry;
import org.chromium.net.BidirectionalStream;
import org.chromium.net.BidirectionalStream.Callback;
import org.chromium.net.CronetException;
import org.chromium.net.UrlResponseInfo;
import org.chromium.net.UrlResponseInfo.HeaderBlock;

final class omi extends Callback {
    final /* synthetic */ omh a;
    private List<Entry<String, String>> b;

    omi(omh omh) {
        this.a = omh;
    }

    public void a() {
        this.a.j();
        synchronized (this.a.b) {
            this.a.d = true;
            for (omj omj : this.a.c) {
                this.a.a(omj.a, omj.b, omj.c);
            }
            this.a.c.clear();
        }
    }

    public void a(BidirectionalStream bidirectionalStream, UrlResponseInfo urlResponseInfo) {
        if (Log.isLoggable("grpc-java-cronet", 2)) {
            String valueOf = String.valueOf(urlResponseInfo.d());
            new StringBuilder(String.valueOf(valueOf).length() + 34).append("onResponseHeadersReceived. Header=").append(valueOf);
        }
        this.a.a(urlResponseInfo.d(), false);
        bidirectionalStream.a(ByteBuffer.allocateDirect(4096));
    }

    public void a(ByteBuffer byteBuffer, boolean z) {
        byteBuffer.flip();
        if (Log.isLoggable("grpc-java-cronet", 2)) {
            new StringBuilder(33).append("onReadCompleted. Size=").append(byteBuffer.remaining());
        }
        this.a.f = z;
        if (byteBuffer.remaining() != 0) {
            this.a.a(byteBuffer, false);
        }
        if (z && this.b != null) {
            this.a.a(this.b, true);
        }
    }

    public void a(ByteBuffer byteBuffer) {
        this.a.a(byteBuffer);
    }

    public void a(HeaderBlock headerBlock) {
        a(headerBlock.a());
    }

    private void a(List<Entry<String, String>> list) {
        this.b = list;
        if (this.a.f) {
            this.a.a((List) list, true);
        }
        if (Log.isLoggable("grpc-java-cronet", 2)) {
            String str = "onResponseTrailersReceived. Trailer=";
            String valueOf = String.valueOf(list.toString());
            if (valueOf.length() != 0) {
                str.concat(valueOf);
            } else {
                valueOf = new String(str);
            }
        }
    }

    public void a(CronetException cronetException) {
        omh omh = this.a;
        omh.a.a(omh, olv.q.b(cronetException));
    }

    public void b(UrlResponseInfo urlResponseInfo) {
        olv a;
        synchronized (this.a.b) {
            a = this.a.e != null ? this.a.e : urlResponseInfo != null ? bi.a(urlResponseInfo.b()) : olv.c;
        }
        omh omh = this.a;
        omh.a.a(omh, a);
    }

    public void a(UrlResponseInfo urlResponseInfo) {
        boolean z;
        if (this.b == null || !this.a.f) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            if (this.b != null) {
                this.a.a(this.b, true);
            } else if (urlResponseInfo != null) {
                this.a.a(urlResponseInfo.d(), true);
            } else {
                throw new AssertionError("No response header or trailer");
            }
        }
        omh omh = this.a;
        omh.a.a(omh, bi.a(urlResponseInfo.b()));
    }
}
