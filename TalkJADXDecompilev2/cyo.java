package defpackage;

import android.os.Bundle;
import com.google.android.apps.hangouts.fragments.BabelPhotoViewFragment.StoragePermissionHelperActivity;
import java.util.List;

public final class cyo implements eib {
    final /* synthetic */ StoragePermissionHelperActivity a;

    public cyo(StoragePermissionHelperActivity storagePermissionHelperActivity) {
        this.a = storagePermissionHelperActivity;
    }

    public void a(List<eic> list, Bundle bundle) {
        int i;
        iil.a(Integer.valueOf(list.size()), Integer.valueOf(1));
        eic eic = (eic) list.get(0);
        iil.a(eic.a, (Object) "android.permission.WRITE_EXTERNAL_STORAGE");
        StoragePermissionHelperActivity storagePermissionHelperActivity = this.a;
        if (eic.b) {
            i = -1;
        } else {
            i = 0;
        }
        storagePermissionHelperActivity.setResult(i);
        this.a.finish();
    }
}
