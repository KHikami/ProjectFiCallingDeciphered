package p000;

import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AbsListView.MultiChoiceModeListener;

final class eqz implements MultiChoiceModeListener {
    final /* synthetic */ eqy f12097a;

    eqz(eqy eqy) {
        this.f12097a = eqy;
    }

    public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        this.f12097a.f12095b = actionMode;
        return this.f12097a.f12094a.m14299a(this.f12097a, menu);
    }

    public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        return this.f12097a.f12094a.m14301b(this.f12097a, menu);
    }

    public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        return this.f12097a.f12094a.m14298a(menuItem);
    }

    public void onDestroyActionMode(ActionMode actionMode) {
        this.f12097a.f12094a.m14296a();
        this.f12097a.f12095b = null;
    }

    public void onItemCheckedStateChanged(ActionMode actionMode, int i, long j, boolean z) {
        this.f12097a.f12094a.m14297a(this.f12097a, i, z);
    }
}
