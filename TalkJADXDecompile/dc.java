import android.app.ActivityOptions;
import android.os.Bundle;

final class dc {
    private final ActivityOptions a;

    dc(ActivityOptions activityOptions) {
        this.a = activityOptions;
    }

    public Bundle a() {
        return this.a.toBundle();
    }
}
