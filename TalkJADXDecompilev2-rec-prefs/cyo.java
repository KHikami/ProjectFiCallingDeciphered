package p000;

import android.os.Bundle;
import com.google.android.apps.hangouts.fragments.BabelPhotoViewFragment.StoragePermissionHelperActivity;
import java.util.List;

public final class cyo implements eib {
    final /* synthetic */ StoragePermissionHelperActivity f9334a;

    public cyo(StoragePermissionHelperActivity storagePermissionHelperActivity) {
        this.f9334a = storagePermissionHelperActivity;
    }

    public void mo748a(List<eic> list, Bundle bundle) {
        int i;
        iil.m21869a(Integer.valueOf(list.size()), Integer.valueOf(1));
        eic eic = (eic) list.get(0);
        iil.m21869a(eic.f11580a, (Object) "android.permission.WRITE_EXTERNAL_STORAGE");
        StoragePermissionHelperActivity storagePermissionHelperActivity = this.f9334a;
        if (eic.f11581b) {
            i = -1;
        } else {
            i = 0;
        }
        storagePermissionHelperActivity.setResult(i);
        this.f9334a.finish();
    }
}
