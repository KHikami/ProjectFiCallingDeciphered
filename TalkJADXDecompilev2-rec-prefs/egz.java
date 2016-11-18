package p000;

import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.View;
import android.view.View.OnCreateContextMenuListener;
import com.google.api.client.http.HttpStatusCodes;

final class egz implements OnCreateContextMenuListener {
    final /* synthetic */ egv f11481a;

    egz(egv egv) {
        this.f11481a = egv;
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenuInfo contextMenuInfo) {
        if (view instanceof gon) {
            ((iih) this.f11481a.binder.m25443a(iih.class)).mo1979a(this.f11481a.f11471e.mo2317a()).mo1693b().mo1714c(3312);
            if (this.f11481a.am) {
                ((iih) this.f11481a.binder.m25443a(iih.class)).mo1979a(this.f11481a.f11471e.mo2317a()).mo1693b().mo1714c(3311);
            }
            bjg a = ((gon) view).m18227a();
            this.f11481a.aq = a;
            if (a.mo588v()) {
                contextMenu.add(0, HttpStatusCodes.STATUS_CODE_OK, 0, bc.fX);
                contextMenu.setHeaderTitle(bc.fR);
            }
        }
    }
}
