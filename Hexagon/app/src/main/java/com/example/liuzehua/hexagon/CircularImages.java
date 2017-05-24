package com.example.liuzehua.hexagon;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by liuzehua on 2017/5/24.
 */

public class CircularImages extends View{

    public CircularImages(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public CircularImages(Context context) {
        super(context);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        int verticalCenter    =  getHeight() / 2;
        int horizontalCenter  =  getWidth() / 2;
        int circleRadius      = 200;
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(Color.BLUE);
        canvas.drawCircle( horizontalCenter, verticalCenter-250, circleRadius, paint);

        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(5);
        canvas.drawCircle( horizontalCenter, verticalCenter+250, circleRadius, paint);
    }

}
