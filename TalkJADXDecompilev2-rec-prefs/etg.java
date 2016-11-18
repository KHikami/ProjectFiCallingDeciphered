package p000;

import com.google.api.client.http.AbstractHttpContent;
import com.google.api.client.http.HttpMediaType;
import java.io.OutputStream;

public final class etg extends AbstractHttpContent {
    private static final boolean f12227b = false;
    final nzf f12228a;

    public /* synthetic */ AbstractHttpContent setMediaType(HttpMediaType httpMediaType) {
        return m14459a(httpMediaType);
    }

    static {
        kae kae = glk.f15565l;
    }

    public etg(nzf nzf) {
        super("application/x-protobuf");
        this.f12228a = nzf;
    }

    public long getLength() {
        int c = this.f12228a.mo1951c();
        if (f12227b) {
            String valueOf = String.valueOf(this.f12228a.toString());
            new StringBuilder(String.valueOf(valueOf).length() + 56).append("NanoProtoHttpContent serialized size: ").append(c).append(" proto=").append(valueOf);
        }
        return (long) c;
    }

    public void writeTo(OutputStream outputStream) {
        byte[] a = nzf.m1029a(this.f12228a);
        if (f12227b) {
            int length = a.length;
            String valueOf = String.valueOf(toString());
            new StringBuilder(String.valueOf(valueOf).length() + 51).append("NanoProtoHttpContent write size: ").append(length).append(" proto=").append(valueOf);
        }
        outputStream.write(a);
        outputStream.flush();
    }

    private etg m14459a(HttpMediaType httpMediaType) {
        return (etg) super.setMediaType(httpMediaType);
    }
}
