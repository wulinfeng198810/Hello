package com.example.leo.hello;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    private TextView robotGroupTitleTV;
    private RecyclerView amenityRecyclerView;

    private TextView robotGroupTitleTV2;
    private RecyclerView policiesRecyclerView;

    private TitleGridView amenityGridView;
    private TitleGridView policiesGridView;

    //    private amenityRecyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        amenityGridView = (TitleGridView) findViewById(R.id.id_grid_amenity);
        amenityGridView.setParams("Hotel Amenities",amenityData());

        policiesGridView = (TitleGridView) findViewById(R.id.id_grid_policy);
        policiesGridView.setParams("Hotel Policies",policiesData());
    }

    public List<Map<String,Object>> amenityData() {
        String[] hotelAmenityTitleList = new String[]{
                "Hotel Amenities",
                "Family Friendly Amenities",
                "Internet",
                "Parking",
                "Room Amenities",
                "Where to Eat",
                "Nearby Things to Do"
        };

        int[] hotelAmenityImageList = new int[]{
                R.drawable.ic_hotel,
                R.drawable.ic_hotel_swim,
                R.drawable.ic_network,
                R.drawable.ic_parking,
                R.drawable.ic_guest_room,
                R.drawable.ic_eat,
                R.drawable.ic_neaby_play
        };

        List<Map<String,Object>> models = new ArrayList<>();
        for (int i = 0; i < hotelAmenityTitleList.length; i++) {
            Map<String,Object> model = new HashMap<>();
            model.put("title",hotelAmenityTitleList[i]);
            model.put("image",hotelAmenityImageList[i]);
            models.add(model);
        }
        return models;
    }

    private List<Map<String,Object>> policiesData() {
        String[] hotelPoliciesTitleList = new String[]{
                "Check-in",
                "Check-out",
                "Payment types",
                "Children and extra beds",
                "Pets",
                "Fees",
                "Optional extras" };

        int[] hotelPoliciesImageList = new int[]{
                R.drawable.ic_check_in,
                R.drawable.ic_check_out,
                R.drawable.ic_pay_type,
                R.drawable.ic_children,
                R.drawable.ic_pets,
                R.drawable.ic_fee,
                R.drawable.ic_other_service
        };

        List<Map<String,Object>> models = new ArrayList<>();
        for (int i = 0; i < hotelPoliciesTitleList.length; i++) {
            Map<String,Object> model = new HashMap<>();
            model.put("title",hotelPoliciesTitleList[i]);
            model.put("image",hotelPoliciesImageList[i]);
            models.add(model);
        }
        return models;
    }
//
//    class RobotItemCollectionAdapter extends RecyclerView.Adapter<RobotItemCollectionAdapter.MyViewHolder> {
//
//        private RobotItemModel[] models;
//        public RobotItemCollectionAdapter(RobotItemModel[] models) {
//            this.models = models;
//        }
//
//        @Override
//        public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
//            MyViewHolder holder = new MyViewHolder(LayoutInflater.from(
//                    MainActivity.this).inflate(R.layout.robot_faq_menu_item, parent,
//                    false));
//            return holder;
//        }
//
//        @Override
//        public void onBindViewHolder(MyViewHolder holder, int position) {
//            holder.itemTitleTV.setText(models[position].title);
//            holder.itemImageView.setBackgroundResource(models[position].imageName);
//        }
//
//        @Override
//        public int getItemCount() {
//            return models.length;
//        }
//
//        class MyViewHolder extends RecyclerView.ViewHolder {
//            ImageView itemImageView;
//            TextView itemTitleTV;
//
//            public MyViewHolder(View view) {
//                super(view);
//                itemTitleTV = (TextView) view.findViewById(R.id.id_item_title);
//                itemImageView = view.findViewById(R.id.id_item_image);
//            }
//        }
//    }
//
//    class RobotItemModel {
//        String title;
//        int imageName;
//    }
}


