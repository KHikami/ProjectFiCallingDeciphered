import android.graphics.Canvas;
import android.graphics.Picture;
import android.graphics.drawable.PictureDrawable;

public final class gbt extends PictureDrawable {
    private final float a;

    public gbt(Picture picture, float f) {
        super(picture);
        this.a = f;
    }

    public int getIntrinsicHeight() {
        return (int) (((float) super.getIntrinsicHeight()) * this.a);
    }

    public int getIntrinsicWidth() {
        return (int) (((float) super.getIntrinsicWidth()) * this.a);
    }

    public void draw(Canvas canvas) {
        canvas.save();
        canvas.scale(this.a, this.a);
        canvas.drawPicture(getPicture());
        canvas.restore();
    }
}
