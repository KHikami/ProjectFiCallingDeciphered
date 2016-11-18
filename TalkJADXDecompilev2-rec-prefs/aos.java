package p000;

import android.content.ContentResolver;
import android.net.Uri;
import java.io.IOException;

public abstract class aos<T> implements aoe<T> {
    private final Uri f1964a;
    private final ContentResolver f1965b;
    private T f1966c;

    protected abstract T mo322a(Uri uri, ContentResolver contentResolver);

    protected abstract void mo323a(T t);

    public aos(ContentResolver contentResolver, Uri uri) {
        this.f1965b = contentResolver;
        this.f1964a = uri;
    }

    public final void mo312a(amq amq, aof<? super T> aof__super_T) {
        try {
            this.f1966c = mo322a(this.f1964a, this.f1965b);
            aof__super_T.mo326a(this.f1966c);
        } catch (Exception e) {
            aof__super_T.mo325a(e);
        }
    }

    public void mo311a() {
        if (this.f1966c != null) {
            try {
                mo323a(this.f1966c);
            } catch (IOException e) {
            }
        }
    }

    public void mo313b() {
    }

    public anq mo314c() {
        return anq.LOCAL;
    }
}
