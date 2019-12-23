package com.example.fahad.timetably;

import android.content.Context;
import android.provider.ContactsContract;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class SliderAdapter extends PagerAdapter {
    Context context ;
    LayoutInflater layoutInflater;


    public SliderAdapter(Context context){
        this.context = context;
    }
    public int[] slide_images = {
            R.drawable.gcekjrpng,
            R.drawable.study,
            R.drawable.timetable
    };
    public String[] slide_headings = {
            "GCE KEONJHAR",
            "STUDY",
            "TIMETABLE"
    };
    public String[] slide_desc ={
            "The Government College of Engineering, Keonjhar is a state run higher education institute located in Keonjhar, Odisha, India, focusing on education and research in the field of Mining Engineering",
            "the_government_college_of_engineering_keonjhar_is_a_state_run_higher_education_institute_located_in_keonjhar_odisha_india_focusing_on_education_and_research_in_the_field_of_mining_engineering",
            "the_government_college_of_engineering_keonjhar_is_a_state_run_higher_education_institute_located_in_keonjhar_odisha_india_focusing_on_education_and_research_in_the_field_of_mining_engineering",
    };



    @Override
    public int getCount() {

        return slide_headings.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object o) {
        return view == (RelativeLayout) o;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {

         layoutInflater=(LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
         View view = layoutInflater.inflate(R.layout.slide_layout,container,false);

         ImageView slideImageView = (ImageView) view.findViewById(R.id.imageView);
         TextView slideHeadings = (TextView) view.findViewById(R.id.headings);
         TextView slideDescription = (TextView) view.findViewById(R.id.desc);

        slideImageView.setImageResource(slide_images[position]);
        slideHeadings.setText(slide_headings[position]);
        slideDescription.setText(slide_desc[position]);

        container.addView(view);

        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((RelativeLayout)object);
    }
}
