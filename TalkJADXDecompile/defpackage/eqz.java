package defpackage;

import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AbsListView.MultiChoiceModeListener;

/* renamed from: eqz */
final class eqz implements MultiChoiceModeListener {
    final /* synthetic */ eqy a;

    eqz(eqy eqy) {
        this.a = eqy;
    }

    public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        this.a.b = actionMode;
        return this.a.a.a(this.a, menu);
    }

    public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        return this.a.a.b(this.a, menu);
    }

    public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        return this.a.a.a(menuItem);
    }

    public void onDestroyActionMode(ActionMode actionMode) {
        this.a.a.a();
        this.a.b = null;
    }

    public void onItemCheckedStateChanged(ActionMode actionMode, int i, long j, boolean z) {
        this.a.a.a(this.a, i, z);
    }
}
