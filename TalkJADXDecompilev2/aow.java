package defpackage;

import android.content.Context;
import android.net.Uri;
import java.io.IOException;
import java.io.InputStream;

public final class aow implements aoe<InputStream> {
    private final Uri a;
    private final apa b;
    private InputStream c;

    public static aow a(Context context, Uri uri, aoz aoz) {
        return new aow(uri, new apa(aoz, ami.a(context).b(), context.getContentResolver()));
    }

    private aow(Uri uri, apa apa) {
        this.a = uri;
        this.b = apa;
    }

    public void a() {
        if (this.c != null) {
            try {
                this.c.close();
            } catch (IOException e) {
            }
        }
    }

    public void b() {
    }

    public Class<InputStream> d() {
        return InputStream.class;
    }

    public anq c() {
        return anq.LOCAL;
    }

    public void a(amq amq, aof<? super InputStream> aof__super_java_io_InputStream) {
        try {
            int a;
            InputStream aol;
            InputStream b = this.b.b(this.a);
            if (b != null) {
                a = this.b.a(this.a);
            } else {
                a = -1;
            }
            if (a != -1) {
                aol = new aol(b, a);
            } else {
                aol = b;
            }
            this.c = aol;
            aof__super_java_io_InputStream.a(this.c);
        } catch (Exception e) {
            aof__super_java_io_InputStream.a(e);
        }
    }
}
