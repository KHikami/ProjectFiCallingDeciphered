package p000;

import android.view.ActionMode;
import android.view.ActionMode.Callback;
import android.view.Menu;
import android.view.MenuItem;
import com.google.android.apps.hangouts.fragments.CallContactPickerFragment;

public final class czq implements Callback {
    final /* synthetic */ CallContactPickerFragment f9388a;

    public czq(CallContactPickerFragment callContactPickerFragment) {
        this.f9388a = callContactPickerFragment;
    }

    public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        this.f9388a.f6249f.D_();
        return true;
    }

    public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        return false;
    }

    public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        return false;
    }

    public void onDestroyActionMode(ActionMode actionMode) {
        this.f9388a.f6249f.E_();
    }
}
