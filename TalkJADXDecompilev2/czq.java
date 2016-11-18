package defpackage;

import android.view.ActionMode;
import android.view.ActionMode.Callback;
import android.view.Menu;
import android.view.MenuItem;
import com.google.android.apps.hangouts.fragments.CallContactPickerFragment;

public final class czq implements Callback {
    final /* synthetic */ CallContactPickerFragment a;

    public czq(CallContactPickerFragment callContactPickerFragment) {
        this.a = callContactPickerFragment;
    }

    public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        this.a.f.D_();
        return true;
    }

    public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        return false;
    }

    public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        return false;
    }

    public void onDestroyActionMode(ActionMode actionMode) {
        this.a.f.E_();
    }
}
