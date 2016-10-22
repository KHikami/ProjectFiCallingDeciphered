import java.io.IOException;
import java.io.OutputStream;
import java.util.Map;

final class dzq {
    public int a;
    public String b;
    public String c;
    public long d;
    public long e;
    public long f;
    public Map<String, String> g;

    dzq() {
    }

    public dzq(String str, alg alg) {
        this.b = str;
        this.a = alg.a.length;
        this.c = alg.b;
        this.d = alg.c;
        this.e = alg.e;
        this.f = alg.f;
        this.g = alg.g;
    }

    public alg a(byte[] bArr) {
        alg alg = new alg();
        alg.a = bArr;
        alg.b = this.c;
        alg.c = this.d;
        alg.e = this.e;
        alg.f = this.f;
        alg.g = this.g;
        return alg;
    }

    public boolean a(OutputStream outputStream) {
        try {
            dzp.a(outputStream, 538181937);
            dzp.a(outputStream, this.a);
            dzp.a(outputStream, this.b);
            dzp.a(outputStream, this.c == null ? "" : this.c);
            dzp.a(outputStream, this.d);
            dzp.a(outputStream, this.e);
            dzp.a(outputStream, this.f);
            dzp.a(this.g, outputStream);
            outputStream.flush();
            return true;
        } catch (IOException e) {
            return false;
        }
    }
}
