package p000;

import android.content.res.Resources;
import android.provider.ContactsContract.CommonDataKinds.Email;

final class huh extends huk {
    final /* synthetic */ hug f17287a;

    huh(hug hug, Resources resources) {
        this.f17287a = hug;
        super(resources);
    }

    protected String mo2949a(Resources resources, int i) {
        return (String) Email.getTypeLabel(resources, i, null);
    }
}
