import android.content.Context;
import java.io.Serializable;

public abstract class bjd implements Serializable {
    public abstract fbw a(Context context, String str);

    protected abstract Object[] a();

    public boolean equals(Object obj) {
        return this == obj || (obj != null && (obj instanceof bjd) && gwb.h(a(), ((bjd) obj).a()));
    }

    public int hashCode() {
        return gwb.c(a());
    }
}
