package p000;

import java.io.IOException;

public class nxc extends IOException {
    private static final long serialVersionUID = -1616151763072450476L;
    private nxi f31205a = null;

    public nxc(String str) {
        super(str);
    }

    public nxc m37022a(nxi nxi) {
        this.f31205a = nxi;
        return this;
    }

    static nxc m37018a() {
        return new nxc("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    static nxc m37019b() {
        return new nxc("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    static nxd m37020c() {
        return new nxd("Protocol message tag had invalid wire type.");
    }

    static nxc m37021d() {
        return new nxc("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }
}
