package com.google.android.libraries.componentview.internal;

import android.graphics.Canvas;
import android.view.View;
import android.view.View.OnLayoutChangeListener;
import android.widget.FrameLayout;
import com.google.android.libraries.componentview.api.ComponentView;
import com.google.android.libraries.componentview.api.canvas.CanvasEmbeddableComponent;
import com.google.android.libraries.componentview.api.external.ComponentViewErrorCode.Error;
import com.google.android.libraries.componentview.api.external.Readyable.ReadyInfo;
import com.google.android.libraries.componentview.components.base.api.nano.BaselineTextViewProto.BaselineTextViewArgs;
import com.google.android.libraries.componentview.components.base.api.nano.LayoutParamsProto.LayoutParamsArgs;
import com.google.android.libraries.componentview.components.base.api.nano.LinearLayoutProto.LinearLayoutArgs;
import com.google.android.libraries.componentview.components.base.api.nano.SpanProto.SpanArgs;
import com.google.android.libraries.componentview.components.elements.api.nano.CardProto.CardArgs;
import com.google.android.libraries.componentview.inject.annotations.ExecutorType.BACKGROUND;
import com.google.android.libraries.componentview.services.application.Logger;
import com.google.android.libraries.componentview.services.internal.ComponentInflator;
import com.google.android.libraries.componentview.services.internal.DeferredImageHelper;
import java.util.concurrent.ExecutorService;
import msy;
import mti;
import mtt;
import ofd;

public class ComponentViewImpl implements ComponentView {
    final ComponentInflator a;
    final Logger b;
    private final DeferredImageHelper c;
    private final ExecutorService d;

    class 1 implements Runnable {
        final /* synthetic */ ComponentViewImpl a;

        public void run() {
            ofd ofd = new ofd();
            ofd.a("android-card");
            CardArgs cardArgs = new CardArgs();
            ofd.a(CardArgs.a, cardArgs);
            ofd ofd2 = new ofd();
            ofd2.a("android-linear-layout");
            cardArgs.b = new ofd[1];
            cardArgs.b[0] = ofd2;
            LinearLayoutArgs linearLayoutArgs = new LinearLayoutArgs();
            ofd2.a(LinearLayoutArgs.a, linearLayoutArgs);
            ofd2 = new ofd();
            ofd2.a("android-layout-params");
            linearLayoutArgs.b = new ofd[1];
            linearLayoutArgs.b[0] = ofd2;
            LayoutParamsArgs layoutParamsArgs = new LayoutParamsArgs();
            ofd2.a(LayoutParamsArgs.a, layoutParamsArgs);
            ofd2 = new ofd();
            ofd2.a("android-baseline-text-view");
            layoutParamsArgs.b = ofd2;
            BaselineTextViewArgs baselineTextViewArgs = new BaselineTextViewArgs();
            ofd2.a(BaselineTextViewArgs.a, baselineTextViewArgs);
            ofd2 = new ofd();
            ofd2.a("android-span");
            baselineTextViewArgs.d = new ofd[1];
            baselineTextViewArgs.d[0] = ofd2;
            SpanArgs spanArgs = new SpanArgs();
            spanArgs.a("hello");
            ofd2.a(SpanArgs.a, spanArgs);
            try {
                this.a.a.a(ofd);
            } catch (Exception e) {
            }
        }
    }

    class CanvasEmbeddableComponentWrapper implements CanvasEmbeddableComponent {
        final CanvasEmbeddableComponent a;
        final mtt<ReadyInfo> b;

        class 1 implements OnLayoutChangeListener {
            final /* synthetic */ View a;
            final /* synthetic */ CanvasEmbeddableComponentWrapper b;

            public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                this.a.removeOnLayoutChangeListener(this);
                mti a = this.b.a.a();
                mtt mtt = this.b.b;
                if (a == null) {
                    a = msy.b(new IllegalStateException("Null ready future at root component."));
                }
                mtt.a(a);
            }
        }

        public mti<ReadyInfo> a() {
            return this.b;
        }
    }

    class ExceptionCatchingWrapperView extends FrameLayout {
        final /* synthetic */ ComponentViewImpl a;

        public void draw(Canvas canvas) {
            try {
                super.draw(canvas);
            } catch (Throwable e) {
                L.a("ComponentView", e, "Failed to draw view.", Error.ON_DRAW_EXCEPTION, this.a.b, null, new Object[0]);
            }
        }

        protected void dispatchDraw(Canvas canvas) {
            try {
                super.dispatchDraw(canvas);
            } catch (Throwable e) {
                L.a("ComponentView", e, "Failed to dispatch to draw view.", Error.ON_DRAW_EXCEPTION, this.a.b, null, new Object[0]);
            }
        }

        protected void onMeasure(int i, int i2) {
            try {
                super.onMeasure(i, i2);
            } catch (Throwable e) {
                setMeasuredDimension(0, 0);
                L.a("ComponentView", e, "Failed to measure view.", Error.ON_MEASURE_EXCEPTION, this.a.b, null, new Object[0]);
            }
        }

        protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
            try {
                super.onLayout(z, i, i2, i3, i4);
            } catch (Throwable e) {
                L.a("ComponentView", e, "Failed to layout view.", Error.ON_LAYOUT_EXCEPTION, this.a.b, null, new Object[0]);
            }
        }

        public CharSequence getContentDescription() {
            if (getChildCount() > 0) {
                return getChildAt(0).getContentDescription();
            }
            return "";
        }
    }

    public ComponentViewImpl(ComponentInflator componentInflator, Logger logger, DeferredImageHelper deferredImageHelper, @BACKGROUND ExecutorService executorService) {
        this.b = logger;
        this.a = componentInflator;
        this.c = deferredImageHelper;
        this.d = executorService;
    }
}
