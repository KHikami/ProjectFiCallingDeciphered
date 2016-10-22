package defpackage;

import com.google.api.client.http.AbstractHttpContent;
import com.google.api.client.http.HttpMediaType;
import java.io.OutputStream;

/* renamed from: etg */
public final class etg extends AbstractHttpContent {
    private static final boolean b;
    final nzf a;

    public /* synthetic */ AbstractHttpContent setMediaType(HttpMediaType httpMediaType) {
        return a(httpMediaType);
    }

    static {
        kae kae = glk.l;
        b = false;
    }

    public etg(nzf nzf) {
        super("application/x-protobuf");
        this.a = nzf;
    }

    public long getLength() {
        int c = this.a.c();
        if (b) {
            String valueOf = String.valueOf(this.a.toString());
            new StringBuilder(String.valueOf(valueOf).length() + 56).append("NanoProtoHttpContent serialized size: ").append(c).append(" proto=").append(valueOf);
        }
        return (long) c;
    }

    public void writeTo(OutputStream outputStream) {
        byte[] a = nzf.a(this.a);
        if (b) {
            int length = a.length;
            String valueOf = String.valueOf(toString());
            new StringBuilder(String.valueOf(valueOf).length() + 51).append("NanoProtoHttpContent write size: ").append(length).append(" proto=").append(valueOf);
        }
        outputStream.write(a);
        outputStream.flush();
    }

    private etg a(HttpMediaType httpMediaType) {
        return (etg) super.setMediaType(httpMediaType);
    }
}
