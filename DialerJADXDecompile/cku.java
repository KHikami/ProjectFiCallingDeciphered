import java.io.IOException;

public class cku extends IOException {
    private static final long serialVersionUID = -1616151763072450476L;

    cku(int i, int i2) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space (pos " + i + " limit " + i2 + ").");
    }

    public cku(String str) {
        super(str);
    }

    public static cku a() {
        return new cku("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either than the input has been truncated or that an embedded message misreported its own length.");
    }

    public static cku b() {
        return new cku("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static cku c() {
        return new cku("CodedInputStream encountered a malformed varint.");
    }

    public static cku d() {
        return new cku("Protocol message contained an invalid tag (zero).");
    }

    public static cku e() {
        return new cku("Protocol message end-group tag did not match expected tag.");
    }

    public static cku f() {
        return new cku("Protocol message tag had invalid wire type.");
    }

    public static cku g() {
        return new cku("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }
}
