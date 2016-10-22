package defpackage;

import android.content.ContentResolver;
import android.net.Uri;
import java.io.IOException;

/* renamed from: aos */
public abstract class aos<T> implements aoe<T> {
    private final Uri a;
    private final ContentResolver b;
    private T c;

    protected abstract T a(Uri uri, ContentResolver contentResolver);

    protected abstract void a(T t);

    public aos(ContentResolver contentResolver, Uri uri) {
        this.b = contentResolver;
        this.a = uri;
    }

    public final void a(amq amq, aof<? super T> aof__super_T) {
        try {
            this.c = a(this.a, this.b);
            aof__super_T.a(this.c);
        } catch (Exception e) {
            aof__super_T.a(e);
        }
    }

    public void a() {
        if (this.c != null) {
            try {
                a(this.c);
            } catch (IOException e) {
            }
        }
    }

    public void b() {
    }

    public anq c() {
        return anq.LOCAL;
    }
}
