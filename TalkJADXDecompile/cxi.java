import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;

final class cxi implements dpo {
    private final Context a;

    cxi(Context context) {
        this.a = context;
    }

    public void a(Activity activity, Bundle bundle) {
        Object a = ((cxg) jyn.a(this.a, cxg.class)).a();
        if (!TextUtils.isEmpty(a)) {
            bundle.putString("features", a);
        }
    }
}
