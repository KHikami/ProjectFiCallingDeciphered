import android.os.Bundle;

public class jfl implements kcd, kcn, kcq {
    private int a;

    public jfl(kbu kbu) {
        kbu.a((kcq) this);
    }

    public int a() {
        int i = this.a;
        this.a = i + 1;
        return i;
    }

    public void a(Bundle bundle) {
        if (bundle == null) {
            this.a = 16383;
        } else {
            this.a = bundle.getInt("com.google.android.apps.photos.activityresult.SafeRequstCodeGenerator.NextRequestCode");
        }
    }

    public void b(Bundle bundle) {
        bundle.putInt("com.google.android.apps.photos.activityresult.SafeRequstCodeGenerator.NextRequestCode", this.a);
    }
}
