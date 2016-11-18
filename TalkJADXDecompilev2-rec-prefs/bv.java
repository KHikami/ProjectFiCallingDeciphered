package p000;

import android.animation.Animator;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;
import android.graphics.drawable.Drawable.ConstantState;
import java.util.ArrayList;

final class bv extends ConstantState {
    int f4550a;
    ca f4551b;
    ArrayList<Animator> f4552c;
    ky<Animator, String> f4553d;

    public bv(bv bvVar, Callback callback, Resources resources) {
        int i = 0;
        if (bvVar != null) {
            this.f4550a = bvVar.f4550a;
            if (bvVar.f4551b != null) {
                ConstantState constantState = bvVar.f4551b.getConstantState();
                if (resources != null) {
                    this.f4551b = (ca) constantState.newDrawable(resources);
                } else {
                    this.f4551b = (ca) constantState.newDrawable();
                }
                this.f4551b = (ca) this.f4551b.mutate();
                this.f4551b.setCallback(callback);
                this.f4551b.setBounds(bvVar.f4551b.getBounds());
                this.f4551b.m7069a(false);
            }
            if (bvVar.f4552c != null) {
                int size = bvVar.f4552c.size();
                this.f4552c = new ArrayList(size);
                this.f4553d = new ky(size);
                while (i < size) {
                    Animator animator = (Animator) bvVar.f4552c.get(i);
                    Animator clone = animator.clone();
                    String str = (String) bvVar.f4553d.get(animator);
                    clone.setTarget(this.f4551b.m7068a(str));
                    this.f4552c.add(clone);
                    this.f4553d.put(clone, str);
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
        return this.f4550a;
    }
}
