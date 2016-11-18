package p000;

import android.content.Context;
import java.io.Serializable;

public abstract class bjd implements Serializable {
    public abstract fbw mo565a(Context context, String str);

    protected abstract Object[] mo566a();

    public boolean equals(Object obj) {
        return this == obj || (obj != null && (obj instanceof bjd) && gwb.m2240h(mo566a(), ((bjd) obj).mo566a()));
    }

    public int hashCode() {
        return gwb.m2074c(mo566a());
    }
}
