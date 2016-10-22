import android.content.res.Resources;
import android.graphics.drawable.Drawable;

public class jm extends jj {
    public jm(Drawable drawable) {
        super(drawable);
    }

    jm(jk jkVar, Resources resources) {
        super(jkVar, resources);
    }

    public void jumpToCurrentState() {
        this.c.jumpToCurrentState();
    }

    jk b() {
        return new jn(this.b, null);
    }
}
