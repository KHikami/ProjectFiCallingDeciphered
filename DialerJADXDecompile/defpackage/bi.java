package defpackage;

import android.animation.Animator;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;
import android.graphics.drawable.Drawable.ConstantState;
import java.util.ArrayList;

/* compiled from: PG */
/* renamed from: bi */
final class bi extends ConstantState {
    int a;
    bn b;
    ArrayList c;
    hv d;

    public bi(bi biVar, Callback callback, Resources resources) {
        int i = 0;
        if (biVar != null) {
            this.a = biVar.a;
            if (biVar.b != null) {
                ConstantState constantState = biVar.b.getConstantState();
                if (resources != null) {
                    this.b = (bn) constantState.newDrawable(resources);
                } else {
                    this.b = (bn) constantState.newDrawable();
                }
                this.b = (bn) this.b.mutate();
                this.b.setCallback(callback);
                this.b.setBounds(biVar.b.getBounds());
                this.b.c = false;
            }
            if (biVar.c != null) {
                int size = biVar.c.size();
                this.c = new ArrayList(size);
                this.d = new hv(size);
                while (i < size) {
                    Animator animator = (Animator) biVar.c.get(i);
                    Animator clone = animator.clone();
                    String str = (String) biVar.d.get(animator);
                    clone.setTarget(this.b.a(str));
                    this.c.add(clone);
                    this.d.put(clone, str);
                    i++;
                }
            }
        }
    }

    public final Drawable newDrawable() {
        throw new IllegalStateException("No constant state support for SDK < 23.");
    }

    public final Drawable newDrawable(Resources resources) {
        throw new IllegalStateException("No constant state support for SDK < 23.");
    }

    public final int getChangingConfigurations() {
        return this.a;
    }
}
