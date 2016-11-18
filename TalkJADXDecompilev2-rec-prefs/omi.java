package p000;

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
    final /* synthetic */ omh f33220a;
    private List<Entry<String, String>> f33221b;

    omi(omh omh) {
        this.f33220a = omh;
    }

    public void mo4176a() {
        this.f33220a.j();
        synchronized (this.f33220a.f33205b) {
            this.f33220a.f33207d = true;
            for (omj omj : this.f33220a.f33206c) {
                this.f33220a.m38726a(omj.f33222a, omj.f33223b, omj.f33224c);
            }
            this.f33220a.f33206c.clear();
        }
    }

    public void mo4179a(BidirectionalStream bidirectionalStream, UrlResponseInfo urlResponseInfo) {
        if (Log.isLoggable("grpc-java-cronet", 2)) {
            String valueOf = String.valueOf(urlResponseInfo.m39399d());
            new StringBuilder(String.valueOf(valueOf).length() + 34).append("onResponseHeadersReceived. Header=").append(valueOf);
        }
        this.f33220a.m38727a(urlResponseInfo.m39399d(), false);
        bidirectionalStream.m39326a(ByteBuffer.allocateDirect(4096));
    }

    public void mo4178a(ByteBuffer byteBuffer, boolean z) {
        byteBuffer.flip();
        if (Log.isLoggable("grpc-java-cronet", 2)) {
            new StringBuilder(33).append("onReadCompleted. Size=").append(byteBuffer.remaining());
        }
        this.f33220a.f33209f = z;
        if (byteBuffer.remaining() != 0) {
            this.f33220a.m38725a(byteBuffer, false);
        }
        if (z && this.f33221b != null) {
            this.f33220a.m38727a(this.f33221b, true);
        }
    }

    public void mo4177a(ByteBuffer byteBuffer) {
        this.f33220a.m38724a(byteBuffer);
    }

    public void mo4181a(HeaderBlock headerBlock) {
        m38739a(headerBlock.m39390a());
    }

    private void m38739a(List<Entry<String, String>> list) {
        this.f33221b = list;
        if (this.f33220a.f33209f) {
            this.f33220a.m38727a((List) list, true);
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

    public void mo4180a(CronetException cronetException) {
        omh omh = this.f33220a;
        omh.f33204a.m38754a(omh, olv.q.b(cronetException));
    }

    public void mo4183b(UrlResponseInfo urlResponseInfo) {
        olv a;
        synchronized (this.f33220a.f33205b) {
            a = this.f33220a.f33208e != null ? this.f33220a.f33208e : urlResponseInfo != null ? bi.a(urlResponseInfo.m39397b()) : olv.c;
        }
        omh omh = this.f33220a;
        omh.f33204a.m38754a(omh, a);
    }

    public void mo4182a(UrlResponseInfo urlResponseInfo) {
        boolean z;
        if (this.f33221b == null || !this.f33220a.f33209f) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            if (this.f33221b != null) {
                this.f33220a.m38727a(this.f33221b, true);
            } else if (urlResponseInfo != null) {
                this.f33220a.m38727a(urlResponseInfo.m39399d(), true);
            } else {
                throw new AssertionError("No response header or trailer");
            }
        }
        omh omh = this.f33220a;
        omh.f33204a.m38754a(omh, bi.a(urlResponseInfo.m39397b()));
    }
}
