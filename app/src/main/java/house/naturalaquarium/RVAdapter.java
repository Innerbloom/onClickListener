package house.naturalaquarium;

import android.content.Intent;
import android.support.design.widget.Snackbar;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

import house.naturalaquarium.fragmentsFish.AquaFish;
import house.naturalaquarium.fragmentsFish.FishDisease;

import static android.content.ContentValues.TAG;
import static android.media.CamcorderProfile.get;
import static house.naturalaquarium.R.id.fish_name;
import static house.naturalaquarium.R.id.name;

public class RVAdapter extends RecyclerView.Adapter<RVAdapter.PersonViewHolder> {



    public static class PersonViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        CardView cv;
        TextView fishName;
        TextView fishAbout;
        ImageView fishPhoto;

        ItemClickListener itemClickListener;



        PersonViewHolder(View itemView) {
            super(itemView);
            cv = (CardView)itemView.findViewById(R.id.cv);
            fishName = (TextView)itemView.findViewById(R.id.fish_name);
            fishAbout = (TextView)itemView.findViewById(R.id.fish_about);
            fishPhoto = (ImageView)itemView.findViewById(R.id.fish_photo);

            itemView.setOnClickListener(this);


        }

        @Override
        public void onClick(View v) {
            this.itemClickListener.OnClick(v, getLayoutPosition());
            }

            public void SetItemClickListener (ItemClickListener ic){
                this.itemClickListener = ic;
            }
        }


    List<FishName> fishNames;

    public RVAdapter(List<FishName> fishNames){
        this.fishNames = fishNames;
    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }

    @Override
    public PersonViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item, viewGroup, false);
        PersonViewHolder personViewHolder = new PersonViewHolder(view);
        return personViewHolder;
    }

    @Override
    public void onBindViewHolder(final PersonViewHolder personViewHolder, int i) {
        personViewHolder.fishName.setText(fishNames.get(i).name);
        personViewHolder.fishAbout.setText(fishNames.get(i).about);
        personViewHolder.fishPhoto.setImageResource(fishNames.get(i).photoId);


        personViewHolder.itemClickListener = (new ItemClickListener() {
            @Override
            public void OnClick(View v, int pos) {
                //Как сюда вставить переход на фрагмент ????
            }
        });


    }

    @Override
    public int getItemCount() {
        return fishNames.size();
    }
}
