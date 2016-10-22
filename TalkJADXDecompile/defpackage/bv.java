package defpackage;

import android.animation.Animator;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;
import android.graphics.drawable.Drawable.ConstantState;
import java.util.ArrayList;

/* renamed from: bv */
final class bv extends ConstantState {
    int a;
    ca b;
    ArrayList<Animator> c;
    ky<Animator, String> d;

    public bv(bv bvVar, Callback callback, Resources resources) {
        int i = 0;
        if (bvVar != null) {
            this.a = bvVar.a;
            if (bvVar.b != null) {
                ConstantState constantState = bvVar.b.getConstantState();
                if (resources != null) {
                    this.b = (ca) constantState.newDrawable(resources);
                } else {
                    this.b = (ca) constantState.newDrawable();
                }
                this.b = (ca) this.b.mutate();
                this.b.setCallback(callback);
                this.b.setBounds(bvVar.b.getBounds());
                this.b.a(false);
            }
            if (bvVar.c != null) {
                int size = bvVar.c.size();
                this.c = new ArrayList(size);
                this.d = new ky(size);
                while (i < size) {
                    Animator animator = (Animator) bvVar.c.get(i);
                    Animator clone = animator.clone();
                    String str = (String) bvVar.d.get(animator);
                    clone.setTarget(this.b.a(str));
                    this.c.add(clone);
                    this.d.put(clone, str);
                    i++;
                }
            }
        }
    }

    public Drawable newDrawable() {
        throw new IllegalStateException("No constant state support for SDK < 23.");
    }

    public Drawable newDrawable(Resources resources) {
        throw new IllegalStateException("No constant state support for SDK < 23.");
    }

    public int getChangingConfigurations() {
        return this.a;
    }
}
