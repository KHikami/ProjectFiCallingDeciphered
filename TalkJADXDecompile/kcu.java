import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

public class kcu extends dq implements kbt {
    public final kbn ao;

    public kcu() {
        this.ao = new kbn();
    }

    public final kbu getLifecycle() {
        return this.ao;
    }

    public void onCreate(Bundle bundle) {
        this.ao.c(bundle);
        super.onCreate(bundle);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.ao.b(bundle);
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    public void onViewCreated(View view, Bundle bundle) {
        this.ao.a(view, bundle);
        super.onViewCreated(view, bundle);
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenuInfo contextMenuInfo) {
        this.ao.a(contextMenu, view, contextMenuInfo);
        super.onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    public boolean onContextItemSelected(MenuItem menuItem) {
        return this.ao.a(menuItem) || super.onContextItemSelected(menuItem);
    }

    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        if (this.ao.a(menu)) {
            setHasOptionsMenu(true);
        }
    }

    public void onPrepareOptionsMenu(Menu menu) {
        if (this.ao.b(menu)) {
            setHasOptionsMenu(true);
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        return this.ao.b(menuItem);
    }

    public void onAttach(Activity activity) {
        this.ao.a(activity);
        super.onAttach(activity);
    }

    public void onActivityCreated(Bundle bundle) {
        this.ao.a(bundle);
        super.onActivityCreated(bundle);
    }

    public void onStart() {
        ba.a(getChildFragmentManager());
        this.ao.i();
        super.onStart();
    }

    public void onResume() {
        ba.a(getChildFragmentManager());
        this.ao.j();
        super.onResume();
    }

    public void onPause() {
        this.ao.b();
        super.onPause();
    }

    public void onStop() {
        this.ao.k();
        super.onStop();
    }

    public void onDestroyView() {
        this.ao.a();
        super.onDestroyView();
    }

    public void onSaveInstanceState(Bundle bundle) {
        this.ao.d(bundle);
        super.onSaveInstanceState(bundle);
    }

    public void onDestroy() {
        this.ao.c();
        super.onDestroy();
    }

    public void onConfigurationChanged(Configuration configuration) {
        this.ao.a(configuration);
        super.onConfigurationChanged(configuration);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        this.ao.a(i, i2, intent);
        super.onActivityResult(i, i2, intent);
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.ao.a(i, strArr, iArr);
    }

    public void onLowMemory() {
        this.ao.l();
        super.onLowMemory();
    }

    public void setUserVisibleHint(boolean z) {
        this.ao.a(z);
        super.setUserVisibleHint(z);
    }

    public void onDetach() {
        this.ao.d();
        super.onDetach();
    }
}
