package p000;

import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;
import java.util.Collection;

public final class gqb {
    private final String f15893a;
    private final TextView f15894b;

    public gqb(TextView textView) {
        gwb.aJ();
        this.f15894b = (TextView) ba.m4536a((Object) textView);
        this.f15893a = textView.getText().toString();
    }

    public void m18291a(Collection<gqd> collection) {
        if (!collection.isEmpty()) {
            if (gwb.aI()) {
                m18292b(collection);
            } else {
                gwb.m1863a(new gqc(this, collection));
            }
        }
    }

    void m18292b(Collection<gqd> collection) {
        SpannableString spannableString = new SpannableString(this.f15894b.getText());
        int i = 0;
        for (gqd gqd : collection) {
            int a;
            if (gqd.m18297a(spannableString)) {
                gqd.m18299b(spannableString);
                a = gqd.m18296a() | i;
            } else {
                a = i;
            }
            i = a;
        }
        this.f15894b.setText(spannableString);
        if (i != 0) {
            this.f15894b.setMovementMethod(LinkMovementMethod.getInstance());
        }
    }
}
