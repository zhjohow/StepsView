package com.zhjh.stepviewdemo;

import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;

import com.zhjh.stepviewdemo.fragment.DrawCanvasFragment;
import com.zhjh.stepviewdemo.fragment.HorizontalStepviewFragment;
import com.zhjh.stepviewdemo.fragment.VerticalStepViewReverseFragment;
import com.zhjh.stepviewdemo.fragment.VerticalStepViewFrowardFragment;

/**
 * 日期：16/6/22 16:01
 * <p/>
 * 描述：
 */
public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(com.zhjh.stepview.demo.R.layout.activity_main);

        VerticalStepViewReverseFragment mVerticalStepViewFragment = new VerticalStepViewReverseFragment();
        getFragmentManager().beginTransaction().replace(com.zhjh.stepview.demo.R.id.container, mVerticalStepViewFragment).commit();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(com.zhjh.stepview.demo.R.menu.menu_main_activity, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        VerticalStepViewReverseFragment mVerticalStepViewFragment;
        DrawCanvasFragment mDrawCanvasFragment;
        HorizontalStepviewFragment mHorizontalStepviewFragment;
        VerticalStepViewFrowardFragment mVerticalStepViewReverseFragment;
        FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
        int itemId = item.getItemId();
        switch(itemId)
        {
            case com.zhjh.stepview.demo.R.id.action_horizontal_stepview:
                mHorizontalStepviewFragment = new HorizontalStepviewFragment();
                fragmentTransaction.replace(com.zhjh.stepview.demo.R.id.container, mHorizontalStepviewFragment).commit();
                break;

            case com.zhjh.stepview.demo.R.id.action_drawcanvas:
                mDrawCanvasFragment = new DrawCanvasFragment();
                fragmentTransaction.replace(com.zhjh.stepview.demo.R.id.container, mDrawCanvasFragment).commit();
                break;
            case com.zhjh.stepview.demo.R.id.action_vertical_reverse:
                mVerticalStepViewFragment = new VerticalStepViewReverseFragment();
                fragmentTransaction.replace(com.zhjh.stepview.demo.R.id.container, mVerticalStepViewFragment).commit();
                break;

            case com.zhjh.stepview.demo.R.id.action_vertical_forward:
                mVerticalStepViewReverseFragment = new VerticalStepViewFrowardFragment();
                fragmentTransaction.replace(com.zhjh.stepview.demo.R.id.container, mVerticalStepViewReverseFragment).commit();
                break;

            case com.zhjh.stepview.demo.R.id.action_test_horizontal_stepview:
                startActivity(new Intent(this,TestHorizontalStepViewActivity.class));
                break;


        }
        return super.onOptionsItemSelected(item);
    }
}