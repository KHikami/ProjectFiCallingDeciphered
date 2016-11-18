package p000;

import java.io.IOException;

public final class hcp extends IOException {
    public hcp(String str) {
        super(str);
    }

    static hcp m19346a() {
        return new hcp("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either than the input has been truncated or that an embedded message misreported its own length.");
    }

    static hcp m19347b() {
        return new hcp("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    static hcp m19348c() {
        return new hcp("CodedInputStream encountered a malformed varint.");
    }
}
