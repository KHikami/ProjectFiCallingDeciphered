package p000;

import android.content.res.Resources;
import android.provider.ContactsContract.CommonDataKinds.Phone;

final class hui extends huk {
    final /* synthetic */ hug f17288a;

    hui(hug hug, Resources resources) {
        this.f17288a = hug;
        super(resources);
    }

    protected String mo2949a(Resources resources, int i) {
        return (String) Phone.getTypeLabel(resources, i, null);
    }
}
