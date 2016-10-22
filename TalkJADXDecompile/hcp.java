import java.io.IOException;

public final class hcp extends IOException {
    public hcp(String str) {
        super(str);
    }

    static hcp a() {
        return new hcp("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either than the input has been truncated or that an embedded message misreported its own length.");
    }

    static hcp b() {
        return new hcp("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    static hcp c() {
        return new hcp("CodedInputStream encountered a malformed varint.");
    }
}
