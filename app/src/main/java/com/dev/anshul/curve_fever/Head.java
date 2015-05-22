package com.dev.anshul.curve_fever;

/**
 * Created by anshul on 12/5/15.
 */
import android.graphics.Color;
import android.graphics.Paint;

import java.util.Random;



public class Head {

    protected double headX;
    protected double headY;
    protected int headVelocity;

    protected Paint headPaint = new Paint();
    protected Paint pathPaint = new Paint();

    protected final int headRadius = 20;

    public Head()
    {
        Random random = new Random();

//        this.headY = random.nextInt(200);
//        this.headX = random.nextInt(200);

        this.headX=200;
        this.headY=200;
        this.headVelocity = 10;

        headPaint.setColor(Color.parseColor("#013ADF"));
        pathPaint.setStrokeWidth(7);
        pathPaint.setStyle(Paint.Style.STROKE);
        pathPaint.setColor(Color.GREEN);
    }

    public void followFinger(int fingerX, int fingerY)
    {
        headX -= ((double)headX - (double)fingerX) * (double)headVelocity / 100.0;
        headY -= ((double)headY - (double)fingerY) * (double)headVelocity / 100.0;
    }
}