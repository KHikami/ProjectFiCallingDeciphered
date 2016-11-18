package p000;

import android.content.res.AssetManager;
import java.io.IOException;

public abstract class aod<T> implements aoe<T> {
    private final String f1953a;
    private final AssetManager f1954b;
    private T f1955c;

    protected abstract T mo319a(AssetManager assetManager, String str);

    protected abstract void mo320a(T t);

    public aod(AssetManager assetManager, String str) {
        this.f1954b = assetManager;
        this.f1953a = str;
    }

    public void mo312a(amq amq, aof<? super T> aof__super_T) {
        try {
            this.f1955c = mo319a(this.f1954b, this.f1953a);
            aof__super_T.mo326a(this.f1955c);
        } catch (Exception e) {
            aof__super_T.mo325a(e);
        }
    }

    public void mo311a() {
        if (this.f1955c != null) {
            try {
                mo320a(this.f1955c);
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
