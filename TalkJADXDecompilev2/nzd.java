package defpackage;

import java.io.IOException;

public final class nzd extends IOException {
    private static final long serialVersionUID = -1616151763072450476L;

    public nzd(String str) {
        super(str);
    }

    static nzd a() {
        return new nzd("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either than the input has been truncated or that an embedded message misreported its own length.");
    }

    static nzd b() {
        return new nzd("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    static nzd c() {
        return new nzd("CodedInputStream encountered a malformed varint.");
    }

    static nzd d() {
        return new nzd("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }
}
