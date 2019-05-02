package com.iteyes.placesproject;

import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import java.util.Arrays;
import java.util.List;

public class DotIndicatorPagerAdapter extends PagerAdapter {
    private static final List<Item> items =
            Arrays.asList(new Item(R.drawable.nishat_1), new Item(R.drawable.nishat_2), new Item(R.drawable.nishat_3), new Item(R.drawable.nishat_4),
                    new Item(R.drawable.nishat_5));

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        View item = LayoutInflater.from(container.getContext()).inflate(R.layout.material_page_2, container, false);
        //CardView cardView = item.findViewById(R.id.card_view);
        //cardView.setCardBackgroundColor(
        //    ContextCompat.getColor(container.getContext(), (items.get(position).drawable)));
        ImageView imageView = item.findViewById(R.id.item_image);
        Picasso.with(container.getContext()).load(items.get(position).drawable).into(imageView);
        container.addView(item);
        return item;
    }

    @Override
    public int getCount() {
        return items.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == object;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((View) object);
    }

    private static class Item {
        private final int drawable;

        private Item(int drawable) {
            this.drawable = drawable;
        }
    }
}
