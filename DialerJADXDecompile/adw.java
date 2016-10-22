import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import com.android.contacts.common.list.ContactTilePhoneFrequentView;

/* compiled from: PG */
public final class adw implements OnClickListener {
    private /* synthetic */ ContactTilePhoneFrequentView a;

    public adw(ContactTilePhoneFrequentView contactTilePhoneFrequentView) {
        this.a = contactTilePhoneFrequentView;
    }

    public final void onClick(View view) {
        if (this.a.b != null) {
            if (TextUtils.isEmpty(this.a.a)) {
                adz adz = this.a.b;
                Uri uri = this.a.c;
                abn.a(this.a);
                adz.a(uri);
                return;
            }
            this.a.b.a(this.a.a);
        }
    }
}
