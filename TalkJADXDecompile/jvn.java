import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import java.nio.ByteBuffer;

public class jvn<RS extends nzf> extends juo {
    private final String a;
    private final String b;
    private boolean c;
    public final RS s;

    public String k() {
        return gwb.a(this.g, this.b, u(), false, e());
    }

    public Bundle e() {
        return null;
    }

    public String u() {
        return this.a;
    }

    public String j() {
        return this.a;
    }

    public String b() {
        return "application/x-protobuf";
    }

    public void c(RS rs) {
    }

    public void a(ByteBuffer byteBuffer) {
        b(byteBuffer);
        if (t()) {
            b(byteBuffer, gwb.a(this.s));
        }
        c(this.s);
    }

    public void a(ByteBuffer byteBuffer, String str) {
        super.a(byteBuffer, str);
        if (Log.isLoggable("HttpOperation", 5)) {
            String str2 = "HttpOperation error: Response follows: \n";
            String valueOf = String.valueOf(new String(gwb.a(byteBuffer), "UTF-8"));
            if (valueOf.length() != 0) {
                str2.concat(valueOf);
            } else {
                valueOf = new String(str2);
            }
        }
    }

    protected RS b(ByteBuffer byteBuffer) {
        if (this.s == null) {
            return null;
        }
        nyt a;
        if (byteBuffer.hasArray()) {
            a = nyt.a(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining());
        } else {
            byte[] a2 = gwb.a(byteBuffer);
            a = nyt.a(a2, 0, a2.length);
        }
        this.s.a(a);
        this.c = true;
        return this.s;
    }

    protected jvn(Context context, jvc jvc, String str, String str2, RS rs, String str3, String str4) {
        juy jvq;
        juh d = jvc.d();
        if (d != null) {
            jvq = new jvq(context, jvc.b(), str4, d);
        } else {
            jvq = new jvk(context, jvc.b(), jvc.a() ? jvc.c() : null, str4, str);
        }
        super(context, jvc, str, jvq);
        this.a = str2;
        this.s = rs;
        this.b = str3;
    }
}
