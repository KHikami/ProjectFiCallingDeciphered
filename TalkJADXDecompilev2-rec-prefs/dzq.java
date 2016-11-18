package p000;

import java.io.IOException;
import java.io.OutputStream;
import java.util.Map;

final class dzq {
    public int f10934a;
    public String f10935b;
    public String f10936c;
    public long f10937d;
    public long f10938e;
    public long f10939f;
    public Map<String, String> f10940g;

    dzq() {
    }

    public dzq(String str, alg alg) {
        this.f10935b = str;
        this.f10934a = alg.f1182a.length;
        this.f10936c = alg.f1183b;
        this.f10937d = alg.f1184c;
        this.f10938e = alg.f1186e;
        this.f10939f = alg.f1187f;
        this.f10940g = alg.f1188g;
    }

    public alg m13192a(byte[] bArr) {
        alg alg = new alg();
        alg.f1182a = bArr;
        alg.f1183b = this.f10936c;
        alg.f1184c = this.f10937d;
        alg.f1186e = this.f10938e;
        alg.f1187f = this.f10939f;
        alg.f1188g = this.f10940g;
        return alg;
    }

    public boolean m13193a(OutputStream outputStream) {
        try {
            dzp.m13179a(outputStream, 538181937);
            dzp.m13179a(outputStream, this.f10934a);
            dzp.m13181a(outputStream, this.f10935b);
            dzp.m13181a(outputStream, this.f10936c == null ? "" : this.f10936c);
            dzp.m13180a(outputStream, this.f10937d);
            dzp.m13180a(outputStream, this.f10938e);
            dzp.m13180a(outputStream, this.f10939f);
            dzp.m13182a(this.f10940g, outputStream);
            outputStream.flush();
            return true;
        } catch (IOException e) {
            return false;
        }
    }
}
