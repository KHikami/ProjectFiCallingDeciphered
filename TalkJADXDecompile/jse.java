import org.chromium.net.CronetEngine.Builder.LibraryLoader;

public class jse {
    String a;
    Boolean b;
    Boolean c;
    LibraryLoader d;

    jse() {
    }

    public jse a(String str) {
        this.a = str;
        return this;
    }

    public jse a(boolean z) {
        this.b = Boolean.valueOf(z);
        return this;
    }

    public jse b(boolean z) {
        this.c = Boolean.valueOf(z);
        return this;
    }

    public jsd a() {
        String str = "";
        if (this.a == null) {
            str = String.valueOf(str).concat(" storagePath");
        }
        if (this.b == null) {
            str = String.valueOf(str).concat(" enableQuic");
        }
        if (this.c == null) {
            str = String.valueOf(str).concat(" enableCertificateCache");
        }
        if (str.isEmpty()) {
            return new jrx(this.a, this.b.booleanValue(), this.c.booleanValue(), this.d);
        }
        String str2 = "Missing required properties:";
        str = String.valueOf(str);
        throw new IllegalStateException(str.length() != 0 ? str2.concat(str) : new String(str2));
    }

    public jse(byte b) {
        this();
    }
}
