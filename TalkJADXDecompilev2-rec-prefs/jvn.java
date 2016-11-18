package p000;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import java.nio.ByteBuffer;

public class jvn<RS extends nzf> extends juo {
    private final String f5780a;
    private final String f5781b;
    private boolean f5782c;
    public final RS f5783s;

    public String mo1037k() {
        return gwb.m1649a(this.g, this.f5781b, m8091u(), false, mo1044e());
    }

    public Bundle mo1044e() {
        return null;
    }

    public String m8091u() {
        return this.f5780a;
    }

    public String mo1036j() {
        return this.f5780a;
    }

    public String mo1035b() {
        return "application/x-protobuf";
    }

    public void mo1042c(RS rs) {
    }

    public void mo1033a(ByteBuffer byteBuffer) {
        m8086b(byteBuffer);
        if (m8082t()) {
            m8065b(byteBuffer, gwb.m1675a(this.f5783s));
        }
        mo1042c(this.f5783s);
    }

    public void mo1034a(ByteBuffer byteBuffer, String str) {
        super.mo1034a(byteBuffer, str);
        if (Log.isLoggable("HttpOperation", 5)) {
            String str2 = "HttpOperation error: Response follows: \n";
            String valueOf = String.valueOf(new String(gwb.m1950a(byteBuffer), "UTF-8"));
            if (valueOf.length() != 0) {
                str2.concat(valueOf);
            } else {
                valueOf = new String(str2);
            }
        }
    }

    protected RS m8086b(ByteBuffer byteBuffer) {
        if (this.f5783s == null) {
            return null;
        }
        nyt a;
        if (byteBuffer.hasArray()) {
            a = nyt.a(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining());
        } else {
            byte[] a2 = gwb.m1950a(byteBuffer);
            a = nyt.a(a2, 0, a2.length);
        }
        this.f5783s.mo150a(a);
        this.f5782c = true;
        return this.f5783s;
    }

    protected jvn(Context context, jvc jvc, String str, String str2, RS rs, String str3, String str4) {
        juy jvq;
        juh d = jvc.m25295d();
        if (d != null) {
            jvq = new jvq(context, jvc.m25293b(), str4, d);
        } else {
            jvq = new jvk(context, jvc.m25293b(), jvc.m25292a() ? jvc.m25294c() : null, str4, str);
        }
        super(context, jvc, str, jvq);
        this.f5780a = str2;
        this.f5783s = rs;
        this.f5781b = str3;
    }
}
