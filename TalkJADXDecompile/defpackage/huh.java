package defpackage;

import android.content.res.Resources;
import android.provider.ContactsContract.CommonDataKinds.Email;

/* renamed from: huh */
final class huh extends huk {
    final /* synthetic */ hug a;

    huh(hug hug, Resources resources) {
        this.a = hug;
        super(resources);
    }

    protected String a(Resources resources, int i) {
        return (String) Email.getTypeLabel(resources, i, null);
    }
}
