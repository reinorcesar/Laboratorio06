/***
* @author Reinor César
*/
package com.example.lab06;

import android.content.res.TypedArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Gallery;
import android.widget.ImageView;

public class AdaptadorImagens<Context> extends BaseAdapter {
	
	int itensMinhaGaleria;
	android.content.Context contexto;
	
	private Integer[] minhasIdsImagens = {
			R.drawable.ic_launcher,
			R.drawable.ic_launcher
	};
	public AdaptadorImagens(android.content.Context contextoParam){
		contexto = contextoParam;
		TypedArray atributos= contexto.obtainStyledAttributes(R.styleable.minhaGaleria);
		itensMinhaGaleria = atributos.getResourceId(
				R.styleable.minhaGaleria_android_galleryItemBackground,0);
		atributos.recycle();
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return minhasIdsImagens.length;
	}

	@Override
	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return position;
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return position;
	}
	

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		ImageView imageView = new ImageView(contexto);
		imageView.setImageResource(minhasIdsImagens[position]);
		imageView.setLayoutParams(new Gallery.LayoutParams(150, 100));
		imageView.setScaleType(ImageView.ScaleType.FIT_XY);
		imageView.setBackgroundResource(itensMinhaGaleria);
		return imageView;
	}

}
