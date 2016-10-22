import android.content.res.AssetManager;
import java.io.IOException;

public abstract class aod<T> implements aoe<T> {
    private final String a;
    private final AssetManager b;
    private T c;

    protected abstract T a(AssetManager assetManager, String str);

    protected abstract void a(T t);

    public aod(AssetManager assetManager, String str) {
        this.b = assetManager;
        this.a = str;
    }

    public void a(amq amq, aof<? super T> aof__super_T) {
        try {
            this.c = a(this.b, this.a);
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
