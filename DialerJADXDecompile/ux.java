import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.database.DataSetObserver;
import android.support.v7.widget.ActivityChooserView;

/* compiled from: PG */
public final class ux extends DataSetObserver {
    private /* synthetic */ ActivityChooserView a;

    public ux(ActivityChooserView activityChooserView) {
        this.a = activityChooserView;
    }

    public final void onChanged() {
        super.onChanged();
        ActivityChooserView activityChooserView = this.a;
        if (activityChooserView.a.getCount() > 0) {
            activityChooserView.d.setEnabled(true);
        } else {
            activityChooserView.d.setEnabled(false);
        }
        int a = activityChooserView.a.a.a();
        int c = activityChooserView.a.a.c();
        if (a == 1 || (a > 1 && c > 0)) {
            activityChooserView.f.setVisibility(0);
            ResolveInfo b = activityChooserView.a.a.b();
            PackageManager packageManager = activityChooserView.getContext().getPackageManager();
            activityChooserView.g.setImageDrawable(b.loadIcon(packageManager));
            if (activityChooserView.l != 0) {
                CharSequence loadLabel = b.loadLabel(packageManager);
                activityChooserView.f.setContentDescription(activityChooserView.getContext().getString(activityChooserView.l, new Object[]{loadLabel}));
            }
        } else {
            activityChooserView.f.setVisibility(8);
        }
        if (activityChooserView.f.getVisibility() == 0) {
            activityChooserView.b.setBackgroundDrawable(activityChooserView.c);
        } else {
            activityChooserView.b.setBackgroundDrawable(null);
        }
    }
}
