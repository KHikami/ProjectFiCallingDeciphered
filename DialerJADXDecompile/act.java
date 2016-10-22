import android.app.Fragment;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

/* compiled from: PG */
final class act implements OnClickListener {
    private /* synthetic */ aij a;
    private /* synthetic */ acs b;

    act(acs acs, aij aij) {
        this.b = acs;
        this.a = aij;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        acs acs = this.b;
        agd a = this.a.a(i);
        Fragment targetFragment = acs.getTargetFragment();
        if (targetFragment != null && (targetFragment instanceof acu)) {
            ((acu) targetFragment).a(a, acs.getArguments().getBundle("extra_args"));
        }
    }
}
