package house.naturalaquarium;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

import static android.R.id.list;
import static android.R.id.paste;

public class RVAdapter extends RecyclerView.Adapter<RVAdapter.PersonViewHolder> {
    static class PersonViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView fishName, fishAbout;
        ImageView fishPhoto;
        ItemClickListener itemClickListener;

        PersonViewHolder(View itemView) {
            super(itemView);
            fishName = (TextView) itemView.findViewById(R.id.person_name);
            fishAbout = (TextView) itemView.findViewById(R.id.fish_about);
            fishPhoto = (ImageView) itemView.findViewById(R.id.person_photo);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            this.itemClickListener.OnClick(v, getLayoutPosition());
        }
    }

    Context context;
    List<FishName> fishNames;

    public RVAdapter(List<FishName> fishNames) {
        this.fishNames = fishNames;
    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }

    @Override
    public PersonViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        context = viewGroup.getContext();
        return new PersonViewHolder(LayoutInflater.from(viewGroup.getContext()).
                inflate(R.layout.item, viewGroup, false));
    }

    @Override
    public void onBindViewHolder(final PersonViewHolder personViewHolder, int i) {
        personViewHolder.fishName.setText(fishNames.get(i).name);
        personViewHolder.fishAbout.setText(fishNames.get(i).about);
        personViewHolder.fishPhoto.setImageResource(fishNames.get(i).photoId);

        personViewHolder.itemClickListener = (new ItemClickListener() {
            @Override
            public void OnClick(View v, int pos) {
                Toast.makeText(context, "itemId = " + pos, Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return fishNames.size();
    }
}
