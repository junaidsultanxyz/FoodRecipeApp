package com.junaid.foodrecipeapp.style;

import static androidx.core.util.TypedValueCompat.dpToPx;

import android.content.Context;
import android.graphics.Typeface;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.LinearLayout.LayoutParams;

import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.content.res.ResourcesCompat;

import com.junaid.foodrecipeapp.R;

public class InsertTag {
    public static View InsertTag(Context context, View convertView, String key) {

        TextView tagTextView = new TextView(context);

        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
        );
        params.setMarginEnd((int) dpToPx(3, context.getResources().getDisplayMetrics())); // Margin end = 3dp
        tagTextView.setLayoutParams(params);

        tagTextView.setText(key);
        tagTextView.setTextSize(10); // in sp

        Typeface typeface = ResourcesCompat.getFont(context, R.font.ubuntu);
        tagTextView.setTypeface(typeface);
        tagTextView.setTextColor(context.getResources().getColor(R.color.black));

        int paddingVertical = (int) dpToPx(5, context.getResources().getDisplayMetrics());
        int paddingHorizontal = (int) dpToPx(10, context.getResources().getDisplayMetrics());
        tagTextView.setPadding(paddingHorizontal, paddingVertical, paddingHorizontal, paddingVertical);

        tagTextView.setBackgroundResource(R.drawable.tag_background);

        return tagTextView;
    }

//     <TextView
//    android:id="@+id/list_item_tag"
//    android:layout_width="wrap_content"
//    android:layout_height="wrap_content"
//    android:textSize="10sp" -----
//    android:fontFamily="@font/ubuntu"
//    android:paddingVertical="5dp"
//    android:paddingHorizontal="10dp"
//    android:layout_marginEnd="3dp"
//    android:text="easy"
//    android:background="@drawable/tag_background"/>
}
