package defpackage;

import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.View;
import android.view.View.OnCreateContextMenuListener;
import com.google.api.client.http.HttpStatusCodes;

/* renamed from: egz */
final class egz implements OnCreateContextMenuListener {
    final /* synthetic */ egv a;

    egz(egv egv) {
        this.a = egv;
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenuInfo contextMenuInfo) {
        if (view instanceof gon) {
            ((iih) this.a.binder.a(iih.class)).a(this.a.e.a()).b().c(3312);
            if (this.a.am) {
                ((iih) this.a.binder.a(iih.class)).a(this.a.e.a()).b().c(3311);
            }
            bjg a = ((gon) view).a();
            this.a.aq = a;
            if (a.v()) {
                contextMenu.add(0, HttpStatusCodes.STATUS_CODE_OK, 0, bc.fX);
                contextMenu.setHeaderTitle(bc.fR);
            }
        }
    }
}
