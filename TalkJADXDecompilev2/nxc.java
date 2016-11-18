package defpackage;

import java.io.IOException;

public class nxc extends IOException {
    private static final long serialVersionUID = -1616151763072450476L;
    private nxi a = null;

    public nxc(String str) {
        super(str);
    }

    public nxc a(nxi nxi) {
        this.a = nxi;
        return this;
    }

    static nxc a() {
        return new nxc("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    static nxc b() {
        return new nxc("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    static nxd c() {
        return new nxd("Protocol message tag had invalid wire type.");
    }

    static nxc d() {
        return new nxc("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }
}
