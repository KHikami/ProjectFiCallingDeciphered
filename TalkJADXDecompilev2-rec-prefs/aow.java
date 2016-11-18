package p000;

import android.content.Context;
import android.net.Uri;
import java.io.IOException;
import java.io.InputStream;

public final class aow implements aoe<InputStream> {
    private final Uri f1977a;
    private final apa f1978b;
    private InputStream f1979c;

    public static aow m3593a(Context context, Uri uri, aoz aoz) {
        return new aow(uri, new apa(aoz, ami.m2900a(context).m2906b(), context.getContentResolver()));
    }

    private aow(Uri uri, apa apa) {
        this.f1977a = uri;
        this.f1978b = apa;
    }

    public void mo311a() {
        if (this.f1979c != null) {
            try {
                this.f1979c.close();
            } catch (IOException e) {
            }
        }
    }

    public void mo313b() {
    }

    public Class<InputStream> mo321d() {
        return InputStream.class;
    }

    public anq mo314c() {
        return anq.LOCAL;
    }

    public void mo312a(amq amq, aof<? super InputStream> aof__super_java_io_InputStream) {
        try {
            int a;
            InputStream aol;
            InputStream b = this.f1978b.m3603b(this.f1977a);
            if (b != null) {
                a = this.f1978b.m3602a(this.f1977a);
            } else {
                a = -1;
            }
            if (a != -1) {
                aol = new aol(b, a);
            } else {
                aol = b;
            }
            this.f1979c = aol;
            aof__super_java_io_InputStream.mo326a(this.f1979c);
        } catch (Exception e) {
            aof__super_java_io_InputStream.mo325a(e);
        }
    }
}
