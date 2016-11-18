package defpackage;

import android.content.res.Resources;
import android.provider.ContactsContract.CommonDataKinds.Phone;

final class hui extends huk {
    final /* synthetic */ hug a;

    hui(hug hug, Resources resources) {
        this.a = hug;
        super(resources);
    }

    protected String a(Resources resources, int i) {
        return (String) Phone.getTypeLabel(resources, i, null);
    }
}
