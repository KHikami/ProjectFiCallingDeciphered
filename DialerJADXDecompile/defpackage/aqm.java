package defpackage;

import android.provider.ContactsContract.QuickContact;
import android.view.View;
import android.view.View.OnClickListener;
import com.android.dialer.app.list.PhoneFavoriteSquareTileView;

/* compiled from: PG */
/* renamed from: aqm */
public final class aqm implements OnClickListener {
    private /* synthetic */ PhoneFavoriteSquareTileView a;

    public aqm(PhoneFavoriteSquareTileView phoneFavoriteSquareTileView) {
        this.a = phoneFavoriteSquareTileView;
    }

    public final void onClick(View view) {
        View view2 = this.a;
        if (abw.a()) {
            QuickContact.showQuickContact(view2.getContext(), view2, view2.c, null, "vnd.android.cursor.item/phone_v2");
        } else {
            QuickContact.showQuickContact(view2.getContext(), view2, view2.c, 3, null);
        }
    }
}
