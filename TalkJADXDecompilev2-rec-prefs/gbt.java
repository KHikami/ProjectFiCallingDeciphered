package p000;

import android.graphics.Canvas;
import android.graphics.Picture;
import android.graphics.drawable.PictureDrawable;

public final class gbt extends PictureDrawable {
    private final float f14624a;

    public gbt(Picture picture, float f) {
        super(picture);
        this.f14624a = f;
    }

    public int getIntrinsicHeight() {
        return (int) (((float) super.getIntrinsicHeight()) * this.f14624a);
    }

    public int getIntrinsicWidth() {
        return (int) (((float) super.getIntrinsicWidth()) * this.f14624a);
    }

    public void draw(Canvas canvas) {
        canvas.save();
        canvas.scale(this.f14624a, this.f14624a);
        canvas.drawPicture(getPicture());
        canvas.restore();
    }
}
