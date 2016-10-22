import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;

final class jxl implements OnCheckedChangeListener {
    final /* synthetic */ jxk a;

    jxl(jxk jxk) {
        this.a = jxk;
    }

    public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        if (this.a.a((Object) Boolean.valueOf(z))) {
            this.a.a(z);
        } else {
            compoundButton.setChecked(!z);
        }
    }
}
